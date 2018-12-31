package typings
package atMaterialFloatingDashLabelLib.floatingDashLabelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/floating-label", "MDCFloatingLabel")
@js.native
class MDCFloatingLabel ()
  extends atMaterialBaseLib.componentMod.default[
      atMaterialFloatingDashLabelLib.adapterMod.MDCFloatingLabelAdapter, 
      atMaterialFloatingDashLabelLib.foundationMod.default
    ] {
  /**
    * Styles label to float/dock.
    * @param shouldFloat styles the label to float by adding float class
    * if true, otherwise docks the label by removing the float class.
    */
  def float(shouldFloat: scala.Boolean): scala.Unit = js.native
  def getWidth(): scala.Double = js.native
  /**
    * Styles the label to produce the label shake for errors.
    * @param  shouldShake styles the label to shake by adding shake class
    * if true, otherwise will stop shaking by removing shake class.
    */
  def shake(shouldShake: scala.Boolean): scala.Unit = js.native
}

@JSImport("@material/floating-label", "MDCFloatingLabel")
@js.native
object MDCFloatingLabel extends js.Object {
  def attachTo(root: stdLib.Element): atMaterialFloatingDashLabelLib.floatingDashLabelMod.MDCFloatingLabel = js.native
}

