package typings.mailchimpMailchimpMarketing.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberStats extends StObject {
  
  var avg_click_rate: Double
  
  var avg_open_rate: Double
  
  var ecommerce_data: MemberEcommerceData
}
object MemberStats {
  
  inline def apply(avg_click_rate: Double, avg_open_rate: Double, ecommerce_data: MemberEcommerceData): MemberStats = {
    val __obj = js.Dynamic.literal(avg_click_rate = avg_click_rate.asInstanceOf[js.Any], avg_open_rate = avg_open_rate.asInstanceOf[js.Any], ecommerce_data = ecommerce_data.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberStats]
  }
  
  extension [Self <: MemberStats](x: Self) {
    
    inline def setAvg_click_rate(value: Double): Self = StObject.set(x, "avg_click_rate", value.asInstanceOf[js.Any])
    
    inline def setAvg_open_rate(value: Double): Self = StObject.set(x, "avg_open_rate", value.asInstanceOf[js.Any])
    
    inline def setEcommerce_data(value: MemberEcommerceData): Self = StObject.set(x, "ecommerce_data", value.asInstanceOf[js.Any])
  }
}
