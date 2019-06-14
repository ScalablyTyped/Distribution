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
  
  /* 0 */ val ASC: ASC with scala.Double = js.native
  /* 1 */ val DESC: DESC with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[lovefieldLib.lovefieldMod.Order with scala.Double] = js.native
}

