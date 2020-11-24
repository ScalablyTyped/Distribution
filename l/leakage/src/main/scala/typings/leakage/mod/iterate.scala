package typings.leakage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leakage", "iterate")
@js.native
object iterate extends js.Object {
  
  def apply(iteratorFn: js.Function0[Unit]): Result = js.native
  def apply(iteratorFn: js.Function0[Unit], options: IterateOptions): Result = js.native
  
  def async(iteratorFn: js.Function0[js.Promise[Unit]]): js.Promise[Result] = js.native
  def async(iteratorFn: js.Function0[js.Promise[Unit]], options: IterateOptions): js.Promise[Result] = js.native
}
