package typings.lodash.fpMod

import typings.lodash.mod.List
import typings.lodash.mod.ValueIterateeCustom
import typings.lodash.mod.ValueIteratorTypeGuard
import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashFind extends LodashConvertible {
  def apply[T](predicate: ValueIterateeCustom[T, Boolean]): js.UndefOr[T] = js.native
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
  def apply[T](predicate: __): LodashFind1x2[T] = js.native
  def apply[T /* <: js.Object */](predicate: __, collection: T): LodashFind3x2[T] = js.native
  def apply[T](predicate: __, collection: List[T]): LodashFind1x2[T] = js.native
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

