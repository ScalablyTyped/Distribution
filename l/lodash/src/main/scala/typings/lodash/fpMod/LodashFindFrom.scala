package typings.lodash.fpMod

import typings.lodash.mod.List
import typings.lodash.mod.ValueIterateeCustom
import typings.lodash.mod.ValueIteratorTypeGuard
import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashFindFrom extends LodashConvertible {
  def apply(predicate: __, fromIndex: Double): LodashFindFrom1x2 = js.native
  def apply[T](predicate: ValueIterateeCustom[T, Boolean]): LodashFindFrom2x1[T] = js.native
  def apply[T](predicate: ValueIterateeCustom[T, Boolean], fromIndex: Double): js.UndefOr[T] = js.native
  def apply[T /* <: js.Object */](
    predicate: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ],
    fromIndex: Double,
    collection: T
  ): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def apply[T](predicate: ValueIterateeCustom[T, Boolean], fromIndex: Double, collection: List[T]): js.UndefOr[T] = js.native
  def apply[T](predicate: ValueIterateeCustom[T, Boolean], fromIndex: __): LodashFindFrom2x5[T] = js.native
  def apply[T /* <: js.Object */](
    predicate: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ],
    fromIndex: __,
    collection: T
  ): LodashFindFrom4x5[T] = js.native
  def apply[T](predicate: ValueIterateeCustom[T, Boolean], fromIndex: __, collection: List[T]): LodashFindFrom2x5[T] = js.native
  def apply[T /* <: js.Object */](predicate: __, fromIndex: Double, collection: T): LodashFindFrom3x6[T] = js.native
  def apply[T](predicate: __, fromIndex: Double, collection: List[T]): LodashFindFrom1x6[T] = js.native
  def apply[T /* <: js.Object */](predicate: __, fromIndex: __): LodashFindFrom3x4[T] = js.native
  def apply[T /* <: js.Object */](predicate: __, fromIndex: __, collection: T): LodashFindFrom3x4[T] = js.native
  def apply[T](predicate: __, fromIndex: __, collection: List[T]): LodashFindFrom1x4[T] = js.native
  def apply[T, S /* <: T */](predicate: ValueIteratorTypeGuard[T, S]): LodashFindFrom1x1[T, S] = js.native
  def apply[T, S /* <: T */](predicate: ValueIteratorTypeGuard[T, S], fromIndex: Double): js.UndefOr[S] = js.native
  def apply[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: ValueIteratorTypeGuard[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ],
    fromIndex: Double,
    collection: T
  ): js.UndefOr[S] = js.native
  def apply[T, S /* <: T */](predicate: ValueIteratorTypeGuard[T, S], fromIndex: Double, collection: List[T]): js.UndefOr[S] = js.native
  def apply[T, S /* <: T */](predicate: ValueIteratorTypeGuard[T, S], fromIndex: __): LodashFindFrom1x5[S] = js.native
  def apply[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: ValueIteratorTypeGuard[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ],
    fromIndex: __,
    collection: T
  ): LodashFindFrom3x5[S] = js.native
  def apply[T, S /* <: T */](predicate: ValueIteratorTypeGuard[T, S], fromIndex: __, collection: List[T]): LodashFindFrom1x5[S] = js.native
}

