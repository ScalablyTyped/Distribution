package typings.hullJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hull.js", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(pointSet: js.Array[js.Array[Double] | js.Object]): js.Array[Double] = js.native
  def apply(
    pointSet: js.Array[js.Array[Double] | js.Object],
    concavity: js.UndefOr[scala.Nothing],
    format: js.Array[String]
  ): js.Array[Double] = js.native
  def apply(pointSet: js.Array[js.Array[Double] | js.Object], concavity: Double): js.Array[Double] = js.native
  def apply(pointSet: js.Array[js.Array[Double] | js.Object], concavity: Double, format: js.Array[String]): js.Array[Double] = js.native
}
