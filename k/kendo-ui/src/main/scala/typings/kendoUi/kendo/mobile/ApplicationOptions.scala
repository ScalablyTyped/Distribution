package typings.kendoUi.kendo.mobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationOptions extends js.Object {
  var browserHistory: js.UndefOr[Boolean] = js.native
  var hideAddressBar: js.UndefOr[Boolean] = js.native
  var init: js.UndefOr[js.Function1[/* e */ ApplicationEvent, Unit]] = js.native
  var initial: js.UndefOr[String] = js.native
  var layout: js.UndefOr[String] = js.native
  var loading: js.UndefOr[String] = js.native
  var modelScope: js.UndefOr[js.Object] = js.native
  var platform: js.UndefOr[String] = js.native
  var retina: js.UndefOr[Boolean] = js.native
  var serverNavigation: js.UndefOr[Boolean] = js.native
  var skin: js.UndefOr[String] = js.native
  var statusBarStyle: js.UndefOr[String] = js.native
  var transition: js.UndefOr[String] = js.native
  var updateDocumentTitle: js.UndefOr[Boolean] = js.native
  var useNativeScrolling: js.UndefOr[Boolean] = js.native
}

object ApplicationOptions {
  @scala.inline
  def apply(): ApplicationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationOptions]
  }
  @scala.inline
  implicit class ApplicationOptionsOps[Self <: ApplicationOptions] (val x: Self) extends AnyVal {
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
    def setBrowserHistory(value: Boolean): Self = this.set("browserHistory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowserHistory: Self = this.set("browserHistory", js.undefined)
    @scala.inline
    def setHideAddressBar(value: Boolean): Self = this.set("hideAddressBar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideAddressBar: Self = this.set("hideAddressBar", js.undefined)
    @scala.inline
    def setInit(value: /* e */ ApplicationEvent => Unit): Self = this.set("init", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    @scala.inline
    def setInitial(value: String): Self = this.set("initial", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitial: Self = this.set("initial", js.undefined)
    @scala.inline
    def setLayout(value: String): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setLoading(value: String): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    @scala.inline
    def setModelScope(value: js.Object): Self = this.set("modelScope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModelScope: Self = this.set("modelScope", js.undefined)
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    @scala.inline
    def setRetina(value: Boolean): Self = this.set("retina", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetina: Self = this.set("retina", js.undefined)
    @scala.inline
    def setServerNavigation(value: Boolean): Self = this.set("serverNavigation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerNavigation: Self = this.set("serverNavigation", js.undefined)
    @scala.inline
    def setSkin(value: String): Self = this.set("skin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkin: Self = this.set("skin", js.undefined)
    @scala.inline
    def setStatusBarStyle(value: String): Self = this.set("statusBarStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusBarStyle: Self = this.set("statusBarStyle", js.undefined)
    @scala.inline
    def setTransition(value: String): Self = this.set("transition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
    @scala.inline
    def setUpdateDocumentTitle(value: Boolean): Self = this.set("updateDocumentTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateDocumentTitle: Self = this.set("updateDocumentTitle", js.undefined)
    @scala.inline
    def setUseNativeScrolling(value: Boolean): Self = this.set("useNativeScrolling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseNativeScrolling: Self = this.set("useNativeScrolling", js.undefined)
  }
  
}

