package typings.atMaterialTab.atMaterialTabMod

import typings.atMaterialBase.componentMod.default
import typings.atMaterialTab.adapterMod.MDCTabAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/tab", "MDCTab")
@js.native
class MDCTab ()
  extends default[MDCTabAdapter, typings.atMaterialTab.foundationMod.default] {
  var active: Boolean = js.native
}

/* static members */
@JSImport("@material/tab", "MDCTab")
@js.native
object MDCTab extends js.Object {
  def attachTo(root: Element): MDCTab = js.native
}

