package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashFindLastFrom extends js.Object {
  def apply(predicate: lodashLib.lodashMod.__, fromIndex: scala.Double): LodashFindLastFrom1x2 = js.native
  def apply[T](predicate: lodashLib.lodashMod.ValueIterateeCustom[T, scala.Boolean]): LodashFindLastFrom2x1[T] = js.native
  def apply[T](
    predicate: lodashLib.lodashMod.ValueIterateeCustom[T, scala.Boolean],
    fromIndex: lodashLib.lodashMod.__
  ): LodashFindLastFrom2x5[T] = js.native
  def apply[T /* <: js.Object */](
    predicate: lodashLib.lodashMod.ValueIterateeCustom[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      scala.Boolean
    ],
    fromIndex: lodashLib.lodashMod.__,
    collection: T
  ): LodashFindLastFrom4x5[T] = js.native
  def apply[T](
    predicate: lodashLib.lodashMod.ValueIterateeCustom[T, scala.Boolean],
    fromIndex: lodashLib.lodashMod.__,
    collection: lodashLib.lodashMod.List[T]
  ): LodashFindLastFrom2x5[T] = js.native
  def apply[T](predicate: lodashLib.lodashMod.ValueIterateeCustom[T, scala.Boolean], fromIndex: scala.Double): js.UndefOr[T] = js.native
  def apply[T /* <: js.Object */](
    predicate: lodashLib.lodashMod.ValueIterateeCustom[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      scala.Boolean
    ],
    fromIndex: scala.Double,
    collection: T
  ): js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any] = js.native
  def apply[T](
    predicate: lodashLib.lodashMod.ValueIterateeCustom[T, scala.Boolean],
    fromIndex: scala.Double,
    collection: lodashLib.lodashMod.List[T]
  ): js.UndefOr[T] = js.native
  def apply[T](predicate: lodashLib.lodashMod.__, fromIndex: lodashLib.lodashMod.__): LodashFindLastFrom1x4[T] = js.native
  def apply[T /* <: js.Object */](predicate: lodashLib.lodashMod.__, fromIndex: lodashLib.lodashMod.__, collection: T): LodashFindLastFrom3x4[T] = js.native
  def apply[T](
    predicate: lodashLib.lodashMod.__,
    fromIndex: lodashLib.lodashMod.__,
    collection: lodashLib.lodashMod.List[T]
  ): LodashFindLastFrom1x4[T] = js.native
  def apply[T /* <: js.Object */](predicate: lodashLib.lodashMod.__, fromIndex: scala.Double, collection: T): LodashFindLastFrom3x6[T] = js.native
  def apply[T](
    predicate: lodashLib.lodashMod.__,
    fromIndex: scala.Double,
    collection: lodashLib.lodashMod.List[T]
  ): LodashFindLastFrom1x6[T] = js.native
  def apply[T /* <: js.Object */, S /* <: /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: lodashLib.lodashMod.ValueIteratorTypeGuard[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ]
  ): LodashFindLastFrom3x1[T, S] = js.native
  def apply[T /* <: js.Object */, S /* <: /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: lodashLib.lodashMod.ValueIteratorTypeGuard[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ],
    fromIndex: lodashLib.lodashMod.__
  ): LodashFindLastFrom3x5[S] = js.native
  def apply[T /* <: js.Object */, S /* <: /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: lodashLib.lodashMod.ValueIteratorTypeGuard[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ],
    fromIndex: lodashLib.lodashMod.__,
    collection: T
  ): LodashFindLastFrom3x5[S] = js.native
  def apply[T, S /* <: T */](
    predicate: lodashLib.lodashMod.ValueIteratorTypeGuard[T, S],
    fromIndex: lodashLib.lodashMod.__,
    collection: lodashLib.lodashMod.List[T]
  ): LodashFindLastFrom1x5[S] = js.native
  def apply[T, S /* <: T */](predicate: lodashLib.lodashMod.ValueIteratorTypeGuard[T, S], fromIndex: scala.Double): LodashFindLastFrom1x3[T, S] = js.native
  def apply[T /* <: js.Object */, S /* <: /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: lodashLib.lodashMod.ValueIteratorTypeGuard[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ],
    fromIndex: scala.Double,
    collection: T
  ): js.UndefOr[S] = js.native
  def apply[T, S /* <: T */](
    predicate: lodashLib.lodashMod.ValueIteratorTypeGuard[T, S],
    fromIndex: scala.Double,
    collection: lodashLib.lodashMod.List[T]
  ): js.UndefOr[S] = js.native
}

