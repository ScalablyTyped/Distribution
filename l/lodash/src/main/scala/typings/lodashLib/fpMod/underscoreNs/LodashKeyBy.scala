package typings
package lodashLib.fpMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashKeyBy extends js.Object {
  def apply[T](
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIterateeCustom[T, lodashLib.lodashMod.underscoreNs.PropertyName]
  ): lodashLib.lodashMod.underscoreNs.Dictionary[T] = js.native
  def apply[T /* <: js.Object */](
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIterateeCustom[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      lodashLib.lodashMod.underscoreNs.PropertyName
    ],
    collection: T
  ): lodashLib.lodashMod.underscoreNs.Dictionary[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any] = js.native
  def apply[T](
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIterateeCustom[T, lodashLib.lodashMod.underscoreNs.PropertyName],
    collection: lodashLib.lodashMod.underscoreNs.List[T]
  ): lodashLib.lodashMod.underscoreNs.Dictionary[T] = js.native
  def apply[T](iteratee: lodashLib.lodashMod.underscoreNs.__): LodashKeyBy1x2[T] = js.native
  def apply[T /* <: js.Object */](iteratee: lodashLib.lodashMod.underscoreNs.__, collection: T): LodashKeyBy2x2[T] = js.native
  def apply[T](
    iteratee: lodashLib.lodashMod.underscoreNs.__,
    collection: lodashLib.lodashMod.underscoreNs.List[T]
  ): LodashKeyBy1x2[T] = js.native
}

