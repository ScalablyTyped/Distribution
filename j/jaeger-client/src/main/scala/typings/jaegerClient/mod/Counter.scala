package typings.jaegerClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Counter extends StObject {
  
  // Adds the given value to the counter.
  def increment(delta: Double): Unit = js.native
}
object Counter {
  
  @scala.inline
  def apply(increment: Double => Unit): Counter = {
    val __obj = js.Dynamic.literal(increment = js.Any.fromFunction1(increment))
    __obj.asInstanceOf[Counter]
  }
  
  @scala.inline
  implicit class CounterMutableBuilder[Self <: Counter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncrement(value: Double => Unit): Self = StObject.set(x, "increment", js.Any.fromFunction1(value))
  }
}
