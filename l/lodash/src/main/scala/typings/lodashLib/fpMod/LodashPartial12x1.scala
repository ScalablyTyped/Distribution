package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPartial12x1[T1, T2, T3, T4, R] extends js.Object {
  def apply(arg1: js.Array[T1]): lodashLib.lodashMod.Function3[T2, T3, T4, R] = js.native
  def apply(arg1: js.Tuple2[T1, T2]): lodashLib.lodashMod.Function2[T3, T4, R] = js.native
  def apply(arg1: js.Tuple3[T1, T2, T3]): lodashLib.lodashMod.Function1[T4, R] = js.native
  def apply(
    arg1: js.Tuple4[
      T1 | lodashLib.lodashMod.__, 
      T2 | lodashLib.lodashMod.__, 
      T3 | lodashLib.lodashMod.__, 
      T4
    ]
  ): lodashLib.lodashMod.Function1[T3, R] = js.native
}

