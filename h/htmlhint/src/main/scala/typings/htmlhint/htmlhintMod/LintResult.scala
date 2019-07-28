package typings.htmlhint.htmlhintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LintResult extends js.Object {
  var col: Double
  var evidence: String
  var line: Double
  var message: String
  var rule: Rule
}

object LintResult {
  @scala.inline
  def apply(col: Double, evidence: String, line: Double, message: String, rule: Rule): LintResult = {
    val __obj = js.Dynamic.literal(col = col, evidence = evidence, line = line, message = message, rule = rule)
  
    __obj.asInstanceOf[LintResult]
  }
}

