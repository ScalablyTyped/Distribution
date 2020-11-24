package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartResetZoomButtonOptions extends js.Object {
  
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
  implicit class ChartResetZoomButtonOptionsOps[Self <: ChartResetZoomButtonOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPosition(value: AlignObject | ChartResetZoomButtonPositionOptions): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setRelativeTo(value: ButtonRelativeToValue): Self = this.set("relativeTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelativeTo: Self = this.set("relativeTo", js.undefined)
    
    @scala.inline
    def setTheme(value: SVGAttributes): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}
