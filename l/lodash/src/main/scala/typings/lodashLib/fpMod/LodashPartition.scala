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
  def apply[T /* <: js.Object */](callback: lodashLib.lodashMod.__): LodashPartition2x2[T] = js.native
  def apply[T /* <: js.Object */](callback: lodashLib.lodashMod.__, collection: T): LodashPartition2x2[T] = js.native
  def apply[T](callback: lodashLib.lodashMod.__, collection: lodashLib.lodashMod.List[T]): LodashPartition1x2[T] = js.native
}

