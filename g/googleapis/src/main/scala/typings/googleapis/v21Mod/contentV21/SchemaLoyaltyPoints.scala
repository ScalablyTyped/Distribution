package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLoyaltyPoints extends StObject {
  
  /**
    * Name of loyalty points program. It is recommended to limit the name to 12
    * full-width characters or 24 Roman characters.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The retailer&#39;s loyalty points in absolute value.
    */
  var pointsValue: js.UndefOr[String] = js.undefined
  
  /**
    * The ratio of a point when converted to currency. Google assumes currency
    * based on Merchant Center settings. If ratio is left out, it defaults
    * to 1.0.
    */
  var ratio: js.UndefOr[Double] = js.undefined
}
object SchemaLoyaltyPoints {
  
  inline def apply(): SchemaLoyaltyPoints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLoyaltyPoints]
  }
  
  extension [Self <: SchemaLoyaltyPoints](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPointsValue(value: String): Self = StObject.set(x, "pointsValue", value.asInstanceOf[js.Any])
    
    inline def setPointsValueUndefined: Self = StObject.set(x, "pointsValue", js.undefined)
    
    inline def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    
    inline def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
  }
}
