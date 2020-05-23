package typings.jui.anon

import typings.jui.juiStrings.double
import typings.jui.juiStrings.horizontal
import typings.jui.juiStrings.single
import typings.jui.juiStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Format extends js.Object {
  var event: js.UndefOr[js.Any] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var from: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
   // or vertical,
  var min: js.UndefOr[Double] = js.undefined
   // or double
  var orient: js.UndefOr[horizontal | vertical] = js.undefined
  var progress: js.UndefOr[Boolean] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
  var to: js.UndefOr[Double] = js.undefined
  var tooltip: js.UndefOr[Boolean] = js.undefined
  var tpl: js.UndefOr[js.Any] = js.undefined
  var `type`: js.UndefOr[single | double] = js.undefined
}

object Format {
  @scala.inline
  def apply(
    event: js.Any = null,
    format: String = null,
    from: js.UndefOr[Double] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    orient: horizontal | vertical = null,
    progress: js.UndefOr[Boolean] = js.undefined,
    step: js.UndefOr[Double] = js.undefined,
    to: js.UndefOr[Double] = js.undefined,
    tooltip: js.UndefOr[Boolean] = js.undefined,
    tpl: js.Any = null,
    `type`: single | double = null
  ): Format = {
    val __obj = js.Dynamic.literal()
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(from)) __obj.updateDynamic("from")(from.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (orient != null) __obj.updateDynamic("orient")(orient.asInstanceOf[js.Any])
    if (!js.isUndefined(progress)) __obj.updateDynamic("progress")(progress.get.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    if (!js.isUndefined(to)) __obj.updateDynamic("to")(to.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltip)) __obj.updateDynamic("tooltip")(tooltip.get.asInstanceOf[js.Any])
    if (tpl != null) __obj.updateDynamic("tpl")(tpl.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
}

