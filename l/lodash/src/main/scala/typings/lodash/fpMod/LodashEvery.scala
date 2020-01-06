package typings.lodash.fpMod

import typings.lodash.lodashMod.List
import typings.lodash.lodashMod.ValueIterateeCustom
import typings.lodash.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashEvery extends js.Object {
  def apply[T](predicate: ValueIterateeCustom[T, Boolean]): Boolean = js.native
  def apply[T /* <: js.Object */](
    predicate: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ],
    collection: T
  ): Boolean = js.native
  def apply[T](predicate: ValueIterateeCustom[T, Boolean], collection: List[T]): Boolean = js.native
  def apply[T](predicate: __): LodashEvery1x2[T] = js.native
  def apply[T /* <: js.Object */](predicate: __, collection: T): LodashEvery2x2[T] = js.native
  def apply[T](predicate: __, collection: List[T]): LodashEvery1x2[T] = js.native
}

