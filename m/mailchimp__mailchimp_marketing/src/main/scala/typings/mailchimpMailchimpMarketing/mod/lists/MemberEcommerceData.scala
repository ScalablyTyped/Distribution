package typings.mailchimpMailchimpMarketing.mod.lists

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberEcommerceData extends StObject {
  
  var currency_code: Double
  
  var number_of_orders: Double
  
  var total_revenue: Double
}
object MemberEcommerceData {
  
  inline def apply(currency_code: Double, number_of_orders: Double, total_revenue: Double): MemberEcommerceData = {
    val __obj = js.Dynamic.literal(currency_code = currency_code.asInstanceOf[js.Any], number_of_orders = number_of_orders.asInstanceOf[js.Any], total_revenue = total_revenue.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberEcommerceData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MemberEcommerceData] (val x: Self) extends AnyVal {
    
    inline def setCurrency_code(value: Double): Self = StObject.set(x, "currency_code", value.asInstanceOf[js.Any])
    
    inline def setNumber_of_orders(value: Double): Self = StObject.set(x, "number_of_orders", value.asInstanceOf[js.Any])
    
    inline def setTotal_revenue(value: Double): Self = StObject.set(x, "total_revenue", value.asInstanceOf[js.Any])
  }
}
