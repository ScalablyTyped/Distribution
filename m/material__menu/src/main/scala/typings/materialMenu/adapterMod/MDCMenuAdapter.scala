package typings.materialMenu.adapterMod

import typings.materialMenu.anon.Bottom
import typings.materialMenu.anon.Height
import typings.materialMenu.anon.Index
import typings.materialMenu.anon.Left
import typings.std.EventListener
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCMenuAdapter extends js.Object {
  def addClass(className: String): Unit
  def addClassForOptionAtIndex(index: Double, className: String): Unit
  def deregisterBodyClickHandler(handler: EventListener): Unit
  def deregisterInteractionHandler(`type`: String, handler: EventListener): Unit
  def focus(): Unit
  def focusItemAtIndex(index: Double): Unit
  def getAnchorDimensions(): Bottom
  def getAttributeForEventTarget(target: EventTarget, attributeName: String): String
  def getFocusedItemIndex(): Double
  def getIndexForEventTarget(target: EventTarget): Double
  def getInnerDimensions(): Height
  def getNumberOfItems(): Double
  def getWindowDimensions(): Height
  def hasAnchor(): Boolean
  def hasClass(className: String): Boolean
  def hasNecessaryDom(): Boolean
  def isFocused(): Boolean
  def isRtl(): Boolean
  def notifyCancel(): Unit
  def notifySelected(evtData: Index): Unit
  def registerBodyClickHandler(handler: EventListener): Unit
  def registerInteractionHandler(`type`: String, handler: EventListener): Unit
  def removeClass(className: String): Unit
  def restoreFocus(): Unit
  def rmAttrForOptionAtIndex(index: Double, attr: String): Unit
  def rmClassForOptionAtIndex(index: Double, className: String): Unit
  def saveFocus(): Unit
  def setAttrForOptionAtIndex(index: Double, attr: String, value: String): Unit
  def setMaxHeight(height: Double): Unit
  def setPosition(position: Left): Unit
  def setTransformOrigin(origin: String): Unit
}

object MDCMenuAdapter {
  @scala.inline
  def apply(
    addClass: String => Unit,
    addClassForOptionAtIndex: (Double, String) => Unit,
    deregisterBodyClickHandler: EventListener => Unit,
    deregisterInteractionHandler: (String, EventListener) => Unit,
    focus: () => Unit,
    focusItemAtIndex: Double => Unit,
    getAnchorDimensions: () => Bottom,
    getAttributeForEventTarget: (EventTarget, String) => String,
    getFocusedItemIndex: () => Double,
    getIndexForEventTarget: EventTarget => Double,
    getInnerDimensions: () => Height,
    getNumberOfItems: () => Double,
    getWindowDimensions: () => Height,
    hasAnchor: () => Boolean,
    hasClass: String => Boolean,
    hasNecessaryDom: () => Boolean,
    isFocused: () => Boolean,
    isRtl: () => Boolean,
    notifyCancel: () => Unit,
    notifySelected: Index => Unit,
    registerBodyClickHandler: EventListener => Unit,
    registerInteractionHandler: (String, EventListener) => Unit,
    removeClass: String => Unit,
    restoreFocus: () => Unit,
    rmAttrForOptionAtIndex: (Double, String) => Unit,
    rmClassForOptionAtIndex: (Double, String) => Unit,
    saveFocus: () => Unit,
    setAttrForOptionAtIndex: (Double, String, String) => Unit,
    setMaxHeight: Double => Unit,
    setPosition: Left => Unit,
    setTransformOrigin: String => Unit
  ): MDCMenuAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), addClassForOptionAtIndex = js.Any.fromFunction2(addClassForOptionAtIndex), deregisterBodyClickHandler = js.Any.fromFunction1(deregisterBodyClickHandler), deregisterInteractionHandler = js.Any.fromFunction2(deregisterInteractionHandler), focus = js.Any.fromFunction0(focus), focusItemAtIndex = js.Any.fromFunction1(focusItemAtIndex), getAnchorDimensions = js.Any.fromFunction0(getAnchorDimensions), getAttributeForEventTarget = js.Any.fromFunction2(getAttributeForEventTarget), getFocusedItemIndex = js.Any.fromFunction0(getFocusedItemIndex), getIndexForEventTarget = js.Any.fromFunction1(getIndexForEventTarget), getInnerDimensions = js.Any.fromFunction0(getInnerDimensions), getNumberOfItems = js.Any.fromFunction0(getNumberOfItems), getWindowDimensions = js.Any.fromFunction0(getWindowDimensions), hasAnchor = js.Any.fromFunction0(hasAnchor), hasClass = js.Any.fromFunction1(hasClass), hasNecessaryDom = js.Any.fromFunction0(hasNecessaryDom), isFocused = js.Any.fromFunction0(isFocused), isRtl = js.Any.fromFunction0(isRtl), notifyCancel = js.Any.fromFunction0(notifyCancel), notifySelected = js.Any.fromFunction1(notifySelected), registerBodyClickHandler = js.Any.fromFunction1(registerBodyClickHandler), registerInteractionHandler = js.Any.fromFunction2(registerInteractionHandler), removeClass = js.Any.fromFunction1(removeClass), restoreFocus = js.Any.fromFunction0(restoreFocus), rmAttrForOptionAtIndex = js.Any.fromFunction2(rmAttrForOptionAtIndex), rmClassForOptionAtIndex = js.Any.fromFunction2(rmClassForOptionAtIndex), saveFocus = js.Any.fromFunction0(saveFocus), setAttrForOptionAtIndex = js.Any.fromFunction3(setAttrForOptionAtIndex), setMaxHeight = js.Any.fromFunction1(setMaxHeight), setPosition = js.Any.fromFunction1(setPosition), setTransformOrigin = js.Any.fromFunction1(setTransformOrigin))
    __obj.asInstanceOf[MDCMenuAdapter]
  }
}

