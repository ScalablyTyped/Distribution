package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashFindFrom extends js.Object {
  def apply(predicate: lodashLib.lodashMod.__, fromIndex: scala.Double): LodashFindFrom1x2 = js.native
  def apply[T](predicate: lodashLib.lodashMod.ValueIterateeCustom[T, scala.Boolean]): LodashFindFrom2x1[T] = js.native
  def apply[T /* <: js.Object */](
    predicate: lodashLib.lodashMod.ValueIterateeCustom[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      scala.Boolean
    ],
    fromIndex: lodashLib.lodashMod.__
  ): LodashFindFrom4x5[T] = js.native
  def apply[T /* <: js.Object */](
    predicate: lodashLib.lodashMod.ValueIterateeCustom[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      scala.Boolean
    ],
    fromIndex: lodashLib.lodashMod.__,
    collection: T
  ): LodashFindFrom4x5[T] = js.native
  def apply[T](
    predicate: lodashLib.lodashMod.ValueIterateeCustom[T, scala.Boolean],
    fromIndex: lodashLib.lodashMod.__,
    collection: lodashLib.lodashMod.List[T]
  ): LodashFindFrom2x5[T] = js.native
  def apply[T](predicate: lodashLib.lodashMod.ValueIterateeCustom[T, scala.Boolean], fromIndex: scala.Double): LodashFindFrom2x3[T] = js.native
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
  def apply[T](predicate: lodashLib.lodashMod.__, fromIndex: lodashLib.lodashMod.__): LodashFindFrom1x4[T] = js.native
  def apply[T /* <: js.Object */](predicate: lodashLib.lodashMod.__, fromIndex: lodashLib.lodashMod.__, collection: T): LodashFindFrom3x4[T] = js.native
  def apply[T](
    predicate: lodashLib.lodashMod.__,
    fromIndex: lodashLib.lodashMod.__,
    collection: lodashLib.lodashMod.List[T]
  ): LodashFindFrom1x4[T] = js.native
  def apply[T /* <: js.Object */](predicate: lodashLib.lodashMod.__, fromIndex: scala.Double, collection: T): LodashFindFrom3x6[T] = js.native
  def apply[T](
    predicate: lodashLib.lodashMod.__,
    fromIndex: scala.Double,
    collection: lodashLib.lodashMod.List[T]
  ): LodashFindFrom1x6[T] = js.native
  def apply[T /* <: js.Object */, S /* <: /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: lodashLib.lodashMod.ValueIteratorTypeGuard[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ]
  ): LodashFindFrom3x1[T, S] = js.native
  def apply[T /* <: js.Object */, S /* <: /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: lodashLib.lodashMod.ValueIteratorTypeGuard[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ],
    fromIndex: lodashLib.lodashMod.__
  ): LodashFindFrom3x5[S] = js.native
  def apply[T /* <: js.Object */, S /* <: /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: lodashLib.lodashMod.ValueIteratorTypeGuard[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ],
    fromIndex: lodashLib.lodashMod.__,
    collection: T
  ): LodashFindFrom3x5[S] = js.native
  def apply[T, S /* <: T */](
    predicate: lodashLib.lodashMod.ValueIteratorTypeGuard[T, S],
    fromIndex: lodashLib.lodashMod.__,
    collection: lodashLib.lodashMod.List[T]
  ): LodashFindFrom1x5[S] = js.native
  def apply[T, S /* <: T */](predicate: lodashLib.lodashMod.ValueIteratorTypeGuard[T, S], fromIndex: scala.Double): js.UndefOr[S] = js.native
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

