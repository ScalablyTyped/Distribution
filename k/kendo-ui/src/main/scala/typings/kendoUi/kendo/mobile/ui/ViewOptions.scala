package typings.kendoUi.kendo.mobile.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewOptions extends js.Object {
  var afterShow: js.UndefOr[js.Function1[/* e */ ViewAfterShowEvent, Unit]] = js.native
  var beforeHide: js.UndefOr[js.Function1[/* e */ ViewBeforeHideEvent, Unit]] = js.native
  var beforeShow: js.UndefOr[js.Function1[/* e */ ViewBeforeShowEvent, Unit]] = js.native
  var hide: js.UndefOr[js.Function1[/* e */ ViewHideEvent, Unit]] = js.native
  var init: js.UndefOr[js.Function1[/* e */ ViewInitEvent, Unit]] = js.native
  var model: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var reload: js.UndefOr[Boolean] = js.native
  var scroller: js.UndefOr[js.Any] = js.native
  var show: js.UndefOr[js.Function1[/* e */ ViewShowEvent, Unit]] = js.native
  var stretch: js.UndefOr[Boolean] = js.native
  var title: js.UndefOr[String] = js.native
  var transitionEnd: js.UndefOr[js.Function1[/* e */ ViewTransitionEndEvent, Unit]] = js.native
  var transitionStart: js.UndefOr[js.Function1[/* e */ ViewTransitionStartEvent, Unit]] = js.native
  var useNativeScrolling: js.UndefOr[Boolean] = js.native
  var zoom: js.UndefOr[Boolean] = js.native
}

object ViewOptions {
  @scala.inline
  def apply(): ViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewOptions]
  }
  @scala.inline
  implicit class ViewOptionsOps[Self <: ViewOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAfterShow(value: /* e */ ViewAfterShowEvent => Unit): Self = this.set("afterShow", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterShow: Self = this.set("afterShow", js.undefined)
    @scala.inline
    def setBeforeHide(value: /* e */ ViewBeforeHideEvent => Unit): Self = this.set("beforeHide", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeHide: Self = this.set("beforeHide", js.undefined)
    @scala.inline
    def setBeforeShow(value: /* e */ ViewBeforeShowEvent => Unit): Self = this.set("beforeShow", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeShow: Self = this.set("beforeShow", js.undefined)
    @scala.inline
    def setHide(value: /* e */ ViewHideEvent => Unit): Self = this.set("hide", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    @scala.inline
    def setInit(value: /* e */ ViewInitEvent => Unit): Self = this.set("init", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    @scala.inline
    def setModel(value: String): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setReload(value: Boolean): Self = this.set("reload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReload: Self = this.set("reload", js.undefined)
    @scala.inline
    def setScroller(value: js.Any): Self = this.set("scroller", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScroller: Self = this.set("scroller", js.undefined)
    @scala.inline
    def setShow(value: /* e */ ViewShowEvent => Unit): Self = this.set("show", js.Any.fromFunction1(value))
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    @scala.inline
    def setStretch(value: Boolean): Self = this.set("stretch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStretch: Self = this.set("stretch", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTransitionEnd(value: /* e */ ViewTransitionEndEvent => Unit): Self = this.set("transitionEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTransitionEnd: Self = this.set("transitionEnd", js.undefined)
    @scala.inline
    def setTransitionStart(value: /* e */ ViewTransitionStartEvent => Unit): Self = this.set("transitionStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTransitionStart: Self = this.set("transitionStart", js.undefined)
    @scala.inline
    def setUseNativeScrolling(value: Boolean): Self = this.set("useNativeScrolling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseNativeScrolling: Self = this.set("useNativeScrolling", js.undefined)
    @scala.inline
    def setZoom(value: Boolean): Self = this.set("zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
  
}

