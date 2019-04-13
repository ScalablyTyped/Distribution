package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashOrderBy3x4[T] extends js.Object {
  def apply(
    iteratees: lodashLib.lodashMod.Many[
      lodashLib.lodashMod.ValueIteratee[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
    ]
  ): LodashOrderBy4x5[T] = js.native
  def apply(
    iteratees: lodashLib.lodashMod.Many[
      (js.Function1[
        /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
        lodashLib.lodashMod.NotVoid
      ]) | (lodashLib.lodashMod.ValueIteratee[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any])
    ],
    orders: lodashLib.lodashMod.Many[scala.Boolean | lodashLib.lodashLibStrings.asc | lodashLib.lodashLibStrings.desc]
  ): js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any] = js.native
  def apply(
    iteratees: lodashLib.lodashMod.__,
    orders: lodashLib.lodashMod.Many[scala.Boolean | lodashLib.lodashLibStrings.asc | lodashLib.lodashLibStrings.desc]
  ): LodashOrderBy3x6[T] = js.native
}

