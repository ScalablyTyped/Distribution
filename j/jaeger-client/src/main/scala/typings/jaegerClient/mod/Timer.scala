package typings.jaegerClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Timer extends StObject {
  
  // Records the time passed in.
  def record(value: Double): Unit
}
object Timer {
  
  inline def apply(record: Double => Unit): Timer = {
    val __obj = js.Dynamic.literal(record = js.Any.fromFunction1(record))
    __obj.asInstanceOf[Timer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Timer] (val x: Self) extends AnyVal {
    
    inline def setRecord(value: Double => Unit): Self = StObject.set(x, "record", js.Any.fromFunction1(value))
  }
}
