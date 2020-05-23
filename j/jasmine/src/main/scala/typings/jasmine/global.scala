package typings.jasmine

import org.scalablytyped.runtime.TopLevel
import typings.jasmine.jasmine.ArrayContaining
import typings.jasmine.jasmine.ArrayLikeMatchers
import typings.jasmine.jasmine.AsymmetricMatcher
import typings.jasmine.jasmine.AsyncMatchers
import typings.jasmine.jasmine.Clock
import typings.jasmine.jasmine.Constructor
import typings.jasmine.jasmine.CustomAsyncMatcherFactories
import typings.jasmine.jasmine.CustomEqualityTester
import typings.jasmine.jasmine.CustomMatcherFactories
import typings.jasmine.jasmine.Env
import typings.jasmine.jasmine.Matchers
import typings.jasmine.jasmine.MatchersUtil
import typings.jasmine.jasmine.NothingMatcher
import typings.jasmine.jasmine.ObjectContaining
import typings.jasmine.jasmine.Spy
import typings.jasmine.jasmine.SpyAnd
import typings.jasmine.jasmine.SpyObj
import typings.jasmine.jasmine.SpyObjMethodNames
import typings.jasmine.jasmine.SpyObjPropertyNames
import typings.jasmine.jasmineStrings.get
import typings.jasmine.jasmineStrings.objectContaining_
import typings.jasmine.jasmineStrings.set
import typings.std.ArrayLike
import typings.std.RegExp
import typings.std.Symbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  /**
    * Run some shared teardown once before all of the specs in the describe are run.
    * Note: Be careful, sharing the teardown from a afterAll makes it easy to accidentally leak state between your specs so that they erroneously pass or fail.
    * @param action Function that contains the code to teardown your specs.
    * @param timeout Custom timeout for an async afterAll
    */
  def afterAll(action: typings.jasmine.jasmine.ImplementationCallback): Unit = js.native
  def afterAll(action: typings.jasmine.jasmine.ImplementationCallback, timeout: Double): Unit = js.native
  /**
    * Run some shared teardown after each of the specs in the describe in which it is called.
    * @param action Function that contains the code to teardown your specs.
    * @param timeout Custom timeout for an async afterEach.
    */
  def afterEach(action: typings.jasmine.jasmine.ImplementationCallback): Unit = js.native
  def afterEach(action: typings.jasmine.jasmine.ImplementationCallback, timeout: Double): Unit = js.native
  /**
    * Run some shared setup once before all of the specs in the describe are run.
    * Note: Be careful, sharing the setup from a beforeAll makes it easy to accidentally leak state between your specs so that they erroneously pass or fail.
    * @param action Function that contains the code to setup your specs.
    * @param timeout Custom timeout for an async beforeAll.
    */
  def beforeAll(action: typings.jasmine.jasmine.ImplementationCallback): Unit = js.native
  def beforeAll(action: typings.jasmine.jasmine.ImplementationCallback, timeout: Double): Unit = js.native
  /**
    * Run some shared setup before each of the specs in the describe in which it is called.
    * @param action Function that contains the code to setup your specs.
    * @param timeout Custom timeout for an async beforeEach.
    */
  def beforeEach(action: typings.jasmine.jasmine.ImplementationCallback): Unit = js.native
  def beforeEach(action: typings.jasmine.jasmine.ImplementationCallback, timeout: Double): Unit = js.native
  /**
    * Create a group of specs (often called a suite).
    * @param description Textual description of the group
    * @param specDefinitions Function for Jasmine to invoke that will define inner suites a specs
    */
  def describe(description: String, specDefinitions: js.Function0[Unit]): Unit = js.native
  /**
    * Create an expectation for a spec.
    */
  def expect(): NothingMatcher = js.native
  /**
    * Create an expectation for a spec.
    * @checkReturnValue see https://tsetse.info/check-return-value
    * @param spy
    */
  def expect(spy: js.Function): Matchers[_] = js.native
  /**
    * Create an expectation for a spec.
    * @checkReturnValue see https://tsetse.info/check-return-value
    * @param actual Actual computed value to test expectations against.
    */
  def expect[T](actual: T): Matchers[T] = js.native
  /**
    * Create an expectation for a spec.
    * @checkReturnValue see https://tsetse.info/check-return-value
    * @param actual
    */
  def expect[T](actual: ArrayLike[T]): ArrayLikeMatchers[T] = js.native
  /**
    * Create an asynchronous expectation for a spec. Note that the matchers
    * that are provided by an asynchronous expectation all return promises
    * which must be either returned from the spec or waited for using `await`
    * in order for Jasmine to associate them with the correct spec.
    * @checkReturnValue see https://tsetse.info/check-return-value
    * @param actual - Actual computed value to test expectations against.
    */
  def expectAsync[T, U](actual: T): AsyncMatchers[T, U] = js.native
  def expectAsync[T, U](actual: js.Thenable[T]): AsyncMatchers[T, U] = js.native
  /**
    * Explicitly mark a spec as failed.
    * @param e Reason for the failure
    */
  def fail(): Unit = js.native
  def fail(e: js.Any): Unit = js.native
  /**
    * A focused `describe`. If suites or specs are focused, only those that are focused will be executed.
    * @param description Textual description of the group
    * @param specDefinitions Function for Jasmine to invoke that will define inner suites a specs
    */
  def fdescribe(description: String, specDefinitions: js.Function0[Unit]): Unit = js.native
  /**
    * A focused `it`. If suites or specs are focused, only those that are focused will be executed.
    * @param expectation Textual description of what this spec is checking
    * @param assertion Function that contains the code of your test. If not provided the test will be pending.
    * @param timeout Custom timeout for an async spec.
    */
  def fit(expectation: String): Unit = js.native
  def fit(expectation: String, assertion: typings.jasmine.jasmine.ImplementationCallback): Unit = js.native
  def fit(expectation: String, assertion: typings.jasmine.jasmine.ImplementationCallback, timeout: Double): Unit = js.native
  /**
    * Define a single spec. A spec should contain one or more expectations that test the state of the code.
    * A spec whose expectations all succeed will be passing and a spec with any failures will fail.
    * @param expectation Textual description of what this spec is checking
    * @param assertion Function that contains the code of your test. If not provided the test will be pending.
    * @param timeout Custom timeout for an async spec.
    */
  def it(expectation: String): Unit = js.native
  def it(expectation: String, assertion: typings.jasmine.jasmine.ImplementationCallback): Unit = js.native
  def it(expectation: String, assertion: typings.jasmine.jasmine.ImplementationCallback, timeout: Double): Unit = js.native
  /**
    * Mark a spec as pending, expectation results will be ignored.
    * If you call the function pending anywhere in the spec body, no matter the expectations, the spec will be marked pending.
    * @param reason Reason the spec is pending.
    */
  def pending(): Unit = js.native
  def pending(reason: String): Unit = js.native
  def runs(asyncMethod: js.Function): Unit = js.native
  /**
    * Install a spy onto an existing object.
    * @param object The object upon which to install the `Spy`.
    * @param method The name of the method to replace with a `Spy`.
    */
  def spyOn[T](`object`: T, method: /* keyof T */ String): Spy = js.native
  /**
    * Installs spies on all writable and configurable properties of an object.
    * @param object The object upon which to install the `Spy`s.
    */
  def spyOnAllFunctions[T](`object`: T): SpyObj[T] = js.native
  /**
    * Install a spy on a property installed with `Object.defineProperty` onto an existing object.
    * @param object The object upon which to install the `Spy`.
    * @param property The name of the property to replace with a `Spy`.
    * @param accessType The access type (get|set) of the property to `Spy` on.
    */
  def spyOnProperty[T](`object`: T, property: /* keyof T */ String): Spy = js.native
  @JSName("spyOnProperty")
  def spyOnProperty_get[T](`object`: T, property: /* keyof T */ String, accessType: get): Spy = js.native
  @JSName("spyOnProperty")
  def spyOnProperty_set[T](`object`: T, property: /* keyof T */ String, accessType: set): Spy = js.native
  def waits(): Unit = js.native
  def waits(timeout: Double): Unit = js.native
  def waitsFor(latchMethod: js.Function0[Boolean]): Unit = js.native
  def waitsFor(latchMethod: js.Function0[Boolean], failureMessage: String): Unit = js.native
  def waitsFor(latchMethod: js.Function0[Boolean], failureMessage: String, timeout: Double): Unit = js.native
  /**
    * A temporarily disabled `describe`. Specs within an xdescribe will be marked pending and not executed.
    * @param description Textual description of the group
    * @param specDefinitions Function for Jasmine to invoke that will define inner suites a specs
    */
  def xdescribe(description: String, specDefinitions: js.Function0[Unit]): Unit = js.native
  /**
    * A temporarily disabled `it`. The spec will report as pending and will not be executed.
    * @param expectation Textual description of what this spec is checking
    * @param assertion Function that contains the code of your test. If not provided the test will be pending.
    * @param timeout Custom timeout for an async spec.
    */
  def xit(expectation: String): Unit = js.native
  def xit(expectation: String, assertion: typings.jasmine.jasmine.ImplementationCallback): Unit = js.native
  def xit(expectation: String, assertion: typings.jasmine.jasmine.ImplementationCallback, timeout: Double): Unit = js.native
  @js.native
  object jasmine extends js.Object {
    /**
      * Default number of milliseconds Jasmine will wait for an asynchronous spec to complete.
      */
    var DEFAULT_TIMEOUT_INTERVAL: Double = js.native
    var HtmlReporter: typings.jasmine.jasmine.HtmlReporter = js.native
    var HtmlSpecFilter: typings.jasmine.jasmine.HtmlSpecFilter = js.native
    /**
      * Maximum number of array elements to display when pretty printing objects.
      * This will also limit the number of keys and values displayed for an object.
      * Elements past this number will be ellipised.
      */
    var MAX_PRETTY_PRINT_ARRAY_LENGTH: Double = js.native
    /**
      * Maximum number of charasters to display when pretty printing objects.
      * Characters past this number will be ellipised.
      */
    var MAX_PRETTY_PRINT_CHARS: Double = js.native
    /**
      * Maximum object depth the pretty printer will print to.
      * Set this to a lower value to speed up pretty printing if you have large objects.
      */
    var MAX_PRETTY_PRINT_DEPTH: Double = js.native
    var matchersUtil: MatchersUtil = js.native
    def addAsyncMatchers(matchers: CustomAsyncMatcherFactories): Unit = js.native
    def addCustomEqualityTester(equalityTester: CustomEqualityTester): Unit = js.native
    def addMatchers(matchers: CustomMatcherFactories): Unit = js.native
    /**
      * That will succeed if the actual value being compared is an instance of the specified class/constructor.
      */
    def any(aclass: Constructor): AsymmetricMatcher[_] = js.native
    def any(aclass: Symbol): AsymmetricMatcher[_] = js.native
    /**
      * That will succeed if the actual value being compared is not `null` and not `undefined`.
      */
    def anything(): AsymmetricMatcher[_] = js.native
    def arrayContaining[T](sample: typings.jasmine.jasmine.ArrayLike[T]): ArrayContaining[T] = js.native
    def arrayWithExactContents[T](sample: typings.jasmine.jasmine.ArrayLike[T]): ArrayContaining[T] = js.native
    def clock(): Clock = js.native
    def createSpy(): Spy = js.native
    def createSpy(name: String): Spy = js.native
    def createSpy(name: String, originalFn: js.Function): Spy = js.native
    def createSpyObj(baseName: String, methodNames: SpyObjMethodNames[js.UndefOr[scala.Nothing]]): js.Any = js.native
    def createSpyObj(
      baseName: String,
      methodNames: SpyObjMethodNames[js.UndefOr[scala.Nothing]],
      propertyNames: SpyObjPropertyNames[js.UndefOr[scala.Nothing]]
    ): js.Any = js.native
    def createSpyObj(methodNames: SpyObjMethodNames[js.UndefOr[scala.Nothing]]): js.Any = js.native
    def createSpyObj(
      methodNames: SpyObjMethodNames[js.UndefOr[scala.Nothing]],
      propertyNames: SpyObjPropertyNames[js.UndefOr[scala.Nothing]]
    ): js.Any = js.native
    @JSName("createSpyObj")
    def createSpyObj_T_SpyObj[T](baseName: String, methodNames: SpyObjMethodNames[T]): SpyObj[T] = js.native
    @JSName("createSpyObj")
    def createSpyObj_T_SpyObj[T](baseName: String, methodNames: SpyObjMethodNames[T], propertyNames: SpyObjPropertyNames[T]): SpyObj[T] = js.native
    @JSName("createSpyObj")
    def createSpyObj_T_SpyObj[T](methodNames: SpyObjMethodNames[T]): SpyObj[T] = js.native
    @JSName("createSpyObj")
    def createSpyObj_T_SpyObj[T](methodNames: SpyObjMethodNames[T], propertyNames: SpyObjPropertyNames[T]): SpyObj[T] = js.native
    /**
      * That will succeed if the actual value being compared is empty.
      * @since 3.1.0
      */
    def empty(): AsymmetricMatcher[_] = js.native
    /**
      * That will succeed if the actual value being compared is  `null`, `undefined`, `0`, `false` or anything falsey.
      * @since 3.1.0
      */
    def falsy(): AsymmetricMatcher[_] = js.native
    def formatErrorMsg(domain: String, usage: String): js.Function1[/* msg */ String, String] = js.native
    def getEnv(): Env = js.native
    /**
      * That will succeed if the actual value being compared is not empty.
      * @since 3.1.0
      */
    def notEmpty(): AsymmetricMatcher[_] = js.native
    def objectContaining[T](
      sample: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]:? jasmine.jasmine.ExpectedRecursive<T[K]>}
      */ objectContaining_ with TopLevel[T]
    ): ObjectContaining[T] = js.native
    def pp(value: js.Any): String = js.native
    def setDefaultSpyStrategy(and: SpyAnd): Unit = js.native
    def stringMatching(str: String): AsymmetricMatcher[String] = js.native
    def stringMatching(str: RegExp): AsymmetricMatcher[String] = js.native
    /**
      * That will succeed if the actual value being compared is `true` or anything truthy.
      * @since 3.1.0
      */
    def truthy(): AsymmetricMatcher[_] = js.native
    @js.native
    object errors extends js.Object {
      @js.native
      class ExpectationFailed ()
        extends typings.jasmine.jasmine.errors.ExpectationFailed {
        /* CompleteClass */
        override var message: String = js.native
        /* CompleteClass */
        override var name: String = js.native
      }
      
    }
    
  }
  
}

