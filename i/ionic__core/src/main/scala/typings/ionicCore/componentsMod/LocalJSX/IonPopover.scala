package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.ionicCoreStrings.ios
import typings.ionicCore.ionicCoreStrings.md
import typings.ionicCore.mod.ComponentProps
import typings.ionicCore.mod.ComponentRef
import typings.ionicCore.overlaysInterfaceMod.OverlayEventDetail
import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonPopover extends StObject {
  
  /**
    * If `true`, the popover will animate.
    */
  var animated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the popover will be dismissed when the backdrop is clicked.
    */
  var backdropDismiss: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The component to display inside of the popover.
    */
  var component: ComponentRef
  
  /**
    * The data to pass to the popover component.
    */
  var componentProps: js.UndefOr[ComponentProps[Null]] = js.undefined
  
  /**
    * Additional classes to apply for custom CSS. If multiple classes are provided they should be separated by spaces.
    */
  var cssClass: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * Animation to use when the popover is presented.
    */
  var enterAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  
  /**
    * The event to pass to the popover animation.
    */
  var event: js.UndefOr[js.Any] = js.undefined
  
  /**
    * If `true`, the keyboard will be automatically dismissed when the overlay is presented.
    */
  var keyboardClose: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Animation to use when the popover is dismissed.
    */
  var leaveAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  
  /**
    * Emitted after the popover has dismissed.
    */
  var onIonPopoverDidDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[js.Any]], Unit]] = js.undefined
  
  /**
    * Emitted after the popover has presented.
    */
  var onIonPopoverDidPresent: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted before the popover has dismissed.
    */
  var onIonPopoverWillDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[js.Any]], Unit]] = js.undefined
  
  /**
    * Emitted before the popover has presented.
    */
  var onIonPopoverWillPresent: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * If `true`, a backdrop will be displayed behind the popover.
    */
  var showBackdrop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the popover will be translucent. Only applies when the mode is `"ios"` and the device supports [`backdrop-filter`](https://developer.mozilla.org/en-US/docs/Web/CSS/backdrop-filter#Browser_compatibility).
    */
  var translucent: js.UndefOr[Boolean] = js.undefined
}
object IonPopover {
  
  inline def apply(): IonPopover = {
    val __obj = js.Dynamic.literal(component = null)
    __obj.asInstanceOf[IonPopover]
  }
  
  extension [Self <: IonPopover](x: Self) {
    
    inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    inline def setBackdropDismiss(value: Boolean): Self = StObject.set(x, "backdropDismiss", value.asInstanceOf[js.Any])
    
    inline def setBackdropDismissUndefined: Self = StObject.set(x, "backdropDismiss", js.undefined)
    
    inline def setComponent(value: ComponentRef): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentNull: Self = StObject.set(x, "component", null)
    
    inline def setComponentProps(value: ComponentProps[Null]): Self = StObject.set(x, "componentProps", value.asInstanceOf[js.Any])
    
    inline def setComponentPropsUndefined: Self = StObject.set(x, "componentProps", js.undefined)
    
    inline def setCssClass(value: String | js.Array[String]): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    
    inline def setCssClassVarargs(value: String*): Self = StObject.set(x, "cssClass", js.Array(value :_*))
    
    inline def setEnterAnimation(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "enterAnimation", js.Any.fromFunction2(value))
    
    inline def setEnterAnimationUndefined: Self = StObject.set(x, "enterAnimation", js.undefined)
    
    inline def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setKeyboardClose(value: Boolean): Self = StObject.set(x, "keyboardClose", value.asInstanceOf[js.Any])
    
    inline def setKeyboardCloseUndefined: Self = StObject.set(x, "keyboardClose", js.undefined)
    
    inline def setLeaveAnimation(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "leaveAnimation", js.Any.fromFunction2(value))
    
    inline def setLeaveAnimationUndefined: Self = StObject.set(x, "leaveAnimation", js.undefined)
    
    inline def setMode(value: ios | md): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOnIonPopoverDidDismiss(value: /* event */ CustomEvent[OverlayEventDetail[js.Any]] => Unit): Self = StObject.set(x, "onIonPopoverDidDismiss", js.Any.fromFunction1(value))
    
    inline def setOnIonPopoverDidDismissUndefined: Self = StObject.set(x, "onIonPopoverDidDismiss", js.undefined)
    
    inline def setOnIonPopoverDidPresent(value: /* event */ CustomEvent[Unit] => Unit): Self = StObject.set(x, "onIonPopoverDidPresent", js.Any.fromFunction1(value))
    
    inline def setOnIonPopoverDidPresentUndefined: Self = StObject.set(x, "onIonPopoverDidPresent", js.undefined)
    
    inline def setOnIonPopoverWillDismiss(value: /* event */ CustomEvent[OverlayEventDetail[js.Any]] => Unit): Self = StObject.set(x, "onIonPopoverWillDismiss", js.Any.fromFunction1(value))
    
    inline def setOnIonPopoverWillDismissUndefined: Self = StObject.set(x, "onIonPopoverWillDismiss", js.undefined)
    
    inline def setOnIonPopoverWillPresent(value: /* event */ CustomEvent[Unit] => Unit): Self = StObject.set(x, "onIonPopoverWillPresent", js.Any.fromFunction1(value))
    
    inline def setOnIonPopoverWillPresentUndefined: Self = StObject.set(x, "onIonPopoverWillPresent", js.undefined)
    
    inline def setShowBackdrop(value: Boolean): Self = StObject.set(x, "showBackdrop", value.asInstanceOf[js.Any])
    
    inline def setShowBackdropUndefined: Self = StObject.set(x, "showBackdrop", js.undefined)
    
    inline def setTranslucent(value: Boolean): Self = StObject.set(x, "translucent", value.asInstanceOf[js.Any])
    
    inline def setTranslucentUndefined: Self = StObject.set(x, "translucent", js.undefined)
  }
}
