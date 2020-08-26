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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @ionic/core.@ionic/core.PickerOptions & @ionic/react.@ionic/react/dist/types/components/createControllerComponent.ReactControllerProps & {  forwardedRef :react.react.RefObject<@ionic/core.@ionic/core/dist/types/components.<global>.HTMLIonPickerElement> | undefined} & react.react.RefAttributes<@ionic/core.@ionic/core/dist/types/components.<global>.HTMLIonPickerElement> */
@js.native
trait PickerOptionsReactControl extends js.Object {
  var animated: js.UndefOr[Boolean] = js.native
  var backdropDismiss: js.UndefOr[Boolean] = js.native
  var buttons: js.UndefOr[js.Array[PickerButton]] = js.native
  var columns: js.Array[PickerColumn] = js.native
  var cssClass: js.UndefOr[String | js.Array[String]] = js.native
  var enterAnimation: js.UndefOr[AnimationBuilder] = js.native
  var forwardedRef: js.UndefOr[RefObject[HTMLIonPickerElement]] = js.native
  var id: js.UndefOr[String] = js.native
  var isOpen: Boolean = js.native
  var key: js.UndefOr[Key] = js.native
  var keyboardClose: js.UndefOr[Boolean] = js.native
  var leaveAnimation: js.UndefOr[AnimationBuilder] = js.native
  var mode: js.UndefOr[Mode] = js.native
  var onDidDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[_]], Unit]] = js.native
  var onDidPresent: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[_]], Unit]] = js.native
  var onWillDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[_]], Unit]] = js.native
  var onWillPresent: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[_]], Unit]] = js.native
  var ref: js.UndefOr[Ref[HTMLIonPickerElement]] = js.native
  var showBackdrop: js.UndefOr[Boolean] = js.native
}

object PickerOptionsReactControl {
  @scala.inline
  def apply(columns: js.Array[PickerColumn], isOpen: Boolean): PickerOptionsReactControl = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerOptionsReactControl]
  }
  @scala.inline
  implicit class PickerOptionsReactControlOps[Self <: PickerOptionsReactControl] (val x: Self) extends AnyVal {
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
    def setColumnsVarargs(value: PickerColumn*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[PickerColumn]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
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
    def setCssClassVarargs(value: String*): Self = this.set("cssClass", js.Array(value :_*))
    @scala.inline
    def setCssClass(value: String | js.Array[String]): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    @scala.inline
    def setEnterAnimation(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = this.set("enterAnimation", js.Any.fromFunction2(value))
    @scala.inline
    def deleteEnterAnimation: Self = this.set("enterAnimation", js.undefined)
    @scala.inline
    def setForwardedRef(value: RefObject[HTMLIonPickerElement]): Self = this.set("forwardedRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForwardedRef: Self = this.set("forwardedRef", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setKeyboardClose(value: Boolean): Self = this.set("keyboardClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboardClose: Self = this.set("keyboardClose", js.undefined)
    @scala.inline
    def setLeaveAnimation(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = this.set("leaveAnimation", js.Any.fromFunction2(value))
    @scala.inline
    def deleteLeaveAnimation: Self = this.set("leaveAnimation", js.undefined)
    @scala.inline
    def setMode(value: Mode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setOnDidDismiss(value: /* event */ CustomEvent[OverlayEventDetail[_]] => Unit): Self = this.set("onDidDismiss", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDidDismiss: Self = this.set("onDidDismiss", js.undefined)
    @scala.inline
    def setOnDidPresent(value: /* event */ CustomEvent[OverlayEventDetail[_]] => Unit): Self = this.set("onDidPresent", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDidPresent: Self = this.set("onDidPresent", js.undefined)
    @scala.inline
    def setOnWillDismiss(value: /* event */ CustomEvent[OverlayEventDetail[_]] => Unit): Self = this.set("onWillDismiss", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnWillDismiss: Self = this.set("onWillDismiss", js.undefined)
    @scala.inline
    def setOnWillPresent(value: /* event */ CustomEvent[OverlayEventDetail[_]] => Unit): Self = this.set("onWillPresent", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnWillPresent: Self = this.set("onWillPresent", js.undefined)
    @scala.inline
    def setRefFunction1(value: /* instance */ HTMLIonPickerElement | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    @scala.inline
    def setRef(value: Ref[HTMLIonPickerElement]): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
    @scala.inline
    def setShowBackdrop(value: Boolean): Self = this.set("showBackdrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowBackdrop: Self = this.set("showBackdrop", js.undefined)
  }
  
}

