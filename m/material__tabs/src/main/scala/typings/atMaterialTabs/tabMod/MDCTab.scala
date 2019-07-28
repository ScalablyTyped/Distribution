package typings.atMaterialTabs.tabMod

import typings.atMaterialBase.componentMod.default
import typings.atMaterialTabs.tabAdapterMod.MDCTabAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/tabs/tab", "MDCTab")
@js.native
class MDCTab ()
  extends default[MDCTabAdapter, typings.atMaterialTabs.tabFoundationMod.default] {
  val computedLeft: Double = js.native
  val computedWidth: Double = js.native
  var isActive: Boolean = js.native
  var preventDefaultOnClick: Boolean = js.native
  def measureSelf(): Unit = js.native
}

/* static members */
@JSImport("@material/tabs/tab", "MDCTab")
@js.native
object MDCTab extends js.Object {
  def attachTo(root: Element): MDCTab = js.native
}

