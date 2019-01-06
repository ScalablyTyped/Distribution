package typings
package atLoadableComponentLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_LoadFn extends js.Object {
  def apply[T](loadFn: js.Function1[/* props */ js.Object, js.Promise[T]]): atLoadableComponentLib.componentMod.LoadableLibrary[T] = js.native
  def apply[T](
    loadFn: js.Function1[/* props */ js.Object, js.Promise[T]],
    options: atLoadableComponentLib.componentMod.Options
  ): atLoadableComponentLib.componentMod.LoadableLibrary[T] = js.native
}

