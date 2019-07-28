package typings.atMaterialNotchedDashOutline.atMaterialNotchedDashOutlineMod

import typings.atMaterialBase.componentMod.default
import typings.atMaterialNotchedDashOutline.adapterMod.MDCNotchedOutlineAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/notched-outline", "MDCNotchedOutline")
@js.native
class MDCNotchedOutline ()
  extends default[
      MDCNotchedOutlineAdapter, 
      typings.atMaterialNotchedDashOutline.foundationMod.default
    ] {
  /**
    * Updates the outline selectors to close notch and return it to idle state.
    */
  def closeNotch(): Unit = js.native
  /**
    * Updates outline selectors and SVG path to open notch.
    */
  def notch(notchWidth: Double): Unit = js.native
  def notch(notchWidth: Double, isRtl: Boolean): Unit = js.native
}

/* static members */
@JSImport("@material/notched-outline", "MDCNotchedOutline")
@js.native
object MDCNotchedOutline extends js.Object {
  def attachTo(root: Element): MDCNotchedOutline = js.native
}

