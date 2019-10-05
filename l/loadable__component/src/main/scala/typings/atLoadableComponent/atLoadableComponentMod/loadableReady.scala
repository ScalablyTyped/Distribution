package typings.atLoadableComponent.atLoadableComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@loadable/component", "loadableReady")
@js.native
object loadableReady extends js.Object {
  def apply(): js.Promise[Unit] = js.native
  def apply(done: js.Function0[_]): js.Promise[Unit] = js.native
  def apply(done: js.Function0[_], options: LoadableReadyOptions): js.Promise[Unit] = js.native
}

