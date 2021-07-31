package typings.ionicReact.anon

import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.componentsMod.global.HTMLIonModalElement
import typings.ionicCore.mod.FrameworkDelegate
import typings.ionicCore.mod.Mode
import typings.ionicCore.overlaysInterfaceMod.OverlayEventDetail
import typings.react.mod.Key
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.RefObject
import typings.std.CustomEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  children :react.react.ReactNode,   forwardedRef :react.react.RefObject<@ionic/core.@ionic/core/dist/types/components.<global>.HTMLIonModalElement> | undefined} & std.Pick<@ionic/core.@ionic/core.ModalOptions<@ionic/core.@ionic/core.ComponentRef>, 'animated' | 'mode' | 'id' | 'cssClass' | 'backdropDismiss' | 'keyboardClose' | 'enterAnimation' | 'leaveAnimation' | 'showBackdrop' | 'presentingElement' | 'delegate' | 'swipeToClose'> & @ionic/react.@ionic/react/dist/types/components/createOverlayComponent.ReactOverlayProps & react.react.RefAttributes<@ionic/core.@ionic/core/dist/types/components.<global>.HTMLIonModalElement> */
trait childrenReactNodeforwarde extends StObject {
  
  var animated: js.UndefOr[Boolean] = js.undefined
  
  var backdropDismiss: js.UndefOr[Boolean] = js.undefined
  
  var children: ReactNode & js.UndefOr[ReactNode]
  
  var cssClass: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var delegate: js.UndefOr[FrameworkDelegate] = js.undefined
  
  var enterAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  
  var forwardedRef: js.UndefOr[RefObject[HTMLIonModalElement]] = js.undefined
  
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
  
  var presentingElement: js.UndefOr[HTMLElement] = js.undefined
  
  var ref: js.UndefOr[Ref[HTMLIonModalElement]] = js.undefined
  
  var showBackdrop: js.UndefOr[Boolean] = js.undefined
  
  var swipeToClose: js.UndefOr[Boolean] = js.undefined
}
object childrenReactNodeforwarde {
  
  @scala.inline
  def apply(isOpen: Boolean): childrenReactNodeforwarde = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[childrenReactNodeforwarde]
  }
  
  @scala.inline
  implicit class childrenReactNodeforwardeMutableBuilder[Self <: childrenReactNodeforwarde] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    @scala.inline
    def setBackdropDismiss(value: Boolean): Self = StObject.set(x, "backdropDismiss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackdropDismissUndefined: Self = StObject.set(x, "backdropDismiss", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode & js.UndefOr[ReactNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setCssClass(value: String | js.Array[String]): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    
    @scala.inline
    def setCssClassVarargs(value: String*): Self = StObject.set(x, "cssClass", js.Array(value :_*))
    
    @scala.inline
    def setDelegate(value: FrameworkDelegate): Self = StObject.set(x, "delegate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelegateUndefined: Self = StObject.set(x, "delegate", js.undefined)
    
    @scala.inline
    def setEnterAnimation(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "enterAnimation", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterAnimationUndefined: Self = StObject.set(x, "enterAnimation", js.undefined)
    
    @scala.inline
    def setForwardedRef(value: RefObject[HTMLIonModalElement]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardedRefUndefined: Self = StObject.set(x, "forwardedRef", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
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
    def setPresentingElement(value: HTMLElement): Self = StObject.set(x, "presentingElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresentingElementUndefined: Self = StObject.set(x, "presentingElement", js.undefined)
    
    @scala.inline
    def setRef(value: Ref[HTMLIonModalElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ HTMLIonModalElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    @scala.inline
    def setShowBackdrop(value: Boolean): Self = StObject.set(x, "showBackdrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowBackdropUndefined: Self = StObject.set(x, "showBackdrop", js.undefined)
    
    @scala.inline
    def setSwipeToClose(value: Boolean): Self = StObject.set(x, "swipeToClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeToCloseUndefined: Self = StObject.set(x, "swipeToClose", js.undefined)
  }
}
