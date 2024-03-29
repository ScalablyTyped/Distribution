package typings.kendoUi.kendo.drawing

import typings.kendoUi.kendo.Class
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Gradient
  extends StObject
     with Class {
  
  def addStop(offset: Double, color: String, opacity: Double): GradientStop
  
  var options: GradientOptions
  
  def removeStop(stop: GradientStop): Unit
  
  var stops: Any
}
object Gradient {
  
  inline def apply(
    addStop: (Double, String, Double) => GradientStop,
    options: GradientOptions,
    removeStop: GradientStop => Unit,
    stops: Any
  ): Gradient = {
    val __obj = js.Dynamic.literal(addStop = js.Any.fromFunction3(addStop), options = options.asInstanceOf[js.Any], removeStop = js.Any.fromFunction1(removeStop), stops = stops.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gradient]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Gradient] (val x: Self) extends AnyVal {
    
    inline def setAddStop(value: (Double, String, Double) => GradientStop): Self = StObject.set(x, "addStop", js.Any.fromFunction3(value))
    
    inline def setOptions(value: GradientOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setRemoveStop(value: GradientStop => Unit): Self = StObject.set(x, "removeStop", js.Any.fromFunction1(value))
    
    inline def setStops(value: Any): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
  }
}
