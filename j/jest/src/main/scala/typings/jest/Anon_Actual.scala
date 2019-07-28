package typings.jest

import typings.jestDashDiff.jestDashDiffMod.DiffOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Actual extends js.Object {
  @JSName("diff")
  var diff_Original: Fn_A = js.native
  def EXPECTED_COLOR(text: String): String = js.native
  def RECEIVED_COLOR(text: String): String = js.native
  def diff(a: js.Any, b: js.Any): String = js.native
  def diff(a: js.Any, b: js.Any, options: DiffOptions): String = js.native
  def ensureActualIsNumber(actual: js.Any): Unit = js.native
  def ensureActualIsNumber(actual: js.Any, matcherName: String): Unit = js.native
  def ensureExpectedIsNumber(actual: js.Any): Unit = js.native
  def ensureExpectedIsNumber(actual: js.Any, matcherName: String): Unit = js.native
  def ensureNoExpected(actual: js.Any): Unit = js.native
  def ensureNoExpected(actual: js.Any, matcherName: String): Unit = js.native
  def ensureNumbers(actual: js.Any, expected: js.Any): Unit = js.native
  def ensureNumbers(actual: js.Any, expected: js.Any, matcherName: String): Unit = js.native
  /**
    * get the type of a value with handling of edge cases like `typeof []` and `typeof null`
    */
  def getType(value: js.Any): String = js.native
  def matcherHint(matcherName: String): String = js.native
  def matcherHint(matcherName: String, received: String): String = js.native
  def matcherHint(matcherName: String, received: String, expected: String): String = js.native
  def matcherHint(matcherName: String, received: String, expected: String, options: Anon_IsDirectExpectCall): String = js.native
  def pluralize(word: String, count: Double): String = js.native
  def printExpected(value: js.Any): String = js.native
  def printReceived(value: js.Any): String = js.native
  def printWithType(name: String, received: js.Any, print: js.Function1[/* value */ js.Any, String]): String = js.native
  def stringify(`object`: js.Object): String = js.native
  def stringify(`object`: js.Object, maxDepth: Double): String = js.native
}

