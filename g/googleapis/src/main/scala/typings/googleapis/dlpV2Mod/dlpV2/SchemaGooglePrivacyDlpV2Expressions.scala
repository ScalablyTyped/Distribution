package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An expression, consisting or an operator and conditions.
  */
@js.native
trait SchemaGooglePrivacyDlpV2Expressions extends js.Object {
  var conditions: js.UndefOr[SchemaGooglePrivacyDlpV2Conditions] = js.native
  /**
    * The operator to apply to the result of conditions. Default and currently
    * only supported value is `AND`.
    */
  var logicalOperator: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2Expressions {
  @scala.inline
  def apply(conditions: SchemaGooglePrivacyDlpV2Conditions = null, logicalOperator: String = null): SchemaGooglePrivacyDlpV2Expressions = {
    val __obj = js.Dynamic.literal()
    if (conditions != null) __obj.updateDynamic("conditions")(conditions.asInstanceOf[js.Any])
    if (logicalOperator != null) __obj.updateDynamic("logicalOperator")(logicalOperator.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Expressions]
  }
}

