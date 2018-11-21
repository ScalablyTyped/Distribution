package typings
package justDashPickLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("just-pick", JSImport.Namespace)
@js.native
object justDashPickMod extends js.Object {
  def apply[T, U /* <: java.lang.String */](obj: T, select1: U, selectn: U*): stdLib.Pick[T, U] = js.native
  def apply[T, U /* <: java.lang.String */](obj: T, select: js.Array[U]): stdLib.Pick[T, U] = js.native
}

