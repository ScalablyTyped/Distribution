package typings.jshamcrest

import org.scalablytyped.runtime.Instantiable0
import typings.jshamcrest.JsHamcrestNs.BetweenBuilder
import typings.jshamcrest.JsHamcrestNs.CombinableMatcher
import typings.jshamcrest.JsHamcrestNs.Description
import typings.jshamcrest.JsHamcrestNs.Matcher
import typings.jshamcrest.JsHamcrestNs.SimpleMatcher
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  //
  // Core Matchers
  //
  /**
    * All matchesOrValues must match the actual value. This matcher behaves pretty much like the JavaScript && (and) operator.
    *
    * @param matchersOrValues Instances of JsHamcrest.SimpleMatcher and/or values
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def allOf(matchersOrValues: js.Any*): SimpleMatcher = js.native
  /**
    * At least one of the matchersOrValues should match the actual value. This matcher behaves pretty much like the JavaScript || (or) operator.
    *
    * @param matchersOrValues Instances of JsHamcrest.SimpleMatcher and/or values
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def anyOf(matchersOrValues: js.Any*): SimpleMatcher = js.native
  /**
    * Useless always-match matcher.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def anything(): SimpleMatcher = js.native
  //
  // Functions that are copied by copyMembers() to the global scope are copy-n-pasted here.
  //
  // TODO There must be a better way to do this, and not every testing framework places them in the global scope.
  //
  //
  // Assert
  //
  /**
    * Fails if the actual value does not match the matcher.
    *
    * @param actual Value to test against the matcher
    * @param matcher Applied to the value
    * @param message Prepends the built description
    * @return {JsHamcrest.Description} Contains the message, actual value, matcher, and result
    */
  def assertThat(actual: js.Any): Description = js.native
  def assertThat(actual: js.Any, matcher: Matcher): Description = js.native
  def assertThat(actual: js.Any, matcher: Matcher, message: js.Any): Description = js.native
  //
  // Number Matchers
  //
  /**
    * The actual number must be between the given range (inclusive).
    *
    * @param start Range start
    * @return {JsHamcrest.BetweenBuilder} Builder object with an and(end) method, which returns a JsHamcrest.SimpleMatcher instance and thus should be called to finish the matcher creation
    */
  def between(start: js.Any): BetweenBuilder = js.native
  //
  // Object Matchers
  //
  /**
    * The actual value must be a boolean.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def bool(): SimpleMatcher = js.native
  /**
    * Combinable matcher where the actual value must match all the given matchers or values.
    *
    * @param matcherOrValue Instance of JsHamcrest.SimpleMatcher or a value
    * @return {JsHamcrest.CombinableMatcher} Instance of JsHamcrest.CombinableMatcher
    */
  def both(matcherOrValue: js.Any): CombinableMatcher = js.native
  /**
    * The actual number must be close enough to expected, that is, the actual number is equal to a value within some range of acceptable error.
    *
    * @param expected Expected number
    * @param [delta=0] Expected difference delta
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def closeTo(expected: Double): SimpleMatcher = js.native
  def closeTo(expected: Double, delta: Double): SimpleMatcher = js.native
  //
  // Text Matchers
  //
  /**
    * The actual string must have a substring equals to str.
    *
    * @param str Substring
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def containsString(str: String): SimpleMatcher = js.native
  /**
    * The actual number must be divisible by divisor.
    *
    * @param divisor Divisor
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def divisibleBy(divisor: Double): SimpleMatcher = js.native
  /**
    * Combinable matcher where the actual value must match at least one of the given matchers or values.
    *
    * @param matcherOrValue Instance of JsHamcrest.SimpleMatcher or a value
    * @return {JsHamcrest.CombinableMatcher} Instance of JsHamcrest.CombinableMatcher
    */
  def either(matcherOrValue: js.Any): CombinableMatcher = js.native
  /**
    * The actual string must look like an e-mail address.
    *
    * Warning: This matcher is not fully compliant with RFC2822 due to its complexity.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def emailAddress(): SimpleMatcher = js.native
  //
  // Collection Matchers
  //
  /**
    * The length of the actual value must be zero.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def empty(): SimpleMatcher = js.native
  /**
    * The actual string must end with str.
    *
    * @param str Substring
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def endsWith(str: String): SimpleMatcher = js.native
  /**
    * The actual string must be equal to str, ignoring case.
    *
    * @param str String
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def equalIgnoringCase(str: String): SimpleMatcher = js.native
  /**
    * The actual value must be equal to expected.
    *
    * @param expected Expected value
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def equalTo(expected: js.Any): SimpleMatcher = js.native
  /**
    * The actual number must be even.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def even(): SimpleMatcher = js.native
  /**
    * The actual value should be an array and matcherOrValue must match all items.
    *
    * @param matcherOrValue Instance of JsHamcrest.SimpleMatcher or a value
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def everyItem(matcherOrValue: js.Any): SimpleMatcher = js.native
  /**
    * The actual value must be a function.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def func(): SimpleMatcher = js.native
  /**
    * The actual number must be greater than expected.
    *
    * @param expected Expected number
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def greaterThan(expected: js.Any): SimpleMatcher = js.native
  /**
    * The actual number must be greater than or equal to expected.
    *
    * @param expected Expected number
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def greaterThanOrEqualTo(expected: js.Any): SimpleMatcher = js.native
  /**
    * The actual value has a function with the given name.
    *
    * @param functionName Function name
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def hasFunction(functionName: String): SimpleMatcher = js.native
  /**
    * The actual value should be an array and it must contain at least one value that matches matcherOrValue.
    *
    * @param matcherOrValue Instance of JsHamcrest.SimpleMatcher or a value
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def hasItem(matcherOrValue: js.Any): SimpleMatcher = js.native
  /**
    * The actual value should be an array and matchersOrValues must match at least one item.
    *
    * @param matchersOrValues Instances of JsHamcrest.SimpleMatcher and/or values
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def hasItems(matchersOrValues: js.Any*): SimpleMatcher = js.native
  /**
    * The actual value has an attribute with the given name.
    *
    * @param memberName Member name
    * @param [matcherOrValue] Instance of JsHamcrest.SimpleMatcher or a value
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def hasMember(memberName: String): SimpleMatcher = js.native
  def hasMember(memberName: String, matcherOrValue: js.Any): SimpleMatcher = js.native
  /**
    * The length of the actual value must match matcherOrValue.
    *
    * @param matcherOrValue Instance of JsHamcrest.SimpleMatcher or a value
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def hasSize(matcherOrValue: js.Any): SimpleMatcher = js.native
  /**
    * The actual value must be an instance of clazz.
    *
    * @param clazz Constructor function
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def instanceOf(clazz: Instantiable0[js.Any]): SimpleMatcher = js.native
  /**
    * Delegate-only matcher frequently used to improve readability.
    *
    * @param matcherOrValue Instance of JsHamcrest.SimpleMatcher or a value
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def is(matcherOrValue: js.Any): SimpleMatcher = js.native
  /**
    * The given array or arguments must contain the actual value.
    *
    * @param items Array or list of values
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def isIn(items: js.Any*): SimpleMatcher = js.native
  /**
    * The actual number must be less than expected.
    *
    * @param expected Expected number
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def lessThan(expected: js.Any): SimpleMatcher = js.native
  /**
    * The actual number must be less than or equal to expected.
    *
    * @param expected Expected number
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def lessThanOrEqualTo(expected: js.Any): SimpleMatcher = js.native
  /**
    * The actual string must match regex.
    *
    * @param regex String
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def matches(regex: RegExp): SimpleMatcher = js.native
  /**
    * The actual value must be null or undefined.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def nil(): SimpleMatcher = js.native
  /**
    * The actual value must not match matcherOrValue.
    *
    * @param matcherOrValue Instance of JsHamcrest.SimpleMatcher or a value
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def not(matcherOrValue: js.Any): SimpleMatcher = js.native
  /**
    * The actual value must not be a number.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def notANumber(): SimpleMatcher = js.native
  /**
    * The actual value must be a number.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def number(): SimpleMatcher = js.native
  /**
    * The actual value must be an object.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def `object`(): SimpleMatcher = js.native
  /**
    * The actual number must be odd.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def odd(): SimpleMatcher = js.native
  /**
    * Alias to isIn() function.
    *
    * @param items Array or list of values
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def oneOf(items: js.Any*): SimpleMatcher = js.native
  /**
    * The actual value is a function and, when invoked, it should throw an exception with the given name.
    *
    * @param exceptionName Name of the expected exception
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def raises(exceptionName: String): SimpleMatcher = js.native
  /**
    * The actual value is a function and, when invoked, it should raise any exception.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def raisesAnything(): SimpleMatcher = js.native
  /**
    * The actual value must be the same as expected.
    *
    * @param expected Expected value
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def sameAs(expected: js.Any): SimpleMatcher = js.native
  /**
    * The actual string must start with str.
    *
    * @param str Substring
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def startsWith(str: String): SimpleMatcher = js.native
  /**
    * The actual value must be a string.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def string(): SimpleMatcher = js.native
  /**
    * Matches any truthy value (not undefined, null, false, 0, NaN, or "").
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def truth(): SimpleMatcher = js.native
  /**
    * The actual value must be of the given type.
    *
    * @param typeName Name of the type
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def typeOf(typeName: String): SimpleMatcher = js.native
  /**
    * The actual number must be zero.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def zero(): SimpleMatcher = js.native
}

