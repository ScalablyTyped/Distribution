package typings
package atMaterialMenuLib.adapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCMenuAdapter extends js.Object {
  def addClass(className: java.lang.String): scala.Unit
  def addClassForOptionAtIndex(index: scala.Double, className: java.lang.String): scala.Unit
  def deregisterBodyClickHandler(handler: stdLib.EventListener): scala.Unit
  def deregisterInteractionHandler(`type`: java.lang.String, handler: stdLib.EventListener): scala.Unit
  def focus(): scala.Unit
  def focusItemAtIndex(index: scala.Double): scala.Unit
  def getAnchorDimensions(): atMaterialMenuLib.Anon_Bottom
  def getAttributeForEventTarget(target: stdLib.EventTarget, attributeName: java.lang.String): java.lang.String
  def getFocusedItemIndex(): scala.Double
  def getIndexForEventTarget(target: stdLib.EventTarget): scala.Double
  def getInnerDimensions(): atMaterialMenuLib.Anon_Height
  def getNumberOfItems(): scala.Double
  def getWindowDimensions(): atMaterialMenuLib.Anon_Height
  def hasAnchor(): scala.Boolean
  def hasClass(className: java.lang.String): scala.Boolean
  def hasNecessaryDom(): scala.Boolean
  def isFocused(): scala.Boolean
  def isRtl(): scala.Boolean
  def notifyCancel(): scala.Unit
  def notifySelected(evtData: atMaterialMenuLib.Anon_Index): scala.Unit
  def registerBodyClickHandler(handler: stdLib.EventListener): scala.Unit
  def registerInteractionHandler(`type`: java.lang.String, handler: stdLib.EventListener): scala.Unit
  def removeClass(className: java.lang.String): scala.Unit
  def restoreFocus(): scala.Unit
  def rmAttrForOptionAtIndex(index: scala.Double, attr: java.lang.String): scala.Unit
  def rmClassForOptionAtIndex(index: scala.Double, className: java.lang.String): scala.Unit
  def saveFocus(): scala.Unit
  def setAttrForOptionAtIndex(index: scala.Double, attr: java.lang.String, value: java.lang.String): scala.Unit
  def setMaxHeight(height: scala.Double): scala.Unit
  def setPosition(position: atMaterialMenuLib.Anon_BottomLeft): scala.Unit
  def setTransformOrigin(origin: java.lang.String): scala.Unit
}

object MDCMenuAdapter {
  @scala.inline
  def apply(
    addClass: java.lang.String => scala.Unit,
    addClassForOptionAtIndex: (scala.Double, java.lang.String) => scala.Unit,
    deregisterBodyClickHandler: stdLib.EventListener => scala.Unit,
    deregisterInteractionHandler: (java.lang.String, stdLib.EventListener) => scala.Unit,
    focus: () => scala.Unit,
    focusItemAtIndex: scala.Double => scala.Unit,
    getAnchorDimensions: () => atMaterialMenuLib.Anon_Bottom,
    getAttributeForEventTarget: (stdLib.EventTarget, java.lang.String) => java.lang.String,
    getFocusedItemIndex: () => scala.Double,
    getIndexForEventTarget: stdLib.EventTarget => scala.Double,
    getInnerDimensions: () => atMaterialMenuLib.Anon_Height,
    getNumberOfItems: () => scala.Double,
    getWindowDimensions: () => atMaterialMenuLib.Anon_Height,
    hasAnchor: () => scala.Boolean,
    hasClass: java.lang.String => scala.Boolean,
    hasNecessaryDom: () => scala.Boolean,
    isFocused: () => scala.Boolean,
    isRtl: () => scala.Boolean,
    notifyCancel: () => scala.Unit,
    notifySelected: atMaterialMenuLib.Anon_Index => scala.Unit,
    registerBodyClickHandler: stdLib.EventListener => scala.Unit,
    registerInteractionHandler: (java.lang.String, stdLib.EventListener) => scala.Unit,
    removeClass: java.lang.String => scala.Unit,
    restoreFocus: () => scala.Unit,
    rmAttrForOptionAtIndex: (scala.Double, java.lang.String) => scala.Unit,
    rmClassForOptionAtIndex: (scala.Double, java.lang.String) => scala.Unit,
    saveFocus: () => scala.Unit,
    setAttrForOptionAtIndex: (scala.Double, java.lang.String, java.lang.String) => scala.Unit,
    setMaxHeight: scala.Double => scala.Unit,
    setPosition: atMaterialMenuLib.Anon_BottomLeft => scala.Unit,
    setTransformOrigin: java.lang.String => scala.Unit
  ): MDCMenuAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), addClassForOptionAtIndex = js.Any.fromFunction2(addClassForOptionAtIndex), deregisterBodyClickHandler = js.Any.fromFunction1(deregisterBodyClickHandler), deregisterInteractionHandler = js.Any.fromFunction2(deregisterInteractionHandler), focus = js.Any.fromFunction0(focus), focusItemAtIndex = js.Any.fromFunction1(focusItemAtIndex), getAnchorDimensions = js.Any.fromFunction0(getAnchorDimensions), getAttributeForEventTarget = js.Any.fromFunction2(getAttributeForEventTarget), getFocusedItemIndex = js.Any.fromFunction0(getFocusedItemIndex), getIndexForEventTarget = js.Any.fromFunction1(getIndexForEventTarget), getInnerDimensions = js.Any.fromFunction0(getInnerDimensions), getNumberOfItems = js.Any.fromFunction0(getNumberOfItems), getWindowDimensions = js.Any.fromFunction0(getWindowDimensions), hasAnchor = js.Any.fromFunction0(hasAnchor), hasClass = js.Any.fromFunction1(hasClass), hasNecessaryDom = js.Any.fromFunction0(hasNecessaryDom), isFocused = js.Any.fromFunction0(isFocused), isRtl = js.Any.fromFunction0(isRtl), notifyCancel = js.Any.fromFunction0(notifyCancel), notifySelected = js.Any.fromFunction1(notifySelected), registerBodyClickHandler = js.Any.fromFunction1(registerBodyClickHandler), registerInteractionHandler = js.Any.fromFunction2(registerInteractionHandler), removeClass = js.Any.fromFunction1(removeClass), restoreFocus = js.Any.fromFunction0(restoreFocus), rmAttrForOptionAtIndex = js.Any.fromFunction2(rmAttrForOptionAtIndex), rmClassForOptionAtIndex = js.Any.fromFunction2(rmClassForOptionAtIndex), saveFocus = js.Any.fromFunction0(saveFocus), setAttrForOptionAtIndex = js.Any.fromFunction3(setAttrForOptionAtIndex), setMaxHeight = js.Any.fromFunction1(setMaxHeight), setPosition = js.Any.fromFunction1(setPosition), setTransformOrigin = js.Any.fromFunction1(setTransformOrigin))
  
    __obj.asInstanceOf[MDCMenuAdapter]
  }
}

