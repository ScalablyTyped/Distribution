package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashSortBy extends js.Object {
  def apply[T](iteratees: lodashLib.lodashMod.Many[lodashLib.lodashMod.ValueIteratee[T]]): js.Array[T] = js.native
  def apply[T /* <: js.Object */](
    iteratees: lodashLib.lodashMod.Many[
      lodashLib.lodashMod.ValueIteratee[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
    ],
    collection: T
  ): js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any] = js.native
  def apply[T](
    iteratees: lodashLib.lodashMod.Many[lodashLib.lodashMod.ValueIteratee[T]],
    collection: lodashLib.lodashMod.List[T]
  ): js.Array[T] = js.native
  def apply[T /* <: js.Object */](iteratees: lodashLib.lodashMod.__): LodashSortBy2x2[T] = js.native
  def apply[T /* <: js.Object */](iteratees: lodashLib.lodashMod.__, collection: T): LodashSortBy2x2[T] = js.native
  def apply[T](iteratees: lodashLib.lodashMod.__, collection: lodashLib.lodashMod.List[T]): LodashSortBy1x2[T] = js.native
}

