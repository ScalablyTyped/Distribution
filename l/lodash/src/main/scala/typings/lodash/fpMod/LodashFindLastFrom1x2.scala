package typings.lodash.fpMod

import typings.lodash.lodashMod.List
import typings.lodash.lodashMod.ValueIterateeCustom
import typings.lodash.lodashMod.ValueIteratorTypeGuard
import typings.lodash.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashFindLastFrom1x2 extends js.Object {
  def apply[T](predicate: ValueIterateeCustom[T, Boolean]): LodashFindLastFrom2x3[T] = js.native
  def apply[T /* <: js.Object */](
    predicate: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ],
    collection: T
  ): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def apply[T](predicate: ValueIterateeCustom[T, Boolean], collection: List[T]): js.UndefOr[T] = js.native
  def apply[T](predicate: __): LodashFindLastFrom1x6[T] = js.native
  def apply[T /* <: js.Object */](predicate: __, collection: T): LodashFindLastFrom3x6[T] = js.native
  def apply[T](predicate: __, collection: List[T]): LodashFindLastFrom1x6[T] = js.native
  def apply[T, S /* <: T */](predicate: ValueIteratorTypeGuard[T, S]): js.UndefOr[S] = js.native
  def apply[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: ValueIteratorTypeGuard[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ],
    collection: T
  ): js.UndefOr[S] = js.native
  def apply[T, S /* <: T */](predicate: ValueIteratorTypeGuard[T, S], collection: List[T]): js.UndefOr[S] = js.native
}

