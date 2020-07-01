package typings.lodash.fpMod

import typings.lodash.mod.Dictionary
import typings.lodash.mod.NumericDictionary
import typings.lodash.mod.PartialObject
import typings.lodash.mod.ValueKeyIteratee
import typings.lodash.mod.ValueKeyIterateeTypeGuard
import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPickBy extends LodashConvertible {
  def apply[T](predicate: ValueKeyIteratee[T]): LodashPickBy3x1[T] = js.native
  def apply[T /* <: js.Object */](
    predicate: ValueKeyIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ],
    `object`: T
  ): PartialObject[T] = js.native
  def apply[T](predicate: ValueKeyIteratee[T], `object`: Dictionary[T]): Dictionary[T] = js.native
  def apply[T](predicate: ValueKeyIteratee[T], `object`: NumericDictionary[T]): NumericDictionary[T] = js.native
  def apply[T](predicate: __): LodashPickBy2x2[T] = js.native
  def apply[T /* <: js.Object */](predicate: __, `object`: T): LodashPickBy5x2[T] = js.native
  def apply[T](predicate: __, `object`: Dictionary[T]): LodashPickBy1x2[T] = js.native
  def apply[T](predicate: __, `object`: NumericDictionary[T]): LodashPickBy2x2[T] = js.native
  def apply[T, S /* <: T */](predicate: ValueKeyIterateeTypeGuard[T, S]): LodashPickBy1x1[T, S] = js.native
  def apply[T, S /* <: T */](predicate: ValueKeyIterateeTypeGuard[T, S], `object`: Dictionary[T]): Dictionary[S] = js.native
  def apply[T, S /* <: T */](predicate: ValueKeyIterateeTypeGuard[T, S], `object`: NumericDictionary[T]): NumericDictionary[S] = js.native
}

