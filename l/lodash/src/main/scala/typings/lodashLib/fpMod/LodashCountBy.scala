package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashCountBy extends js.Object {
  def apply[T](iteratee: lodashLib.lodashMod.ValueIteratee[T]): LodashCountBy1x1[T] = js.native
  def apply[T /* <: js.Object */](
    iteratee: lodashLib.lodashMod.ValueIteratee[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any],
    collection: T
  ): lodashLib.lodashMod.Dictionary[scala.Double] = js.native
  def apply[T](iteratee: lodashLib.lodashMod.ValueIteratee[T], collection: lodashLib.lodashMod.List[T]): lodashLib.lodashMod.Dictionary[scala.Double] = js.native
  def apply[T /* <: js.Object */](iteratee: lodashLib.lodashMod.__): LodashCountBy2x2[T] = js.native
  def apply[T /* <: js.Object */](iteratee: lodashLib.lodashMod.__, collection: T): LodashCountBy2x2[T] = js.native
  def apply[T](iteratee: lodashLib.lodashMod.__, collection: lodashLib.lodashMod.List[T]): LodashCountBy1x2[T] = js.native
}

