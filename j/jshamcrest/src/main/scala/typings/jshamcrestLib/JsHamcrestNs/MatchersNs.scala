package typings
package jshamcrestLib.JsHamcrestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Defines all of the built-in matchers grouped into five categories.
     */
@JSGlobal("JsHamcrest.Matchers")
@js.native
object MatchersNs extends js.Object {
  def allOf(matchersOrValues: js.Any*): jshamcrestLib.JsHamcrestNs.SimpleMatcher = js.native
  def anyOf(matchersOrValues: js.Any*): jshamcrestLib.JsHamcrestNs.SimpleMatcher = js.native
  def anything(): jshamcrestLib.JsHamcrestNs.SimpleMatcher = js.native
  def between(start: js.Any): jshamcrestLib.JsHamcrestNs.BetweenBuilder = js.native
  def bool(): jshamcrestLib.JsHamcrestNs.SimpleMatcher = js.native
  def both(matcherOrValue: js.Any): jshamcrestLib.JsHamcrestNs.CombinableMatcher = js.native
  def closeTo(expected: scala.Double): jshamcrestLib.JsHamcrestNs.SimpleMatcher = js.native
  def closeTo(expected: scala.Double, delta: scala.Double): jshamcrestLib.JsHamcrestNs.SimpleMatcher = js.native
  def containsString(str: java.lang.String): jshamcrestLib.JsHamcrestNs.SimpleMatcher = js.native
  def divisibleBy(divisor: scala.Double): jshamcrestLib.JsHamcrestNs.SimpleMatcher = js.native
  def either(matcherOrValue: js.Any): jshamcrestLib.JsHamcrestNs.CombinableMatcher = js.native
  def emailAddress(): jshamcrestLib.JsHamcrestNs.SimpleMatcher = js.native
  def empty(): jshamcrestLib.JsHamcrestNs.SimpleMatcher = js.native
  def endsWith(str: java.lang.String): jshamcrestLib.JsHamcrestNs.SimpleMatcher = js.native
  def equalIgnoringCase(str: java.lang.String): jshamcrestLib.JsHamcrestNs.SimpleMatcher = js.native
  def equalTo(expected: js.Any): jshamcrestLib.JsHamcrestNs.SimpleMatcher = js.native
  def even(): jshamcrestLib.JsHamcrestNs.SimpleMatcher = js.native
  def everyItem(matcherOrValue: js.Any): jshamcrestLib.JsHamcrestNs.SimpleMatcher = js.native
  def func(): jshamcrestLib.JsHamcrestNs.SimpleMatcher = js.native
  def greaterThan(expected: js.Any): jshamcrestLib.JsHamcrestNs.SimpleMatcher = js.native
  def greaterThanOrEqualTo(expected: js.Any): jshamcrestLib.JsHamcrestNs.SimpleMatcher = js.native
  def hasFunction(functionName: java.lang.String): jshamcrestLib.JsHamcrestNs.SimpleMatcher = js.native
  def hasItem(matcherOrValue: js.Any): jshamcrestLib.JsHamcrestNs.SimpleMatcher = js.native
  def hasItems(matchersOrValues: js.Any*): jshamcrestLib.JsHamcrestNs.SimpleMatcher = js.native
  def hasMember(memberName: java.lang.String): jshamcrestLib.JsHamcrestNs.SimpleMatcher = js.native
  def hasMember(memberName: java.lang.String, matcherOrValue: js.Any): jshamcrestLib.JsHamcrestNs.SimpleMatcher = js.native
  def hasSize(matcherOrValue: js.Any): jshamcrestLib.JsHamcrestNs.SimpleMatcher = js.native
  def instanceOf(clazz: org.scalablytyped.runtime.Instantiable0[js.Any]): jshamcrestLib.JsHamcrestNs.SimpleMatcher = js.native
  def is(matcherOrValue: js.Any): jshamcrestLib.JsHamcrestNs.SimpleMatcher = js.native
  def isIn(items: js.Any*): jshamcrestLib.JsHamcrestNs.SimpleMatcher = js.native
  def lessThan(expected: js.Any): jshamcrestLib.JsHamcrestNs.SimpleMatcher = js.native
  def lessThanOrEqualTo(expected: js.Any): jshamcrestLib.JsHamcrestNs.SimpleMatcher = js.native
  def matches(regex: stdLib.RegExp): jshamcrestLib.JsHamcrestNs.SimpleMatcher = js.native
  def nil(): jshamcrestLib.JsHamcrestNs.SimpleMatcher = js.native
  def not(matcherOrValue: js.Any): jshamcrestLib.JsHamcrestNs.SimpleMatcher = js.native
  def notANumber(): jshamcrestLib.JsHamcrestNs.SimpleMatcher = js.native
  def number(): jshamcrestLib.JsHamcrestNs.SimpleMatcher = js.native
  def `object`(): jshamcrestLib.JsHamcrestNs.SimpleMatcher = js.native
  def odd(): jshamcrestLib.JsHamcrestNs.SimpleMatcher = js.native
  def oneOf(items: js.Any*): jshamcrestLib.JsHamcrestNs.SimpleMatcher = js.native
  def raises(exceptionName: java.lang.String): jshamcrestLib.JsHamcrestNs.SimpleMatcher = js.native
  def raisesAnything(): jshamcrestLib.JsHamcrestNs.SimpleMatcher = js.native
  def sameAs(expected: js.Any): jshamcrestLib.JsHamcrestNs.SimpleMatcher = js.native
  def startsWith(str: java.lang.String): jshamcrestLib.JsHamcrestNs.SimpleMatcher = js.native
  def string(): jshamcrestLib.JsHamcrestNs.SimpleMatcher = js.native
  def truth(): jshamcrestLib.JsHamcrestNs.SimpleMatcher = js.native
  def typeOf(typeName: java.lang.String): jshamcrestLib.JsHamcrestNs.SimpleMatcher = js.native
  def zero(): jshamcrestLib.JsHamcrestNs.SimpleMatcher = js.native
}

