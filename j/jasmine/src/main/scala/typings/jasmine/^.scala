package typings.jasmine

import typings.jasmine.jasmineNs.ArrayLikeMatchers
import typings.jasmine.jasmineNs.AsyncMatchers
import typings.jasmine.jasmineNs.Matchers
import typings.jasmine.jasmineNs.NothingMatcher
import typings.jasmine.jasmineNs.Spy
import typings.jasmine.jasmineNs.SpyObj
import typings.jasmine.jasmineStrings.get
import typings.jasmine.jasmineStrings.set
import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  /**
    * Run some shared teardown once before all of the specs in the describe are run.
    * Note: Be careful, sharing the teardown from a afterAll makes it easy to accidentally leak state between your specs so that they erroneously pass or fail.
    * @param action Function that contains the code to teardown your specs.
    * @param timeout Custom timeout for an async afterAll
    */
  def afterAll(action: typings.jasmine.jasmineNs.ImplementationCallback): Unit = js.native
  def afterAll(action: typings.jasmine.jasmineNs.ImplementationCallback, timeout: Double): Unit = js.native
  /**
    * Run some shared teardown after each of the specs in the describe in which it is called.
    * @param action Function that contains the code to teardown your specs.
    * @param timeout Custom timeout for an async afterEach.
    */
  def afterEach(action: typings.jasmine.jasmineNs.ImplementationCallback): Unit = js.native
  def afterEach(action: typings.jasmine.jasmineNs.ImplementationCallback, timeout: Double): Unit = js.native
  /**
    * Run some shared setup once before all of the specs in the describe are run.
    * Note: Be careful, sharing the setup from a beforeAll makes it easy to accidentally leak state between your specs so that they erroneously pass or fail.
    * @param action Function that contains the code to setup your specs.
    * @param timeout Custom timeout for an async beforeAll.
    */
  def beforeAll(action: typings.jasmine.jasmineNs.ImplementationCallback): Unit = js.native
  def beforeAll(action: typings.jasmine.jasmineNs.ImplementationCallback, timeout: Double): Unit = js.native
  /**
    * Run some shared setup before each of the specs in the describe in which it is called.
    * @param action Function that contains the code to setup your specs.
    * @param timeout Custom timeout for an async beforeEach.
    */
  def beforeEach(action: typings.jasmine.jasmineNs.ImplementationCallback): Unit = js.native
  def beforeEach(action: typings.jasmine.jasmineNs.ImplementationCallback, timeout: Double): Unit = js.native
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
  def fit(expectation: String, assertion: typings.jasmine.jasmineNs.ImplementationCallback): Unit = js.native
  def fit(expectation: String, assertion: typings.jasmine.jasmineNs.ImplementationCallback, timeout: Double): Unit = js.native
  /**
    * Define a single spec. A spec should contain one or more expectations that test the state of the code.
    * A spec whose expectations all succeed will be passing and a spec with any failures will fail.
    * @param expectation Textual description of what this spec is checking
    * @param assertion Function that contains the code of your test. If not provided the test will be pending.
    * @param timeout Custom timeout for an async spec.
    */
  def it(expectation: String): Unit = js.native
  def it(expectation: String, assertion: typings.jasmine.jasmineNs.ImplementationCallback): Unit = js.native
  def it(expectation: String, assertion: typings.jasmine.jasmineNs.ImplementationCallback, timeout: Double): Unit = js.native
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
  def spyOn[T](`object`: T, method: String): Spy = js.native
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
  def spyOnProperty[T](`object`: T, property: String): Spy = js.native
  @JSName("spyOnProperty")
  def spyOnProperty_get[T](`object`: T, property: String, accessType: get): Spy = js.native
  @JSName("spyOnProperty")
  def spyOnProperty_set[T](`object`: T, property: String, accessType: set): Spy = js.native
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
  def xit(expectation: String, assertion: typings.jasmine.jasmineNs.ImplementationCallback): Unit = js.native
  def xit(expectation: String, assertion: typings.jasmine.jasmineNs.ImplementationCallback, timeout: Double): Unit = js.native
}

