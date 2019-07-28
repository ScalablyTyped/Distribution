package typings.lambdaDashTester.lambdaDashTesterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerifierFn[S] extends js.Object {
  def apply(result: S): Unit | js.Promise[Unit] = js.native
  def apply(result: S, additional: js.Any): Unit | js.Promise[Unit] = js.native
  def apply(result: S, additional: js.Any, done: js.Function0[js.Object]): Unit = js.native
}

