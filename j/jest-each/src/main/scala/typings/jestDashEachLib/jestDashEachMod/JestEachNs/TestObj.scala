package typings
package jestDashEachLib.jestDashEachMod.JestEachNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestObj extends js.Object {
  @JSName("only")
  var only_Original: TestFn = js.native
  @JSName("skip")
  var skip_Original: TestFn = js.native
  def apply(name: java.lang.String, fn: TestCallback): scala.Unit = js.native
  def only(name: java.lang.String, fn: TestCallback): scala.Unit = js.native
  def skip(name: java.lang.String, fn: TestCallback): scala.Unit = js.native
}

