package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashFindKey extends js.Object {
  def apply[T](predicate: lodashLib.lodashMod.ValueIteratee[T]): LodashFindKey1x1[T] = js.native
  def apply[T](
    predicate: lodashLib.lodashMod.ValueIteratee[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any],
    `object`: T
  ): js.UndefOr[java.lang.String] = js.native
  def apply[T](predicate: lodashLib.lodashMod.__): LodashFindKey1x2[T] = js.native
  def apply[T](predicate: lodashLib.lodashMod.__, `object`: T): LodashFindKey1x2[T] = js.native
}

