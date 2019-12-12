package typings.lovefield.lovefieldMod

import org.scalablytyped.runtime.TopLevel
import typings.lovefield.lovefieldMod.Order.ASC
import typings.lovefield.lovefieldMod.Order.DESC
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Order with Double] = js.native
  /* 0 */ @js.native
  object ASC extends TopLevel[ASC with Double]
  
  /* 1 */ @js.native
  object DESC extends TopLevel[DESC with Double]
  
}

