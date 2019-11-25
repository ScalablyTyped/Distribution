package typings.atIonicCore.distTypesUtilsConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonicConfig extends js.Object {
  var _forceStatusbarPadding: js.UndefOr[Boolean] = js.undefined
  var _testing: js.UndefOr[Boolean] = js.undefined
  var _zoneGate: js.UndefOr[js.Function1[/* h */ js.Function0[_], _]] = js.undefined
  /**
    * Provides a custom enter animation for all `ion-action-sheet`, overriding the default "animation".
    */
  var actionSheetEnter: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.undefined
  /**
    * Provides a custom leave animation for all `ion-action-sheet`, overriding the default "animation".
    */
  var actionSheetLeave: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.undefined
  /**
    * Provides a custom enter animation for all `ion-alert`, overriding the default "animation".
    */
  var alertEnter: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.undefined
  /**
    * Provides a custom leave animation for all `ion-alert`, overriding the default "animation".
    */
  var alertLeave: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.undefined
  /**
    * When it's set to `false`, disables all animation and transition across the app.
    * Can be useful to make ionic smoother in slow devices, when animations can't run smoothly.
    */
  var animated: js.UndefOr[Boolean] = js.undefined
  /**
    * Overrides the default icon in all `<ion-back-button>` components.
    */
  var backButtonIcon: js.UndefOr[String] = js.undefined
  /**
    * Overrides the default text in all `<ion-back-button>` components.
    */
  var backButtonText: js.UndefOr[String] = js.undefined
  /**
    * EXPERIMENTAL: Adds a page shadow to transitioning pages on iOS. Disabled by default.
    */
  var experimentalTransitionShadow: js.UndefOr[Boolean] = js.undefined
  /**
    * Wherever ionic will respond to hardware go back buttons in an Android device.
    * Defaults to `true` when ionic runs in a mobile device.
    */
  var hardwareBackButton: js.UndefOr[Boolean] = js.undefined
  var hideCaretOnScroll: js.UndefOr[Boolean] = js.undefined
  /**
    * Overrides the default spinner type in all `<ion-infinite-scroll-content>` components.
    */
  var infiniteLoadingSpinner: js.UndefOr[
    (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SpinnerTypes */ js.Any) | Null
  ] = js.undefined
  var inputBlurring: js.UndefOr[Boolean] = js.undefined
  var inputShims: js.UndefOr[Boolean] = js.undefined
  var keyboardHeight: js.UndefOr[Double] = js.undefined
  /**
    * Provides a custom enter animation for all `ion-loading`, overriding the default "animation".
    */
  var loadingEnter: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.undefined
  /**
    * Provides a custom leave animation for all `ion-loading`, overriding the default "animation".
    */
  var loadingLeave: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.undefined
  /**
    * Overrides the default spinner for all `ion-loading` overlays, ie. the ones
    * created with `ion-loading-controller`.
    */
  var loadingSpinner: js.UndefOr[
    (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SpinnerTypes */ js.Any) | Null
  ] = js.undefined
  /**
    * Overrides the default icon in all `<ion-menu-button>` components.
    */
  var menuIcon: js.UndefOr[String] = js.undefined
  /**
    * Overrides the default menu type for all `<ion-menu>` components.
    * By default the menu type is chosen based in the app's mode.
    */
  var menuType: js.UndefOr[String] = js.undefined
  /**
    * Provides a custom enter animation for all `ion-modal`, overriding the default "animation".
    */
  var modalEnter: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.undefined
  /**
    * Provides a custom leave animation for all `ion-modal`, overriding the default "animation".
    */
  var modalLeave: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.undefined
  /**
    * The mode determines which platform styles to use for the whole application.
    */
  var mode: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any
  ] = js.undefined
  /**
    * Overrides the default "animation" of all `ion-nav` and `ion-router-outlet` across the whole application.
    * This prop allows to replace the default transition and provide a custom one that applies to all navigation outlets.
    */
  var navAnimation: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.undefined
  var persistConfig: js.UndefOr[Boolean] = js.undefined
  /**
    * Provides a custom enter animation for all `ion-picker`, overriding the default "animation".
    */
  var pickerEnter: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.undefined
  /**
    * Provides a custom leave animation for all `ion-picker`, overriding the default "animation".
    */
  var pickerLeave: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.undefined
  /**
    * Provides a custom enter animation for all `ion-popover`, overriding the default "animation".
    */
  var popoverEnter: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.undefined
  /**
    * Provides a custom leave animation for all `ion-popover`, overriding the default "animation".
    */
  var popoverLeave: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.undefined
  /**
    * Overrides the default icon in all `<ion-refresh-content>` components.
    */
  var refreshingIcon: js.UndefOr[String] = js.undefined
  /**
    * Overrides the default spinner type in all `<ion-refresh-content>` components.
    */
  var refreshingSpinner: js.UndefOr[
    (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SpinnerTypes */ js.Any) | Null
  ] = js.undefined
  /**
    * When it's set to `false`, it disables all material-design ripple-effects across the app.
    * Defaults to `true`.
    */
  var rippleEffect: js.UndefOr[Boolean] = js.undefined
  var scrollAssist: js.UndefOr[Boolean] = js.undefined
  var scrollPadding: js.UndefOr[Boolean] = js.undefined
  /**
    * Overrides the default spinner in all `<ion-spinner>` components.
    * By default the spinner type is chosen based in the mode (ios or md).
    */
  var spinner: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SpinnerTypes */ js.Any
  ] = js.undefined
  /**
    * Whenever clicking the top status bar should cause the scroll to top in an application.
    * Defaults to `true` when ionic runs in a mobile device.
    */
  var statusTap: js.UndefOr[Boolean] = js.undefined
  /**
    * Global switch that disables or enables "swipe-to-go-back" gesture across all
    * `ion-nav` in your application.
    */
  var swipeBackEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Overrides the default "layout" of all `ion-bar-button` across the whole application.
    */
  var tabButtonLayout: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TabButtonLayout */ js.Any
  ] = js.undefined
  /**
    * Provides a custom enter animation for all `ion-toast`, overriding the default "animation".
    */
  var toastEnter: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.undefined
  /**
    * Provides a custom leave animation for all `ion-toast`, overriding the default "animation".
    */
  var toastLeave: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.undefined
}

