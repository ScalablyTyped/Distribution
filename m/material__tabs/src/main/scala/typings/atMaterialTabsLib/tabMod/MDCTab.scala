package typings
package atMaterialTabsLib.tabMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/tabs/tab", "MDCTab")
@js.native
class MDCTab ()
  extends atMaterialBaseLib.componentMod.default[
      atMaterialTabsLib.tabAdapterMod.MDCTabAdapter, 
      atMaterialTabsLib.tabFoundationMod.default
    ] {
  val computedLeft: scala.Double = js.native
  val computedWidth: scala.Double = js.native
  var isActive: scala.Boolean = js.native
  var preventDefaultOnClick: scala.Boolean = js.native
  def measureSelf(): scala.Unit = js.native
}

/* static members */
@JSImport("@material/tabs/tab", "MDCTab")
@js.native
object MDCTab extends js.Object {
  def attachTo(root: stdLib.Element): atMaterialTabsLib.tabMod.MDCTab = js.native
}

