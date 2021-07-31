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
  
  @scala.inline
  def getMode(): Mode = ^.asInstanceOf[js.Dynamic].applyDynamic("getMode")().asInstanceOf[Mode]
  
  @scala.inline
  def setupConfig(config: IonicConfig): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("setupConfig")(config.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
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
    
    @scala.inline
    def apply(): IonicConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IonicConfig]
    }
    
    @scala.inline
    implicit class IonicConfigMutableBuilder[Self <: IonicConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionSheetEnter(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "actionSheetEnter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setActionSheetEnterUndefined: Self = StObject.set(x, "actionSheetEnter", js.undefined)
      
      @scala.inline
      def setActionSheetLeave(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "actionSheetLeave", js.Any.fromFunction2(value))
      
      @scala.inline
      def setActionSheetLeaveUndefined: Self = StObject.set(x, "actionSheetLeave", js.undefined)
      
      @scala.inline
      def setAlertEnter(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "alertEnter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAlertEnterUndefined: Self = StObject.set(x, "alertEnter", js.undefined)
      
      @scala.inline
      def setAlertLeave(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "alertLeave", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAlertLeaveUndefined: Self = StObject.set(x, "alertLeave", js.undefined)
      
      @scala.inline
      def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      @scala.inline
      def setBackButtonDefaultHref(value: String): Self = StObject.set(x, "backButtonDefaultHref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackButtonDefaultHrefUndefined: Self = StObject.set(x, "backButtonDefaultHref", js.undefined)
      
      @scala.inline
      def setBackButtonIcon(value: String): Self = StObject.set(x, "backButtonIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackButtonIconUndefined: Self = StObject.set(x, "backButtonIcon", js.undefined)
      
      @scala.inline
      def setBackButtonText(value: String): Self = StObject.set(x, "backButtonText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackButtonTextUndefined: Self = StObject.set(x, "backButtonText", js.undefined)
      
      @scala.inline
      def setExperimentalTransitionShadow(value: Boolean): Self = StObject.set(x, "experimentalTransitionShadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExperimentalTransitionShadowUndefined: Self = StObject.set(x, "experimentalTransitionShadow", js.undefined)
      
      @scala.inline
      def setHardwareBackButton(value: Boolean): Self = StObject.set(x, "hardwareBackButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHardwareBackButtonUndefined: Self = StObject.set(x, "hardwareBackButton", js.undefined)
      
      @scala.inline
      def setHideCaretOnScroll(value: Boolean): Self = StObject.set(x, "hideCaretOnScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideCaretOnScrollUndefined: Self = StObject.set(x, "hideCaretOnScroll", js.undefined)
      
      @scala.inline
      def setInfiniteLoadingSpinner(value: SpinnerTypes): Self = StObject.set(x, "infiniteLoadingSpinner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfiniteLoadingSpinnerNull: Self = StObject.set(x, "infiniteLoadingSpinner", null)
      
      @scala.inline
      def setInfiniteLoadingSpinnerUndefined: Self = StObject.set(x, "infiniteLoadingSpinner", js.undefined)
      
      @scala.inline
      def setInputBlurring(value: Boolean): Self = StObject.set(x, "inputBlurring", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputBlurringUndefined: Self = StObject.set(x, "inputBlurring", js.undefined)
      
      @scala.inline
      def setInputShims(value: Boolean): Self = StObject.set(x, "inputShims", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputShimsUndefined: Self = StObject.set(x, "inputShims", js.undefined)
      
      @scala.inline
      def setKeyboardHeight(value: Double): Self = StObject.set(x, "keyboardHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardHeightUndefined: Self = StObject.set(x, "keyboardHeight", js.undefined)
      
      @scala.inline
      def setLoadingEnter(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "loadingEnter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoadingEnterUndefined: Self = StObject.set(x, "loadingEnter", js.undefined)
      
      @scala.inline
      def setLoadingLeave(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "loadingLeave", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoadingLeaveUndefined: Self = StObject.set(x, "loadingLeave", js.undefined)
      
      @scala.inline
      def setLoadingSpinner(value: SpinnerTypes): Self = StObject.set(x, "loadingSpinner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingSpinnerNull: Self = StObject.set(x, "loadingSpinner", null)
      
      @scala.inline
      def setLoadingSpinnerUndefined: Self = StObject.set(x, "loadingSpinner", js.undefined)
      
      @scala.inline
      def setMenuIcon(value: String): Self = StObject.set(x, "menuIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuIconUndefined: Self = StObject.set(x, "menuIcon", js.undefined)
      
      @scala.inline
      def setMenuType(value: String): Self = StObject.set(x, "menuType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuTypeUndefined: Self = StObject.set(x, "menuType", js.undefined)
      
      @scala.inline
      def setModalEnter(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "modalEnter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setModalEnterUndefined: Self = StObject.set(x, "modalEnter", js.undefined)
      
      @scala.inline
      def setModalLeave(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "modalLeave", js.Any.fromFunction2(value))
      
      @scala.inline
      def setModalLeaveUndefined: Self = StObject.set(x, "modalLeave", js.undefined)
      
      @scala.inline
      def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setNavAnimation(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "navAnimation", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNavAnimationUndefined: Self = StObject.set(x, "navAnimation", js.undefined)
      
      @scala.inline
      def setPersistConfig(value: Boolean): Self = StObject.set(x, "persistConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersistConfigUndefined: Self = StObject.set(x, "persistConfig", js.undefined)
      
      @scala.inline
      def setPickerEnter(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "pickerEnter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPickerEnterUndefined: Self = StObject.set(x, "pickerEnter", js.undefined)
      
      @scala.inline
      def setPickerLeave(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "pickerLeave", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPickerLeaveUndefined: Self = StObject.set(x, "pickerLeave", js.undefined)
      
      @scala.inline
      def setPopoverEnter(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "popoverEnter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPopoverEnterUndefined: Self = StObject.set(x, "popoverEnter", js.undefined)
      
      @scala.inline
      def setPopoverLeave(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "popoverLeave", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPopoverLeaveUndefined: Self = StObject.set(x, "popoverLeave", js.undefined)
      
      @scala.inline
      def setRefreshingIcon(value: String): Self = StObject.set(x, "refreshingIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshingIconUndefined: Self = StObject.set(x, "refreshingIcon", js.undefined)
      
      @scala.inline
      def setRefreshingSpinner(value: SpinnerTypes): Self = StObject.set(x, "refreshingSpinner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshingSpinnerNull: Self = StObject.set(x, "refreshingSpinner", null)
      
      @scala.inline
      def setRefreshingSpinnerUndefined: Self = StObject.set(x, "refreshingSpinner", js.undefined)
      
      @scala.inline
      def setRippleEffect(value: Boolean): Self = StObject.set(x, "rippleEffect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRippleEffectUndefined: Self = StObject.set(x, "rippleEffect", js.undefined)
      
      @scala.inline
      def setSanitizerEnabled(value: Boolean): Self = StObject.set(x, "sanitizerEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSanitizerEnabledUndefined: Self = StObject.set(x, "sanitizerEnabled", js.undefined)
      
      @scala.inline
      def setScrollAssist(value: Boolean): Self = StObject.set(x, "scrollAssist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollAssistUndefined: Self = StObject.set(x, "scrollAssist", js.undefined)
      
      @scala.inline
      def setScrollPadding(value: Boolean): Self = StObject.set(x, "scrollPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollPaddingUndefined: Self = StObject.set(x, "scrollPadding", js.undefined)
      
      @scala.inline
      def setSpinner(value: SpinnerTypes): Self = StObject.set(x, "spinner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpinnerUndefined: Self = StObject.set(x, "spinner", js.undefined)
      
      @scala.inline
      def setStatusTap(value: Boolean): Self = StObject.set(x, "statusTap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusTapUndefined: Self = StObject.set(x, "statusTap", js.undefined)
      
      @scala.inline
      def setSwipeBackEnabled(value: Boolean): Self = StObject.set(x, "swipeBackEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwipeBackEnabledUndefined: Self = StObject.set(x, "swipeBackEnabled", js.undefined)
      
      @scala.inline
      def setTabButtonLayout(value: TabButtonLayout): Self = StObject.set(x, "tabButtonLayout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabButtonLayoutUndefined: Self = StObject.set(x, "tabButtonLayout", js.undefined)
      
      @scala.inline
      def setToastEnter(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "toastEnter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setToastEnterUndefined: Self = StObject.set(x, "toastEnter", js.undefined)
      
      @scala.inline
      def setToastLeave(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "toastLeave", js.Any.fromFunction2(value))
      
      @scala.inline
      def setToastLeaveUndefined: Self = StObject.set(x, "toastLeave", js.undefined)
      
      @scala.inline
      def set_ael(value: (/* el */ js.Any, /* name */ String, /* cb */ js.Any, /* opts */ js.Any) => js.Any): Self = StObject.set(x, "_ael", js.Any.fromFunction4(value))
      
      @scala.inline
      def set_aelUndefined: Self = StObject.set(x, "_ael", js.undefined)
      
      @scala.inline
      def set_forceStatusbarPadding(value: Boolean): Self = StObject.set(x, "_forceStatusbarPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_forceStatusbarPaddingUndefined: Self = StObject.set(x, "_forceStatusbarPadding", js.undefined)
      
      @scala.inline
      def set_rel(value: (/* el */ js.Any, /* name */ String, /* cb */ js.Any, /* opts */ js.Any) => js.Any): Self = StObject.set(x, "_rel", js.Any.fromFunction4(value))
      
      @scala.inline
      def set_relUndefined: Self = StObject.set(x, "_rel", js.undefined)
      
      @scala.inline
      def set_testing(value: Boolean): Self = StObject.set(x, "_testing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_testingUndefined: Self = StObject.set(x, "_testing", js.undefined)
      
      @scala.inline
      def set_zoneGate(value: /* h */ js.Function0[js.Any] => js.Any): Self = StObject.set(x, "_zoneGate", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_zoneGateUndefined: Self = StObject.set(x, "_zoneGate", js.undefined)
    }
  }
}
