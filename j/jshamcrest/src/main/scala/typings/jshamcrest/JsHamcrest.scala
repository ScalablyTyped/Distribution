package typings.jshamcrest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JsHamcrest {
  
  trait BetweenBuilder extends StObject {
    
    def and(end: js.Any): SimpleMatcher
  }
  object BetweenBuilder {
    
    @scala.inline
    def apply(and: js.Any => SimpleMatcher): BetweenBuilder = {
      val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and))
      __obj.asInstanceOf[BetweenBuilder]
    }
    
    @scala.inline
    implicit class BetweenBuilderMutableBuilder[Self <: BetweenBuilder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnd(value: js.Any => SimpleMatcher): Self = StObject.set(x, "and", js.Any.fromFunction1(value))
    }
  }
  
  trait CombinableMatcher
    extends StObject
       with SimpleMatcher {
    
    /**
      * Wraps this matcher and the given matcher using JsHamcrest.Matchers.allOf().
      *
      * @param matcherOrValue Instance of JsHamcrest.SimpleMatcher or a value
      * @return {CombinableMatcher} Instance of JsHamcrest.CombinableMatcher
      */
    def and(matcherOrValue: js.Any): CombinableMatcher
    
    /**
      * Wraps this matcher and the given matcher using JsHamcrest.Matchers.anyOf().
      *
      * @param matcherOrValue Instance of JsHamcrest.SimpleMatcher or a value
      * @return {CombinableMatcher} Instance of JsHamcrest.CombinableMatcher
      */
    def or(matcherOrValue: js.Any): CombinableMatcher
  }
  object CombinableMatcher {
    
    @scala.inline
    def apply(
      and: js.Any => CombinableMatcher,
      describeTo: /* description */ Description => Unit,
      describeValueTo: (/* value */ js.Any, /* description */ Description) => Unit,
      matches: /* value */ js.Any => Boolean,
      or: js.Any => CombinableMatcher
    ): CombinableMatcher = {
      val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), describeTo = js.Any.fromFunction1(describeTo), describeValueTo = js.Any.fromFunction2(describeValueTo), matches = js.Any.fromFunction1(matches), or = js.Any.fromFunction1(or))
      __obj.asInstanceOf[CombinableMatcher]
    }
    
    @scala.inline
    implicit class CombinableMatcherMutableBuilder[Self <: CombinableMatcher] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnd(value: js.Any => CombinableMatcher): Self = StObject.set(x, "and", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOr(value: js.Any => CombinableMatcher): Self = StObject.set(x, "or", js.Any.fromFunction1(value))
    }
  }
  
  //
  // Description
  //
  /**
    * Defines the method for describing the object to a description.
    */
  type DescribeTo = js.Function1[/* description */ Description, Unit]
  
  /**
    * Defines the method for describing a value to a description.
    */
  type DescribeValueTo = js.Function2[/* value */ js.Any, /* description */ Description, Unit]
  
  trait Description extends StObject {
    
    /**
      * Appends text to this description.
      *
      * @param text Text to append to this description
      * @return {Description} Itself for method chaining
      */
    def append(text: js.Any): Description
    
    /**
      * Appends the description of a self describing object to this description.
      *
      * @param selfDescribingObject Any object that has a describeTo() function that accepts a JsHamcrest.Description object as argument
      * @return {Description} Itself for method chaining
      */
    def appendDescriptionOf(selfDescribingObject: SelfDescribing): Description
    
    /**
      * Appends the description of several self describing objects to this description.
      *
      * @param start Start string
      * @param separator Separator string
      * @param end End string
      * @param list Array of self describing objects. These objects must have a describeTo() function that accepts a JsHamcrest.Description object as argument
      * @return {Description} Itself for method chaining
      */
    def appendList(start: String, separator: String, end: String, list: js.Array[js.Any]): Description
    
    /**
      * Appends a JavaScript language’s literal to this description.
      *
      * @param literal Literal to append to this description
      * @return {Description} Itself for method chaining
      */
    def appendLiteral(literal: js.Any): Description
    
    /**
      * Appends an array of values to this description.
      *
      * @param start Start string
      * @param separator Separator string
      * @param end End string
      * @param list Array of values to be described to this description
      * @return {Description} Itself for method chaining
      */
    def appendValueList(start: String, separator: String, end: String, list: js.Array[SelfDescribing]): Description
    
    /**
      * Gets the current content of this description.
      *
      * @return {string} Current content of this description
      */
    def get(): String
  }
  object Description {
    
    @scala.inline
    def apply(
      append: js.Any => Description,
      appendDescriptionOf: SelfDescribing => Description,
      appendList: (String, String, String, js.Array[js.Any]) => Description,
      appendLiteral: js.Any => Description,
      appendValueList: (String, String, String, js.Array[SelfDescribing]) => Description,
      get: () => String
    ): Description = {
      val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), appendDescriptionOf = js.Any.fromFunction1(appendDescriptionOf), appendList = js.Any.fromFunction4(appendList), appendLiteral = js.Any.fromFunction1(appendLiteral), appendValueList = js.Any.fromFunction4(appendValueList), get = js.Any.fromFunction0(get))
      __obj.asInstanceOf[Description]
    }
    
    @scala.inline
    implicit class DescriptionMutableBuilder[Self <: Description] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppend(value: js.Any => Description): Self = StObject.set(x, "append", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAppendDescriptionOf(value: SelfDescribing => Description): Self = StObject.set(x, "appendDescriptionOf", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAppendList(value: (String, String, String, js.Array[js.Any]) => Description): Self = StObject.set(x, "appendList", js.Any.fromFunction4(value))
      
      @scala.inline
      def setAppendLiteral(value: js.Any => Description): Self = StObject.set(x, "appendLiteral", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAppendValueList(value: (String, String, String, js.Array[SelfDescribing]) => Description): Self = StObject.set(x, "appendValueList", js.Any.fromFunction4(value))
      
      @scala.inline
      def setGet(value: () => String): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Provides methods for exposing matchers and operators for several testing frameworks.
    */
  object Integration
  
  trait Matcher
    extends StObject
       with SelfDescribing {
    
    def describeValueTo(value: js.Any, description: Description): Unit
    @JSName("describeValueTo")
    var describeValueTo_Original: DescribeValueTo
    
    def matches(value: js.Any): Boolean
    @JSName("matches")
    var matches_Original: Matches
  }
  object Matcher {
    
    @scala.inline
    def apply(
      describeTo: /* description */ Description => Unit,
      describeValueTo: (/* value */ js.Any, /* description */ Description) => Unit,
      matches: /* value */ js.Any => Boolean
    ): Matcher = {
      val __obj = js.Dynamic.literal(describeTo = js.Any.fromFunction1(describeTo), describeValueTo = js.Any.fromFunction2(describeValueTo), matches = js.Any.fromFunction1(matches))
      __obj.asInstanceOf[Matcher]
    }
    
    @scala.inline
    implicit class MatcherMutableBuilder[Self <: Matcher] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescribeValueTo(value: (/* value */ js.Any, /* description */ Description) => Unit): Self = StObject.set(x, "describeValueTo", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMatches(value: /* value */ js.Any => Boolean): Self = StObject.set(x, "matches", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Defines the configurable methods for declaring a new matcher using JsHamcrest.SimpleMatcher.
    */
  trait MatcherConfig extends StObject {
    
    def describeTo(description: Description): Unit
    @JSName("describeTo")
    var describeTo_Original: DescribeTo
    
    var describeValueTo: js.UndefOr[DescribeValueTo] = js.undefined
    
    def matches(value: js.Any): Boolean
    @JSName("matches")
    var matches_Original: Matches
  }
  object MatcherConfig {
    
    @scala.inline
    def apply(describeTo: /* description */ Description => Unit, matches: /* value */ js.Any => Boolean): MatcherConfig = {
      val __obj = js.Dynamic.literal(describeTo = js.Any.fromFunction1(describeTo), matches = js.Any.fromFunction1(matches))
      __obj.asInstanceOf[MatcherConfig]
    }
    
    @scala.inline
    implicit class MatcherConfigMutableBuilder[Self <: MatcherConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescribeTo(value: /* description */ Description => Unit): Self = StObject.set(x, "describeTo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDescribeValueTo(value: (/* value */ js.Any, /* description */ Description) => Unit): Self = StObject.set(x, "describeValueTo", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDescribeValueToUndefined: Self = StObject.set(x, "describeValueTo", js.undefined)
      
      @scala.inline
      def setMatches(value: /* value */ js.Any => Boolean): Self = StObject.set(x, "matches", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Defines all of the built-in matchers grouped into five categories.
    */
  object Matchers
  
  //
  // Matcher
  //
  /**
    * Defines the method for testing the matcher against an actual value.
    */
  type Matches = js.Function1[/* value */ js.Any, Boolean]
  
  /**
    * Provides the assertion, filtering, and currying methods.
    */
  object Operators {
    
    /**
      * Defines the options accepted by assert().
      */
    trait AssertOptions extends StObject {
      
      var fail: js.UndefOr[js.Function1[/* description */ String, Unit]] = js.undefined
      
      var message: js.UndefOr[js.Any] = js.undefined
      
      var pass: js.UndefOr[js.Function1[/* description */ String, Unit]] = js.undefined
    }
    object AssertOptions {
      
      @scala.inline
      def apply(): AssertOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AssertOptions]
      }
      
      @scala.inline
      implicit class AssertOptionsMutableBuilder[Self <: AssertOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFail(value: /* description */ String => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
        
        @scala.inline
        def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
        
        @scala.inline
        def setMessage(value: js.Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
        
        @scala.inline
        def setPass(value: /* description */ String => Unit): Self = StObject.set(x, "pass", js.Any.fromFunction1(value))
        
        @scala.inline
        def setPassUndefined: Self = StObject.set(x, "pass", js.undefined)
      }
    }
  }
  
  trait SelfDescribing extends StObject {
    
    def describeTo(description: Description): Unit
    @JSName("describeTo")
    var describeTo_Original: DescribeTo
  }
  object SelfDescribing {
    
    @scala.inline
    def apply(describeTo: /* description */ Description => Unit): SelfDescribing = {
      val __obj = js.Dynamic.literal(describeTo = js.Any.fromFunction1(describeTo))
      __obj.asInstanceOf[SelfDescribing]
    }
    
    @scala.inline
    implicit class SelfDescribingMutableBuilder[Self <: SelfDescribing] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescribeTo(value: /* description */ Description => Unit): Self = StObject.set(x, "describeTo", js.Any.fromFunction1(value))
    }
  }
  
  trait SimpleMatcher
    extends StObject
       with Matcher
  object SimpleMatcher {
    
    @scala.inline
    def apply(
      describeTo: /* description */ Description => Unit,
      describeValueTo: (/* value */ js.Any, /* description */ Description) => Unit,
      matches: /* value */ js.Any => Boolean
    ): SimpleMatcher = {
      val __obj = js.Dynamic.literal(describeTo = js.Any.fromFunction1(describeTo), describeValueTo = js.Any.fromFunction2(describeValueTo), matches = js.Any.fromFunction1(matches))
      __obj.asInstanceOf[SimpleMatcher]
    }
  }
}
