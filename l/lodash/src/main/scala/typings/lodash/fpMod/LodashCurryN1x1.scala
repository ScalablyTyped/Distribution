package typings.lodash.fpMod

import typings.lodash.mod.CurriedFunction2
import typings.lodash.mod.CurriedFunction3
import typings.lodash.mod.CurriedFunction4
import typings.lodash.mod.CurriedFunction5
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashCurryN1x1 extends js.Object {
  
  def apply(func: js.Function1[/* repeated */ js.Any, _]): js.Function1[/* repeated */ js.Any, _] = js.native
  def apply[T1, T2, R](func: js.Function2[/* t1 */ T1, /* t2 */ T2, R]): CurriedFunction2[T1, T2, R] = js.native
  def apply[T1, T2, T3, R](func: js.Function3[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, R]): CurriedFunction3[T1, T2, T3, R] = js.native
  def apply[T1, T2, T3, T4, R](func: js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, R]): CurriedFunction4[T1, T2, T3, T4, R] = js.native
  def apply[T1, T2, T3, T4, T5, R](func: js.Function5[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* t5 */ T5, R]): CurriedFunction5[T1, T2, T3, T4, T5, R] = js.native
}
