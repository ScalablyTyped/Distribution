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
import typings.jasmine.jasmine.CustomObjectFormatter
import typings.jasmine.jasmine.Env
import typings.jasmine.jasmine.Func
import typings.jasmine.jasmine.FunctionMatchers
import typings.jasmine.jasmine.HtmlReporter
import typings.jasmine.jasmine.HtmlSpecFilter
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    * Run some shared teardown once before all of the specs in the describe are run.
    * Note: Be careful, sharing the teardown from a afterAll makes it easy to accidentally leak state between your specs so that they erroneously pass or fail.
    * @param action Function that contains the code to teardown your specs.
    * @param timeout Custom timeout for an async afterAll
    */
  @scala.inline
  def afterAll(action: typings.jasmine.jasmine.ImplementationCallback): Unit = js.Dynamic.global.applyDynamic("afterAll")(action.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def afterAll(action: typings.jasmine.jasmine.ImplementationCallback, timeout: Double): Unit = (js.Dynamic.global.applyDynamic("afterAll")(action.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Run some shared teardown after each of the specs in the describe in which it is called.
    * @param action Function that contains the code to teardown your specs.
    * @param timeout Custom timeout for an async afterEach.
    */
  @scala.inline
  def afterEach(action: typings.jasmine.jasmine.ImplementationCallback): Unit = js.Dynamic.global.applyDynamic("afterEach")(action.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def afterEach(action: typings.jasmine.jasmine.ImplementationCallback, timeout: Double): Unit = (js.Dynamic.global.applyDynamic("afterEach")(action.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Run some shared setup once before all of the specs in the describe are run.
    * Note: Be careful, sharing the setup from a beforeAll makes it easy to accidentally leak state between your specs so that they erroneously pass or fail.
    * @param action Function that contains the code to setup your specs.
    * @param timeout Custom timeout for an async beforeAll.
    */
  @scala.inline
  def beforeAll(action: typings.jasmine.jasmine.ImplementationCallback): Unit = js.Dynamic.global.applyDynamic("beforeAll")(action.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def beforeAll(action: typings.jasmine.jasmine.ImplementationCallback, timeout: Double): Unit = (js.Dynamic.global.applyDynamic("beforeAll")(action.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Run some shared setup before each of the specs in the describe in which it is called.
    * @param action Function that contains the code to setup your specs.
    * @param timeout Custom timeout for an async beforeEach.
    */
  @scala.inline
  def beforeEach(action: typings.jasmine.jasmine.ImplementationCallback): Unit = js.Dynamic.global.applyDynamic("beforeEach")(action.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def beforeEach(action: typings.jasmine.jasmine.ImplementationCallback, timeout: Double): Unit = (js.Dynamic.global.applyDynamic("beforeEach")(action.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Create a group of specs (often called a suite).
    * @param description Textual description of the group
    * @param specDefinitions Function for Jasmine to invoke that will define inner suites a specs
    */
  @scala.inline
  def describe(description: String, specDefinitions: js.Function0[Unit]): Unit = (js.Dynamic.global.applyDynamic("describe")(description.asInstanceOf[js.Any], specDefinitions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Create an expectation for a spec.
    */
  @scala.inline
  def expect(): NothingMatcher = js.Dynamic.global.applyDynamic("expect")().asInstanceOf[NothingMatcher]
  /**
    * Create an expectation for a spec.
    * @checkReturnValue see https://tsetse.info/check-return-value
    * @param actual
    */
  @scala.inline
  def expect[T](actual: ArrayLike[T]): ArrayLikeMatchers[T] = js.Dynamic.global.applyDynamic("expect")(actual.asInstanceOf[js.Any]).asInstanceOf[ArrayLikeMatchers[T]]
  /**
    * Create an expectation for a spec.
    * @checkReturnValue see https://tsetse.info/check-return-value
    * @param spy
    */
  @scala.inline
  def expect[T /* <: Func */](spy: T): FunctionMatchers[T] = js.Dynamic.global.applyDynamic("expect")(spy.asInstanceOf[js.Any]).asInstanceOf[FunctionMatchers[T]]
  @scala.inline
  def expect[T /* <: Func */](spy: Spy[T]): FunctionMatchers[T] = js.Dynamic.global.applyDynamic("expect")(spy.asInstanceOf[js.Any]).asInstanceOf[FunctionMatchers[T]]
  
  /**
    * Create an asynchronous expectation for a spec. Note that the matchers
    * that are provided by an asynchronous expectation all return promises
    * which must be either returned from the spec or waited for using `await`
    * in order for Jasmine to associate them with the correct spec.
    * @checkReturnValue see https://tsetse.info/check-return-value
    * @param actual Actual computed value to test expectations against.
    */
  @scala.inline
  def expectAsync[T, U](actual: T): AsyncMatchers[T, U] = js.Dynamic.global.applyDynamic("expectAsync")(actual.asInstanceOf[js.Any]).asInstanceOf[AsyncMatchers[T, U]]
  @scala.inline
  def expectAsync[T, U](actual: js.Thenable[T]): AsyncMatchers[T, U] = js.Dynamic.global.applyDynamic("expectAsync")(actual.asInstanceOf[js.Any]).asInstanceOf[AsyncMatchers[T, U]]
  
  /**
    * Create an expectation for a spec.
    * @checkReturnValue see https://tsetse.info/check-return-value
    * @param actual Actual computed value to test expectations against.
    */
  @scala.inline
  def expect_T_Matchers[T](actual: T): Matchers[T] = js.Dynamic.global.applyDynamic("expect")(actual.asInstanceOf[js.Any]).asInstanceOf[Matchers[T]]
  
  /**
    * Explicitly mark a spec as failed.
    * @param e Reason for the failure
    */
  @scala.inline
  def fail(): Unit = js.Dynamic.global.applyDynamic("fail")().asInstanceOf[Unit]
  @scala.inline
  def fail(e: js.Any): Unit = js.Dynamic.global.applyDynamic("fail")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * A focused `describe`. If suites or specs are focused, only those that are focused will be executed.
    * @param description Textual description of the group
    * @param specDefinitions Function for Jasmine to invoke that will define inner suites a specs
    */
  @scala.inline
  def fdescribe(description: String, specDefinitions: js.Function0[Unit]): Unit = (js.Dynamic.global.applyDynamic("fdescribe")(description.asInstanceOf[js.Any], specDefinitions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * A focused `it`. If suites or specs are focused, only those that are focused will be executed.
    * @param expectation Textual description of what this spec is checking
    * @param assertion Function that contains the code of your test. If not provided the test will be pending.
    * @param timeout Custom timeout for an async spec.
    */
  @scala.inline
  def fit(expectation: String): Unit = js.Dynamic.global.applyDynamic("fit")(expectation.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def fit(expectation: String, assertion: Unit, timeout: Double): Unit = (js.Dynamic.global.applyDynamic("fit")(expectation.asInstanceOf[js.Any], assertion.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def fit(expectation: String, assertion: typings.jasmine.jasmine.ImplementationCallback): Unit = (js.Dynamic.global.applyDynamic("fit")(expectation.asInstanceOf[js.Any], assertion.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def fit(expectation: String, assertion: typings.jasmine.jasmine.ImplementationCallback, timeout: Double): Unit = (js.Dynamic.global.applyDynamic("fit")(expectation.asInstanceOf[js.Any], assertion.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Define a single spec. A spec should contain one or more expectations that test the state of the code.
    * A spec whose expectations all succeed will be passing and a spec with any failures will fail.
    * @param expectation Textual description of what this spec is checking
    * @param assertion Function that contains the code of your test. If not provided the test will be pending.
    * @param timeout Custom timeout for an async spec.
    */
  @scala.inline
  def it(expectation: String): Unit = js.Dynamic.global.applyDynamic("it")(expectation.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def it(expectation: String, assertion: Unit, timeout: Double): Unit = (js.Dynamic.global.applyDynamic("it")(expectation.asInstanceOf[js.Any], assertion.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def it(expectation: String, assertion: typings.jasmine.jasmine.ImplementationCallback): Unit = (js.Dynamic.global.applyDynamic("it")(expectation.asInstanceOf[js.Any], assertion.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def it(expectation: String, assertion: typings.jasmine.jasmine.ImplementationCallback, timeout: Double): Unit = (js.Dynamic.global.applyDynamic("it")(expectation.asInstanceOf[js.Any], assertion.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object jasmine {
    
    @JSGlobal("jasmine")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Default number of milliseconds Jasmine will wait for an asynchronous spec to complete.
      */
    @JSGlobal("jasmine.DEFAULT_TIMEOUT_INTERVAL")
    @js.native
    def DEFAULT_TIMEOUT_INTERVAL: Double = js.native
    @scala.inline
    def DEFAULT_TIMEOUT_INTERVAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_TIMEOUT_INTERVAL")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def DiffBuilder(): typings.jasmine.jasmine.DiffBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("DiffBuilder")().asInstanceOf[typings.jasmine.jasmine.DiffBuilder]
    
    @JSGlobal("jasmine.HtmlReporter")
    @js.native
    def HtmlReporter: typings.jasmine.jasmine.HtmlReporter = js.native
    @scala.inline
    def HtmlReporter_=(x: HtmlReporter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HtmlReporter")(x.asInstanceOf[js.Any])
    
    @JSGlobal("jasmine.HtmlSpecFilter")
    @js.native
    def HtmlSpecFilter: typings.jasmine.jasmine.HtmlSpecFilter = js.native
    @scala.inline
    def HtmlSpecFilter_=(x: HtmlSpecFilter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HtmlSpecFilter")(x.asInstanceOf[js.Any])
    
    /**
      * Maximum number of array elements to display when pretty printing objects.
      * This will also limit the number of keys and values displayed for an object.
      * Elements past this number will be ellipised.
      */
    @JSGlobal("jasmine.MAX_PRETTY_PRINT_ARRAY_LENGTH")
    @js.native
    def MAX_PRETTY_PRINT_ARRAY_LENGTH: Double = js.native
    @scala.inline
    def MAX_PRETTY_PRINT_ARRAY_LENGTH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_PRETTY_PRINT_ARRAY_LENGTH")(x.asInstanceOf[js.Any])
    
    /**
      * Maximum number of charasters to display when pretty printing objects.
      * Characters past this number will be ellipised.
      */
    @JSGlobal("jasmine.MAX_PRETTY_PRINT_CHARS")
    @js.native
    def MAX_PRETTY_PRINT_CHARS: Double = js.native
    @scala.inline
    def MAX_PRETTY_PRINT_CHARS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_PRETTY_PRINT_CHARS")(x.asInstanceOf[js.Any])
    
    /**
      * Maximum object depth the pretty printer will print to.
      * Set this to a lower value to speed up pretty printing if you have large objects.
      */
    @JSGlobal("jasmine.MAX_PRETTY_PRINT_DEPTH")
    @js.native
    def MAX_PRETTY_PRINT_DEPTH: Double = js.native
    @scala.inline
    def MAX_PRETTY_PRINT_DEPTH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_PRETTY_PRINT_DEPTH")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def addAsyncMatchers(matchers: CustomAsyncMatcherFactories): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addAsyncMatchers")(matchers.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def addCustomEqualityTester(equalityTester: CustomEqualityTester): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addCustomEqualityTester")(equalityTester.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Add a custom object formatter for the current scope of specs.
      * Note: This is only callable from within a beforeEach, it, or beforeAll.
      * @since 3.6.0
      * @see https://jasmine.github.io/tutorials/custom_object_formatters
      */
    @scala.inline
    def addCustomObjectFormatter(formatter: CustomObjectFormatter): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addCustomObjectFormatter")(formatter.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def addMatchers(matchers: CustomMatcherFactories): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMatchers")(matchers.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * That will succeed if the actual value being compared is an instance of the specified class/constructor.
      */
    @scala.inline
    def any(aclass: Constructor): AsymmetricMatcher[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("any")(aclass.asInstanceOf[js.Any]).asInstanceOf[AsymmetricMatcher[js.Any]]
    @scala.inline
    def any(aclass: Symbol): AsymmetricMatcher[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("any")(aclass.asInstanceOf[js.Any]).asInstanceOf[AsymmetricMatcher[js.Any]]
    
    /**
      * That will succeed if the actual value being compared is not `null` and not `undefined`.
      */
    @scala.inline
    def anything(): AsymmetricMatcher[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("anything")().asInstanceOf[AsymmetricMatcher[js.Any]]
    
    @scala.inline
    def arrayContaining[T](sample: typings.jasmine.jasmine.ArrayLike[T]): ArrayContaining[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayContaining")(sample.asInstanceOf[js.Any]).asInstanceOf[ArrayContaining[T]]
    
    @scala.inline
    def arrayWithExactContents[T](sample: typings.jasmine.jasmine.ArrayLike[T]): ArrayContaining[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayWithExactContents")(sample.asInstanceOf[js.Any]).asInstanceOf[ArrayContaining[T]]
    
    @scala.inline
    def clock(): Clock = ^.asInstanceOf[js.Dynamic].applyDynamic("clock")().asInstanceOf[Clock]
    
    @scala.inline
    def createSpy[Fn /* <: Func */](): Spy[Fn] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSpy")().asInstanceOf[Spy[Fn]]
    @scala.inline
    def createSpy[Fn /* <: Func */](name: String): Spy[Fn] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSpy")(name.asInstanceOf[js.Any]).asInstanceOf[Spy[Fn]]
    @scala.inline
    def createSpy[Fn /* <: Func */](name: String, originalFn: Fn): Spy[Fn] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSpy")(name.asInstanceOf[js.Any], originalFn.asInstanceOf[js.Any])).asInstanceOf[Spy[Fn]]
    @scala.inline
    def createSpy[Fn /* <: Func */](name: Unit, originalFn: Fn): Spy[Fn] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSpy")(name.asInstanceOf[js.Any], originalFn.asInstanceOf[js.Any])).asInstanceOf[Spy[Fn]]
    
    @scala.inline
    def createSpyObj(baseName: String, methodNames: SpyObjMethodNames[Unit]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createSpyObj")(baseName.asInstanceOf[js.Any], methodNames.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createSpyObj(baseName: String, methodNames: SpyObjMethodNames[Unit], propertyNames: SpyObjPropertyNames[Unit]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createSpyObj")(baseName.asInstanceOf[js.Any], methodNames.asInstanceOf[js.Any], propertyNames.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createSpyObj(methodNames: SpyObjMethodNames[Unit]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createSpyObj")(methodNames.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def createSpyObj(methodNames: SpyObjMethodNames[Unit], propertyNames: SpyObjPropertyNames[Unit]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createSpyObj")(methodNames.asInstanceOf[js.Any], propertyNames.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def createSpyObj_T_SpyObj[T](baseName: String, methodNames: SpyObjMethodNames[T]): SpyObj[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSpyObj")(baseName.asInstanceOf[js.Any], methodNames.asInstanceOf[js.Any])).asInstanceOf[SpyObj[T]]
    @scala.inline
    def createSpyObj_T_SpyObj[T](baseName: String, methodNames: SpyObjMethodNames[T], propertyNames: SpyObjPropertyNames[T]): SpyObj[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSpyObj")(baseName.asInstanceOf[js.Any], methodNames.asInstanceOf[js.Any], propertyNames.asInstanceOf[js.Any])).asInstanceOf[SpyObj[T]]
    @scala.inline
    def createSpyObj_T_SpyObj[T](methodNames: SpyObjMethodNames[T]): SpyObj[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSpyObj")(methodNames.asInstanceOf[js.Any]).asInstanceOf[SpyObj[T]]
    @scala.inline
    def createSpyObj_T_SpyObj[T](methodNames: SpyObjMethodNames[T], propertyNames: SpyObjPropertyNames[T]): SpyObj[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSpyObj")(methodNames.asInstanceOf[js.Any], propertyNames.asInstanceOf[js.Any])).asInstanceOf[SpyObj[T]]
    
    /**
      * That will succeed if the actual value being compared is empty.
      * @since 3.1.0
      */
    @scala.inline
    def empty(): AsymmetricMatcher[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[AsymmetricMatcher[js.Any]]
    
    object errors {
      
      @JSGlobal("jasmine.errors.ExpectationFailed")
      @js.native
      class ExpectationFailed ()
        extends StObject
           with typings.jasmine.jasmine.errors.ExpectationFailed {
        
        /* CompleteClass */
        var message: String = js.native
        
        /* CompleteClass */
        var name: String = js.native
      }
    }
    
    /**
      * That will succeed if the actual value being compared is  `null`, `undefined`, `0`, `false` or anything falsey.
      * @since 3.1.0
      */
    @scala.inline
    def falsy(): AsymmetricMatcher[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("falsy")().asInstanceOf[AsymmetricMatcher[js.Any]]
    
    @scala.inline
    def formatErrorMsg(domain: String, usage: String): js.Function1[/* msg */ String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatErrorMsg")(domain.asInstanceOf[js.Any], usage.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* msg */ String, String]]
    
    @scala.inline
    def getEnv(): Env = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnv")().asInstanceOf[Env]
    
    @JSGlobal("jasmine.matchersUtil")
    @js.native
    def matchersUtil: MatchersUtil = js.native
    @scala.inline
    def matchersUtil_=(x: MatchersUtil): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matchersUtil")(x.asInstanceOf[js.Any])
    
    /**
      * That will succeed if the actual value being compared is not empty.
      * @since 3.1.0
      */
    @scala.inline
    def notEmpty(): AsymmetricMatcher[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("notEmpty")().asInstanceOf[AsymmetricMatcher[js.Any]]
    
    @scala.inline
    def objectContaining[T](
      sample: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]:? jasmine.jasmine.ExpectedRecursive<T[K]>}
      */ objectContaining_ & TopLevel[T]
    ): ObjectContaining[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("objectContaining")(sample.asInstanceOf[js.Any]).asInstanceOf[ObjectContaining[T]]
    
    @scala.inline
    def pp(value: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pp")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def setDefaultSpyStrategy[Fn /* <: Func */](and: SpyAnd[Fn]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultSpyStrategy")(and.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def stringMatching(str: String): AsymmetricMatcher[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("stringMatching")(str.asInstanceOf[js.Any]).asInstanceOf[AsymmetricMatcher[String]]
    @scala.inline
    def stringMatching(str: RegExp): AsymmetricMatcher[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("stringMatching")(str.asInstanceOf[js.Any]).asInstanceOf[AsymmetricMatcher[String]]
    
    /**
      * That will succeed if the actual value being compared is `true` or anything truthy.
      * @since 3.1.0
      */
    @scala.inline
    def truthy(): AsymmetricMatcher[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("truthy")().asInstanceOf[AsymmetricMatcher[js.Any]]
  }
  
  /**
    * Mark a spec as pending, expectation results will be ignored.
    * If you call the function pending anywhere in the spec body, no matter the expectations, the spec will be marked pending.
    * @param reason Reason the spec is pending.
    */
  @scala.inline
  def pending(): Unit = js.Dynamic.global.applyDynamic("pending")().asInstanceOf[Unit]
  @scala.inline
  def pending(reason: String): Unit = js.Dynamic.global.applyDynamic("pending")(reason.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def runs(asyncMethod: js.Function): Unit = js.Dynamic.global.applyDynamic("runs")(asyncMethod.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Sets a user-defined property that will be provided to reporters as
    * part of the properties field of SpecResult.
    * @since 3.6.0
    */
  @scala.inline
  def setSpecProperty(key: String, value: js.Any): Unit = (js.Dynamic.global.applyDynamic("setSpecProperty")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets a user-defined property that will be provided to reporters as
    * part of the properties field of SuiteResult.
    * @since 3.6.0
    */
  @scala.inline
  def setSuiteProperty(key: String, value: js.Any): Unit = (js.Dynamic.global.applyDynamic("setSuiteProperty")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Install a spy onto an existing object.
    * @param object The object upon which to install the `Spy`.
    * @param method The name of the method to replace with a `Spy`.
    */
  @scala.inline
  def spyOn[T, K /* <: /* keyof T */ String */](`object`: T, method: K): Spy[
    (js.Function1[/* args */ js.Any, js.Any]) | (/* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any)
  ] = (js.Dynamic.global.applyDynamic("spyOn")(`object`.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Spy[
    (js.Function1[/* args */ js.Any, js.Any]) | (/* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any)
  ]]
  
  /**
    * Installs spies on all writable and configurable properties of an object.
    * @param object The object upon which to install the `Spy`s.
    */
  @scala.inline
  def spyOnAllFunctions[T](`object`: T): SpyObj[T] = js.Dynamic.global.applyDynamic("spyOnAllFunctions")(`object`.asInstanceOf[js.Any]).asInstanceOf[SpyObj[T]]
  
  /**
    * Install a spy on a property installed with `Object.defineProperty` onto an existing object.
    * @param object The object upon which to install the `Spy`.
    * @param property The name of the property to replace with a `Spy`.
    * @param accessType The access type (get|set) of the property to `Spy` on.
    */
  @scala.inline
  def spyOnProperty[T](`object`: T, property: /* keyof T */ String): Spy[Func] = (js.Dynamic.global.applyDynamic("spyOnProperty")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Spy[Func]]
  
  @scala.inline
  def spyOnProperty_get[T](`object`: T, property: /* keyof T */ String, accessType: get): Spy[Func] = (js.Dynamic.global.applyDynamic("spyOnProperty")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any], accessType.asInstanceOf[js.Any])).asInstanceOf[Spy[Func]]
  
  @scala.inline
  def spyOnProperty_set[T](`object`: T, property: /* keyof T */ String, accessType: set): Spy[Func] = (js.Dynamic.global.applyDynamic("spyOnProperty")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any], accessType.asInstanceOf[js.Any])).asInstanceOf[Spy[Func]]
  
  @scala.inline
  def waits(): Unit = js.Dynamic.global.applyDynamic("waits")().asInstanceOf[Unit]
  @scala.inline
  def waits(timeout: Double): Unit = js.Dynamic.global.applyDynamic("waits")(timeout.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def waitsFor(latchMethod: js.Function0[Boolean]): Unit = js.Dynamic.global.applyDynamic("waitsFor")(latchMethod.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def waitsFor(latchMethod: js.Function0[Boolean], failureMessage: String): Unit = (js.Dynamic.global.applyDynamic("waitsFor")(latchMethod.asInstanceOf[js.Any], failureMessage.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def waitsFor(latchMethod: js.Function0[Boolean], failureMessage: String, timeout: Double): Unit = (js.Dynamic.global.applyDynamic("waitsFor")(latchMethod.asInstanceOf[js.Any], failureMessage.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def waitsFor(latchMethod: js.Function0[Boolean], failureMessage: Unit, timeout: Double): Unit = (js.Dynamic.global.applyDynamic("waitsFor")(latchMethod.asInstanceOf[js.Any], failureMessage.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * A temporarily disabled `describe`. Specs within an xdescribe will be marked pending and not executed.
    * @param description Textual description of the group
    * @param specDefinitions Function for Jasmine to invoke that will define inner suites a specs
    */
  @scala.inline
  def xdescribe(description: String, specDefinitions: js.Function0[Unit]): Unit = (js.Dynamic.global.applyDynamic("xdescribe")(description.asInstanceOf[js.Any], specDefinitions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * A temporarily disabled `it`. The spec will report as pending and will not be executed.
    * @param expectation Textual description of what this spec is checking
    * @param assertion Function that contains the code of your test. If not provided the test will be pending.
    * @param timeout Custom timeout for an async spec.
    */
  @scala.inline
  def xit(expectation: String): Unit = js.Dynamic.global.applyDynamic("xit")(expectation.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def xit(expectation: String, assertion: Unit, timeout: Double): Unit = (js.Dynamic.global.applyDynamic("xit")(expectation.asInstanceOf[js.Any], assertion.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def xit(expectation: String, assertion: typings.jasmine.jasmine.ImplementationCallback): Unit = (js.Dynamic.global.applyDynamic("xit")(expectation.asInstanceOf[js.Any], assertion.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def xit(expectation: String, assertion: typings.jasmine.jasmine.ImplementationCallback, timeout: Double): Unit = (js.Dynamic.global.applyDynamic("xit")(expectation.asInstanceOf[js.Any], assertion.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
