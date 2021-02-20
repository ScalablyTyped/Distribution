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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonPopover extends StObject {
  
  /**
    * If `true`, the popover will animate.
    */
  var animated: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, the popover will be dismissed when the backdrop is clicked.
    */
  var backdropDismiss: js.UndefOr[Boolean] = js.native
  
  /**
    * The component to display inside of the popover.
    */
  var component: ComponentRef = js.native
  
  /**
    * The data to pass to the popover component.
    */
  var componentProps: js.UndefOr[ComponentProps[Null]] = js.native
  
  /**
    * Additional classes to apply for custom CSS. If multiple classes are provided they should be separated by spaces.
    */
  var cssClass: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * Animation to use when the popover is presented.
    */
  var enterAnimation: js.UndefOr[AnimationBuilder] = js.native
  
  /**
    * The event to pass to the popover animation.
    */
  var event: js.UndefOr[js.Any] = js.native
  
  /**
    * If `true`, the keyboard will be automatically dismissed when the overlay is presented.
    */
  var keyboardClose: js.UndefOr[Boolean] = js.native
  
  /**
    * Animation to use when the popover is dismissed.
    */
  var leaveAnimation: js.UndefOr[AnimationBuilder] = js.native
  
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.native
  
  /**
    * Emitted after the popover has dismissed.
    */
  var onIonPopoverDidDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[_]], Unit]] = js.native
  
  /**
    * Emitted after the popover has presented.
    */
  var onIonPopoverDidPresent: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.native
  
  /**
    * Emitted before the popover has dismissed.
    */
  var onIonPopoverWillDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[_]], Unit]] = js.native
  
  /**
    * Emitted before the popover has presented.
    */
  var onIonPopoverWillPresent: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.native
  
  /**
    * If `true`, a backdrop will be displayed behind the popover.
    */
  var showBackdrop: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, the popover will be translucent. Only applies when the mode is `"ios"` and the device supports [`backdrop-filter`](https://developer.mozilla.org/en-US/docs/Web/CSS/backdrop-filter#Browser_compatibility).
    */
  var translucent: js.UndefOr[Boolean] = js.native
}
object IonPopover {
  
  @scala.inline
  def apply(): IonPopover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonPopover]
  }
  
  @scala.inline
  implicit class IonPopoverMutableBuilder[Self <: IonPopover] (val x: Self) extends AnyVal {
    
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
    def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
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
    def setOnIonPopoverDidDismiss(value: /* event */ CustomEvent[OverlayEventDetail[_]] => Unit): Self = StObject.set(x, "onIonPopoverDidDismiss", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonPopoverDidDismissUndefined: Self = StObject.set(x, "onIonPopoverDidDismiss", js.undefined)
    
    @scala.inline
    def setOnIonPopoverDidPresent(value: /* event */ CustomEvent[Unit] => Unit): Self = StObject.set(x, "onIonPopoverDidPresent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonPopoverDidPresentUndefined: Self = StObject.set(x, "onIonPopoverDidPresent", js.undefined)
    
    @scala.inline
    def setOnIonPopoverWillDismiss(value: /* event */ CustomEvent[OverlayEventDetail[_]] => Unit): Self = StObject.set(x, "onIonPopoverWillDismiss", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonPopoverWillDismissUndefined: Self = StObject.set(x, "onIonPopoverWillDismiss", js.undefined)
    
    @scala.inline
    def setOnIonPopoverWillPresent(value: /* event */ CustomEvent[Unit] => Unit): Self = StObject.set(x, "onIonPopoverWillPresent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonPopoverWillPresentUndefined: Self = StObject.set(x, "onIonPopoverWillPresent", js.undefined)
    
    @scala.inline
    def setShowBackdrop(value: Boolean): Self = StObject.set(x, "showBackdrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowBackdropUndefined: Self = StObject.set(x, "showBackdrop", js.undefined)
    
    @scala.inline
    def setTranslucent(value: Boolean): Self = StObject.set(x, "translucent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslucentUndefined: Self = StObject.set(x, "translucent", js.undefined)
  }
}
