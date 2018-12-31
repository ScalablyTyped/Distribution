package typings
package lodashLib.fpMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashOrderBy1x2 extends js.Object {
  def apply[T](
    iteratees: lodashLib.lodashMod.underscoreNs.Many[lodashLib.lodashMod.underscoreNs.ValueIteratee[T]]
  ): LodashOrderBy2x3[T] = js.native
  def apply[T /* <: js.Object */](
    iteratees: lodashLib.lodashMod.underscoreNs.Many[
      (js.Function1[
        /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
        lodashLib.lodashMod.underscoreNs.NotVoid
      ]) | (lodashLib.lodashMod.underscoreNs.ValueIteratee[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any])
    ],
    collection: T
  ): js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any] = js.native
  def apply[T](
    iteratees: lodashLib.lodashMod.underscoreNs.Many[
      (js.Function1[/* value */ T, lodashLib.lodashMod.underscoreNs.NotVoid]) | lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
    ],
    collection: lodashLib.lodashMod.underscoreNs.List[T]
  ): js.Array[T] = js.native
  def apply[T /* <: js.Object */](iteratees: lodashLib.lodashMod.underscoreNs.`__`): LodashOrderBy3x6[T] = js.native
  def apply[T /* <: js.Object */](iteratees: lodashLib.lodashMod.underscoreNs.`__`, collection: T): LodashOrderBy3x6[T] = js.native
  def apply[T](
    iteratees: lodashLib.lodashMod.underscoreNs.`__`,
    collection: lodashLib.lodashMod.underscoreNs.List[T]
  ): LodashOrderBy1x6[T] = js.native
}

