package typings
package atMaterialNotchedDashOutlineLib.foundationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCNotchedOutlineFoundation
  extends atMaterialBaseLib.foundationMod.default[atMaterialNotchedDashOutlineLib.adapterMod.MDCNotchedOutlineAdapter] {
  /**
       * Removes notched outline selector to close the notch in the outline.
       */
  def closeNotch(): scala.Unit = js.native
  /**
       * Adds the outline notched selector and updates the notch width
       * calculated based off of notchWidth and isRtl.
       */
  def notch(notchWidth: scala.Double): scala.Unit = js.native
  /**
       * Adds the outline notched selector and updates the notch width
       * calculated based off of notchWidth and isRtl.
       */
  def notch(notchWidth: scala.Double, isRtl: scala.Boolean): scala.Unit = js.native
}

