package typings.materialSlider.adapterMod

import typings.materialBase.typesMod.EventType
import typings.materialBase.typesMod.SpecificEventListener
import typings.materialSlider.typesMod.Thumb
import typings.materialSlider.typesMod.TickMark
import typings.std.ClientRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MDCSliderAdapter extends js.Object {
  
  /**
    * Adds the given class to the slider root element.
    */
  def addClass(className: String): Unit = js.native
  
  /**
    * Adds the class to the given thumb element.
    */
  def addThumbClass(className: String, thumb: Thumb): Unit = js.native
  
  /**
    * Deregisters an event listener on the body element.
    */
  def deregisterBodyEventHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit = js.native
  
  /**
    * Deregisters an event listener on the root element.
    */
  def deregisterEventHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit = js.native
  
  /**
    * Deregisters an event listener on the given thumb element.
    */
  def deregisterThumbEventHandler[K /* <: EventType */](thumb: Thumb, evtType: K, handler: SpecificEventListener[K]): Unit = js.native
  
  /**
    * Deregisters an event listener on the window.
    */
  def deregisterWindowEventHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit = js.native
  
  /**
    * Emits a `change` event from the slider root, indicating that the value
    * has been changed and committed on the given thumb, from a user event.
    * Mirrors the native `change` event:
    * https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/change_event
    */
  def emitChangeEvent(value: Double, thumb: Thumb): Unit = js.native
  
  /**
    * Emits an event on drag end, containing the final value on the
    * thumb that was dragged.
    */
  def emitDragEndEvent(value: Double, thumb: Thumb): Unit = js.native
  
  /**
    * Emits an event on drag start, containing the current value on the
    * thumb being dragged.
    */
  def emitDragStartEvent(value: Double, thumb: Thumb): Unit = js.native
  
  /**
    * Emits an `input` event from the slider root, indicating that the value
    * has been changed on the given thumb, from a user event.
    * Mirrors the native `input` event:
    * https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/input_event
    */
  def emitInputEvent(value: Double, thumb: Thumb): Unit = js.native
  
  /**
    * Adds browser focus to the given thumb.
    */
  def focusThumb(thumb: Thumb): Unit = js.native
  
  /**
    * @return Returns the given attribute value on the slider root element.
    */
  def getAttribute(attribute: String): String | Null = js.native
  
  /**
    * @return Returns the bounding client rect for the slider root element.
    */
  def getBoundingClientRect(): ClientRect = js.native
  
  /**
    * - If thumb is `Thumb.START`, returns the value on the start thumb
    *   (for range slider variant).
    * - If thumb is `Thumb.END`, returns the value on the end thumb (or
    *   only thumb for single point slider).
    */
  def getThumbAttribute(attribute: String, thumb: Thumb): String | Null = js.native
  
  /**
    * @return Returns the bounding client rect of the given thumb.
    */
  def getThumbBoundingClientRect(thumb: Thumb): ClientRect = js.native
  
  /**
    * @return Returns the width of the given thumb knob.
    */
  def getThumbKnobWidth(thumb: Thumb): Double = js.native
  
  /**
    * Returns a function that maps the slider value to the value of the
    * `aria-valuetext` attribute on the thumb element. If null, the
    * `aria-valuetext` attribute is unchanged when the value changes.
    */
  def getValueToAriaValueTextFn(): (js.Function1[/* value */ Double, String]) | Null = js.native
  
  /**
    * @return Returns true if the slider root element has the given class.
    */
  def hasClass(className: String): Boolean = js.native
  
  /**
    * @return Returns true if the root element is RTL, otherwise false
    */
  def isRTL(): Boolean = js.native
  
  /**
    * @return Returns true if the given thumb is focused.
    */
  def isThumbFocused(thumb: Thumb): Boolean = js.native
  
  /**
    * Registers an event listener on the body element.
    */
  def registerBodyEventHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit = js.native
  
  /**
    * Registers an event listener on the root element.
    */
  def registerEventHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit = js.native
  
  /**
    * Registers an event listener on the given thumb element.
    */
  def registerThumbEventHandler[K /* <: EventType */](thumb: Thumb, evtType: K, handler: SpecificEventListener[K]): Unit = js.native
  
  /**
    * Registers an event listener on the window.
    */
  def registerWindowEventHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit = js.native
  
  /**
    * Removes the given class from the slider root element.
    */
  def removeClass(className: String): Unit = js.native
  
  /**
    * Removes the class from the given thumb element.
    */
  def removeThumbClass(className: String, thumb: Thumb): Unit = js.native
  
  /**
    * Removes the given style property from the thumb element.
    * - If thumb is `Thumb.START`, removes style from the start thumb (for
    *   range slider variant).
    * - If thumb is `Thumb.END`, removes style from the end thumb (or only thumb
    *   for single point slider).
    */
  def removeThumbStyleProperty(propertyName: String, thumb: Thumb): Unit = js.native
  
  /**
    * Removes the given style property from the active track element.
    */
  def removeTrackActiveStyleProperty(propertyName: String): Unit = js.native
  
  /**
    * Sets pointer capture on the slider root.
    * https://developer.mozilla.org/en-US/docs/Web/API/Element/setPointerCapture
    */
  def setPointerCapture(pointerId: Double): Unit = js.native
  
  /**
    * - If thumb is `Thumb.START`, sets the attribute on the start thumb
    *   (for range slider variant).
    * - If thumb is `Thumb.END`, sets the attribute on the end thumb (or
    *   only thumb for single point slider).
    */
  def setThumbAttribute(attribute: String, value: String, thumb: Thumb): Unit = js.native
  
  /**
    * Sets a style property of the thumb element to the passed value.
    * - If thumb is `Thumb.START`, sets style on the start thumb (for
    *   range slider variant).
    * - If thumb is `Thumb.END`, sets style on the end thumb (or only thumb
    *   for single point slider).
    */
  def setThumbStyleProperty(propertyName: String, value: String, thumb: Thumb): Unit = js.native
  
  /**
    * Sets a style property of the active track element to the passed value.
    */
  def setTrackActiveStyleProperty(propertyName: String, value: String): Unit = js.native
  
  /**
    * Sets value indicator text based on the given value.
    * - If thumb is `Thumb.START`, updates value indicator on start thumb
    *   (for range slider variant).
    * - If thumb is `Thumb.END`, updates value indicator on end thumb (or
    *   only thumb for single point slider).
    */
  def setValueIndicatorText(value: Double, thumb: Thumb): Unit = js.native
  
  /**
    * Updates tick marks container element with tick mark elements and their
    * active/inactive classes, based on the given mappings:
    * - TickMark.ACTIVE => `cssClasses.TICK_MARK_ACTIVE`
    * - TickMark.INACTIVE => `cssClasses.TICK_MARK_INACTIVE`
    */
  def updateTickMarks(tickMarks: js.Array[TickMark]): Unit = js.native
}
object MDCSliderAdapter {
  
