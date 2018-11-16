package typings
package atMaterialFloatingDashLabelLib.foundationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCFloatingLabelFoundation
  extends atMaterialBaseLib.foundationMod.default[atMaterialFloatingDashLabelLib.adapterMod.MDCFloatingLabelAdapter] {
  /**
       * Styles the label to float or dock.
       */
  def float(shouldFloat: scala.Boolean): scala.Unit = js.native
  /**
       * Returns the width of the label element.
       */
  def getWidth(): scala.Double = js.native
  /**
       * Styles the label to produce the label shake for errors.
       */
  def shake(shouldShake: scala.Boolean): scala.Unit = js.native
}

