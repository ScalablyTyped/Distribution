package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrilldownDrillUpButtonOptions extends js.Object {
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
  implicit class DrilldownDrillUpButtonOptionsOps[Self <: DrilldownDrillUpButtonOptions] (val x: Self) extends AnyVal {
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
    def setPosition(value: AlignObject | DrilldownDrillUpButtonPositionOptions): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setRelativeTo(value: ButtonRelativeToValue): Self = this.set("relativeTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelativeTo: Self = this.set("relativeTo", js.undefined)
    @scala.inline
    def setTheme(value: js.Object): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

