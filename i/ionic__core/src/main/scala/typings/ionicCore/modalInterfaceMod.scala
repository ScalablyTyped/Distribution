package typings.ionicCore

import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.mod.ComponentProps
import typings.ionicCore.mod.ComponentRef
import typings.ionicCore.mod.FrameworkDelegate
import typings.ionicCore.mod.Mode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalInterfaceMod {
  
  trait ModalOptions[T /* <: ComponentRef */] extends StObject {
    
    var animated: js.UndefOr[Boolean] = js.undefined
    
    var backdropDismiss: js.UndefOr[Boolean] = js.undefined
    
    var component: T
    
    var componentProps: js.UndefOr[ComponentProps[T]] = js.undefined
    
    var cssClass: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var delegate: js.UndefOr[FrameworkDelegate] = js.undefined
    
    var enterAnimation: js.UndefOr[AnimationBuilder] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var keyboardClose: js.UndefOr[Boolean] = js.undefined
    
    var leaveAnimation: js.UndefOr[AnimationBuilder] = js.undefined
    
    var mode: js.UndefOr[Mode] = js.undefined
    
    var presentingElement: js.UndefOr[HTMLElement] = js.undefined
    
    var showBackdrop: js.UndefOr[Boolean] = js.undefined
    
    var swipeToClose: js.UndefOr[Boolean] = js.undefined
  }
  object ModalOptions {
    
    inline def apply[T /* <: ComponentRef */](component: T): ModalOptions[T] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalOptions[T]]
    }
    
    extension [Self <: ModalOptions[?], T /* <: ComponentRef */](x: Self & ModalOptions[T]) {
      
      inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      inline def setBackdropDismiss(value: Boolean): Self = StObject.set(x, "backdropDismiss", value.asInstanceOf[js.Any])
      
      inline def setBackdropDismissUndefined: Self = StObject.set(x, "backdropDismiss", js.undefined)
      
      inline def setComponent(value: T): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentProps(value: ComponentProps[T]): Self = StObject.set(x, "componentProps", value.asInstanceOf[js.Any])
      
      inline def setComponentPropsUndefined: Self = StObject.set(x, "componentProps", js.undefined)
      
      inline def setCssClass(value: String | js.Array[String]): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setCssClassVarargs(value: String*): Self = StObject.set(x, "cssClass", js.Array(value :_*))
      
      inline def setDelegate(value: FrameworkDelegate): Self = StObject.set(x, "delegate", value.asInstanceOf[js.Any])
      
      inline def setDelegateUndefined: Self = StObject.set(x, "delegate", js.undefined)
      
      inline def setEnterAnimation(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "enterAnimation", js.Any.fromFunction2(value))
      
      inline def setEnterAnimationUndefined: Self = StObject.set(x, "enterAnimation", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setKeyboardClose(value: Boolean): Self = StObject.set(x, "keyboardClose", value.asInstanceOf[js.Any])
      
      inline def setKeyboardCloseUndefined: Self = StObject.set(x, "keyboardClose", js.undefined)
      
      inline def setLeaveAnimation(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "leaveAnimation", js.Any.fromFunction2(value))
      
      inline def setLeaveAnimationUndefined: Self = StObject.set(x, "leaveAnimation", js.undefined)
      
      inline def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setPresentingElement(value: HTMLElement): Self = StObject.set(x, "presentingElement", value.asInstanceOf[js.Any])
      
      inline def setPresentingElementUndefined: Self = StObject.set(x, "presentingElement", js.undefined)
      
      inline def setShowBackdrop(value: Boolean): Self = StObject.set(x, "showBackdrop", value.asInstanceOf[js.Any])
      
      inline def setShowBackdropUndefined: Self = StObject.set(x, "showBackdrop", js.undefined)
      
      inline def setSwipeToClose(value: Boolean): Self = StObject.set(x, "swipeToClose", value.asInstanceOf[js.Any])
      
      inline def setSwipeToCloseUndefined: Self = StObject.set(x, "swipeToClose", js.undefined)
    }
  }
}
