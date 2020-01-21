package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A condition for determining whether a transformation should be applied to a
  * field.
  */
@js.native
trait SchemaGooglePrivacyDlpV2RecordCondition extends js.Object {
  /**
    * An expression.
    */
  var expressions: js.UndefOr[SchemaGooglePrivacyDlpV2Expressions] = js.native
}

object SchemaGooglePrivacyDlpV2RecordCondition {
  @scala.inline
  def apply(expressions: SchemaGooglePrivacyDlpV2Expressions = null): SchemaGooglePrivacyDlpV2RecordCondition = {
    val __obj = js.Dynamic.literal()
    if (expressions != null) __obj.updateDynamic("expressions")(expressions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2RecordCondition]
  }
}

