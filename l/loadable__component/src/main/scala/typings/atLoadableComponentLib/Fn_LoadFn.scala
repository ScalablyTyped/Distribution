package typings
package atLoadableComponentLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_LoadFn extends js.Object {
  def apply[T](
    loadFn: js.Function1[
      /* props */ T, 
      js.Promise[atLoadableComponentLib.atLoadableComponentMod.DefaultComponent[T]]
    ]
  ): atLoadableComponentLib.atLoadableComponentMod.LoadableComponent[T] = js.native
  def apply[T](
    loadFn: js.Function1[
      /* props */ T, 
      js.Promise[atLoadableComponentLib.atLoadableComponentMod.DefaultComponent[T]]
    ],
    options: atLoadableComponentLib.atLoadableComponentMod.Options
  ): atLoadableComponentLib.atLoadableComponentMod.LoadableComponent[T] = js.native
}

