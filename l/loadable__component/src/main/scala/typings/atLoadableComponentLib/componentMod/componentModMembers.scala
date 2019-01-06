package typings
package atLoadableComponentLib.componentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@loadable/component", JSImport.Namespace)
@js.native
object componentModMembers extends js.Object {
  val default: atLoadableComponentLib.Anon_Lib = js.native
  def `lazy`[T](loadFn: js.Function1[/* props */ T, js.Promise[DefaultComponent[T]]]): LoadableComponent[T] = js.native
  def loadableReady(): js.Promise[scala.Unit] = js.native
  def loadableReady(done: js.Function0[_]): js.Promise[scala.Unit] = js.native
}

