package typings.jui

import typings.jui.juiStrings.double
import typings.jui.juiStrings.horizontal
import typings.jui.juiStrings.single
import typings.jui.juiStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Double extends js.Object {
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

object Anon_Double {
  @scala.inline
  def apply(
    event: js.Any = null,
    format: String = null,
    from: Int | Double = null,
    max: Int | Double = null,
    min: Int | Double = null,
    orient: horizontal | vertical = null,
    progress: js.UndefOr[Boolean] = js.undefined,
    step: Int | Double = null,
    to: Int | Double = null,
    tooltip: js.UndefOr[Boolean] = js.undefined,
    tpl: js.Any = null,
    `type`: single | double = null
  ): Anon_Double = {
    val __obj = js.Dynamic.literal()
    if (event != null) __obj.updateDynamic("event")(event)
    if (format != null) __obj.updateDynamic("format")(format)
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (orient != null) __obj.updateDynamic("orient")(orient.asInstanceOf[js.Any])
    if (!js.isUndefined(progress)) __obj.updateDynamic("progress")(progress)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltip)) __obj.updateDynamic("tooltip")(tooltip)
    if (tpl != null) __obj.updateDynamic("tpl")(tpl)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Double]
  }
}

