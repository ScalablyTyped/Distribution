package typings.loadableComponent.mod

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadableComponentMethods[Props] extends js.Object {
  def load(): js.Promise[ComponentType[Props]] = js.native
  def load(props: Props): js.Promise[ComponentType[Props]] = js.native
  def preload(): Unit = js.native
  def preload(props: Props): Unit = js.native
}

