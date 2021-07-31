package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.ionicCoreStrings.ios
import typings.ionicCore.ionicCoreStrings.md
import typings.ionicCore.mod.ComponentProps
import typings.ionicCore.mod.ComponentRef
import typings.ionicCore.overlaysInterfaceMod.OverlayEventDetail
import typings.std.CustomEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonModal extends StObject {
  
  /**
    * If `true`, the modal will animate.
    */
  var animated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the modal will be dismissed when the backdrop is clicked.
    */
  var backdropDismiss: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The component to display inside of the modal.
    */
  var component: ComponentRef
  
  /**
    * The data to pass to the modal component.
    */
  var componentProps: js.UndefOr[ComponentProps[Null]] = js.undefined
  
  /**
    * Additional classes to apply for custom CSS. If multiple classes are provided they should be separated by spaces.
    */
  var cssClass: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * Animation to use when the modal is presented.
    */
  var enterAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  
  /**
    * If `true`, the keyboard will be automatically dismissed when the overlay is presented.
    */
  var keyboardClose: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Animation to use when the modal is dismissed.
    */
  var leaveAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  
  /**
    * Emitted after the modal has dismissed.
    */
  var onIonModalDidDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[js.Any]], Unit]] = js.undefined
  
  /**
    * Emitted after the modal has presented.
    */
  var onIonModalDidPresent: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted before the modal has dismissed.
    */
  var onIonModalWillDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[js.Any]], Unit]] = js.undefined
  
  /**
    * Emitted before the modal has presented.
    */
  var onIonModalWillPresent: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * The element that presented the modal. This is used for card presentation effects and for stacking multiple modals on top of each other. Only applies in iOS mode.
    */
  var presentingElement: js.UndefOr[HTMLElement] = js.undefined
  
  /**
    * If `true`, a backdrop will be displayed behind the modal.
    */
  var showBackdrop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the modal can be swiped to dismiss. Only applies in iOS mode.
    */
  var swipeToClose: js.UndefOr[Boolean] = js.undefined
}
object IonModal {
  
  @scala.inline
  def apply(): IonModal = {
    val __obj = js.Dynamic.literal(component = null)
    __obj.asInstanceOf[IonModal]
  }
  
  @scala.inline
  implicit class IonModalMutableBuilder[Self <: IonModal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    @scala.inline
    def setBackdropDismiss(value: Boolean): Self = StObject.set(x, "backdropDismiss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackdropDismissUndefined: Self = StObject.set(x, "backdropDismiss", js.undefined)
    
    @scala.inline
    def setComponent(value: ComponentRef): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentNull: Self = StObject.set(x, "component", null)
    
    @scala.inline
    def setComponentProps(value: ComponentProps[Null]): Self = StObject.set(x, "componentProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentPropsUndefined: Self = StObject.set(x, "componentProps", js.undefined)
    
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
    def setKeyboardClose(value: Boolean): Self = StObject.set(x, "keyboardClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardCloseUndefined: Self = StObject.set(x, "keyboardClose", js.undefined)
    
    @scala.inline
    def setLeaveAnimation(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "leaveAnimation", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLeaveAnimationUndefined: Self = StObject.set(x, "leaveAnimation", js.undefined)
    
    @scala.inline
    def setMode(value: ios | md): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setOnIonModalDidDismiss(value: /* event */ CustomEvent[OverlayEventDetail[js.Any]] => Unit): Self = StObject.set(x, "onIonModalDidDismiss", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonModalDidDismissUndefined: Self = StObject.set(x, "onIonModalDidDismiss", js.undefined)
    
    @scala.inline
    def setOnIonModalDidPresent(value: /* event */ CustomEvent[Unit] => Unit): Self = StObject.set(x, "onIonModalDidPresent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonModalDidPresentUndefined: Self = StObject.set(x, "onIonModalDidPresent", js.undefined)
    
    @scala.inline
    def setOnIonModalWillDismiss(value: /* event */ CustomEvent[OverlayEventDetail[js.Any]] => Unit): Self = StObject.set(x, "onIonModalWillDismiss", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonModalWillDismissUndefined: Self = StObject.set(x, "onIonModalWillDismiss", js.undefined)
    
    @scala.inline
    def setOnIonModalWillPresent(value: /* event */ CustomEvent[Unit] => Unit): Self = StObject.set(x, "onIonModalWillPresent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonModalWillPresentUndefined: Self = StObject.set(x, "onIonModalWillPresent", js.undefined)
    
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
