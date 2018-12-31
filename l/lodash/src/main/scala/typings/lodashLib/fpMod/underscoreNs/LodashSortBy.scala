package typings
package lodashLib.fpMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashSortBy extends js.Object {
  def apply[T](
    iteratees: lodashLib.lodashMod.underscoreNs.Many[lodashLib.lodashMod.underscoreNs.ValueIteratee[T]]
  ): js.Array[T] = js.native
  def apply[T /* <: js.Object */](
    iteratees: lodashLib.lodashMod.underscoreNs.Many[
      lodashLib.lodashMod.underscoreNs.ValueIteratee[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
    ],
    collection: T
  ): js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any] = js.native
  def apply[T](
    iteratees: lodashLib.lodashMod.underscoreNs.Many[lodashLib.lodashMod.underscoreNs.ValueIteratee[T]],
    collection: lodashLib.lodashMod.underscoreNs.List[T]
  ): js.Array[T] = js.native
  def apply[T](iteratees: lodashLib.lodashMod.underscoreNs.`__`): LodashSortBy1x2[T] = js.native
  def apply[T /* <: js.Object */](iteratees: lodashLib.lodashMod.underscoreNs.`__`, collection: T): LodashSortBy2x2[T] = js.native
  def apply[T](
    iteratees: lodashLib.lodashMod.underscoreNs.`__`,
    collection: lodashLib.lodashMod.underscoreNs.List[T]
  ): LodashSortBy1x2[T] = js.native
}

