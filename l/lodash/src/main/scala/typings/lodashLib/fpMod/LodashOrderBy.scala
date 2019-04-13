package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashOrderBy extends js.Object {
  def apply(
    iteratees: lodashLib.lodashMod.__,
    orders: lodashLib.lodashMod.Many[scala.Boolean | lodashLib.lodashLibStrings.asc | lodashLib.lodashLibStrings.desc]
  ): LodashOrderBy1x2 = js.native
  def apply[T](iteratees: lodashLib.lodashMod.Many[lodashLib.lodashMod.ValueIteratee[T]]): LodashOrderBy2x1[T] = js.native
  def apply[T](
    iteratees: lodashLib.lodashMod.Many[
      (js.Function1[/* value */ T, lodashLib.lodashMod.NotVoid]) | lodashLib.lodashMod.ValueIteratee[T]
    ],
    orders: lodashLib.lodashMod.Many[scala.Boolean | lodashLib.lodashLibStrings.asc | lodashLib.lodashLibStrings.desc]
  ): js.Array[T] = js.native
  def apply[T /* <: js.Object */](
    iteratees: lodashLib.lodashMod.Many[
      (js.Function1[
        /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
        lodashLib.lodashMod.NotVoid
      ]) | (lodashLib.lodashMod.ValueIteratee[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any])
    ],
    orders: lodashLib.lodashMod.Many[scala.Boolean | lodashLib.lodashLibStrings.asc | lodashLib.lodashLibStrings.desc],
    collection: T
  ): js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any] = js.native
  def apply[T](
    iteratees: lodashLib.lodashMod.Many[
      (js.Function1[/* value */ T, lodashLib.lodashMod.NotVoid]) | lodashLib.lodashMod.ValueIteratee[T]
    ],
    orders: lodashLib.lodashMod.Many[scala.Boolean | lodashLib.lodashLibStrings.asc | lodashLib.lodashLibStrings.desc],
    collection: lodashLib.lodashMod.List[T]
  ): js.Array[T] = js.native
  def apply[T](
    iteratees: lodashLib.lodashMod.Many[js.Function1[/* value */ T, lodashLib.lodashMod.NotVoid]],
    orders: lodashLib.lodashMod.__
  ): LodashOrderBy1x5[T] = js.native
  def apply[T /* <: js.Object */](
    iteratees: lodashLib.lodashMod.Many[
      lodashLib.lodashMod.ValueIteratee[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
    ],
    orders: lodashLib.lodashMod.__,
    collection: T
  ): LodashOrderBy4x5[T] = js.native
  def apply[T](
    iteratees: lodashLib.lodashMod.Many[js.Function1[/* value */ T, lodashLib.lodashMod.NotVoid]],
    orders: lodashLib.lodashMod.__,
    collection: lodashLib.lodashMod.List[T]
  ): LodashOrderBy1x5[T] = js.native
  def apply[T /* <: js.Object */](
    iteratees: lodashLib.lodashMod.__,
    orders: lodashLib.lodashMod.Many[scala.Boolean | lodashLib.lodashLibStrings.asc | lodashLib.lodashLibStrings.desc],
    collection: T
  ): LodashOrderBy3x6[T] = js.native
  def apply[T](
    iteratees: lodashLib.lodashMod.__,
    orders: lodashLib.lodashMod.Many[scala.Boolean | lodashLib.lodashLibStrings.asc | lodashLib.lodashLibStrings.desc],
    collection: lodashLib.lodashMod.List[T]
  ): LodashOrderBy1x6[T] = js.native
  def apply[T /* <: js.Object */](iteratees: lodashLib.lodashMod.__, orders: lodashLib.lodashMod.__): LodashOrderBy3x4[T] = js.native
  def apply[T /* <: js.Object */](iteratees: lodashLib.lodashMod.__, orders: lodashLib.lodashMod.__, collection: T): LodashOrderBy3x4[T] = js.native
  def apply[T](
    iteratees: lodashLib.lodashMod.__,
    orders: lodashLib.lodashMod.__,
    collection: lodashLib.lodashMod.List[T]
  ): LodashOrderBy1x4[T] = js.native
}

