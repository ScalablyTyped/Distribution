package typings.ionicCore

import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.mod.Mode
import typings.ionicCore.spinnerConfigsMod.SpinnerTypes
import typings.ionicCore.tabBarInterfaceMod.TabButtonLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsConfigMod {
  
  @JSImport("@ionic/core/dist/types/utils/config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMode(): Mode = ^.asInstanceOf[js.Dynamic].applyDynamic("getMode")().asInstanceOf[Mode]
  
  inline def setupConfig(config: IonicConfig): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("setupConfig")(config.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  trait IonicConfig extends StObject {
    
    var _ael: js.UndefOr[
        js.Function4[/* el */ js.Any, /* name */ String, /* cb */ js.Any, /* opts */ js.Any, js.Any]
      ] = js.undefined
    
    var _forceStatusbarPadding: js.UndefOr[Boolean] = js.undefined
    
    var _rel: js.UndefOr[
        js.Function4[/* el */ js.Any, /* name */ String, /* cb */ js.Any, /* opts */ js.Any, js.Any]
      ] = js.undefined
    
    var _testing: js.UndefOr[Boolean] = js.undefined
    
    var _zoneGate: js.UndefOr[js.Function1[/* h */ js.Function0[js.Any], js.Any]] = js.undefined
    
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
    
    inline def apply(): IonicConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IonicConfig]
    }
    
    extension [Self <: IonicConfig](x: Self) {
      
      inline def setActionSheetEnter(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "actionSheetEnter", js.Any.fromFunction2(value))
      
      inline def setActionSheetEnterUndefined: Self = StObject.set(x, "actionSheetEnter", js.undefined)
      
      inline def setActionSheetLeave(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "actionSheetLeave", js.Any.fromFunction2(value))
      
      inline def setActionSheetLeaveUndefined: Self = StObject.set(x, "actionSheetLeave", js.undefined)
      
      inline def setAlertEnter(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "alertEnter", js.Any.fromFunction2(value))
      
      inline def setAlertEnterUndefined: Self = StObject.set(x, "alertEnter", js.undefined)
      
      inline def setAlertLeave(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "alertLeave", js.Any.fromFunction2(value))
      
      inline def setAlertLeaveUndefined: Self = StObject.set(x, "alertLeave", js.undefined)
      
      inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      inline def setBackButtonDefaultHref(value: String): Self = StObject.set(x, "backButtonDefaultHref", value.asInstanceOf[js.Any])
      
      inline def setBackButtonDefaultHrefUndefined: Self = StObject.set(x, "backButtonDefaultHref", js.undefined)
      
      inline def setBackButtonIcon(value: String): Self = StObject.set(x, "backButtonIcon", value.asInstanceOf[js.Any])
      
      inline def setBackButtonIconUndefined: Self = StObject.set(x, "backButtonIcon", js.undefined)
      
      inline def setBackButtonText(value: String): Self = StObject.set(x, "backButtonText", value.asInstanceOf[js.Any])
      
      inline def setBackButtonTextUndefined: Self = StObject.set(x, "backButtonText", js.undefined)
      
      inline def setExperimentalTransitionShadow(value: Boolean): Self = StObject.set(x, "experimentalTransitionShadow", value.asInstanceOf[js.Any])
      
      inline def setExperimentalTransitionShadowUndefined: Self = StObject.set(x, "experimentalTransitionShadow", js.undefined)
      
      inline def setHardwareBackButton(value: Boolean): Self = StObject.set(x, "hardwareBackButton", value.asInstanceOf[js.Any])
      
      inline def setHardwareBackButtonUndefined: Self = StObject.set(x, "hardwareBackButton", js.undefined)
      
      inline def setHideCaretOnScroll(value: Boolean): Self = StObject.set(x, "hideCaretOnScroll", value.asInstanceOf[js.Any])
      
      inline def setHideCaretOnScrollUndefined: Self = StObject.set(x, "hideCaretOnScroll", js.undefined)
      
      inline def setInfiniteLoadingSpinner(value: SpinnerTypes): Self = StObject.set(x, "infiniteLoadingSpinner", value.asInstanceOf[js.Any])
      
      inline def setInfiniteLoadingSpinnerNull: Self = StObject.set(x, "infiniteLoadingSpinner", null)
      
      inline def setInfiniteLoadingSpinnerUndefined: Self = StObject.set(x, "infiniteLoadingSpinner", js.undefined)
      
      inline def setInputBlurring(value: Boolean): Self = StObject.set(x, "inputBlurring", value.asInstanceOf[js.Any])
      
      inline def setInputBlurringUndefined: Self = StObject.set(x, "inputBlurring", js.undefined)
      
      inline def setInputShims(value: Boolean): Self = StObject.set(x, "inputShims", value.asInstanceOf[js.Any])
      
      inline def setInputShimsUndefined: Self = StObject.set(x, "inputShims", js.undefined)
      
      inline def setKeyboardHeight(value: Double): Self = StObject.set(x, "keyboardHeight", value.asInstanceOf[js.Any])
      
      inline def setKeyboardHeightUndefined: Self = StObject.set(x, "keyboardHeight", js.undefined)
      
      inline def setLoadingEnter(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "loadingEnter", js.Any.fromFunction2(value))
      
      inline def setLoadingEnterUndefined: Self = StObject.set(x, "loadingEnter", js.undefined)
      
      inline def setLoadingLeave(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "loadingLeave", js.Any.fromFunction2(value))
      
      inline def setLoadingLeaveUndefined: Self = StObject.set(x, "loadingLeave", js.undefined)
      
      inline def setLoadingSpinner(value: SpinnerTypes): Self = StObject.set(x, "loadingSpinner", value.asInstanceOf[js.Any])
      
      inline def setLoadingSpinnerNull: Self = StObject.set(x, "loadingSpinner", null)
      
      inline def setLoadingSpinnerUndefined: Self = StObject.set(x, "loadingSpinner", js.undefined)
      
      inline def setMenuIcon(value: String): Self = StObject.set(x, "menuIcon", value.asInstanceOf[js.Any])
      
      inline def setMenuIconUndefined: Self = StObject.set(x, "menuIcon", js.undefined)
      
      inline def setMenuType(value: String): Self = StObject.set(x, "menuType", value.asInstanceOf[js.Any])
      
      inline def setMenuTypeUndefined: Self = StObject.set(x, "menuType", js.undefined)
      
      inline def setModalEnter(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "modalEnter", js.Any.fromFunction2(value))
      
      inline def setModalEnterUndefined: Self = StObject.set(x, "modalEnter", js.undefined)
      
      inline def setModalLeave(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "modalLeave", js.Any.fromFunction2(value))
      
      inline def setModalLeaveUndefined: Self = StObject.set(x, "modalLeave", js.undefined)
      
      inline def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setNavAnimation(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "navAnimation", js.Any.fromFunction2(value))
      
      inline def setNavAnimationUndefined: Self = StObject.set(x, "navAnimation", js.undefined)
      
      inline def setPersistConfig(value: Boolean): Self = StObject.set(x, "persistConfig", value.asInstanceOf[js.Any])
      
      inline def setPersistConfigUndefined: Self = StObject.set(x, "persistConfig", js.undefined)
      
      inline def setPickerEnter(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "pickerEnter", js.Any.fromFunction2(value))
      
      inline def setPickerEnterUndefined: Self = StObject.set(x, "pickerEnter", js.undefined)
      
      inline def setPickerLeave(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "pickerLeave", js.Any.fromFunction2(value))
      
      inline def setPickerLeaveUndefined: Self = StObject.set(x, "pickerLeave", js.undefined)
      
      inline def setPopoverEnter(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "popoverEnter", js.Any.fromFunction2(value))
      
      inline def setPopoverEnterUndefined: Self = StObject.set(x, "popoverEnter", js.undefined)
      
      inline def setPopoverLeave(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "popoverLeave", js.Any.fromFunction2(value))
      
      inline def setPopoverLeaveUndefined: Self = StObject.set(x, "popoverLeave", js.undefined)
      
      inline def setRefreshingIcon(value: String): Self = StObject.set(x, "refreshingIcon", value.asInstanceOf[js.Any])
      
      inline def setRefreshingIconUndefined: Self = StObject.set(x, "refreshingIcon", js.undefined)
      
      inline def setRefreshingSpinner(value: SpinnerTypes): Self = StObject.set(x, "refreshingSpinner", value.asInstanceOf[js.Any])
      
      inline def setRefreshingSpinnerNull: Self = StObject.set(x, "refreshingSpinner", null)
      
      inline def setRefreshingSpinnerUndefined: Self = StObject.set(x, "refreshingSpinner", js.undefined)
      
      inline def setRippleEffect(value: Boolean): Self = StObject.set(x, "rippleEffect", value.asInstanceOf[js.Any])
      
      inline def setRippleEffectUndefined: Self = StObject.set(x, "rippleEffect", js.undefined)
      
      inline def setSanitizerEnabled(value: Boolean): Self = StObject.set(x, "sanitizerEnabled", value.asInstanceOf[js.Any])
      
      inline def setSanitizerEnabledUndefined: Self = StObject.set(x, "sanitizerEnabled", js.undefined)
      
      inline def setScrollAssist(value: Boolean): Self = StObject.set(x, "scrollAssist", value.asInstanceOf[js.Any])
      
      inline def setScrollAssistUndefined: Self = StObject.set(x, "scrollAssist", js.undefined)
      
      inline def setScrollPadding(value: Boolean): Self = StObject.set(x, "scrollPadding", value.asInstanceOf[js.Any])
      
      inline def setScrollPaddingUndefined: Self = StObject.set(x, "scrollPadding", js.undefined)
      
      inline def setSpinner(value: SpinnerTypes): Self = StObject.set(x, "spinner", value.asInstanceOf[js.Any])
      
      inline def setSpinnerUndefined: Self = StObject.set(x, "spinner", js.undefined)
      
      inline def setStatusTap(value: Boolean): Self = StObject.set(x, "statusTap", value.asInstanceOf[js.Any])
      
      inline def setStatusTapUndefined: Self = StObject.set(x, "statusTap", js.undefined)
      
      inline def setSwipeBackEnabled(value: Boolean): Self = StObject.set(x, "swipeBackEnabled", value.asInstanceOf[js.Any])
      
      inline def setSwipeBackEnabledUndefined: Self = StObject.set(x, "swipeBackEnabled", js.undefined)
      
      inline def setTabButtonLayout(value: TabButtonLayout): Self = StObject.set(x, "tabButtonLayout", value.asInstanceOf[js.Any])
      
      inline def setTabButtonLayoutUndefined: Self = StObject.set(x, "tabButtonLayout", js.undefined)
      
      inline def setToastEnter(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "toastEnter", js.Any.fromFunction2(value))
      
      inline def setToastEnterUndefined: Self = StObject.set(x, "toastEnter", js.undefined)
      
      inline def setToastLeave(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "toastLeave", js.Any.fromFunction2(value))
      
      inline def setToastLeaveUndefined: Self = StObject.set(x, "toastLeave", js.undefined)
      
      inline def set_ael(value: (/* el */ js.Any, /* name */ String, /* cb */ js.Any, /* opts */ js.Any) => js.Any): Self = StObject.set(x, "_ael", js.Any.fromFunction4(value))
      
      inline def set_aelUndefined: Self = StObject.set(x, "_ael", js.undefined)
      
      inline def set_forceStatusbarPadding(value: Boolean): Self = StObject.set(x, "_forceStatusbarPadding", value.asInstanceOf[js.Any])
      
      inline def set_forceStatusbarPaddingUndefined: Self = StObject.set(x, "_forceStatusbarPadding", js.undefined)
      
      inline def set_rel(value: (/* el */ js.Any, /* name */ String, /* cb */ js.Any, /* opts */ js.Any) => js.Any): Self = StObject.set(x, "_rel", js.Any.fromFunction4(value))
      
      inline def set_relUndefined: Self = StObject.set(x, "_rel", js.undefined)
      
      inline def set_testing(value: Boolean): Self = StObject.set(x, "_testing", value.asInstanceOf[js.Any])
      
      inline def set_testingUndefined: Self = StObject.set(x, "_testing", js.undefined)
      
      inline def set_zoneGate(value: /* h */ js.Function0[js.Any] => js.Any): Self = StObject.set(x, "_zoneGate", js.Any.fromFunction1(value))
      
      inline def set_zoneGateUndefined: Self = StObject.set(x, "_zoneGate", js.undefined)
    }
  }
}
