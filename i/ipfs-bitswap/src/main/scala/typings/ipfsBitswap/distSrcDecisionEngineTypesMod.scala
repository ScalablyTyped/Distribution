package typings.ipfsBitswap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDecisionEngineTypesMod {
  
  trait Task extends StObject {
    
    var data: TaskData
    
    /**
      * Priority for the Task (tasks are ordered by priority per peer).
      */
    var priority: Double
    
    /**
      * The size of the task, e.g. the number of bytes in a block.
      */
    var size: Double
    
    /**
      * A name for the Task (like an id but not necessarily unique)
      */
    var topic: String
  }
  object Task {
    
    inline def apply(data: TaskData, priority: Double, size: Double, topic: String): Task = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
      __obj.asInstanceOf[Task]
    }
    
    extension [Self <: Task](x: Self) {
      
      inline def setData(value: TaskData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    }
  }
  
  trait TaskData extends StObject {
    
    /**
      * The size of the block, if known (if we don't have the block this is zero)
      */
    var blockSize: Double
    
    /**
      * Indicates if we have the block.
      */
    var haveBlock: Boolean
    
    /**
      * Indicates if the request is for a block or for a HAVE.
      */
    var isWantBlock: Boolean
    
    /**
      * Indicates whether to send a DONT_HAVE response if we don't have the block.
      * If this is `false` and we don't have the block, we just ignore the
      * want-block request (useful for discovery where we query lots of peers but
      * don't want a response unless the peer has the block).
      */
    var sendDontHave: Boolean
  }
  object TaskData {
    
    inline def apply(blockSize: Double, haveBlock: Boolean, isWantBlock: Boolean, sendDontHave: Boolean): TaskData = {
      val __obj = js.Dynamic.literal(blockSize = blockSize.asInstanceOf[js.Any], haveBlock = haveBlock.asInstanceOf[js.Any], isWantBlock = isWantBlock.asInstanceOf[js.Any], sendDontHave = sendDontHave.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskData]
    }
    
    extension [Self <: TaskData](x: Self) {
      
      inline def setBlockSize(value: Double): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
      
      inline def setHaveBlock(value: Boolean): Self = StObject.set(x, "haveBlock", value.asInstanceOf[js.Any])
      
      inline def setIsWantBlock(value: Boolean): Self = StObject.set(x, "isWantBlock", value.asInstanceOf[js.Any])
      
      inline def setSendDontHave(value: Boolean): Self = StObject.set(x, "sendDontHave", value.asInstanceOf[js.Any])
    }
  }
  
  trait TaskMerger extends StObject {
    
    /**
      * Given the existing tasks with the same topic, does the task add some new
      * information? Used to decide whether to merge the task or ignore it.
      */
    def hasNewInfo(task: Task, tasksWithTopic: js.Array[Task]): Boolean
    
    /**
      * Merge the information from the task into the existing pending task.
      */
    def merge(newTask: Task, existingTask: Task): Unit
  }
  object TaskMerger {
    
    inline def apply(hasNewInfo: (Task, js.Array[Task]) => Boolean, merge: (Task, Task) => Unit): TaskMerger = {
      val __obj = js.Dynamic.literal(hasNewInfo = js.Any.fromFunction2(hasNewInfo), merge = js.Any.fromFunction2(merge))
      __obj.asInstanceOf[TaskMerger]
    }
    
    extension [Self <: TaskMerger](x: Self) {
      
      inline def setHasNewInfo(value: (Task, js.Array[Task]) => Boolean): Self = StObject.set(x, "hasNewInfo", js.Any.fromFunction2(value))
      
      inline def setMerge(value: (Task, Task) => Unit): Self = StObject.set(x, "merge", js.Any.fromFunction2(value))
    }
  }
}
