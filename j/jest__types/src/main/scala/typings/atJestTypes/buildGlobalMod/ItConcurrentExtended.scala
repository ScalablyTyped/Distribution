package typings.atJestTypes.buildGlobalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItConcurrentExtended extends ItConcurrentBase {
  @JSName("only")
  var only_Original: ItConcurrentBase = js.native
  @JSName("skip")
  var skip_Original: ItConcurrentBase = js.native
  def only(testName: String, testFn: js.Function0[js.Promise[_]]): Unit = js.native
  def only(testName: String, testFn: js.Function0[js.Promise[_]], timeout: Double): Unit = js.native
  def skip(testName: String, testFn: js.Function0[js.Promise[_]]): Unit = js.native
  def skip(testName: String, testFn: js.Function0[js.Promise[_]], timeout: Double): Unit = js.native
}

