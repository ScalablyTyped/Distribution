package typings.lodash.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RightCurriedFunction3[T1, T2, T3, R] extends StObject {
  
  def apply(): RightCurriedFunction3[T1, T2, T3, R] = js.native
  def apply(t1: T1, t2: T2, t3: T3): R = js.native
  def apply(t1: T1, t2: T2, t3: __): RightCurriedFunction1[T3, R] = js.native
  def apply(t1: T1, t2: __, t3: T3): RightCurriedFunction1[T2, R] = js.native
  def apply(t1: T1, t2: __, t3: __): RightCurriedFunction2[T2, T3, R] = js.native
  def apply(t2: T2, t3: T3): RightCurriedFunction1[T1, R] = js.native
  def apply(t2: T2, t3: __): RightCurriedFunction2[T1, T3, R] = js.native
  def apply(t3: T3): RightCurriedFunction2[T1, T2, R] = js.native
}
