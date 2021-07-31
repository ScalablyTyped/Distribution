package typings.jshamcrest

import org.scalablytyped.runtime.Instantiable0
import typings.jshamcrest.JsHamcrest.BetweenBuilder
import typings.jshamcrest.JsHamcrest.CombinableMatcher
import typings.jshamcrest.JsHamcrest.DescribeTo
import typings.jshamcrest.JsHamcrest.DescribeValueTo
import typings.jshamcrest.JsHamcrest.Description
import typings.jshamcrest.JsHamcrest.Matcher
import typings.jshamcrest.JsHamcrest.MatcherConfig
import typings.jshamcrest.JsHamcrest.Matches
import typings.jshamcrest.JsHamcrest.Operators.AssertOptions
import typings.jshamcrest.JsHamcrest.SelfDescribing
import typings.jshamcrest.JsHamcrest.SimpleMatcher
import typings.jshamcrest.anon.AttachAssertions
import typings.jshamcrest.anon.Scope
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object JsHamcrest {
    
    @JSGlobal("JsHamcrest")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("JsHamcrest.BetweenBuilder")
    @js.native
    class BetweenBuilder ()
      extends StObject
         with typings.jshamcrest.JsHamcrest.BetweenBuilder {
      
      /* CompleteClass */
      override def and(end: js.Any): typings.jshamcrest.JsHamcrest.SimpleMatcher = js.native
    }
    
    @JSGlobal("JsHamcrest.CombinableMatcher")
    @js.native
    class CombinableMatcher ()
      extends StObject
         with typings.jshamcrest.JsHamcrest.CombinableMatcher {
      
      /**
        * Wraps this matcher and the given matcher using JsHamcrest.Matchers.allOf().
        *
        * @param matcherOrValue Instance of JsHamcrest.SimpleMatcher or a value
        * @return {CombinableMatcher} Instance of JsHamcrest.CombinableMatcher
        */
      /* CompleteClass */
      override def and(matcherOrValue: js.Any): typings.jshamcrest.JsHamcrest.CombinableMatcher = js.native
      
      /* CompleteClass */
      override def describeTo(description: typings.jshamcrest.JsHamcrest.Description): Unit = js.native
      /* CompleteClass */
      @JSName("describeTo")
      var describeTo_Original: DescribeTo = js.native
      
      /* CompleteClass */
      override def describeValueTo(value: js.Any, description: typings.jshamcrest.JsHamcrest.Description): Unit = js.native
      /* CompleteClass */
      @JSName("describeValueTo")
      var describeValueTo_Original: DescribeValueTo = js.native
      
      /* CompleteClass */
      override def matches(value: js.Any): Boolean = js.native
      /* CompleteClass */
      @JSName("matches")
      var matches_Original: Matches = js.native
      
      /**
        * Wraps this matcher and the given matcher using JsHamcrest.Matchers.anyOf().
        *
        * @param matcherOrValue Instance of JsHamcrest.SimpleMatcher or a value
        * @return {CombinableMatcher} Instance of JsHamcrest.CombinableMatcher
        */
      /* CompleteClass */
      override def or(matcherOrValue: js.Any): typings.jshamcrest.JsHamcrest.CombinableMatcher = js.native
    }
    
    @JSGlobal("JsHamcrest.Description")
    @js.native
    class Description ()
      extends StObject
         with typings.jshamcrest.JsHamcrest.Description {
      
      /**
        * Appends text to this description.
        *
        * @param text Text to append to this description
        * @return {Description} Itself for method chaining
        */
      /* CompleteClass */
      override def append(text: js.Any): typings.jshamcrest.JsHamcrest.Description = js.native
      
      /**
        * Appends the description of a self describing object to this description.
        *
        * @param selfDescribingObject Any object that has a describeTo() function that accepts a JsHamcrest.Description object as argument
        * @return {Description} Itself for method chaining
        */
      /* CompleteClass */
      override def appendDescriptionOf(selfDescribingObject: SelfDescribing): typings.jshamcrest.JsHamcrest.Description = js.native
      
      /**
        * Appends the description of several self describing objects to this description.
        *
        * @param start Start string
        * @param separator Separator string
        * @param end End string
        * @param list Array of self describing objects. These objects must have a describeTo() function that accepts a JsHamcrest.Description object as argument
        * @return {Description} Itself for method chaining
        */
      /* CompleteClass */
      override def appendList(start: String, separator: String, end: String, list: js.Array[js.Any]): typings.jshamcrest.JsHamcrest.Description = js.native
      
      /**
        * Appends a JavaScript language’s literal to this description.
        *
        * @param literal Literal to append to this description
        * @return {Description} Itself for method chaining
        */
      /* CompleteClass */
      override def appendLiteral(literal: js.Any): typings.jshamcrest.JsHamcrest.Description = js.native
      
      /**
        * Appends an array of values to this description.
        *
        * @param start Start string
        * @param separator Separator string
        * @param end End string
        * @param list Array of values to be described to this description
        * @return {Description} Itself for method chaining
        */
      /* CompleteClass */
      override def appendValueList(start: String, separator: String, end: String, list: js.Array[SelfDescribing]): typings.jshamcrest.JsHamcrest.Description = js.native
      
      /**
        * Gets the current content of this description.
        *
        * @return {string} Current content of this description
        */
      /* CompleteClass */
      override def get(): String = js.native
    }
    
    @scala.inline
    def EqualTo(factory: js.Function1[/* matcher */ Matcher, Matcher]): js.Function1[/* matcherOrValue */ js.Any, Matcher] = ^.asInstanceOf[js.Dynamic].applyDynamic("EqualTo")(factory.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* matcherOrValue */ js.Any, Matcher]]
    
    /**
      * Provides methods for exposing matchers and operators for several testing frameworks.
      */
    object Integration {
      
      @JSGlobal("JsHamcrest.Integration")
      @js.native
      val ^ : js.Any = js.native
      
      @scala.inline
      def JsTestDriver(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("JsTestDriver")().asInstanceOf[Unit]
      @scala.inline
      def JsTestDriver(params: Scope): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("JsTestDriver")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      @scala.inline
      def JsUnitTest(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("JsUnitTest")().asInstanceOf[Unit]
      @scala.inline
      def JsUnitTest(params: Scope): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("JsUnitTest")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      @scala.inline
      def Nodeunit(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Nodeunit")().asInstanceOf[Unit]
      @scala.inline
      def Nodeunit(params: Scope): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Nodeunit")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      @scala.inline
      def QUnit(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("QUnit")().asInstanceOf[Unit]
      @scala.inline
      def QUnit(params: Scope): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("QUnit")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      @scala.inline
      def Rhino(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Rhino")().asInstanceOf[Unit]
      
      @scala.inline
      def WebBrowser(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("WebBrowser")().asInstanceOf[Unit]
      
      @scala.inline
      def YUITest(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("YUITest")().asInstanceOf[Unit]
      @scala.inline
      def YUITest(params: Scope): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("YUITest")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      @scala.inline
      def copyMembers(source: js.Object, target: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyMembers")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def copyMembers(target: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("copyMembers")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      @scala.inline
      def installMatchers(source: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("installMatchers")(source.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      @scala.inline
      def installOperators(source: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("installOperators")(source.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      @scala.inline
      def jasmine(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("jasmine")().asInstanceOf[Unit]
      @scala.inline
      def jasmine(params: Scope): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("jasmine")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      @scala.inline
      def jsUnity(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("jsUnity")().asInstanceOf[Unit]
      @scala.inline
      def jsUnity(params: AttachAssertions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("jsUnity")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      @scala.inline
      def screwunit(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("screwunit")().asInstanceOf[Unit]
      @scala.inline
      def screwunit(params: Scope): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("screwunit")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
    
    /**
      * Defines all of the built-in matchers grouped into five categories.
      */
    object Matchers {
      
      @JSGlobal("JsHamcrest.Matchers")
      @js.native
      val ^ : js.Any = js.native
      
      @scala.inline
      def allOf(matchersOrValues: js.Any*): typings.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("allOf")(matchersOrValues.asInstanceOf[js.Any]).asInstanceOf[typings.jshamcrest.JsHamcrest.SimpleMatcher]
      
      @scala.inline
      def anyOf(matchersOrValues: js.Any*): typings.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("anyOf")(matchersOrValues.asInstanceOf[js.Any]).asInstanceOf[typings.jshamcrest.JsHamcrest.SimpleMatcher]
      
      @scala.inline
      def anything(): typings.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("anything")().asInstanceOf[typings.jshamcrest.JsHamcrest.SimpleMatcher]
      
      @scala.inline
      def between(start: js.Any): typings.jshamcrest.JsHamcrest.BetweenBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("between")(start.asInstanceOf[js.Any]).asInstanceOf[typings.jshamcrest.JsHamcrest.BetweenBuilder]
      
      @scala.inline
      def bool(): typings.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("bool")().asInstanceOf[typings.jshamcrest.JsHamcrest.SimpleMatcher]
      
      @scala.inline
      def both(matcherOrValue: js.Any): typings.jshamcrest.JsHamcrest.CombinableMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("both")(matcherOrValue.asInstanceOf[js.Any]).asInstanceOf[typings.jshamcrest.JsHamcrest.CombinableMatcher]
      
      @scala.inline
      def closeTo(expected: Double): typings.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("closeTo")(expected.asInstanceOf[js.Any]).asInstanceOf[typings.jshamcrest.JsHamcrest.SimpleMatcher]
      @scala.inline
      def closeTo(expected: Double, delta: Double): typings.jshamcrest.JsHamcrest.SimpleMatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("closeTo")(expected.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[typings.jshamcrest.JsHamcrest.SimpleMatcher]
      
      @scala.inline
      def containsString(str: String): typings.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("containsString")(str.asInstanceOf[js.Any]).asInstanceOf[typings.jshamcrest.JsHamcrest.SimpleMatcher]
      
      @scala.inline
      def divisibleBy(divisor: Double): typings.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("divisibleBy")(divisor.asInstanceOf[js.Any]).asInstanceOf[typings.jshamcrest.JsHamcrest.SimpleMatcher]
      
      @scala.inline
      def either(matcherOrValue: js.Any): typings.jshamcrest.JsHamcrest.CombinableMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("either")(matcherOrValue.asInstanceOf[js.Any]).asInstanceOf[typings.jshamcrest.JsHamcrest.CombinableMatcher]
      
      @scala.inline
      def emailAddress(): typings.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("emailAddress")().asInstanceOf[typings.jshamcrest.JsHamcrest.SimpleMatcher]
      
      @scala.inline
      def empty(): typings.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[typings.jshamcrest.JsHamcrest.SimpleMatcher]
      
      @scala.inline
      def endsWith(str: String): typings.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("endsWith")(str.asInstanceOf[js.Any]).asInstanceOf[typings.jshamcrest.JsHamcrest.SimpleMatcher]
      
      @scala.inline
      def equalIgnoringCase(str: String): typings.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("equalIgnoringCase")(str.asInstanceOf[js.Any]).asInstanceOf[typings.jshamcrest.JsHamcrest.SimpleMatcher]
      
      @scala.inline
      def equalTo(expected: js.Any): typings.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(expected.asInstanceOf[js.Any]).asInstanceOf[typings.jshamcrest.JsHamcrest.SimpleMatcher]
      
      @scala.inline
      def even(): typings.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("even")().asInstanceOf[typings.jshamcrest.JsHamcrest.SimpleMatcher]
      
      @scala.inline
      def everyItem(matcherOrValue: js.Any): typings.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("everyItem")(matcherOrValue.asInstanceOf[js.Any]).asInstanceOf[typings.jshamcrest.JsHamcrest.SimpleMatcher]
      
      @scala.inline
      def func(): typings.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("func")().asInstanceOf[typings.jshamcrest.JsHamcrest.SimpleMatcher]
      
      @scala.inline
      def greaterThan(expected: js.Any): typings.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("greaterThan")(expected.asInstanceOf[js.Any]).asInstanceOf[typings.jshamcrest.JsHamcrest.SimpleMatcher]
      
      @scala.inline
      def greaterThanOrEqualTo(expected: js.Any): typings.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("greaterThanOrEqualTo")(expected.asInstanceOf[js.Any]).asInstanceOf[typings.jshamcrest.JsHamcrest.SimpleMatcher]
      
      @scala.inline
      def hasFunction(functionName: String): typings.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("hasFunction")(functionName.asInstanceOf[js.Any]).asInstanceOf[typings.jshamcrest.JsHamcrest.SimpleMatcher]
      
      @scala.inline
      def hasItem(matcherOrValue: js.Any): typings.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("hasItem")(matcherOrValue.asInstanceOf[js.Any]).asInstanceOf[typings.jshamcrest.JsHamcrest.SimpleMatcher]
      
      @scala.inline
      def hasItems(matchersOrValues: js.Any*): typings.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("hasItems")(matchersOrValues.asInstanceOf[js.Any]).asInstanceOf[typings.jshamcrest.JsHamcrest.SimpleMatcher]
      
      @scala.inline
      def hasMember(memberName: String): typings.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("hasMember")(memberName.asInstanceOf[js.Any]).asInstanceOf[typings.jshamcrest.JsHamcrest.SimpleMatcher]
      @scala.inline
      def hasMember(memberName: String, matcherOrValue: js.Any): typings.jshamcrest.JsHamcrest.SimpleMatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("hasMember")(memberName.asInstanceOf[js.Any], matcherOrValue.asInstanceOf[js.Any])).asInstanceOf[typings.jshamcrest.JsHamcrest.SimpleMatcher]
      
      @scala.inline
      def hasSize(matcherOrValue: js.Any): typings.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("hasSize")(matcherOrValue.asInstanceOf[js.Any]).asInstanceOf[typings.jshamcrest.JsHamcrest.SimpleMatcher]
      
      @scala.inline
      def instanceOf(clazz: Instantiable0[js.Any]): typings.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("instanceOf")(clazz.asInstanceOf[js.Any]).asInstanceOf[typings.jshamcrest.JsHamcrest.SimpleMatcher]
      
      @scala.inline
      def is(matcherOrValue: js.Any): typings.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(matcherOrValue.asInstanceOf[js.Any]).asInstanceOf[typings.jshamcrest.JsHamcrest.SimpleMatcher]
      
      @scala.inline
      def isIn(items: js.Any*): typings.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("isIn")(items.asInstanceOf[js.Any]).asInstanceOf[typings.jshamcrest.JsHamcrest.SimpleMatcher]
      
      @scala.inline
      def lessThan(expected: js.Any): typings.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("lessThan")(expected.asInstanceOf[js.Any]).asInstanceOf[typings.jshamcrest.JsHamcrest.SimpleMatcher]
      
      @scala.inline
      def lessThanOrEqualTo(expected: js.Any): typings.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("lessThanOrEqualTo")(expected.asInstanceOf[js.Any]).asInstanceOf[typings.jshamcrest.JsHamcrest.SimpleMatcher]
      
      @scala.inline
      def matches(regex: RegExp): typings.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("matches")(regex.asInstanceOf[js.Any]).asInstanceOf[typings.jshamcrest.JsHamcrest.SimpleMatcher]
      
      @scala.inline
      def nil(): typings.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("nil")().asInstanceOf[typings.jshamcrest.JsHamcrest.SimpleMatcher]
      
      @scala.inline
      def not(matcherOrValue: js.Any): typings.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(matcherOrValue.asInstanceOf[js.Any]).asInstanceOf[typings.jshamcrest.JsHamcrest.SimpleMatcher]
      
      @scala.inline
      def notANumber(): typings.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("notANumber")().asInstanceOf[typings.jshamcrest.JsHamcrest.SimpleMatcher]
      
      @scala.inline
      def number(): typings.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("number")().asInstanceOf[typings.jshamcrest.JsHamcrest.SimpleMatcher]
      
      @scala.inline
      def `object`(): typings.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("object")().asInstanceOf[typings.jshamcrest.JsHamcrest.SimpleMatcher]
      
      @scala.inline
      def odd(): typings.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("odd")().asInstanceOf[typings.jshamcrest.JsHamcrest.SimpleMatcher]
      
      @scala.inline
      def oneOf(items: js.Any*): typings.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("oneOf")(items.asInstanceOf[js.Any]).asInstanceOf[typings.jshamcrest.JsHamcrest.SimpleMatcher]
      
      @scala.inline
      def raises(exceptionName: String): typings.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("raises")(exceptionName.asInstanceOf[js.Any]).asInstanceOf[typings.jshamcrest.JsHamcrest.SimpleMatcher]
      
      @scala.inline
      def raisesAnything(): typings.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("raisesAnything")().asInstanceOf[typings.jshamcrest.JsHamcrest.SimpleMatcher]
      
      @scala.inline
      def sameAs(expected: js.Any): typings.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("sameAs")(expected.asInstanceOf[js.Any]).asInstanceOf[typings.jshamcrest.JsHamcrest.SimpleMatcher]
      
      @scala.inline
      def startsWith(str: String): typings.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("startsWith")(str.asInstanceOf[js.Any]).asInstanceOf[typings.jshamcrest.JsHamcrest.SimpleMatcher]
      
      @scala.inline
      def string(): typings.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("string")().asInstanceOf[typings.jshamcrest.JsHamcrest.SimpleMatcher]
      
      @scala.inline
      def truth(): typings.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("truth")().asInstanceOf[typings.jshamcrest.JsHamcrest.SimpleMatcher]
      
      @scala.inline
      def typeOf(typeName: String): typings.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("typeOf")(typeName.asInstanceOf[js.Any]).asInstanceOf[typings.jshamcrest.JsHamcrest.SimpleMatcher]
      
      @scala.inline
      def zero(): typings.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("zero")().asInstanceOf[typings.jshamcrest.JsHamcrest.SimpleMatcher]
    }
    
    /**
      * Provides the assertion, filtering, and currying methods.
      */
    object Operators {
      
      @JSGlobal("JsHamcrest.Operators")
      @js.native
      val ^ : js.Any = js.native
      
      @scala.inline
      def assert(actual: js.Any): typings.jshamcrest.JsHamcrest.Description = ^.asInstanceOf[js.Dynamic].applyDynamic("assert")(actual.asInstanceOf[js.Any]).asInstanceOf[typings.jshamcrest.JsHamcrest.Description]
      @scala.inline
      def assert(actual: js.Any, matcherOrValue: js.Any): typings.jshamcrest.JsHamcrest.Description = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(actual.asInstanceOf[js.Any], matcherOrValue.asInstanceOf[js.Any])).asInstanceOf[typings.jshamcrest.JsHamcrest.Description]
      @scala.inline
      def assert(actual: js.Any, matcherOrValue: js.Any, options: AssertOptions): typings.jshamcrest.JsHamcrest.Description = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(actual.asInstanceOf[js.Any], matcherOrValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.jshamcrest.JsHamcrest.Description]
      @scala.inline
      def assert(actual: js.Any, matcherOrValue: Unit, options: AssertOptions): typings.jshamcrest.JsHamcrest.Description = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(actual.asInstanceOf[js.Any], matcherOrValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.jshamcrest.JsHamcrest.Description]
      
      @scala.inline
      def callTo(func: js.Function1[/* repeated */ js.Any, js.Any], args: js.Any*): js.Function0[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("callTo")(func.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Function0[js.Any]]
      
      @scala.inline
      def filter(array: js.Array[js.Any], matcherOrValue: js.Any): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(array.asInstanceOf[js.Any], matcherOrValue.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
    }
    
    @JSGlobal("JsHamcrest.SimpleMatcher")
    @js.native
    class SimpleMatcher protected ()
      extends StObject
         with typings.jshamcrest.JsHamcrest.SimpleMatcher {
      def this(config: MatcherConfig) = this()
      
      /* CompleteClass */
      override def describeTo(description: typings.jshamcrest.JsHamcrest.Description): Unit = js.native
      /* CompleteClass */
      @JSName("describeTo")
      var describeTo_Original: DescribeTo = js.native
      
      /* CompleteClass */
      override def describeValueTo(value: js.Any, description: typings.jshamcrest.JsHamcrest.Description): Unit = js.native
      /* CompleteClass */
      @JSName("describeValueTo")
      var describeValueTo_Original: DescribeValueTo = js.native
      
      /* CompleteClass */
      override def matches(value: js.Any): Boolean = js.native
      /* CompleteClass */
      @JSName("matches")
      var matches_Original: Matches = js.native
    }
    
    @scala.inline
    def isMatcher(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMatcher")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
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
  @scala.inline
  def allOf(matchersOrValues: js.Any*): SimpleMatcher = js.Dynamic.global.applyDynamic("allOf")(matchersOrValues.asInstanceOf[js.Any]).asInstanceOf[SimpleMatcher]
  
  /**
    * At least one of the matchersOrValues should match the actual value. This matcher behaves pretty much like the JavaScript || (or) operator.
    *
    * @param matchersOrValues Instances of JsHamcrest.SimpleMatcher and/or values
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @scala.inline
  def anyOf(matchersOrValues: js.Any*): SimpleMatcher = js.Dynamic.global.applyDynamic("anyOf")(matchersOrValues.asInstanceOf[js.Any]).asInstanceOf[SimpleMatcher]
  
  /**
    * Useless always-match matcher.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @scala.inline
  def anything(): SimpleMatcher = js.Dynamic.global.applyDynamic("anything")().asInstanceOf[SimpleMatcher]
  
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
  @scala.inline
  def assertThat(actual: js.Any): Description = js.Dynamic.global.applyDynamic("assertThat")(actual.asInstanceOf[js.Any]).asInstanceOf[Description]
  @scala.inline
  def assertThat(actual: js.Any, matcher: Unit, message: js.Any): Description = (js.Dynamic.global.applyDynamic("assertThat")(actual.asInstanceOf[js.Any], matcher.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Description]
  @scala.inline
  def assertThat(actual: js.Any, matcher: Matcher): Description = (js.Dynamic.global.applyDynamic("assertThat")(actual.asInstanceOf[js.Any], matcher.asInstanceOf[js.Any])).asInstanceOf[Description]
  @scala.inline
  def assertThat(actual: js.Any, matcher: Matcher, message: js.Any): Description = (js.Dynamic.global.applyDynamic("assertThat")(actual.asInstanceOf[js.Any], matcher.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Description]
  
  //
  // Number Matchers
  //
  /**
    * The actual number must be between the given range (inclusive).
    *
    * @param start Range start
    * @return {JsHamcrest.BetweenBuilder} Builder object with an and(end) method, which returns a JsHamcrest.SimpleMatcher instance and thus should be called to finish the matcher creation
    */
  @scala.inline
  def between(start: js.Any): BetweenBuilder = js.Dynamic.global.applyDynamic("between")(start.asInstanceOf[js.Any]).asInstanceOf[BetweenBuilder]
  
  //
  // Object Matchers
  //
  /**
    * The actual value must be a boolean.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @scala.inline
  def bool(): SimpleMatcher = js.Dynamic.global.applyDynamic("bool")().asInstanceOf[SimpleMatcher]
  
  /**
    * Combinable matcher where the actual value must match all the given matchers or values.
    *
    * @param matcherOrValue Instance of JsHamcrest.SimpleMatcher or a value
    * @return {JsHamcrest.CombinableMatcher} Instance of JsHamcrest.CombinableMatcher
    */
  @scala.inline
  def both(matcherOrValue: js.Any): CombinableMatcher = js.Dynamic.global.applyDynamic("both")(matcherOrValue.asInstanceOf[js.Any]).asInstanceOf[CombinableMatcher]
  
  /**
    * The actual number must be close enough to expected, that is, the actual number is equal to a value within some range of acceptable error.
    *
    * @param expected Expected number
    * @param [delta=0] Expected difference delta
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @scala.inline
  def closeTo(expected: Double): SimpleMatcher = js.Dynamic.global.applyDynamic("closeTo")(expected.asInstanceOf[js.Any]).asInstanceOf[SimpleMatcher]
  @scala.inline
  def closeTo(expected: Double, delta: Double): SimpleMatcher = (js.Dynamic.global.applyDynamic("closeTo")(expected.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[SimpleMatcher]
  
  //
  // Text Matchers
  //
  /**
    * The actual string must have a substring equals to str.
    *
    * @param str Substring
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @scala.inline
  def containsString(str: String): SimpleMatcher = js.Dynamic.global.applyDynamic("containsString")(str.asInstanceOf[js.Any]).asInstanceOf[SimpleMatcher]
  
  /**
    * The actual number must be divisible by divisor.
    *
    * @param divisor Divisor
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @scala.inline
  def divisibleBy(divisor: Double): SimpleMatcher = js.Dynamic.global.applyDynamic("divisibleBy")(divisor.asInstanceOf[js.Any]).asInstanceOf[SimpleMatcher]
  
  /**
    * Combinable matcher where the actual value must match at least one of the given matchers or values.
    *
    * @param matcherOrValue Instance of JsHamcrest.SimpleMatcher or a value
    * @return {JsHamcrest.CombinableMatcher} Instance of JsHamcrest.CombinableMatcher
    */
  @scala.inline
  def either(matcherOrValue: js.Any): CombinableMatcher = js.Dynamic.global.applyDynamic("either")(matcherOrValue.asInstanceOf[js.Any]).asInstanceOf[CombinableMatcher]
  
  /**
    * The actual string must look like an e-mail address.
    *
    * Warning: This matcher is not fully compliant with RFC2822 due to its complexity.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @scala.inline
  def emailAddress(): SimpleMatcher = js.Dynamic.global.applyDynamic("emailAddress")().asInstanceOf[SimpleMatcher]
  
  //
  // Collection Matchers
  //
  /**
    * The length of the actual value must be zero.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @scala.inline
  def empty(): SimpleMatcher = js.Dynamic.global.applyDynamic("empty")().asInstanceOf[SimpleMatcher]
  
  /**
    * The actual string must end with str.
    *
    * @param str Substring
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @scala.inline
  def endsWith(str: String): SimpleMatcher = js.Dynamic.global.applyDynamic("endsWith")(str.asInstanceOf[js.Any]).asInstanceOf[SimpleMatcher]
  
  /**
    * The actual string must be equal to str, ignoring case.
    *
    * @param str String
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @scala.inline
  def equalIgnoringCase(str: String): SimpleMatcher = js.Dynamic.global.applyDynamic("equalIgnoringCase")(str.asInstanceOf[js.Any]).asInstanceOf[SimpleMatcher]
  
  /**
    * The actual value must be equal to expected.
    *
    * @param expected Expected value
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @scala.inline
  def equalTo(expected: js.Any): SimpleMatcher = js.Dynamic.global.applyDynamic("equalTo")(expected.asInstanceOf[js.Any]).asInstanceOf[SimpleMatcher]
  
  /**
    * The actual number must be even.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @scala.inline
  def even(): SimpleMatcher = js.Dynamic.global.applyDynamic("even")().asInstanceOf[SimpleMatcher]
  
  /**
    * The actual value should be an array and matcherOrValue must match all items.
    *
    * @param matcherOrValue Instance of JsHamcrest.SimpleMatcher or a value
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @scala.inline
  def everyItem(matcherOrValue: js.Any): SimpleMatcher = js.Dynamic.global.applyDynamic("everyItem")(matcherOrValue.asInstanceOf[js.Any]).asInstanceOf[SimpleMatcher]
  
  /**
    * The actual value must be a function.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @scala.inline
  def func(): SimpleMatcher = js.Dynamic.global.applyDynamic("func")().asInstanceOf[SimpleMatcher]
  
  /**
    * The actual number must be greater than expected.
    *
    * @param expected Expected number
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @scala.inline
  def greaterThan(expected: js.Any): SimpleMatcher = js.Dynamic.global.applyDynamic("greaterThan")(expected.asInstanceOf[js.Any]).asInstanceOf[SimpleMatcher]
  
  /**
    * The actual number must be greater than or equal to expected.
    *
    * @param expected Expected number
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @scala.inline
  def greaterThanOrEqualTo(expected: js.Any): SimpleMatcher = js.Dynamic.global.applyDynamic("greaterThanOrEqualTo")(expected.asInstanceOf[js.Any]).asInstanceOf[SimpleMatcher]
  
  /**
    * The actual value has a function with the given name.
    *
    * @param functionName Function name
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @scala.inline
  def hasFunction(functionName: String): SimpleMatcher = js.Dynamic.global.applyDynamic("hasFunction")(functionName.asInstanceOf[js.Any]).asInstanceOf[SimpleMatcher]
  
  /**
    * The actual value should be an array and it must contain at least one value that matches matcherOrValue.
    *
    * @param matcherOrValue Instance of JsHamcrest.SimpleMatcher or a value
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @scala.inline
  def hasItem(matcherOrValue: js.Any): SimpleMatcher = js.Dynamic.global.applyDynamic("hasItem")(matcherOrValue.asInstanceOf[js.Any]).asInstanceOf[SimpleMatcher]
  
  /**
    * The actual value should be an array and matchersOrValues must match at least one item.
    *
    * @param matchersOrValues Instances of JsHamcrest.SimpleMatcher and/or values
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @scala.inline
  def hasItems(matchersOrValues: js.Any*): SimpleMatcher = js.Dynamic.global.applyDynamic("hasItems")(matchersOrValues.asInstanceOf[js.Any]).asInstanceOf[SimpleMatcher]
  
  /**
    * The actual value has an attribute with the given name.
    *
    * @param memberName Member name
    * @param [matcherOrValue] Instance of JsHamcrest.SimpleMatcher or a value
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @scala.inline
  def hasMember(memberName: String): SimpleMatcher = js.Dynamic.global.applyDynamic("hasMember")(memberName.asInstanceOf[js.Any]).asInstanceOf[SimpleMatcher]
  @scala.inline
  def hasMember(memberName: String, matcherOrValue: js.Any): SimpleMatcher = (js.Dynamic.global.applyDynamic("hasMember")(memberName.asInstanceOf[js.Any], matcherOrValue.asInstanceOf[js.Any])).asInstanceOf[SimpleMatcher]
  
  /**
    * The length of the actual value must match matcherOrValue.
    *
    * @param matcherOrValue Instance of JsHamcrest.SimpleMatcher or a value
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @scala.inline
  def hasSize(matcherOrValue: js.Any): SimpleMatcher = js.Dynamic.global.applyDynamic("hasSize")(matcherOrValue.asInstanceOf[js.Any]).asInstanceOf[SimpleMatcher]
  
  /**
    * The actual value must be an instance of clazz.
    *
    * @param clazz Constructor function
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @scala.inline
  def instanceOf(clazz: Instantiable0[js.Any]): SimpleMatcher = js.Dynamic.global.applyDynamic("instanceOf")(clazz.asInstanceOf[js.Any]).asInstanceOf[SimpleMatcher]
  
  /**
    * Delegate-only matcher frequently used to improve readability.
    *
    * @param matcherOrValue Instance of JsHamcrest.SimpleMatcher or a value
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @scala.inline
  def is(matcherOrValue: js.Any): SimpleMatcher = js.Dynamic.global.applyDynamic("is")(matcherOrValue.asInstanceOf[js.Any]).asInstanceOf[SimpleMatcher]
  
  /**
    * The given array or arguments must contain the actual value.
    *
    * @param items Array or list of values
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @scala.inline
  def isIn(items: js.Any*): SimpleMatcher = js.Dynamic.global.applyDynamic("isIn")(items.asInstanceOf[js.Any]).asInstanceOf[SimpleMatcher]
  
  /**
    * The actual number must be less than expected.
    *
    * @param expected Expected number
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @scala.inline
  def lessThan(expected: js.Any): SimpleMatcher = js.Dynamic.global.applyDynamic("lessThan")(expected.asInstanceOf[js.Any]).asInstanceOf[SimpleMatcher]
  
  /**
    * The actual number must be less than or equal to expected.
    *
    * @param expected Expected number
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @scala.inline
  def lessThanOrEqualTo(expected: js.Any): SimpleMatcher = js.Dynamic.global.applyDynamic("lessThanOrEqualTo")(expected.asInstanceOf[js.Any]).asInstanceOf[SimpleMatcher]
  
  /**
    * The actual string must match regex.
    *
    * @param regex String
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @scala.inline
  def matches(regex: RegExp): SimpleMatcher = js.Dynamic.global.applyDynamic("matches")(regex.asInstanceOf[js.Any]).asInstanceOf[SimpleMatcher]
  
  /**
    * The actual value must be null or undefined.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @scala.inline
  def nil(): SimpleMatcher = js.Dynamic.global.applyDynamic("nil")().asInstanceOf[SimpleMatcher]
  
  /**
    * The actual value must not match matcherOrValue.
    *
    * @param matcherOrValue Instance of JsHamcrest.SimpleMatcher or a value
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @scala.inline
  def not(matcherOrValue: js.Any): SimpleMatcher = js.Dynamic.global.applyDynamic("not")(matcherOrValue.asInstanceOf[js.Any]).asInstanceOf[SimpleMatcher]
  
  /**
    * The actual value must not be a number.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @scala.inline
  def notANumber(): SimpleMatcher = js.Dynamic.global.applyDynamic("notANumber")().asInstanceOf[SimpleMatcher]
  
  /**
    * The actual value must be a number.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @scala.inline
  def number(): SimpleMatcher = js.Dynamic.global.applyDynamic("number")().asInstanceOf[SimpleMatcher]
  
  /**
    * The actual value must be an object.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @scala.inline
  def `object`(): SimpleMatcher = js.Dynamic.global.applyDynamic("object")().asInstanceOf[SimpleMatcher]
  
  /**
    * The actual number must be odd.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @scala.inline
  def odd(): SimpleMatcher = js.Dynamic.global.applyDynamic("odd")().asInstanceOf[SimpleMatcher]
  
  /**
    * Alias to isIn() function.
    *
    * @param items Array or list of values
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @scala.inline
  def oneOf(items: js.Any*): SimpleMatcher = js.Dynamic.global.applyDynamic("oneOf")(items.asInstanceOf[js.Any]).asInstanceOf[SimpleMatcher]
  
  /**
    * The actual value is a function and, when invoked, it should throw an exception with the given name.
    *
    * @param exceptionName Name of the expected exception
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @scala.inline
  def raises(exceptionName: String): SimpleMatcher = js.Dynamic.global.applyDynamic("raises")(exceptionName.asInstanceOf[js.Any]).asInstanceOf[SimpleMatcher]
  
  /**
    * The actual value is a function and, when invoked, it should raise any exception.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @scala.inline
  def raisesAnything(): SimpleMatcher = js.Dynamic.global.applyDynamic("raisesAnything")().asInstanceOf[SimpleMatcher]
  
  /**
    * The actual value must be the same as expected.
    *
    * @param expected Expected value
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @scala.inline
  def sameAs(expected: js.Any): SimpleMatcher = js.Dynamic.global.applyDynamic("sameAs")(expected.asInstanceOf[js.Any]).asInstanceOf[SimpleMatcher]
  
  /**
    * The actual string must start with str.
    *
    * @param str Substring
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @scala.inline
  def startsWith(str: String): SimpleMatcher = js.Dynamic.global.applyDynamic("startsWith")(str.asInstanceOf[js.Any]).asInstanceOf[SimpleMatcher]
  
  /**
    * The actual value must be a string.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @scala.inline
  def string(): SimpleMatcher = js.Dynamic.global.applyDynamic("string")().asInstanceOf[SimpleMatcher]
  
  /**
    * Matches any truthy value (not undefined, null, false, 0, NaN, or "").
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @scala.inline
  def truth(): SimpleMatcher = js.Dynamic.global.applyDynamic("truth")().asInstanceOf[SimpleMatcher]
  
  /**
    * The actual value must be of the given type.
    *
    * @param typeName Name of the type
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @scala.inline
  def typeOf(typeName: String): SimpleMatcher = js.Dynamic.global.applyDynamic("typeOf")(typeName.asInstanceOf[js.Any]).asInstanceOf[SimpleMatcher]
  
  /**
    * The actual number must be zero.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  @scala.inline
  def zero(): SimpleMatcher = js.Dynamic.global.applyDynamic("zero")().asInstanceOf[SimpleMatcher]
}
