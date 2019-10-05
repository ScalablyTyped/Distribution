package typings.kendoDashUi.kendo.mobile.ui

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
    portraitWidth: Int | Double = null,
    transition: String = null,
    viewShow: /* e */ PaneViewShowEvent => Unit = null
  ): PaneOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible)
    if (initial != null) __obj.updateDynamic("initial")(initial)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (loading != null) __obj.updateDynamic("loading")(loading)
    if (name != null) __obj.updateDynamic("name")(name)
    if (navigate != null) __obj.updateDynamic("navigate")(js.Any.fromFunction1(navigate))
    if (portraitWidth != null) __obj.updateDynamic("portraitWidth")(portraitWidth.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition)
    if (viewShow != null) __obj.updateDynamic("viewShow")(js.Any.fromFunction1(viewShow))
    __obj.asInstanceOf[PaneOptions]
  }
}

