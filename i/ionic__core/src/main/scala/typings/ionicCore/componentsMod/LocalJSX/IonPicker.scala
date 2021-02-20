package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.ionicCoreStrings.ios
import typings.ionicCore.ionicCoreStrings.md
import typings.ionicCore.overlaysInterfaceMod.OverlayEventDetail
import typings.ionicCore.pickerInterfaceMod.PickerButton
import typings.ionicCore.pickerInterfaceMod.PickerColumn
import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonPicker extends StObject {
  
  /**
    * If `true`, the picker will animate.
    */
  var animated: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, the picker will be dismissed when the backdrop is clicked.
    */
  var backdropDismiss: js.UndefOr[Boolean] = js.native
  
  /**
    * Array of buttons to be displayed at the top of the picker.
    */
  var buttons: js.UndefOr[js.Array[PickerButton]] = js.native
  
  /**
    * Array of columns to be displayed in the picker.
    */
  var columns: js.UndefOr[js.Array[PickerColumn]] = js.native
  
  /**
    * Additional classes to apply for custom CSS. If multiple classes are provided they should be separated by spaces.
    */
  var cssClass: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * Number of milliseconds to wait before dismissing the picker.
    */
  var duration: js.UndefOr[Double] = js.native
  
  /**
    * Animation to use when the picker is presented.
    */
  var enterAnimation: js.UndefOr[AnimationBuilder] = js.native
  
  /**
    * If `true`, the keyboard will be automatically dismissed when the overlay is presented.
    */
  var keyboardClose: js.UndefOr[Boolean] = js.native
  
  /**
    * Animation to use when the picker is dismissed.
    */
  var leaveAnimation: js.UndefOr[AnimationBuilder] = js.native
  
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.native
  
  /**
    * Emitted after the picker has dismissed.
    */
  var onIonPickerDidDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[_]], Unit]] = js.native
  
  /**
    * Emitted after the picker has presented.
    */
  var onIonPickerDidPresent: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.native
  
  /**
    * Emitted before the picker has dismissed.
    */
  var onIonPickerWillDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[_]], Unit]] = js.native
  
  /**
    * Emitted before the picker has presented.
    */
  var onIonPickerWillPresent: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.native
  
  /**
    * If `true`, a backdrop will be displayed behind the picker.
    */
  var showBackdrop: js.UndefOr[Boolean] = js.native
}
object IonPicker {
  
  @scala.inline
  def apply(): IonPicker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonPicker]
  }
  
  @scala.inline
  implicit class IonPickerMutableBuilder[Self <: IonPicker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    @scala.inline
    def setBackdropDismiss(value: Boolean): Self = StObject.set(x, "backdropDismiss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackdropDismissUndefined: Self = StObject.set(x, "backdropDismiss", js.undefined)
    
    @scala.inline
    def setButtons(value: js.Array[PickerButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    @scala.inline
    def setButtonsVarargs(value: PickerButton*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[PickerColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: PickerColumn*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setCssClass(value: String | js.Array[String]): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    
    @scala.inline
    def setCssClassVarargs(value: String*): Self = StObject.set(x, "cssClass", js.Array(value :_*))
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
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
    def setOnIonPickerDidDismiss(value: /* event */ CustomEvent[OverlayEventDetail[_]] => Unit): Self = StObject.set(x, "onIonPickerDidDismiss", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonPickerDidDismissUndefined: Self = StObject.set(x, "onIonPickerDidDismiss", js.undefined)
    
    @scala.inline
    def setOnIonPickerDidPresent(value: /* event */ CustomEvent[Unit] => Unit): Self = StObject.set(x, "onIonPickerDidPresent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonPickerDidPresentUndefined: Self = StObject.set(x, "onIonPickerDidPresent", js.undefined)
    
    @scala.inline
    def setOnIonPickerWillDismiss(value: /* event */ CustomEvent[OverlayEventDetail[_]] => Unit): Self = StObject.set(x, "onIonPickerWillDismiss", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonPickerWillDismissUndefined: Self = StObject.set(x, "onIonPickerWillDismiss", js.undefined)
    
    @scala.inline
    def setOnIonPickerWillPresent(value: /* event */ CustomEvent[Unit] => Unit): Self = StObject.set(x, "onIonPickerWillPresent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonPickerWillPresentUndefined: Self = StObject.set(x, "onIonPickerWillPresent", js.undefined)
    
    @scala.inline
    def setShowBackdrop(value: Boolean): Self = StObject.set(x, "showBackdrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowBackdropUndefined: Self = StObject.set(x, "showBackdrop", js.undefined)
  }
}
