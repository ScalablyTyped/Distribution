package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPartition extends js.Object {
  def apply[T](callback: lodashLib.lodashMod.ValueIteratee[T]): js.Tuple2[js.Array[T], js.Array[T]] = js.native
  def apply[T /* <: js.Object */](
    callback: lodashLib.lodashMod.ValueIteratee[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any],
    collection: T
  ): js.Tuple2[
    js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any], 
    js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  def apply[T](callback: lodashLib.lodashMod.ValueIteratee[T], collection: lodashLib.lodashMod.List[T]): js.Tuple2[js.Array[T], js.Array[T]] = js.native
  def apply[T](callback: lodashLib.lodashMod.__): LodashPartition1x2[T] = js.native
  def apply[T /* <: js.Object */](callback: lodashLib.lodashMod.__, collection: T): LodashPartition3x2[T] = js.native
  def apply[T](callback: lodashLib.lodashMod.__, collection: lodashLib.lodashMod.List[T]): LodashPartition1x2[T] = js.native
  def apply[T, U /* <: T */](callback: lodashLib.lodashMod.ValueIteratorTypeGuard[T, U]): LodashPartition1x1[T, U] = js.native
  def apply[T, U /* <: T */](
    callback: lodashLib.lodashMod.ValueIteratorTypeGuard[T, U],
    collection: lodashLib.lodashMod.List[T]
  ): js.Tuple2[js.Array[U], js.Array[stdLib.Exclude[T, U]]] = js.native
}

