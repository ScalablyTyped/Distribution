package typings.materialTextfield.adapterMod

import typings.materialBase.typesMod.EventType
import typings.materialBase.typesMod.SpecificEventListener
import typings.std.MutationObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCTextFieldRootAdapter extends js.Object {
  /**
    * Adds a class to the root Element.
    */
  def addClass(className: String): Unit = js.native
  /**
    * Deregisters an event handler on the root element for a given event.
    */
  def deregisterTextFieldInteractionHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit = js.native
  /**
    * Disconnects a validation attribute observer on the input element.
    */
  def deregisterValidationAttributeChangeHandler(observer: MutationObserver): Unit = js.native
  /**
    * @return true if the root element contains the given class name.
    */
  def hasClass(className: String): Boolean = js.native
  /**
    * Registers an event handler on the root element for a given event.
    */
  def registerTextFieldInteractionHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit = js.native
  /**
    * Registers a validation attribute change listener on the input element.
    * Handler accepts list of attribute names.
    */
  def registerValidationAttributeChangeHandler(handler: js.Function1[/* attributeNames */ js.Array[String], Unit]): MutationObserver = js.native
  /**
    * Removes a class from the root Element.
    */
  def removeClass(className: String): Unit = js.native
}

object MDCTextFieldRootAdapter {
  @scala.inline
  def apply(
    addClass: String => Unit,
    deregisterTextFieldInteractionHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
    deregisterValidationAttributeChangeHandler: MutationObserver => Unit,
    hasClass: String => Boolean,
    registerTextFieldInteractionHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
    registerValidationAttributeChangeHandler: js.Function1[/* attributeNames */ js.Array[String], Unit] => MutationObserver,
    removeClass: String => Unit
  ): MDCTextFieldRootAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), deregisterTextFieldInteractionHandler = js.Any.fromFunction2(deregisterTextFieldInteractionHandler), deregisterValidationAttributeChangeHandler = js.Any.fromFunction1(deregisterValidationAttributeChangeHandler), hasClass = js.Any.fromFunction1(hasClass), registerTextFieldInteractionHandler = js.Any.fromFunction2(registerTextFieldInteractionHandler), registerValidationAttributeChangeHandler = js.Any.fromFunction1(registerValidationAttributeChangeHandler), removeClass = js.Any.fromFunction1(removeClass))
    __obj.asInstanceOf[MDCTextFieldRootAdapter]
  }
  @scala.inline
  implicit class MDCTextFieldRootAdapterOps[Self <: MDCTextFieldRootAdapter] (val x: Self) extends AnyVal {
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
    def setAddClass(value: String => Unit): Self = this.set("addClass", js.Any.fromFunction1(value))
    @scala.inline
    def setDeregisterTextFieldInteractionHandler(value: (js.Any, SpecificEventListener[js.Any]) => Unit): Self = this.set("deregisterTextFieldInteractionHandler", js.Any.fromFunction2(value))
    @scala.inline
    def setDeregisterValidationAttributeChangeHandler(value: MutationObserver => Unit): Self = this.set("deregisterValidationAttributeChangeHandler", js.Any.fromFunction1(value))
    @scala.inline
    def setHasClass(value: String => Boolean): Self = this.set("hasClass", js.Any.fromFunction1(value))
    @scala.inline
    def setRegisterTextFieldInteractionHandler(value: (js.Any, SpecificEventListener[js.Any]) => Unit): Self = this.set("registerTextFieldInteractionHandler", js.Any.fromFunction2(value))
    @scala.inline
    def setRegisterValidationAttributeChangeHandler(value: js.Function1[/* attributeNames */ js.Array[String], Unit] => MutationObserver): Self = this.set("registerValidationAttributeChangeHandler", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveClass(value: String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
  }
  
}

