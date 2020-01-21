package typings.knockoutMapping.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutObservableArrayFunctions[T] extends js.Object {
  def mappedCreate(item: T): T = js.native
  def mappedDestroy(destroyFunction: js.Function1[/* item */ T, Boolean]): Unit = js.native
  def mappedDestroy(item: T): Unit = js.native
  def mappedDestroyAll(): Unit = js.native
  def mappedDestroyAll(items: js.Array[T]): Unit = js.native
  def mappedRemove(item: T): js.Array[T] = js.native
  def mappedRemove(removeFunction: js.Function1[/* item */ T, Boolean]): js.Array[T] = js.native
  def mappedRemoveAll(): js.Array[T] = js.native
  def mappedRemoveAll(items: js.Array[T]): js.Array[T] = js.native
}

