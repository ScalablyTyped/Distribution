package typings
package lodashLib.fpMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashOrderBy3x4[T] extends js.Object {
  def apply(
    iteratees: lodashLib.lodashMod.underscoreNs.Many[
      lodashLib.lodashMod.underscoreNs.ValueIteratee[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
    ]
  ): LodashOrderBy4x5[T] = js.native
  def apply(
    iteratees: lodashLib.lodashMod.underscoreNs.Many[
      (js.Function1[
        /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
        lodashLib.lodashMod.underscoreNs.NotVoid
      ]) | (lodashLib.lodashMod.underscoreNs.ValueIteratee[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any])
    ],
    orders: lodashLib.lodashMod.underscoreNs.Many[scala.Boolean | lodashLib.lodashLibStrings.asc | lodashLib.lodashLibStrings.desc]
  ): js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any] = js.native
  def apply(
    iteratees: lodashLib.lodashMod.underscoreNs.`__`,
    orders: lodashLib.lodashMod.underscoreNs.Many[scala.Boolean | lodashLib.lodashLibStrings.asc | lodashLib.lodashLibStrings.desc]
  ): LodashOrderBy3x6[T] = js.native
}

