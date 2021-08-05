package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgDataChartLegend
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * The name of the element to turn into a legend.
    */
  var element: js.UndefOr[String] = js.undefined
  
  /**
    * The height of the legend.null will stretch vertically to fit data, no other height are defined.
    *
    *
    * Valid values:
    * "null"
    */
  var height: js.UndefOr[String | Double] = js.undefined
  
  /**
    * Type of the legend.
    *
    * Valid values:
    * "item" Specify the legend as item legend. It displays a legend item for each pie in the igPieChart control.
    * "legend" Specify the legend as legend. It is supported by all types of series in the igDataChart control.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * The width of the legend.
    *
    * Valid values:
    * "null" will stretch to fit data, if no other widths are defined.
    */
  var width: js.UndefOr[String | Double] = js.undefined
}
object IgDataChartLegend {
  
  inline def apply(): IgDataChartLegend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgDataChartLegend]
  }
  
  extension [Self <: IgDataChartLegend](x: Self) {
    
    inline def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
