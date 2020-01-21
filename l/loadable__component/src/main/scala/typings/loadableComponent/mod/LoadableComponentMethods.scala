package typings.loadableComponent.mod

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadableComponentMethods[T] extends js.Object {
  def load(): js.Promise[ComponentType[T]] = js.native
  def load(props: T): js.Promise[ComponentType[T]] = js.native
  def preload(): Unit = js.native
  def preload(props: T): Unit = js.native
}

