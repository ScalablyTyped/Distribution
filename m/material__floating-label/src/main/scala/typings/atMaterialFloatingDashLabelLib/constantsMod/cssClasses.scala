package typings
package atMaterialFloatingDashLabelLib.constantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cssClasses
  extends atMaterialBaseLib.foundationMod.MDCStrings {
  var LABEL_FLOAT_ABOVE: atMaterialFloatingDashLabelLib.atMaterialFloatingDashLabelLibStrings.`mdc-floating-label--float-above`
  var LABEL_SHAKE: atMaterialFloatingDashLabelLib.atMaterialFloatingDashLabelLibStrings.`mdc-floating-label--shake`
}

object cssClasses {
  @scala.inline
  def apply(
    LABEL_FLOAT_ABOVE: atMaterialFloatingDashLabelLib.atMaterialFloatingDashLabelLibStrings.`mdc-floating-label--float-above`,
    LABEL_SHAKE: atMaterialFloatingDashLabelLib.atMaterialFloatingDashLabelLibStrings.`mdc-floating-label--shake`
  ): cssClasses = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("LABEL_FLOAT_ABOVE")(LABEL_FLOAT_ABOVE)
    __obj.updateDynamic("LABEL_SHAKE")(LABEL_SHAKE)
    __obj.asInstanceOf[cssClasses]
  }
}

