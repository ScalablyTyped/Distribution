package typings
package atMaterialTabsLib.tabFoundationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCTabFoundation
  extends atMaterialBaseLib.foundationMod.default[atMaterialTabsLib.tabAdapterMod.MDCTabAdapter] {
  def getComputedLeft(): scala.Double = js.native
  def getComputedWidth(): scala.Double = js.native
  def isActive(): scala.Boolean = js.native
  def measureSelf(): scala.Unit = js.native
  def preventsDefaultOnClick(): scala.Boolean = js.native
  def setActive(isActive: scala.Boolean): scala.Unit = js.native
  def setPreventDefaultOnClick(preventDefaultOnClick: scala.Boolean): scala.Unit = js.native
}

