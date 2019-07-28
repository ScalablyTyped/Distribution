package typings.atMaterialTabs.tabFoundationMod

import typings.atMaterialTabs.tabAdapterMod.MDCTabAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCTabFoundation
  extends typings.atMaterialBase.foundationMod.default[MDCTabAdapter] {
  def getComputedLeft(): Double = js.native
  def getComputedWidth(): Double = js.native
  def isActive(): Boolean = js.native
  def measureSelf(): Unit = js.native
  def preventsDefaultOnClick(): Boolean = js.native
  def setActive(isActive: Boolean): Unit = js.native
  def setPreventDefaultOnClick(preventDefaultOnClick: Boolean): Unit = js.native
}

