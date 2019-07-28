package typings.atMaterialNotchedDashOutline.foundationMod

import typings.atMaterialNotchedDashOutline.adapterMod.MDCNotchedOutlineAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCNotchedOutlineFoundation
  extends typings.atMaterialBase.foundationMod.default[MDCNotchedOutlineAdapter] {
  /**
    * Removes notched outline selector to close the notch in the outline.
    */
  def closeNotch(): Unit = js.native
  /**
    * Adds the outline notched selector and updates the notch width
    * calculated based off of notchWidth and isRtl.
    */
  def notch(notchWidth: Double): Unit = js.native
  def notch(notchWidth: Double, isRtl: Boolean): Unit = js.native
}

