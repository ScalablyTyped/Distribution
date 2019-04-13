package typings
package lovefieldLib.lovefieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Order extends js.Object

@JSImport("lovefield", "Order")
@js.native
object Order extends js.Object {
  @js.native
  sealed trait ASC
    extends lovefieldLib.lovefieldMod.Order
  
  @js.native
  sealed trait DESC
    extends lovefieldLib.lovefieldMod.Order
  
  val ASC: ASC with java.lang.String = js.native
  val DESC: DESC with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[lovefieldLib.lovefieldMod.Order with java.lang.String] = js.native
}

