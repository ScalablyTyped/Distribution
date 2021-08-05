package typings.ionicReact.anon

import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.componentsMod.global.HTMLIonPickerElement
import typings.ionicCore.mod.Mode
import typings.ionicCore.overlaysInterfaceMod.OverlayEventDetail
import typings.ionicCore.pickerInterfaceMod.PickerButton
import typings.ionicCore.pickerInterfaceMod.PickerColumn
import typings.react.mod.Key
import typings.react.mod.Ref
import typings.react.mod.RefObject
import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @ionic/core.@ionic/core.PickerOptions & @ionic/react.@ionic/react/dist/types/components/createControllerComponent.ReactControllerProps & {  forwardedRef :react.react.RefObject<@ionic/core.@ionic/core/dist/types/components.<global>.HTMLIonPickerElement> | undefined} & react.react.RefAttributes<@ionic/core.@ionic/core/dist/types/components.<global>.HTMLIonPickerElement> */
trait PickerOptionsReactControl extends StObject {
  
  var animated: js.UndefOr[Boolean] = js.undefined
  
  var backdropDismiss: js.UndefOr[Boolean] = js.undefined
  
  var buttons: js.UndefOr[js.Array[PickerButton]] = js.undefined
  
  var columns: js.Array[PickerColumn]
  
  var cssClass: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var enterAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  
  var forwardedRef: js.UndefOr[RefObject[HTMLIonPickerElement]] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var isOpen: Boolean
  
  var key: js.UndefOr[Key | Null] = js.undefined
  
  var keyboardClose: js.UndefOr[Boolean] = js.undefined
  
  var leaveAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  
  var mode: js.UndefOr[Mode] = js.undefined
  
  var onDidDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[js.Any]], Unit]] = js.undefined
  
  var onDidPresent: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[js.Any]], Unit]] = js.undefined
  
  var onWillDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[js.Any]], Unit]] = js.undefined
  
  var onWillPresent: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[js.Any]], Unit]] = js.undefined
  
  var ref: js.UndefOr[Ref[HTMLIonPickerElement]] = js.undefined
  
  var showBackdrop: js.UndefOr[Boolean] = js.undefined
}
object PickerOptionsReactControl {
  
  inline def apply(columns: js.Array[PickerColumn], isOpen: Boolean): PickerOptionsReactControl = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerOptionsReactControl]
  }
  
  extension [Self <: PickerOptionsReactControl](x: Self) {
    
    inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    inline def setBackdropDismiss(value: Boolean): Self = StObject.set(x, "backdropDismiss", value.asInstanceOf[js.Any])
    
    inline def setBackdropDismissUndefined: Self = StObject.set(x, "backdropDismiss", js.undefined)
    
    inline def setButtons(value: js.Array[PickerButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: PickerButton*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    inline def setColumns(value: js.Array[PickerColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsVarargs(value: PickerColumn*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    inline def setCssClass(value: String | js.Array[String]): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    
    inline def setCssClassVarargs(value: String*): Self = StObject.set(x, "cssClass", js.Array(value :_*))
    
    inline def setEnterAnimation(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "enterAnimation", js.Any.fromFunction2(value))
    
    inline def setEnterAnimationUndefined: Self = StObject.set(x, "enterAnimation", js.undefined)
    
    inline def setForwardedRef(value: RefObject[HTMLIonPickerElement]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
    
    inline def setForwardedRefUndefined: Self = StObject.set(x, "forwardedRef", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setKeyboardClose(value: Boolean): Self = StObject.set(x, "keyboardClose", value.asInstanceOf[js.Any])
    
    inline def setKeyboardCloseUndefined: Self = StObject.set(x, "keyboardClose", js.undefined)
    
    inline def setLeaveAnimation(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "leaveAnimation", js.Any.fromFunction2(value))
    
    inline def setLeaveAnimationUndefined: Self = StObject.set(x, "leaveAnimation", js.undefined)
    
    inline def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOnDidDismiss(value: /* event */ CustomEvent[OverlayEventDetail[js.Any]] => Unit): Self = StObject.set(x, "onDidDismiss", js.Any.fromFunction1(value))
    
    inline def setOnDidDismissUndefined: Self = StObject.set(x, "onDidDismiss", js.undefined)
    
    inline def setOnDidPresent(value: /* event */ CustomEvent[OverlayEventDetail[js.Any]] => Unit): Self = StObject.set(x, "onDidPresent", js.Any.fromFunction1(value))
    
    inline def setOnDidPresentUndefined: Self = StObject.set(x, "onDidPresent", js.undefined)
    
    inline def setOnWillDismiss(value: /* event */ CustomEvent[OverlayEventDetail[js.Any]] => Unit): Self = StObject.set(x, "onWillDismiss", js.Any.fromFunction1(value))
    
    inline def setOnWillDismissUndefined: Self = StObject.set(x, "onWillDismiss", js.undefined)
    
    inline def setOnWillPresent(value: /* event */ CustomEvent[OverlayEventDetail[js.Any]] => Unit): Self = StObject.set(x, "onWillPresent", js.Any.fromFunction1(value))
    
    inline def setOnWillPresentUndefined: Self = StObject.set(x, "onWillPresent", js.undefined)
    
    inline def setRef(value: Ref[HTMLIonPickerElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ HTMLIonPickerElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setShowBackdrop(value: Boolean): Self = StObject.set(x, "showBackdrop", value.asInstanceOf[js.Any])
    
    inline def setShowBackdropUndefined: Self = StObject.set(x, "showBackdrop", js.undefined)
  }
}
