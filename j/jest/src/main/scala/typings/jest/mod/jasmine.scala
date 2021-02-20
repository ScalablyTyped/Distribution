package typings.jest.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.jest.anon.Args
import typings.std.Date
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jasmine {
  
  @JSImport("jest", "jasmine")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jest", "jasmine.DEFAULT_TIMEOUT_INTERVAL")
  @js.native
  def DEFAULT_TIMEOUT_INTERVAL: Double = js.native
  @scala.inline
  def DEFAULT_TIMEOUT_INTERVAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_TIMEOUT_INTERVAL")(x.asInstanceOf[js.Any])
  
  @JSImport("jest", "jasmine.addCustomEqualityTester")
  @js.native
  def addCustomEqualityTester(equalityTester: CustomEqualityTester): Unit = js.native
  
  @JSImport("jest", "jasmine.addMatchers")
  @js.native
  def addMatchers(matchers: CustomMatcherFactories): Unit = js.native
  
  @JSImport("jest", "jasmine.any")
  @js.native
  def any(aclass: js.Any): Any_ = js.native
  
  @JSImport("jest", "jasmine.anything")
  @js.native
  def anything(): Any_ = js.native
  
  @JSImport("jest", "jasmine.arrayContaining")
  @js.native
  def arrayContaining(sample: js.Array[_]): ArrayContaining_ = js.native
  
  @JSImport("jest", "jasmine.clock")
  @js.native
  def clock(): Clock_ = js.native
  
  @JSImport("jest", "jasmine.createSpy")
  @js.native
  def createSpy(): Spy = js.native
  @JSImport("jest", "jasmine.createSpy")
  @js.native
  def createSpy(name: js.UndefOr[scala.Nothing], originalFn: js.Function1[/* repeated */ js.Any, _]): Spy = js.native
  @JSImport("jest", "jasmine.createSpy")
  @js.native
  def createSpy(name: String): Spy = js.native
  @JSImport("jest", "jasmine.createSpy")
  @js.native
  def createSpy(name: String, originalFn: js.Function1[/* repeated */ js.Any, _]): Spy = js.native
  
  @JSImport("jest", "jasmine.createSpyObj")
  @js.native
  def createSpyObj(baseName: String, methodNames: js.Array[_]): js.Any = js.native
  // tslint:disable-next-line: no-unnecessary-generics
  @JSImport("jest", "jasmine.createSpyObj")
  @js.native
  def createSpyObj_T_T[T](baseName: String, methodNames: js.Array[_]): T = js.native
  
  @JSImport("jest", "jasmine.objectContaining")
  @js.native
  def objectContaining(sample: js.Any): ObjectContaining_ = js.native
  
  @JSImport("jest", "jasmine.pp")
  @js.native
  def pp(value: js.Any): String = js.native
  
  @JSImport("jest", "jasmine.stringMatching")
  @js.native
  def stringMatching(value: String): Any_ = js.native
  @JSImport("jest", "jasmine.stringMatching")
  @js.native
  def stringMatching(value: RegExp): Any_ = js.native
  
  @js.native
  trait Any_
    extends Instantiable1[/* expectedClass */ js.Any, js.Any] {
    
    def jasmineMatches(other: js.Any): Boolean = js.native
    
    def jasmineToString(): String = js.native
  }
  
  @js.native
  trait ArrayContaining_
    extends Instantiable1[/* sample */ js.Array[js.Any], js.Any] {
    
    def asymmetricMatch(other: js.Any): Boolean = js.native
    
    def jasmineToString(): String = js.native
  }
  
  @js.native
  trait ArrayLike[T] extends /* n */ NumberDictionary[T] {
    
    var length: Double = js.native
  }
  object ArrayLike {
    
    @scala.inline
    def apply[T](length: Double): ArrayLike[T] = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArrayLike[T]]
    }
    
    @scala.inline
    implicit class ArrayLikeMutableBuilder[Self <: ArrayLike[_], T] (val x: Self with ArrayLike[T]) extends AnyVal {
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CallInfo extends StObject {
    
    /**
      * All arguments passed to the call
      */
    var args: js.Array[_] = js.native
    
    /**
      * The context (the this) for the call
      */
    var `object`: js.Any = js.native
    
    /**
      * The return value of the call
      */
    var returnValue: js.Any = js.native
  }
  object CallInfo {
    
    @scala.inline
    def apply(args: js.Array[_], `object`: js.Any, returnValue: js.Any): CallInfo = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallInfo]
    }
    
    @scala.inline
    implicit class CallInfoMutableBuilder[Self <: CallInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[_]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setObject(value: js.Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnValue(value: js.Any): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Calls extends StObject {
    
    /**
      * By chaining the spy with calls.all(), will return the
      * context (the this) and arguments passed all calls
      */
    def all(): js.Array[CallInfo] = js.native
    
    /**
      * By chaining the spy with calls.allArgs(),
      * will return the arguments to all calls
      */
    def allArgs(): js.Array[_] = js.native
    
    /**
      * By chaining the spy with calls.any(),
      * will return false if the spy has not been called at all,
      * and then true once at least one call happens.
      */
    def any(): Boolean = js.native
    
    /**
      * By chaining the spy with calls.argsFor(),
      * will return the arguments passed to call number index
      */
    def argsFor(index: Double): js.Array[_] = js.native
    
    /**
      * By chaining the spy with calls.count(),
      * will return the number of times the spy was called
      */
    def count(): Double = js.native
    
    /**
      * By chaining the spy with calls.first(), will return the
      * context (the this) and arguments for the first call
      */
    def first(): CallInfo = js.native
    
    /**
      * By chaining the spy with calls.mostRecent(), will return the
      * context (the this) and arguments for the most recent call
      */
    def mostRecent(): CallInfo = js.native
    
    /**
      * By chaining the spy with calls.reset(), will clears all tracking for a spy
      */
    def reset(): Unit = js.native
  }
  object Calls {
    
    @scala.inline
    def apply(
      all: () => js.Array[CallInfo],
      allArgs: () => js.Array[_],
      any: () => Boolean,
      argsFor: Double => js.Array[_],
      count: () => Double,
      first: () => CallInfo,
      mostRecent: () => CallInfo,
      reset: () => Unit
    ): Calls = {
      val __obj = js.Dynamic.literal(all = js.Any.fromFunction0(all), allArgs = js.Any.fromFunction0(allArgs), any = js.Any.fromFunction0(any), argsFor = js.Any.fromFunction1(argsFor), count = js.Any.fromFunction0(count), first = js.Any.fromFunction0(first), mostRecent = js.Any.fromFunction0(mostRecent), reset = js.Any.fromFunction0(reset))
      __obj.asInstanceOf[Calls]
    }
    
    @scala.inline
    implicit class CallsMutableBuilder[Self <: Calls] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAll(value: () => js.Array[CallInfo]): Self = StObject.set(x, "all", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAllArgs(value: () => js.Array[_]): Self = StObject.set(x, "allArgs", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAny(value: () => Boolean): Self = StObject.set(x, "any", js.Any.fromFunction0(value))
      
      @scala.inline
      def setArgsFor(value: Double => js.Array[_]): Self = StObject.set(x, "argsFor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCount(value: () => Double): Self = StObject.set(x, "count", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFirst(value: () => CallInfo): Self = StObject.set(x, "first", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMostRecent(value: () => CallInfo): Self = StObject.set(x, "mostRecent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
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
  
  @js.native
  trait CustomMatcherResult extends StObject {
    
    var message: String | js.Function0[String] = js.native
    
    var pass: Boolean = js.native
  }
  object CustomMatcherResult {
    
    @scala.inline
    def apply(message: String | js.Function0[String], pass: Boolean): CustomMatcherResult = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomMatcherResult]
    }
    
    @scala.inline
    implicit class CustomMatcherResultMutableBuilder[Self <: CustomMatcherResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String | js.Function0[String]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageFunction0(value: () => String): Self = StObject.set(x, "message", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPass(value: Boolean): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
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
    extends Instantiable1[/* expectedClass */ js.Any, js.Any] {
    
    def jasmineMatches(other: js.Any, mismatchKeys: js.Array[_], mismatchValues: js.Array[_]): Boolean = js.native
    
    def jasmineToString(): String = js.native
  }
  
  @js.native
  trait Spy extends StObject {
    
    def apply(params: js.Any*): js.Any = js.native
    
    var and: SpyAnd = js.native
    
    var argsForCall: js.Array[_] = js.native
    
    var calls: Calls = js.native
    
    var identity: String = js.native
    
    var mostRecentCall: Args = js.native
    
    var wasCalled: Boolean = js.native
  }
  
  @js.native
  trait SpyAnd extends StObject {
    
    /**
      * By chaining the spy with and.callFake, all calls to the spy
      * will delegate to the supplied function.
      */
    def callFake(fn: js.Function1[/* repeated */ js.Any, _]): Spy = js.native
    
    /**
      * By chaining the spy with and.callThrough, the spy will still track all
      * calls to it but in addition it will delegate to the actual implementation.
      */
    def callThrough(): Spy = js.native
    
    /**
      * By chaining the spy with and.returnValue, all calls to the function
      * will return a specific value.
      */
    def returnValue(`val`: js.Any): Spy = js.native
    
    /**
      * By chaining the spy with and.returnValues, all calls to the function
      * will return specific values in order until it reaches the end of the return values list.
      */
    def returnValues(values: js.Any*): Spy = js.native
    
    /**
      * When a calling strategy is used for a spy, the original stubbing
      * behavior can be returned at any time with and.stub.
      */
    def stub(): Spy = js.native
    
    /**
      * By chaining the spy with and.throwError, all calls to the spy
      * will throw the specified value.
      */
    def throwError(msg: String): Spy = js.native
  }
  object SpyAnd {
    
    @scala.inline
    def apply(
      callFake: js.Function1[/* repeated */ js.Any, _] => Spy,
      callThrough: () => Spy,
      returnValue: js.Any => Spy,
      returnValues: /* repeated */ js.Any => Spy,
      stub: () => Spy,
      throwError: String => Spy
    ): SpyAnd = {
      val __obj = js.Dynamic.literal(callFake = js.Any.fromFunction1(callFake), callThrough = js.Any.fromFunction0(callThrough), returnValue = js.Any.fromFunction1(returnValue), returnValues = js.Any.fromFunction1(returnValues), stub = js.Any.fromFunction0(stub), throwError = js.Any.fromFunction1(throwError))
      __obj.asInstanceOf[SpyAnd]
    }
    
    @scala.inline
    implicit class SpyAndMutableBuilder[Self <: SpyAnd] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallFake(value: js.Function1[/* repeated */ js.Any, _] => Spy): Self = StObject.set(x, "callFake", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCallThrough(value: () => Spy): Self = StObject.set(x, "callThrough", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReturnValue(value: js.Any => Spy): Self = StObject.set(x, "returnValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReturnValues(value: /* repeated */ js.Any => Spy): Self = StObject.set(x, "returnValues", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStub(value: () => Spy): Self = StObject.set(x, "stub", js.Any.fromFunction0(value))
      
      @scala.inline
      def setThrowError(value: String => Spy): Self = StObject.set(x, "throwError", js.Any.fromFunction1(value))
    }
  }
}
