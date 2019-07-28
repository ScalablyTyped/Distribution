package typings.htmlhint.htmlhintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("htmlhint", "HTMLHint")
@js.native
object HTMLHintNs extends js.Object {
  def format(arrMessages: js.Array[LintResult]): js.Array[String] = js.native
  def format(arrMessages: js.Array[LintResult], options: FormatOptions): js.Array[String] = js.native
  def verify(fileContent: String): js.Array[LintResult] = js.native
  def verify(fileContent: String, ruleSet: RuleSet): js.Array[LintResult] = js.native
}

