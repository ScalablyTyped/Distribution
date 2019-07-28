package typings.jshamcrest.JsHamcrestNs

import org.scalablytyped.runtime.Instantiable0
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines all of the built-in matchers grouped into five categories.
  */
@JSGlobal("JsHamcrest.Matchers")
@js.native
object MatchersNs extends js.Object {
  def allOf(matchersOrValues: js.Any*): SimpleMatcher = js.native
  def anyOf(matchersOrValues: js.Any*): SimpleMatcher = js.native
  def anything(): SimpleMatcher = js.native
  def between(start: js.Any): BetweenBuilder = js.native
  def bool(): SimpleMatcher = js.native
  def both(matcherOrValue: js.Any): CombinableMatcher = js.native
  def closeTo(expected: Double): SimpleMatcher = js.native
  def closeTo(expected: Double, delta: Double): SimpleMatcher = js.native
  def containsString(str: String): SimpleMatcher = js.native
  def divisibleBy(divisor: Double): SimpleMatcher = js.native
  def either(matcherOrValue: js.Any): CombinableMatcher = js.native
  def emailAddress(): SimpleMatcher = js.native
  def empty(): SimpleMatcher = js.native
  def endsWith(str: String): SimpleMatcher = js.native
  def equalIgnoringCase(str: String): SimpleMatcher = js.native
  def equalTo(expected: js.Any): SimpleMatcher = js.native
  def even(): SimpleMatcher = js.native
  def everyItem(matcherOrValue: js.Any): SimpleMatcher = js.native
  def func(): SimpleMatcher = js.native
  def greaterThan(expected: js.Any): SimpleMatcher = js.native
  def greaterThanOrEqualTo(expected: js.Any): SimpleMatcher = js.native
  def hasFunction(functionName: String): SimpleMatcher = js.native
  def hasItem(matcherOrValue: js.Any): SimpleMatcher = js.native
  def hasItems(matchersOrValues: js.Any*): SimpleMatcher = js.native
  def hasMember(memberName: String): SimpleMatcher = js.native
  def hasMember(memberName: String, matcherOrValue: js.Any): SimpleMatcher = js.native
  def hasSize(matcherOrValue: js.Any): SimpleMatcher = js.native
  def instanceOf(clazz: Instantiable0[js.Any]): SimpleMatcher = js.native
  def is(matcherOrValue: js.Any): SimpleMatcher = js.native
  def isIn(items: js.Any*): SimpleMatcher = js.native
  def lessThan(expected: js.Any): SimpleMatcher = js.native
  def lessThanOrEqualTo(expected: js.Any): SimpleMatcher = js.native
  def matches(regex: RegExp): SimpleMatcher = js.native
  def nil(): SimpleMatcher = js.native
  def not(matcherOrValue: js.Any): SimpleMatcher = js.native
  def notANumber(): SimpleMatcher = js.native
  def number(): SimpleMatcher = js.native
  def `object`(): SimpleMatcher = js.native
  def odd(): SimpleMatcher = js.native
  def oneOf(items: js.Any*): SimpleMatcher = js.native
  def raises(exceptionName: String): SimpleMatcher = js.native
  def raisesAnything(): SimpleMatcher = js.native
  def sameAs(expected: js.Any): SimpleMatcher = js.native
  def startsWith(str: String): SimpleMatcher = js.native
  def string(): SimpleMatcher = js.native
  def truth(): SimpleMatcher = js.native
  def typeOf(typeName: String): SimpleMatcher = js.native
  def zero(): SimpleMatcher = js.native
}

