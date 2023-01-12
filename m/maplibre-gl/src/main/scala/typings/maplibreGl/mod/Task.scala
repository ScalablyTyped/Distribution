package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Task extends StObject {
  
  def callback(timeStamp: Double): scala.Unit
  
  var cancelled: Boolean
  
  var id: TaskID
}
object Task {
  
  inline def apply(callback: Double => scala.Unit, cancelled: Boolean, id: TaskID): Task = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), cancelled = cancelled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Task]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Task] (val x: Self) extends AnyVal {
    
    inline def setCallback(value: Double => scala.Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    inline def setCancelled(value: Boolean): Self = StObject.set(x, "cancelled", value.asInstanceOf[js.Any])
    
    inline def setId(value: TaskID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
