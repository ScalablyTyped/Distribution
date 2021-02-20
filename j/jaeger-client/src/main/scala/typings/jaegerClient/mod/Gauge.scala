package typings.jaegerClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Gauge extends StObject {
  
  // Update the gauge to the value passed in.
  def update(value: Double): Unit = js.native
}
object Gauge {
  
  @scala.inline
  def apply(update: Double => Unit): Gauge = {
    val __obj = js.Dynamic.literal(update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[Gauge]
  }
  
  @scala.inline
  implicit class GaugeMutableBuilder[Self <: Gauge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUpdate(value: Double => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
  }
}
