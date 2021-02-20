package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartResetZoomButtonOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The position of the button.
    */
  var position: js.UndefOr[AlignObject | ChartResetZoomButtonPositionOptions] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) What frame the button placement
    * should be related to. Can be either `plotBox` or `spacingBox`.
    */
  var relativeTo: js.UndefOr[ButtonRelativeToValue] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A collection of attributes for
    * the button. The object takes SVG attributes like `fill`, `stroke`,
    * `stroke-width` or `r`, the border radius. The theme also supports
    * `style`, a collection of CSS properties for the text. Equivalent
    * attributes for the hover state are given in `theme.states.hover`.
    */
  var theme: js.UndefOr[SVGAttributes] = js.native
}
object ChartResetZoomButtonOptions {
  
  @scala.inline
  def apply(): ChartResetZoomButtonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartResetZoomButtonOptions]
  }
  
  @scala.inline
  implicit class ChartResetZoomButtonOptionsMutableBuilder[Self <: ChartResetZoomButtonOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: AlignObject | ChartResetZoomButtonPositionOptions): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setRelativeTo(value: ButtonRelativeToValue): Self = StObject.set(x, "relativeTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativeToUndefined: Self = StObject.set(x, "relativeTo", js.undefined)
    
    @scala.inline
    def setTheme(value: SVGAttributes): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
