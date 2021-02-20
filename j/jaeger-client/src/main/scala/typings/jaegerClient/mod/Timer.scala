package typings.jaegerClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Timer extends StObject {
  
  // Records the time passed in.
  def record(value: Double): Unit = js.native
}
object Timer {
  
  @scala.inline
  def apply(record: Double => Unit): Timer = {
    val __obj = js.Dynamic.literal(record = js.Any.fromFunction1(record))
    __obj.asInstanceOf[Timer]
  }
  
  @scala.inline
  implicit class TimerMutableBuilder[Self <: Timer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecord(value: Double => Unit): Self = StObject.set(x, "record", js.Any.fromFunction1(value))
  }
}
