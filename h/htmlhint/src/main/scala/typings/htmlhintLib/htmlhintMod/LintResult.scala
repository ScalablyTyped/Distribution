package typings
package htmlhintLib.htmlhintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LintResult extends js.Object {
  var col: scala.Double
  var evidence: java.lang.String
  var line: scala.Double
  var message: java.lang.String
  var rule: Rule
}

object LintResult {
  @scala.inline
  def apply(
    col: scala.Double,
    evidence: java.lang.String,
    line: scala.Double,
    message: java.lang.String,
    rule: Rule
  ): LintResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("col")(col)
    __obj.updateDynamic("evidence")(evidence)
    __obj.updateDynamic("line")(line)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("rule")(rule)
    __obj.asInstanceOf[LintResult]
  }
}

