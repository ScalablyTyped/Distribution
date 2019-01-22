package typings
package atMaterialDrawerLib.atMaterialDrawerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/drawer", "MDCDrawer")
@js.native
class MDCDrawer protected ()
  extends atMaterialBaseLib.componentMod.default[
      MDCDrawer, 
      atMaterialDrawerLib.dismissibleFoundationMod.MDCDismissibleDrawerFoundation | atMaterialDrawerLib.modalFoundationMod.MDCModalDrawerFoundation
    ] {
  def this(args: js.Any*) = this()
  /**
    * Returns true if drawer is in the open position.
    */
  var open: scala.Boolean = js.native
  def initialize(
    focusTrapFactory: atMaterialDrawerLib.focusDashTrapMod.FocusTrap,
    listFactory: atMaterialListLib.atMaterialListMod.MDCList
  ): scala.Unit = js.native
}

@JSImport("@material/drawer", "MDCDrawer")
@js.native
object MDCDrawer extends js.Object {
  def attachTo(root: stdLib.Element): atMaterialDrawerLib.atMaterialDrawerMod.MDCDrawer = js.native
}

