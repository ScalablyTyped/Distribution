package typings.materialUiCore.reactHelpersMod

import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/core/utils/reactHelpers", "setRef")
@js.native
object setRef extends js.Object {
  def apply[T](): Unit = js.native
  def apply[T](ref: js.UndefOr[(js.Function1[/* instance */ T | Null, Unit]) | RefObject[T]]): Unit = js.native
  def apply[T](ref: js.UndefOr[(js.Function1[/* instance */ T | Null, Unit]) | Null | RefObject[T]], value: T): Unit = js.native
}

