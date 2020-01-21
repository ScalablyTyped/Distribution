package typings.lodash.fpMod

import typings.lodash.mod.Dictionary
import typings.lodash.mod.List
import typings.lodash.mod.NumericDictionary
import typings.lodash.mod.ValueIteratee
import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashInvertBy extends js.Object {
  def apply[T /* <: js.Object */](
    interatee: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): Dictionary[js.Array[String]] = js.native
  def apply[T /* <: js.Object */](
    interatee: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ],
    `object`: T
  ): Dictionary[js.Array[String]] = js.native
  def apply[T](interatee: ValueIteratee[T], `object`: Dictionary[T]): Dictionary[js.Array[String]] = js.native
  def apply[T](interatee: ValueIteratee[T], `object`: List[T]): Dictionary[js.Array[String]] = js.native
  def apply[T](interatee: ValueIteratee[T], `object`: NumericDictionary[T]): Dictionary[js.Array[String]] = js.native
  def apply[T](interatee: __): LodashInvertBy1x2[T] = js.native
  def apply[T /* <: js.Object */](interatee: __, `object`: T): LodashInvertBy2x2[T] = js.native
  def apply[T](interatee: __, `object`: Dictionary[T]): LodashInvertBy1x2[T] = js.native
  def apply[T](interatee: __, `object`: List[T]): LodashInvertBy1x2[T] = js.native
  def apply[T](interatee: __, `object`: NumericDictionary[T]): LodashInvertBy1x2[T] = js.native
}

