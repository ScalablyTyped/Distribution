package typings
package jestDashMatcherDashUtilsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-matcher-utils", JSImport.Namespace)
@js.native
object jestDashMatcherDashUtilsMod extends js.Object {
  val EXPECTED_BG: chalkLib.chalkMod.Chalk = js.native
  val EXPECTED_COLOR: chalkLib.chalkMod.Chalk = js.native
  val RECEIVED_BG: chalkLib.chalkMod.Chalk = js.native
  val RECEIVED_COLOR: chalkLib.chalkMod.Chalk = js.native
  val SUGGEST_TO_EQUAL: java.lang.String = js.native
  def ensureActualIsNumber(actual: js.Any): scala.Unit = js.native
  def ensureActualIsNumber(actual: js.Any, matcherName: java.lang.String): scala.Unit = js.native
  def ensureExpectedIsNumber(actual: js.Any): scala.Unit = js.native
  def ensureExpectedIsNumber(actual: js.Any, matcherName: java.lang.String): scala.Unit = js.native
  def ensureNoExpected(actual: js.Any): scala.Unit = js.native
  def ensureNoExpected(actual: js.Any, matcherName: java.lang.String): scala.Unit = js.native
  def ensureNumbers(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def ensureNumbers(actual: js.Any, expected: js.Any, matcherName: java.lang.String): scala.Unit = js.native
  def highlightTrailingWhitespace(text: java.lang.String, bgColor: chalkLib.chalkMod.Chalk): java.lang.String = js.native
  def matcherHint(matcherName: java.lang.String): java.lang.String = js.native
  def matcherHint(matcherName: java.lang.String, received: java.lang.String): java.lang.String = js.native
  def matcherHint(matcherName: java.lang.String, received: java.lang.String, expected: java.lang.String): java.lang.String = js.native
  def matcherHint(
    matcherName: java.lang.String,
    received: java.lang.String,
    expected: java.lang.String,
    options: jestDashMatcherDashUtilsLib.Anon_IsDirectExpectCall
  ): java.lang.String = js.native
  def pluralize(word: java.lang.String, count: scala.Double): java.lang.String = js.native
  def printExpected(value: js.Any): java.lang.String = js.native
  def printReceived(`object`: js.Any): java.lang.String = js.native
  def printWithType(
    name: java.lang.String,
    received: js.Any,
    print: js.Function1[/* value */ js.Any, java.lang.String]
  ): java.lang.String = js.native
  def stringify(`object`: js.Any): java.lang.String = js.native
  def stringify(`object`: js.Any, maxDepth: scala.Double): java.lang.String = js.native
}

