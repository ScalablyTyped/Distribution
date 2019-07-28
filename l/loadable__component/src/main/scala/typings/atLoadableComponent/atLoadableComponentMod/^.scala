package typings.atLoadableComponent.atLoadableComponentMod

import typings.atLoadableComponent.Anon_Lib
import typings.atLoadableComponent.Fn_LoadFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@loadable/component", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val default: Fn_LoadFn with Anon_Lib = js.native
  def `lazy`[T](loadFn: js.Function1[/* props */ T, js.Promise[DefaultComponent[T]]]): LoadableComponent[T] = js.native
  def loadableReady(): js.Promise[Unit] = js.native
  def loadableReady(done: js.Function0[_]): js.Promise[Unit] = js.native
  def loadableReady(done: js.Function0[_], options: LoadableReadyOptions): js.Promise[Unit] = js.native
}

