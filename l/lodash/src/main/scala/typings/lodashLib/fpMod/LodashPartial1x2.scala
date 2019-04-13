package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPartial1x2[T1] extends js.Object {
  def apply[R](func: lodashLib.lodashMod.Function1[T1, R]): lodashLib.lodashMod.Function0[R] = js.native
  def apply[T2, R](func: lodashLib.lodashMod.Function2[T1, T2, R]): lodashLib.lodashMod.Function1[T2, R] = js.native
  def apply[T2, T3, R](func: lodashLib.lodashMod.Function3[T1, T2, T3, R]): lodashLib.lodashMod.Function2[T2, T3, R] = js.native
  def apply[T2, T3, T4, R](func: lodashLib.lodashMod.Function4[T1, T2, T3, T4, R]): lodashLib.lodashMod.Function3[T2, T3, T4, R] = js.native
}

