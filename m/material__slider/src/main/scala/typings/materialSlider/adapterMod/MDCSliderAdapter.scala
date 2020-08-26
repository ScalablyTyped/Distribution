package typings.materialSlider.adapterMod

import typings.materialBase.typesMod.EventType
import typings.materialBase.typesMod.SpecificEventListener
import typings.materialSlider.materialSliderStrings.resize
import typings.std.ClientRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCSliderAdapter extends js.Object {
  /**
    * Adds a class to the slider Element
    */
  def addClass(className: String): Unit = js.native
  /**
    * Returns the bounding client rect for the slider Element
    */
  def computeBoundingRect(): ClientRect = js.native
  /**
    * Deregisters an event handler on the body for a given event.
    */
  def deregisterBodyInteractionHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit = js.native
  /**
    * Deregisters an event handler on the root element for a given event.
    */
  def deregisterInteractionHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit = js.native
  /**
    * Deregisters an event handler for the window resize event
    */
  @JSName("deregisterResizeHandler")
  def deregisterResizeHandler_resize(handler: SpecificEventListener[resize]): Unit = js.native
  /**
    * Deregisters an event handler on the thumb container element for a given
    * event.
    */
  def deregisterThumbContainerInteractionHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit = js.native
  /**
    * Returns a string if attribute name exists on the slider Element, otherwise
    * returns null
    */
  def getAttribute(name: String): String | Null = js.native
  /**
    * Returns the tab index of the slider Element
    */
  def getTabIndex(): Double = js.native
  /**
    * Returns true if className exists for the slider Element
    */
  def hasClass(className: String): Boolean = js.native
  /**
    * Returns true if the root element is RTL, otherwise false
    */
  def isRTL(): Boolean = js.native
  /**
    * Emits a custom event MDCSlider:change from the root
    */
  def notifyChange(): Unit = js.native
  /**
    * Emits a custom event MDCSlider:input from the root
    */
  def notifyInput(): Unit = js.native
  /**
    * Registers an event handler on the body for a given event.
    */
  def registerBodyInteractionHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit = js.native
  /**
    * Registers an event handler on the root element for a given event.
    */
  def registerInteractionHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit = js.native
  /**
    * Registers an event handler for the window resize event
    */
  @JSName("registerResizeHandler")
  def registerResizeHandler_resize(handler: SpecificEventListener[resize]): Unit = js.native
  /**
    * Registers an event handler on the thumb container element for a given
    * event.
    */
  def registerThumbContainerInteractionHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit = js.native
  /**
    * Removes attribute name from slider Element
    */
  def removeAttribute(name: String): Unit = js.native
  /**
    * Removes a class from the slider Element
    */
  def removeClass(className: String): Unit = js.native
  /**
    * Sets attribute name on slider Element to value
    */
  def setAttribute(name: String, value: String): Unit = js.native
  /**
    * Sets the inner text of the pin marker to the passed value
    */
  def setMarkerValue(value: Double): Unit = js.native
  /**
    * Sets a style property of the thumb container element to the passed value
    */
  def setThumbContainerStyleProperty(propertyName: String, value: String): Unit = js.native
  /**
    * Send track markers numbers to setup mark container element
    */
  def setTrackMarkers(step: Double, max: Double, min: Double): Unit = js.native
  /**
    * Sets a style property of the track element to the passed value
    */
  def setTrackStyleProperty(propertyName: String, value: String): Unit = js.native
}

