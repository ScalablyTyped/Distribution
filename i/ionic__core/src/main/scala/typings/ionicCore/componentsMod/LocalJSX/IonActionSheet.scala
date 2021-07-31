package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.actionSheetInterfaceMod.ActionSheetButton
import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.ionicCoreStrings.ios
import typings.ionicCore.ionicCoreStrings.md
import typings.ionicCore.overlaysInterfaceMod.OverlayEventDetail
import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonActionSheet extends StObject {
  
  /**
    * If `true`, the action sheet will animate.
    */
  var animated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the action sheet will be dismissed when the backdrop is clicked.
    */
  var backdropDismiss: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An array of buttons for the action sheet.
    */
  var buttons: js.UndefOr[js.Array[ActionSheetButton | String]] = js.undefined
  
  /**
    * Additional classes to apply for custom CSS. If multiple classes are provided they should be separated by spaces.
    */
  var cssClass: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * Animation to use when the action sheet is presented.
    */
  var enterAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  
  /**
    * Title for the action sheet.
    */
  var header: js.UndefOr[String] = js.undefined
  
  /**
    * If `true`, the keyboard will be automatically dismissed when the overlay is presented.
    */
  var keyboardClose: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Animation to use when the action sheet is dismissed.
    */
  var leaveAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  
  /**
    * Emitted after the alert has dismissed.
    */
  var onIonActionSheetDidDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[js.Any]], Unit]] = js.undefined
  
  /**
    * Emitted after the alert has presented.
    */
  var onIonActionSheetDidPresent: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted before the alert has dismissed.
    */
  var onIonActionSheetWillDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[js.Any]], Unit]] = js.undefined
  
  /**
    * Emitted before the alert has presented.
    */
  var onIonActionSheetWillPresent: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Subtitle for the action sheet.
    */
  var subHeader: js.UndefOr[String] = js.undefined
  
  /**
    * If `true`, the action sheet will be translucent. Only applies when the mode is `"ios"` and the device supports [`backdrop-filter`](https://developer.mozilla.org/en-US/docs/Web/CSS/backdrop-filter#Browser_compatibility).
    */
  var translucent: js.UndefOr[Boolean] = js.undefined
}
object IonActionSheet {
  
  @scala.inline
  def apply(): IonActionSheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonActionSheet]
  }
  
  @scala.inline
  implicit class IonActionSheetMutableBuilder[Self <: IonActionSheet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    @scala.inline
    def setBackdropDismiss(value: Boolean): Self = StObject.set(x, "backdropDismiss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackdropDismissUndefined: Self = StObject.set(x, "backdropDismiss", js.undefined)
    
    @scala.inline
    def setButtons(value: js.Array[ActionSheetButton | String]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    @scala.inline
    def setButtonsVarargs(value: (ActionSheetButton | String)*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
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
    def setOnIonActionSheetDidDismiss(value: /* event */ CustomEvent[OverlayEventDetail[js.Any]] => Unit): Self = StObject.set(x, "onIonActionSheetDidDismiss", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonActionSheetDidDismissUndefined: Self = StObject.set(x, "onIonActionSheetDidDismiss", js.undefined)
    
    @scala.inline
    def setOnIonActionSheetDidPresent(value: /* event */ CustomEvent[Unit] => Unit): Self = StObject.set(x, "onIonActionSheetDidPresent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonActionSheetDidPresentUndefined: Self = StObject.set(x, "onIonActionSheetDidPresent", js.undefined)
    
    @scala.inline
    def setOnIonActionSheetWillDismiss(value: /* event */ CustomEvent[OverlayEventDetail[js.Any]] => Unit): Self = StObject.set(x, "onIonActionSheetWillDismiss", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonActionSheetWillDismissUndefined: Self = StObject.set(x, "onIonActionSheetWillDismiss", js.undefined)
    
    @scala.inline
    def setOnIonActionSheetWillPresent(value: /* event */ CustomEvent[Unit] => Unit): Self = StObject.set(x, "onIonActionSheetWillPresent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonActionSheetWillPresentUndefined: Self = StObject.set(x, "onIonActionSheetWillPresent", js.undefined)
    
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
