package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sets a data validation rule to every cell in the range. To clear validation
  * in a range, call this with no rule specified.
  */
@js.native
trait SchemaSetDataValidationRequest extends js.Object {
  /**
    * The range the data validation rule should apply to.
    */
  var range: js.UndefOr[SchemaGridRange] = js.native
  /**
    * The data validation rule to set on each cell in the range, or empty to
    * clear the data validation in the range.
    */
  var rule: js.UndefOr[SchemaDataValidationRule] = js.native
}

object SchemaSetDataValidationRequest {
  @scala.inline
  def apply(range: SchemaGridRange = null, rule: SchemaDataValidationRule = null): SchemaSetDataValidationRequest = {
    val __obj = js.Dynamic.literal()
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSetDataValidationRequest]
  }
}

