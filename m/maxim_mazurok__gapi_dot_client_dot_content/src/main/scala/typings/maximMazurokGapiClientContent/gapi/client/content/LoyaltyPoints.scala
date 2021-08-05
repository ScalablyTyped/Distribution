package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoyaltyPoints extends StObject {
  
  /** Name of loyalty points program. It is recommended to limit the name to 12 full-width characters or 24 Roman characters. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The retailer's loyalty points in absolute value. */
  var pointsValue: js.UndefOr[String] = js.undefined
  
  /** The ratio of a point when converted to currency. Google assumes currency based on Merchant Center settings. If ratio is left out, it defaults to 1.0. */
  var ratio: js.UndefOr[Double] = js.undefined
}
object LoyaltyPoints {
  
  inline def apply(): LoyaltyPoints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoyaltyPoints]
  }
  
  extension [Self <: LoyaltyPoints](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPointsValue(value: String): Self = StObject.set(x, "pointsValue", value.asInstanceOf[js.Any])
    
    inline def setPointsValueUndefined: Self = StObject.set(x, "pointsValue", js.undefined)
    
    inline def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    
    inline def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
  }
}
