package typings.markdownlint.markdownlintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkdownlintResult extends js.Object {
  var errorContext: String
  var errorDetail: js.UndefOr[String] = js.undefined
  var errorRange: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var lineNumber: Double
  var ruleAlias: String
  var ruleDescription: String
  var ruleName: String
}

object MarkdownlintResult {
  @scala.inline
  def apply(
    errorContext: String,
    lineNumber: Double,
    ruleAlias: String,
    ruleDescription: String,
    ruleName: String,
    errorDetail: String = null,
    errorRange: js.Tuple2[Double, Double] = null
  ): MarkdownlintResult = {
    val __obj = js.Dynamic.literal(errorContext = errorContext, lineNumber = lineNumber, ruleAlias = ruleAlias, ruleDescription = ruleDescription, ruleName = ruleName)
    if (errorDetail != null) __obj.updateDynamic("errorDetail")(errorDetail)
    if (errorRange != null) __obj.updateDynamic("errorRange")(errorRange)
    __obj.asInstanceOf[MarkdownlintResult]
  }
}

