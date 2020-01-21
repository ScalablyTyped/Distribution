package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of deleting a conditional format rule.
  */
@js.native
trait SchemaDeleteConditionalFormatRuleResponse extends js.Object {
  /**
    * The rule that was deleted.
    */
  var rule: js.UndefOr[SchemaConditionalFormatRule] = js.native
}

object SchemaDeleteConditionalFormatRuleResponse {
  @scala.inline
  def apply(rule: SchemaConditionalFormatRule = null): SchemaDeleteConditionalFormatRuleResponse = {
    val __obj = js.Dynamic.literal()
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeleteConditionalFormatRuleResponse]
  }
}

