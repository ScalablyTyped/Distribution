package typings
package lodashLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Collection extends js.Object {
  def apply(collection: java.lang.String): java.lang.String = js.native
  def apply(collection: java.lang.String, iteratee: lodashLib.lodashMod.underscoreNs.StringIterator[_]): java.lang.String = js.native
  def apply[T /* <: js.Object */](): js.UndefOr[T | scala.Null] = js.native
  def apply[T /* <: js.Object */](collection: T): js.UndefOr[T | scala.Null] = js.native
  def apply[T /* <: js.Object */](collection: T, iteratee: lodashLib.lodashMod.underscoreNs.ObjectIterator[T, _]): js.UndefOr[T | scala.Null] = js.native
  def apply[T](collection: js.Array[T]): js.Array[T] = js.native
  def apply[T](collection: js.Array[T], iteratee: lodashLib.lodashMod.underscoreNs.ArrayIterator[T, _]): js.Array[T] = js.native
  def apply[T /* <: js.Object */](
    collection: js.UndefOr[scala.Nothing],
    iteratee: lodashLib.lodashMod.underscoreNs.ObjectIterator[T, _]
  ): js.UndefOr[T | scala.Null] = js.native
  def apply[T](collection: lodashLib.lodashMod.underscoreNs.List[T]): lodashLib.lodashMod.underscoreNs.List[T] = js.native
  def apply[T](
    collection: lodashLib.lodashMod.underscoreNs.List[T],
    iteratee: lodashLib.lodashMod.underscoreNs.ListIterator[T, _]
  ): lodashLib.lodashMod.underscoreNs.List[T] = js.native
  def apply[T /* <: js.Object */](collection: scala.Null, iteratee: lodashLib.lodashMod.underscoreNs.ObjectIterator[T, _]): js.UndefOr[T | scala.Null] = js.native
}

