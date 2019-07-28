package typings.lodash.fpMod

import typings.lodash.lodashMod.Dictionary
import typings.lodash.lodashMod.List
import typings.lodash.lodashMod.PropertyName
import typings.lodash.lodashMod.ValueIterateeCustom
import typings.lodash.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashKeyBy extends js.Object {
  def apply[T](iteratee: ValueIterateeCustom[T, PropertyName]): Dictionary[T] = js.native
  def apply[T /* <: js.Object */](
    iteratee: ValueIterateeCustom[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      PropertyName
    ],
    collection: T
  ): Dictionary[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any] = js.native
  def apply[T](iteratee: ValueIterateeCustom[T, PropertyName], collection: List[T]): Dictionary[T] = js.native
  def apply[T /* <: js.Object */](iteratee: __): LodashKeyBy2x2[T] = js.native
  def apply[T /* <: js.Object */](iteratee: __, collection: T): LodashKeyBy2x2[T] = js.native
  def apply[T](iteratee: __, collection: List[T]): LodashKeyBy1x2[T] = js.native
}

