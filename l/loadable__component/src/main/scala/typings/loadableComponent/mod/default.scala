package typings.loadableComponent.mod

import typings.loadableComponent.FnCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@loadable/component", JSImport.Default)
@js.native
object default extends js.Object {
  var lib: FnCall = js.native
  def apply[T](loadFn: js.Function1[/* props */ T, js.Promise[DefaultComponent[T]]]): LoadableComponent[T] = js.native
  def apply[T](loadFn: js.Function1[/* props */ T, js.Promise[DefaultComponent[T]]], options: Options[T]): LoadableComponent[T] = js.native
}

