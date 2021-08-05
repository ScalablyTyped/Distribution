package typings.kendoUi.kendo.dataviz.drawing

import typings.kendoUi.kendo.Class
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Gradient
  extends StObject
     with Class {
  
  def addStop(offset: Double, color: String, opacity: Double): typings.kendoUi.kendo.drawing.GradientStop
  
  var options: GradientOptions
  
  def removeStop(stop: typings.kendoUi.kendo.drawing.GradientStop): Unit
  
  var stops: js.Any
}
object Gradient {
  
  inline def apply(
    addStop: (Double, String, Double) => typings.kendoUi.kendo.drawing.GradientStop,
    options: GradientOptions,
    removeStop: typings.kendoUi.kendo.drawing.GradientStop => Unit,
    stops: js.Any
  ): Gradient = {
    val __obj = js.Dynamic.literal(addStop = js.Any.fromFunction3(addStop), options = options.asInstanceOf[js.Any], removeStop = js.Any.fromFunction1(removeStop), stops = stops.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gradient]
  }
  
  extension [Self <: Gradient](x: Self) {
    
    inline def setAddStop(value: (Double, String, Double) => typings.kendoUi.kendo.drawing.GradientStop): Self = StObject.set(x, "addStop", js.Any.fromFunction3(value))
    
    inline def setOptions(value: GradientOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setRemoveStop(value: typings.kendoUi.kendo.drawing.GradientStop => Unit): Self = StObject.set(x, "removeStop", js.Any.fromFunction1(value))
    
    inline def setStops(value: js.Any): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
  }
}
