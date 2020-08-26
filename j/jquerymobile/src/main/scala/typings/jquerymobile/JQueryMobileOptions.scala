package typings.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryMobileOptions extends js.Object {
  var activeBtnClass: js.UndefOr[String] = js.native
  var activePageClass: js.UndefOr[String] = js.native
  var ajaxEnabled: js.UndefOr[Boolean] = js.native
  var allowCrossDomainPages: js.UndefOr[Boolean] = js.native
  var autoInitializePage: js.UndefOr[Boolean] = js.native
  var buttonMarkup: js.Any = js.native
  var defaultDialogTransition: js.UndefOr[String] = js.native
  var defaultPageTransition: js.UndefOr[String] = js.native
  var getMaxScrollForTransition: js.UndefOr[Double] = js.native
  var gradeA: js.UndefOr[js.Function] = js.native
  var hashListeningEnabled: js.UndefOr[Boolean] = js.native
  var ignoreContentEnabled: js.UndefOr[Boolean] = js.native
  var linkBindingEnabled: js.UndefOr[Boolean] = js.native
  var loadingMessageTextVisible: js.UndefOr[Boolean] = js.native
  var loadingMessageTheme: js.UndefOr[String] = js.native
  var maxTransitionWidth: js.UndefOr[Double] = js.native
  var minScrollBack: js.UndefOr[Double] = js.native
  var ns: js.UndefOr[Double] = js.native
  var pageLoadErrorMessage: js.UndefOr[String] = js.native
  var pageLoadErrorMessageTheme: js.UndefOr[String] = js.native
  var phonegapNavigationEnabled: js.UndefOr[Boolean] = js.native
  var pushStateEnabled: js.UndefOr[Boolean] = js.native
  var subPageUrlKey: js.UndefOr[String] = js.native
  var touchOverflowEnabled: js.UndefOr[Boolean] = js.native
  var transitionFallbacks: js.Any = js.native
}

object JQueryMobileOptions {
  @scala.inline
  def apply(buttonMarkup: js.Any, transitionFallbacks: js.Any): JQueryMobileOptions = {
    val __obj = js.Dynamic.literal(buttonMarkup = buttonMarkup.asInstanceOf[js.Any], transitionFallbacks = transitionFallbacks.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryMobileOptions]
  }
  @scala.inline
  implicit class JQueryMobileOptionsOps[Self <: JQueryMobileOptions] (val x: Self) extends AnyVal {
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
    def setButtonMarkup(value: js.Any): Self = this.set("buttonMarkup", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransitionFallbacks(value: js.Any): Self = this.set("transitionFallbacks", value.asInstanceOf[js.Any])
    @scala.inline
    def setActiveBtnClass(value: String): Self = this.set("activeBtnClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveBtnClass: Self = this.set("activeBtnClass", js.undefined)
    @scala.inline
    def setActivePageClass(value: String): Self = this.set("activePageClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivePageClass: Self = this.set("activePageClass", js.undefined)
    @scala.inline
    def setAjaxEnabled(value: Boolean): Self = this.set("ajaxEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAjaxEnabled: Self = this.set("ajaxEnabled", js.undefined)
    @scala.inline
    def setAllowCrossDomainPages(value: Boolean): Self = this.set("allowCrossDomainPages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowCrossDomainPages: Self = this.set("allowCrossDomainPages", js.undefined)
    @scala.inline
    def setAutoInitializePage(value: Boolean): Self = this.set("autoInitializePage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoInitializePage: Self = this.set("autoInitializePage", js.undefined)
    @scala.inline
    def setDefaultDialogTransition(value: String): Self = this.set("defaultDialogTransition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultDialogTransition: Self = this.set("defaultDialogTransition", js.undefined)
    @scala.inline
    def setDefaultPageTransition(value: String): Self = this.set("defaultPageTransition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultPageTransition: Self = this.set("defaultPageTransition", js.undefined)
    @scala.inline
    def setGetMaxScrollForTransition(value: Double): Self = this.set("getMaxScrollForTransition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetMaxScrollForTransition: Self = this.set("getMaxScrollForTransition", js.undefined)
    @scala.inline
    def setGradeA(value: js.Function): Self = this.set("gradeA", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGradeA: Self = this.set("gradeA", js.undefined)
    @scala.inline
    def setHashListeningEnabled(value: Boolean): Self = this.set("hashListeningEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHashListeningEnabled: Self = this.set("hashListeningEnabled", js.undefined)
    @scala.inline
    def setIgnoreContentEnabled(value: Boolean): Self = this.set("ignoreContentEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreContentEnabled: Self = this.set("ignoreContentEnabled", js.undefined)
    @scala.inline
    def setLinkBindingEnabled(value: Boolean): Self = this.set("linkBindingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkBindingEnabled: Self = this.set("linkBindingEnabled", js.undefined)
    @scala.inline
    def setLoadingMessageTextVisible(value: Boolean): Self = this.set("loadingMessageTextVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadingMessageTextVisible: Self = this.set("loadingMessageTextVisible", js.undefined)
    @scala.inline
    def setLoadingMessageTheme(value: String): Self = this.set("loadingMessageTheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadingMessageTheme: Self = this.set("loadingMessageTheme", js.undefined)
    @scala.inline
    def setMaxTransitionWidth(value: Double): Self = this.set("maxTransitionWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTransitionWidth: Self = this.set("maxTransitionWidth", js.undefined)
    @scala.inline
    def setMinScrollBack(value: Double): Self = this.set("minScrollBack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinScrollBack: Self = this.set("minScrollBack", js.undefined)
    @scala.inline
    def setNs(value: Double): Self = this.set("ns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNs: Self = this.set("ns", js.undefined)
    @scala.inline
    def setPageLoadErrorMessage(value: String): Self = this.set("pageLoadErrorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageLoadErrorMessage: Self = this.set("pageLoadErrorMessage", js.undefined)
    @scala.inline
    def setPageLoadErrorMessageTheme(value: String): Self = this.set("pageLoadErrorMessageTheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageLoadErrorMessageTheme: Self = this.set("pageLoadErrorMessageTheme", js.undefined)
    @scala.inline
    def setPhonegapNavigationEnabled(value: Boolean): Self = this.set("phonegapNavigationEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhonegapNavigationEnabled: Self = this.set("phonegapNavigationEnabled", js.undefined)
    @scala.inline
    def setPushStateEnabled(value: Boolean): Self = this.set("pushStateEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePushStateEnabled: Self = this.set("pushStateEnabled", js.undefined)
    @scala.inline
    def setSubPageUrlKey(value: String): Self = this.set("subPageUrlKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubPageUrlKey: Self = this.set("subPageUrlKey", js.undefined)
    @scala.inline
    def setTouchOverflowEnabled(value: Boolean): Self = this.set("touchOverflowEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchOverflowEnabled: Self = this.set("touchOverflowEnabled", js.undefined)
  }
  
}

