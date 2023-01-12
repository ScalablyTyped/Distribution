package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartZoomingResetButtonOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The position of the button.
    */
  var position: js.UndefOr[AlignObject | ChartZoomingResetButtonPositionOptions] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) What frame the button placement
    * should be related to. Can be either `plotBox` or `spacingBox`.
    */
  var relativeTo: js.UndefOr[ButtonRelativeToValue] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A collection of attributes for
    * the button. The object takes SVG attributes like `fill`, `stroke`,
    * `stroke-width` or `r`, the border radius. The theme also supports
    * `style`, a collection of CSS properties for the text. Equivalent
    * attributes for the hover state are given in `theme.states.hover`.
    */
  var theme: js.UndefOr[SVGAttributes] = js.undefined
}
object ChartZoomingResetButtonOptions {
  
  inline def apply(): ChartZoomingResetButtonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartZoomingResetButtonOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartZoomingResetButtonOptions] (val x: Self) extends AnyVal {
    
    inline def setPosition(value: AlignObject | ChartZoomingResetButtonPositionOptions): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRelativeTo(value: ButtonRelativeToValue): Self = StObject.set(x, "relativeTo", value.asInstanceOf[js.Any])
    
    inline def setRelativeToUndefined: Self = StObject.set(x, "relativeTo", js.undefined)
    
    inline def setTheme(value: SVGAttributes): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
