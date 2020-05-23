package typings.kendoUi.kendo.mobile.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaneOptions extends js.Object {
  var collapsible: js.UndefOr[Boolean] = js.undefined
  var initial: js.UndefOr[String] = js.undefined
  var layout: js.UndefOr[String] = js.undefined
  var loading: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var navigate: js.UndefOr[js.Function1[/* e */ PaneNavigateEvent, Unit]] = js.undefined
  var portraitWidth: js.UndefOr[Double] = js.undefined
  var transition: js.UndefOr[String] = js.undefined
  var viewShow: js.UndefOr[js.Function1[/* e */ PaneViewShowEvent, Unit]] = js.undefined
}

object PaneOptions {
  @scala.inline
  def apply(
    collapsible: js.UndefOr[Boolean] = js.undefined,
    initial: String = null,
    layout: String = null,
    loading: String = null,
    name: String = null,
    navigate: /* e */ PaneNavigateEvent => Unit = null,
    portraitWidth: js.UndefOr[Double] = js.undefined,
    transition: String = null,
    viewShow: /* e */ PaneViewShowEvent => Unit = null
  ): PaneOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible.get.asInstanceOf[js.Any])
    if (initial != null) __obj.updateDynamic("initial")(initial.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (navigate != null) __obj.updateDynamic("navigate")(js.Any.fromFunction1(navigate))
    if (!js.isUndefined(portraitWidth)) __obj.updateDynamic("portraitWidth")(portraitWidth.get.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (viewShow != null) __obj.updateDynamic("viewShow")(js.Any.fromFunction1(viewShow))
    __obj.asInstanceOf[PaneOptions]
  }
}

