package typings
package atHapiLabLib.atHapiLabMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lab extends js.Object {
  /** Perform async actions after the test suite */
  def after(cb: AsyncCallback): scala.Unit = js.native
  /** Perform async actions after the test suite with options */
  def after(options: AsyncOptions, cb: AsyncCallback): scala.Unit = js.native
  /** Perform async actions after the test suite with options, using a promise */
  def after(options: AsyncOptions, promise: AsyncPromise): scala.Unit = js.native
  /** Perform async actions after the test suite using a promise */
  def after(promise: AsyncPromise): scala.Unit = js.native
  /** Perform async actions after each test */
  def afterEach(cb: AsyncCallback): scala.Unit = js.native
  /** Perform async actions after each test with options */
  def afterEach(options: AsyncOptions, cb: AsyncCallback): scala.Unit = js.native
  /** Perform async actions after each test with options, using a promise */
  def afterEach(options: AsyncOptions, promise: AsyncPromise): scala.Unit = js.native
  /** Perform async actions after each test using a promise */
  def afterEach(promise: AsyncPromise): scala.Unit = js.native
  /** Perform async actions before the test suite */
  def before(cb: AsyncCallback): scala.Unit = js.native
  /** Perform async actions before the test suite with options */
  def before(options: AsyncOptions, cb: AsyncCallback): scala.Unit = js.native
  /** Perform async actions before the test suite with otions, using a promise */
  def before(options: AsyncOptions, promise: AsyncPromise): scala.Unit = js.native
  /** Perform async actions before the test suite using a promise */
  def before(promise: AsyncPromise): scala.Unit = js.native
  /** Perform async actions before each test */
  def beforeEach(cb: AsyncCallback): scala.Unit = js.native
  /** Perform async actions before each test with options */
  def beforeEach(options: AsyncOptions, cb: AsyncCallback): scala.Unit = js.native
  /** Perform async actions before each test with options, using a promise */
  def beforeEach(options: AsyncOptions, promise: AsyncPromise): scala.Unit = js.native
  /** Perform async actions before each test using a promise */
  def beforeEach(promise: AsyncPromise): scala.Unit = js.native
  /** Create a test suite */
  def describe(desc: java.lang.String, cb: EmptyCallback): scala.Unit = js.native
  /** Create a test suite with options */
  def describe(desc: java.lang.String, options: ExperimentOptions, cb: EmptyCallback): scala.Unit = js.native
  /** Organise tests into an experiment */
  def experiment(desc: java.lang.String, cb: EmptyCallback): scala.Unit = js.native
  /** Organise tests into an experiment with options */
  def experiment(desc: java.lang.String, options: ExperimentOptions, cb: EmptyCallback): scala.Unit = js.native
  /** The test spec */
  def it(desc: java.lang.String, cb: TestCallback): scala.Unit = js.native
  /** The test spec with options */
  def it(desc: java.lang.String, options: TestOptions, cb: TestCallback): scala.Unit = js.native
  /** The test spec using a promise with options */
  def it(desc: java.lang.String, options: TestOptions, promise: TestPromise): scala.Unit = js.native
  /** The test spec using a promise */
  def it(desc: java.lang.String, promise: TestPromise): scala.Unit = js.native
  /** Create a test suite */
  def suite(desc: java.lang.String, cb: EmptyCallback): scala.Unit = js.native
  /** Create a test suite with options */
  def suite(desc: java.lang.String, options: ExperimentOptions, cb: EmptyCallback): scala.Unit = js.native
  /** The test spec */
  def test(desc: java.lang.String, cb: TestCallback): scala.Unit = js.native
  /** The test spec with options */
  def test(desc: java.lang.String, options: TestOptions, cb: TestCallback): scala.Unit = js.native
  /** The test spec using a promise with options */
  def test(desc: java.lang.String, options: TestOptions, promise: TestPromise): scala.Unit = js.native
  /** The test spec using a promise */
  def test(desc: java.lang.String, promise: TestPromise): scala.Unit = js.native
}

