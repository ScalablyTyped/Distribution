package typings
package lodashLib.fpMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashMapValues2x2[T] extends js.Object {
  def apply(iteratee: java.lang.String): lodashLib.lodashMod.underscoreNs.Dictionary[_] = js.native
  def apply(iteratee: js.Object): lodashLib.lodashMod.underscoreNs.Dictionary[scala.Boolean] = js.native
  def apply[TResult](callback: js.Function1[/* value */ T, TResult]): lodashLib.lodashMod.underscoreNs.Dictionary[TResult] = js.native
  def apply[TKey /* <: java.lang.String */](iteratee: TKey): lodashLib.lodashMod.underscoreNs.Dictionary[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(TKey))) */js.Any
  ] = js.native
}

