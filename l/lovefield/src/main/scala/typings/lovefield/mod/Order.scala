package typings.lovefield.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Order extends js.Object
@JSImport("lovefield", "Order")
@js.native
object Order extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Order with Double] = js.native
  
  @js.native
  sealed trait ASC extends Order
  /* 0 */ @js.native
  object ASC extends TopLevel[ASC with Double]
  
  @js.native
  sealed trait DESC extends Order
  /* 1 */ @js.native
  object DESC extends TopLevel[DESC with Double]
}
