package typings.ionicCore.utilsConfigMod

import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.mod.Mode
import typings.ionicCore.spinnerConfigsMod.SpinnerTypes
import typings.ionicCore.tabBarInterfaceMod.TabButtonLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonicConfig extends js.Object {
  var _forceStatusbarPadding: js.UndefOr[Boolean] = js.native
  var _testing: js.UndefOr[Boolean] = js.native
  var _zoneGate: js.UndefOr[js.Function1[/* h */ js.Function0[_], _]] = js.native
  /**
    * Provides a custom enter animation for all `ion-action-sheet`, overriding the default "animation".
    */
  var actionSheetEnter: js.UndefOr[AnimationBuilder] = js.native
  /**
    * Provides a custom leave animation for all `ion-action-sheet`, overriding the default "animation".
    */
  var actionSheetLeave: js.UndefOr[AnimationBuilder] = js.native
  /**
    * Provides a custom enter animation for all `ion-alert`, overriding the default "animation".
    */
  var alertEnter: js.UndefOr[AnimationBuilder] = js.native
  /**
    * Provides a custom leave animation for all `ion-alert`, overriding the default "animation".
    */
  var alertLeave: js.UndefOr[AnimationBuilder] = js.native
  /**
    * When it's set to `false`, disables all animation and transition across the app.
    * Can be useful to make ionic smoother in slow devices, when animations can't run smoothly.
    */
  var animated: js.UndefOr[Boolean] = js.native
  /**
    * Overrides the default defaultHref in all `<ion-back-button>` components.
    */
  var backButtonDefaultHref: js.UndefOr[String] = js.native
  /**
    * Overrides the default icon in all `<ion-back-button>` components.
    */
  var backButtonIcon: js.UndefOr[String] = js.native
  /**
    * Overrides the default text in all `<ion-back-button>` components.
    */
  var backButtonText: js.UndefOr[String] = js.native
  /**
    * EXPERIMENTAL: Adds a page shadow to transitioning pages on iOS. Disabled by default.
    */
  var experimentalTransitionShadow: js.UndefOr[Boolean] = js.native
  /**
    * Wherever ionic will respond to hardware go back buttons in an Android device.
    * Defaults to `true` when ionic runs in a mobile device.
    */
  var hardwareBackButton: js.UndefOr[Boolean] = js.native
  var hideCaretOnScroll: js.UndefOr[Boolean] = js.native
  /**
    * Overrides the default spinner type in all `<ion-infinite-scroll-content>` components.
    */
  var infiniteLoadingSpinner: js.UndefOr[SpinnerTypes | Null] = js.native
  var inputBlurring: js.UndefOr[Boolean] = js.native
  var inputShims: js.UndefOr[Boolean] = js.native
  var keyboardHeight: js.UndefOr[Double] = js.native
  /**
    * Provides a custom enter animation for all `ion-loading`, overriding the default "animation".
    */
  var loadingEnter: js.UndefOr[AnimationBuilder] = js.native
  /**
    * Provides a custom leave animation for all `ion-loading`, overriding the default "animation".
    */
  var loadingLeave: js.UndefOr[AnimationBuilder] = js.native
  /**
    * Overrides the default spinner for all `ion-loading` overlays, ie. the ones
    * created with `ion-loading-controller`.
    */
  var loadingSpinner: js.UndefOr[SpinnerTypes | Null] = js.native
  /**
    * Overrides the default icon in all `<ion-menu-button>` components.
    */
  var menuIcon: js.UndefOr[String] = js.native
  /**
    * Overrides the default menu type for all `<ion-menu>` components.
    * By default the menu type is chosen based in the app's mode.
    */
  var menuType: js.UndefOr[String] = js.native
  /**
    * Provides a custom enter animation for all `ion-modal`, overriding the default "animation".
    */
  var modalEnter: js.UndefOr[AnimationBuilder] = js.native
  /**
    * Provides a custom leave animation for all `ion-modal`, overriding the default "animation".
    */
  var modalLeave: js.UndefOr[AnimationBuilder] = js.native
  /**
    * The mode determines which platform styles to use for the whole application.
    */
  var mode: js.UndefOr[Mode] = js.native
  /**
    * Overrides the default "animation" of all `ion-nav` and `ion-router-outlet` across the whole application.
    * This prop allows to replace the default transition and provide a custom one that applies to all navigation outlets.
    */
  var navAnimation: js.UndefOr[AnimationBuilder] = js.native
  var persistConfig: js.UndefOr[Boolean] = js.native
  /**
    * Provides a custom enter animation for all `ion-picker`, overriding the default "animation".
    */
  var pickerEnter: js.UndefOr[AnimationBuilder] = js.native
  /**
    * Provides a custom leave animation for all `ion-picker`, overriding the default "animation".
    */
  var pickerLeave: js.UndefOr[AnimationBuilder] = js.native
  /**
    * Provides a custom enter animation for all `ion-popover`, overriding the default "animation".
    */
  var popoverEnter: js.UndefOr[AnimationBuilder] = js.native
  /**
    * Provides a custom leave animation for all `ion-popover`, overriding the default "animation".
    */
  var popoverLeave: js.UndefOr[AnimationBuilder] = js.native
  /**
    * Overrides the default icon in all `<ion-refresh-content>` components.
    */
  var refreshingIcon: js.UndefOr[String] = js.native
  /**
    * Overrides the default spinner type in all `<ion-refresh-content>` components.
    */
  var refreshingSpinner: js.UndefOr[SpinnerTypes | Null] = js.native
  /**
    * When it's set to `false`, it disables all material-design ripple-effects across the app.
    * Defaults to `true`.
    */
  var rippleEffect: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, Ionic will enable a basic DOM sanitizer on component properties that accept custom HTML.
    */
  var sanitizerEnabled: js.UndefOr[Boolean] = js.native
  var scrollAssist: js.UndefOr[Boolean] = js.native
  var scrollPadding: js.UndefOr[Boolean] = js.native
  /**
    * Overrides the default spinner in all `<ion-spinner>` components.
    * By default the spinner type is chosen based in the mode (ios or md).
    */
  var spinner: js.UndefOr[SpinnerTypes] = js.native
  /**
    * Whenever clicking the top status bar should cause the scroll to top in an application.
    * Defaults to `true` when ionic runs in a mobile device.
    */
  var statusTap: js.UndefOr[Boolean] = js.native
  /**
    * Global switch that disables or enables "swipe-to-go-back" gesture across all
    * `ion-nav` in your application.
    */
  var swipeBackEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Overrides the default "layout" of all `ion-bar-button` across the whole application.
    */
  var tabButtonLayout: js.UndefOr[TabButtonLayout] = js.native
  /**
    * Provides a custom enter animation for all `ion-toast`, overriding the default "animation".
    */
  var toastEnter: js.UndefOr[AnimationBuilder] = js.native
  /**
    * Provides a custom leave animation for all `ion-toast`, overriding the default "animation".
    */
  var toastLeave: js.UndefOr[AnimationBuilder] = js.native
}

