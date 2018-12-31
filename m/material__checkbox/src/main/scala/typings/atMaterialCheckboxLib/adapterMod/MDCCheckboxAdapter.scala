package typings
package atMaterialCheckboxLib.adapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCCheckboxAdapter extends js.Object {
  def addClass(className: java.lang.String): scala.Unit
  def deregisterAnimationEndHandler(handler: stdLib.EventListener): scala.Unit
  def deregisterChangeHandler(handler: stdLib.EventListener): scala.Unit
  def forceLayout(): scala.Unit
  def getNativeControl(): atMaterialSelectionDashControlLib.selectionDashControlMod.MDCSelectionControlState
  def isAttachedToDOM(): scala.Boolean
  def registerAnimationEndHandler(handler: stdLib.EventListener): scala.Unit
  def registerChangeHandler(handler: stdLib.EventListener): scala.Unit
  def removeClass(className: java.lang.String): scala.Unit
  def removeNativeControlAttr(attr: java.lang.String): scala.Unit
  def setNativeControlAttr(attr: java.lang.String, value: java.lang.String): scala.Unit
}

