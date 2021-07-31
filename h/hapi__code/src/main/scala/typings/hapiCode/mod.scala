package typings.hapiCode

import typings.hapiHoek.mod.deepEqual.Options
import typings.std.Error
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@hapi/code", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def count(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("count")().asInstanceOf[Double]
  
  object expect {
    
    @scala.inline
    def apply[T](value: T): Assertion[T] = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[Assertion[T]]
    @scala.inline
    def apply[T](value: T, prefix: String): Assertion[T] = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[Assertion[T]]
    @scala.inline
    def apply[T](value: js.Array[T]): Assertion[T] = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[Assertion[T]]
    @scala.inline
    def apply[T](value: js.Array[T], prefix: String): Assertion[T] = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[Assertion[T]]
    
    @JSImport("@hapi/code", "expect")
    @js.native
    val ^ : js.Any = js.native
    
    @js.native
    trait Assertion[T] extends StObject {
      
      // Grammar
      var a: Assertion[T] = js.native
      
      /**
        * Asserts that the reference value is about the provided value within a delta margin of difference.
        * 
        * @param value - the value to be near.
        * @param delta - the max distance to be from the value.
        *
        * @returns assertion chain object.
        */
      def about(value: Double, delta: Double): Assertion[T] = js.native
      
      /**
        * Asserts that the reference value is greater than (>) the provided value.
        * 
        * @param value - the value to compare to.
        *
        * @returns assertion chain object.
        */
      def above(value: T): Assertion[T] = js.native
      
      var an: Assertion[T] = js.native
      
      var and: Assertion[T] = js.native
      
      // Types
      /**
        * Asserts that the reference value is an arguments object.
        * 
        * @returns assertion chain object.
        */
      def arguments(): Assertion[T] = js.native
      
      /**
        * Asserts that the reference value is an Array.
        *
        * @returns assertion chain object.
        */
      def array(): Assertion[T] = js.native
      
      var at: Assertion[T] = js.native
      
      var be: Assertion[T] = js.native
      
      /**
        * Asserts that the reference value is less than (<) the provided value.
        * 
        * @param value - the value to compare to.
        *
        * @returns assertion chain object.
        */
      def below(value: T): Assertion[T] = js.native
      
      /**
        * Asserts that the reference value is between but not equal (from < value < to) the provided values.
        * 
        * @param from - the value to be above.
        * @param to - the value to be below.
        *
        * @returns assertion chain object.
        */
      def between(from: T, to: T): Assertion[T] = js.native
      
      /**
        * Asserts that the reference value is a boolean.
        *
        * @returns assertion chain object.
        */
      def boolean(): Assertion[T] = js.native
      
      /**
        * Asserts that the reference value is a Buffer.
        *
        * @returns assertion chain object.
        */
      def buffer(): Assertion[T] = js.native
      
      def contain(values: T): Assertion[T] = js.native
      /**
        * Asserts that the reference value (a string, array, or object) includes the provided values.
        *
        * @param values - the values to include.
        *
        * @returns assertion chain object.
        */
      def contain(values: String): Assertion[T] = js.native
      def contain(values: js.Array[String | T]): Assertion[T] = js.native
      
      def contains(values: T): Assertion[T] = js.native
      /**
        * Asserts that the reference value (a string, array, or object) includes the provided values.
        *
        * @param values - the values to include.
        *
        * @returns assertion chain object.
        */
      def contains(values: String): Assertion[T] = js.native
      def contains(values: js.Array[String | T]): Assertion[T] = js.native
      
      /**
        * Asserts that the reference value is a Date
        *
        * @returns assertion chain object.
        */
      def date(): Assertion[T] = js.native
      
      /**
        * Asserts that the reference value has a length property equal to zero or is an object with no keys.
        *
        * @returns assertion chain object.
        */
      def empty(): Assertion[T] = js.native
      
      /**
        * Asserts that the reference value (a string) ends with the provided value.
        *
        * @param value - the value to end with.
        *
        * @returns assertion chain object.
        */
      def endWith(value: String): Assertion[T] = js.native
      
      /**
        * Asserts that the reference value (a string) ends with the provided value.
        *
        * @param value - the value to end with.
        *
        * @returns assertion chain object.
        */
      def endsWith(value: String): Assertion[T] = js.native
      
      /**
        * Asserts that the reference value equals the provided value.
        * 
        * @param value - the value to match.
        * @param options - comparison options.
        *
        * @returns assertion chain object.
        */
      def equal(value: T): Assertion[T] = js.native
      def equal(value: T, options: Options): Assertion[T] = js.native
      def equal(value: js.Array[T]): Assertion[T] = js.native
      def equal(value: js.Array[T], options: Options): Assertion[T] = js.native
      
      def equals(value: T, options: Options): Assertion[T] = js.native
      def equals(value: js.Array[T]): Assertion[T] = js.native
      def equals(value: js.Array[T], options: Options): Assertion[T] = js.native
      
      def error(): Assertion[T] = js.native
      def error(message: String): Assertion[T] = js.native
      def error(message: RegExp): Assertion[T] = js.native
      /**
        * Asserts that the reference value is an error.
        * 
        * @param type - constructor function the error must be an instance of.
        * @param message - string or regular expression the error message must match.
        *
        * @returns assertion chain object.
        */
      def error(`type`: js.Function): Assertion[T] = js.native
      def error(`type`: js.Function, message: String): Assertion[T] = js.native
      def error(`type`: js.Function, message: RegExp): Assertion[T] = js.native
      
      /**
        * Asserts that the reference value exists (not null or undefined).
        *
        * @returns assertion chain object.
        */
      def exist(): Assertion[T] = js.native
      
      /**
        * Asserts that the reference value exists (not null or undefined).
        *
        * @returns assertion chain object.
        */
      def exists(): Assertion[T] = js.native
      
      /**
        * Asserts that the reference value is false.
        *
        * @returns assertion chain object.
        */
      def `false`(): Assertion[T] = js.native
      
      /**
        * Asserts that the reference value is a function.
        *
        * @returns assertion chain object.
        */
      def function(): Assertion[T] = js.native
      
      /**
        * Asserts that the reference value is greater than (>) the provided value.
        *
        * @param value - the value to compare to.
        *
        * @returns assertion chain object.
        */
      def greaterThan(value: T): Assertion[T] = js.native
      
      var have: Assertion[T] = js.native
      
      var in: Assertion[T] = js.native
      
      def include(values: T): Assertion[T] = js.native
      // Tests
      /**
        * Asserts that the reference value (a string, array, or object) includes the provided values.
        * 
        * @param values - the values to include.
        *
        * @returns assertion chain object.
        */
      def include(values: String): Assertion[T] = js.native
      def include(values: js.Array[String | T]): Assertion[T] = js.native
      
      def includes(values: T): Assertion[T] = js.native
      /**
        * Asserts that the reference value (a string, array, or object) includes the provided values.
        *
        * @param values - the values to include.
        *
        * @returns assertion chain object.
        */
      def includes(values: String): Assertion[T] = js.native
      def includes(values: js.Array[String | T]): Assertion[T] = js.native
      
      /**
        * Asserts that the reference value has the provided instanceof value.
        *
        * @param type - the constructor function to be an instance of.
        */
      def instanceOf(`type`: js.Function): Assertion[T] = js.native
      
      /**
        * Asserts that the reference value has the provided instanceof value.
        * 
        * @param type - the constructor function to be an instance of.
        */
      def instanceof(`type`: js.Function): Assertion[T] = js.native
      
      /**
        * Asserts that the reference value is at least (>=) the provided value.
        * 
        * @param value - the value to compare to.
        *
        * @returns assertion chain object.
        */
      def least(value: T): Assertion[T] = js.native
      
      /**
        * Asserts that the reference value has a length property matching the provided size or an object with the specified number of keys.
        * 
        * @param size - the required length.
        *
        * @returns assertion chain object.
        */
      def length(size: Double): Assertion[T] = js.native
      
      /**
        * Asserts that the reference value is less than (<) the provided value.
        *
        * @param value - the value to compare to.
        *
        * @returns assertion chain object.
        */
      def lessThan(value: T): Assertion[T] = js.native
      
      /**
        * Asserts that the reference value's toString() representation matches the provided regular expression.
        * 
        * @param regex - the pattern to match.
        *
        * @returns assertion chain object.
        */
      def `match`(regex: RegExp): Assertion[T] = js.native
      
      /**
        * Asserts that the reference value's toString() representation matches the provided regular expression.
        *
        * @param regex - the pattern to match.
        *
        * @returns assertion chain object.
        */
      def matches(regex: RegExp): Assertion[T] = js.native
      
      /**
        * Asserts that the reference value is at most (<=) the provided value.
        *
        * @param value - the value to compare to.
        *
        * @returns assertion chain object.
        */
      def max(value: T): Assertion[T] = js.native
      
      /**
        * Asserts that the reference value is at least (>=) the provided value.
        *
        * @param value - the value to compare to.
        *
        * @returns assertion chain object.
        */
      def min(value: T): Assertion[T] = js.native
      
      /**
        * Asserts that the reference value is at most (<=) the provided value.
        * 
        * @param value - the value to compare to.
        *
        * @returns assertion chain object.
        */
      def most(value: T): Assertion[T] = js.native
      
      // Flags
      /**
        * Inverses the expected result of the assertion chain.
        */
      var not: Assertion[T] = js.native
      
      /**
        * Asserts that the reference value is null.
        *
        * @returns assertion chain object.
        */
      def `null`(): Assertion[T] = js.native
      
      /**
        * Asserts that the reference value is a number.
        *
        * @returns assertion chain object.
        */
      def number(): Assertion[T] = js.native
      
      /**
        * Asserts that the reference value is an object (excluding array, buffer, or other native objects).
        *
        * @returns assertion chain object.
        */
      def `object`(): Assertion[T] = js.native
      
      /**
        * Requires that inclusion matches appear only once in the provided value.
        */
      var once: Assertion[T] = js.native
      
      /**
        * Requires that only the provided elements appear in the provided value.
        */
      var only: Assertion[T] = js.native
      
      /**
        * Allows a partial match when asserting inclusion instead of a full comparison.
        */
      var part: Assertion[T] = js.native
      
      /**
        * Asserts that the reference value is within (from <= value <= to) the provided values.
        *
        * @param from - the value to be equal to or above.
        * @param to - the value to be equal to or below.
        *
        * @returns assertion chain object.
        */
      def range(from: T, to: T): Assertion[T] = js.native
      
      /**
        * Asserts that the reference value is a RegExp.
        *
        * @returns assertion chain object.
        */
      def regexp(): Assertion[T] = js.native
      
      def reject(): Assertion[T] = js.native
      def reject(message: String): Assertion[T] = js.native
      def reject(message: RegExp): Assertion[T] = js.native
      /**
        * Asserts that the Promise reference value rejects with an exception when called.
        * 
        * @param type - constructor function the error must be an instance of.
        * @param message - string or regular expression the error message must match.
        *
        * @returns assertion chain object.
        */
      def reject(`type`: js.Function): Assertion[T] = js.native
      def reject(`type`: js.Function, message: String): Assertion[T] = js.native
      def reject(`type`: js.Function, message: RegExp): Assertion[T] = js.native
      
      def rejects(): Assertion[T] = js.native
      def rejects(message: String): Assertion[T] = js.native
      def rejects(message: RegExp): Assertion[T] = js.native
      /**
        * Asserts that the Promise reference value rejects with an exception when called.
        *
        * @param type - constructor function the error must be an instance of.
        * @param message - string or regular expression the error message must match.
        *
        * @returns assertion chain object.
        */
      def rejects(`type`: js.Function): Assertion[T] = js.native
      def rejects(`type`: js.Function, message: String): Assertion[T] = js.native
      def rejects(`type`: js.Function, message: RegExp): Assertion[T] = js.native
      
      /**
        * Asserts that the reference value satisfies the provided validator function.
        *
        * @param validator
        *
        * @returns assertion chain object.
        */
      def satisfies(validator: js.Function1[/* value */ T, Boolean]): Assertion[T] = js.native
      
      /**
        * Asserts that the reference value satisfies the provided validator function.
        * 
        * @param validator
        *
        * @returns assertion chain object.
        */
      def satisfy(validator: js.Function1[/* value */ T, Boolean]): Assertion[T] = js.native
      
      /**
        * Performs a comparison using strict equality (===) instead of a deep comparison.
        */
      var shallow: Assertion[T] = js.native
      
      /**
        * Asserts that the reference value (a string) starts with the provided value.
        * 
        * @param value - the value to start with.
        *
        * @returns assertion chain object.
        */
      def startWith(value: String): Assertion[T] = js.native
      
      /**
        * Asserts that the reference value (a string) starts with the provided value.
        *
        * @param value - the value to start with.
        *
        * @returns assertion chain object.
        */
      def startsWith(value: String): Assertion[T] = js.native
      
      /**
        * Asserts that the reference value is a string.
        *
        * @returns assertion chain object.
        */
      def string(): Assertion[T] = js.native
      
      def `throw`(): Assertion[T] = js.native
      def `throw`(message: String): Assertion[T] = js.native
      def `throw`(message: RegExp): Assertion[T] = js.native
      /**
        * Asserts that the function reference value throws an exception when called.
        * 
        * @param type - constructor function the error must be an instance of.
        * @param message - string or regular expression the error message must match.
        *
        * @returns assertion chain object.
        */
      def `throw`(`type`: js.Function): Assertion[T] = js.native
      def `throw`(`type`: js.Function, message: String): Assertion[T] = js.native
      def `throw`(`type`: js.Function, message: RegExp): Assertion[T] = js.native
      
      def throws(): Assertion[T] = js.native
      def throws(message: String): Assertion[T] = js.native
      def throws(message: RegExp): Assertion[T] = js.native
      /**
        * Asserts that the function reference value throws an exception when called.
        *
        * @param type - constructor function the error must be an instance of.
        * @param message - string or regular expression the error message must match.
        *
        * @returns assertion chain object.
        */
      def throws(`type`: js.Function): Assertion[T] = js.native
      def throws(`type`: js.Function, message: String): Assertion[T] = js.native
      def throws(`type`: js.Function, message: RegExp): Assertion[T] = js.native
      
      var to: Assertion[T] = js.native
      
      // Values
      /**
        * Asserts that the reference value is true.
        *
        * @returns assertion chain object.
        */
      def `true`(): Assertion[T] = js.native
      
      /**
        * Asserts that the reference value is undefined.
        *
        * @returns assertion chain object.
        */
      def undefined(): Assertion[T] = js.native
      
      /**
        * Asserts that the reference value is within (from <= value <= to) the provided values.
        * 
        * @param from - the value to be equal to or above.
        * @param to - the value to be equal to or below.
        *
        * @returns assertion chain object.
        */
      def within(from: T, to: T): Assertion[T] = js.native
    }
  }
  
  @scala.inline
  def fail(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fail")().asInstanceOf[Unit]
  @scala.inline
  def fail(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fail")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def incomplete(): js.Array[String] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("incomplete")().asInstanceOf[js.Array[String] | Null]
  
  @JSImport("@hapi/code", "settings")
  @js.native
  val settings: Settings_ = js.native
  
  object thrownAt {
    
    @scala.inline
    def apply(): Location = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Location]
    @scala.inline
    def apply(error: Error): Location = ^.asInstanceOf[js.Dynamic].apply(error.asInstanceOf[js.Any]).asInstanceOf[Location]
    
    @JSImport("@hapi/code", "thrownAt")
    @js.native
    val ^ : js.Any = js.native
    
    trait Location extends StObject {
      
      var column: String
      
      var filename: String
      
      var line: String
    }
    object Location {
      
      @scala.inline
      def apply(column: String, filename: String, line: String): Location = {
        val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
        __obj.asInstanceOf[Location]
      }
      
      @scala.inline
      implicit class LocationMutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setColumn(value: String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      }
    }
  }
  
  trait Settings_ extends StObject {
    
    /**
      * Ignore object prototypes when doing a deep comparison.
      * 
      * @defaults false
      */
    var comparePrototypes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Truncate long assertion error messages for readability.
      * 
      * @default false
      */
    var truncateMessages: js.UndefOr[Boolean] = js.undefined
  }
  object Settings_ {
    
    @scala.inline
    def apply(): Settings_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Settings_]
    }
    
    @scala.inline
    implicit class Settings_MutableBuilder[Self <: Settings_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComparePrototypes(value: Boolean): Self = StObject.set(x, "comparePrototypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComparePrototypesUndefined: Self = StObject.set(x, "comparePrototypes", js.undefined)
      
      @scala.inline
      def setTruncateMessages(value: Boolean): Self = StObject.set(x, "truncateMessages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTruncateMessagesUndefined: Self = StObject.set(x, "truncateMessages", js.undefined)
    }
  }
}
