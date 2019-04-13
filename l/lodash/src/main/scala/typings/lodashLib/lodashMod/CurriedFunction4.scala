package typings
package lodashLib.lodashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurriedFunction4[T1, T2, T3, T4, R] extends js.Object {
  def apply(): CurriedFunction4[T1, T2, T3, T4, R] = js.native
  def apply(t1: T1): CurriedFunction3[T2, T3, T4, R] = js.native
  def apply(t1: T1, t2: T2): CurriedFunction2[T3, T4, R] = js.native
  def apply(t1: T1, t2: T2, t3: T3): CurriedFunction1[T4, R] = js.native
  def apply(t1: T1, t2: T2, t3: T3, t4: T4): R = js.native
  def apply(t1: T1, t2: T2, t3: __, t4: T4): CurriedFunction1[T3, R] = js.native
  def apply(t1: T1, t2: __, t3: T3, t4: T4): CurriedFunction1[T2, R] = js.native
  def apply(t1: T1, t2: __, t3: __, t4: T4): CurriedFunction2[T2, T3, R] = js.native
  def apply(t1: __, t2: T2): CurriedFunction3[T1, T3, T4, R] = js.native
  def apply(t1: __, t2: T2, t3: T3): CurriedFunction2[T1, T4, R] = js.native
  def apply(t1: __, t2: T2, t3: T3, t4: T4): CurriedFunction1[T1, R] = js.native
  def apply(t1: __, t2: T2, t3: __, t4: T4): CurriedFunction2[T1, T3, R] = js.native
  def apply(t1: __, t2: __, t3: T3): CurriedFunction2[T2, T4, R] = js.native
  def apply(t1: __, t2: __, t3: T3, t4: T4): CurriedFunction2[T1, T2, R] = js.native
  def apply(t1: __, t2: __, t3: __, t4: T4): CurriedFunction3[T1, T2, T3, R] = js.native
}

