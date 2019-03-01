package typings
package jquerymobileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryMobileOptions extends js.Object {
  var activeBtnClass: js.UndefOr[java.lang.String] = js.undefined
  var activePageClass: js.UndefOr[java.lang.String] = js.undefined
  var ajaxEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var allowCrossDomainPages: js.UndefOr[scala.Boolean] = js.undefined
  var autoInitializePage: js.UndefOr[scala.Boolean] = js.undefined
  var buttonMarkup: js.Any
  var defaultDialogTransition: js.UndefOr[java.lang.String] = js.undefined
  var defaultPageTransition: js.UndefOr[java.lang.String] = js.undefined
  var getMaxScrollForTransition: js.UndefOr[scala.Double] = js.undefined
  var gradeA: js.UndefOr[js.Function] = js.undefined
  var hashListeningEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreContentEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var linkBindingEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var loadingMessageTextVisible: js.UndefOr[scala.Boolean] = js.undefined
  var loadingMessageTheme: js.UndefOr[java.lang.String] = js.undefined
  var maxTransitionWidth: js.UndefOr[scala.Double] = js.undefined
  var minScrollBack: js.UndefOr[scala.Double] = js.undefined
  var ns: js.UndefOr[scala.Double] = js.undefined
  var pageLoadErrorMessage: js.UndefOr[java.lang.String] = js.undefined
  var pageLoadErrorMessageTheme: js.UndefOr[java.lang.String] = js.undefined
  var phonegapNavigationEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var pushStateEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var subPageUrlKey: js.UndefOr[java.lang.String] = js.undefined
  var touchOverflowEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var transitionFallbacks: js.Any
}

object JQueryMobileOptions {
  @scala.inline
  def apply(
    buttonMarkup: js.Any,
    transitionFallbacks: js.Any,
    activeBtnClass: java.lang.String = null,
    activePageClass: java.lang.String = null,
    ajaxEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    allowCrossDomainPages: js.UndefOr[scala.Boolean] = js.undefined,
    autoInitializePage: js.UndefOr[scala.Boolean] = js.undefined,
    defaultDialogTransition: java.lang.String = null,
    defaultPageTransition: java.lang.String = null,
    getMaxScrollForTransition: scala.Int | scala.Double = null,
    gradeA: js.Function = null,
    hashListeningEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreContentEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    linkBindingEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    loadingMessageTextVisible: js.UndefOr[scala.Boolean] = js.undefined,
    loadingMessageTheme: java.lang.String = null,
    maxTransitionWidth: scala.Int | scala.Double = null,
    minScrollBack: scala.Int | scala.Double = null,
    ns: scala.Int | scala.Double = null,
    pageLoadErrorMessage: java.lang.String = null,
    pageLoadErrorMessageTheme: java.lang.String = null,
    phonegapNavigationEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    pushStateEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    subPageUrlKey: java.lang.String = null,
    touchOverflowEnabled: js.UndefOr[scala.Boolean] = js.undefined
  ): JQueryMobileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("buttonMarkup")(buttonMarkup)
    __obj.updateDynamic("transitionFallbacks")(transitionFallbacks)
    if (activeBtnClass != null) __obj.updateDynamic("activeBtnClass")(activeBtnClass)
    if (activePageClass != null) __obj.updateDynamic("activePageClass")(activePageClass)
    if (!js.isUndefined(ajaxEnabled)) __obj.updateDynamic("ajaxEnabled")(ajaxEnabled)
    if (!js.isUndefined(allowCrossDomainPages)) __obj.updateDynamic("allowCrossDomainPages")(allowCrossDomainPages)
    if (!js.isUndefined(autoInitializePage)) __obj.updateDynamic("autoInitializePage")(autoInitializePage)
    if (defaultDialogTransition != null) __obj.updateDynamic("defaultDialogTransition")(defaultDialogTransition)
    if (defaultPageTransition != null) __obj.updateDynamic("defaultPageTransition")(defaultPageTransition)
    if (getMaxScrollForTransition != null) __obj.updateDynamic("getMaxScrollForTransition")(getMaxScrollForTransition.asInstanceOf[js.Any])
    if (gradeA != null) __obj.updateDynamic("gradeA")(gradeA)
    if (!js.isUndefined(hashListeningEnabled)) __obj.updateDynamic("hashListeningEnabled")(hashListeningEnabled)
    if (!js.isUndefined(ignoreContentEnabled)) __obj.updateDynamic("ignoreContentEnabled")(ignoreContentEnabled)
    if (!js.isUndefined(linkBindingEnabled)) __obj.updateDynamic("linkBindingEnabled")(linkBindingEnabled)
    if (!js.isUndefined(loadingMessageTextVisible)) __obj.updateDynamic("loadingMessageTextVisible")(loadingMessageTextVisible)
    if (loadingMessageTheme != null) __obj.updateDynamic("loadingMessageTheme")(loadingMessageTheme)
    if (maxTransitionWidth != null) __obj.updateDynamic("maxTransitionWidth")(maxTransitionWidth.asInstanceOf[js.Any])
    if (minScrollBack != null) __obj.updateDynamic("minScrollBack")(minScrollBack.asInstanceOf[js.Any])
    if (ns != null) __obj.updateDynamic("ns")(ns.asInstanceOf[js.Any])
    if (pageLoadErrorMessage != null) __obj.updateDynamic("pageLoadErrorMessage")(pageLoadErrorMessage)
    if (pageLoadErrorMessageTheme != null) __obj.updateDynamic("pageLoadErrorMessageTheme")(pageLoadErrorMessageTheme)
    if (!js.isUndefined(phonegapNavigationEnabled)) __obj.updateDynamic("phonegapNavigationEnabled")(phonegapNavigationEnabled)
    if (!js.isUndefined(pushStateEnabled)) __obj.updateDynamic("pushStateEnabled")(pushStateEnabled)
    if (subPageUrlKey != null) __obj.updateDynamic("subPageUrlKey")(subPageUrlKey)
    if (!js.isUndefined(touchOverflowEnabled)) __obj.updateDynamic("touchOverflowEnabled")(touchOverflowEnabled)
    __obj.asInstanceOf[JQueryMobileOptions]
  }
}

