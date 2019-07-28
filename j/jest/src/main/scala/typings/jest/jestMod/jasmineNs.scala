package typings.jest.jestMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.jest.Anon_Args
import typings.jest.jestMod.jasmineNs.Any
import typings.jest.jestMod.jasmineNs.ArrayContaining
import typings.jest.jestMod.jasmineNs.ArrayLike
import typings.jest.jestMod.jasmineNs.CallInfo
import typings.jest.jestMod.jasmineNs.Calls
import typings.jest.jestMod.jasmineNs.Clock
import typings.jest.jestMod.jasmineNs.CustomEqualityTester
import typings.jest.jestMod.jasmineNs.CustomMatcher
import typings.jest.jestMod.jasmineNs.CustomMatcherFactories
import typings.jest.jestMod.jasmineNs.CustomMatcherFactory
import typings.jest.jestMod.jasmineNs.CustomMatcherResult
import typings.jest.jestMod.jasmineNs.MatchersUtil
import typings.jest.jestMod.jasmineNs.ObjectContaining
import typings.jest.jestMod.jasmineNs.Spy
import typings.jest.jestMod.jasmineNs.SpyAnd
import typings.std.Date
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest", "jasmine")
@js.native
object jasmineNs extends js.Object {
  @js.native
  trait Any
    extends Instantiable1[/* expectedClass */ js.Any, js.Any] {
    def jasmineMatches(other: js.Any): Boolean = js.native
    def jasmineToString(): String = js.native
  }
  
  @js.native
  trait ArrayContaining
    extends Instantiable1[/* sample */ js.Array[js.Any], js.Any] {
    def asymmetricMatch(other: js.Any): Boolean = js.native
    def jasmineToString(): String = js.native
  }
  
  trait ArrayLike[T] extends /* n */ NumberDictionary[T] {
    var length: Double
  }
  
  trait CallInfo extends js.Object {
    /**
      * All arguments passed to the call
      */
    var args: js.Array[_]
    /**
      * The context (the this) for the call
      */
    var `object`: js.Any
    /**
      * The return value of the call
      */
    var returnValue: js.Any
  }
  
  trait Calls extends js.Object {
    /**
      * By chaining the spy with calls.all(), will return the
      * context (the this) and arguments passed all calls
      */
    def all(): js.Array[CallInfo]
    /**
      * By chaining the spy with calls.allArgs(),
      * will return the arguments to all calls
      */
    def allArgs(): js.Array[_]
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
    def argsFor(index: Double): js.Array[_]
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
  
  @js.native
  trait Clock extends js.Object {
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
  
  @js.native
  trait CustomMatcher extends js.Object {
    def compare(actual: js.Any, expected: js.Any*): CustomMatcherResult = js.native
    def compare[T](actual: T, expected: T, args: js.Any*): CustomMatcherResult = js.native
  }
  
  trait CustomMatcherResult extends js.Object {
    var message: String | js.Function0[String]
    var pass: Boolean
  }
  
  @js.native
  trait MatchersUtil extends js.Object {
    def buildFailureMessage(matcherName: String, isNot: Boolean, actual: js.Any, expected: js.Any*): String = js.native
    def contains[T](haystack: String, needle: js.Any): Boolean = js.native
    def contains[T](haystack: String, needle: js.Any, customTesters: js.Array[CustomEqualityTester]): Boolean = js.native
    def contains[T](haystack: ArrayLike[T], needle: js.Any): Boolean = js.native
    def contains[T](haystack: ArrayLike[T], needle: js.Any, customTesters: js.Array[CustomEqualityTester]): Boolean = js.native
    def equals(a: js.Any, b: js.Any): Boolean = js.native
    def equals(a: js.Any, b: js.Any, customTesters: js.Array[CustomEqualityTester]): Boolean = js.native
  }
  
  @js.native
  trait ObjectContaining
    extends Instantiable1[/* sample */ js.Any, js.Any] {
    def jasmineMatches(other: js.Any, mismatchKeys: js.Array[_], mismatchValues: js.Array[_]): Boolean = js.native
    def jasmineToString(): String = js.native
  }
  
  @js.native
  trait Spy extends js.Object {
    var and: SpyAnd = js.native
    var argsForCall: js.Array[_] = js.native
    var calls: Calls = js.native
    var identity: String = js.native
    var mostRecentCall: Anon_Args = js.native
    var wasCalled: Boolean = js.native
    def apply(params: js.Any*): js.Any = js.native
  }
  
  trait SpyAnd extends js.Object {
    /**
      * By chaining the spy with and.callFake, all calls to the spy
      * will delegate to the supplied function.
      */
    def callFake(fn: js.Function1[/* repeated */ js.Any, _]): Spy
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
  
  var DEFAULT_TIMEOUT_INTERVAL: Double = js.native
  def addCustomEqualityTester(equalityTester: CustomEqualityTester): Unit = js.native
  def addMatchers(matchers: CustomMatcherFactories): Unit = js.native
  def any(aclass: js.Any): Any = js.native
  def anything(): Any = js.native
  def arrayContaining(sample: js.Array[_]): ArrayContaining = js.native
  def clock(): Clock = js.native
  def createSpy(): Spy = js.native
  def createSpy(name: String): Spy = js.native
  def createSpy(name: String, originalFn: js.Function1[/* repeated */ js.Any, _]): Spy = js.native
  def createSpyObj(baseName: String, methodNames: js.Array[_]): js.Any = js.native
  @JSName("createSpyObj")
  def createSpyObj_T_T[T](baseName: String, methodNames: js.Array[_]): T = js.native
  def objectContaining(sample: js.Any): ObjectContaining = js.native
  def pp(value: js.Any): String = js.native
  def stringMatching(value: String): Any = js.native
  def stringMatching(value: RegExp): Any = js.native
  type CustomEqualityTester = js.Function2[/* first */ js.Any, /* second */ js.Any, Boolean]
  type CustomMatcherFactories = StringDictionary[CustomMatcherFactory]
  type CustomMatcherFactory = js.Function2[
    /* util */ MatchersUtil, 
    /* customEqualityTesters */ js.Array[CustomEqualityTester], 
    CustomMatcher
  ]
}

