package typings
package lodashLib.fpMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPartition extends js.Object {
  def apply[T](callback: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]): js.Tuple2[js.Array[T], js.Array[T]] = js.native
  def apply[T /* <: js.Object */](
    callback: lodashLib.lodashMod.underscoreNs.ValueIteratee[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any],
    collection: T
  ): js.Tuple2[
    js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any], 
    js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  def apply[T](
    callback: lodashLib.lodashMod.underscoreNs.ValueIteratee[T],
    collection: lodashLib.lodashMod.underscoreNs.List[T]
  ): js.Tuple2[js.Array[T], js.Array[T]] = js.native
  def apply[T](callback: lodashLib.lodashMod.underscoreNs.`__`): LodashPartition1x2[T] = js.native
  def apply[T /* <: js.Object */](callback: lodashLib.lodashMod.underscoreNs.`__`, collection: T): LodashPartition2x2[T] = js.native
  def apply[T](
    callback: lodashLib.lodashMod.underscoreNs.`__`,
    collection: lodashLib.lodashMod.underscoreNs.List[T]
  ): LodashPartition1x2[T] = js.native
}

