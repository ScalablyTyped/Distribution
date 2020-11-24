package typings.lodash.anon

import typings.lodash.mod.ArrayIterator
import typings.lodash.mod.List
import typings.lodash.mod.ListIterator
import typings.lodash.mod.ObjectIterator
import typings.lodash.mod.StringIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends js.Object {
  
  def apply(collection: String): String = js.native
  def apply(collection: String, iteratee: StringIterator[_]): String = js.native
  def apply[T /* <: js.Object */](): js.UndefOr[T | Null] = js.native
  def apply[T /* <: js.Object */](collection: T): T = js.native
  def apply[T /* <: js.Object */](collection: T, iteratee: ObjectIterator[T, _]): T = js.native
  def apply[T /* <: js.Object */](collection: js.UndefOr[scala.Nothing], iteratee: ObjectIterator[T, _]): js.UndefOr[T | Null] = js.native
  def apply[T](collection: js.Array[T]): js.Array[T] = js.native
  def apply[T](collection: js.Array[T], iteratee: ArrayIterator[T, _]): js.Array[T] = js.native
  def apply[T /* <: js.Object */](collection: Null, iteratee: ObjectIterator[T, _]): js.UndefOr[T | Null] = js.native
  def apply[T](collection: List[T]): List[T] = js.native
  def apply[T](collection: List[T], iteratee: ListIterator[T, _]): List[T] = js.native
}
