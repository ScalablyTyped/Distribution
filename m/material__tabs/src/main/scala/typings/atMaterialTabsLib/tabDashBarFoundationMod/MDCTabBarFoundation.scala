package typings
package atMaterialTabsLib.tabDashBarFoundationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCTabBarFoundation
  extends atMaterialBaseLib.foundationMod.default[atMaterialTabsLib.tabDashBarAdapterMod.MDCTabBarAdapter] {
  def getActiveTabIndex(): scala.Double = js.native
  def layout(): scala.Unit = js.native
  def switchToTabAtIndex(index: scala.Double, shouldNotify: scala.Boolean): scala.Unit = js.native
}

