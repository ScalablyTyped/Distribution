package typings
package atMaterialToolbarLib.atMaterialToolbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/toolbar", "MDCToolbar")
@js.native
class MDCToolbar ()
  extends atMaterialBaseLib.atMaterialBaseMod.MDCComponent[
      atMaterialToolbarLib.adapterMod.MDCToolbarAdapter, 
      atMaterialToolbarLib.foundationMod.default
    ] {
  var fixedAdjustElement: stdLib.HTMLElement = js.native
}

/* static members */
@JSImport("@material/toolbar", "MDCToolbar")
@js.native
object MDCToolbar extends js.Object {
  def attachTo(root: stdLib.Element): atMaterialToolbarLib.atMaterialToolbarMod.MDCToolbar = js.native
}

