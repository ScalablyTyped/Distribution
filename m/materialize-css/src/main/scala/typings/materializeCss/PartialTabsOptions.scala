package typings.materializeCss

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<materialize-css.M.TabsOptions> */
trait PartialTabsOptions extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var onShow: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* newContent */ Element, Unit]] = js.undefined
  var responsiveThreshold: js.UndefOr[Double] = js.undefined
  var swipeable: js.UndefOr[Boolean] = js.undefined
}

object PartialTabsOptions {
  @scala.inline
  def apply(
    duration: Int | Double = null,
    onShow: js.ThisFunction1[PartialTabsOptions, /* newContent */ Element, Unit] = null,
    responsiveThreshold: Int | Double = null,
    swipeable: js.UndefOr[Boolean] = js.undefined
  ): PartialTabsOptions = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (onShow != null) __obj.updateDynamic("onShow")(onShow.asInstanceOf[js.Any])
    if (responsiveThreshold != null) __obj.updateDynamic("responsiveThreshold")(responsiveThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeable)) __obj.updateDynamic("swipeable")(swipeable.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialTabsOptions]
  }
}

