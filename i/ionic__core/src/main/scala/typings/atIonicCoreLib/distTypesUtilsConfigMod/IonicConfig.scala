package typings
package atIonicCoreLib.distTypesUtilsConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonicConfig extends js.Object {
  var _forceStatusbarPadding: js.UndefOr[scala.Boolean] = js.undefined
  var _testing: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Provides a custom enter animation for all `ion-action-sheet`, overriding the default "animation".
    */
  var actionSheetEnter: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.undefined
  /**
    * Provides a custom leave animation for all `ion-action-sheet`, overriding the default "animation".
    */
  var actionSheetLeave: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.undefined
  /**
    * Provides a custom enter animation for all `ion-alert`, overriding the default "animation".
    */
  var alertEnter: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.undefined
  /**
    * Provides a custom leave animation for all `ion-alert`, overriding the default "animation".
    */
  var alertLeave: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.undefined
  /**
    * When it's set to `false`, disables all animation and transition across the app.
    * Can be useful to make ionic smoother in slow devices, when animations can't run smoothly.
    */
  var animated: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Overrides the default icon in all `<ion-back-button>` components.
    */
  var backButtonIcon: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Overrides the default text in all `<ion-back-button>` components.
    */
  var backButtonText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Wherever ionic will respond to hardware go back buttons in an Android device.
    * Defaults to `true` when ionic runs in a mobile device.
    */
  var hardwareBackButton: js.UndefOr[scala.Boolean] = js.undefined
  var hideCaretOnScroll: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Overrides the default spinner type in all `<ion-infinite-scroll-content>` components.
    */
  var infiniteLoadingSpinner: js.UndefOr[
    (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SpinnerTypes */ js.Any) | scala.Null
  ] = js.undefined
  var inputBlurring: js.UndefOr[scala.Boolean] = js.undefined
  var inputShims: js.UndefOr[scala.Boolean] = js.undefined
  var keyboardHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * Provides a custom enter animation for all `ion-loading`, overriding the default "animation".
    */
  var loadingEnter: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.undefined
  /**
    * Provides a custom leave animation for all `ion-loading`, overriding the default "animation".
    */
  var loadingLeave: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.undefined
  /**
    * Overrides the default spinner for all `ion-loading` overlays, ie. the ones
    * created with `ion-loading-controller`.
    */
  var loadingSpinner: js.UndefOr[
    (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SpinnerTypes */ js.Any) | scala.Null
  ] = js.undefined
  /**
    * Overrides the default icon in all `<ion-menu-button>` components.
    */
  var menuIcon: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Overrides the default menu type for all `<ion-menu>` components.
    * By default the menu type is chosen based in the app's mode.
    */
  var menuType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Provides a custom enter animation for all `ion-modal`, overriding the default "animation".
    */
  var modalEnter: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.undefined
  /**
    * Provides a custom leave animation for all `ion-modal`, overriding the default "animation".
    */
  var modalLeave: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.undefined
  /**
    * The mode determines which platform styles to use for the whole application.
    */
  var mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any
  ] = js.undefined
  /**
    * Overrides the default "animation" of all `ion-nav` and `ion-router-outlet` across the whole application.
    * This prop allows to replace the default transition and provide a custom one that applies to all navigation outlets.
    */
  var navAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.undefined
  var persistConfig: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Provides a custom enter animation for all `ion-picker`, overriding the default "animation".
    */
  var pickerEnter: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.undefined
  /**
    * Provides a custom leave animation for all `ion-picker`, overriding the default "animation".
    */
  var pickerLeave: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.undefined
  /**
    * Provides a custom enter animation for all `ion-popover`, overriding the default "animation".
    */
  var popoverEnter: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.undefined
  /**
    * Provides a custom leave animation for all `ion-popover`, overriding the default "animation".
    */
  var popoverLeave: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.undefined
  /**
    * Overrides the default icon in all `<ion-refresh-content>` components.
    */
  var refreshingIcon: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Overrides the default spinner type in all `<ion-refresh-content>` components.
    */
  var refreshingSpinner: js.UndefOr[
    (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SpinnerTypes */ js.Any) | scala.Null
  ] = js.undefined
  /**
    * When it's set to `false`, it disables all material-design ripple-effects across the app.
    * Defaults to `true`.
    */
  var rippleEffect: js.UndefOr[scala.Boolean] = js.undefined
  var scrollAssist: js.UndefOr[scala.Boolean] = js.undefined
  var scrollPadding: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Overrides the default spinner in all `<ion-spinner>` components.
    * By default the spinner type is chosen based in the mode (ios or md).
    */
  var spinner: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SpinnerTypes */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SpinnerTypes */ js.Any
  ] = js.undefined
  /**
    * Whenever clicking the top status bar should cause the scroll to top in an application.
    * Defaults to `true` when ionic runs in a mobile device.
    */
  var statusTap: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Global switch that disables or enables "swipe-to-go-back" gesture across all
    * `ion-nav` in your application.
    */
  var swipeBackEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Overrides the default "layout" of all `ion-bar-button` across the whole application.
    */
  var tabButtonLayout: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TabButtonLayout */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TabButtonLayout */ js.Any
  ] = js.undefined
  /**
    * Provides a custom enter animation for all `ion-toast`, overriding the default "animation".
    */
  var toastEnter: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.undefined
  /**
    * Provides a custom leave animation for all `ion-toast`, overriding the default "animation".
    */
  var toastLeave: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.undefined
}

