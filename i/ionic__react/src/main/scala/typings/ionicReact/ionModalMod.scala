package typings.ionicReact

import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.mod.FrameworkDelegate
import typings.ionicCore.mod.Mode
import typings.ionicReact.anon.childrenReactNodeforwarde
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ionModalMod {
  
  @JSImport("@ionic/react/dist/types/components/IonModal", "IonModal")
  @js.native
  val IonModal: ForwardRefExoticComponent[childrenReactNodeforwarde] = js.native
  
  /* Inlined std.Omit<@ionic/core.@ionic/core.ModalOptions<@ionic/core.@ionic/core.ComponentRef>, 'component' | 'componentProps'> & {  children :react.react.ReactNode} */
  trait ReactModalOptions extends StObject {
    
    var animated: js.UndefOr[Boolean] = js.undefined
    
    var backdropDismiss: js.UndefOr[Boolean] = js.undefined
    
    var children: ReactNode
    
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
  object ReactModalOptions {
    
    @scala.inline
    def apply(): ReactModalOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactModalOptions]
    }
    
    @scala.inline
    implicit class ReactModalOptionsMutableBuilder[Self <: ReactModalOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      @scala.inline
      def setBackdropDismiss(value: Boolean): Self = StObject.set(x, "backdropDismiss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackdropDismissUndefined: Self = StObject.set(x, "backdropDismiss", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
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
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
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
      def setPresentingElement(value: HTMLElement): Self = StObject.set(x, "presentingElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPresentingElementUndefined: Self = StObject.set(x, "presentingElement", js.undefined)
      
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
}
