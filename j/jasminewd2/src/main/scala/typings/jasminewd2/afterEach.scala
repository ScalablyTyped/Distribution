package typings.jasminewd2

import typings.jasmine.DoneFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("afterEach")
@js.native
object afterEach extends js.Object {
  def apply(action: js.Function1[/* done */ DoneFn, js.Promise[Unit]]): Unit = js.native
  def apply(action: js.Function1[/* done */ DoneFn, js.Promise[Unit]], timeout: Double): Unit = js.native
}

