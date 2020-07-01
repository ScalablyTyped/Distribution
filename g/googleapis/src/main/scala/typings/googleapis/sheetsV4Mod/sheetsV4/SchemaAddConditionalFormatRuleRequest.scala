package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Adds a new conditional format rule at the given index. All subsequent
  * rules&#39; indexes are incremented.
  */
@js.native
trait SchemaAddConditionalFormatRuleRequest extends js.Object {
  /**
    * The zero-based index where the rule should be inserted.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * The rule to add.
    */
  var rule: js.UndefOr[SchemaConditionalFormatRule] = js.native
}

object SchemaAddConditionalFormatRuleRequest {
  @scala.inline
  def apply(index: js.UndefOr[Double] = js.undefined, rule: SchemaConditionalFormatRule = null): SchemaAddConditionalFormatRuleRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAddConditionalFormatRuleRequest]
  }
}

