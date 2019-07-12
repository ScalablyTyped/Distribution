package typings
package atLoadableComponentLib.atLoadableComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadableComponentMethods[T] extends js.Object {
  def load(): js.Promise[reactLib.reactMod.ComponentType[T]] = js.native
  def load(props: T): js.Promise[reactLib.reactMod.ComponentType[T]] = js.native
  def preload(): scala.Unit = js.native
  def preload(props: T): scala.Unit = js.native
}

