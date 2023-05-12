package typings.ipfsBitswap

import typings.ipfsBitswap.distSrcDecisionEngineMod.Task
import typings.ipfsBitswap.distSrcDecisionEngineMod.TaskMerger
import typings.ipfsBitswap.distSrcUtilsSortedMapMod.SortedMap
import typings.libp2pInterfacePeerId.mod.PeerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDecisionEngineReqQueueMod {
  
  @JSImport("ipfs-bitswap/dist/src/decision-engine/req-queue", "RequestQueue")
  @js.native
  open class RequestQueue () extends StObject {
    def this(taskMerger: TaskMerger) = this()
    
    var _byPeer: SortedMap[String, PeerTasks] = js.native
    
    def _head(): js.UndefOr[PeerTasks] = js.native
    
    /* private */ val _taskMerger: Any = js.native
    
    /**
      * Choose the peer with the least active work (or if all have the same active
      * work, the most pending tasks) and pop off the highest priority tasks until
      * the total size is at least targetMinBytes.
      * This puts the popped tasks into the "active" state, meaning they are
      * actively being processed (and cannot be modified).
      */
    def popTasks(targetMinBytes: Double): PopTaskResult = js.native
    
    /**
      * Push tasks onto the queue for the given peer
      */
    def pushTasks(peerId: PeerId, tasks: js.Array[Task]): Unit = js.native
    
    /**
      * Remove the task with the given topic for the given peer.
      */
    def remove(topic: String, peerId: PeerId): Unit = js.native
    
    /**
      * Called when the tasks for the given peer complete.
      */
    def tasksDone(peerId: PeerId, tasks: js.Array[Task]): Unit = js.native
  }
  
  /**
    * Queue of tasks for a particular peer, sorted by priority.
    */
  trait PeerTasks extends StObject {
    
    /* private */ val _active: Any
    
    /* private */ var _activeTotalSize: Any
    
    /* private */ val _pending: Any
    
    def _pushTask(task: Task): Unit
    
    /**
      * Indicates whether the new task adds any more information over tasks that are
      * already in the active task queue
      */
    def _taskHasMoreInfoThanActiveTasks(task: Task): Boolean
    
    /* private */ val _taskMerger: Any
    
    /**
      * No work to be done, this PeerTasks object can be freed.
      */
    def isIdle(): Boolean
    
    var peerId: PeerId
    
    /**
      * Pop tasks off the queue such that the total size is at least targetMinBytes
      */
    def popTasks(targetMinBytes: Double): PopTaskResult
    
    /**
      * Push tasks onto the queue
      */
    def pushTasks(tasks: js.Array[Task]): Unit
    
    /**
      * Remove pending tasks with the given topic
      */
    def remove(topic: String): Unit
    
    /**
      * Called when a task completes.
      * Note: must be the same reference as returned from popTasks.
      */
    def taskDone(task: Task): Unit
  }
  object PeerTasks {
    
    inline def apply(
      _active: Any,
      _activeTotalSize: Any,
      _pending: Any,
      _pushTask: Task => Unit,
      _taskHasMoreInfoThanActiveTasks: Task => Boolean,
      _taskMerger: Any,
      isIdle: () => Boolean,
      peerId: PeerId,
      popTasks: Double => PopTaskResult,
      pushTasks: js.Array[Task] => Unit,
      remove: String => Unit,
      taskDone: Task => Unit
    ): PeerTasks = {
      val __obj = js.Dynamic.literal(_active = _active.asInstanceOf[js.Any], _activeTotalSize = _activeTotalSize.asInstanceOf[js.Any], _pending = _pending.asInstanceOf[js.Any], _pushTask = js.Any.fromFunction1(_pushTask), _taskHasMoreInfoThanActiveTasks = js.Any.fromFunction1(_taskHasMoreInfoThanActiveTasks), _taskMerger = _taskMerger.asInstanceOf[js.Any], isIdle = js.Any.fromFunction0(isIdle), peerId = peerId.asInstanceOf[js.Any], popTasks = js.Any.fromFunction1(popTasks), pushTasks = js.Any.fromFunction1(pushTasks), remove = js.Any.fromFunction1(remove), taskDone = js.Any.fromFunction1(taskDone))
      __obj.asInstanceOf[PeerTasks]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PeerTasks] (val x: Self) extends AnyVal {
      
      inline def setIsIdle(value: () => Boolean): Self = StObject.set(x, "isIdle", js.Any.fromFunction0(value))
      
      inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
      
      inline def setPopTasks(value: Double => PopTaskResult): Self = StObject.set(x, "popTasks", js.Any.fromFunction1(value))
      
      inline def setPushTasks(value: js.Array[Task] => Unit): Self = StObject.set(x, "pushTasks", js.Any.fromFunction1(value))
      
      inline def setRemove(value: String => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      inline def setTaskDone(value: Task => Unit): Self = StObject.set(x, "taskDone", js.Any.fromFunction1(value))
      
      inline def set_active(value: Any): Self = StObject.set(x, "_active", value.asInstanceOf[js.Any])
      
      inline def set_activeTotalSize(value: Any): Self = StObject.set(x, "_activeTotalSize", value.asInstanceOf[js.Any])
      
      inline def set_pending(value: Any): Self = StObject.set(x, "_pending", value.asInstanceOf[js.Any])
      
      inline def set_pushTask(value: Task => Unit): Self = StObject.set(x, "_pushTask", js.Any.fromFunction1(value))
      
      inline def set_taskHasMoreInfoThanActiveTasks(value: Task => Boolean): Self = StObject.set(x, "_taskHasMoreInfoThanActiveTasks", js.Any.fromFunction1(value))
      
      inline def set_taskMerger(value: Any): Self = StObject.set(x, "_taskMerger", value.asInstanceOf[js.Any])
    }
  }
  
  trait PendingTask extends StObject {
    
    var created: Double
    
    var task: Task
  }
  object PendingTask {
    
    inline def apply(created: Double, task: Task): PendingTask = {
      val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any])
      __obj.asInstanceOf[PendingTask]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PendingTask] (val x: Self) extends AnyVal {
      
      inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setTask(value: Task): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    }
  }
  
  trait PopTaskResult extends StObject {
    
    var peerId: js.UndefOr[PeerId] = js.undefined
    
    var pendingSize: Double
    
    var tasks: js.Array[Task]
  }
  object PopTaskResult {
    
    inline def apply(pendingSize: Double, tasks: js.Array[Task]): PopTaskResult = {
      val __obj = js.Dynamic.literal(pendingSize = pendingSize.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopTaskResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PopTaskResult] (val x: Self) extends AnyVal {
      
      inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
      
      inline def setPeerIdUndefined: Self = StObject.set(x, "peerId", js.undefined)
      
      inline def setPendingSize(value: Double): Self = StObject.set(x, "pendingSize", value.asInstanceOf[js.Any])
      
      inline def setTasks(value: js.Array[Task]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
      
      inline def setTasksVarargs(value: Task*): Self = StObject.set(x, "tasks", js.Array(value*))
    }
  }
}
