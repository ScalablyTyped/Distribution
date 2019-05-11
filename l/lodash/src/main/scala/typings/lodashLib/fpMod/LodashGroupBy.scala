package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashGroupBy extends js.Object {
  def apply[T](iteratee: lodashLib.lodashMod.ValueIteratee[T]): LodashGroupBy1x1[T] = js.native
  def apply[T /* <: js.Object */](
    iteratee: lodashLib.lodashMod.ValueIteratee[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any],
    collection: T
  ): lodashLib.lodashMod.Dictionary[
    js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  def apply[T](iteratee: lodashLib.lodashMod.ValueIteratee[T], collection: lodashLib.lodashMod.List[T]): lodashLib.lodashMod.Dictionary[js.Array[T]] = js.native
  def apply[T](iteratee: lodashLib.lodashMod.__): LodashGroupBy1x2[T] = js.native
  def apply[T /* <: js.Object */](iteratee: lodashLib.lodashMod.__, collection: T): LodashGroupBy2x2[T] = js.native
  def apply[T](iteratee: lodashLib.lodashMod.__, collection: lodashLib.lodashMod.List[T]): LodashGroupBy1x2[T] = js.native
}

