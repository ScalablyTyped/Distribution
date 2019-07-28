package typings.jestDashMatcherDashUtils

import typings.chalk.chalkMod.Chalk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-matcher-utils", JSImport.Namespace)
@js.native
object jestDashMatcherDashUtilsMod extends js.Object {
  val EXPECTED_BG: Chalk = js.native
  val EXPECTED_COLOR: Chalk = js.native
  val RECEIVED_BG: Chalk = js.native
  val RECEIVED_COLOR: Chalk = js.native
  val SUGGEST_TO_EQUAL: String = js.native
  def ensureActualIsNumber(actual: js.Any): Unit = js.native
  def ensureActualIsNumber(actual: js.Any, matcherName: String): Unit = js.native
  def ensureExpectedIsNumber(actual: js.Any): Unit = js.native
  def ensureExpectedIsNumber(actual: js.Any, matcherName: String): Unit = js.native
  def ensureNoExpected(actual: js.Any): Unit = js.native
  def ensureNoExpected(actual: js.Any, matcherName: String): Unit = js.native
  def ensureNumbers(actual: js.Any, expected: js.Any): Unit = js.native
  def ensureNumbers(actual: js.Any, expected: js.Any, matcherName: String): Unit = js.native
  def highlightTrailingWhitespace(text: String, bgColor: Chalk): String = js.native
  def matcherHint(matcherName: String): String = js.native
  def matcherHint(matcherName: String, received: String): String = js.native
  def matcherHint(matcherName: String, received: String, expected: String): String = js.native
  def matcherHint(matcherName: String, received: String, expected: String, options: Anon_IsDirectExpectCall): String = js.native
  def pluralize(word: String, count: Double): String = js.native
  def printExpected(value: js.Any): String = js.native
  def printReceived(`object`: js.Any): String = js.native
  def printWithType(name: String, received: js.Any, print: js.Function1[/* value */ js.Any, String]): String = js.native
  def stringify(`object`: js.Any): String = js.native
  def stringify(`object`: js.Any, maxDepth: Double): String = js.native
}

