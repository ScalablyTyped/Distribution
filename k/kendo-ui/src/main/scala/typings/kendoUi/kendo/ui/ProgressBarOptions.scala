package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressBarOptions extends js.Object {
  var animation: js.UndefOr[Boolean | ProgressBarAnimation] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ ProgressBarChangeEvent, Unit]] = js.undefined
  var chunkCount: js.UndefOr[Double] = js.undefined
  var complete: js.UndefOr[js.Function1[/* e */ ProgressBarCompleteEvent, Unit]] = js.undefined
  var enable: js.UndefOr[Boolean] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var orientation: js.UndefOr[String] = js.undefined
  var reverse: js.UndefOr[Boolean] = js.undefined
  var showStatus: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object ProgressBarOptions {
  @scala.inline
  def apply(
    animation: Boolean | ProgressBarAnimation = null,
    change: /* e */ ProgressBarChangeEvent => Unit = null,
    chunkCount: js.UndefOr[Double] = js.undefined,
    complete: /* e */ ProgressBarCompleteEvent => Unit = null,
    enable: js.UndefOr[Boolean] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    name: String = null,
    orientation: String = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    showStatus: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null,
    value: js.UndefOr[Double] = js.undefined
  ): ProgressBarOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (!js.isUndefined(chunkCount)) __obj.updateDynamic("chunkCount")(chunkCount.get.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showStatus)) __obj.updateDynamic("showStatus")(showStatus.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressBarOptions]
  }
}

