package typings
package jestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AActual extends js.Object {
  @JSName("diff")
  var diff_Original: Anon_A = js.native
  def EXPECTED_COLOR(text: java.lang.String): java.lang.String = js.native
  def RECEIVED_COLOR(text: java.lang.String): java.lang.String = js.native
  def diff(a: js.Any, b: js.Any): java.lang.String = js.native
  def diff(a: js.Any, b: js.Any, options: jestDashDiffLib.jestDashDiffMod.diffNs.DiffOptions): java.lang.String = js.native
  def ensureActualIsNumber(actual: js.Any): scala.Unit = js.native
  def ensureActualIsNumber(actual: js.Any, matcherName: java.lang.String): scala.Unit = js.native
  def ensureExpectedIsNumber(actual: js.Any): scala.Unit = js.native
  def ensureExpectedIsNumber(actual: js.Any, matcherName: java.lang.String): scala.Unit = js.native
  def ensureNoExpected(actual: js.Any): scala.Unit = js.native
  def ensureNoExpected(actual: js.Any, matcherName: java.lang.String): scala.Unit = js.native
  def ensureNumbers(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def ensureNumbers(actual: js.Any, expected: js.Any, matcherName: java.lang.String): scala.Unit = js.native
  /**
    * get the type of a value with handling of edge cases like `typeof []` and `typeof null`
    */
  def getType(value: js.Any): java.lang.String = js.native
  def matcherHint(matcherName: java.lang.String): java.lang.String = js.native
  def matcherHint(matcherName: java.lang.String, received: java.lang.String): java.lang.String = js.native
  def matcherHint(matcherName: java.lang.String, received: java.lang.String, expected: java.lang.String): java.lang.String = js.native
  def matcherHint(
    matcherName: java.lang.String,
    received: java.lang.String,
    expected: java.lang.String,
    options: Anon_IsDirectExpectCall
  ): java.lang.String = js.native
  def pluralize(word: java.lang.String, count: scala.Double): java.lang.String = js.native
  def printExpected(value: js.Any): java.lang.String = js.native
  def printReceived(value: js.Any): java.lang.String = js.native
  def printWithType(
    name: java.lang.String,
    received: js.Any,
    print: js.Function1[/* value */ js.Any, java.lang.String]
  ): java.lang.String = js.native
  def stringify(`object`: js.Object): java.lang.String = js.native
  def stringify(`object`: js.Object, maxDepth: scala.Double): java.lang.String = js.native
}

