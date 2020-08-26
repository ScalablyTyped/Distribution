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
  def apply(): SchemaAddConditionalFormatRuleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddConditionalFormatRuleRequest]
  }
  @scala.inline
  implicit class SchemaAddConditionalFormatRuleRequestOps[Self <: SchemaAddConditionalFormatRuleRequest] (val x: Self) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setRule(value: SchemaConditionalFormatRule): Self = this.set("rule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRule: Self = this.set("rule", js.undefined)
  }
  
}

