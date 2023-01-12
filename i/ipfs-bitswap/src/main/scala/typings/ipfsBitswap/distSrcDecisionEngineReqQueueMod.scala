package typings.ipfsBitswap

import typings.ipfsBitswap.distSrcUtilsSortedMapMod.SortedMap
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDecisionEngineReqQueueMod {
  
  @JSImport("ipfs-bitswap/dist/src/decision-engine/req-queue", "RequestQueue")
  @js.native
  /**
    * @param {TaskMerger} [taskMerger]
    */
  open class RequestQueue () extends StObject {
    def this(taskMerger: typings.ipfsBitswap.distSrcDecisionEngineTypesMod.TaskMerger) = this()
    
    /** @type {SortedMap<string, PeerTasks>} */
    var _byPeer: SortedMap[String, PeerTasks] = js.native
    
    /**
      * @private
      * @returns {PeerTasks|undefined}
      */
    /* private */ var _head: Any = js.native
    
    var _taskMerger: typings.ipfsBitswap.distSrcDecisionEngineTypesMod.TaskMerger = js.native
    
    /**
      * Choose the peer with the least active work (or if all have the same active
      * work, the most pending tasks) and pop off the highest priority tasks until
      * the total size is at least targetMinBytes.
      * This puts the popped tasks into the "active" state, meaning they are
      * actively being processed (and cannot be modified).
      *
      * @param {number} targetMinBytes - the minimum total size of tasks to pop
      * @returns {PopTaskResult}
      */
    def popTasks(targetMinBytes: Double): PopTaskResult = js.native
    
    /**
      * Push tasks onto the queue for the given peer
      *
      * @param {PeerId} peerId
      * @param {Task[]} tasks
      * @returns {void}
      */
    def pushTasks(peerId: PeerId, tasks: js.Array[Task]): Unit = js.native
    
    /**
      * Remove the task with the given topic for the given peer.
      *
      * @param {string} topic
      * @param {PeerId} peerId
      * @returns {void}
      */
    def remove(topic: String, peerId: PeerId): Unit = js.native
    
    /**
      * Called when the tasks for the given peer complete.
      *
      * @param {PeerId} peerId
      * @param {Task[]} tasks
      * @returns {void}
      */
    def tasksDone(peerId: PeerId, tasks: js.Array[Task]): Unit = js.native
  }
  
  type PeerId = typings.libp2pInterfacePeerId.mod.PeerId
  
  /**
    * Queue of tasks for a particular peer, sorted by priority.
    */
  trait PeerTasks extends StObject {
    
    var _active: Set[Any]
    
    var _activeTotalSize: Double
    
    var _pending: PendingTasks
    
    /**
      * @private
      * @param {Task} task
      * @returns {void}
      */
    /* private */ var _pushTask: Any
    
    /**
      * Indicates whether the new task adds any more information over tasks that are
      * already in the active task queue
      *
      * @private
      * @param {Task} task
      * @returns {boolean}
      */
    /* private */ var _taskHasMoreInfoThanActiveTasks: Any
    
    var _taskMerger: typings.ipfsBitswap.distSrcDecisionEngineTypesMod.TaskMerger
    
    /**
      * No work to be done, this PeerTasks object can be freed.
      *
      * @returns {boolean}
      */
    def isIdle(): Boolean
    
    var peerId: typings.libp2pInterfacePeerId.mod.PeerId
    
    /**
      * Pop tasks off the queue such that the total size is at least targetMinBytes
      *
      * @param {number} targetMinBytes
      * @returns {PopTaskResult}
      */
    def popTasks(targetMinBytes: Double): PopTaskResult
    
    /**
      * Push tasks onto the queue.
      *
      * @param {Task[]} tasks
      * @returns {void}
      */
    def pushTasks(tasks: js.Array[Task]): Unit
    
    /**
      * Remove pending tasks with the given topic
      *
      * @param {string} topic
      * @returns {void}
      */
    def remove(topic: String): Unit
    
    /**
      * Called when a task completes.
      * Note: must be the same reference as returned from popTasks.
      *
      * @param {Task} task
      * @returns {void}
      */
    def taskDone(task: Task): Unit
  }
  object PeerTasks {
    
    inline def apply(
      _active: Set[Any],
      _activeTotalSize: Double,
      _pending: PendingTasks,
      _pushTask: Any,
      _taskHasMoreInfoThanActiveTasks: Any,
      _taskMerger: typings.ipfsBitswap.distSrcDecisionEngineTypesMod.TaskMerger,
      isIdle: () => Boolean,
      peerId: typings.libp2pInterfacePeerId.mod.PeerId,
      popTasks: Double => PopTaskResult,
      pushTasks: js.Array[Task] => Unit,
      remove: String => Unit,
      taskDone: Task => Unit
    ): PeerTasks = {
      val __obj = js.Dynamic.literal(_active = _active.asInstanceOf[js.Any], _activeTotalSize = _activeTotalSize.asInstanceOf[js.Any], _pending = _pending.asInstanceOf[js.Any], _pushTask = _pushTask.asInstanceOf[js.Any], _taskHasMoreInfoThanActiveTasks = _taskHasMoreInfoThanActiveTasks.asInstanceOf[js.Any], _taskMerger = _taskMerger.asInstanceOf[js.Any], isIdle = js.Any.fromFunction0(isIdle), peerId = peerId.asInstanceOf[js.Any], popTasks = js.Any.fromFunction1(popTasks), pushTasks = js.Any.fromFunction1(pushTasks), remove = js.Any.fromFunction1(remove), taskDone = js.Any.fromFunction1(taskDone))
      __obj.asInstanceOf[PeerTasks]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PeerTasks] (val x: Self) extends AnyVal {
      
      inline def setIsIdle(value: () => Boolean): Self = StObject.set(x, "isIdle", js.Any.fromFunction0(value))
      
      inline def setPeerId(value: typings.libp2pInterfacePeerId.mod.PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
      
      inline def setPopTasks(value: Double => PopTaskResult): Self = StObject.set(x, "popTasks", js.Any.fromFunction1(value))
      
      inline def setPushTasks(value: js.Array[Task] => Unit): Self = StObject.set(x, "pushTasks", js.Any.fromFunction1(value))
      
      inline def setRemove(value: String => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      inline def setTaskDone(value: Task => Unit): Self = StObject.set(x, "taskDone", js.Any.fromFunction1(value))
      
      inline def set_active(value: Set[Any]): Self = StObject.set(x, "_active", value.asInstanceOf[js.Any])
      
      inline def set_activeTotalSize(value: Double): Self = StObject.set(x, "_activeTotalSize", value.asInstanceOf[js.Any])
      
      inline def set_pending(value: PendingTasks): Self = StObject.set(x, "_pending", value.asInstanceOf[js.Any])
      
      inline def set_pushTask(value: Any): Self = StObject.set(x, "_pushTask", value.asInstanceOf[js.Any])
      
      inline def set_taskHasMoreInfoThanActiveTasks(value: Any): Self = StObject.set(x, "_taskHasMoreInfoThanActiveTasks", value.asInstanceOf[js.Any])
      
      inline def set_taskMerger(value: typings.ipfsBitswap.distSrcDecisionEngineTypesMod.TaskMerger): Self = StObject.set(x, "_taskMerger", value.asInstanceOf[js.Any])
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
  
  /**
    * Queue of pending tasks for a particular peer, sorted by priority.
    */
  @js.native
  trait PendingTasks extends StObject {
    
    /**
      * Sort by priority desc then FIFO
      *
      * @param {[string, PendingTask]} a
      * @param {[string, PendingTask]} b
      * @returns {number}
      * @private
      */
    /* private */ var _compare: Any = js.native
    
    /** @type {SortedMap<string, PendingTask>} */
    var _tasks: SortedMap[String, PendingTask] = js.native
    
    /**
      * @param {Task} task
      */
    def add(task: Task): Unit = js.native
    
    /**
      * @param {string} topic
      * @returns {void}
      */
    def delete(topic: String): Unit = js.native
    
    /**
      * @param {string} topic
      * @returns {Task|void}
      */
    def get(topic: String): Task | Unit = js.native
    
    def length: Double = js.native
    
    def tasks(): js.Array[typings.ipfsBitswap.distSrcDecisionEngineTypesMod.Task] = js.native
    
    /**
      * Sum of the size of all pending tasks
      *
      * @type {number}
      **/
    def totalSize: Double = js.native
    
    /**
      * Update the priority of the task with the given topic, and update the order
      *
      * @param {string} topic
      * @param {number} priority
      * @returns {void}
      **/
    def updatePriority(topic: String, priority: Double): Unit = js.native
  }
  
  trait PopTaskResult extends StObject {
    
    var peerId: js.UndefOr[typings.libp2pInterfacePeerId.mod.PeerId] = js.undefined
    
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
      
      inline def setPeerId(value: typings.libp2pInterfacePeerId.mod.PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
      
      inline def setPeerIdUndefined: Self = StObject.set(x, "peerId", js.undefined)
      
      inline def setPendingSize(value: Double): Self = StObject.set(x, "pendingSize", value.asInstanceOf[js.Any])
      
      inline def setTasks(value: js.Array[Task]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
      
      inline def setTasksVarargs(value: Task*): Self = StObject.set(x, "tasks", js.Array(value*))
    }
  }
  
  type Task = typings.ipfsBitswap.distSrcDecisionEngineTypesMod.Task
  
  type TaskMerger = typings.ipfsBitswap.distSrcDecisionEngineTypesMod.TaskMerger
}
