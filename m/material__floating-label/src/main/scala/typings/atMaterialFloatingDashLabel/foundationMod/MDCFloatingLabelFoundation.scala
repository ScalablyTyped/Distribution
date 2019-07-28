package typings.atMaterialFloatingDashLabel.foundationMod

import typings.atMaterialFloatingDashLabel.adapterMod.MDCFloatingLabelAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCFloatingLabelFoundation
  extends typings.atMaterialBase.foundationMod.default[MDCFloatingLabelAdapter] {
  /**
    * Styles the label to float or dock.
    */
  def float(shouldFloat: Boolean): Unit = js.native
  /**
    * Returns the width of the label element.
    */
  def getWidth(): Double = js.native
  /**
    * Styles the label to produce the label shake for errors.
    */
  def shake(shouldShake: Boolean): Unit = js.native
}

