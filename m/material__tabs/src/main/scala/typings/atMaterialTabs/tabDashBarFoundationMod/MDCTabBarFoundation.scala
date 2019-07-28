package typings.atMaterialTabs.tabDashBarFoundationMod

import typings.atMaterialTabs.tabDashBarAdapterMod.MDCTabBarAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCTabBarFoundation
  extends typings.atMaterialBase.foundationMod.default[MDCTabBarAdapter] {
  def getActiveTabIndex(): Double = js.native
  def layout(): Unit = js.native
  def switchToTabAtIndex(index: Double, shouldNotify: Boolean): Unit = js.native
}

