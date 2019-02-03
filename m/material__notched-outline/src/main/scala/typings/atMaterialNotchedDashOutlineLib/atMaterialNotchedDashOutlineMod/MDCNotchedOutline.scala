package typings
package atMaterialNotchedDashOutlineLib.atMaterialNotchedDashOutlineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/notched-outline", "MDCNotchedOutline")
@js.native
class MDCNotchedOutline ()
  extends atMaterialBaseLib.componentMod.default[
      atMaterialNotchedDashOutlineLib.adapterMod.MDCNotchedOutlineAdapter, 
      atMaterialNotchedDashOutlineLib.foundationMod.default
    ] {
  /**
    * Updates the outline selectors to close notch and return it to idle state.
    */
  def closeNotch(): scala.Unit = js.native
  /**
    * Updates outline selectors and SVG path to open notch.
    */
  def notch(notchWidth: scala.Double): scala.Unit = js.native
  def notch(notchWidth: scala.Double, isRtl: scala.Boolean): scala.Unit = js.native
}

/* static members */
@JSImport("@material/notched-outline", "MDCNotchedOutline")
@js.native
object MDCNotchedOutline extends js.Object {
  def attachTo(root: stdLib.Element): atMaterialNotchedDashOutlineLib.atMaterialNotchedDashOutlineMod.MDCNotchedOutline = js.native
}

