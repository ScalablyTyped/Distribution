package typings.lodash.fpMod

import typings.lodash.mod.Dictionary
import typings.lodash.mod.NumericDictionary
import typings.lodash.mod.PartialObject
import typings.lodash.mod.ValueKeyIteratee
import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashOmitBy extends js.Object {
  def apply[T /* <: js.Object */](
    predicate: ValueKeyIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): PartialObject[T] = js.native
  def apply[T /* <: js.Object */](
    predicate: ValueKeyIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ],
    `object`: T
  ): PartialObject[T] = js.native
  def apply[T](predicate: ValueKeyIteratee[T], `object`: Dictionary[T]): Dictionary[T] = js.native
  def apply[T](predicate: ValueKeyIteratee[T], `object`: NumericDictionary[T]): NumericDictionary[T] = js.native
  def apply[T](predicate: __): LodashOmitBy2x2[T] = js.native
  def apply[T /* <: js.Object */](predicate: __, `object`: T): LodashOmitBy3x2[T] = js.native
  def apply[T](predicate: __, `object`: Dictionary[T]): LodashOmitBy1x2[T] = js.native
  def apply[T](predicate: __, `object`: NumericDictionary[T]): LodashOmitBy2x2[T] = js.native
}

