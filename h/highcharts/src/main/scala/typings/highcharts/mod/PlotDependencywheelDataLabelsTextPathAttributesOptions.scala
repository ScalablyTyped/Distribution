package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotDependencywheelDataLabelsTextPathAttributesOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Text path shift along its
    * y-axis.
    */
  var dy: js.UndefOr[SVGAttributes] = js.undefined
}
object PlotDependencywheelDataLabelsTextPathAttributesOptions {
  
  inline def apply(): PlotDependencywheelDataLabelsTextPathAttributesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotDependencywheelDataLabelsTextPathAttributesOptions]
  }
  
  extension [Self <: PlotDependencywheelDataLabelsTextPathAttributesOptions](x: Self) {
    
    inline def setDy(value: SVGAttributes): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    inline def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
  }
}
