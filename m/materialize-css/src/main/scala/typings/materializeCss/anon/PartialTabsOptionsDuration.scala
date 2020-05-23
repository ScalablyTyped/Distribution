package typings.materializeCss.anon

import typings.materializeCss.M.Tabs
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<materialize-css.M.TabsOptions> */
trait PartialTabsOptionsDuration extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var onShow: js.UndefOr[js.ThisFunction1[/* this */ Tabs, /* newContent */ Element, Unit]] = js.undefined
  var responsiveThreshold: js.UndefOr[Double] = js.undefined
  var swipeable: js.UndefOr[Boolean] = js.undefined
}

object PartialTabsOptionsDuration {
  @scala.inline
  def apply(
    duration: js.UndefOr[Double] = js.undefined,
    onShow: js.ThisFunction1[/* this */ Tabs, /* newContent */ Element, Unit] = null,
    responsiveThreshold: js.UndefOr[Double] = js.undefined,
    swipeable: js.UndefOr[Boolean] = js.undefined
  ): PartialTabsOptionsDuration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (onShow != null) __obj.updateDynamic("onShow")(onShow.asInstanceOf[js.Any])
    if (!js.isUndefined(responsiveThreshold)) __obj.updateDynamic("responsiveThreshold")(responsiveThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeable)) __obj.updateDynamic("swipeable")(swipeable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialTabsOptionsDuration]
  }
}

