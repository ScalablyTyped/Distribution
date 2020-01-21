package typings.googleapis.dataprocV1Mod.dataprocV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for parameter validation.
  */
@js.native
trait SchemaParameterValidation extends js.Object {
  /**
    * Validation based on regular expressions.
    */
  var regex: js.UndefOr[SchemaRegexValidation] = js.native
  /**
    * Validation based on a list of allowed values.
    */
  var values: js.UndefOr[SchemaValueValidation] = js.native
}

object SchemaParameterValidation {
  @scala.inline
  def apply(regex: SchemaRegexValidation = null, values: SchemaValueValidation = null): SchemaParameterValidation = {
    val __obj = js.Dynamic.literal()
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaParameterValidation]
  }
}

