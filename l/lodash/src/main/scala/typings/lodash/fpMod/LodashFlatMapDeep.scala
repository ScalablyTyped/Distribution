package typings.lodash.fpMod

import typings.lodash.lodashMod.List
import typings.lodash.lodashMod.ListOfRecursiveArraysOrValues
import typings.lodash.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashFlatMapDeep extends js.Object {
  def apply(iteratee: String): js.Array[_] = js.native
  def apply(iteratee: String, collection: js.Object): js.Array[_] = js.native
  def apply(iteratee: js.Object): js.Array[Boolean] = js.native
  def apply(iteratee: js.Object, collection: js.Object): js.Array[Boolean] = js.native
  def apply(iteratee: __): LodashFlatMapDeep3x2 = js.native
  def apply(iteratee: __, collection: js.Object): LodashFlatMapDeep3x2 = js.native
  def apply[T /* <: js.Object */](iteratee: __, collection: T): LodashFlatMapDeep2x2[T] = js.native
  def apply[T](iteratee: __, collection: List[T]): LodashFlatMapDeep1x2[T] = js.native
  def apply[T, TResult](iteratee: js.Function1[/* value */ T, ListOfRecursiveArraysOrValues[TResult] | TResult]): js.Array[TResult] = js.native
  def apply[T /* <: js.Object */, TResult](
    iteratee: js.Function1[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      ListOfRecursiveArraysOrValues[TResult] | TResult
    ],
    collection: T
  ): js.Array[TResult] = js.native
  def apply[T, TResult](
    iteratee: js.Function1[/* value */ T, ListOfRecursiveArraysOrValues[TResult] | TResult],
    collection: List[T]
  ): js.Array[TResult] = js.native
}

