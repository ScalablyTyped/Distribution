package typings.materialTextfield.anon

import typings.materialBase.typesMod.EventType
import typings.materialBase.typesMod.SpecificEventListener
import typings.materialTextfield.typesMod.MDCTextFieldNativeInputElement
import typings.std.MutationObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material/textfield.@material/textfield/adapter.MDCTextFieldAdapter> */
@js.native
trait PartialMDCTextFieldAdapte extends js.Object {
  var activateLineRipple: js.UndefOr[js.Function0[Unit]] = js.native
  var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  var closeOutline: js.UndefOr[js.Function0[Unit]] = js.native
  var deactivateLineRipple: js.UndefOr[js.Function0[Unit]] = js.native
  var deregisterInputInteractionHandler: js.UndefOr[
    js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
  ] = js.native
  var deregisterTextFieldInteractionHandler: js.UndefOr[
    js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
  ] = js.native
  var deregisterValidationAttributeChangeHandler: js.UndefOr[js.Function1[/* observer */ MutationObserver, Unit]] = js.native
  var floatLabel: js.UndefOr[js.Function1[/* shouldFloat */ Boolean, Unit]] = js.native
  var getLabelWidth: js.UndefOr[js.Function0[Double]] = js.native
  var getNativeInput: js.UndefOr[js.Function0[MDCTextFieldNativeInputElement | Null]] = js.native
  var hasClass: js.UndefOr[js.Function1[/* className */ String, Boolean]] = js.native
  var hasLabel: js.UndefOr[js.Function0[Boolean]] = js.native
  var hasOutline: js.UndefOr[js.Function0[Boolean]] = js.native
  var isFocused: js.UndefOr[js.Function0[Boolean]] = js.native
  var notchOutline: js.UndefOr[js.Function1[/* labelWidth */ Double, Unit]] = js.native
  var registerInputInteractionHandler: js.UndefOr[
    js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
  ] = js.native
  var registerTextFieldInteractionHandler: js.UndefOr[
    js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
  ] = js.native
  var registerValidationAttributeChangeHandler: js.UndefOr[
    js.Function1[
      /* handler */ js.Function1[/* attributeNames */ js.Array[String], Unit], 
      MutationObserver
    ]
  ] = js.native
  var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  var setLabelRequired: js.UndefOr[js.Function1[/* isRequired */ Boolean, Unit]] = js.native
  var setLineRippleTransformOrigin: js.UndefOr[js.Function1[/* normalizedX */ Double, Unit]] = js.native
  var shakeLabel: js.UndefOr[js.Function1[/* shouldShake */ Boolean, Unit]] = js.native
}

