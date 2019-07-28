package typings.atHapiLab.atHapiLabMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lab extends js.Object {
  /** Perform async actions after the test suite */
  def after(cb: AsyncCallback): Unit = js.native
  /** Perform async actions after the test suite with options */
  def after(options: AsyncOptions, cb: AsyncCallback): Unit = js.native
  /** Perform async actions after the test suite with options, using a promise */
  def after(options: AsyncOptions, promise: AsyncPromise): Unit = js.native
  /** Perform async actions after the test suite using a promise */
  def after(promise: AsyncPromise): Unit = js.native
  /** Perform async actions after each test */
  def afterEach(cb: AsyncCallback): Unit = js.native
  /** Perform async actions after each test with options */
  def afterEach(options: AsyncOptions, cb: AsyncCallback): Unit = js.native
  /** Perform async actions after each test with options, using a promise */
  def afterEach(options: AsyncOptions, promise: AsyncPromise): Unit = js.native
  /** Perform async actions after each test using a promise */
  def afterEach(promise: AsyncPromise): Unit = js.native
  /** Perform async actions before the test suite */
  def before(cb: AsyncCallback): Unit = js.native
  /** Perform async actions before the test suite with options */
  def before(options: AsyncOptions, cb: AsyncCallback): Unit = js.native
  /** Perform async actions before the test suite with otions, using a promise */
  def before(options: AsyncOptions, promise: AsyncPromise): Unit = js.native
  /** Perform async actions before the test suite using a promise */
  def before(promise: AsyncPromise): Unit = js.native
  /** Perform async actions before each test */
  def beforeEach(cb: AsyncCallback): Unit = js.native
  /** Perform async actions before each test with options */
  def beforeEach(options: AsyncOptions, cb: AsyncCallback): Unit = js.native
  /** Perform async actions before each test with options, using a promise */
  def beforeEach(options: AsyncOptions, promise: AsyncPromise): Unit = js.native
  /** Perform async actions before each test using a promise */
  def beforeEach(promise: AsyncPromise): Unit = js.native
  /** Create a test suite */
  def describe(desc: String, cb: EmptyCallback): Unit = js.native
  /** Create a test suite with options */
  def describe(desc: String, options: ExperimentOptions, cb: EmptyCallback): Unit = js.native
  /** Organise tests into an experiment */
  def experiment(desc: String, cb: EmptyCallback): Unit = js.native
  /** Organise tests into an experiment with options */
  def experiment(desc: String, options: ExperimentOptions, cb: EmptyCallback): Unit = js.native
  /** The test spec */
  def it(desc: String, cb: TestCallback): Unit = js.native
  /** The test spec with options */
  def it(desc: String, options: TestOptions, cb: TestCallback): Unit = js.native
  /** The test spec using a promise with options */
  def it(desc: String, options: TestOptions, promise: TestPromise): Unit = js.native
  /** The test spec using a promise */
  def it(desc: String, promise: TestPromise): Unit = js.native
  /** Create a test suite */
  def suite(desc: String, cb: EmptyCallback): Unit = js.native
  /** Create a test suite with options */
  def suite(desc: String, options: ExperimentOptions, cb: EmptyCallback): Unit = js.native
  /** The test spec */
  def test(desc: String, cb: TestCallback): Unit = js.native
  /** The test spec with options */
  def test(desc: String, options: TestOptions, cb: TestCallback): Unit = js.native
  /** The test spec using a promise with options */
  def test(desc: String, options: TestOptions, promise: TestPromise): Unit = js.native
  /** The test spec using a promise */
  def test(desc: String, promise: TestPromise): Unit = js.native
}