  @scala.inline
  def apply(
    addClass: String => Unit,
    addThumbClass: (String, Thumb) => Unit,
    deregisterBodyEventHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
    deregisterEventHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
    deregisterThumbEventHandler: (Thumb, js.Any, SpecificEventListener[js.Any]) => Unit,
    deregisterWindowEventHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
    emitChangeEvent: (Double, Thumb) => Unit,
    emitDragEndEvent: (Double, Thumb) => Unit,
    emitDragStartEvent: (Double, Thumb) => Unit,
    emitInputEvent: (Double, Thumb) => Unit,
    focusThumb: Thumb => Unit,
    getAttribute: String => String | Null,
    getBoundingClientRect: () => ClientRect,
    getThumbAttribute: (String, Thumb) => String | Null,
    getThumbBoundingClientRect: Thumb => ClientRect,
    getThumbKnobWidth: Thumb => Double,
    getValueToAriaValueTextFn: () => (js.Function1[/* value */ Double, String]) | Null,
    hasClass: String => Boolean,
    isRTL: () => Boolean,
    isThumbFocused: Thumb => Boolean,
    registerBodyEventHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
    registerEventHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
    registerThumbEventHandler: (Thumb, js.Any, SpecificEventListener[js.Any]) => Unit,
    registerWindowEventHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
    removeClass: String => Unit,
    removeThumbClass: (String, Thumb) => Unit,
    removeThumbStyleProperty: (String, Thumb) => Unit,
    removeTrackActiveStyleProperty: String => Unit,
    setPointerCapture: Double => Unit,
    setThumbAttribute: (String, String, Thumb) => Unit,
    setThumbStyleProperty: (String, String, Thumb) => Unit,
    setTrackActiveStyleProperty: (String, String) => Unit,
    setValueIndicatorText: (Double, Thumb) => Unit,
    updateTickMarks: js.Array[TickMark] => Unit
  ): MDCSliderAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), addThumbClass = js.Any.fromFunction2(addThumbClass), deregisterBodyEventHandler = js.Any.fromFunction2(deregisterBodyEventHandler), deregisterEventHandler = js.Any.fromFunction2(deregisterEventHandler), deregisterThumbEventHandler = js.Any.fromFunction3(deregisterThumbEventHandler), deregisterWindowEventHandler = js.Any.fromFunction2(deregisterWindowEventHandler), emitChangeEvent = js.Any.fromFunction2(emitChangeEvent), emitDragEndEvent = js.Any.fromFunction2(emitDragEndEvent), emitDragStartEvent = js.Any.fromFunction2(emitDragStartEvent), emitInputEvent = js.Any.fromFunction2(emitInputEvent), focusThumb = js.Any.fromFunction1(focusThumb), getAttribute = js.Any.fromFunction1(getAttribute), getBoundingClientRect = js.Any.fromFunction0(getBoundingClientRect), getThumbAttribute = js.Any.fromFunction2(getThumbAttribute), getThumbBoundingClientRect = js.Any.fromFunction1(getThumbBoundingClientRect), getThumbKnobWidth = js.Any.fromFunction1(getThumbKnobWidth), getValueToAriaValueTextFn = js.Any.fromFunction0(getValueToAriaValueTextFn), hasClass = js.Any.fromFunction1(hasClass), isRTL = js.Any.fromFunction0(isRTL), isThumbFocused = js.Any.fromFunction1(isThumbFocused), registerBodyEventHandler = js.Any.fromFunction2(registerBodyEventHandler), registerEventHandler = js.Any.fromFunction2(registerEventHandler), registerThumbEventHandler = js.Any.fromFunction3(registerThumbEventHandler), registerWindowEventHandler = js.Any.fromFunction2(registerWindowEventHandler), removeClass = js.Any.fromFunction1(removeClass), removeThumbClass = js.Any.fromFunction2(removeThumbClass), removeThumbStyleProperty = js.Any.fromFunction2(removeThumbStyleProperty), removeTrackActiveStyleProperty = js.Any.fromFunction1(removeTrackActiveStyleProperty), setPointerCapture = js.Any.fromFunction1(setPointerCapture), setThumbAttribute = js.Any.fromFunction3(setThumbAttribute), setThumbStyleProperty = js.Any.fromFunction3(setThumbStyleProperty), setTrackActiveStyleProperty = js.Any.fromFunction2(setTrackActiveStyleProperty), setValueIndicatorText = js.Any.fromFunction2(setValueIndicatorText), updateTickMarks = js.Any.fromFunction1(updateTickMarks))
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
    def setAddThumbClass(value: (String, Thumb) => Unit): Self = this.set("addThumbClass", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDeregisterBodyEventHandler(value: (js.Any, SpecificEventListener[js.Any]) => Unit): Self = this.set("deregisterBodyEventHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDeregisterEventHandler(value: (js.Any, SpecificEventListener[js.Any]) => Unit): Self = this.set("deregisterEventHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDeregisterThumbEventHandler(value: (Thumb, js.Any, SpecificEventListener[js.Any]) => Unit): Self = this.set("deregisterThumbEventHandler", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDeregisterWindowEventHandler(value: (js.Any, SpecificEventListener[js.Any]) => Unit): Self = this.set("deregisterWindowEventHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEmitChangeEvent(value: (Double, Thumb) => Unit): Self = this.set("emitChangeEvent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEmitDragEndEvent(value: (Double, Thumb) => Unit): Self = this.set("emitDragEndEvent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEmitDragStartEvent(value: (Double, Thumb) => Unit): Self = this.set("emitDragStartEvent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEmitInputEvent(value: (Double, Thumb) => Unit): Self = this.set("emitInputEvent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFocusThumb(value: Thumb => Unit): Self = this.set("focusThumb", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAttribute(value: String => String | Null): Self = this.set("getAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetBoundingClientRect(value: () => ClientRect): Self = this.set("getBoundingClientRect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetThumbAttribute(value: (String, Thumb) => String | Null): Self = this.set("getThumbAttribute", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetThumbBoundingClientRect(value: Thumb => ClientRect): Self = this.set("getThumbBoundingClientRect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetThumbKnobWidth(value: Thumb => Double): Self = this.set("getThumbKnobWidth", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetValueToAriaValueTextFn(value: () => (js.Function1[/* value */ Double, String]) | Null): Self = this.set("getValueToAriaValueTextFn", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasClass(value: String => Boolean): Self = this.set("hasClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsRTL(value: () => Boolean): Self = this.set("isRTL", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsThumbFocused(value: Thumb => Boolean): Self = this.set("isThumbFocused", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegisterBodyEventHandler(value: (js.Any, SpecificEventListener[js.Any]) => Unit): Self = this.set("registerBodyEventHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRegisterEventHandler(value: (js.Any, SpecificEventListener[js.Any]) => Unit): Self = this.set("registerEventHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRegisterThumbEventHandler(value: (Thumb, js.Any, SpecificEventListener[js.Any]) => Unit): Self = this.set("registerThumbEventHandler", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRegisterWindowEventHandler(value: (js.Any, SpecificEventListener[js.Any]) => Unit): Self = this.set("registerWindowEventHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveClass(value: String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveThumbClass(value: (String, Thumb) => Unit): Self = this.set("removeThumbClass", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveThumbStyleProperty(value: (String, Thumb) => Unit): Self = this.set("removeThumbStyleProperty", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveTrackActiveStyleProperty(value: String => Unit): Self = this.set("removeTrackActiveStyleProperty", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPointerCapture(value: Double => Unit): Self = this.set("setPointerCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetThumbAttribute(value: (String, String, Thumb) => Unit): Self = this.set("setThumbAttribute", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetThumbStyleProperty(value: (String, String, Thumb) => Unit): Self = this.set("setThumbStyleProperty", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetTrackActiveStyleProperty(value: (String, String) => Unit): Self = this.set("setTrackActiveStyleProperty", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetValueIndicatorText(value: (Double, Thumb) => Unit): Self = this.set("setValueIndicatorText", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdateTickMarks(value: js.Array[TickMark] => Unit): Self = this.set("updateTickMarks", js.Any.fromFunction1(value))
  }
}
