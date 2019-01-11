package typings
package atMaterialDrawerLib.persistentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/drawer/persistent", "MDCPersistentDrawer")
@js.native
class MDCPersistentDrawer ()
  extends atMaterialBaseLib.atMaterialBaseMod.MDCComponent[
      atMaterialDrawerLib.slidableAdapterMod.MDCSlidableDrawerAdapter, 
      atMaterialDrawerLib.persistentFoundationMod.default
    ] {
  // Return the drawer element inside the component.
  val drawer: stdLib.Element | scala.Null = js.native
  var open: scala.Boolean = js.native
}

@JSImport("@material/drawer/persistent", "MDCPersistentDrawer")
@js.native
object MDCPersistentDrawer extends js.Object {
  def attachTo(root: stdLib.Element): atMaterialDrawerLib.persistentMod.MDCPersistentDrawer = js.native
}

