package typings.jasminewd2

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.jasmine.jasmine.ArrayLike
import typings.jasmine.jasmine.CustomEqualityTester
import typings.jasmine.jasmine.Expected
import typings.jasmine.jasmine.MatchersUtil
import typings.std.Error
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jasmine {
  
  @js.native
  trait ArrayLikeMatchers[T] extends Matchers[ArrayLike[T]] {
    
    var not: ArrayLikeMatchers[T] = js.native
    
    def toBe(expected: Expected[ArrayLike[T]]): js.Promise[Unit] = js.native
    def toBe(expected: Expected[ArrayLike[T]], expectationFailOutput: js.Any): js.Promise[Unit] = js.native
    
    def toContain(expected: T): js.Promise[Unit] = js.native
    def toContain(expected: T, expectationFailOutput: js.Any): js.Promise[Unit] = js.native
    
    def toEqual(expected: Expected[ArrayLike[T]]): js.Promise[Unit] = js.native
    def toEqual(expected: Expected[ArrayLike[T]], expectationFailOutput: js.Any): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait AsyncCustomMatcher extends StObject {
    
    def compare(actual: js.Any, expected: js.Any): AsyncCustomMatcherResult = js.native
    def compare[T](actual: T, expected: T): AsyncCustomMatcherResult = js.native
  }
  
  type AsyncCustomMatcherFactories = StringDictionary[AsyncCustomMatcherFactory]
  
  type AsyncCustomMatcherFactory = js.Function2[
    /* util */ MatchersUtil, 
    /* customEqualityTesters */ js.Array[CustomEqualityTester], 
    AsyncCustomMatcher
  ]
  
  @js.native
  trait AsyncCustomMatcherResult extends StObject {
    
    var message: js.UndefOr[String] = js.native
    
    var pass: Boolean | js.Promise[Boolean] = js.native
  }
  object AsyncCustomMatcherResult {
    
    @scala.inline
    def apply(pass: Boolean | js.Promise[Boolean]): AsyncCustomMatcherResult = {
      val __obj = js.Dynamic.literal(pass = pass.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsyncCustomMatcherResult]
    }
    
    @scala.inline
    implicit class AsyncCustomMatcherResultMutableBuilder[Self <: AsyncCustomMatcherResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setPass(value: Boolean | js.Promise[Boolean]): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Env extends StObject {
    
    def addMatchers(matchers: AsyncCustomMatcherFactories): Unit = js.native
  }
  object Env {
    
    @scala.inline
    def apply(addMatchers: AsyncCustomMatcherFactories => Unit): Env = {
      val __obj = js.Dynamic.literal(addMatchers = js.Any.fromFunction1(addMatchers))
      __obj.asInstanceOf[Env]
    }
    
    @scala.inline
    implicit class EnvMutableBuilder[Self <: Env] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddMatchers(value: AsyncCustomMatcherFactories => Unit): Self = StObject.set(x, "addMatchers", js.Any.fromFunction1(value))
    }
  }
  
  // Add definition to be compatible with latest jasmine v3 types.
  // Even though library is not compatible with jasmine v3, there is no suitable way to configure that now here.
  // See for more detail: https://github.com/microsoft/dtslint/issues/253
  @js.native
  trait FunctionMatchers[Fn /* <: js.Function1[/* repeated */ js.Any, _] */]
    extends Matchers[js.Any] {
    
    @JSName("toHaveBeenCalledWith")
    def toHaveBeenCalledWith_Promise(params: js.Any*): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait Matchers[T] extends StObject {
    
    def toBe(expected: js.Any): js.Promise[Unit] = js.native
    def toBe(expected: js.Any, expectationFailOutput: js.Any): js.Promise[Unit] = js.native
    
    def toBeCloseTo(expected: js.Promise[Double]): js.Promise[Unit] = js.native
    def toBeCloseTo(expected: js.Promise[Double], precision: js.UndefOr[scala.Nothing], expectationFailOutput: js.Any): js.Promise[Unit] = js.native
    def toBeCloseTo(expected: js.Promise[Double], precision: js.Any): js.Promise[Unit] = js.native
    def toBeCloseTo(expected: js.Promise[Double], precision: js.Any, expectationFailOutput: js.Any): js.Promise[Unit] = js.native
    def toBeCloseTo(expected: Double): js.Promise[Unit] = js.native
    def toBeCloseTo(expected: Double, precision: js.UndefOr[scala.Nothing], expectationFailOutput: js.Any): js.Promise[Unit] = js.native
    def toBeCloseTo(expected: Double, precision: js.Any): js.Promise[Unit] = js.native
    def toBeCloseTo(expected: Double, precision: js.Any, expectationFailOutput: js.Any): js.Promise[Unit] = js.native
    
    def toBeDefined(): js.Promise[Unit] = js.native
    def toBeDefined(expectationFailOutput: js.Any): js.Promise[Unit] = js.native
    
    def toBeFalsy(): js.Promise[Unit] = js.native
    def toBeFalsy(expectationFailOutput: js.Any): js.Promise[Unit] = js.native
    
    def toBeGreaterThan(expected: js.Promise[Double]): js.Promise[Unit] = js.native
    def toBeGreaterThan(expected: js.Promise[Double], expectationFailOutput: js.Any): js.Promise[Unit] = js.native
    def toBeGreaterThan(expected: Double): js.Promise[Unit] = js.native
    def toBeGreaterThan(expected: Double, expectationFailOutput: js.Any): js.Promise[Unit] = js.native
    
    def toBeGreaterThanOrEqual(expected: js.Promise[Double]): js.Promise[Unit] = js.native
    def toBeGreaterThanOrEqual(expected: js.Promise[Double], expectationFailOutput: js.Any): js.Promise[Unit] = js.native
    def toBeGreaterThanOrEqual(expected: Double): js.Promise[Unit] = js.native
    def toBeGreaterThanOrEqual(expected: Double, expectationFailOutput: js.Any): js.Promise[Unit] = js.native
    
    def toBeLessThan(expected: js.Promise[Double]): js.Promise[Unit] = js.native
    def toBeLessThan(expected: js.Promise[Double], expectationFailOutput: js.Any): js.Promise[Unit] = js.native
    def toBeLessThan(expected: Double): js.Promise[Unit] = js.native
    def toBeLessThan(expected: Double, expectationFailOutput: js.Any): js.Promise[Unit] = js.native
    
    def toBeLessThanOrEqual(expected: js.Promise[Double]): js.Promise[Unit] = js.native
    def toBeLessThanOrEqual(expected: js.Promise[Double], expectationFailOutput: js.Any): js.Promise[Unit] = js.native
    def toBeLessThanOrEqual(expected: Double): js.Promise[Unit] = js.native
    def toBeLessThanOrEqual(expected: Double, expectationFailOutput: js.Any): js.Promise[Unit] = js.native
    
    def toBeNaN(): js.Promise[Unit] = js.native
    
    def toBeNull(): js.Promise[Unit] = js.native
    def toBeNull(expectationFailOutput: js.Any): js.Promise[Unit] = js.native
    
    def toBeTruthy(): js.Promise[Unit] = js.native
    def toBeTruthy(expectationFailOutput: js.Any): js.Promise[Unit] = js.native
    
    def toBeUndefined(): js.Promise[Unit] = js.native
    def toBeUndefined(expectationFailOutput: js.Any): js.Promise[Unit] = js.native
    
    def toContain(expected: js.Any): js.Promise[Unit] = js.native
    def toContain(expected: js.Any, expectationFailOutput: js.Any): js.Promise[Unit] = js.native
    
    def toEqual(expected: js.Any): js.Promise[Unit] = js.native
    def toEqual(expected: js.Any, expectationFailOutput: js.Any): js.Promise[Unit] = js.native
    
    def toHaveBeenCalled(): js.Promise[Unit] = js.native
    
    def toHaveBeenCalledTimes(expected: js.Promise[Double]): js.Promise[Unit] = js.native
    def toHaveBeenCalledTimes(expected: Double): js.Promise[Unit] = js.native
    
    def toHaveBeenCalledWith(params: js.Any*): js.Promise[Unit] = js.native
    
    def toMatch(expected: String): js.Promise[Unit] = js.native
    def toMatch(expected: String, expectationFailOutput: js.Any): js.Promise[Unit] = js.native
    def toMatch(expected: js.Promise[String | RegExp]): js.Promise[Unit] = js.native
    def toMatch(expected: js.Promise[String | RegExp], expectationFailOutput: js.Any): js.Promise[Unit] = js.native
    def toMatch(expected: RegExp): js.Promise[Unit] = js.native
    def toMatch(expected: RegExp, expectationFailOutput: js.Any): js.Promise[Unit] = js.native
    
    def toThrow(): js.Promise[Unit] = js.native
    def toThrow(expected: js.Any): js.Promise[Unit] = js.native
    
    def toThrowError(): js.Promise[Unit] = js.native
    def toThrowError(expected: js.UndefOr[scala.Nothing], message: String): js.Promise[Unit] = js.native
    def toThrowError(expected: js.UndefOr[scala.Nothing], message: js.Promise[String | RegExp]): js.Promise[Unit] = js.native
    def toThrowError(expected: js.UndefOr[scala.Nothing], message: RegExp): js.Promise[Unit] = js.native
    def toThrowError(
      expected: Instantiable1[
          /* args (repeated) */ js.Any, 
          Error | (js.Promise[Instantiable1[/* args (repeated) */ js.Any, Error]])
        ]
    ): js.Promise[Unit] = js.native
    def toThrowError(
      expected: Instantiable1[
          /* args (repeated) */ js.Any, 
          Error | (js.Promise[Instantiable1[/* args (repeated) */ js.Any, Error]])
        ],
      message: String
    ): js.Promise[Unit] = js.native
    def toThrowError(
      expected: Instantiable1[
          /* args (repeated) */ js.Any, 
          Error | (js.Promise[Instantiable1[/* args (repeated) */ js.Any, Error]])
        ],
      message: js.Promise[String | RegExp]
    ): js.Promise[Unit] = js.native
    def toThrowError(
      expected: Instantiable1[
          /* args (repeated) */ js.Any, 
          Error | (js.Promise[Instantiable1[/* args (repeated) */ js.Any, Error]])
        ],
      message: RegExp
    ): js.Promise[Unit] = js.native
    def toThrowError(message: String): js.Promise[Unit] = js.native
    def toThrowError(message: js.Promise[String | RegExp]): js.Promise[Unit] = js.native
    def toThrowError(message: RegExp): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait Spec extends StObject {
    
    def addMatchers(matchers: AsyncCustomMatcherFactories): Unit = js.native
  }
  object Spec {
    
    @scala.inline
    def apply(addMatchers: AsyncCustomMatcherFactories => Unit): Spec = {
      val __obj = js.Dynamic.literal(addMatchers = js.Any.fromFunction1(addMatchers))
      __obj.asInstanceOf[Spec]
    }
    
    @scala.inline
    implicit class SpecMutableBuilder[Self <: Spec] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddMatchers(value: AsyncCustomMatcherFactories => Unit): Self = StObject.set(x, "addMatchers", js.Any.fromFunction1(value))
    }
  }
}
