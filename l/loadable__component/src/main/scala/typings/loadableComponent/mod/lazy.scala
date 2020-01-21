package typings.loadableComponent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@loadable/component", "lazy")
@js.native
object `lazy` extends js.Object {
  def apply[T](loadFn: js.Function1[/* props */ T, js.Promise[DefaultComponent[T]]]): LoadableComponent[T] = js.native
  def lib[TModule](loadFn: js.Function1[/* props */ js.Object, js.Promise[TModule]]): LoadableLibrary[TModule] = js.native
}

