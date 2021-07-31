package typings.lovefield.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Order extends StObject
@JSImport("lovefield", "Order")
@js.native
object Order extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Order & Double] = js.native
  
  @js.native
  sealed trait ASC
    extends StObject
       with Order
  /* 0 */ val ASC: typings.lovefield.mod.Order.ASC & Double = js.native
  
  @js.native
  sealed trait DESC
    extends StObject
       with Order
  /* 1 */ val DESC: typings.lovefield.mod.Order.DESC & Double = js.native
}
