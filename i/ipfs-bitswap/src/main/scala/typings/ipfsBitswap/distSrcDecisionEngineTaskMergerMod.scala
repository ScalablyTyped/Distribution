package typings.ipfsBitswap

import typings.ipfsBitswap.distSrcDecisionEngineMod.Task
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDecisionEngineTaskMergerMod {
  
  object DefaultTaskMerger {
    
    @JSImport("ipfs-bitswap/dist/src/decision-engine/task-merger", "DefaultTaskMerger")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Indicates whether the given task has newer information than the active
      * tasks with the same topic.
      *
      * @param {Task} task
      * @param {Task[]} tasksWithTopic
      * @returns {boolean}
      */
    inline def hasNewInfo(task: Task, tasksWithTopic: js.Array[Task]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasNewInfo")(task.asInstanceOf[js.Any], tasksWithTopic.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Merge the information from the given task into the existing task (with the
      * same topic)
      */
    inline def merge(newTask: Task, existingTask: Task): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(newTask.asInstanceOf[js.Any], existingTask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
