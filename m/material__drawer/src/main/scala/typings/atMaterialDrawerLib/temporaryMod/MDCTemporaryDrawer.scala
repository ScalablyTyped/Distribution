package typings
package atMaterialDrawerLib.temporaryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/drawer/temporary", "MDCTemporaryDrawer")
@js.native
class MDCTemporaryDrawer ()
  extends atMaterialBaseLib.atMaterialBaseMod.MDCComponent[
      atMaterialDrawerLib.slidableAdapterMod.MDCSlidableDrawerAdapter, 
      atMaterialDrawerLib.temporaryFoundationMod.default
    ] {
  /* Return the drawer element inside the component. */
  val drawer: stdLib.Element | scala.Null = js.native
  var open: scala.Boolean = js.native
}

@JSImport("@material/drawer/temporary", "MDCTemporaryDrawer")
@js.native
object MDCTemporaryDrawer extends js.Object {
  def attachTo(root: stdLib.Element): atMaterialDrawerLib.temporaryMod.MDCTemporaryDrawer = js.native
}

