package typings.atMaterialTabs.tabDashBarDashScrollerFoundationMod

import typings.atMaterialTabs.tabDashBarDashScrollerAdapterMod.MDCTabBarScrollerAdapter
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCTabBarScrollerFoundation
  extends typings.atMaterialBase.foundationMod.default[MDCTabBarScrollerAdapter] {
  def layout(): Unit = js.native
  def scrollBack(): Unit = js.native
  def scrollBack(evt: Event): Unit = js.native
  def scrollForward(): Unit = js.native
  def scrollForward(evt: Event): Unit = js.native
  def scrollToTabAtIndex(index: Double): Unit = js.native
}

