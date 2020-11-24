package typings.materialToolbar.adapterMod

import typings.materialBase.typesMod.SpecificEventListener
import typings.materialToolbar.materialToolbarStrings.resize
import typings.materialToolbar.materialToolbarStrings.scroll
import typings.materialToolbar.typesMod.MDCToolbarEventDetail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MDCToolbarAdapter extends js.Object {
  
  def addClass(className: String): Unit = js.native
  
  @JSName("deregisterResizeHandler")
  def deregisterResizeHandler_resize(handler: SpecificEventListener[resize]): Unit = js.native
  
  @JSName("deregisterScrollHandler")
  def deregisterScrollHandler_scroll(handler: SpecificEventListener[scroll]): Unit = js.native
  
  def getFirstRowElementOffsetHeight(): Double = js.native
  
  def getOffsetHeight(): Double = js.native
  
  def getViewportScrollY(): Double = js.native
  
  def getViewportWidth(): Double = js.native
  
  def hasClass(className: String): Boolean = js.native
  
  def notifyChange(evtData: MDCToolbarEventDetail): Unit = js.native
  
  @JSName("registerResizeHandler")
  def registerResizeHandler_resize(handler: SpecificEventListener[resize]): Unit = js.native
  
  @JSName("registerScrollHandler")
  def registerScrollHandler_scroll(handler: SpecificEventListener[scroll]): Unit = js.native
  
  def removeClass(className: String): Unit = js.native
  
  def setStyle(property: String, value: String): Unit = js.native
  
  def setStyleForFixedAdjustElement(property: String, value: String): Unit = js.native
  
  def setStyleForFlexibleRowElement(property: String, value: String): Unit = js.native
  
  def setStyleForTitleElement(property: String, value: String): Unit = js.native
}
object MDCToolbarAdapter {
  
  @scala.inline
  def apply(
    addClass: String => Unit,
    deregisterResizeHandler: SpecificEventListener[resize] => Unit,
    deregisterScrollHandler: SpecificEventListener[scroll] => Unit,
    getFirstRowElementOffsetHeight: () => Double,
    getOffsetHeight: () => Double,
    getViewportScrollY: () => Double,
    getViewportWidth: () => Double,
    hasClass: String => Boolean,
    notifyChange: MDCToolbarEventDetail => Unit,
    registerResizeHandler: SpecificEventListener[resize] => Unit,
    registerScrollHandler: SpecificEventListener[scroll] => Unit,
    removeClass: String => Unit,
    setStyle: (String, String) => Unit,
    setStyleForFixedAdjustElement: (String, String) => Unit,
    setStyleForFlexibleRowElement: (String, String) => Unit,
    setStyleForTitleElement: (String, String) => Unit
  ): MDCToolbarAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), deregisterResizeHandler = js.Any.fromFunction1(deregisterResizeHandler), deregisterScrollHandler = js.Any.fromFunction1(deregisterScrollHandler), getFirstRowElementOffsetHeight = js.Any.fromFunction0(getFirstRowElementOffsetHeight), getOffsetHeight = js.Any.fromFunction0(getOffsetHeight), getViewportScrollY = js.Any.fromFunction0(getViewportScrollY), getViewportWidth = js.Any.fromFunction0(getViewportWidth), hasClass = js.Any.fromFunction1(hasClass), notifyChange = js.Any.fromFunction1(notifyChange), registerResizeHandler = js.Any.fromFunction1(registerResizeHandler), registerScrollHandler = js.Any.fromFunction1(registerScrollHandler), removeClass = js.Any.fromFunction1(removeClass), setStyle = js.Any.fromFunction2(setStyle), setStyleForFixedAdjustElement = js.Any.fromFunction2(setStyleForFixedAdjustElement), setStyleForFlexibleRowElement = js.Any.fromFunction2(setStyleForFlexibleRowElement), setStyleForTitleElement = js.Any.fromFunction2(setStyleForTitleElement))
    __obj.asInstanceOf[MDCToolbarAdapter]
  }
  
  @scala.inline
  implicit class MDCToolbarAdapterOps[Self <: MDCToolbarAdapter] (val x: Self) extends AnyVal {
    
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
    def setDeregisterResizeHandler(value: SpecificEventListener[resize] => Unit): Self = this.set("deregisterResizeHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeregisterScrollHandler(value: SpecificEventListener[scroll] => Unit): Self = this.set("deregisterScrollHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetFirstRowElementOffsetHeight(value: () => Double): Self = this.set("getFirstRowElementOffsetHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOffsetHeight(value: () => Double): Self = this.set("getOffsetHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetViewportScrollY(value: () => Double): Self = this.set("getViewportScrollY", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetViewportWidth(value: () => Double): Self = this.set("getViewportWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasClass(value: String => Boolean): Self = this.set("hasClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNotifyChange(value: MDCToolbarEventDetail => Unit): Self = this.set("notifyChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegisterResizeHandler(value: SpecificEventListener[resize] => Unit): Self = this.set("registerResizeHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegisterScrollHandler(value: SpecificEventListener[scroll] => Unit): Self = this.set("registerScrollHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveClass(value: String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStyle(value: (String, String) => Unit): Self = this.set("setStyle", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetStyleForFixedAdjustElement(value: (String, String) => Unit): Self = this.set("setStyleForFixedAdjustElement", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetStyleForFlexibleRowElement(value: (String, String) => Unit): Self = this.set("setStyleForFlexibleRowElement", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetStyleForTitleElement(value: (String, String) => Unit): Self = this.set("setStyleForTitleElement", js.Any.fromFunction2(value))
  }
}
