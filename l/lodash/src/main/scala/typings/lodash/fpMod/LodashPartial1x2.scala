package typings.lodash.fpMod

import typings.lodash.mod.Function1
import typings.lodash.mod.Function2
import typings.lodash.mod.Function3
import typings.lodash.mod.Function4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashPartial1x2[T2] extends StObject {
  
  def apply[T1, R](func: Function2[T1, T2, R]): Function1[T1, R] = js.native
  def apply[T1, T3, R](func: Function3[T1, T2, T3, R]): Function2[T1, T3, R] = js.native
  def apply[T1, T3, T4, R](func: Function4[T1, T2, T3, T4, R]): Function3[T1, T3, T4, R] = js.native
}
