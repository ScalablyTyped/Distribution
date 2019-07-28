package typings.atMaterialFloatingDashLabel.atMaterialFloatingDashLabelMod

import typings.atMaterialBase.componentMod.default
import typings.atMaterialFloatingDashLabel.adapterMod.MDCFloatingLabelAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/floating-label", "MDCFloatingLabel")
@js.native
class MDCFloatingLabel ()
  extends default[MDCFloatingLabelAdapter, typings.atMaterialFloatingDashLabel.foundationMod.default] {
  /**
    * Styles label to float/dock.
    * @param shouldFloat styles the label to float by adding float class
    * if true, otherwise docks the label by removing the float class.
    */
  def float(shouldFloat: Boolean): Unit = js.native
  def getWidth(): Double = js.native
  /**
    * Styles the label to produce the label shake for errors.
    * @param  shouldShake styles the label to shake by adding shake class
    * if true, otherwise will stop shaking by removing shake class.
    */
  def shake(shouldShake: Boolean): Unit = js.native
}

/* static members */
@JSImport("@material/floating-label", "MDCFloatingLabel")
@js.native
object MDCFloatingLabel extends js.Object {
  def attachTo(root: Element): MDCFloatingLabel = js.native
}

