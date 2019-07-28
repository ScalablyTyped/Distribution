package typings.jest.jestMod

import typings.jest.jestMod.jasmineNs.Spy
import typings.jest.jestMod.jestNs.Describe
import typings.jest.jestMod.jestNs.Expect
import typings.jest.jestMod.jestNs.It
import typings.jest.jestMod.jestNs.Lifecycle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var afterAll: Lifecycle = js.native
  var afterEach: Lifecycle = js.native
  var beforeAll: Lifecycle = js.native
  var beforeEach: Lifecycle = js.native
  var describe: Describe = js.native
  val expect: Expect = js.native
  var fdescribe: Describe = js.native
  var fit: It = js.native
  var it: It = js.native
  var test: It = js.native
  var xdescribe: Describe = js.native
  var xit: It = js.native
  var xtest: It = js.native
  /**
    * Fails a test when called within one.
    */
  def fail(): scala.Nothing = js.native
  def fail(error: js.Any): scala.Nothing = js.native
  /**
    * If you call the function pending anywhere in the spec body,
    * no matter the expectations, the spec will be marked pending.
    */
  def pending(): Unit = js.native
  def pending(reason: String): Unit = js.native
  // Jest ships with a copy of Jasmine. They monkey-patch its APIs and divergence/deprecation are expected.
  // Relevant parts of Jasmine's API are below so they can be changed and removed over time.
  // This file can't reference jasmine.d.ts since the globals aren't compatible.
  def spyOn[T](`object`: T, method: String): Spy = js.native
}

