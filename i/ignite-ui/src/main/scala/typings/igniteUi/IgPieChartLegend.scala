package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgPieChartLegend
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * The name of the element to turn into a legend.
    */
  var element: js.UndefOr[String] = js.native
  
  /**
    * The height of the legend. It can be set as a number in pixels, string (px) or percentage (%).
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * Type of the legend.
    *
    * Valid values:
    * "item" Specify the legend as item legend. It displays a legend item for each pie in the igPieChart control.
    * "legend" Specify the legend as legend. It is supported by all types of series in the igDataChart control.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * The width of the legend. It can be set as a number in pixels, string (px) or percentage (%).
    */
  var width: js.UndefOr[Double] = js.native
}
object IgPieChartLegend {
  
  @scala.inline
  def apply(): IgPieChartLegend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPieChartLegend]
  }
  
  @scala.inline
  implicit class IgPieChartLegendMutableBuilder[Self <: IgPieChartLegend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