object IonicConfig {
  @scala.inline
  def apply(
    _forceStatusbarPadding: js.UndefOr[scala.Boolean] = js.undefined,
    _testing: js.UndefOr[scala.Boolean] = js.undefined,
    actionSheetEnter: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any = null,
    actionSheetLeave: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any = null,
    alertEnter: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any = null,
    alertLeave: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any = null,
    animated: js.UndefOr[scala.Boolean] = js.undefined,
    backButtonIcon: java.lang.String = null,
    backButtonText: java.lang.String = null,
    hardwareBackButton: js.UndefOr[scala.Boolean] = js.undefined,
    hideCaretOnScroll: js.UndefOr[scala.Boolean] = js.undefined,
    infiniteLoadingSpinner: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SpinnerTypes */ js.Any = null,
    inputBlurring: js.UndefOr[scala.Boolean] = js.undefined,
    inputShims: js.UndefOr[scala.Boolean] = js.undefined,
    keyboardHeight: scala.Int | scala.Double = null,
    loadingEnter: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any = null,
    loadingLeave: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any = null,
    loadingSpinner: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SpinnerTypes */ js.Any = null,
    menuIcon: java.lang.String = null,
    menuType: java.lang.String = null,
    modalEnter: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any = null,
    modalLeave: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any = null,
    mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any = null,
    navAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any = null,
    persistConfig: js.UndefOr[scala.Boolean] = js.undefined,
    pickerEnter: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any = null,
    pickerLeave: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any = null,
    popoverEnter: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any = null,
    popoverLeave: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any = null,
    refreshingIcon: java.lang.String = null,
    refreshingSpinner: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SpinnerTypes */ js.Any = null,
    rippleEffect: js.UndefOr[scala.Boolean] = js.undefined,
    scrollAssist: js.UndefOr[scala.Boolean] = js.undefined,
    scrollPadding: js.UndefOr[scala.Boolean] = js.undefined,
    spinner: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SpinnerTypes */ js.Any = null,
    statusTap: js.UndefOr[scala.Boolean] = js.undefined,
    swipeBackEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    tabButtonLayout: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TabButtonLayout */ js.Any = null,
    toastEnter: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any = null,
    toastLeave: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any = null
  ): IonicConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(_forceStatusbarPadding)) __obj.updateDynamic("_forceStatusbarPadding")(_forceStatusbarPadding)
    if (!js.isUndefined(_testing)) __obj.updateDynamic("_testing")(_testing)
    if (actionSheetEnter != null) __obj.updateDynamic("actionSheetEnter")(actionSheetEnter)
    if (actionSheetLeave != null) __obj.updateDynamic("actionSheetLeave")(actionSheetLeave)
    if (alertEnter != null) __obj.updateDynamic("alertEnter")(alertEnter)
    if (alertLeave != null) __obj.updateDynamic("alertLeave")(alertLeave)
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (backButtonIcon != null) __obj.updateDynamic("backButtonIcon")(backButtonIcon)
    if (backButtonText != null) __obj.updateDynamic("backButtonText")(backButtonText)
    if (!js.isUndefined(hardwareBackButton)) __obj.updateDynamic("hardwareBackButton")(hardwareBackButton)
    if (!js.isUndefined(hideCaretOnScroll)) __obj.updateDynamic("hideCaretOnScroll")(hideCaretOnScroll)
    if (infiniteLoadingSpinner != null) __obj.updateDynamic("infiniteLoadingSpinner")(infiniteLoadingSpinner)
    if (!js.isUndefined(inputBlurring)) __obj.updateDynamic("inputBlurring")(inputBlurring)
    if (!js.isUndefined(inputShims)) __obj.updateDynamic("inputShims")(inputShims)
    if (keyboardHeight != null) __obj.updateDynamic("keyboardHeight")(keyboardHeight.asInstanceOf[js.Any])
    if (loadingEnter != null) __obj.updateDynamic("loadingEnter")(loadingEnter)
    if (loadingLeave != null) __obj.updateDynamic("loadingLeave")(loadingLeave)
    if (loadingSpinner != null) __obj.updateDynamic("loadingSpinner")(loadingSpinner)
    if (menuIcon != null) __obj.updateDynamic("menuIcon")(menuIcon)
    if (menuType != null) __obj.updateDynamic("menuType")(menuType)
    if (modalEnter != null) __obj.updateDynamic("modalEnter")(modalEnter)
    if (modalLeave != null) __obj.updateDynamic("modalLeave")(modalLeave)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (navAnimation != null) __obj.updateDynamic("navAnimation")(navAnimation)
    if (!js.isUndefined(persistConfig)) __obj.updateDynamic("persistConfig")(persistConfig)
    if (pickerEnter != null) __obj.updateDynamic("pickerEnter")(pickerEnter)
    if (pickerLeave != null) __obj.updateDynamic("pickerLeave")(pickerLeave)
    if (popoverEnter != null) __obj.updateDynamic("popoverEnter")(popoverEnter)
    if (popoverLeave != null) __obj.updateDynamic("popoverLeave")(popoverLeave)
    if (refreshingIcon != null) __obj.updateDynamic("refreshingIcon")(refreshingIcon)
    if (refreshingSpinner != null) __obj.updateDynamic("refreshingSpinner")(refreshingSpinner)
    if (!js.isUndefined(rippleEffect)) __obj.updateDynamic("rippleEffect")(rippleEffect)
    if (!js.isUndefined(scrollAssist)) __obj.updateDynamic("scrollAssist")(scrollAssist)
    if (!js.isUndefined(scrollPadding)) __obj.updateDynamic("scrollPadding")(scrollPadding)
    if (spinner != null) __obj.updateDynamic("spinner")(spinner)
    if (!js.isUndefined(statusTap)) __obj.updateDynamic("statusTap")(statusTap)
    if (!js.isUndefined(swipeBackEnabled)) __obj.updateDynamic("swipeBackEnabled")(swipeBackEnabled)
    if (tabButtonLayout != null) __obj.updateDynamic("tabButtonLayout")(tabButtonLayout)
    if (toastEnter != null) __obj.updateDynamic("toastEnter")(toastEnter)
    if (toastLeave != null) __obj.updateDynamic("toastLeave")(toastLeave)
    __obj.asInstanceOf[IonicConfig]
  }
}

