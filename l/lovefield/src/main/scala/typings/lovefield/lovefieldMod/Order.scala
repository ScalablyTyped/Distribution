package typings.lovefield.lovefieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Order extends js.Object

@JSImport("lovefield", "Order")
@js.native
object Order extends js.Object {
  @js.native
  sealed trait ASC extends Order
  
  @js.native
  sealed trait DESC extends Order
  
  /* 0 */ val ASC: typings.lovefield.lovefieldMod.Order.ASC with Double = js.native
  /* 1 */ val DESC: typings.lovefield.lovefieldMod.Order.DESC with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Order with Double] = js.native
}

