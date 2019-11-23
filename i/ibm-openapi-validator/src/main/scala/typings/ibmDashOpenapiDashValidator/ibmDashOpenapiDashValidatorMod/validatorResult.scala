package typings.ibmDashOpenapiDashValidator.ibmDashOpenapiDashValidatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait validatorResult extends js.Object {
  var errors: js.Array[js.Any | validatorResultItem]
  var warnings: js.Array[js.Any | validatorResultItem]
}

object validatorResult {
  @scala.inline
  def apply(errors: js.Array[js.Any | validatorResultItem], warnings: js.Array[js.Any | validatorResultItem]): validatorResult = {
    val __obj = js.Dynamic.literal(errors = errors, warnings = warnings)
  
    __obj.asInstanceOf[validatorResult]
  }
}

