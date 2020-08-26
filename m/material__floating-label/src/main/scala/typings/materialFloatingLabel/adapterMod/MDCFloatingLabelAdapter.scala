package typings.materialFloatingLabel.adapterMod

import typings.materialBase.typesMod.EventType
import typings.materialBase.typesMod.SpecificEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCFloatingLabelAdapter extends js.Object {
  /**
    * Adds a class to the label element.
    */
  def addClass(className: String): Unit = js.native
  /**
    * Deregisters an event listener on the root element for a given event.
    */
  def deregisterInteractionHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit = js.native
  /**
    * Returns the width of the label element.
    */
  def getWidth(): Double = js.native
  /**
    * Registers an event listener on the root element for a given event.
    */
  def registerInteractionHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit = js.native
  /**
    * Removes a class from the label element.
    */
  def removeClass(className: String): Unit = js.native
}

object MDCFloatingLabelAdapter {
  @scala.inline
  def apply(
    addClass: String => Unit,
    deregisterInteractionHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
    getWidth: () => Double,
    registerInteractionHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
    removeClass: String => Unit
  ): MDCFloatingLabelAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), deregisterInteractionHandler = js.Any.fromFunction2(deregisterInteractionHandler), getWidth = js.Any.fromFunction0(getWidth), registerInteractionHandler = js.Any.fromFunction2(registerInteractionHandler), removeClass = js.Any.fromFunction1(removeClass))
    __obj.asInstanceOf[MDCFloatingLabelAdapter]
  }
  @scala.inline
  implicit class MDCFloatingLabelAdapterOps[Self <: MDCFloatingLabelAdapter] (val x: Self) extends AnyVal {
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
    def setDeregisterInteractionHandler(value: (js.Any, SpecificEventListener[js.Any]) => Unit): Self = this.set("deregisterInteractionHandler", js.Any.fromFunction2(value))
    @scala.inline
    def setGetWidth(value: () => Double): Self = this.set("getWidth", js.Any.fromFunction0(value))
    @scala.inline
    def setRegisterInteractionHandler(value: (js.Any, SpecificEventListener[js.Any]) => Unit): Self = this.set("registerInteractionHandler", js.Any.fromFunction2(value))
    @scala.inline
    def setRemoveClass(value: String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
  }
  
}

