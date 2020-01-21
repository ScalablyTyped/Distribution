package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaProcessingError extends js.Object {
  /**
    * Error code indicating the nature of the error.
    */
  var code: js.UndefOr[String] = js.native
  /**
    * Description of the error.
    */
  var errorMessage: js.UndefOr[String] = js.native
  /**
    * In case the item fields are invalid, this field contains the details
    * about the validation errors.
    */
  var fieldViolations: js.UndefOr[js.Array[SchemaFieldViolation]] = js.native
}

object SchemaProcessingError {
  @scala.inline
  def apply(
    code: String = null,
    errorMessage: String = null,
    fieldViolations: js.Array[SchemaFieldViolation] = null
  ): SchemaProcessingError = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (fieldViolations != null) __obj.updateDynamic("fieldViolations")(fieldViolations.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProcessingError]
  }
}

