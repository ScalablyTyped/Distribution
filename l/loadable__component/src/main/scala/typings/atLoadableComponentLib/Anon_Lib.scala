package typings
package atLoadableComponentLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Lib extends js.Object {
  @JSName("lib")
  var lib_Original: Anon_LoadFnOptions = js.native
  def lib[T](loadFn: js.Function1[/* props */ js.Object, js.Promise[T]]): atLoadableComponentLib.atLoadableComponentMod.LoadableLibrary[T] = js.native
  def lib[T](
    loadFn: js.Function1[/* props */ js.Object, js.Promise[T]],
    options: atLoadableComponentLib.atLoadableComponentMod.Options
  ): atLoadableComponentLib.atLoadableComponentMod.LoadableLibrary[T] = js.native
}

