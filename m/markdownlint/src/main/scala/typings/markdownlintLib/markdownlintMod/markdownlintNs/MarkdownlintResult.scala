package typings
package markdownlintLib.markdownlintMod.markdownlintNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkdownlintResult extends js.Object {
  var errorContext: java.lang.String
  var errorDetail: js.UndefOr[java.lang.String] = js.undefined
  var errorRange: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  var lineNumber: scala.Double
  var ruleAlias: java.lang.String
  var ruleDescription: java.lang.String
  var ruleName: java.lang.String
}

object MarkdownlintResult {
  @scala.inline
  def apply(
    errorContext: java.lang.String,
    lineNumber: scala.Double,
    ruleAlias: java.lang.String,
    ruleDescription: java.lang.String,
    ruleName: java.lang.String,
    errorDetail: java.lang.String = null,
    errorRange: js.Tuple2[scala.Double, scala.Double] = null
  ): MarkdownlintResult = {
    val __obj = js.Dynamic.literal(errorContext = errorContext, lineNumber = lineNumber, ruleAlias = ruleAlias, ruleDescription = ruleDescription, ruleName = ruleName)
    if (errorDetail != null) __obj.updateDynamic("errorDetail")(errorDetail)
    if (errorRange != null) __obj.updateDynamic("errorRange")(errorRange)
    __obj.asInstanceOf[MarkdownlintResult]
  }
}

