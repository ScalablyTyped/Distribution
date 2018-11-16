package typings
package lodashLib.fpMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashForOwn extends js.Object {
  def apply[T](iteratee: js.Function1[/* value */ T, _]): LodashForOwn1x1[T] = js.native
  def apply[T](
    iteratee: js.Function1[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) *//* value */ js.Any, 
      _
    ],
    `object`: T
  ): js.UndefOr[T | scala.Null] = js.native
  def apply[T](iteratee: lodashLib.lodashMod.underscoreNs.`__`): LodashForOwn2x2[T] = js.native
  def apply[T](iteratee: lodashLib.lodashMod.underscoreNs.`__`, `object`: T): LodashForOwn2x2[T] = js.native
}

