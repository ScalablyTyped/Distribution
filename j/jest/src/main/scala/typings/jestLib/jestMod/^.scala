package typings
package jestLib.jestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var afterAll: jestLib.jestMod.jestNs.Lifecycle = js.native
  var afterEach: jestLib.jestMod.jestNs.Lifecycle = js.native
  var beforeAll: jestLib.jestMod.jestNs.Lifecycle = js.native
  var beforeEach: jestLib.jestMod.jestNs.Lifecycle = js.native
  var describe: jestLib.jestMod.jestNs.Describe = js.native
  val expect: jestLib.jestMod.jestNs.Expect = js.native
  var fdescribe: jestLib.jestMod.jestNs.Describe = js.native
  var fit: jestLib.jestMod.jestNs.It = js.native
  var it: jestLib.jestMod.jestNs.It = js.native
  var test: jestLib.jestMod.jestNs.It = js.native
  var xdescribe: jestLib.jestMod.jestNs.Describe = js.native
  var xit: jestLib.jestMod.jestNs.It = js.native
  var xtest: jestLib.jestMod.jestNs.It = js.native
  /**
    * Fails a test when called within one.
    */
  def fail(): scala.Nothing = js.native
  def fail(error: js.Any): scala.Nothing = js.native
  /**
    * If you call the function pending anywhere in the spec body,
    * no matter the expectations, the spec will be marked pending.
    */
  def pending(): scala.Unit = js.native
  def pending(reason: java.lang.String): scala.Unit = js.native
  // Jest ships with a copy of Jasmine. They monkey-patch its APIs and divergence/deprecation are expected.
  // Relevant parts of Jasmine's API are below so they can be changed and removed over time.
  // This file can't reference jasmine.d.ts since the globals aren't compatible.
  def spyOn[T](`object`: T, method: java.lang.String): jestLib.jestMod.jasmineNs.Spy = js.native
}

