package typings.materialUiCore.reactHelpersMod

import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/core/utils/reactHelpers", "setRef")
@js.native
object setRef extends js.Object {
  def apply[T](): Unit = js.native
  def apply[T](ref: js.UndefOr[scala.Nothing], value: T): Unit = js.native
  def apply[T](ref: js.Function1[/* instance */ T | Null, Unit]): Unit = js.native
  def apply[T](ref: js.Function1[/* instance */ T | Null, Unit], value: T): Unit = js.native
  def apply[T](ref: Null, value: T): Unit = js.native
  def apply[T](ref: RefObject[T]): Unit = js.native
  def apply[T](ref: RefObject[T], value: T): Unit = js.native
}

