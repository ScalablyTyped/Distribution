package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A rule that may or may not match, depending on the condition.
  */
@js.native
trait SchemaBooleanRule extends js.Object {
  /**
    * The condition of the rule. If the condition evaluates to true, the format
    * is applied.
    */
  var condition: js.UndefOr[SchemaBooleanCondition] = js.native
  /**
    * The format to apply. Conditional formatting can only apply a subset of
    * formatting: bold, italic, strikethrough, foreground color &amp;
    * background color.
    */
  var format: js.UndefOr[SchemaCellFormat] = js.native
}

object SchemaBooleanRule {
  @scala.inline
  def apply(): SchemaBooleanRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBooleanRule]
  }
  @scala.inline
  implicit class SchemaBooleanRuleOps[Self <: SchemaBooleanRule] (val x: Self) extends AnyVal {
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
    def setCondition(value: SchemaBooleanCondition): Self = this.set("condition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    @scala.inline
    def setFormat(value: SchemaCellFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
  }
  
}

