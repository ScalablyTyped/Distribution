package typings.jshamcrest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JsHamcrest {
  
  @js.native
  trait BetweenBuilder extends StObject {
    
    def and(end: js.Any): SimpleMatcher = js.native
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
  
  @js.native
  trait CombinableMatcher extends SimpleMatcher {
    
    /**
      * Wraps this matcher and the given matcher using JsHamcrest.Matchers.allOf().
      *
      * @param matcherOrValue Instance of JsHamcrest.SimpleMatcher or a value
      * @return {CombinableMatcher} Instance of JsHamcrest.CombinableMatcher
      */
    def and(matcherOrValue: js.Any): CombinableMatcher = js.native
    
    /**
      * Wraps this matcher and the given matcher using JsHamcrest.Matchers.anyOf().
      *
      * @param matcherOrValue Instance of JsHamcrest.SimpleMatcher or a value
      * @return {CombinableMatcher} Instance of JsHamcrest.CombinableMatcher
      */
    def or(matcherOrValue: js.Any): CombinableMatcher = js.native
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
  
  @js.native
  trait Description extends StObject {
    
    /**
      * Appends text to this description.
      *
      * @param text Text to append to this description
      * @return {Description} Itself for method chaining
      */
    def append(text: js.Any): Description = js.native
    
    /**
      * Appends the description of a self describing object to this description.
      *
      * @param selfDescribingObject Any object that has a describeTo() function that accepts a JsHamcrest.Description object as argument
      * @return {Description} Itself for method chaining
      */
    def appendDescriptionOf(selfDescribingObject: SelfDescribing): Description = js.native
    
    /**
      * Appends the description of several self describing objects to this description.
      *
      * @param start Start string
      * @param separator Separator string
      * @param end End string
      * @param list Array of self describing objects. These objects must have a describeTo() function that accepts a JsHamcrest.Description object as argument
      * @return {Description} Itself for method chaining
      */
    def appendList(start: String, separator: String, end: String, list: js.Array[_]): Description = js.native
    
    /**
      * Appends a JavaScript language’s literal to this description.
      *
      * @param literal Literal to append to this description
      * @return {Description} Itself for method chaining
      */
    def appendLiteral(literal: js.Any): Description = js.native
    
    /**
      * Appends an array of values to this description.
      *
      * @param start Start string
      * @param separator Separator string
      * @param end End string
      * @param list Array of values to be described to this description
      * @return {Description} Itself for method chaining
      */
    def appendValueList(start: String, separator: String, end: String, list: js.Array[SelfDescribing]): Description = js.native
    
    /**
      * Gets the current content of this description.
      *
      * @return {string} Current content of this description
      */
    def get(): String = js.native
  }
  object Description {
    
    @scala.inline
    def apply(
      append: js.Any => Description,
      appendDescriptionOf: SelfDescribing => Description,
      appendList: (String, String, String, js.Array[_]) => Description,
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
      def setAppendList(value: (String, String, String, js.Array[_]) => Description): Self = StObject.set(x, "appendList", js.Any.fromFunction4(value))
      
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
  
  @js.native
  trait Matcher extends SelfDescribing {
    
    def describeValueTo(value: js.Any, description: Description): Unit = js.native
    @JSName("describeValueTo")
    var describeValueTo_Original: DescribeValueTo = js.native
    
    def matches(value: js.Any): Boolean = js.native
    @JSName("matches")
    var matches_Original: Matches = js.native
  }
  
  /**
    * Defines the configurable methods for declaring a new matcher using JsHamcrest.SimpleMatcher.
    */
  @js.native
  trait MatcherConfig extends StObject {
    
    def describeTo(description: Description): Unit = js.native
    @JSName("describeTo")
    var describeTo_Original: DescribeTo = js.native
    
    var describeValueTo: js.UndefOr[DescribeValueTo] = js.native
    
    def matches(value: js.Any): Boolean = js.native
    @JSName("matches")
    var matches_Original: Matches = js.native
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
    @js.native
    trait AssertOptions extends StObject {
      
      var fail: js.UndefOr[js.Function1[/* description */ String, Unit]] = js.native
      
      var message: js.UndefOr[js.Any] = js.native
      
      var pass: js.UndefOr[js.Function1[/* description */ String, Unit]] = js.native
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
  
  @js.native
  trait SelfDescribing extends StObject {
    
    def describeTo(description: Description): Unit = js.native
    @JSName("describeTo")
    var describeTo_Original: DescribeTo = js.native
  }
  
  @js.native
  trait SimpleMatcher extends Matcher
}
