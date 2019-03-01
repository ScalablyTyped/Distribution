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
    addClass: js.Function1[java.lang.String, scala.Unit],
    addClassForOptionAtIndex: js.Function2[scala.Double, java.lang.String, scala.Unit],
    deregisterBodyClickHandler: js.Function1[stdLib.EventListener, scala.Unit],
    deregisterInteractionHandler: js.Function2[java.lang.String, stdLib.EventListener, scala.Unit],
    focus: js.Function0[scala.Unit],
    focusItemAtIndex: js.Function1[scala.Double, scala.Unit],
    getAnchorDimensions: js.Function0[atMaterialMenuLib.Anon_Bottom],
    getAttributeForEventTarget: js.Function2[stdLib.EventTarget, java.lang.String, java.lang.String],
    getFocusedItemIndex: js.Function0[scala.Double],
    getIndexForEventTarget: js.Function1[stdLib.EventTarget, scala.Double],
    getInnerDimensions: js.Function0[atMaterialMenuLib.Anon_Height],
    getNumberOfItems: js.Function0[scala.Double],
    getWindowDimensions: js.Function0[atMaterialMenuLib.Anon_Height],
    hasAnchor: js.Function0[scala.Boolean],
    hasClass: js.Function1[java.lang.String, scala.Boolean],
    hasNecessaryDom: js.Function0[scala.Boolean],
    isFocused: js.Function0[scala.Boolean],
    isRtl: js.Function0[scala.Boolean],
    notifyCancel: js.Function0[scala.Unit],
    notifySelected: js.Function1[atMaterialMenuLib.Anon_Index, scala.Unit],
    registerBodyClickHandler: js.Function1[stdLib.EventListener, scala.Unit],
    registerInteractionHandler: js.Function2[java.lang.String, stdLib.EventListener, scala.Unit],
    removeClass: js.Function1[java.lang.String, scala.Unit],
    restoreFocus: js.Function0[scala.Unit],
    rmAttrForOptionAtIndex: js.Function2[scala.Double, java.lang.String, scala.Unit],
    rmClassForOptionAtIndex: js.Function2[scala.Double, java.lang.String, scala.Unit],
    saveFocus: js.Function0[scala.Unit],
    setAttrForOptionAtIndex: js.Function3[scala.Double, java.lang.String, java.lang.String, scala.Unit],
    setMaxHeight: js.Function1[scala.Double, scala.Unit],
    setPosition: js.Function1[atMaterialMenuLib.Anon_BottomLeft, scala.Unit],
    setTransformOrigin: js.Function1[java.lang.String, scala.Unit]
  ): MDCMenuAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addClass")(addClass)
    __obj.updateDynamic("addClassForOptionAtIndex")(addClassForOptionAtIndex)
    __obj.updateDynamic("deregisterBodyClickHandler")(deregisterBodyClickHandler)
    __obj.updateDynamic("deregisterInteractionHandler")(deregisterInteractionHandler)
    __obj.updateDynamic("focus")(focus)
    __obj.updateDynamic("focusItemAtIndex")(focusItemAtIndex)
    __obj.updateDynamic("getAnchorDimensions")(getAnchorDimensions)
    __obj.updateDynamic("getAttributeForEventTarget")(getAttributeForEventTarget)
    __obj.updateDynamic("getFocusedItemIndex")(getFocusedItemIndex)
    __obj.updateDynamic("getIndexForEventTarget")(getIndexForEventTarget)
    __obj.updateDynamic("getInnerDimensions")(getInnerDimensions)
    __obj.updateDynamic("getNumberOfItems")(getNumberOfItems)
    __obj.updateDynamic("getWindowDimensions")(getWindowDimensions)
    __obj.updateDynamic("hasAnchor")(hasAnchor)
    __obj.updateDynamic("hasClass")(hasClass)
    __obj.updateDynamic("hasNecessaryDom")(hasNecessaryDom)
    __obj.updateDynamic("isFocused")(isFocused)
    __obj.updateDynamic("isRtl")(isRtl)
    __obj.updateDynamic("notifyCancel")(notifyCancel)
    __obj.updateDynamic("notifySelected")(notifySelected)
    __obj.updateDynamic("registerBodyClickHandler")(registerBodyClickHandler)
    __obj.updateDynamic("registerInteractionHandler")(registerInteractionHandler)
    __obj.updateDynamic("removeClass")(removeClass)
    __obj.updateDynamic("restoreFocus")(restoreFocus)
    __obj.updateDynamic("rmAttrForOptionAtIndex")(rmAttrForOptionAtIndex)
    __obj.updateDynamic("rmClassForOptionAtIndex")(rmClassForOptionAtIndex)
    __obj.updateDynamic("saveFocus")(saveFocus)
    __obj.updateDynamic("setAttrForOptionAtIndex")(setAttrForOptionAtIndex)
    __obj.updateDynamic("setMaxHeight")(setMaxHeight)
    __obj.updateDynamic("setPosition")(setPosition)
    __obj.updateDynamic("setTransformOrigin")(setTransformOrigin)
    __obj.asInstanceOf[MDCMenuAdapter]
  }
}

