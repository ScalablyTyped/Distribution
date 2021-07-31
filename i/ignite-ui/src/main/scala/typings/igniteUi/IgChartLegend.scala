package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgChartLegend
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * This is the total height of the grid, including all UI elements - scroll container with data rows, header, footer, filter row -  (if any), etc.null will stretch vertically to fit data, no other height are defined
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
  
  var width: js.UndefOr[String | Double] = js.undefined
}
object IgChartLegend {
  
  @scala.inline
  def apply(): IgChartLegend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgChartLegend]
  }
  
  @scala.inline
  implicit class IgChartLegendMutableBuilder[Self <: IgChartLegend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