object MDCSliderAdapter {
  @scala.inline
  def apply(
    addClass: String => Unit,
    computeBoundingRect: () => ClientRect,
    deregisterBodyInteractionHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
    deregisterInteractionHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
    deregisterResizeHandler: SpecificEventListener[resize] => Unit,
    deregisterThumbContainerInteractionHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
    getAttribute: String => String | Null,
    getTabIndex: () => Double,
    hasClass: String => Boolean,
    isRTL: () => Boolean,
    notifyChange: () => Unit,
    notifyInput: () => Unit,
    registerBodyInteractionHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
    registerInteractionHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
    registerResizeHandler: SpecificEventListener[resize] => Unit,
    registerThumbContainerInteractionHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
    removeAttribute: String => Unit,
    removeClass: String => Unit,
    setAttribute: (String, String) => Unit,
    setMarkerValue: Double => Unit,
    setThumbContainerStyleProperty: (String, String) => Unit,
    setTrackMarkers: (Double, Double, Double) => Unit,
    setTrackStyleProperty: (String, String) => Unit
  ): MDCSliderAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), computeBoundingRect = js.Any.fromFunction0(computeBoundingRect), deregisterBodyInteractionHandler = js.Any.fromFunction2(deregisterBodyInteractionHandler), deregisterInteractionHandler = js.Any.fromFunction2(deregisterInteractionHandler), deregisterResizeHandler = js.Any.fromFunction1(deregisterResizeHandler), deregisterThumbContainerInteractionHandler = js.Any.fromFunction2(deregisterThumbContainerInteractionHandler), getAttribute = js.Any.fromFunction1(getAttribute), getTabIndex = js.Any.fromFunction0(getTabIndex), hasClass = js.Any.fromFunction1(hasClass), isRTL = js.Any.fromFunction0(isRTL), notifyChange = js.Any.fromFunction0(notifyChange), notifyInput = js.Any.fromFunction0(notifyInput), registerBodyInteractionHandler = js.Any.fromFunction2(registerBodyInteractionHandler), registerInteractionHandler = js.Any.fromFunction2(registerInteractionHandler), registerResizeHandler = js.Any.fromFunction1(registerResizeHandler), registerThumbContainerInteractionHandler = js.Any.fromFunction2(registerThumbContainerInteractionHandler), removeAttribute = js.Any.fromFunction1(removeAttribute), removeClass = js.Any.fromFunction1(removeClass), setAttribute = js.Any.fromFunction2(setAttribute), setMarkerValue = js.Any.fromFunction1(setMarkerValue), setThumbContainerStyleProperty = js.Any.fromFunction2(setThumbContainerStyleProperty), setTrackMarkers = js.Any.fromFunction3(setTrackMarkers), setTrackStyleProperty = js.Any.fromFunction2(setTrackStyleProperty))
    __obj.asInstanceOf[MDCSliderAdapter]
  }
  @scala.inline
  implicit class MDCSliderAdapterOps[Self <: MDCSliderAdapter] (val x: Self) extends AnyVal {
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
    def setComputeBoundingRect(value: () => ClientRect): Self = this.set("computeBoundingRect", js.Any.fromFunction0(value))
    @scala.inline
    def setDeregisterBodyInteractionHandler(value: (js.Any, SpecificEventListener[js.Any]) => Unit): Self = this.set("deregisterBodyInteractionHandler", js.Any.fromFunction2(value))
    @scala.inline
    def setDeregisterInteractionHandler(value: (js.Any, SpecificEventListener[js.Any]) => Unit): Self = this.set("deregisterInteractionHandler", js.Any.fromFunction2(value))
    @scala.inline
    def setDeregisterResizeHandler(value: SpecificEventListener[resize] => Unit): Self = this.set("deregisterResizeHandler", js.Any.fromFunction1(value))
    @scala.inline
    def setDeregisterThumbContainerInteractionHandler(value: (js.Any, SpecificEventListener[js.Any]) => Unit): Self = this.set("deregisterThumbContainerInteractionHandler", js.Any.fromFunction2(value))
    @scala.inline
    def setGetAttribute(value: String => String | Null): Self = this.set("getAttribute", js.Any.fromFunction1(value))
    @scala.inline
    def setGetTabIndex(value: () => Double): Self = this.set("getTabIndex", js.Any.fromFunction0(value))
    @scala.inline
    def setHasClass(value: String => Boolean): Self = this.set("hasClass", js.Any.fromFunction1(value))
    @scala.inline
    def setIsRTL(value: () => Boolean): Self = this.set("isRTL", js.Any.fromFunction0(value))
    @scala.inline
    def setNotifyChange(value: () => Unit): Self = this.set("notifyChange", js.Any.fromFunction0(value))
    @scala.inline
    def setNotifyInput(value: () => Unit): Self = this.set("notifyInput", js.Any.fromFunction0(value))
    @scala.inline
    def setRegisterBodyInteractionHandler(value: (js.Any, SpecificEventListener[js.Any]) => Unit): Self = this.set("registerBodyInteractionHandler", js.Any.fromFunction2(value))
    @scala.inline
    def setRegisterInteractionHandler(value: (js.Any, SpecificEventListener[js.Any]) => Unit): Self = this.set("registerInteractionHandler", js.Any.fromFunction2(value))
    @scala.inline
    def setRegisterResizeHandler(value: SpecificEventListener[resize] => Unit): Self = this.set("registerResizeHandler", js.Any.fromFunction1(value))
    @scala.inline
    def setRegisterThumbContainerInteractionHandler(value: (js.Any, SpecificEventListener[js.Any]) => Unit): Self = this.set("registerThumbContainerInteractionHandler", js.Any.fromFunction2(value))
    @scala.inline
    def setRemoveAttribute(value: String => Unit): Self = this.set("removeAttribute", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveClass(value: String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
    @scala.inline
    def setSetAttribute(value: (String, String) => Unit): Self = this.set("setAttribute", js.Any.fromFunction2(value))
    @scala.inline
    def setSetMarkerValue(value: Double => Unit): Self = this.set("setMarkerValue", js.Any.fromFunction1(value))
    @scala.inline
    def setSetThumbContainerStyleProperty(value: (String, String) => Unit): Self = this.set("setThumbContainerStyleProperty", js.Any.fromFunction2(value))
    @scala.inline
    def setSetTrackMarkers(value: (Double, Double, Double) => Unit): Self = this.set("setTrackMarkers", js.Any.fromFunction3(value))
    @scala.inline
    def setSetTrackStyleProperty(value: (String, String) => Unit): Self = this.set("setTrackStyleProperty", js.Any.fromFunction2(value))
  }
  
}

