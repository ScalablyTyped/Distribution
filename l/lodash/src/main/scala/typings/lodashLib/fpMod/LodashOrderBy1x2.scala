package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashOrderBy1x2 extends js.Object {
  def apply[T](
    iteratees: lodashLib.lodashMod.Many[
      (js.Function1[/* value */ T, lodashLib.lodashMod.NotVoid]) | lodashLib.lodashMod.ValueIteratee[T]
    ]
  ): js.Array[T] = js.native
  def apply[T /* <: js.Object */](
    iteratees: lodashLib.lodashMod.Many[
      (js.Function1[
        /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
        lodashLib.lodashMod.NotVoid
      ]) | (lodashLib.lodashMod.ValueIteratee[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any])
    ],
    collection: T
  ): js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any] = js.native
  def apply[T](
    iteratees: lodashLib.lodashMod.Many[
      (js.Function1[/* value */ T, lodashLib.lodashMod.NotVoid]) | lodashLib.lodashMod.ValueIteratee[T]
    ],
    collection: lodashLib.lodashMod.List[T]
  ): js.Array[T] = js.native
  def apply[T /* <: js.Object */](iteratees: lodashLib.lodashMod.__): LodashOrderBy3x6[T] = js.native
  def apply[T /* <: js.Object */](iteratees: lodashLib.lodashMod.__, collection: T): LodashOrderBy3x6[T] = js.native
  def apply[T](iteratees: lodashLib.lodashMod.__, collection: lodashLib.lodashMod.List[T]): LodashOrderBy1x6[T] = js.native
}

