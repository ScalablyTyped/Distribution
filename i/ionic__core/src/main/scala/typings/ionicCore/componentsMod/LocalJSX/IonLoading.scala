package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.ionicCoreStrings.ios
import typings.ionicCore.ionicCoreStrings.md
import typings.ionicCore.overlaysInterfaceMod.OverlayEventDetail
import typings.ionicCore.sanitizationMod.IonicSafeString
import typings.ionicCore.spinnerConfigsMod.SpinnerTypes
import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonLoading extends StObject {
  
  /**
    * If `true`, the loading indicator will animate.
    */
  var animated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the loading indicator will be dismissed when the backdrop is clicked.
    */
  var backdropDismiss: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Additional classes to apply for custom CSS. If multiple classes are provided they should be separated by spaces.
    */
  var cssClass: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * Number of milliseconds to wait before dismissing the loading indicator.
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * Animation to use when the loading indicator is presented.
    */
  var enterAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  
  /**
    * If `true`, the keyboard will be automatically dismissed when the overlay is presented.
    */
  var keyboardClose: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Animation to use when the loading indicator is dismissed.
    */
  var leaveAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  
  /**
    * Optional text content to display in the loading indicator.
    */
  var message: js.UndefOr[String | IonicSafeString] = js.undefined
  
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  
  /**
    * Emitted after the loading has dismissed.
    */
  var onIonLoadingDidDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[js.Any]], Unit]] = js.undefined
  
  /**
    * Emitted after the loading has presented.
    */
  var onIonLoadingDidPresent: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted before the loading has dismissed.
    */
  var onIonLoadingWillDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[js.Any]], Unit]] = js.undefined
  
  /**
    * Emitted before the loading has presented.
    */
  var onIonLoadingWillPresent: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * If `true`, a backdrop will be displayed behind the loading indicator.
    */
  var showBackdrop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the spinner to display.
    */
  var spinner: js.UndefOr[SpinnerTypes | Null] = js.undefined
  
  /**
    * If `true`, the loading indicator will be translucent. Only applies when the mode is `"ios"` and the device supports [`backdrop-filter`](https://developer.mozilla.org/en-US/docs/Web/CSS/backdrop-filter#Browser_compatibility).
    */
  var translucent: js.UndefOr[Boolean] = js.undefined
}
object IonLoading {
  
  @scala.inline
  def apply(): IonLoading = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonLoading]
  }
  
  @scala.inline
  implicit class IonLoadingMutableBuilder[Self <: IonLoading] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    @scala.inline
    def setBackdropDismiss(value: Boolean): Self = StObject.set(x, "backdropDismiss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackdropDismissUndefined: Self = StObject.set(x, "backdropDismiss", js.undefined)
    
    @scala.inline
    def setCssClass(value: String | js.Array[String]): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    
    @scala.inline
    def setCssClassVarargs(value: String*): Self = StObject.set(x, "cssClass", js.Array(value :_*))
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setEnterAnimation(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "enterAnimation", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterAnimationUndefined: Self = StObject.set(x, "enterAnimation", js.undefined)
    
    @scala.inline
    def setKeyboardClose(value: Boolean): Self = StObject.set(x, "keyboardClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardCloseUndefined: Self = StObject.set(x, "keyboardClose", js.undefined)
    
    @scala.inline
    def setLeaveAnimation(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "leaveAnimation", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLeaveAnimationUndefined: Self = StObject.set(x, "leaveAnimation", js.undefined)
    
    @scala.inline
    def setMessage(value: String | IonicSafeString): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setMode(value: ios | md): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setOnIonLoadingDidDismiss(value: /* event */ CustomEvent[OverlayEventDetail[js.Any]] => Unit): Self = StObject.set(x, "onIonLoadingDidDismiss", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonLoadingDidDismissUndefined: Self = StObject.set(x, "onIonLoadingDidDismiss", js.undefined)
    
    @scala.inline
    def setOnIonLoadingDidPresent(value: /* event */ CustomEvent[Unit] => Unit): Self = StObject.set(x, "onIonLoadingDidPresent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonLoadingDidPresentUndefined: Self = StObject.set(x, "onIonLoadingDidPresent", js.undefined)
    
    @scala.inline
    def setOnIonLoadingWillDismiss(value: /* event */ CustomEvent[OverlayEventDetail[js.Any]] => Unit): Self = StObject.set(x, "onIonLoadingWillDismiss", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonLoadingWillDismissUndefined: Self = StObject.set(x, "onIonLoadingWillDismiss", js.undefined)
    
    @scala.inline
    def setOnIonLoadingWillPresent(value: /* event */ CustomEvent[Unit] => Unit): Self = StObject.set(x, "onIonLoadingWillPresent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonLoadingWillPresentUndefined: Self = StObject.set(x, "onIonLoadingWillPresent", js.undefined)
    
    @scala.inline
    def setShowBackdrop(value: Boolean): Self = StObject.set(x, "showBackdrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowBackdropUndefined: Self = StObject.set(x, "showBackdrop", js.undefined)
    
    @scala.inline
    def setSpinner(value: SpinnerTypes): Self = StObject.set(x, "spinner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpinnerNull: Self = StObject.set(x, "spinner", null)
    
    @scala.inline
    def setSpinnerUndefined: Self = StObject.set(x, "spinner", js.undefined)
    
    @scala.inline
    def setTranslucent(value: Boolean): Self = StObject.set(x, "translucent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslucentUndefined: Self = StObject.set(x, "translucent", js.undefined)
  }
}