object PartialMDCTextFieldAdapte {
  @scala.inline
  def apply(): PartialMDCTextFieldAdapte = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCTextFieldAdapte]
  }
  @scala.inline
  implicit class PartialMDCTextFieldAdapteOps[Self <: PartialMDCTextFieldAdapte] (val x: Self) extends AnyVal {
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
    def setActivateLineRipple(value: () => Unit): Self = this.set("activateLineRipple", js.Any.fromFunction0(value))
    @scala.inline
    def deleteActivateLineRipple: Self = this.set("activateLineRipple", js.undefined)
    @scala.inline
    def setAddClass(value: /* className */ String => Unit): Self = this.set("addClass", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAddClass: Self = this.set("addClass", js.undefined)
    @scala.inline
    def setCloseOutline(value: () => Unit): Self = this.set("closeOutline", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCloseOutline: Self = this.set("closeOutline", js.undefined)
    @scala.inline
    def setDeactivateLineRipple(value: () => Unit): Self = this.set("deactivateLineRipple", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDeactivateLineRipple: Self = this.set("deactivateLineRipple", js.undefined)
    @scala.inline
    def setDeregisterInputInteractionHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = this.set("deregisterInputInteractionHandler", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDeregisterInputInteractionHandler: Self = this.set("deregisterInputInteractionHandler", js.undefined)
    @scala.inline
    def setDeregisterTextFieldInteractionHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = this.set("deregisterTextFieldInteractionHandler", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDeregisterTextFieldInteractionHandler: Self = this.set("deregisterTextFieldInteractionHandler", js.undefined)
    @scala.inline
    def setDeregisterValidationAttributeChangeHandler(value: /* observer */ MutationObserver => Unit): Self = this.set("deregisterValidationAttributeChangeHandler", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDeregisterValidationAttributeChangeHandler: Self = this.set("deregisterValidationAttributeChangeHandler", js.undefined)
    @scala.inline
    def setFloatLabel(value: /* shouldFloat */ Boolean => Unit): Self = this.set("floatLabel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFloatLabel: Self = this.set("floatLabel", js.undefined)
    @scala.inline
    def setGetLabelWidth(value: () => Double): Self = this.set("getLabelWidth", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetLabelWidth: Self = this.set("getLabelWidth", js.undefined)
    @scala.inline
    def setGetNativeInput(value: () => MDCTextFieldNativeInputElement | Null): Self = this.set("getNativeInput", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetNativeInput: Self = this.set("getNativeInput", js.undefined)
    @scala.inline
    def setHasClass(value: /* className */ String => Boolean): Self = this.set("hasClass", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHasClass: Self = this.set("hasClass", js.undefined)
    @scala.inline
    def setHasLabel(value: () => Boolean): Self = this.set("hasLabel", js.Any.fromFunction0(value))
    @scala.inline
    def deleteHasLabel: Self = this.set("hasLabel", js.undefined)
    @scala.inline
    def setHasOutline(value: () => Boolean): Self = this.set("hasOutline", js.Any.fromFunction0(value))
    @scala.inline
    def deleteHasOutline: Self = this.set("hasOutline", js.undefined)
    @scala.inline
    def setIsFocused(value: () => Boolean): Self = this.set("isFocused", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsFocused: Self = this.set("isFocused", js.undefined)
    @scala.inline
    def setNotchOutline(value: /* labelWidth */ Double => Unit): Self = this.set("notchOutline", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNotchOutline: Self = this.set("notchOutline", js.undefined)
    @scala.inline
    def setRegisterInputInteractionHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = this.set("registerInputInteractionHandler", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRegisterInputInteractionHandler: Self = this.set("registerInputInteractionHandler", js.undefined)
    @scala.inline
    def setRegisterTextFieldInteractionHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Unit): Self = this.set("registerTextFieldInteractionHandler", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRegisterTextFieldInteractionHandler: Self = this.set("registerTextFieldInteractionHandler", js.undefined)
    @scala.inline
    def setRegisterValidationAttributeChangeHandler(value: /* handler */ js.Function1[/* attributeNames */ js.Array[String], Unit] => MutationObserver): Self = this.set("registerValidationAttributeChangeHandler", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRegisterValidationAttributeChangeHandler: Self = this.set("registerValidationAttributeChangeHandler", js.undefined)
    @scala.inline
    def setRemoveClass(value: /* className */ String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemoveClass: Self = this.set("removeClass", js.undefined)
    @scala.inline
    def setSetLabelRequired(value: /* isRequired */ Boolean => Unit): Self = this.set("setLabelRequired", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetLabelRequired: Self = this.set("setLabelRequired", js.undefined)
    @scala.inline
    def setSetLineRippleTransformOrigin(value: /* normalizedX */ Double => Unit): Self = this.set("setLineRippleTransformOrigin", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetLineRippleTransformOrigin: Self = this.set("setLineRippleTransformOrigin", js.undefined)
    @scala.inline
    def setShakeLabel(value: /* shouldShake */ Boolean => Unit): Self = this.set("shakeLabel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteShakeLabel: Self = this.set("shakeLabel", js.undefined)
  }
  
}

