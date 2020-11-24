package typings.lodash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RightCurriedFunction4[T1, T2, T3, T4, R] extends js.Object {
  
  def apply(): RightCurriedFunction4[T1, T2, T3, T4, R] = js.native
  def apply(t1: T1, t2: T2, t3: T3, t4: T4): R = js.native
  def apply(t1: T1, t2: T2, t3: T3, t4: __): RightCurriedFunction1[T4, R] = js.native
  def apply(t1: T1, t2: T2, t3: __, t4: T4): RightCurriedFunction1[T3, R] = js.native
  def apply(t1: T1, t2: T2, t3: __, t4: __): RightCurriedFunction2[T3, T4, R] = js.native
  def apply(t1: T1, t2: __, t3: T3, t4: T4): RightCurriedFunction1[T2, R] = js.native
  def apply(t1: T1, t2: __, t3: T3, t4: __): RightCurriedFunction2[T2, T4, R] = js.native
  def apply(t1: T1, t2: __, t3: __, t4: T4): RightCurriedFunction2[T2, T3, R] = js.native
  def apply(t1: T1, t2: __, t3: __, t4: __): RightCurriedFunction3[T2, T3, T4, R] = js.native
  def apply(t2: T2, t3: T3, t4: T4): RightCurriedFunction1[T1, R] = js.native
  def apply(t2: T2, t3: T3, t4: __): RightCurriedFunction2[T1, T4, R] = js.native
  def apply(t2: T2, t3: __, t4: T4): RightCurriedFunction2[T1, T3, R] = js.native
  def apply(t2: T2, t3: __, t4: __): RightCurriedFunction3[T1, T3, T4, R] = js.native
  def apply(t3: T3, t4: T4): RightCurriedFunction2[T1, T2, R] = js.native
  def apply(t3: T3, t4: __): RightCurriedFunction3[T1, T2, T4, R] = js.native
  def apply(t4: T4): RightCurriedFunction3[T1, T2, T3, R] = js.native
}
