package typings.atMaterialDrawer.atMaterialDrawerMod

import typings.atMaterialBase.componentMod.default
import typings.atMaterialDrawer.focusDashTrapMod.FocusTrap
import typings.atMaterialList.atMaterialListMod.MDCList
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/drawer", "MDCDrawer")
@js.native
class MDCDrawer protected ()
  extends default[
      MDCDrawer, 
      typings.atMaterialDrawer.dismissibleFoundationMod.MDCDismissibleDrawerFoundation | typings.atMaterialDrawer.modalFoundationMod.MDCModalDrawerFoundation
    ] {
  def this(args: js.Any*) = this()
  /**
    * Returns true if drawer is in the open position.
    */
  var open: Boolean = js.native
  def initialize(focusTrapFactory: FocusTrap, listFactory: MDCList): Unit = js.native
}

/* static members */
@JSImport("@material/drawer", "MDCDrawer")
@js.native
object MDCDrawer extends js.Object {
  def attachTo(root: Element): MDCDrawer = js.native
}

