package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewOptions extends js.Object {
  var afterShow: js.UndefOr[js.Function1[/* e */ ViewAfterShowEvent, scala.Unit]] = js.undefined
  var beforeHide: js.UndefOr[js.Function1[/* e */ ViewBeforeHideEvent, scala.Unit]] = js.undefined
  var beforeShow: js.UndefOr[js.Function1[/* e */ ViewBeforeShowEvent, scala.Unit]] = js.undefined
  var hide: js.UndefOr[js.Function1[/* e */ ViewHideEvent, scala.Unit]] = js.undefined
  var init: js.UndefOr[js.Function1[/* e */ ViewInitEvent, scala.Unit]] = js.undefined
  var model: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var reload: js.UndefOr[scala.Boolean] = js.undefined
  var scroller: js.UndefOr[js.Any] = js.undefined
  var show: js.UndefOr[js.Function1[/* e */ ViewShowEvent, scala.Unit]] = js.undefined
  var stretch: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var transitionEnd: js.UndefOr[js.Function1[/* e */ ViewTransitionEndEvent, scala.Unit]] = js.undefined
  var transitionStart: js.UndefOr[js.Function1[/* e */ ViewTransitionStartEvent, scala.Unit]] = js.undefined
  var useNativeScrolling: js.UndefOr[scala.Boolean] = js.undefined
  var zoom: js.UndefOr[scala.Boolean] = js.undefined
}

object ViewOptions {
  @scala.inline
  def apply(
    afterShow: js.Function1[/* e */ ViewAfterShowEvent, scala.Unit] = null,
    beforeHide: js.Function1[/* e */ ViewBeforeHideEvent, scala.Unit] = null,
    beforeShow: js.Function1[/* e */ ViewBeforeShowEvent, scala.Unit] = null,
    hide: js.Function1[/* e */ ViewHideEvent, scala.Unit] = null,
    init: js.Function1[/* e */ ViewInitEvent, scala.Unit] = null,
    model: java.lang.String = null,
    name: java.lang.String = null,
    reload: js.UndefOr[scala.Boolean] = js.undefined,
    scroller: js.Any = null,
    show: js.Function1[/* e */ ViewShowEvent, scala.Unit] = null,
    stretch: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null,
    transitionEnd: js.Function1[/* e */ ViewTransitionEndEvent, scala.Unit] = null,
    transitionStart: js.Function1[/* e */ ViewTransitionStartEvent, scala.Unit] = null,
    useNativeScrolling: js.UndefOr[scala.Boolean] = js.undefined,
    zoom: js.UndefOr[scala.Boolean] = js.undefined
  ): ViewOptions = {
    val __obj = js.Dynamic.literal()
    if (afterShow != null) __obj.updateDynamic("afterShow")(afterShow)
    if (beforeHide != null) __obj.updateDynamic("beforeHide")(beforeHide)
    if (beforeShow != null) __obj.updateDynamic("beforeShow")(beforeShow)
    if (hide != null) __obj.updateDynamic("hide")(hide)
    if (init != null) __obj.updateDynamic("init")(init)
    if (model != null) __obj.updateDynamic("model")(model)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(reload)) __obj.updateDynamic("reload")(reload)
    if (scroller != null) __obj.updateDynamic("scroller")(scroller)
    if (show != null) __obj.updateDynamic("show")(show)
    if (!js.isUndefined(stretch)) __obj.updateDynamic("stretch")(stretch)
    if (title != null) __obj.updateDynamic("title")(title)
    if (transitionEnd != null) __obj.updateDynamic("transitionEnd")(transitionEnd)
    if (transitionStart != null) __obj.updateDynamic("transitionStart")(transitionStart)
    if (!js.isUndefined(useNativeScrolling)) __obj.updateDynamic("useNativeScrolling")(useNativeScrolling)
    if (!js.isUndefined(zoom)) __obj.updateDynamic("zoom")(zoom)
    __obj.asInstanceOf[ViewOptions]
  }
}

