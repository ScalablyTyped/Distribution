package typings.jasminewd2

import typings.jasmine.DoneFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("it")
@js.native
object it extends js.Object {
  def apply(expectation: String): Unit = js.native
  def apply(expectation: String, assertion: js.Function1[/* done */ DoneFn, js.Promise[Unit]]): Unit = js.native
  def apply(expectation: String, assertion: js.Function1[/* done */ DoneFn, js.Promise[Unit]], timeout: Double): Unit = js.native
}

