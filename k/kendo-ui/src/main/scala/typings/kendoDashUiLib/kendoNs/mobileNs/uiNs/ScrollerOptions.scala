package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollerOptions extends js.Object {
  var elastic: js.UndefOr[scala.Boolean] = js.undefined
  var messages: js.UndefOr[ScrollerMessages] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var pull: js.UndefOr[js.Function1[/* e */ ScrollerEvent, scala.Unit]] = js.undefined
  var pullOffset: js.UndefOr[scala.Double] = js.undefined
  var pullToRefresh: js.UndefOr[scala.Boolean] = js.undefined
  var resize: js.UndefOr[js.Function1[/* e */ ScrollerEvent, scala.Unit]] = js.undefined
  var scroll: js.UndefOr[js.Function1[/* e */ ScrollerScrollEvent, scala.Unit]] = js.undefined
  var useNative: js.UndefOr[scala.Boolean] = js.undefined
  var visibleScrollHints: js.UndefOr[scala.Boolean] = js.undefined
  var zoom: js.UndefOr[scala.Boolean] = js.undefined
}

object ScrollerOptions {
  @scala.inline
  def apply(
    elastic: js.UndefOr[scala.Boolean] = js.undefined,
    messages: ScrollerMessages = null,
    name: java.lang.String = null,
    pull: /* e */ ScrollerEvent => scala.Unit = null,
    pullOffset: scala.Int | scala.Double = null,
    pullToRefresh: js.UndefOr[scala.Boolean] = js.undefined,
    resize: /* e */ ScrollerEvent => scala.Unit = null,
    scroll: /* e */ ScrollerScrollEvent => scala.Unit = null,
    useNative: js.UndefOr[scala.Boolean] = js.undefined,
    visibleScrollHints: js.UndefOr[scala.Boolean] = js.undefined,
    zoom: js.UndefOr[scala.Boolean] = js.undefined
  ): ScrollerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(elastic)) __obj.updateDynamic("elastic")(elastic)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (name != null) __obj.updateDynamic("name")(name)
    if (pull != null) __obj.updateDynamic("pull")(js.Any.fromFunction1(pull))
    if (pullOffset != null) __obj.updateDynamic("pullOffset")(pullOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(pullToRefresh)) __obj.updateDynamic("pullToRefresh")(pullToRefresh)
    if (resize != null) __obj.updateDynamic("resize")(js.Any.fromFunction1(resize))
    if (scroll != null) __obj.updateDynamic("scroll")(js.Any.fromFunction1(scroll))
    if (!js.isUndefined(useNative)) __obj.updateDynamic("useNative")(useNative)
    if (!js.isUndefined(visibleScrollHints)) __obj.updateDynamic("visibleScrollHints")(visibleScrollHints)
    if (!js.isUndefined(zoom)) __obj.updateDynamic("zoom")(zoom)
    __obj.asInstanceOf[ScrollerOptions]
  }
}

