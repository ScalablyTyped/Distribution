package typings
package htmlhintLib.htmlhintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("htmlhint", "HTMLHint")
@js.native
object HTMLHintNs extends js.Object {
  def format(arrMessages: js.Array[htmlhintLib.htmlhintMod.LintResult]): js.Array[java.lang.String] = js.native
  def format(
    arrMessages: js.Array[htmlhintLib.htmlhintMod.LintResult],
    options: htmlhintLib.htmlhintMod.FormatOptions
  ): js.Array[java.lang.String] = js.native
  def verify(fileContent: java.lang.String): js.Array[htmlhintLib.htmlhintMod.LintResult] = js.native
  def verify(fileContent: java.lang.String, ruleSet: htmlhintLib.htmlhintMod.RuleSet): js.Array[htmlhintLib.htmlhintMod.LintResult] = js.native
}

