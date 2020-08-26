package typings.htmlhint.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LintResult extends js.Object {
  var col: Double = js.native
  var evidence: String = js.native
  var line: Double = js.native
  var message: String = js.native
  var rule: Rule = js.native
}

object LintResult {
  @scala.inline
  def apply(col: Double, evidence: String, line: Double, message: String, rule: Rule): LintResult = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], evidence = evidence.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[LintResult]
  }
  @scala.inline
  implicit class LintResultOps[Self <: LintResult] (val x: Self) extends AnyVal {
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
    def setCol(value: Double): Self = this.set("col", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvidence(value: String): Self = this.set("evidence", value.asInstanceOf[js.Any])
    @scala.inline
    def setLine(value: Double): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setRule(value: Rule): Self = this.set("rule", value.asInstanceOf[js.Any])
  }
  
}

