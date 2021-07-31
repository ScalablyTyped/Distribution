package typings.ionicReact.anon

import typings.ionicCore.alertInterfaceMod.AlertButton
import typings.ionicCore.alertInterfaceMod.AlertInput
import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.componentsMod.global.HTMLIonAlertElement
import typings.ionicCore.mod.Mode
import typings.ionicCore.overlaysInterfaceMod.OverlayEventDetail
import typings.ionicCore.sanitizationMod.IonicSafeString
import typings.react.mod.Key
import typings.react.mod.Ref
import typings.react.mod.RefObject
import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @ionic/core.@ionic/core.AlertOptions & @ionic/react.@ionic/react/dist/types/components/createControllerComponent.ReactControllerProps & {  forwardedRef :react.react.RefObject<@ionic/core.@ionic/core/dist/types/components.<global>.HTMLIonAlertElement> | undefined} & react.react.RefAttributes<@ionic/core.@ionic/core/dist/types/components.<global>.HTMLIonAlertElement> */
trait AlertOptionsReactControll extends StObject {
  
  var animated: js.UndefOr[Boolean] = js.undefined
  
  var backdropDismiss: js.UndefOr[Boolean] = js.undefined
  
  var buttons: js.UndefOr[js.Array[AlertButton | String]] = js.undefined
  
  var cssClass: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var enterAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  
  var forwardedRef: js.UndefOr[RefObject[HTMLIonAlertElement]] = js.undefined
  
  var header: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var inputs: js.UndefOr[js.Array[AlertInput]] = js.undefined
  
  var isOpen: Boolean
  
  var key: js.UndefOr[Key | Null] = js.undefined
  
  var keyboardClose: js.UndefOr[Boolean] = js.undefined
  
  var leaveAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  
  var message: js.UndefOr[String | IonicSafeString] = js.undefined
  
  var mode: js.UndefOr[Mode] = js.undefined
  
  var onDidDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[js.Any]], Unit]] = js.undefined
  
  var onDidPresent: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[js.Any]], Unit]] = js.undefined
  
  var onWillDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[js.Any]], Unit]] = js.undefined
  
  var onWillPresent: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[js.Any]], Unit]] = js.undefined
  
  var ref: js.UndefOr[Ref[HTMLIonAlertElement]] = js.undefined
  
  var subHeader: js.UndefOr[String] = js.undefined
  
  var translucent: js.UndefOr[Boolean] = js.undefined
}
object AlertOptionsReactControll {
  
  @scala.inline
  def apply(isOpen: Boolean): AlertOptionsReactControll = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertOptionsReactControll]
  }
  
  @scala.inline
  implicit class AlertOptionsReactControllMutableBuilder[Self <: AlertOptionsReactControll] (val x: Self) extends AnyVal {
    
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
    def setForwardedRef(value: RefObject[HTMLIonAlertElement]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardedRefUndefined: Self = StObject.set(x, "forwardedRef", js.undefined)
    
    @scala.inline
    def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInputs(value: js.Array[AlertInput]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    @scala.inline
    def setInputsVarargs(value: AlertInput*): Self = StObject.set(x, "inputs", js.Array(value :_*))
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyNull: Self = StObject.set(x, "key", null)
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
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
    def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setOnDidDismiss(value: /* event */ CustomEvent[OverlayEventDetail[js.Any]] => Unit): Self = StObject.set(x, "onDidDismiss", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDidDismissUndefined: Self = StObject.set(x, "onDidDismiss", js.undefined)
    
    @scala.inline
    def setOnDidPresent(value: /* event */ CustomEvent[OverlayEventDetail[js.Any]] => Unit): Self = StObject.set(x, "onDidPresent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDidPresentUndefined: Self = StObject.set(x, "onDidPresent", js.undefined)
    
    @scala.inline
    def setOnWillDismiss(value: /* event */ CustomEvent[OverlayEventDetail[js.Any]] => Unit): Self = StObject.set(x, "onWillDismiss", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnWillDismissUndefined: Self = StObject.set(x, "onWillDismiss", js.undefined)
    
    @scala.inline
    def setOnWillPresent(value: /* event */ CustomEvent[OverlayEventDetail[js.Any]] => Unit): Self = StObject.set(x, "onWillPresent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnWillPresentUndefined: Self = StObject.set(x, "onWillPresent", js.undefined)
    
    @scala.inline
    def setRef(value: Ref[HTMLIonAlertElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ HTMLIonAlertElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
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
