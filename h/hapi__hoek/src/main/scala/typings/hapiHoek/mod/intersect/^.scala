package typings.hapiHoek.mod.intersect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@hapi/hoek", "intersect")
@js.native
object ^ extends js.Object {
  
  def apply[T1, T2](array1: Array[T1], array2: Array[T2]): js.Array[T1 | T2] = js.native
  def apply[T1, T2](array1: Array[T1], array2: Array[T2], options: Options): js.Array[T1 | T2] = js.native
}
