package typings.atLoadableComponent

import typings.atLoadableComponent.atLoadableComponentMod.DefaultComponent
import typings.atLoadableComponent.atLoadableComponentMod.LoadableComponent
import typings.atLoadableComponent.atLoadableComponentMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_LoadFn extends js.Object {
  def apply[T](loadFn: js.Function1[/* props */ T, js.Promise[DefaultComponent[T]]]): LoadableComponent[T] = js.native
  def apply[T](loadFn: js.Function1[/* props */ T, js.Promise[DefaultComponent[T]]], options: Options[T]): LoadableComponent[T] = js.native
}

