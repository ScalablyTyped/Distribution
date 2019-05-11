package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashKeyBy extends js.Object {
  def apply[T](iteratee: lodashLib.lodashMod.ValueIterateeCustom[T, lodashLib.lodashMod.PropertyName]): LodashKeyBy1x1[T] = js.native
  def apply[T /* <: js.Object */](
    iteratee: lodashLib.lodashMod.ValueIterateeCustom[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      lodashLib.lodashMod.PropertyName
    ],
    collection: T
  ): lodashLib.lodashMod.Dictionary[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any] = js.native
  def apply[T](
    iteratee: lodashLib.lodashMod.ValueIterateeCustom[T, lodashLib.lodashMod.PropertyName],
    collection: lodashLib.lodashMod.List[T]
  ): lodashLib.lodashMod.Dictionary[T] = js.native
  def apply[T](iteratee: lodashLib.lodashMod.__): LodashKeyBy1x2[T] = js.native
  def apply[T /* <: js.Object */](iteratee: lodashLib.lodashMod.__, collection: T): LodashKeyBy2x2[T] = js.native
  def apply[T](iteratee: lodashLib.lodashMod.__, collection: lodashLib.lodashMod.List[T]): LodashKeyBy1x2[T] = js.native
}

