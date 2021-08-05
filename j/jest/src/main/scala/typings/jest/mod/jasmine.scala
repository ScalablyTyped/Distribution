package typings.jest.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.jest.anon.Args
import typings.std.Date
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jasmine {
  
  @JSImport("jest", "jasmine")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jest", "jasmine.DEFAULT_TIMEOUT_INTERVAL")
  @js.native
  def DEFAULT_TIMEOUT_INTERVAL: Double = js.native
  inline def DEFAULT_TIMEOUT_INTERVAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_TIMEOUT_INTERVAL")(x.asInstanceOf[js.Any])
  
  inline def addCustomEqualityTester(equalityTester: CustomEqualityTester): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addCustomEqualityTester")(equalityTester.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def addMatchers(matchers: CustomMatcherFactories): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMatchers")(matchers.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def any(aclass: js.Any): Any_ = ^.asInstanceOf[js.Dynamic].applyDynamic("any")(aclass.asInstanceOf[js.Any]).asInstanceOf[Any_]
  
  inline def anything(): Any_ = ^.asInstanceOf[js.Dynamic].applyDynamic("anything")().asInstanceOf[Any_]
  
  inline def arrayContaining(sample: js.Array[js.Any]): ArrayContaining_ = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayContaining")(sample.asInstanceOf[js.Any]).asInstanceOf[ArrayContaining_]
  
  inline def clock(): Clock_ = ^.asInstanceOf[js.Dynamic].applyDynamic("clock")().asInstanceOf[Clock_]
  
  inline def createSpy(): Spy = ^.asInstanceOf[js.Dynamic].applyDynamic("createSpy")().asInstanceOf[Spy]
  inline def createSpy(name: String): Spy = ^.asInstanceOf[js.Dynamic].applyDynamic("createSpy")(name.asInstanceOf[js.Any]).asInstanceOf[Spy]
  inline def createSpy(name: String, originalFn: js.Function1[/* repeated */ js.Any, js.Any]): Spy = (^.asInstanceOf[js.Dynamic].applyDynamic("createSpy")(name.asInstanceOf[js.Any], originalFn.asInstanceOf[js.Any])).asInstanceOf[Spy]
  inline def createSpy(name: Unit, originalFn: js.Function1[/* repeated */ js.Any, js.Any]): Spy = (^.asInstanceOf[js.Dynamic].applyDynamic("createSpy")(name.asInstanceOf[js.Any], originalFn.asInstanceOf[js.Any])).asInstanceOf[Spy]
  
  inline def createSpyObj(baseName: String, methodNames: js.Array[js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createSpyObj")(baseName.asInstanceOf[js.Any], methodNames.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  // tslint:disable-next-line: no-unnecessary-generics
  inline def createSpyObj_T_T[T](baseName: String, methodNames: js.Array[js.Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createSpyObj")(baseName.asInstanceOf[js.Any], methodNames.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def objectContaining(sample: js.Any): ObjectContaining_ = ^.asInstanceOf[js.Dynamic].applyDynamic("objectContaining")(sample.asInstanceOf[js.Any]).asInstanceOf[ObjectContaining_]
  
  inline def pp(value: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pp")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stringMatching(value: String): Any_ = ^.asInstanceOf[js.Dynamic].applyDynamic("stringMatching")(value.asInstanceOf[js.Any]).asInstanceOf[Any_]
  inline def stringMatching(value: RegExp): Any_ = ^.asInstanceOf[js.Dynamic].applyDynamic("stringMatching")(value.asInstanceOf[js.Any]).asInstanceOf[Any_]
  
  @js.native
  trait Any_
    extends StObject
       with Instantiable1[/* expectedClass */ js.Any, js.Any] {
    
    def jasmineMatches(other: js.Any): Boolean = js.native
    
    def jasmineToString(): String = js.native
  }
  
  @js.native
  trait ArrayContaining_
    extends StObject
       with Instantiable1[/* sample */ js.Array[js.Any], js.Any] {
    
    def asymmetricMatch(other: js.Any): Boolean = js.native
    
    def jasmineToString(): String = js.native
  }
  
  trait ArrayLike[T]
    extends StObject
       with /* n */ NumberDictionary[T] {
    
    var length: Double
  }
  object ArrayLike {
    
    inline def apply[T](length: Double): ArrayLike[T] = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArrayLike[T]]
    }
    
    extension [Self <: ArrayLike[?], T](x: Self & ArrayLike[T]) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  trait CallInfo extends StObject {
    
    /**
      * All arguments passed to the call
      */
    var args: js.Array[js.Any]
    
    /**
      * The context (the this) for the call
      */
    var `object`: js.Any
    
    /**
      * The return value of the call
      */
    var returnValue: js.Any
  }
  object CallInfo {
    
    inline def apply(args: js.Array[js.Any], `object`: js.Any, returnValue: js.Any): CallInfo = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallInfo]
    }
    
    extension [Self <: CallInfo](x: Self) {
      
      inline def setArgs(value: js.Array[js.Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      inline def setObject(value: js.Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setReturnValue(value: js.Any): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
    }
  }
  
  trait Calls extends StObject {
    
    /**
      * By chaining the spy with calls.all(), will return the
      * context (the this) and arguments passed all calls
      */
    def all(): js.Array[CallInfo]
    
    /**
      * By chaining the spy with calls.allArgs(),
      * will return the arguments to all calls
      */
    def allArgs(): js.Array[js.Any]
    
    /**
      * By chaining the spy with calls.any(),
      * will return false if the spy has not been called at all,
      * and then true once at least one call happens.
      */
    def any(): Boolean
    
    /**
      * By chaining the spy with calls.argsFor(),
      * will return the arguments passed to call number index
      */
    def argsFor(index: Double): js.Array[js.Any]
    
    /**
      * By chaining the spy with calls.count(),
      * will return the number of times the spy was called
      */
    def count(): Double
    
    /**
      * By chaining the spy with calls.first(), will return the
      * context (the this) and arguments for the first call
      */
    def first(): CallInfo
    
    /**
      * By chaining the spy with calls.mostRecent(), will return the
      * context (the this) and arguments for the most recent call
      */
    def mostRecent(): CallInfo
    
    /**
      * By chaining the spy with calls.reset(), will clears all tracking for a spy
      */
    def reset(): Unit
  }
  object Calls {
    
    inline def apply(
      all: () => js.Array[CallInfo],
      allArgs: () => js.Array[js.Any],
      any: () => Boolean,
      argsFor: Double => js.Array[js.Any],
      count: () => Double,
      first: () => CallInfo,
      mostRecent: () => CallInfo,
      reset: () => Unit
    ): Calls = {
      val __obj = js.Dynamic.literal(all = js.Any.fromFunction0(all), allArgs = js.Any.fromFunction0(allArgs), any = js.Any.fromFunction0(any), argsFor = js.Any.fromFunction1(argsFor), count = js.Any.fromFunction0(count), first = js.Any.fromFunction0(first), mostRecent = js.Any.fromFunction0(mostRecent), reset = js.Any.fromFunction0(reset))
      __obj.asInstanceOf[Calls]
    }
    
    extension [Self <: Calls](x: Self) {
      
      inline def setAll(value: () => js.Array[CallInfo]): Self = StObject.set(x, "all", js.Any.fromFunction0(value))
      
      inline def setAllArgs(value: () => js.Array[js.Any]): Self = StObject.set(x, "allArgs", js.Any.fromFunction0(value))
      
      inline def setAny(value: () => Boolean): Self = StObject.set(x, "any", js.Any.fromFunction0(value))
      
      inline def setArgsFor(value: Double => js.Array[js.Any]): Self = StObject.set(x, "argsFor", js.Any.fromFunction1(value))
      
      inline def setCount(value: () => Double): Self = StObject.set(x, "count", js.Any.fromFunction0(value))
      
      inline def setFirst(value: () => CallInfo): Self = StObject.set(x, "first", js.Any.fromFunction0(value))
      
      inline def setMostRecent(value: () => CallInfo): Self = StObject.set(x, "mostRecent", js.Any.fromFunction0(value))
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Clock_ extends StObject {
    
    def install(): Unit = js.native
    
    def mockDate(): Unit = js.native
    def mockDate(date: Date): Unit = js.native
    
    /**
      * Calls to any registered callback are triggered when the clock isticked forward
      * via the jasmine.clock().tick function, which takes a number of milliseconds.
      */
    def tick(ms: Double): Unit = js.native
    
    def uninstall(): Unit = js.native
  }
  
  type CustomEqualityTester = js.Function2[/* first */ js.Any, /* second */ js.Any, Boolean]
  
  @js.native
  trait CustomMatcher extends StObject {
    
    def compare(actual: js.Any, expected: js.Any*): CustomMatcherResult = js.native
    def compare[T](actual: T, expected: T, args: js.Any*): CustomMatcherResult = js.native
  }
  
  type CustomMatcherFactories = StringDictionary[CustomMatcherFactory]
  
  type CustomMatcherFactory = js.Function2[
    /* util */ MatchersUtil, 
    /* customEqualityTesters */ js.Array[CustomEqualityTester], 
    CustomMatcher
  ]
  
  trait CustomMatcherResult extends StObject {
    
    var message: String | js.Function0[String]
    
    var pass: Boolean
  }
  object CustomMatcherResult {
    
    inline def apply(message: String | js.Function0[String], pass: Boolean): CustomMatcherResult = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomMatcherResult]
    }
    
    extension [Self <: CustomMatcherResult](x: Self) {
      
      inline def setMessage(value: String | js.Function0[String]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageFunction0(value: () => String): Self = StObject.set(x, "message", js.Any.fromFunction0(value))
      
      inline def setPass(value: Boolean): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MatchersUtil extends StObject {
    
    def buildFailureMessage(matcherName: String, isNot: Boolean, actual: js.Any, expected: js.Any*): String = js.native
    
    def contains[T](haystack: String, needle: js.Any): Boolean = js.native
    def contains[T](haystack: String, needle: js.Any, customTesters: js.Array[CustomEqualityTester]): Boolean = js.native
    // tslint:disable-next-line: no-unnecessary-generics
    def contains[T](haystack: ArrayLike[T], needle: js.Any): Boolean = js.native
    def contains[T](haystack: ArrayLike[T], needle: js.Any, customTesters: js.Array[CustomEqualityTester]): Boolean = js.native
    
    def equals(a: js.Any, b: js.Any): Boolean = js.native
    def equals(a: js.Any, b: js.Any, customTesters: js.Array[CustomEqualityTester]): Boolean = js.native
  }
  
  @js.native
  trait ObjectContaining_
    extends StObject
       with Instantiable1[/* expectedClass */ js.Any, js.Any] {
    
    def jasmineMatches(other: js.Any, mismatchKeys: js.Array[js.Any], mismatchValues: js.Array[js.Any]): Boolean = js.native
    
    def jasmineToString(): String = js.native
  }
  
  @js.native
  trait Spy extends StObject {
    
    def apply(params: js.Any*): js.Any = js.native
    
    var and: SpyAnd = js.native
    
    var argsForCall: js.Array[js.Any] = js.native
    
    var calls: Calls = js.native
    
    var identity: String = js.native
    
    var mostRecentCall: Args = js.native
    
    var wasCalled: Boolean = js.native
  }
  
  trait SpyAnd extends StObject {
    
    /**
      * By chaining the spy with and.callFake, all calls to the spy
      * will delegate to the supplied function.
      */
    def callFake(fn: js.Function1[/* repeated */ js.Any, js.Any]): Spy
    
    /**
      * By chaining the spy with and.callThrough, the spy will still track all
      * calls to it but in addition it will delegate to the actual implementation.
      */
    def callThrough(): Spy
    
    /**
      * By chaining the spy with and.returnValue, all calls to the function
      * will return a specific value.
      */
    def returnValue(`val`: js.Any): Spy
    
    /**
      * By chaining the spy with and.returnValues, all calls to the function
      * will return specific values in order until it reaches the end of the return values list.
      */
    def returnValues(values: js.Any*): Spy
    
    /**
      * When a calling strategy is used for a spy, the original stubbing
      * behavior can be returned at any time with and.stub.
      */
    def stub(): Spy
    
    /**
      * By chaining the spy with and.throwError, all calls to the spy
      * will throw the specified value.
      */
    def throwError(msg: String): Spy
  }
  object SpyAnd {
    
    inline def apply(
      callFake: js.Function1[/* repeated */ js.Any, js.Any] => Spy,
      callThrough: () => Spy,
      returnValue: js.Any => Spy,
      returnValues: /* repeated */ js.Any => Spy,
      stub: () => Spy,
      throwError: String => Spy
    ): SpyAnd = {
      val __obj = js.Dynamic.literal(callFake = js.Any.fromFunction1(callFake), callThrough = js.Any.fromFunction0(callThrough), returnValue = js.Any.fromFunction1(returnValue), returnValues = js.Any.fromFunction1(returnValues), stub = js.Any.fromFunction0(stub), throwError = js.Any.fromFunction1(throwError))
      __obj.asInstanceOf[SpyAnd]
    }
    
    extension [Self <: SpyAnd](x: Self) {
      
      inline def setCallFake(value: js.Function1[/* repeated */ js.Any, js.Any] => Spy): Self = StObject.set(x, "callFake", js.Any.fromFunction1(value))
      
      inline def setCallThrough(value: () => Spy): Self = StObject.set(x, "callThrough", js.Any.fromFunction0(value))
      
      inline def setReturnValue(value: js.Any => Spy): Self = StObject.set(x, "returnValue", js.Any.fromFunction1(value))
      
      inline def setReturnValues(value: /* repeated */ js.Any => Spy): Self = StObject.set(x, "returnValues", js.Any.fromFunction1(value))
      
      inline def setStub(value: () => Spy): Self = StObject.set(x, "stub", js.Any.fromFunction0(value))
      
      inline def setThrowError(value: String => Spy): Self = StObject.set(x, "throwError", js.Any.fromFunction1(value))
    }
  }
}
