package typings
package lambdaDashTesterLib.lambdaDashTesterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerifierFn[S] extends js.Object {
  def apply(result: S): scala.Unit | js.Promise[scala.Unit] = js.native
  def apply(result: S, additional: js.Any): scala.Unit | js.Promise[scala.Unit] = js.native
  def apply(result: S, additional: js.Any, done: js.Function0[js.Object]): scala.Unit = js.native
}

