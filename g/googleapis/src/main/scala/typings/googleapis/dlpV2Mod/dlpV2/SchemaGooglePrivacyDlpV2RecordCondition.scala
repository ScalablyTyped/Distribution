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
  def apply(): SchemaGooglePrivacyDlpV2RecordCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2RecordCondition]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2RecordConditionOps[Self <: SchemaGooglePrivacyDlpV2RecordCondition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExpressions(value: SchemaGooglePrivacyDlpV2Expressions): Self = this.set("expressions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpressions: Self = this.set("expressions", js.undefined)
  }
  
}

