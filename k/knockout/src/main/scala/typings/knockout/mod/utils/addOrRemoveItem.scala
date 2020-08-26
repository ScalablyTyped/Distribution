package typings.knockout.mod.utils

import typings.knockout.mod.MaybeObservableArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("knockout", "utils.addOrRemoveItem")
@js.native
object addOrRemoveItem extends js.Object {
  def apply[T](array: MaybeObservableArray[T], value: T): js.Array[T] = js.native
  def apply[T](array: MaybeObservableArray[T], value: T, included: Boolean): js.Array[T] = js.native
}

