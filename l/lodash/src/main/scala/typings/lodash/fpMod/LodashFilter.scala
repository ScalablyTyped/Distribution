package typings.lodash.fpMod

import typings.lodash.lodashMod.List
import typings.lodash.lodashMod.ValueIterateeCustom
import typings.lodash.lodashMod.ValueIteratorTypeGuard
import typings.lodash.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashFilter extends js.Object {
  def apply[T](predicate: ValueIterateeCustom[T, Boolean]): js.Array[T] = js.native
  def apply[T /* <: js.Object */](
    predicate: ValueIterateeCustom[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ],
    collection: T
  ): js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any] = js.native
  def apply[T](predicate: ValueIterateeCustom[T, Boolean], collection: List[T]): js.Array[T] = js.native
  def apply[T](predicate: __): LodashFilter1x2[T] = js.native
  def apply[T /* <: js.Object */](predicate: __, collection: T): LodashFilter3x2[T] = js.native
  def apply[T](predicate: __, collection: List[T]): LodashFilter1x2[T] = js.native
  def apply[T /* <: js.Object */, S /* <: /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: ValueIteratorTypeGuard[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ]
  ): LodashFilter3x1[T, S] = js.native
  def apply[T /* <: js.Object */, S /* <: /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: ValueIteratorTypeGuard[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ],
    collection: T
  ): js.Array[S] = js.native
  def apply[T, S /* <: T */](predicate: ValueIteratorTypeGuard[T, S], collection: List[T]): js.Array[S] = js.native
}

