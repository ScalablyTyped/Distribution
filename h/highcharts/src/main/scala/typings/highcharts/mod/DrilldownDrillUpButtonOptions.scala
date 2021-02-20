package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrilldownDrillUpButtonOptions extends StObject {
  
  /**
    * (Highcharts, Highmaps) Positioning options for the button within the
    * `relativeTo` box. Available properties are `x`, `y`, `align` and
    * `verticalAlign`.
    */
  var position: js.UndefOr[AlignObject | DrilldownDrillUpButtonPositionOptions] = js.native
  
  /**
    * (Highcharts, Highmaps) What box to align the button to. Can be either
    * `plotBox` or `spacingBox`.
    */
  var relativeTo: js.UndefOr[ButtonRelativeToValue] = js.native
  
  /**
    * (Highcharts, Highmaps) A collection of attributes for the button. The
    * object takes SVG attributes like `fill`, `stroke`, `stroke-width` or `r`,
    * the border radius. The theme also supports `style`, a collection of CSS
    * properties for the text. Equivalent attributes for the hover state are
    * given in `theme.states.hover`.
    *
    * In styled mode, drill-up button styles can be applied with the
    * `.highcharts-drillup-button` class.
    */
  var theme: js.UndefOr[js.Object] = js.native
}
object DrilldownDrillUpButtonOptions {
  
  @scala.inline
  def apply(): DrilldownDrillUpButtonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrilldownDrillUpButtonOptions]
  }
  
  @scala.inline
  implicit class DrilldownDrillUpButtonOptionsMutableBuilder[Self <: DrilldownDrillUpButtonOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: AlignObject | DrilldownDrillUpButtonPositionOptions): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setRelativeTo(value: ButtonRelativeToValue): Self = StObject.set(x, "relativeTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativeToUndefined: Self = StObject.set(x, "relativeTo", js.undefined)
    
    @scala.inline
    def setTheme(value: js.Object): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
