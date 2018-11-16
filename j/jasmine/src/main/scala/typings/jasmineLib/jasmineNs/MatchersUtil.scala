package typings
package jasmineLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchersUtil extends js.Object {
  def buildFailureMessage(matcherName: java.lang.String, isNot: scala.Boolean, actual: js.Any, expected: js.Any*): java.lang.String = js.native
  def contains[T](haystack: ArrayLike[T], needle: js.Any): scala.Boolean = js.native
  def contains[T](haystack: ArrayLike[T], needle: js.Any, customTesters: js.Array[CustomEqualityTester]): scala.Boolean = js.native
  def contains[T](haystack: java.lang.String, needle: js.Any): scala.Boolean = js.native
  def contains[T](haystack: java.lang.String, needle: js.Any, customTesters: js.Array[CustomEqualityTester]): scala.Boolean = js.native
  def equals(a: js.Any, b: js.Any): scala.Boolean = js.native
  def equals(a: js.Any, b: js.Any, customTesters: js.Array[CustomEqualityTester]): scala.Boolean = js.native
}

