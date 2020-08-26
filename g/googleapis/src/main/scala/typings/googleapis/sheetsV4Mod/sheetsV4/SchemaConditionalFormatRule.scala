package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A rule describing a conditional format.
  */
@js.native
trait SchemaConditionalFormatRule extends js.Object {
  /**
    * The formatting is either &quot;on&quot; or &quot;off&quot; according to
    * the rule.
    */
  var booleanRule: js.UndefOr[SchemaBooleanRule] = js.native
  /**
    * The formatting will vary based on the gradients in the rule.
    */
  var gradientRule: js.UndefOr[SchemaGradientRule] = js.native
  /**
    * The ranges that are formatted if the condition is true. All the ranges
    * must be on the same grid.
    */
  var ranges: js.UndefOr[js.Array[SchemaGridRange]] = js.native
}

object SchemaConditionalFormatRule {
  @scala.inline
  def apply(): SchemaConditionalFormatRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConditionalFormatRule]
  }
  @scala.inline
  implicit class SchemaConditionalFormatRuleOps[Self <: SchemaConditionalFormatRule] (val x: Self) extends AnyVal {
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
    def setBooleanRule(value: SchemaBooleanRule): Self = this.set("booleanRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBooleanRule: Self = this.set("booleanRule", js.undefined)
    @scala.inline
    def setGradientRule(value: SchemaGradientRule): Self = this.set("gradientRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGradientRule: Self = this.set("gradientRule", js.undefined)
    @scala.inline
    def setRangesVarargs(value: SchemaGridRange*): Self = this.set("ranges", js.Array(value :_*))
    @scala.inline
    def setRanges(value: js.Array[SchemaGridRange]): Self = this.set("ranges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRanges: Self = this.set("ranges", js.undefined)
  }
  
}

