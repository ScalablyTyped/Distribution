package typings
package jestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object jestLibMembers extends js.Object {
  var afterAll: jestLib.jestNs.Lifecycle = js.native
  var afterEach: jestLib.jestNs.Lifecycle = js.native
  var beforeAll: jestLib.jestNs.Lifecycle = js.native
  var beforeEach: jestLib.jestNs.Lifecycle = js.native
  var describe: jestLib.jestNs.Describe = js.native
  val expect: jestLib.jestNs.Expect = js.native
  var fdescribe: jestLib.jestNs.Describe = js.native
  var fit: jestLib.jestNs.It = js.native
  var it: jestLib.jestNs.It = js.native
  var test: jestLib.jestNs.It = js.native
  var xdescribe: jestLib.jestNs.Describe = js.native
  var xit: jestLib.jestNs.It = js.native
  var xtest: jestLib.jestNs.It = js.native
  /**
    * Fails a test when called within one.
    */
  def fail(): scala.Unit = js.native
  def fail(error: js.Any): scala.Unit = js.native
  /**
    * If you call the function pending anywhere in the spec body,
    * no matter the expectations, the spec will be marked pending.
    */
  def pending(): scala.Unit = js.native
  def pending(reason: java.lang.String): scala.Unit = js.native
  // Jest ships with a copy of Jasmine. They monkey-patch its APIs and divergence/deprecation are expected.
  // Relevant parts of Jasmine's API are below so they can be changed and removed over time.
  // This file can't reference jasmine.d.ts since the globals aren't compatible.
  def spyOn[T](`object`: T, method: java.lang.String): jestLib.jasmineNs.Spy = js.native
}

