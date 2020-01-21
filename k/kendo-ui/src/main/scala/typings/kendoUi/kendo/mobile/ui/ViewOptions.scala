package typings.kendoUi.kendo.mobile.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewOptions extends js.Object {
  var afterShow: js.UndefOr[js.Function1[/* e */ ViewAfterShowEvent, Unit]] = js.undefined
  var beforeHide: js.UndefOr[js.Function1[/* e */ ViewBeforeHideEvent, Unit]] = js.undefined
  var beforeShow: js.UndefOr[js.Function1[/* e */ ViewBeforeShowEvent, Unit]] = js.undefined
  var hide: js.UndefOr[js.Function1[/* e */ ViewHideEvent, Unit]] = js.undefined
  var init: js.UndefOr[js.Function1[/* e */ ViewInitEvent, Unit]] = js.undefined
  var model: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var reload: js.UndefOr[Boolean] = js.undefined
  var scroller: js.UndefOr[js.Any] = js.undefined
  var show: js.UndefOr[js.Function1[/* e */ ViewShowEvent, Unit]] = js.undefined
  var stretch: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var transitionEnd: js.UndefOr[js.Function1[/* e */ ViewTransitionEndEvent, Unit]] = js.undefined
  var transitionStart: js.UndefOr[js.Function1[/* e */ ViewTransitionStartEvent, Unit]] = js.undefined
  var useNativeScrolling: js.UndefOr[Boolean] = js.undefined
  var zoom: js.UndefOr[Boolean] = js.undefined
}

object ViewOptions {
  @scala.inline
  def apply(
    afterShow: /* e */ ViewAfterShowEvent => Unit = null,
    beforeHide: /* e */ ViewBeforeHideEvent => Unit = null,
    beforeShow: /* e */ ViewBeforeShowEvent => Unit = null,
    hide: /* e */ ViewHideEvent => Unit = null,
    init: /* e */ ViewInitEvent => Unit = null,
    model: String = null,
    name: String = null,
    reload: js.UndefOr[Boolean] = js.undefined,
    scroller: js.Any = null,
    show: /* e */ ViewShowEvent => Unit = null,
    stretch: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    transitionEnd: /* e */ ViewTransitionEndEvent => Unit = null,
    transitionStart: /* e */ ViewTransitionStartEvent => Unit = null,
    useNativeScrolling: js.UndefOr[Boolean] = js.undefined,
    zoom: js.UndefOr[Boolean] = js.undefined
  ): ViewOptions = {
    val __obj = js.Dynamic.literal()
    if (afterShow != null) __obj.updateDynamic("afterShow")(js.Any.fromFunction1(afterShow))
    if (beforeHide != null) __obj.updateDynamic("beforeHide")(js.Any.fromFunction1(beforeHide))
    if (beforeShow != null) __obj.updateDynamic("beforeShow")(js.Any.fromFunction1(beforeShow))
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction1(hide))
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1(init))
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(reload)) __obj.updateDynamic("reload")(reload.asInstanceOf[js.Any])
    if (scroller != null) __obj.updateDynamic("scroller")(scroller.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction1(show))
    if (!js.isUndefined(stretch)) __obj.updateDynamic("stretch")(stretch.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transitionEnd != null) __obj.updateDynamic("transitionEnd")(js.Any.fromFunction1(transitionEnd))
    if (transitionStart != null) __obj.updateDynamic("transitionStart")(js.Any.fromFunction1(transitionStart))
    if (!js.isUndefined(useNativeScrolling)) __obj.updateDynamic("useNativeScrolling")(useNativeScrolling.asInstanceOf[js.Any])
    if (!js.isUndefined(zoom)) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewOptions]
  }
}