object IonicConfig {
  @scala.inline
  def apply(
    _forceStatusbarPadding: js.UndefOr[Boolean] = js.undefined,
    _testing: js.UndefOr[Boolean] = js.undefined,
    _zoneGate: /* h */ js.Function0[_] => _ = null,
    actionSheetEnter: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any = null,
    actionSheetLeave: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any = null,
    alertEnter: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any = null,
    alertLeave: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any = null,
    animated: js.UndefOr[Boolean] = js.undefined,
    backButtonIcon: String = null,
    backButtonText: String = null,
    experimentalTransitionShadow: js.UndefOr[Boolean] = js.undefined,
    hardwareBackButton: js.UndefOr[Boolean] = js.undefined,
    hideCaretOnScroll: js.UndefOr[Boolean] = js.undefined,
    infiniteLoadingSpinner: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SpinnerTypes */ js.Any = null,
    inputBlurring: js.UndefOr[Boolean] = js.undefined,
    inputShims: js.UndefOr[Boolean] = js.undefined,
    keyboardHeight: Int | Double = null,
    loadingEnter: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any = null,
    loadingLeave: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any = null,
    loadingSpinner: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SpinnerTypes */ js.Any = null,
    menuIcon: String = null,
    menuType: String = null,
    modalEnter: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any = null,
    modalLeave: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any = null,
    mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any = null,
    navAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any = null,
    persistConfig: js.UndefOr[Boolean] = js.undefined,
    pickerEnter: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any = null,
    pickerLeave: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any = null,
    popoverEnter: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any = null,
    popoverLeave: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any = null,
    refreshingIcon: String = null,
    refreshingSpinner: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SpinnerTypes */ js.Any = null,
    rippleEffect: js.UndefOr[Boolean] = js.undefined,
    scrollAssist: js.UndefOr[Boolean] = js.undefined,
    scrollPadding: js.UndefOr[Boolean] = js.undefined,
    spinner: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SpinnerTypes */ js.Any = null,
    statusTap: js.UndefOr[Boolean] = js.undefined,
    swipeBackEnabled: js.UndefOr[Boolean] = js.undefined,
    tabButtonLayout: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TabButtonLayout */ js.Any = null,
    toastEnter: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any = null,
    toastLeave: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any = null
  ): IonicConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(_forceStatusbarPadding)) __obj.updateDynamic("_forceStatusbarPadding")(_forceStatusbarPadding.asInstanceOf[js.Any])
    if (!js.isUndefined(_testing)) __obj.updateDynamic("_testing")(_testing.asInstanceOf[js.Any])
    if (_zoneGate != null) __obj.updateDynamic("_zoneGate")(js.Any.fromFunction1(_zoneGate))
    if (actionSheetEnter != null) __obj.updateDynamic("actionSheetEnter")(actionSheetEnter.asInstanceOf[js.Any])
    if (actionSheetLeave != null) __obj.updateDynamic("actionSheetLeave")(actionSheetLeave.asInstanceOf[js.Any])
    if (alertEnter != null) __obj.updateDynamic("alertEnter")(alertEnter.asInstanceOf[js.Any])
    if (alertLeave != null) __obj.updateDynamic("alertLeave")(alertLeave.asInstanceOf[js.Any])
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (backButtonIcon != null) __obj.updateDynamic("backButtonIcon")(backButtonIcon.asInstanceOf[js.Any])
    if (backButtonText != null) __obj.updateDynamic("backButtonText")(backButtonText.asInstanceOf[js.Any])
    if (!js.isUndefined(experimentalTransitionShadow)) __obj.updateDynamic("experimentalTransitionShadow")(experimentalTransitionShadow.asInstanceOf[js.Any])
    if (!js.isUndefined(hardwareBackButton)) __obj.updateDynamic("hardwareBackButton")(hardwareBackButton.asInstanceOf[js.Any])
    if (!js.isUndefined(hideCaretOnScroll)) __obj.updateDynamic("hideCaretOnScroll")(hideCaretOnScroll.asInstanceOf[js.Any])
    if (infiniteLoadingSpinner != null) __obj.updateDynamic("infiniteLoadingSpinner")(infiniteLoadingSpinner.asInstanceOf[js.Any])
    if (!js.isUndefined(inputBlurring)) __obj.updateDynamic("inputBlurring")(inputBlurring.asInstanceOf[js.Any])
    if (!js.isUndefined(inputShims)) __obj.updateDynamic("inputShims")(inputShims.asInstanceOf[js.Any])
    if (keyboardHeight != null) __obj.updateDynamic("keyboardHeight")(keyboardHeight.asInstanceOf[js.Any])
    if (loadingEnter != null) __obj.updateDynamic("loadingEnter")(loadingEnter.asInstanceOf[js.Any])
    if (loadingLeave != null) __obj.updateDynamic("loadingLeave")(loadingLeave.asInstanceOf[js.Any])
    if (loadingSpinner != null) __obj.updateDynamic("loadingSpinner")(loadingSpinner.asInstanceOf[js.Any])
    if (menuIcon != null) __obj.updateDynamic("menuIcon")(menuIcon.asInstanceOf[js.Any])
    if (menuType != null) __obj.updateDynamic("menuType")(menuType.asInstanceOf[js.Any])
    if (modalEnter != null) __obj.updateDynamic("modalEnter")(modalEnter.asInstanceOf[js.Any])
    if (modalLeave != null) __obj.updateDynamic("modalLeave")(modalLeave.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (navAnimation != null) __obj.updateDynamic("navAnimation")(navAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(persistConfig)) __obj.updateDynamic("persistConfig")(persistConfig.asInstanceOf[js.Any])
    if (pickerEnter != null) __obj.updateDynamic("pickerEnter")(pickerEnter.asInstanceOf[js.Any])
    if (pickerLeave != null) __obj.updateDynamic("pickerLeave")(pickerLeave.asInstanceOf[js.Any])
    if (popoverEnter != null) __obj.updateDynamic("popoverEnter")(popoverEnter.asInstanceOf[js.Any])
    if (popoverLeave != null) __obj.updateDynamic("popoverLeave")(popoverLeave.asInstanceOf[js.Any])
    if (refreshingIcon != null) __obj.updateDynamic("refreshingIcon")(refreshingIcon.asInstanceOf[js.Any])
    if (refreshingSpinner != null) __obj.updateDynamic("refreshingSpinner")(refreshingSpinner.asInstanceOf[js.Any])
    if (!js.isUndefined(rippleEffect)) __obj.updateDynamic("rippleEffect")(rippleEffect.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollAssist)) __obj.updateDynamic("scrollAssist")(scrollAssist.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollPadding)) __obj.updateDynamic("scrollPadding")(scrollPadding.asInstanceOf[js.Any])
    if (spinner != null) __obj.updateDynamic("spinner")(spinner.asInstanceOf[js.Any])
    if (!js.isUndefined(statusTap)) __obj.updateDynamic("statusTap")(statusTap.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeBackEnabled)) __obj.updateDynamic("swipeBackEnabled")(swipeBackEnabled.asInstanceOf[js.Any])
    if (tabButtonLayout != null) __obj.updateDynamic("tabButtonLayout")(tabButtonLayout.asInstanceOf[js.Any])
    if (toastEnter != null) __obj.updateDynamic("toastEnter")(toastEnter.asInstanceOf[js.Any])
    if (toastLeave != null) __obj.updateDynamic("toastLeave")(toastLeave.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonicConfig]
  }
}

