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
  def setPosition(position: atMaterialMenuLib.Anon_BottomTop): scala.Unit
  def setTransformOrigin(origin: java.lang.String): scala.Unit
}

