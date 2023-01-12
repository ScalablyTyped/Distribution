package typings.jasminewd2

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.jasmine.jasmine.ArrayLike
import typings.jasmine.jasmine.CustomEqualityTester
import typings.jasmine.jasmine.Expected
import typings.jasmine.jasmine.MatchersUtil
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jasmine {
  
  @js.native
  trait ArrayLikeMatchers[T]
    extends StObject
       with Matchers[ArrayLike[T]] {
    
    var not: ArrayLikeMatchers[T] = js.native
    
    def toBe(expected: Expected[ArrayLike[T]]): js.Promise[Unit] = js.native
    def toBe(expected: Expected[ArrayLike[T]], expectationFailOutput: Any): js.Promise[Unit] = js.native
    
    def toEqual(expected: Expected[ArrayLike[T]]): js.Promise[Unit] = js.native
    def toEqual(expected: Expected[ArrayLike[T]], expectationFailOutput: Any): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait AsyncCustomMatcher extends StObject {
    
    def compare(actual: Any, expected: Any): AsyncCustomMatcherResult = js.native
    @JSName("compare")
    def compare_T[T](actual: T, expected: T): AsyncCustomMatcherResult = js.native
  }
  
  type AsyncCustomMatcherFactories = StringDictionary[AsyncCustomMatcherFactory]
  
  type AsyncCustomMatcherFactory = js.Function2[
    /* util */ MatchersUtil, 
    /* customEqualityTesters */ js.Array[CustomEqualityTester], 
    AsyncCustomMatcher
  ]
  
  trait AsyncCustomMatcherResult extends StObject {
    
    var message: js.UndefOr[String] = js.undefined
    
    var pass: Boolean | js.Promise[Boolean]
  }
  object AsyncCustomMatcherResult {
    
    inline def apply(pass: Boolean | js.Promise[Boolean]): AsyncCustomMatcherResult = {
      val __obj = js.Dynamic.literal(pass = pass.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsyncCustomMatcherResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AsyncCustomMatcherResult] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setPass(value: Boolean | js.Promise[Boolean]): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
    }
  }
  
  // Add definition to be compatible with latest jasmine v3 types.
  // Even though library is not compatible with jasmine v3, there is no suitable way to configure that now here.
  // See for more detail: https://github.com/microsoft/dtslint/issues/253
  @js.native
  trait FunctionMatchers[Fn /* <: js.Function1[/* repeated */ Any, Any] */]
    extends StObject
       with Matchers[Any] {
    
    @JSName("toHaveBeenCalledWith")
    def toHaveBeenCalledWith_Promise(params: Any*): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait Matchers[T] extends StObject {
    
    def toBe(expected: Any): js.Promise[Unit] = js.native
    def toBe(expected: Any, expectationFailOutput: Any): js.Promise[Unit] = js.native
    
    def toBeCloseTo(expected: js.Promise[Double]): js.Promise[Unit] = js.native
    def toBeCloseTo(expected: js.Promise[Double], precision: Any): js.Promise[Unit] = js.native
    def toBeCloseTo(expected: js.Promise[Double], precision: Any, expectationFailOutput: Any): js.Promise[Unit] = js.native
    def toBeCloseTo(expected: js.Promise[Double], precision: Unit, expectationFailOutput: Any): js.Promise[Unit] = js.native
    def toBeCloseTo(expected: Double): js.Promise[Unit] = js.native
    def toBeCloseTo(expected: Double, precision: Any): js.Promise[Unit] = js.native
    def toBeCloseTo(expected: Double, precision: Any, expectationFailOutput: Any): js.Promise[Unit] = js.native
    def toBeCloseTo(expected: Double, precision: Unit, expectationFailOutput: Any): js.Promise[Unit] = js.native
    
    def toBeDefined(): js.Promise[Unit] = js.native
    def toBeDefined(expectationFailOutput: Any): js.Promise[Unit] = js.native
    
    def toBeFalsy(): js.Promise[Unit] = js.native
    def toBeFalsy(expectationFailOutput: Any): js.Promise[Unit] = js.native
    
    def toBeGreaterThan(expected: js.Promise[Double]): js.Promise[Unit] = js.native
    def toBeGreaterThan(expected: js.Promise[Double], expectationFailOutput: Any): js.Promise[Unit] = js.native
    def toBeGreaterThan(expected: Double): js.Promise[Unit] = js.native
    def toBeGreaterThan(expected: Double, expectationFailOutput: Any): js.Promise[Unit] = js.native
    
    def toBeGreaterThanOrEqual(expected: js.Promise[Double]): js.Promise[Unit] = js.native
    def toBeGreaterThanOrEqual(expected: js.Promise[Double], expectationFailOutput: Any): js.Promise[Unit] = js.native
    def toBeGreaterThanOrEqual(expected: Double): js.Promise[Unit] = js.native
    def toBeGreaterThanOrEqual(expected: Double, expectationFailOutput: Any): js.Promise[Unit] = js.native
    
    def toBeLessThan(expected: js.Promise[Double]): js.Promise[Unit] = js.native
    def toBeLessThan(expected: js.Promise[Double], expectationFailOutput: Any): js.Promise[Unit] = js.native
    def toBeLessThan(expected: Double): js.Promise[Unit] = js.native
    def toBeLessThan(expected: Double, expectationFailOutput: Any): js.Promise[Unit] = js.native
    
    def toBeLessThanOrEqual(expected: js.Promise[Double]): js.Promise[Unit] = js.native
    def toBeLessThanOrEqual(expected: js.Promise[Double], expectationFailOutput: Any): js.Promise[Unit] = js.native
    def toBeLessThanOrEqual(expected: Double): js.Promise[Unit] = js.native
    def toBeLessThanOrEqual(expected: Double, expectationFailOutput: Any): js.Promise[Unit] = js.native
    
    def toBeNaN(): js.Promise[Unit] = js.native
    
    def toBeNull(): js.Promise[Unit] = js.native
    def toBeNull(expectationFailOutput: Any): js.Promise[Unit] = js.native
    
    def toBeTruthy(): js.Promise[Unit] = js.native
    def toBeTruthy(expectationFailOutput: Any): js.Promise[Unit] = js.native
    
    def toBeUndefined(): js.Promise[Unit] = js.native
    def toBeUndefined(expectationFailOutput: Any): js.Promise[Unit] = js.native
    
    def toContain(expected: Any): js.Promise[Unit] = js.native
    def toContain(expected: Any, expectationFailOutput: Any): js.Promise[Unit] = js.native
    
    def toEqual(expected: Any): js.Promise[Unit] = js.native
    def toEqual(expected: Any, expectationFailOutput: Any): js.Promise[Unit] = js.native
    
    def toHaveBeenCalled(): js.Promise[Unit] = js.native
    
    def toHaveBeenCalledTimes(expected: js.Promise[Double]): js.Promise[Unit] = js.native
    def toHaveBeenCalledTimes(expected: Double): js.Promise[Unit] = js.native
    
    def toHaveBeenCalledWith(params: Any*): js.Promise[Unit] = js.native
    
    def toMatch(expected: String): js.Promise[Unit] = js.native
    def toMatch(expected: String, expectationFailOutput: Any): js.Promise[Unit] = js.native
    def toMatch(expected: js.Promise[String | js.RegExp]): js.Promise[Unit] = js.native
    def toMatch(expected: js.Promise[String | js.RegExp], expectationFailOutput: Any): js.Promise[Unit] = js.native
    def toMatch(expected: js.RegExp): js.Promise[Unit] = js.native
    def toMatch(expected: js.RegExp, expectationFailOutput: Any): js.Promise[Unit] = js.native
    
    def toThrow(): js.Promise[Unit] = js.native
    def toThrow(expected: Any): js.Promise[Unit] = js.native
    
    def toThrowError(): js.Promise[Unit] = js.native
    def toThrowError(
      expected: Instantiable1[
          /* args (repeated) */ Any, 
          js.Error | (js.Promise[Instantiable1[/* args (repeated) */ Any, js.Error]])
        ]
    ): js.Promise[Unit] = js.native
    def toThrowError(
      expected: Instantiable1[
          /* args (repeated) */ Any, 
          js.Error | (js.Promise[Instantiable1[/* args (repeated) */ Any, js.Error]])
        ],
      message: String
    ): js.Promise[Unit] = js.native
    def toThrowError(
      expected: Instantiable1[
          /* args (repeated) */ Any, 
          js.Error | (js.Promise[Instantiable1[/* args (repeated) */ Any, js.Error]])
        ],
      message: js.Promise[String | js.RegExp]
    ): js.Promise[Unit] = js.native
    def toThrowError(
      expected: Instantiable1[
          /* args (repeated) */ Any, 
          js.Error | (js.Promise[Instantiable1[/* args (repeated) */ Any, js.Error]])
        ],
      message: js.RegExp
    ): js.Promise[Unit] = js.native
    def toThrowError(expected: Unit, message: String): js.Promise[Unit] = js.native
    def toThrowError(expected: Unit, message: js.Promise[String | js.RegExp]): js.Promise[Unit] = js.native
    def toThrowError(expected: Unit, message: js.RegExp): js.Promise[Unit] = js.native
    def toThrowError(message: String): js.Promise[Unit] = js.native
    def toThrowError(message: js.Promise[String | js.RegExp]): js.Promise[Unit] = js.native
    def toThrowError(message: js.RegExp): js.Promise[Unit] = js.native
  }
  
  trait Spec extends StObject {
    
    def addMatchers(matchers: AsyncCustomMatcherFactories): Unit
  }
  object Spec {
    
    inline def apply(addMatchers: AsyncCustomMatcherFactories => Unit): Spec = {
      val __obj = js.Dynamic.literal(addMatchers = js.Any.fromFunction1(addMatchers))
      __obj.asInstanceOf[Spec]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Spec] (val x: Self) extends AnyVal {
      
      inline def setAddMatchers(value: AsyncCustomMatcherFactories => Unit): Self = StObject.set(x, "addMatchers", js.Any.fromFunction1(value))
    }
  }
}
