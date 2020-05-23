package typings.loadableComponent.anon

import typings.loadableComponent.mod.LoadableLibrary
import typings.loadableComponent.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply[T](loadFn: js.Function1[/* props */ js.Object, js.Promise[T]]): LoadableLibrary[T] = js.native
  def apply[T](loadFn: js.Function1[/* props */ js.Object, js.Promise[T]], options: Options[_]): LoadableLibrary[T] = js.native
}

