package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeSliderTooltip extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var template: js.UndefOr[String] = js.undefined
}

object RangeSliderTooltip {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, format: String = null, template: String = null): RangeSliderTooltip = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (format != null) __obj.updateDynamic("format")(format)
    if (template != null) __obj.updateDynamic("template")(template)
    __obj.asInstanceOf[RangeSliderTooltip]
  }
}

