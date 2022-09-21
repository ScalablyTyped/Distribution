package typings.jestWorker.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueueItem extends StObject {
  
  var priority: Double
  
  var task: QueueChildMessage
}
object QueueItem {
  
  inline def apply(priority: Double, task: QueueChildMessage): QueueItem = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueItem]
  }
  
  extension [Self <: QueueItem](x: Self) {
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setTask(value: QueueChildMessage): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
  }
}
