package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRepricingProductReportBuyboxWinningProductStats extends StObject {
  
  /**
    * Number of times this product won the buybox with these rules during this time period.
    */
  var buyboxWinsCount: js.UndefOr[Double | Null] = js.undefined
}
object SchemaRepricingProductReportBuyboxWinningProductStats {
  
  inline def apply(): SchemaRepricingProductReportBuyboxWinningProductStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRepricingProductReportBuyboxWinningProductStats]
  }
  
  extension [Self <: SchemaRepricingProductReportBuyboxWinningProductStats](x: Self) {
    
    inline def setBuyboxWinsCount(value: Double): Self = StObject.set(x, "buyboxWinsCount", value.asInstanceOf[js.Any])
    
    inline def setBuyboxWinsCountNull: Self = StObject.set(x, "buyboxWinsCount", null)
    
    inline def setBuyboxWinsCountUndefined: Self = StObject.set(x, "buyboxWinsCount", js.undefined)
  }
}
