package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressBarOptions extends js.Object {
  var animation: js.UndefOr[ProgressBarAnimation] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ ProgressBarChangeEvent, scala.Unit]] = js.undefined
  var chunkCount: js.UndefOr[scala.Double] = js.undefined
  var complete: js.UndefOr[js.Function1[/* e */ ProgressBarCompleteEvent, scala.Unit]] = js.undefined
  var enable: js.UndefOr[scala.Boolean] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var orientation: js.UndefOr[java.lang.String] = js.undefined
  var reverse: js.UndefOr[scala.Boolean] = js.undefined
  var showStatus: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[scala.Double] = js.undefined
}

object ProgressBarOptions {
  @scala.inline
  def apply(
    animation: ProgressBarAnimation = null,
    change: js.Function1[/* e */ ProgressBarChangeEvent, scala.Unit] = null,
    chunkCount: scala.Int | scala.Double = null,
    complete: js.Function1[/* e */ ProgressBarCompleteEvent, scala.Unit] = null,
    enable: js.UndefOr[scala.Boolean] = js.undefined,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    orientation: java.lang.String = null,
    reverse: js.UndefOr[scala.Boolean] = js.undefined,
    showStatus: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null,
    value: scala.Int | scala.Double = null
  ): ProgressBarOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (change != null) __obj.updateDynamic("change")(change)
    if (chunkCount != null) __obj.updateDynamic("chunkCount")(chunkCount.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    if (!js.isUndefined(showStatus)) __obj.updateDynamic("showStatus")(showStatus)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressBarOptions]
  }
}

