package typings.ionicCore.utilsConfigMod

import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.mod.Mode
import typings.ionicCore.spinnerConfigsMod.SpinnerTypes
import typings.ionicCore.tabBarInterfaceMod.TabButtonLayout
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
  var actionSheetEnter: js.UndefOr[AnimationBuilder] = js.undefined
  /**
    * Provides a custom leave animation for all `ion-action-sheet`, overriding the default "animation".
    */
  var actionSheetLeave: js.UndefOr[AnimationBuilder] = js.undefined
  /**
    * Provides a custom enter animation for all `ion-alert`, overriding the default "animation".
    */
  var alertEnter: js.UndefOr[AnimationBuilder] = js.undefined
  /**
    * Provides a custom leave animation for all `ion-alert`, overriding the default "animation".
    */
  var alertLeave: js.UndefOr[AnimationBuilder] = js.undefined
  /**
    * When it's set to `false`, disables all animation and transition across the app.
    * Can be useful to make ionic smoother in slow devices, when animations can't run smoothly.
    */
  var animated: js.UndefOr[Boolean] = js.undefined
  /**
    * Overrides the default defaultHref in all `<ion-back-button>` components.
    */
  var backButtonDefaultHref: js.UndefOr[String] = js.undefined
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
  var infiniteLoadingSpinner: js.UndefOr[SpinnerTypes | Null] = js.undefined
  var inputBlurring: js.UndefOr[Boolean] = js.undefined
  var inputShims: js.UndefOr[Boolean] = js.undefined
  var keyboardHeight: js.UndefOr[Double] = js.undefined
  /**
    * Provides a custom enter animation for all `ion-loading`, overriding the default "animation".
    */
  var loadingEnter: js.UndefOr[AnimationBuilder] = js.undefined
  /**
    * Provides a custom leave animation for all `ion-loading`, overriding the default "animation".
    */
  var loadingLeave: js.UndefOr[AnimationBuilder] = js.undefined
  /**
    * Overrides the default spinner for all `ion-loading` overlays, ie. the ones
    * created with `ion-loading-controller`.
    */
  var loadingSpinner: js.UndefOr[SpinnerTypes | Null] = js.undefined
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
  var modalEnter: js.UndefOr[AnimationBuilder] = js.undefined
  /**
    * Provides a custom leave animation for all `ion-modal`, overriding the default "animation".
    */
  var modalLeave: js.UndefOr[AnimationBuilder] = js.undefined
  /**
    * The mode determines which platform styles to use for the whole application.
    */
  var mode: js.UndefOr[Mode] = js.undefined
  /**
    * Overrides the default "animation" of all `ion-nav` and `ion-router-outlet` across the whole application.
    * This prop allows to replace the default transition and provide a custom one that applies to all navigation outlets.
    */
  var navAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  var persistConfig: js.UndefOr[Boolean] = js.undefined
  /**
    * Provides a custom enter animation for all `ion-picker`, overriding the default "animation".
    */
  var pickerEnter: js.UndefOr[AnimationBuilder] = js.undefined
  /**
    * Provides a custom leave animation for all `ion-picker`, overriding the default "animation".
    */
  var pickerLeave: js.UndefOr[AnimationBuilder] = js.undefined
  /**
    * Provides a custom enter animation for all `ion-popover`, overriding the default "animation".
    */
  var popoverEnter: js.UndefOr[AnimationBuilder] = js.undefined
  /**
    * Provides a custom leave animation for all `ion-popover`, overriding the default "animation".
    */
  var popoverLeave: js.UndefOr[AnimationBuilder] = js.undefined
  /**
    * Overrides the default icon in all `<ion-refresh-content>` components.
    */
  var refreshingIcon: js.UndefOr[String] = js.undefined
  /**
    * Overrides the default spinner type in all `<ion-refresh-content>` components.
    */
  var refreshingSpinner: js.UndefOr[SpinnerTypes | Null] = js.undefined
  /**
    * When it's set to `false`, it disables all material-design ripple-effects across the app.
    * Defaults to `true`.
    */
  var rippleEffect: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true`, Ionic will enable a basic DOM sanitizer on component properties that accept custom HTML.
    */
  var sanitizerEnabled: js.UndefOr[Boolean] = js.undefined
  var scrollAssist: js.UndefOr[Boolean] = js.undefined
  var scrollPadding: js.UndefOr[Boolean] = js.undefined
  /**
    * Overrides the default spinner in all `<ion-spinner>` components.
    * By default the spinner type is chosen based in the mode (ios or md).
    */
  var spinner: js.UndefOr[SpinnerTypes] = js.undefined
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
  var tabButtonLayout: js.UndefOr[TabButtonLayout] = js.undefined
  /**
    * Provides a custom enter animation for all `ion-toast`, overriding the default "animation".
    */
  var toastEnter: js.UndefOr[AnimationBuilder] = js.undefined
  /**
    * Provides a custom leave animation for all `ion-toast`, overriding the default "animation".
    */
  var toastLeave: js.UndefOr[AnimationBuilder] = js.undefined
}

object IonicConfig {
  @scala.inline
  def apply(
    _forceStatusbarPadding: js.UndefOr[Boolean] = js.undefined,
    _testing: js.UndefOr[Boolean] = js.undefined,
    _zoneGate: /* h */ js.Function0[_] => _ = null,
    actionSheetEnter: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation = null,
    actionSheetLeave: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation = null,
    alertEnter: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation = null,
    alertLeave: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation = null,
    animated: js.UndefOr[Boolean] = js.undefined,
    backButtonDefaultHref: String = null,
    backButtonIcon: String = null,
    backButtonText: String = null,
    experimentalTransitionShadow: js.UndefOr[Boolean] = js.undefined,
    hardwareBackButton: js.UndefOr[Boolean] = js.undefined,
    hideCaretOnScroll: js.UndefOr[Boolean] = js.undefined,
    infiniteLoadingSpinner: js.UndefOr[Null | SpinnerTypes] = js.undefined,
    inputBlurring: js.UndefOr[Boolean] = js.undefined,
    inputShims: js.UndefOr[Boolean] = js.undefined,
    keyboardHeight: js.UndefOr[Double] = js.undefined,
    loadingEnter: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation = null,
    loadingLeave: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation = null,
    loadingSpinner: js.UndefOr[Null | SpinnerTypes] = js.undefined,
    menuIcon: String = null,
    menuType: String = null,
    modalEnter: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation = null,
    modalLeave: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation = null,
    mode: Mode = null,
    navAnimation: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation = null,
    persistConfig: js.UndefOr[Boolean] = js.undefined,
    pickerEnter: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation = null,
    pickerLeave: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation = null,
    popoverEnter: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation = null,
    popoverLeave: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation = null,
    refreshingIcon: String = null,
    refreshingSpinner: js.UndefOr[Null | SpinnerTypes] = js.undefined,
    rippleEffect: js.UndefOr[Boolean] = js.undefined,
    sanitizerEnabled: js.UndefOr[Boolean] = js.undefined,
    scrollAssist: js.UndefOr[Boolean] = js.undefined,
    scrollPadding: js.UndefOr[Boolean] = js.undefined,
    spinner: SpinnerTypes = null,
    statusTap: js.UndefOr[Boolean] = js.undefined,
    swipeBackEnabled: js.UndefOr[Boolean] = js.undefined,
    tabButtonLayout: TabButtonLayout = null,
    toastEnter: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation = null,
    toastLeave: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation = null
  ): IonicConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(_forceStatusbarPadding)) __obj.updateDynamic("_forceStatusbarPadding")(_forceStatusbarPadding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(_testing)) __obj.updateDynamic("_testing")(_testing.get.asInstanceOf[js.Any])
    if (_zoneGate != null) __obj.updateDynamic("_zoneGate")(js.Any.fromFunction1(_zoneGate))
    if (actionSheetEnter != null) __obj.updateDynamic("actionSheetEnter")(js.Any.fromFunction2(actionSheetEnter))
    if (actionSheetLeave != null) __obj.updateDynamic("actionSheetLeave")(js.Any.fromFunction2(actionSheetLeave))
    if (alertEnter != null) __obj.updateDynamic("alertEnter")(js.Any.fromFunction2(alertEnter))
    if (alertLeave != null) __obj.updateDynamic("alertLeave")(js.Any.fromFunction2(alertLeave))
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.get.asInstanceOf[js.Any])
    if (backButtonDefaultHref != null) __obj.updateDynamic("backButtonDefaultHref")(backButtonDefaultHref.asInstanceOf[js.Any])
    if (backButtonIcon != null) __obj.updateDynamic("backButtonIcon")(backButtonIcon.asInstanceOf[js.Any])
    if (backButtonText != null) __obj.updateDynamic("backButtonText")(backButtonText.asInstanceOf[js.Any])
    if (!js.isUndefined(experimentalTransitionShadow)) __obj.updateDynamic("experimentalTransitionShadow")(experimentalTransitionShadow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hardwareBackButton)) __obj.updateDynamic("hardwareBackButton")(hardwareBackButton.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideCaretOnScroll)) __obj.updateDynamic("hideCaretOnScroll")(hideCaretOnScroll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(infiniteLoadingSpinner)) __obj.updateDynamic("infiniteLoadingSpinner")(infiniteLoadingSpinner.asInstanceOf[js.Any])
    if (!js.isUndefined(inputBlurring)) __obj.updateDynamic("inputBlurring")(inputBlurring.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inputShims)) __obj.updateDynamic("inputShims")(inputShims.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardHeight)) __obj.updateDynamic("keyboardHeight")(keyboardHeight.get.asInstanceOf[js.Any])
    if (loadingEnter != null) __obj.updateDynamic("loadingEnter")(js.Any.fromFunction2(loadingEnter))
    if (loadingLeave != null) __obj.updateDynamic("loadingLeave")(js.Any.fromFunction2(loadingLeave))
    if (!js.isUndefined(loadingSpinner)) __obj.updateDynamic("loadingSpinner")(loadingSpinner.asInstanceOf[js.Any])
    if (menuIcon != null) __obj.updateDynamic("menuIcon")(menuIcon.asInstanceOf[js.Any])
    if (menuType != null) __obj.updateDynamic("menuType")(menuType.asInstanceOf[js.Any])
    if (modalEnter != null) __obj.updateDynamic("modalEnter")(js.Any.fromFunction2(modalEnter))
    if (modalLeave != null) __obj.updateDynamic("modalLeave")(js.Any.fromFunction2(modalLeave))
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (navAnimation != null) __obj.updateDynamic("navAnimation")(js.Any.fromFunction2(navAnimation))
    if (!js.isUndefined(persistConfig)) __obj.updateDynamic("persistConfig")(persistConfig.get.asInstanceOf[js.Any])
    if (pickerEnter != null) __obj.updateDynamic("pickerEnter")(js.Any.fromFunction2(pickerEnter))
    if (pickerLeave != null) __obj.updateDynamic("pickerLeave")(js.Any.fromFunction2(pickerLeave))
    if (popoverEnter != null) __obj.updateDynamic("popoverEnter")(js.Any.fromFunction2(popoverEnter))
    if (popoverLeave != null) __obj.updateDynamic("popoverLeave")(js.Any.fromFunction2(popoverLeave))
    if (refreshingIcon != null) __obj.updateDynamic("refreshingIcon")(refreshingIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(refreshingSpinner)) __obj.updateDynamic("refreshingSpinner")(refreshingSpinner.asInstanceOf[js.Any])
    if (!js.isUndefined(rippleEffect)) __obj.updateDynamic("rippleEffect")(rippleEffect.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sanitizerEnabled)) __obj.updateDynamic("sanitizerEnabled")(sanitizerEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollAssist)) __obj.updateDynamic("scrollAssist")(scrollAssist.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollPadding)) __obj.updateDynamic("scrollPadding")(scrollPadding.get.asInstanceOf[js.Any])
    if (spinner != null) __obj.updateDynamic("spinner")(spinner.asInstanceOf[js.Any])
    if (!js.isUndefined(statusTap)) __obj.updateDynamic("statusTap")(statusTap.get.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeBackEnabled)) __obj.updateDynamic("swipeBackEnabled")(swipeBackEnabled.get.asInstanceOf[js.Any])
    if (tabButtonLayout != null) __obj.updateDynamic("tabButtonLayout")(tabButtonLayout.asInstanceOf[js.Any])
    if (toastEnter != null) __obj.updateDynamic("toastEnter")(js.Any.fromFunction2(toastEnter))
    if (toastLeave != null) __obj.updateDynamic("toastLeave")(js.Any.fromFunction2(toastLeave))
    __obj.asInstanceOf[IonicConfig]
  }
}

