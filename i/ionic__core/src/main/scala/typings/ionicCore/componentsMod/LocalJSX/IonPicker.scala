package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.ionicCoreStrings.ios
import typings.ionicCore.ionicCoreStrings.md
import typings.ionicCore.overlaysInterfaceMod.OverlayEventDetail
import typings.ionicCore.pickerInterfaceMod.PickerButton
import typings.ionicCore.pickerInterfaceMod.PickerColumn
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonPicker extends js.Object {
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
  implicit class IonPickerOps[Self <: IonPicker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimated: Self = this.set("animated", js.undefined)
    @scala.inline
    def setBackdropDismiss(value: Boolean): Self = this.set("backdropDismiss", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackdropDismiss: Self = this.set("backdropDismiss", js.undefined)
    @scala.inline
    def setButtonsVarargs(value: PickerButton*): Self = this.set("buttons", js.Array(value :_*))
    @scala.inline
    def setButtons(value: js.Array[PickerButton]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    @scala.inline
    def setColumnsVarargs(value: PickerColumn*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[PickerColumn]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setCssClassVarargs(value: String*): Self = this.set("cssClass", js.Array(value :_*))
    @scala.inline
    def setCssClass(value: String | js.Array[String]): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setEnterAnimation(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = this.set("enterAnimation", js.Any.fromFunction2(value))
    @scala.inline
    def deleteEnterAnimation: Self = this.set("enterAnimation", js.undefined)
    @scala.inline
    def setKeyboardClose(value: Boolean): Self = this.set("keyboardClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboardClose: Self = this.set("keyboardClose", js.undefined)
    @scala.inline
    def setLeaveAnimation(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = this.set("leaveAnimation", js.Any.fromFunction2(value))
    @scala.inline
    def deleteLeaveAnimation: Self = this.set("leaveAnimation", js.undefined)
    @scala.inline
    def setMode(value: ios | md): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setOnIonPickerDidDismiss(value: /* event */ CustomEvent[OverlayEventDetail[_]] => Unit): Self = this.set("onIonPickerDidDismiss", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIonPickerDidDismiss: Self = this.set("onIonPickerDidDismiss", js.undefined)
    @scala.inline
    def setOnIonPickerDidPresent(value: /* event */ CustomEvent[Unit] => Unit): Self = this.set("onIonPickerDidPresent", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIonPickerDidPresent: Self = this.set("onIonPickerDidPresent", js.undefined)
    @scala.inline
    def setOnIonPickerWillDismiss(value: /* event */ CustomEvent[OverlayEventDetail[_]] => Unit): Self = this.set("onIonPickerWillDismiss", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIonPickerWillDismiss: Self = this.set("onIonPickerWillDismiss", js.undefined)
    @scala.inline
    def setOnIonPickerWillPresent(value: /* event */ CustomEvent[Unit] => Unit): Self = this.set("onIonPickerWillPresent", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIonPickerWillPresent: Self = this.set("onIonPickerWillPresent", js.undefined)
    @scala.inline
    def setShowBackdrop(value: Boolean): Self = this.set("showBackdrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowBackdrop: Self = this.set("showBackdrop", js.undefined)
  }
  
}

