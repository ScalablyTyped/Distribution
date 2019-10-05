package typings.leakage.leakageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leakage", "iterate")
@js.native
object iterate extends js.Object {
  def apply(iteratorFn: js.Function0[Unit]): Result = js.native
  def apply(iteratorFn: js.Function0[Unit], options: IterateOptions): Result = js.native
  def async(iteratorFn: js.Function0[js.Promise[Unit]]): js.Promise[Result] = js.native
  def async(iteratorFn: js.Function0[js.Promise[Unit]], options: IterateOptions): js.Promise[Result] = js.native
}

