package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaneOptions extends js.Object {
  var collapsible: js.UndefOr[scala.Boolean] = js.undefined
  var initial: js.UndefOr[java.lang.String] = js.undefined
  var layout: js.UndefOr[java.lang.String] = js.undefined
  var loading: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var navigate: js.UndefOr[js.Function1[/* e */ PaneNavigateEvent, scala.Unit]] = js.undefined
  var portraitWidth: js.UndefOr[scala.Double] = js.undefined
  var transition: js.UndefOr[java.lang.String] = js.undefined
  var viewShow: js.UndefOr[js.Function1[/* e */ PaneViewShowEvent, scala.Unit]] = js.undefined
}

object PaneOptions {
  @scala.inline
  def apply(
    collapsible: js.UndefOr[scala.Boolean] = js.undefined,
    initial: java.lang.String = null,
    layout: java.lang.String = null,
    loading: java.lang.String = null,
    name: java.lang.String = null,
    navigate: js.Function1[/* e */ PaneNavigateEvent, scala.Unit] = null,
    portraitWidth: scala.Int | scala.Double = null,
    transition: java.lang.String = null,
    viewShow: js.Function1[/* e */ PaneViewShowEvent, scala.Unit] = null
  ): PaneOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible)
    if (initial != null) __obj.updateDynamic("initial")(initial)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (loading != null) __obj.updateDynamic("loading")(loading)
    if (name != null) __obj.updateDynamic("name")(name)
    if (navigate != null) __obj.updateDynamic("navigate")(navigate)
    if (portraitWidth != null) __obj.updateDynamic("portraitWidth")(portraitWidth.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition)
    if (viewShow != null) __obj.updateDynamic("viewShow")(viewShow)
    __obj.asInstanceOf[PaneOptions]
  }
}

