package typings.jest

import typings.jest.jestMod.jest.EqualityTester
import typings.jest.jestMod.jest.MatcherHintOptions
import typings.jest.jestMod.jest.PrintLabel
import typings.jestDashDiff.jestDashDiffMod.DiffOptions
import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_A extends js.Object {
  val SUGGEST_TO_CONTAIN_EQUAL: String = js.native
  @JSName("iterableEquality")
  var iterableEquality_Original: EqualityTester = js.native
  @JSName("subsetEquality")
  var subsetEquality_Original: EqualityTester = js.native
  def BOLD_WEIGHT(text: js.Any*): String = js.native
  def BOLD_WEIGHT(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  def DIM_COLOR(text: js.Any*): String = js.native
  def DIM_COLOR(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  def EXPECTED_COLOR(text: js.Any*): String = js.native
  def EXPECTED_COLOR(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  def INVERTED_COLOR(text: js.Any*): String = js.native
  def INVERTED_COLOR(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  def RECEIVED_COLOR(text: js.Any*): String = js.native
  def RECEIVED_COLOR(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  def diff(a: js.Any, b: js.Any): String | Null = js.native
  def diff(a: js.Any, b: js.Any, options: DiffOptions): String | Null = js.native
  def ensureActualIsNumber(actual: js.Any, matcherName: String): Unit = js.native
  def ensureActualIsNumber(actual: js.Any, matcherName: String, options: MatcherHintOptions): Unit = js.native
  def ensureExpectedIsNonNegativeInteger(expected: js.Any, matcherName: String): Unit = js.native
  def ensureExpectedIsNonNegativeInteger(expected: js.Any, matcherName: String, options: MatcherHintOptions): Unit = js.native
  def ensureExpectedIsNumber(actual: js.Any, matcherName: String): Unit = js.native
  def ensureExpectedIsNumber(actual: js.Any, matcherName: String, options: MatcherHintOptions): Unit = js.native
  def ensureNoExpected(actual: js.Any, matcherName: String): Unit = js.native
  def ensureNoExpected(actual: js.Any, matcherName: String, options: MatcherHintOptions): Unit = js.native
  def ensureNumbers(actual: js.Any, expected: js.Any, matcherName: String): Unit = js.native
  def ensureNumbers(actual: js.Any, expected: js.Any, matcherName: String, options: MatcherHintOptions): Unit = js.native
  def getLabelPrinter(strings: String*): PrintLabel = js.native
  def highlightTrailingWhitespace(text: String): String = js.native
  def iterableEquality(a: js.Any, b: js.Any): js.UndefOr[Boolean] = js.native
  def matcherErrorMessage(hint: String, generic: String, specific: String): String = js.native
  def matcherHint(matcherName: String): String = js.native
  def matcherHint(matcherName: String, received: String): String = js.native
  def matcherHint(matcherName: String, received: String, expected: String): String = js.native
  def matcherHint(matcherName: String, received: String, expected: String, options: MatcherHintOptions): String = js.native
  def pluralize(word: String, count: Double): String = js.native
  def printDiffOrStringify(expected: js.Any, received: js.Any, expectedLabel: String, receivedLabel: String, expand: Boolean): String = js.native
  def printExpected(value: js.Any): String = js.native
  def printReceived(`object`: js.Any): String = js.native
  def printWithType(name: String, value: js.Any, print: js.Function1[/* value */ js.Any, String]): String = js.native
  def stringify(`object`: js.Object): String = js.native
  def stringify(`object`: js.Object, maxDepth: Double): String = js.native
  def subsetEquality(a: js.Any, b: js.Any): js.UndefOr[Boolean] = js.native
}

