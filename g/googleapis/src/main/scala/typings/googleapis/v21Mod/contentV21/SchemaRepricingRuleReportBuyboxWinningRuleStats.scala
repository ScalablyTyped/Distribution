package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRepricingRuleReportBuyboxWinningRuleStats extends StObject {
  
  /**
    * Number of unique products that won the buybox with this rule during this period of time.
    */
  var buyboxWonProductCount: js.UndefOr[Double | Null] = js.undefined
}
object SchemaRepricingRuleReportBuyboxWinningRuleStats {
  
  inline def apply(): SchemaRepricingRuleReportBuyboxWinningRuleStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRepricingRuleReportBuyboxWinningRuleStats]
  }
  
  extension [Self <: SchemaRepricingRuleReportBuyboxWinningRuleStats](x: Self) {
    
    inline def setBuyboxWonProductCount(value: Double): Self = StObject.set(x, "buyboxWonProductCount", value.asInstanceOf[js.Any])
    
    inline def setBuyboxWonProductCountNull: Self = StObject.set(x, "buyboxWonProductCount", null)
    
    inline def setBuyboxWonProductCountUndefined: Self = StObject.set(x, "buyboxWonProductCount", js.undefined)
  }
}
