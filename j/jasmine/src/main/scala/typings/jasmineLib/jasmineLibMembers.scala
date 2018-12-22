package typings
package jasmineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object jasmineLibMembers extends js.Object {
  /**
   * Run some shared teardown once before all of the specs in the describe are run.
   * Note: Be careful, sharing the teardown from a afterAll makes it easy to accidentally leak state between your specs so that they erroneously pass or fail.
   * @param action Function that contains the code to teardown your specs.
   * @param timeout Custom timeout for an async afterAll
   */
  def afterAll(action: js.Function1[/* done */ DoneFn, scala.Unit]): scala.Unit = js.native
  /**
   * Run some shared teardown once before all of the specs in the describe are run.
   * Note: Be careful, sharing the teardown from a afterAll makes it easy to accidentally leak state between your specs so that they erroneously pass or fail.
   * @param action Function that contains the code to teardown your specs.
   * @param timeout Custom timeout for an async afterAll
   */
  def afterAll(action: js.Function1[/* done */ DoneFn, scala.Unit], timeout: scala.Double): scala.Unit = js.native
  /**
   * Run some shared teardown after each of the specs in the describe in which it is called.
   * @param action Function that contains the code to teardown your specs.
   * @param timeout Custom timeout for an async afterEach.
   */
  def afterEach(action: js.Function1[/* done */ DoneFn, scala.Unit]): scala.Unit = js.native
  /**
   * Run some shared teardown after each of the specs in the describe in which it is called.
   * @param action Function that contains the code to teardown your specs.
   * @param timeout Custom timeout for an async afterEach.
   */
  def afterEach(action: js.Function1[/* done */ DoneFn, scala.Unit], timeout: scala.Double): scala.Unit = js.native
  /**
   * Run some shared setup once before all of the specs in the describe are run.
   * Note: Be careful, sharing the setup from a beforeAll makes it easy to accidentally leak state between your specs so that they erroneously pass or fail.
   * @param action Function that contains the code to setup your specs.
   * @param timeout Custom timeout for an async beforeAll.
   */
  def beforeAll(action: js.Function1[/* done */ DoneFn, scala.Unit]): scala.Unit = js.native
  /**
   * Run some shared setup once before all of the specs in the describe are run.
   * Note: Be careful, sharing the setup from a beforeAll makes it easy to accidentally leak state between your specs so that they erroneously pass or fail.
   * @param action Function that contains the code to setup your specs.
   * @param timeout Custom timeout for an async beforeAll.
   */
  def beforeAll(action: js.Function1[/* done */ DoneFn, scala.Unit], timeout: scala.Double): scala.Unit = js.native
  /**
   * Run some shared setup before each of the specs in the describe in which it is called.
   * @param action Function that contains the code to setup your specs.
   * @param timeout Custom timeout for an async beforeEach.
   */
  def beforeEach(action: js.Function1[/* done */ DoneFn, scala.Unit]): scala.Unit = js.native
  /**
   * Run some shared setup before each of the specs in the describe in which it is called.
   * @param action Function that contains the code to setup your specs.
   * @param timeout Custom timeout for an async beforeEach.
   */
  def beforeEach(action: js.Function1[/* done */ DoneFn, scala.Unit], timeout: scala.Double): scala.Unit = js.native
  def describe(description: java.lang.String, specDefinitions: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
   * Create an expectation for a spec.
   */
  def expect(): jasmineLib.jasmineNs.NothingMatcher = js.native
  /**
   * Create an expectation for a spec.
   * @checkReturnValue see https://tsetse.info/check-return-value
   * @param spy
   */
  def expect(spy: js.Function): jasmineLib.jasmineNs.Matchers[_] = js.native
  /**
   * Create an expectation for a spec.
   * @checkReturnValue see https://tsetse.info/check-return-value
   * @param actual Actual computed value to test expectations against.
   */
  def expect[T](actual: T): jasmineLib.jasmineNs.Matchers[T] = js.native
  /**
   * Create an expectation for a spec.
   * @checkReturnValue see https://tsetse.info/check-return-value
   * @param actual
   */
  def expect[T](actual: stdLib.ArrayLike[T]): jasmineLib.jasmineNs.ArrayLikeMatchers[T] = js.native
  /**
   * Create an asynchronous expectation for a spec. Note that the matchers
   * that are provided by an asynchronous expectation all return promises
   * which must be either returned from the spec or waited for using `await`
   * in order for Jasmine to associate them with the correct spec.
   * @checkReturnValue see https://tsetse.info/check-return-value
   * @param actual - Actual computed value to test expectations against.
   */
  def expectAsync[T, U](actual: js.Promise[T]): jasmineLib.jasmineNs.AsyncMatchers[T, U] = js.native
  /**
   * Explicitly mark a spec as failed.
   * @param e
   */
  def fail(): scala.Unit = js.native
  /**
   * Explicitly mark a spec as failed.
   * @param e
   */
  def fail(e: js.Any): scala.Unit = js.native
  def fdescribe(description: java.lang.String, specDefinitions: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
   * A focused it
   * If suites or specs are focused, only those that are focused will be executed.
   * @param expectation
   * @param assertion
   * @param timeout
   */
  def fit(expectation: java.lang.String): scala.Unit = js.native
  /**
   * A focused it
   * If suites or specs are focused, only those that are focused will be executed.
   * @param expectation
   * @param assertion
   * @param timeout
   */
  def fit(expectation: java.lang.String, assertion: js.Function1[/* done */ DoneFn, scala.Unit]): scala.Unit = js.native
  /**
   * A focused it
   * If suites or specs are focused, only those that are focused will be executed.
   * @param expectation
   * @param assertion
   * @param timeout
   */
  def fit(
    expectation: java.lang.String,
    assertion: js.Function1[/* done */ DoneFn, scala.Unit],
    timeout: scala.Double
  ): scala.Unit = js.native
  /**
   * Define a single spec. A spec should contain one or more expectations that test the state of the code.
   * A spec whose expectations all succeed will be passing and a spec with any failures will fail.
   * @param expectation Textual description of what this spec is checking
   * @param assertion Function that contains the code of your test. If not provided the test will be pending.
   * @param timeout Custom timeout for an async spec.
   */
  def it(expectation: java.lang.String): scala.Unit = js.native
  /**
   * Define a single spec. A spec should contain one or more expectations that test the state of the code.
   * A spec whose expectations all succeed will be passing and a spec with any failures will fail.
   * @param expectation Textual description of what this spec is checking
   * @param assertion Function that contains the code of your test. If not provided the test will be pending.
   * @param timeout Custom timeout for an async spec.
   */
  def it(expectation: java.lang.String, assertion: js.Function1[/* done */ DoneFn, scala.Unit]): scala.Unit = js.native
  /**
   * Define a single spec. A spec should contain one or more expectations that test the state of the code.
   * A spec whose expectations all succeed will be passing and a spec with any failures will fail.
   * @param expectation Textual description of what this spec is checking
   * @param assertion Function that contains the code of your test. If not provided the test will be pending.
   * @param timeout Custom timeout for an async spec.
   */
  def it(
    expectation: java.lang.String,
    assertion: js.Function1[/* done */ DoneFn, scala.Unit],
    timeout: scala.Double
  ): scala.Unit = js.native
  /**
   * Mark a spec as pending, expectation results will be ignored.
   * If you call the function pending anywhere in the spec body, no matter the expectations, the spec will be marked pending.
   * @param reason
   * @returns {}
   */
  def pending(): scala.Unit = js.native
  /**
   * Mark a spec as pending, expectation results will be ignored.
   * If you call the function pending anywhere in the spec body, no matter the expectations, the spec will be marked pending.
   * @param reason
   * @returns {}
   */
  def pending(reason: java.lang.String): scala.Unit = js.native
  def runs(asyncMethod: js.Function): scala.Unit = js.native
  /**
   * Install a spy onto an existing object.
   * @param object The object upon which to install the Spy
   * @param method The name of the method to replace with a Spy.
   */
  def spyOn[T](`object`: T, method: java.lang.String): jasmineLib.jasmineNs.Spy = js.native
  /**
   * Installs spies on all writable and configurable properties of an object.
   * @param object The object upon which to install the Spies
   */
  def spyOnAllFunctions(`object`: js.Object): jasmineLib.jasmineNs.Spy = js.native
  /**
   * Install a spy on a property onto an existing object.
   * @param object The object upon which to install the Spy
   * @param property The name of the property to replace with a Spy
   * @param accessType The access type (get|set) of the property to Spy on.
   */
  def spyOnProperty[T](`object`: T, property: java.lang.String): jasmineLib.jasmineNs.Spy = js.native
  /**
   * Install a spy on a property onto an existing object.
   * @param object The object upon which to install the Spy
   * @param property The name of the property to replace with a Spy
   * @param accessType The access type (get|set) of the property to Spy on.
   */
  @JSName("spyOnProperty")
  def spyOnProperty_get[T](`object`: T, property: java.lang.String, accessType: jasmineLib.jasmineLibStrings.get): jasmineLib.jasmineNs.Spy = js.native
  /**
   * Install a spy on a property onto an existing object.
   * @param object The object upon which to install the Spy
   * @param property The name of the property to replace with a Spy
   * @param accessType The access type (get|set) of the property to Spy on.
   */
  @JSName("spyOnProperty")
  def spyOnProperty_set[T](`object`: T, property: java.lang.String, accessType: jasmineLib.jasmineLibStrings.set): jasmineLib.jasmineNs.Spy = js.native
  def waits(): scala.Unit = js.native
  def waits(timeout: scala.Double): scala.Unit = js.native
  def waitsFor(latchMethod: js.Function0[scala.Boolean]): scala.Unit = js.native
  def waitsFor(latchMethod: js.Function0[scala.Boolean], failureMessage: java.lang.String): scala.Unit = js.native
  def waitsFor(latchMethod: js.Function0[scala.Boolean], failureMessage: java.lang.String, timeout: scala.Double): scala.Unit = js.native
  def xdescribe(description: java.lang.String, specDefinitions: js.Function0[scala.Unit]): scala.Unit = js.native
  def xit(expectation: java.lang.String): scala.Unit = js.native
  def xit(expectation: java.lang.String, assertion: js.Function1[/* done */ DoneFn, scala.Unit]): scala.Unit = js.native
  def xit(
    expectation: java.lang.String,
    assertion: js.Function1[/* done */ DoneFn, scala.Unit],
    timeout: scala.Double
  ): scala.Unit = js.native
}

