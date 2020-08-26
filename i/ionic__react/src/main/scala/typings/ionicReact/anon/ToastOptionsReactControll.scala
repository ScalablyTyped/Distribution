package typings.ionicReact.anon

import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.componentsMod.global.HTMLIonToastElement
import typings.ionicCore.mod.Color
import typings.ionicCore.mod.Mode
import typings.ionicCore.overlaysInterfaceMod.OverlayEventDetail
import typings.ionicCore.sanitizationMod.IonicSafeString
import typings.ionicReact.ionToastMod.ToastButton
import typings.ionicReact.ionicReactStrings.bottom
import typings.ionicReact.ionicReactStrings.middle
import typings.ionicReact.ionicReactStrings.top
import typings.react.mod.Key
import typings.react.mod.Ref
import typings.react.mod.RefObject
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @ionic/react.@ionic/react/dist/types/components/IonToast.ToastOptions & @ionic/react.@ionic/react/dist/types/components/createControllerComponent.ReactControllerProps & {  forwardedRef :react.react.RefObject<@ionic/core.@ionic/core/dist/types/components.<global>.HTMLIonToastElement> | undefined} & react.react.RefAttributes<@ionic/core.@ionic/core/dist/types/components.<global>.HTMLIonToastElement> */
@js.native
trait ToastOptionsReactControll extends js.Object {
  var animated: js.UndefOr[Boolean] = js.native
  var buttons: js.UndefOr[js.Array[ToastButton | String]] = js.native
  var color: js.UndefOr[Color] = js.native
  var cssClass: js.UndefOr[String | js.Array[String]] = js.native
  var duration: js.UndefOr[Double] = js.native
  var enterAnimation: js.UndefOr[AnimationBuilder] = js.native
  var forwardedRef: js.UndefOr[RefObject[HTMLIonToastElement]] = js.native
  var header: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var isOpen: Boolean = js.native
  var key: js.UndefOr[Key] = js.native
  var keyboardClose: js.UndefOr[Boolean] = js.native
  var leaveAnimation: js.UndefOr[AnimationBuilder] = js.native
  var message: js.UndefOr[String | IonicSafeString] = js.native
  var mode: js.UndefOr[Mode] = js.native
  var onDidDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[_]], Unit]] = js.native
  var onDidPresent: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[_]], Unit]] = js.native
  var onWillDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[_]], Unit]] = js.native
  var onWillPresent: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[_]], Unit]] = js.native
  var position: js.UndefOr[top | bottom | middle] = js.native
  var ref: js.UndefOr[Ref[HTMLIonToastElement]] = js.native
  var translucent: js.UndefOr[Boolean] = js.native
}

object ToastOptionsReactControll {
  @scala.inline
  def apply(isOpen: Boolean): ToastOptionsReactControll = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastOptionsReactControll]
  }
  @scala.inline
  implicit class ToastOptionsReactControllOps[Self <: ToastOptionsReactControll] (val x: Self) extends AnyVal {
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
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimated: Self = this.set("animated", js.undefined)
    @scala.inline
    def setButtonsVarargs(value: (ToastButton | String)*): Self = this.set("buttons", js.Array(value :_*))
    @scala.inline
    def setButtons(value: js.Array[ToastButton | String]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    @scala.inline
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
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
    def setForwardedRef(value: RefObject[HTMLIonToastElement]): Self = this.set("forwardedRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForwardedRef: Self = this.set("forwardedRef", js.undefined)
    @scala.inline
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
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
    def setMessage(value: String | IonicSafeString): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
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
    def setPosition(value: top | bottom | middle): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setRefFunction1(value: /* instance */ HTMLIonToastElement | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    @scala.inline
    def setRef(value: Ref[HTMLIonToastElement]): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
    @scala.inline
    def setTranslucent(value: Boolean): Self = this.set("translucent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslucent: Self = this.set("translucent", js.undefined)
  }
  
}

