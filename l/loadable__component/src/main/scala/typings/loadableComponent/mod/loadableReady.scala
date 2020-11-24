package typings.loadableComponent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@loadable/component", "loadableReady")
@js.native
object loadableReady extends js.Object {
  
  def apply(): js.Promise[Unit] = js.native
  def apply(done: js.UndefOr[scala.Nothing], options: LoadableReadyOptions): js.Promise[Unit] = js.native
  def apply(done: js.Function0[_]): js.Promise[Unit] = js.native
  def apply(done: js.Function0[_], options: LoadableReadyOptions): js.Promise[Unit] = js.native
}
