package typings
package atHapiLabLib.atHapiLabMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lab extends js.Object {
  /** Perform async actions after the test suite */
  def after(cb: atHapiLabLib.AsyncCallback): scala.Unit = js.native
  /** Perform async actions after the test suite with options */
  def after(options: AsyncOptions, cb: atHapiLabLib.AsyncCallback): scala.Unit = js.native
  /** Perform async actions after the test suite with options, using a promise */
  def after(options: AsyncOptions, promise: atHapiLabLib.AsyncPromise): scala.Unit = js.native
  /** Perform async actions after the test suite using a promise */
  def after(promise: atHapiLabLib.AsyncPromise): scala.Unit = js.native
  /** Perform async actions after each test */
  def afterEach(cb: atHapiLabLib.AsyncCallback): scala.Unit = js.native
  /** Perform async actions after each test with options */
  def afterEach(options: AsyncOptions, cb: atHapiLabLib.AsyncCallback): scala.Unit = js.native
  /** Perform async actions after each test with options, using a promise */
  def afterEach(options: AsyncOptions, promise: atHapiLabLib.AsyncPromise): scala.Unit = js.native
  /** Perform async actions after each test using a promise */
  def afterEach(promise: atHapiLabLib.AsyncPromise): scala.Unit = js.native
  /** Perform async actions before the test suite */
  def before(cb: atHapiLabLib.AsyncCallback): scala.Unit = js.native
  /** Perform async actions before the test suite with options */
  def before(options: AsyncOptions, cb: atHapiLabLib.AsyncCallback): scala.Unit = js.native
  /** Perform async actions before the test suite with otions, using a promise */
  def before(options: AsyncOptions, promise: atHapiLabLib.AsyncPromise): scala.Unit = js.native
  /** Perform async actions before the test suite using a promise */
  def before(promise: atHapiLabLib.AsyncPromise): scala.Unit = js.native
  /** Perform async actions before each test */
  def beforeEach(cb: atHapiLabLib.AsyncCallback): scala.Unit = js.native
  /** Perform async actions before each test with options */
  def beforeEach(options: AsyncOptions, cb: atHapiLabLib.AsyncCallback): scala.Unit = js.native
  /** Perform async actions before each test with options, using a promise */
  def beforeEach(options: AsyncOptions, promise: atHapiLabLib.AsyncPromise): scala.Unit = js.native
  /** Perform async actions before each test using a promise */
  def beforeEach(promise: atHapiLabLib.AsyncPromise): scala.Unit = js.native
  /** Create a test suite */
  def describe(desc: java.lang.String, cb: atHapiLabLib.EmptyCallback): scala.Unit = js.native
  /** Create a test suite with options */
  def describe(desc: java.lang.String, options: ExperimentOptions, cb: atHapiLabLib.EmptyCallback): scala.Unit = js.native
  /** Organise tests into an experiment */
  def experiment(desc: java.lang.String, cb: atHapiLabLib.EmptyCallback): scala.Unit = js.native
  /** Organise tests into an experiment with options */
  def experiment(desc: java.lang.String, options: ExperimentOptions, cb: atHapiLabLib.EmptyCallback): scala.Unit = js.native
  /** The test spec */
  def it(desc: java.lang.String, cb: atHapiLabLib.TestCallback): scala.Unit = js.native
  /** The test spec with options */
  def it(desc: java.lang.String, options: TestOptions, cb: atHapiLabLib.TestCallback): scala.Unit = js.native
  /** The test spec using a promise with options */
  def it(desc: java.lang.String, options: TestOptions, promise: atHapiLabLib.TestPromise): scala.Unit = js.native
  /** The test spec using a promise */
  def it(desc: java.lang.String, promise: atHapiLabLib.TestPromise): scala.Unit = js.native
  /** Create a test suite */
  def suite(desc: java.lang.String, cb: atHapiLabLib.EmptyCallback): scala.Unit = js.native
  /** Create a test suite with options */
  def suite(desc: java.lang.String, options: ExperimentOptions, cb: atHapiLabLib.EmptyCallback): scala.Unit = js.native
  /** The test spec */
  def test(desc: java.lang.String, cb: atHapiLabLib.TestCallback): scala.Unit = js.native
  /** The test spec with options */
  def test(desc: java.lang.String, options: TestOptions, cb: atHapiLabLib.TestCallback): scala.Unit = js.native
  /** The test spec using a promise with options */
  def test(desc: java.lang.String, options: TestOptions, promise: atHapiLabLib.TestPromise): scala.Unit = js.native
  /** The test spec using a promise */
  def test(desc: java.lang.String, promise: atHapiLabLib.TestPromise): scala.Unit = js.native
}

