package typings
package atMaterialLinearDashProgressLib.constantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cssClasses
  extends atMaterialBaseLib.foundationMod.MDCStrings {
  var CLOSED_CLASS: atMaterialLinearDashProgressLib.atMaterialLinearDashProgressLibStrings.`mdc-linear-progress--closed`
  var INDETERMINATE_CLASS: atMaterialLinearDashProgressLib.atMaterialLinearDashProgressLibStrings.`mdc-linear-progress--indeterminate`
  var REVERSED_CLASS: atMaterialLinearDashProgressLib.atMaterialLinearDashProgressLibStrings.`mdc-linear-progress--reversed`
}

object cssClasses {
  @scala.inline
  def apply(
    CLOSED_CLASS: atMaterialLinearDashProgressLib.atMaterialLinearDashProgressLibStrings.`mdc-linear-progress--closed`,
    INDETERMINATE_CLASS: atMaterialLinearDashProgressLib.atMaterialLinearDashProgressLibStrings.`mdc-linear-progress--indeterminate`,
    REVERSED_CLASS: atMaterialLinearDashProgressLib.atMaterialLinearDashProgressLibStrings.`mdc-linear-progress--reversed`
  ): cssClasses = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CLOSED_CLASS")(CLOSED_CLASS)
    __obj.updateDynamic("INDETERMINATE_CLASS")(INDETERMINATE_CLASS)
    __obj.updateDynamic("REVERSED_CLASS")(REVERSED_CLASS)
    __obj.asInstanceOf[cssClasses]
  }
}