object IonicConfig {
  @scala.inline
  def apply(): IonicConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonicConfig]
  }
  @scala.inline
  implicit class IonicConfigOps[Self <: IonicConfig] (val x: Self) extends AnyVal {
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
    def set_forceStatusbarPadding(value: Boolean): Self = this.set("_forceStatusbarPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_forceStatusbarPadding: Self = this.set("_forceStatusbarPadding", js.undefined)
    @scala.inline
    def set_testing(value: Boolean): Self = this.set("_testing", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_testing: Self = this.set("_testing", js.undefined)
    @scala.inline
    def set_zoneGate(value: /* h */ js.Function0[_] => _): Self = this.set("_zoneGate", js.Any.fromFunction1(value))
    @scala.inline
    def delete_zoneGate: Self = this.set("_zoneGate", js.undefined)
    @scala.inline
    def setActionSheetEnter(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = this.set("actionSheetEnter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteActionSheetEnter: Self = this.set("actionSheetEnter", js.undefined)
    @scala.inline
    def setActionSheetLeave(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = this.set("actionSheetLeave", js.Any.fromFunction2(value))
    @scala.inline
    def deleteActionSheetLeave: Self = this.set("actionSheetLeave", js.undefined)
    @scala.inline
    def setAlertEnter(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = this.set("alertEnter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAlertEnter: Self = this.set("alertEnter", js.undefined)
    @scala.inline
    def setAlertLeave(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = this.set("alertLeave", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAlertLeave: Self = this.set("alertLeave", js.undefined)
    @scala.inline
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimated: Self = this.set("animated", js.undefined)
    @scala.inline
    def setBackButtonDefaultHref(value: String): Self = this.set("backButtonDefaultHref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackButtonDefaultHref: Self = this.set("backButtonDefaultHref", js.undefined)
    @scala.inline
    def setBackButtonIcon(value: String): Self = this.set("backButtonIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackButtonIcon: Self = this.set("backButtonIcon", js.undefined)
    @scala.inline
    def setBackButtonText(value: String): Self = this.set("backButtonText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackButtonText: Self = this.set("backButtonText", js.undefined)
    @scala.inline
    def setExperimentalTransitionShadow(value: Boolean): Self = this.set("experimentalTransitionShadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExperimentalTransitionShadow: Self = this.set("experimentalTransitionShadow", js.undefined)
    @scala.inline
    def setHardwareBackButton(value: Boolean): Self = this.set("hardwareBackButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHardwareBackButton: Self = this.set("hardwareBackButton", js.undefined)
    @scala.inline
    def setHideCaretOnScroll(value: Boolean): Self = this.set("hideCaretOnScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideCaretOnScroll: Self = this.set("hideCaretOnScroll", js.undefined)
    @scala.inline
    def setInfiniteLoadingSpinner(value: SpinnerTypes): Self = this.set("infiniteLoadingSpinner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfiniteLoadingSpinner: Self = this.set("infiniteLoadingSpinner", js.undefined)
    @scala.inline
    def setInfiniteLoadingSpinnerNull: Self = this.set("infiniteLoadingSpinner", null)
    @scala.inline
    def setInputBlurring(value: Boolean): Self = this.set("inputBlurring", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputBlurring: Self = this.set("inputBlurring", js.undefined)
    @scala.inline
    def setInputShims(value: Boolean): Self = this.set("inputShims", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputShims: Self = this.set("inputShims", js.undefined)
    @scala.inline
    def setKeyboardHeight(value: Double): Self = this.set("keyboardHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboardHeight: Self = this.set("keyboardHeight", js.undefined)
    @scala.inline
    def setLoadingEnter(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = this.set("loadingEnter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteLoadingEnter: Self = this.set("loadingEnter", js.undefined)
    @scala.inline
    def setLoadingLeave(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = this.set("loadingLeave", js.Any.fromFunction2(value))
    @scala.inline
    def deleteLoadingLeave: Self = this.set("loadingLeave", js.undefined)
    @scala.inline
    def setLoadingSpinner(value: SpinnerTypes): Self = this.set("loadingSpinner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadingSpinner: Self = this.set("loadingSpinner", js.undefined)
    @scala.inline
    def setLoadingSpinnerNull: Self = this.set("loadingSpinner", null)
    @scala.inline
    def setMenuIcon(value: String): Self = this.set("menuIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuIcon: Self = this.set("menuIcon", js.undefined)
    @scala.inline
    def setMenuType(value: String): Self = this.set("menuType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuType: Self = this.set("menuType", js.undefined)
    @scala.inline
    def setModalEnter(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = this.set("modalEnter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteModalEnter: Self = this.set("modalEnter", js.undefined)
    @scala.inline
    def setModalLeave(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = this.set("modalLeave", js.Any.fromFunction2(value))
    @scala.inline
    def deleteModalLeave: Self = this.set("modalLeave", js.undefined)
    @scala.inline
    def setMode(value: Mode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setNavAnimation(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = this.set("navAnimation", js.Any.fromFunction2(value))
    @scala.inline
    def deleteNavAnimation: Self = this.set("navAnimation", js.undefined)
    @scala.inline
    def setPersistConfig(value: Boolean): Self = this.set("persistConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistConfig: Self = this.set("persistConfig", js.undefined)
    @scala.inline
    def setPickerEnter(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = this.set("pickerEnter", js.Any.fromFunction2(value))
    @scala.inline
    def deletePickerEnter: Self = this.set("pickerEnter", js.undefined)
    @scala.inline
    def setPickerLeave(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = this.set("pickerLeave", js.Any.fromFunction2(value))
    @scala.inline
    def deletePickerLeave: Self = this.set("pickerLeave", js.undefined)
    @scala.inline
    def setPopoverEnter(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = this.set("popoverEnter", js.Any.fromFunction2(value))
    @scala.inline
    def deletePopoverEnter: Self = this.set("popoverEnter", js.undefined)
    @scala.inline
    def setPopoverLeave(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = this.set("popoverLeave", js.Any.fromFunction2(value))
    @scala.inline
    def deletePopoverLeave: Self = this.set("popoverLeave", js.undefined)
    @scala.inline
    def setRefreshingIcon(value: String): Self = this.set("refreshingIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefreshingIcon: Self = this.set("refreshingIcon", js.undefined)
    @scala.inline
    def setRefreshingSpinner(value: SpinnerTypes): Self = this.set("refreshingSpinner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefreshingSpinner: Self = this.set("refreshingSpinner", js.undefined)
    @scala.inline
    def setRefreshingSpinnerNull: Self = this.set("refreshingSpinner", null)
    @scala.inline
    def setRippleEffect(value: Boolean): Self = this.set("rippleEffect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRippleEffect: Self = this.set("rippleEffect", js.undefined)
    @scala.inline
    def setSanitizerEnabled(value: Boolean): Self = this.set("sanitizerEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSanitizerEnabled: Self = this.set("sanitizerEnabled", js.undefined)
    @scala.inline
    def setScrollAssist(value: Boolean): Self = this.set("scrollAssist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollAssist: Self = this.set("scrollAssist", js.undefined)
    @scala.inline
    def setScrollPadding(value: Boolean): Self = this.set("scrollPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollPadding: Self = this.set("scrollPadding", js.undefined)
    @scala.inline
    def setSpinner(value: SpinnerTypes): Self = this.set("spinner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpinner: Self = this.set("spinner", js.undefined)
    @scala.inline
    def setStatusTap(value: Boolean): Self = this.set("statusTap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusTap: Self = this.set("statusTap", js.undefined)
    @scala.inline
    def setSwipeBackEnabled(value: Boolean): Self = this.set("swipeBackEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwipeBackEnabled: Self = this.set("swipeBackEnabled", js.undefined)
    @scala.inline
    def setTabButtonLayout(value: TabButtonLayout): Self = this.set("tabButtonLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabButtonLayout: Self = this.set("tabButtonLayout", js.undefined)
    @scala.inline
    def setToastEnter(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = this.set("toastEnter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteToastEnter: Self = this.set("toastEnter", js.undefined)
    @scala.inline
    def setToastLeave(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = this.set("toastLeave", js.Any.fromFunction2(value))
    @scala.inline
    def deleteToastLeave: Self = this.set("toastLeave", js.undefined)
  }
  
}

