package typings.atJestTypes.buildGlobalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait It extends ItBase {
  @JSName("only")
  var only_Original: ItBase = js.native
  @JSName("skip")
  var skip_Original: ItBase = js.native
  def only(testName: TestName, fn: TestFn): Unit = js.native
  def only(testName: TestName, fn: TestFn, timeout: Double): Unit = js.native
  def skip(testName: TestName, fn: TestFn): Unit = js.native
  def skip(testName: TestName, fn: TestFn, timeout: Double): Unit = js.native
  def todo(testName: TestName, rest: js.Any*): Unit = js.native
}

