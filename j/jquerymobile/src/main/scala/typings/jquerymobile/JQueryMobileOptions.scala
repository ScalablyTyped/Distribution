package typings.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryMobileOptions extends js.Object {
  var activeBtnClass: js.UndefOr[String] = js.undefined
  var activePageClass: js.UndefOr[String] = js.undefined
  var ajaxEnabled: js.UndefOr[Boolean] = js.undefined
  var allowCrossDomainPages: js.UndefOr[Boolean] = js.undefined
  var autoInitializePage: js.UndefOr[Boolean] = js.undefined
  var buttonMarkup: js.Any
  var defaultDialogTransition: js.UndefOr[String] = js.undefined
  var defaultPageTransition: js.UndefOr[String] = js.undefined
  var getMaxScrollForTransition: js.UndefOr[Double] = js.undefined
  var gradeA: js.UndefOr[js.Function] = js.undefined
  var hashListeningEnabled: js.UndefOr[Boolean] = js.undefined
  var ignoreContentEnabled: js.UndefOr[Boolean] = js.undefined
  var linkBindingEnabled: js.UndefOr[Boolean] = js.undefined
  var loadingMessageTextVisible: js.UndefOr[Boolean] = js.undefined
  var loadingMessageTheme: js.UndefOr[String] = js.undefined
  var maxTransitionWidth: js.UndefOr[Double] = js.undefined
  var minScrollBack: js.UndefOr[Double] = js.undefined
  var ns: js.UndefOr[Double] = js.undefined
  var pageLoadErrorMessage: js.UndefOr[String] = js.undefined
  var pageLoadErrorMessageTheme: js.UndefOr[String] = js.undefined
  var phonegapNavigationEnabled: js.UndefOr[Boolean] = js.undefined
  var pushStateEnabled: js.UndefOr[Boolean] = js.undefined
  var subPageUrlKey: js.UndefOr[String] = js.undefined
  var touchOverflowEnabled: js.UndefOr[Boolean] = js.undefined
  var transitionFallbacks: js.Any
}

object JQueryMobileOptions {
  @scala.inline
  def apply(
    buttonMarkup: js.Any,
    transitionFallbacks: js.Any,
    activeBtnClass: String = null,
    activePageClass: String = null,
    ajaxEnabled: js.UndefOr[Boolean] = js.undefined,
    allowCrossDomainPages: js.UndefOr[Boolean] = js.undefined,
    autoInitializePage: js.UndefOr[Boolean] = js.undefined,
    defaultDialogTransition: String = null,
    defaultPageTransition: String = null,
    getMaxScrollForTransition: Int | Double = null,
    gradeA: js.Function = null,
    hashListeningEnabled: js.UndefOr[Boolean] = js.undefined,
    ignoreContentEnabled: js.UndefOr[Boolean] = js.undefined,
    linkBindingEnabled: js.UndefOr[Boolean] = js.undefined,
    loadingMessageTextVisible: js.UndefOr[Boolean] = js.undefined,
    loadingMessageTheme: String = null,
    maxTransitionWidth: Int | Double = null,
    minScrollBack: Int | Double = null,
    ns: Int | Double = null,
    pageLoadErrorMessage: String = null,
    pageLoadErrorMessageTheme: String = null,
    phonegapNavigationEnabled: js.UndefOr[Boolean] = js.undefined,
    pushStateEnabled: js.UndefOr[Boolean] = js.undefined,
    subPageUrlKey: String = null,
    touchOverflowEnabled: js.UndefOr[Boolean] = js.undefined
  ): JQueryMobileOptions = {
    val __obj = js.Dynamic.literal(buttonMarkup = buttonMarkup.asInstanceOf[js.Any], transitionFallbacks = transitionFallbacks.asInstanceOf[js.Any])
    if (activeBtnClass != null) __obj.updateDynamic("activeBtnClass")(activeBtnClass.asInstanceOf[js.Any])
    if (activePageClass != null) __obj.updateDynamic("activePageClass")(activePageClass.asInstanceOf[js.Any])
    if (!js.isUndefined(ajaxEnabled)) __obj.updateDynamic("ajaxEnabled")(ajaxEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(allowCrossDomainPages)) __obj.updateDynamic("allowCrossDomainPages")(allowCrossDomainPages.asInstanceOf[js.Any])
    if (!js.isUndefined(autoInitializePage)) __obj.updateDynamic("autoInitializePage")(autoInitializePage.asInstanceOf[js.Any])
    if (defaultDialogTransition != null) __obj.updateDynamic("defaultDialogTransition")(defaultDialogTransition.asInstanceOf[js.Any])
    if (defaultPageTransition != null) __obj.updateDynamic("defaultPageTransition")(defaultPageTransition.asInstanceOf[js.Any])
    if (getMaxScrollForTransition != null) __obj.updateDynamic("getMaxScrollForTransition")(getMaxScrollForTransition.asInstanceOf[js.Any])
    if (gradeA != null) __obj.updateDynamic("gradeA")(gradeA.asInstanceOf[js.Any])
    if (!js.isUndefined(hashListeningEnabled)) __obj.updateDynamic("hashListeningEnabled")(hashListeningEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreContentEnabled)) __obj.updateDynamic("ignoreContentEnabled")(ignoreContentEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(linkBindingEnabled)) __obj.updateDynamic("linkBindingEnabled")(linkBindingEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(loadingMessageTextVisible)) __obj.updateDynamic("loadingMessageTextVisible")(loadingMessageTextVisible.asInstanceOf[js.Any])
    if (loadingMessageTheme != null) __obj.updateDynamic("loadingMessageTheme")(loadingMessageTheme.asInstanceOf[js.Any])
    if (maxTransitionWidth != null) __obj.updateDynamic("maxTransitionWidth")(maxTransitionWidth.asInstanceOf[js.Any])
    if (minScrollBack != null) __obj.updateDynamic("minScrollBack")(minScrollBack.asInstanceOf[js.Any])
    if (ns != null) __obj.updateDynamic("ns")(ns.asInstanceOf[js.Any])
    if (pageLoadErrorMessage != null) __obj.updateDynamic("pageLoadErrorMessage")(pageLoadErrorMessage.asInstanceOf[js.Any])
    if (pageLoadErrorMessageTheme != null) __obj.updateDynamic("pageLoadErrorMessageTheme")(pageLoadErrorMessageTheme.asInstanceOf[js.Any])
    if (!js.isUndefined(phonegapNavigationEnabled)) __obj.updateDynamic("phonegapNavigationEnabled")(phonegapNavigationEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(pushStateEnabled)) __obj.updateDynamic("pushStateEnabled")(pushStateEnabled.asInstanceOf[js.Any])
    if (subPageUrlKey != null) __obj.updateDynamic("subPageUrlKey")(subPageUrlKey.asInstanceOf[js.Any])
    if (!js.isUndefined(touchOverflowEnabled)) __obj.updateDynamic("touchOverflowEnabled")(touchOverflowEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryMobileOptions]
  }
}

