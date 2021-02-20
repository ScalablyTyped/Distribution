package typings.jshamcrest

import org.scalablytyped.runtime.Instantiable0
import typings.jshamcrest.JsHamcrest.BetweenBuilder
import typings.jshamcrest.JsHamcrest.CombinableMatcher
import typings.jshamcrest.JsHamcrest.Description
import typings.jshamcrest.JsHamcrest.Matcher
import typings.jshamcrest.JsHamcrest.MatcherConfig
import typings.jshamcrest.JsHamcrest.Operators.AssertOptions
import typings.jshamcrest.JsHamcrest.SimpleMatcher
import typings.jshamcrest.anon.AttachAssertions
import typings.jshamcrest.anon.Scope
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object JsHamcrest {
    
    @JSGlobal("JsHamcrest")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("JsHamcrest.BetweenBuilder")
    @js.native
    class BetweenBuilder ()
      extends typings.jshamcrest.JsHamcrest.BetweenBuilder
    
    @JSGlobal("JsHamcrest.CombinableMatcher")
    @js.native
    class CombinableMatcher ()
      extends typings.jshamcrest.JsHamcrest.CombinableMatcher
    
    @JSGlobal("JsHamcrest.Description")
    @js.native
    class Description ()
      extends typings.jshamcrest.JsHamcrest.Description
    
    @JSGlobal("JsHamcrest.EqualTo")
    @js.native
    def EqualTo(factory: js.Function1[/* matcher */ Matcher, Matcher]): js.Function1[/* matcherOrValue */ js.Any, Matcher] = js.native
    
    /**
      * Provides methods for exposing matchers and operators for several testing frameworks.
      */
    object Integration {
      
      @JSGlobal("JsHamcrest.Integration.JsTestDriver")
      @js.native
      def JsTestDriver(): Unit = js.native
      @JSGlobal("JsHamcrest.Integration.JsTestDriver")
      @js.native
      def JsTestDriver(params: Scope): Unit = js.native
      
      @JSGlobal("JsHamcrest.Integration.JsUnitTest")
      @js.native
      def JsUnitTest(): Unit = js.native
      @JSGlobal("JsHamcrest.Integration.JsUnitTest")
      @js.native
      def JsUnitTest(params: Scope): Unit = js.native
      
      @JSGlobal("JsHamcrest.Integration.Nodeunit")
      @js.native
      def Nodeunit(): Unit = js.native
      @JSGlobal("JsHamcrest.Integration.Nodeunit")
      @js.native
      def Nodeunit(params: Scope): Unit = js.native
      
      @JSGlobal("JsHamcrest.Integration.QUnit")
      @js.native
      def QUnit(): Unit = js.native
      @JSGlobal("JsHamcrest.Integration.QUnit")
      @js.native
      def QUnit(params: Scope): Unit = js.native
      
      @JSGlobal("JsHamcrest.Integration.Rhino")
      @js.native
      def Rhino(): Unit = js.native
      
      @JSGlobal("JsHamcrest.Integration.WebBrowser")
      @js.native
      def WebBrowser(): Unit = js.native
      
      @JSGlobal("JsHamcrest.Integration.YUITest")
      @js.native
      def YUITest(): Unit = js.native
      @JSGlobal("JsHamcrest.Integration.YUITest")
      @js.native
      def YUITest(params: Scope): Unit = js.native
      
      @JSGlobal("JsHamcrest.Integration.copyMembers")
      @js.native
      def copyMembers(source: js.Object, target: js.Object): Unit = js.native
      @JSGlobal("JsHamcrest.Integration.copyMembers")
      @js.native
      def copyMembers(target: js.Object): Unit = js.native
      
      @JSGlobal("JsHamcrest.Integration.installMatchers")
      @js.native
      def installMatchers(source: js.Object): Unit = js.native
      
      @JSGlobal("JsHamcrest.Integration.installOperators")
      @js.native
      def installOperators(source: js.Object): Unit = js.native
      
      @JSGlobal("JsHamcrest.Integration.jasmine")
      @js.native
      def jasmine(): Unit = js.native
      @JSGlobal("JsHamcrest.Integration.jasmine")
      @js.native
      def jasmine(params: Scope): Unit = js.native
      
      @JSGlobal("JsHamcrest.Integration.jsUnity")
      @js.native
      def jsUnity(): Unit = js.native
      @JSGlobal("JsHamcrest.Integration.jsUnity")
      @js.native
      def jsUnity(params: AttachAssertions): Unit = js.native
      
      @JSGlobal("JsHamcrest.Integration.screwunit")
      @js.native
      def screwunit(): Unit = js.native
      @JSGlobal("JsHamcrest.Integration.screwunit")
      @js.native
      def screwunit(params: Scope): Unit = js.native
    }
    
    /**
      * Defines all of the built-in matchers grouped into five categories.
      */
    object Matchers {
      
      @JSGlobal("JsHamcrest.Matchers.allOf")
      @js.native
      def allOf(matchersOrValues: js.Any*): typings.jshamcrest.JsHamcrest.SimpleMatcher = js.native
      
      @JSGlobal("JsHamcrest.Matchers.anyOf")
      @js.native
      def anyOf(matchersOrValues: js.Any*): typings.jshamcrest.JsHamcrest.SimpleMatcher = js.native
      
      @JSGlobal("JsHamcrest.Matchers.anything")
      @js.native
      def anything(): typings.jshamcrest.JsHamcrest.SimpleMatcher = js.native
      
      @JSGlobal("JsHamcrest.Matchers.between")
      @js.native
      def between(start: js.Any): typings.jshamcrest.JsHamcrest.BetweenBuilder = js.native
      
      @JSGlobal("JsHamcrest.Matchers.bool")
      @js.native
      def bool(): typings.jshamcrest.JsHamcrest.SimpleMatcher = js.native
      
      @JSGlobal("JsHamcrest.Matchers.both")
      @js.native
      def both(matcherOrValue: js.Any): typings.jshamcrest.JsHamcrest.CombinableMatcher = js.native
      
      @JSGlobal("JsHamcrest.Matchers.closeTo")
      @js.native
      def closeTo(expected: Double): typings.jshamcrest.JsHamcrest.SimpleMatcher = js.native
      @JSGlobal("JsHamcrest.Matchers.closeTo")
      @js.native
      def closeTo(expected: Double, delta: Double): typings.jshamcrest.JsHamcrest.SimpleMatcher = js.native
      
      @JSGlobal("JsHamcrest.Matchers.containsString")
      @js.native
      def containsString(str: String): typings.jshamcrest.JsHamcrest.SimpleMatcher = js.native
      
      @JSGlobal("JsHamcrest.Matchers.divisibleBy")
      @js.native
      def divisibleBy(divisor: Double): typings.jshamcrest.JsHamcrest.SimpleMatcher = js.native
      
      @JSGlobal("JsHamcrest.Matchers.either")
      @js.native
      def either(matcherOrValue: js.Any): typings.jshamcrest.JsHamcrest.CombinableMatcher = js.native
      
      @JSGlobal("JsHamcrest.Matchers.emailAddress")
      @js.native
      def emailAddress(): typings.jshamcrest.JsHamcrest.SimpleMatcher = js.native
      
      @JSGlobal("JsHamcrest.Matchers.empty")
      @js.native
      def empty(): typings.jshamcrest.JsHamcrest.SimpleMatcher = js.native
      
      @JSGlobal("JsHamcrest.Matchers.endsWith")
      @js.native
      def endsWith(str: String): typings.jshamcrest.JsHamcrest.SimpleMatcher = js.native
      
      @JSGlobal("JsHamcrest.Matchers.equalIgnoringCase")
      @js.native
      def equalIgnoringCase(str: String): typings.jshamcrest.JsHamcrest.SimpleMatcher = js.native
      
      @JSGlobal("JsHamcrest.Matchers.equalTo")
      @js.native
      def equalTo(expected: js.Any): typings.jshamcrest.JsHamcrest.SimpleMatcher = js.native
      
      @JSGlobal("JsHamcrest.Matchers.even")
      @js.native
      def even(): typings.jshamcrest.JsHamcrest.SimpleMatcher = js.native
      
      @JSGlobal("JsHamcrest.Matchers.everyItem")
      @js.native
      def everyItem(matcherOrValue: js.Any): typings.jshamcrest.JsHamcrest.SimpleMatcher = js.native
      
      @JSGlobal("JsHamcrest.Matchers.func")
      @js.native
      def func(): typings.jshamcrest.JsHamcrest.SimpleMatcher = js.native
      
      @JSGlobal("JsHamcrest.Matchers.greaterThan")
      @js.native
      def greaterThan(expected: js.Any): typings.jshamcrest.JsHamcrest.SimpleMatcher = js.native
      
      @JSGlobal("JsHamcrest.Matchers.greaterThanOrEqualTo")
      @js.native
      def greaterThanOrEqualTo(expected: js.Any): typings.jshamcrest.JsHamcrest.SimpleMatcher = js.native
      
      @JSGlobal("JsHamcrest.Matchers.hasFunction")
      @js.native
      def hasFunction(functionName: String): typings.jshamcrest.JsHamcrest.SimpleMatcher = js.native
      
      @JSGlobal("JsHamcrest.Matchers.hasItem")
      @js.native
      def hasItem(matcherOrValue: js.Any): typings.jshamcrest.JsHamcrest.SimpleMatcher = js.native
      
      @JSGlobal("JsHamcrest.Matchers.hasItems")
      @js.native
      def hasItems(matchersOrValues: js.Any*): typings.jshamcrest.JsHamcrest.SimpleMatcher = js.native
      
      @JSGlobal("JsHamcrest.Matchers.hasMember")
      @js.native
      def hasMember(memberName: String): typings.jshamcrest.JsHamcrest.SimpleMatcher = js.native
      @JSGlobal("JsHamcrest.Matchers.hasMember")
      @js.native
      def hasMember(memberName: String, matcherOrValue: js.Any): typings.jshamcrest.JsHamcrest.SimpleMatcher = js.native
      
      @JSGlobal("JsHamcrest.Matchers.hasSize")
      @js.native
      def hasSize(matcherOrValue: js.Any): typings.jshamcrest.JsHamcrest.SimpleMatcher = js.native
      
      @JSGlobal("JsHamcrest.Matchers.instanceOf")
      @js.native
      def instanceOf(clazz: Instantiable0[js.Any]): typings.jshamcrest.JsHamcrest.SimpleMatcher = js.native
      
      @JSGlobal("JsHamcrest.Matchers.is")
      @js.native
      def is(matcherOrValue: js.Any): typings.jshamcrest.JsHamcrest.SimpleMatcher = js.native
      
      @JSGlobal("JsHamcrest.Matchers.isIn")
      @js.native
      def isIn(items: js.Any*): typings.jshamcrest.JsHamcrest.SimpleMatcher = js.native
      
      @JSGlobal("JsHamcrest.Matchers.lessThan")
      @js.native
      def lessThan(expected: js.Any): typings.jshamcrest.JsHamcrest.SimpleMatcher = js.native
      
      @JSGlobal("JsHamcrest.Matchers.lessThanOrEqualTo")
      @js.native
      def lessThanOrEqualTo(expected: js.Any): typings.jshamcrest.JsHamcrest.SimpleMatcher = js.native
      
      @JSGlobal("JsHamcrest.Matchers.matches")
      @js.native
      def matches(regex: RegExp): typings.jshamcrest.JsHamcrest.SimpleMatcher = js.native
      
      @JSGlobal("JsHamcrest.Matchers.nil")
      @js.native
      def nil(): typings.jshamcrest.JsHamcrest.SimpleMatcher = js.native
      
      @JSGlobal("JsHamcrest.Matchers.not")
      @js.native
      def not(matcherOrValue: js.Any): typings.jshamcrest.JsHamcrest.SimpleMatcher = js.native
      
      @JSGlobal("JsHamcrest.Matchers.notANumber")
      @js.native
      def notANumber(): typings.jshamcrest.JsHamcrest.SimpleMatcher = js.native
      
      @JSGlobal("JsHamcrest.Matchers.number")
      @js.native
      def number(): typings.jshamcrest.JsHamcrest.SimpleMatcher = js.native
      
      @JSGlobal("JsHamcrest.Matchers.odd")
      @js.native
      def odd(): typings.jshamcrest.JsHamcrest.SimpleMatcher = js.native
      
      @JSGlobal("JsHamcrest.Matchers.oneOf")
      @js.native
      def oneOf(items: js.Any*): typings.jshamcrest.JsHamcrest.SimpleMatcher = js.native
      
      @JSGlobal("JsHamcrest.Matchers.raises")
      @js.native
      def raises(exceptionName: String): typings.jshamcrest.JsHamcrest.SimpleMatcher = js.native
      
      @JSGlobal("JsHamcrest.Matchers.raisesAnything")
      @js.native
      def raisesAnything(): typings.jshamcrest.JsHamcrest.SimpleMatcher = js.native
      
      @JSGlobal("JsHamcrest.Matchers.sameAs")
      @js.native
      def sameAs(expected: js.Any): typings.jshamcrest.JsHamcrest.SimpleMatcher = js.native
      
      @JSGlobal("JsHamcrest.Matchers.startsWith")
      @js.native
      def startsWith(str: String): typings.jshamcrest.JsHamcrest.SimpleMatcher = js.native
      
      @JSGlobal("JsHamcrest.Matchers.string")
      @js.native
      def string(): typings.jshamcrest.JsHamcrest.SimpleMatcher = js.native
      
      @JSGlobal("JsHamcrest.Matchers.truth")
      @js.native
      def truth(): typings.jshamcrest.JsHamcrest.SimpleMatcher = js.native
      
      @JSGlobal("JsHamcrest.Matchers.typeOf")
      @js.native
      def typeOf(typeName: String): typings.jshamcrest.JsHamcrest.SimpleMatcher = js.native
      
      @JSGlobal("JsHamcrest.Matchers.zero")
      @js.native
      def zero(): typings.jshamcrest.JsHamcrest.SimpleMatcher = js.native
      
      @JSGlobal("JsHamcrest.Matchers.object")
      @js.native
      def `object`(): typings.jshamcrest.JsHamcrest.SimpleMatcher = js.native
    }
    
    /**
      * Provides the assertion, filtering, and currying methods.
      */
    object Operators {
      
      @JSGlobal("JsHamcrest.Operators.assert")
      @js.native
      def assert(actual: js.Any): typings.jshamcrest.JsHamcrest.Description = js.native
      @JSGlobal("JsHamcrest.Operators.assert")
      @js.native
      def assert(actual: js.Any, matcherOrValue: js.UndefOr[scala.Nothing], options: AssertOptions): typings.jshamcrest.JsHamcrest.Description = js.native
      @JSGlobal("JsHamcrest.Operators.assert")
      @js.native
      def assert(actual: js.Any, matcherOrValue: js.Any): typings.jshamcrest.JsHamcrest.Description = js.native
      @JSGlobal("JsHamcrest.Operators.assert")
      @js.native
      def assert(actual: js.Any, matcherOrValue: js.Any, options: AssertOptions): typings.jshamcrest.JsHamcrest.Description = js.native
      
      @JSGlobal("JsHamcrest.Operators.callTo")
      @js.native
      def callTo(func: js.Function1[/* repeated */ js.Any, _], args: js.Any*): js.Function0[_] = js.native
      
      @JSGlobal("JsHamcrest.Operators.filter")
      @js.native
      def filter(array: js.Array[_], matcherOrValue: js.Any): js.Array[_] = js.native
    }
    
    @JSGlobal("JsHamcrest.SimpleMatcher")
    @js.native
    class SimpleMatcher protected ()
      extends typings.jshamcrest.JsHamcrest.SimpleMatcher {
      def this(config: MatcherConfig) = this()
    }
    
    @JSGlobal("JsHamcrest.isMatcher")
    @js.native
    def isMatcher(obj: js.Any): Boolean = js.native
    
    @JSGlobal("JsHamcrest.version")
    @js.native
    def version: String = js.native
    @scala.inline
    def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  }
  
  //
  // Core Matchers
  //
  /**
    * All matchesOrValues must match the actual value. This matcher behaves pretty much like the JavaScript && (and) operator.
    *
    * @param matchersOrValues Instances of JsHamcrest.SimpleMatcher and/or values
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @JSGlobal("allOf")
  @js.native
  def allOf(matchersOrValues: js.Any*): SimpleMatcher = js.native
  
  /**
    * At least one of the matchersOrValues should match the actual value. This matcher behaves pretty much like the JavaScript || (or) operator.
    *
    * @param matchersOrValues Instances of JsHamcrest.SimpleMatcher and/or values
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @JSGlobal("anyOf")
  @js.native
  def anyOf(matchersOrValues: js.Any*): SimpleMatcher = js.native
  
  /**
    * Useless always-match matcher.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @JSGlobal("anything")
  @js.native
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
  @JSGlobal("assertThat")
  @js.native
  def assertThat(actual: js.Any): Description = js.native
  @JSGlobal("assertThat")
  @js.native
  def assertThat(actual: js.Any, matcher: js.UndefOr[scala.Nothing], message: js.Any): Description = js.native
  @JSGlobal("assertThat")
  @js.native
  def assertThat(actual: js.Any, matcher: Matcher): Description = js.native
  @JSGlobal("assertThat")
  @js.native
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
  @JSGlobal("between")
  @js.native
  def between(start: js.Any): BetweenBuilder = js.native
  
  //
  // Object Matchers
  //
  /**
    * The actual value must be a boolean.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @JSGlobal("bool")
  @js.native
  def bool(): SimpleMatcher = js.native
  
  /**
    * Combinable matcher where the actual value must match all the given matchers or values.
    *
    * @param matcherOrValue Instance of JsHamcrest.SimpleMatcher or a value
    * @return {JsHamcrest.CombinableMatcher} Instance of JsHamcrest.CombinableMatcher
    */
  @JSGlobal("both")
  @js.native
  def both(matcherOrValue: js.Any): CombinableMatcher = js.native
  
  /**
    * The actual number must be close enough to expected, that is, the actual number is equal to a value within some range of acceptable error.
    *
    * @param expected Expected number
    * @param [delta=0] Expected difference delta
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @JSGlobal("closeTo")
  @js.native
  def closeTo(expected: Double): SimpleMatcher = js.native
  @JSGlobal("closeTo")
  @js.native
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
  @JSGlobal("containsString")
  @js.native
  def containsString(str: String): SimpleMatcher = js.native
  
  /**
    * The actual number must be divisible by divisor.
    *
    * @param divisor Divisor
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @JSGlobal("divisibleBy")
  @js.native
  def divisibleBy(divisor: Double): SimpleMatcher = js.native
  
  /**
    * Combinable matcher where the actual value must match at least one of the given matchers or values.
    *
    * @param matcherOrValue Instance of JsHamcrest.SimpleMatcher or a value
    * @return {JsHamcrest.CombinableMatcher} Instance of JsHamcrest.CombinableMatcher
    */
  @JSGlobal("either")
  @js.native
  def either(matcherOrValue: js.Any): CombinableMatcher = js.native
  
  /**
    * The actual string must look like an e-mail address.
    *
    * Warning: This matcher is not fully compliant with RFC2822 due to its complexity.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @JSGlobal("emailAddress")
  @js.native
  def emailAddress(): SimpleMatcher = js.native
  
  //
  // Collection Matchers
  //
  /**
    * The length of the actual value must be zero.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @JSGlobal("empty")
  @js.native
  def empty(): SimpleMatcher = js.native
  
  /**
    * The actual string must end with str.
    *
    * @param str Substring
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @JSGlobal("endsWith")
  @js.native
  def endsWith(str: String): SimpleMatcher = js.native
  
  /**
    * The actual string must be equal to str, ignoring case.
    *
    * @param str String
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @JSGlobal("equalIgnoringCase")
  @js.native
  def equalIgnoringCase(str: String): SimpleMatcher = js.native
  
  /**
    * The actual value must be equal to expected.
    *
    * @param expected Expected value
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @JSGlobal("equalTo")
  @js.native
  def equalTo(expected: js.Any): SimpleMatcher = js.native
  
  /**
    * The actual number must be even.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @JSGlobal("even")
  @js.native
  def even(): SimpleMatcher = js.native
  
  /**
    * The actual value should be an array and matcherOrValue must match all items.
    *
    * @param matcherOrValue Instance of JsHamcrest.SimpleMatcher or a value
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @JSGlobal("everyItem")
  @js.native
  def everyItem(matcherOrValue: js.Any): SimpleMatcher = js.native
  
  /**
    * The actual value must be a function.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @JSGlobal("func")
  @js.native
  def func(): SimpleMatcher = js.native
  
  /**
    * The actual number must be greater than expected.
    *
    * @param expected Expected number
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @JSGlobal("greaterThan")
  @js.native
  def greaterThan(expected: js.Any): SimpleMatcher = js.native
  
  /**
    * The actual number must be greater than or equal to expected.
    *
    * @param expected Expected number
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @JSGlobal("greaterThanOrEqualTo")
  @js.native
  def greaterThanOrEqualTo(expected: js.Any): SimpleMatcher = js.native
  
  /**
    * The actual value has a function with the given name.
    *
    * @param functionName Function name
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @JSGlobal("hasFunction")
  @js.native
  def hasFunction(functionName: String): SimpleMatcher = js.native
  
  /**
    * The actual value should be an array and it must contain at least one value that matches matcherOrValue.
    *
    * @param matcherOrValue Instance of JsHamcrest.SimpleMatcher or a value
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @JSGlobal("hasItem")
  @js.native
  def hasItem(matcherOrValue: js.Any): SimpleMatcher = js.native
  
  /**
    * The actual value should be an array and matchersOrValues must match at least one item.
    *
    * @param matchersOrValues Instances of JsHamcrest.SimpleMatcher and/or values
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @JSGlobal("hasItems")
  @js.native
  def hasItems(matchersOrValues: js.Any*): SimpleMatcher = js.native
  
  /**
    * The actual value has an attribute with the given name.
    *
    * @param memberName Member name
    * @param [matcherOrValue] Instance of JsHamcrest.SimpleMatcher or a value
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @JSGlobal("hasMember")
  @js.native
  def hasMember(memberName: String): SimpleMatcher = js.native
  @JSGlobal("hasMember")
  @js.native
  def hasMember(memberName: String, matcherOrValue: js.Any): SimpleMatcher = js.native
  
  /**
    * The length of the actual value must match matcherOrValue.
    *
    * @param matcherOrValue Instance of JsHamcrest.SimpleMatcher or a value
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @JSGlobal("hasSize")
  @js.native
  def hasSize(matcherOrValue: js.Any): SimpleMatcher = js.native
  
  /**
    * The actual value must be an instance of clazz.
    *
    * @param clazz Constructor function
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @JSGlobal("instanceOf")
  @js.native
  def instanceOf(clazz: Instantiable0[js.Any]): SimpleMatcher = js.native
  
  /**
    * Delegate-only matcher frequently used to improve readability.
    *
    * @param matcherOrValue Instance of JsHamcrest.SimpleMatcher or a value
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @JSGlobal("is")
  @js.native
  def is(matcherOrValue: js.Any): SimpleMatcher = js.native
  
  /**
    * The given array or arguments must contain the actual value.
    *
    * @param items Array or list of values
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @JSGlobal("isIn")
  @js.native
  def isIn(items: js.Any*): SimpleMatcher = js.native
  
  /**
    * The actual number must be less than expected.
    *
    * @param expected Expected number
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @JSGlobal("lessThan")
  @js.native
  def lessThan(expected: js.Any): SimpleMatcher = js.native
  
  /**
    * The actual number must be less than or equal to expected.
    *
    * @param expected Expected number
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @JSGlobal("lessThanOrEqualTo")
  @js.native
  def lessThanOrEqualTo(expected: js.Any): SimpleMatcher = js.native
  
  /**
    * The actual string must match regex.
    *
    * @param regex String
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @JSGlobal("matches")
  @js.native
  def matches(regex: RegExp): SimpleMatcher = js.native
  
  /**
    * The actual value must be null or undefined.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @JSGlobal("nil")
  @js.native
  def nil(): SimpleMatcher = js.native
  
  /**
    * The actual value must not match matcherOrValue.
    *
    * @param matcherOrValue Instance of JsHamcrest.SimpleMatcher or a value
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @JSGlobal("not")
  @js.native
  def not(matcherOrValue: js.Any): SimpleMatcher = js.native
  
  /**
    * The actual value must not be a number.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @JSGlobal("notANumber")
  @js.native
  def notANumber(): SimpleMatcher = js.native
  
  /**
    * The actual value must be a number.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @JSGlobal("number")
  @js.native
  def number(): SimpleMatcher = js.native
  
  /**
    * The actual number must be odd.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @JSGlobal("odd")
  @js.native
  def odd(): SimpleMatcher = js.native
  
  /**
    * Alias to isIn() function.
    *
    * @param items Array or list of values
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @JSGlobal("oneOf")
  @js.native
  def oneOf(items: js.Any*): SimpleMatcher = js.native
  
  /**
    * The actual value is a function and, when invoked, it should throw an exception with the given name.
    *
    * @param exceptionName Name of the expected exception
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @JSGlobal("raises")
  @js.native
  def raises(exceptionName: String): SimpleMatcher = js.native
  
  /**
    * The actual value is a function and, when invoked, it should raise any exception.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @JSGlobal("raisesAnything")
  @js.native
  def raisesAnything(): SimpleMatcher = js.native
  
  /**
    * The actual value must be the same as expected.
    *
    * @param expected Expected value
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @JSGlobal("sameAs")
  @js.native
  def sameAs(expected: js.Any): SimpleMatcher = js.native
  
  /**
    * The actual string must start with str.
    *
    * @param str Substring
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @JSGlobal("startsWith")
  @js.native
  def startsWith(str: String): SimpleMatcher = js.native
  
  /**
    * The actual value must be a string.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @JSGlobal("string")
  @js.native
  def string(): SimpleMatcher = js.native
  
  /**
    * Matches any truthy value (not undefined, null, false, 0, NaN, or "").
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @JSGlobal("truth")
  @js.native
  def truth(): SimpleMatcher = js.native
  
  /**
    * The actual value must be of the given type.
    *
    * @param typeName Name of the type
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @JSGlobal("typeOf")
  @js.native
  def typeOf(typeName: String): SimpleMatcher = js.native
  
  /**
    * The actual number must be zero.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @JSGlobal("zero")
  @js.native
  def zero(): SimpleMatcher = js.native
  
  /**
    * The actual value must be an object.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @JSGlobal("object")
  @js.native
  def `object`(): SimpleMatcher = js.native
}
