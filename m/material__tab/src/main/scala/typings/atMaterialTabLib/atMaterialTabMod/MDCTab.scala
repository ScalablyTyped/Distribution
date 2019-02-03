package typings
package atMaterialTabLib.atMaterialTabMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/tab", "MDCTab")
@js.native
class MDCTab ()
  extends atMaterialBaseLib.componentMod.default[atMaterialTabLib.adapterMod.MDCTabAdapter, atMaterialTabLib.foundationMod.default] {
  var active: scala.Boolean = js.native
}

/* static members */
@JSImport("@material/tab", "MDCTab")
@js.native
object MDCTab extends js.Object {
  def attachTo(root: stdLib.Element): atMaterialTabLib.atMaterialTabMod.MDCTab = js.native
}

