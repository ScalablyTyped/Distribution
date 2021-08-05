package typings.jaegerClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Gauge extends StObject {
  
  // Update the gauge to the value passed in.
  def update(value: Double): Unit
}
object Gauge {
  
  inline def apply(update: Double => Unit): Gauge = {
    val __obj = js.Dynamic.literal(update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[Gauge]
  }
  
  extension [Self <: Gauge](x: Self) {
    
    inline def setUpdate(value: Double => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
  }
}
