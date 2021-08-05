package typings.jaegerClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Counter extends StObject {
  
  // Adds the given value to the counter.
  def increment(delta: Double): Unit
}
object Counter {
  
  inline def apply(increment: Double => Unit): Counter = {
    val __obj = js.Dynamic.literal(increment = js.Any.fromFunction1(increment))
    __obj.asInstanceOf[Counter]
  }
  
  extension [Self <: Counter](x: Self) {
    
    inline def setIncrement(value: Double => Unit): Self = StObject.set(x, "increment", js.Any.fromFunction1(value))
  }
}
