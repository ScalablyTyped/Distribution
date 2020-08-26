package typings.markdownlint.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkdownlintResult extends js.Object {
  var errorContext: String = js.native
  var errorDetail: js.UndefOr[String] = js.native
  var errorRange: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var lineNumber: Double = js.native
  var ruleAlias: String = js.native
  var ruleDescription: String = js.native
  var ruleName: String = js.native
}

object MarkdownlintResult {
  @scala.inline
  def apply(
    errorContext: String,
    lineNumber: Double,
    ruleAlias: String,
    ruleDescription: String,
    ruleName: String
  ): MarkdownlintResult = {
    val __obj = js.Dynamic.literal(errorContext = errorContext.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], ruleAlias = ruleAlias.asInstanceOf[js.Any], ruleDescription = ruleDescription.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkdownlintResult]
  }
  @scala.inline
  implicit class MarkdownlintResultOps[Self <: MarkdownlintResult] (val x: Self) extends AnyVal {
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
    def setErrorContext(value: String): Self = this.set("errorContext", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineNumber(value: Double): Self = this.set("lineNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuleAlias(value: String): Self = this.set("ruleAlias", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuleDescription(value: String): Self = this.set("ruleDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuleName(value: String): Self = this.set("ruleName", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorDetail(value: String): Self = this.set("errorDetail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorDetail: Self = this.set("errorDetail", js.undefined)
    @scala.inline
    def setErrorRange(value: js.Tuple2[Double, Double]): Self = this.set("errorRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorRange: Self = this.set("errorRange", js.undefined)
  }
  
}

