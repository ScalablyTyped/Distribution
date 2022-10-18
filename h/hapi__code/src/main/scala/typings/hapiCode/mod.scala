package typings.hapiCode

import org.scalablytyped.runtime.Instantiable1
import typings.hapiHoek.mod.deepEqual.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@hapi/code", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def count(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("count")().asInstanceOf[Double]
  
  inline def fail(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fail")().asInstanceOf[Unit]
  inline def fail(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fail")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def incomplete(): js.Array[String] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("incomplete")().asInstanceOf[js.Array[String] | Null]
  
  @JSImport("@hapi/code", "settings")
  @js.native
  val settings: Settings_ = js.native
  
  object thrownAt {
    
    inline def apply(): Location = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Location]
    inline def apply(error: js.Error): Location = ^.asInstanceOf[js.Dynamic].apply(error.asInstanceOf[js.Any]).asInstanceOf[Location]
    
    @JSImport("@hapi/code", "thrownAt")
    @js.native
    val ^ : js.Any = js.native
    
    trait Location extends StObject {
      
      var column: String
      
      var filename: String
      
      var line: String
    }
    object Location {
      
      inline def apply(column: String, filename: String, line: String): Location = {
        val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
        __obj.asInstanceOf[Location]
      }
      
      extension [Self <: Location](x: Self) {
        
        inline def setColumn(value: String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
        
        inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
        
        inline def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      }
    }
  }
  
  // Internal helpers
  type Class[T] = Instantiable1[/* args (repeated) */ Any, T]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends object ? @hapi/code.@hapi/code.RecursivePartial<T> & {[key: string] : any} : T
    }}}
    */
  @js.native
  trait Loosely[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends object ? {[ P in keyof T ]:? T[P] extends std.Array<infer I>? std.Array<@hapi/code.@hapi/code.RecursivePartial<I>> : @hapi/code.@hapi/code.RecursivePartial<T[P]>} : T
    }}}
    */
  @js.native
  trait RecursivePartial[T] extends StObject
  
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
    
    inline def apply(): Settings_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Settings_]
    }
    
    extension [Self <: Settings_](x: Self) {
      
      inline def setComparePrototypes(value: Boolean): Self = StObject.set(x, "comparePrototypes", value.asInstanceOf[js.Any])
      
      inline def setComparePrototypesUndefined: Self = StObject.set(x, "comparePrototypes", js.undefined)
      
      inline def setTruncateMessages(value: Boolean): Self = StObject.set(x, "truncateMessages", value.asInstanceOf[js.Any])
      
      inline def setTruncateMessagesUndefined: Self = StObject.set(x, "truncateMessages", js.undefined)
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends std.Array<infer U> ? U : T
    }}}
    */
  @js.native
  trait UnpackArray[T] extends StObject
  
  object expect {
    
    /** NOTE: Conditional type definitions are impossible to translate to Scala.
      * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
      * You'll have to cast your way around this structure, unfortunately. 
      * TS definition: {{{
      TTest extends std.Function ? @hapi/code.@hapi/code.expect.FunctionAssertion<T> : TTest extends string ? @hapi/code.@hapi/code.expect.StringAssertion<T> : TTest extends number | bigint ? @hapi/code.@hapi/code.expect.NumberAssertion<T> : TTest extends std.Promise<any> ? @hapi/code.@hapi/code.expect.PromiseAssertion<T> : @hapi/code.@hapi/code.expect.BaseAssertion<T, T>
      }}}
      */
    @js.native
    trait Assertion[T, TTest /* <: T */] extends StObject
    
    @js.native
    trait BaseAssertion[T, TTest /* <: T */] extends StObject {
      
      /**
        * Asserts that the reference value is `NaN`.
        *
        * @returns assertion chain object.
        */
      def NaN(): Assertion[T, T] = js.native
      
      // Grammar
      var a: this.type = js.native
      
      var an: this.type = js.native
      
      var and: this.type = js.native
      
      // Types
      /**
        * Asserts that the reference value is an arguments object.
        * 
        * @returns assertion chain object.
        */
      def arguments(): Assertion[T, T] = js.native
      
      /**
        * Asserts that the reference value is an Array.
        *
        * @returns assertion chain object.
        */
      def array(): Assertion[T, T] = js.native
      
      var at: this.type = js.native
      
      var be: this.type = js.native
      
      /**
        * Asserts that the reference value is a boolean.
        *
        * @returns assertion chain object.
        */
      def boolean(): Assertion[T, T] = js.native
      
      /**
        * Asserts that the reference value is a Buffer.
        *
        * @returns assertion chain object.
        */
      def buffer(): Assertion[T, T] = js.native
      
      def contain(values: String): Assertion[T, T] = js.native
      def contain(values: js.Array[String]): Assertion[T, T] = js.native
      /**
        * Asserts that the reference value (a string, array, or object) includes the provided values.
        *
        * @param values - the values to include.
        *
        * @returns assertion chain object.
        */
      def contain(values: UnpackArray[Loosely[T] | js.Array[Loosely[T]]]): Assertion[T, T] = js.native
      
      def contains(values: String): Assertion[T, T] = js.native
      def contains(values: js.Array[String]): Assertion[T, T] = js.native
      /**
        * Asserts that the reference value (a string, array, or object) includes the provided values.
        *
        * @param values - the values to include.
        *
        * @returns assertion chain object.
        */
      def contains(values: UnpackArray[Loosely[T] | js.Array[Loosely[T]]]): Assertion[T, T] = js.native
      
      /**
        * Asserts that the reference value is a Date
        *
        * @returns assertion chain object.
        */
      def date(): Assertion[T, T] = js.native
      
      /**
        * Asserts that the reference value has a length property equal to zero or is an object with no keys.
        *
        * @returns assertion chain object.
        */
      def empty(): Assertion[T, T] = js.native
      
      /**
        * Asserts that the reference value equals the provided value.
        * 
        * @param value - the value to match.
        * @param options - comparison options.
        *
        * @returns assertion chain object.
        */
      def equal(value: RecursivePartial[T]): Assertion[T, T] = js.native
      def equal(value: RecursivePartial[T], options: Options): Assertion[T, T] = js.native
      
      /**
        * Asserts that the reference value equals the provided value.
        *
        * @param value - the value to match.
        * @param options - comparison options.
        *
        * @returns assertion chain object.
        */
      def equals(value: RecursivePartial[T]): Assertion[T, T] = js.native
      def equals(value: RecursivePartial[T], options: Options): Assertion[T, T] = js.native
      
      def error(): Assertion[T, T] = js.native
      def error(message: String): Assertion[T, T] = js.native
      def error(message: js.RegExp): Assertion[T, T] = js.native
      /**
        * Asserts that the reference value is an error.
        * 
        * @param type - constructor function the error must be an instance of.
        * @param message - string or regular expression the error message must match.
        *
        * @returns assertion chain object.
        */
      def error(`type`: Class[Any]): Assertion[T, T] = js.native
      def error(`type`: Class[Any], message: String): Assertion[T, T] = js.native
      def error(`type`: Class[Any], message: js.RegExp): Assertion[T, T] = js.native
      
      /**
        * Asserts that the reference value exists (not null or undefined).
        *
        * @returns assertion chain object.
        */
      def exist(): Assertion[T, T] = js.native
      
      /**
        * Asserts that the reference value exists (not null or undefined).
        *
        * @returns assertion chain object.
        */
      def exists(): Assertion[T, T] = js.native
      
      /**
        * Asserts that the reference value is false.
        *
        * @returns assertion chain object.
        */
      def `false`(): Assertion[T, T] = js.native
      
      /**
        * Asserts that the reference value is a function.
        *
        * @returns assertion chain object.
        */
      def function(): Assertion[T, T] = js.native
      
      var have: this.type = js.native
      
      var in: this.type = js.native
      
      def include(values: String): Assertion[T, T] = js.native
      def include(values: js.Array[String]): Assertion[T, T] = js.native
      // Tests
      /**
        * Asserts that the reference value (a string, array, or object) includes the provided values.
        * 
        * @param values - the values to include.
        *
        * @returns assertion chain object.
        */
      def include(values: UnpackArray[Loosely[T] | js.Array[Loosely[T]]]): Assertion[T, T] = js.native
      
      def includes(values: String): Assertion[T, T] = js.native
      def includes(values: js.Array[String]): Assertion[T, T] = js.native
      /**
        * Asserts that the reference value (a string, array, or object) includes the provided values.
        *
        * @param values - the values to include.
        *
        * @returns assertion chain object.
        */
      def includes(values: UnpackArray[Loosely[T] | js.Array[Loosely[T]]]): Assertion[T, T] = js.native
      
      /**
        * Asserts that the reference value has the provided instanceof value.
        *
        * @param type - the constructor function to be an instance of.
        */
      def instanceOf(`type`: Class[Any]): Assertion[T, T] = js.native
      
      /**
        * Asserts that the reference value has the provided instanceof value.
        * 
        * @param type - the constructor function to be an instance of.
        */
      def instanceof(`type`: Class[Any]): Assertion[T, T] = js.native
      
      /**
        * Asserts that the reference value has a length property matching the provided size or an object with the specified number of keys.
        * 
        * @param size - the required length.
        *
        * @returns assertion chain object.
        */
      def length(
        size: /* import warning: importer.ImportType#apply Failed type conversion: T extends string | node.buffer.<global>.Buffer | object | std.Array<any> ? number : never */ js.Any
      ): Assertion[T, T] = js.native
      
      /**
        * Asserts that the reference value's toString() representation matches the provided regular expression.
        * 
        * @param regex - the pattern to match.
        *
        * @returns assertion chain object.
        */
      def `match`(regex: js.RegExp): Assertion[T, T] = js.native
      
      /**
        * Asserts that the reference value's toString() representation matches the provided regular expression.
        *
        * @param regex - the pattern to match.
        *
        * @returns assertion chain object.
        */
      def matches(regex: js.RegExp): Assertion[T, T] = js.native
      
      // Flags
      /**
        * Inverses the expected result of the assertion chain.
        */
      var not: /* import warning: importer.ImportType#apply Failed type conversion: TTest extends std.Function ? @hapi/code.@hapi/code.expect.Not_FunctionAssertion<T> : TTest extends std.Promise<any> ? @hapi/code.@hapi/code.expect.Not_PromiseAssertion<T> : this */ js.Any = js.native
      
      /**
        * Asserts that the reference value is null.
        *
        * @returns assertion chain object.
        */
      def `null`(): Assertion[T, T] = js.native
      
      /**
        * Asserts that the reference value is a number.
        *
        * @returns assertion chain object.
        */
      def number(): Assertion[T, T] = js.native
      
      /**
        * Asserts that the reference value is an object (excluding array, buffer, or other native objects).
        *
        * @returns assertion chain object.
        */
      def `object`(): Assertion[T, T] = js.native
      
      /**
        * Requires that inclusion matches appear only once in the provided value.
        */
      var once: this.type = js.native
      
      /**
        * Requires that only the provided elements appear in the provided value.
        */
      var only: this.type = js.native
      
      /**
        * Allows a partial match when asserting inclusion instead of a full comparison.
        */
      var part: this.type = js.native
      
      /**
        * Asserts that the reference value is a RegExp.
        *
        * @returns assertion chain object.
        */
      def regexp(): Assertion[T, T] = js.native
      
      /**
        * Asserts that the reference value satisfies the provided validator function.
        *
        * @param validator
        *
        * @returns assertion chain object.
        */
      def satisfies(validator: js.Function1[/* value */ T, Boolean]): Assertion[T, T] = js.native
      
      /**
        * Asserts that the reference value satisfies the provided validator function.
        * 
        * @param validator
        *
        * @returns assertion chain object.
        */
      def satisfy(validator: js.Function1[/* value */ T, Boolean]): Assertion[T, T] = js.native
      
      /**
        * Performs a comparison using strict equality (===) instead of a deep comparison.
        */
      var shallow: this.type = js.native
      
      /**
        * Asserts that the reference value is a string.
        *
        * @returns assertion chain object.
        */
      def string(): Assertion[T, T] = js.native
      
      var to: this.type = js.native
      
      // Values
      /**
        * Asserts that the reference value is true.
        *
        * @returns assertion chain object.
        */
      def `true`(): Assertion[T, T] = js.native
      
      /**
        * Asserts that the reference value is undefined.
        *
        * @returns assertion chain object.
        */
      def undefined(): Assertion[T, T] = js.native
    }
    
    @js.native
    trait FunctionAssertion[T]
      extends StObject
         with BaseAssertion[T, T] {
      
      def `throw`[E](): E = js.native
      def `throw`[E](message: String): E = js.native
      def `throw`[E](message: js.RegExp): E = js.native
      /**
        * Asserts that the function reference value throws an exception when called.
        * 
        * @param type - constructor function the error must be an instance of.
        * @param message - string or regular expression the error message must match.
        *
        * @returns thrown value.
        */
      def `throw`[E /* <: js.Object */](`type`: Class[E]): E = js.native
      def `throw`[E /* <: js.Object */](`type`: Class[E], message: String): E = js.native
      def `throw`[E /* <: js.Object */](`type`: Class[E], message: js.RegExp): E = js.native
      
      def throws[E](): E = js.native
      def throws[E](message: String): E = js.native
      def throws[E](message: js.RegExp): E = js.native
      /**
        * Asserts that the function reference value throws an exception when called.
        *
        * @param type - constructor function the error must be an instance of.
        * @param message - string or regular expression the error message must match.
        *
        * @returns thrown value.
        */
      def throws[E /* <: js.Object */](`type`: Class[E]): E = js.native
      def throws[E /* <: js.Object */](`type`: Class[E], message: String): E = js.native
      def throws[E /* <: js.Object */](`type`: Class[E], message: js.RegExp): E = js.native
    }
    
    @js.native
    trait NotFunctionAssertion[T]
      extends StObject
         with BaseAssertion[T, T] {
      
      /**
        * Asserts that the function reference value throws an exception when called.
        *
        * @returns assertion chain object.
        */
      def `throw`(): Assertion[T, T] = js.native
      
      /**
        * Asserts that the function reference value throws an exception when called.
        *
        * @returns assertion chain object.
        */
      def throws(): Assertion[T, T] = js.native
    }
    
    @js.native
    trait NotPromiseAssertion[T]
      extends StObject
         with BaseAssertion[T, T] {
      
      /**
        * Asserts that the Promise reference value rejects with an exception when called.
        *
        * @returns a promise resolving to null.
        */
      def reject(): js.Promise[Null] = js.native
      
      /**
        * Asserts that the Promise reference value rejects with an exception when called.
        *
        * @returns a promise resolving to null.
        */
      def rejects(): js.Promise[Null] = js.native
    }
    
    @js.native
    trait NumberAssertion[T]
      extends StObject
         with BaseAssertion[T, T] {
      
      /**
        * Asserts that the reference value is about the provided value within a delta margin of difference.
        * 
        * @param value - the value to be near.
        * @param delta - the max distance to be from the value.
        *
        * @returns assertion chain object.
        */
      def about(
        value: /* import warning: importer.ImportType#apply Failed type conversion: T extends number ? T : never */ js.Any,
        delta: /* import warning: importer.ImportType#apply Failed type conversion: T extends number ? T : never */ js.Any
      ): Assertion[T, T] = js.native
      
      /**
        * Asserts that the reference value is greater than (>) the provided value.
        * 
        * @param value - the value to compare to.
        *
        * @returns assertion chain object.
        */
      def above(value: T): Assertion[T, T] = js.native
      
      /**
        * Asserts that the reference value is less than (<) the provided value.
        * 
        * @param value - the value to compare to.
        *
        * @returns assertion chain object.
        */
      def below(value: T): Assertion[T, T] = js.native
      
      /**
        * Asserts that the reference value is between but not equal (from < value < to) the provided values.
        * 
        * @param from - the value to be above.
        * @param to - the value to be below.
        *
        * @returns assertion chain object.
        */
      def between(from: T, to: T): Assertion[T, T] = js.native
      
      /**
        * Asserts that the reference value is greater than (>) the provided value.
        *
        * @param value - the value to compare to.
        *
        * @returns assertion chain object.
        */
      def greaterThan(value: T): Assertion[T, T] = js.native
      
      /**
        * Asserts that the reference value is at least (>=) the provided value.
        * 
        * @param value - the value to compare to.
        *
        * @returns assertion chain object.
        */
      def least(value: T): Assertion[T, T] = js.native
      
      /**
        * Asserts that the reference value is less than (<) the provided value.
        *
        * @param value - the value to compare to.
        *
        * @returns assertion chain object.
        */
      def lessThan(value: T): Assertion[T, T] = js.native
      
      /**
        * Asserts that the reference value is at most (<=) the provided value.
        *
        * @param value - the value to compare to.
        *
        * @returns assertion chain object.
        */
      def max(value: T): Assertion[T, T] = js.native
      
      /**
        * Asserts that the reference value is at least (>=) the provided value.
        *
        * @param value - the value to compare to.
        *
        * @returns assertion chain object.
        */
      def min(value: T): Assertion[T, T] = js.native
      
      /**
        * Asserts that the reference value is at most (<=) the provided value.
        * 
        * @param value - the value to compare to.
        *
        * @returns assertion chain object.
        */
      def most(value: T): Assertion[T, T] = js.native
      
      /**
        * Asserts that the reference value is within (from <= value <= to) the provided values.
        *
        * @param from - the value to be equal to or above.
        * @param to - the value to be equal to or below.
        *
        * @returns assertion chain object.
        */
      def range(from: T, to: T): Assertion[T, T] = js.native
      
      /**
        * Asserts that the reference value is within (from <= value <= to) the provided values.
        * 
        * @param from - the value to be equal to or above.
        * @param to - the value to be equal to or below.
        *
        * @returns assertion chain object.
        */
      def within(from: T, to: T): Assertion[T, T] = js.native
    }
    
    @js.native
    trait PromiseAssertion[T]
      extends StObject
         with BaseAssertion[T, T] {
      
      def reject[E](): js.Promise[E] = js.native
      def reject[E](message: String): js.Promise[E] = js.native
      def reject[E](message: js.RegExp): js.Promise[E] = js.native
      /**
        * Asserts that the Promise reference value rejects with an exception when called.
        * 
        * @param type - constructor function the error must be an instance of.
        * @param message - string or regular expression the error message must match.
        *
        * @returns a promise resolving to the rejected value.
        */
      def reject[E /* <: js.Object */](`type`: Class[E]): js.Promise[E] = js.native
      def reject[E /* <: js.Object */](`type`: Class[E], message: String): js.Promise[E] = js.native
      def reject[E /* <: js.Object */](`type`: Class[E], message: js.RegExp): js.Promise[E] = js.native
      
      def rejects[E](): js.Promise[E] = js.native
      def rejects[E](message: String): js.Promise[E] = js.native
      def rejects[E](message: js.RegExp): js.Promise[E] = js.native
      /**
        * Asserts that the Promise reference value rejects with an exception when called.
        *
        * @param type - constructor function the error must be an instance of.
        * @param message - string or regular expression the error message must match.
        *
        * @returns a promise resolving to the rejected value.
        */
      def rejects[E /* <: js.Object */](`type`: Class[E]): js.Promise[E] = js.native
      def rejects[E /* <: js.Object */](`type`: Class[E], message: String): js.Promise[E] = js.native
      def rejects[E /* <: js.Object */](`type`: Class[E], message: js.RegExp): js.Promise[E] = js.native
    }
    
    @js.native
    trait StringAssertion[T]
      extends StObject
         with BaseAssertion[T, T] {
      
      /**
        * Asserts that the reference value (a string) ends with the provided value.
        *
        * @param value - the value to end with.
        *
        * @returns assertion chain object.
        */
      def endWith(value: String): Assertion[T, T] = js.native
      
      /**
        * Asserts that the reference value (a string) ends with the provided value.
        *
        * @param value - the value to end with.
        *
        * @returns assertion chain object.
        */
      def endsWith(value: String): Assertion[T, T] = js.native
      
      /**
        * Asserts that the reference value (a string) starts with the provided value.
        * 
        * @param value - the value to start with.
        *
        * @returns assertion chain object.
        */
      def startWith(value: String): Assertion[T, T] = js.native
      
      /**
        * Asserts that the reference value (a string) starts with the provided value.
        *
        * @param value - the value to start with.
        *
        * @returns assertion chain object.
        */
      def startsWith(value: String): Assertion[T, T] = js.native
    }
  }
}
