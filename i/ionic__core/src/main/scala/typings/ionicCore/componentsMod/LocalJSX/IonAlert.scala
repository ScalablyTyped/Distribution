package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.alertInterfaceMod.AlertButton
import typings.ionicCore.alertInterfaceMod.AlertInput
import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.ionicCoreStrings.ios
import typings.ionicCore.ionicCoreStrings.md
import typings.ionicCore.overlaysInterfaceMod.OverlayEventDetail
import typings.ionicCore.sanitizationMod.IonicSafeString
import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonAlert extends StObject {
  
  /**
    * If `true`, the alert will animate.
    */
  var animated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the alert will be dismissed when the backdrop is clicked.
    */
  var backdropDismiss: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Array of buttons to be added to the alert.
    */
  var buttons: js.UndefOr[js.Array[AlertButton | String]] = js.undefined
  
  /**
    * Additional classes to apply for custom CSS. If multiple classes are provided they should be separated by spaces.
    */
  var cssClass: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * Animation to use when the alert is presented.
    */
  var enterAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  
  /**
    * The main title in the heading of the alert.
    */
  var header: js.UndefOr[String] = js.undefined
  
  /**
    * Array of input to show in the alert.
    */
  var inputs: js.UndefOr[js.Array[AlertInput]] = js.undefined
  
  /**
    * If `true`, the keyboard will be automatically dismissed when the overlay is presented.
    */
  var keyboardClose: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Animation to use when the alert is dismissed.
    */
  var leaveAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  
  /**
    * The main message to be displayed in the alert. `message` can accept either plaintext or HTML as a string. To display characters normally reserved for HTML, they must be escaped. For example `<Ionic>` would become `&lt;Ionic&gt;`  For more information: [Security Documentation](https://ionicframework.com/docs/faq/security)
    */
  var message: js.UndefOr[String | IonicSafeString] = js.undefined
  
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  
  /**
    * Emitted after the alert has dismissed.
    */
  var onIonAlertDidDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[js.Any]], Unit]] = js.undefined
  
  /**
    * Emitted after the alert has presented.
    */
  var onIonAlertDidPresent: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted before the alert has dismissed.
    */
  var onIonAlertWillDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[js.Any]], Unit]] = js.undefined
  
  /**
    * Emitted before the alert has presented.
    */
  var onIonAlertWillPresent: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * The subtitle in the heading of the alert. Displayed under the title.
    */
  var subHeader: js.UndefOr[String] = js.undefined
  
  /**
    * If `true`, the alert will be translucent. Only applies when the mode is `"ios"` and the device supports [`backdrop-filter`](https://developer.mozilla.org/en-US/docs/Web/CSS/backdrop-filter#Browser_compatibility).
    */
  var translucent: js.UndefOr[Boolean] = js.undefined
}
object IonAlert {
  
  @scala.inline
  def apply(): IonAlert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonAlert]
  }
  
  @scala.inline
  implicit class IonAlertMutableBuilder[Self <: IonAlert] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    @scala.inline
    def setBackdropDismiss(value: Boolean): Self = StObject.set(x, "backdropDismiss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackdropDismissUndefined: Self = StObject.set(x, "backdropDismiss", js.undefined)
    
    @scala.inline
    def setButtons(value: js.Array[AlertButton | String]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    @scala.inline
    def setButtonsVarargs(value: (AlertButton | String)*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    @scala.inline
    def setCssClass(value: String | js.Array[String]): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    
    @scala.inline
    def setCssClassVarargs(value: String*): Self = StObject.set(x, "cssClass", js.Array(value :_*))
    
    @scala.inline
    def setEnterAnimation(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "enterAnimation", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterAnimationUndefined: Self = StObject.set(x, "enterAnimation", js.undefined)
    
    @scala.inline
    def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setInputs(value: js.Array[AlertInput]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    @scala.inline
    def setInputsVarargs(value: AlertInput*): Self = StObject.set(x, "inputs", js.Array(value :_*))
    
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
    def setOnIonAlertDidDismiss(value: /* event */ CustomEvent[OverlayEventDetail[js.Any]] => Unit): Self = StObject.set(x, "onIonAlertDidDismiss", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonAlertDidDismissUndefined: Self = StObject.set(x, "onIonAlertDidDismiss", js.undefined)
    
    @scala.inline
    def setOnIonAlertDidPresent(value: /* event */ CustomEvent[Unit] => Unit): Self = StObject.set(x, "onIonAlertDidPresent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonAlertDidPresentUndefined: Self = StObject.set(x, "onIonAlertDidPresent", js.undefined)
    
    @scala.inline
    def setOnIonAlertWillDismiss(value: /* event */ CustomEvent[OverlayEventDetail[js.Any]] => Unit): Self = StObject.set(x, "onIonAlertWillDismiss", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonAlertWillDismissUndefined: Self = StObject.set(x, "onIonAlertWillDismiss", js.undefined)
    
    @scala.inline
    def setOnIonAlertWillPresent(value: /* event */ CustomEvent[Unit] => Unit): Self = StObject.set(x, "onIonAlertWillPresent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonAlertWillPresentUndefined: Self = StObject.set(x, "onIonAlertWillPresent", js.undefined)
    
    @scala.inline
    def setSubHeader(value: String): Self = StObject.set(x, "subHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubHeaderUndefined: Self = StObject.set(x, "subHeader", js.undefined)
    
    @scala.inline
    def setTranslucent(value: Boolean): Self = StObject.set(x, "translucent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslucentUndefined: Self = StObject.set(x, "translucent", js.undefined)
  }
}
