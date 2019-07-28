package typings.jestDashEach.jestDashEachMod.JestEachNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestObj extends js.Object {
  @JSName("only")
  var only_Original: TestFn = js.native
  @JSName("skip")
  var skip_Original: TestFn = js.native
  def apply(name: String, fn: TestCallback): Unit = js.native
  def only(name: String, fn: TestCallback): Unit = js.native
  def skip(name: String, fn: TestCallback): Unit = js.native
}

