package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepricingRuleReportBuyboxWinningRuleStats extends StObject {
  
  /** Number of unique products that won the buybox with this rule during this period of time. */
  var buyboxWonProductCount: js.UndefOr[Double] = js.undefined
}
object RepricingRuleReportBuyboxWinningRuleStats {
  
  inline def apply(): RepricingRuleReportBuyboxWinningRuleStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepricingRuleReportBuyboxWinningRuleStats]
  }
  
  extension [Self <: RepricingRuleReportBuyboxWinningRuleStats](x: Self) {
    
    inline def setBuyboxWonProductCount(value: Double): Self = StObject.set(x, "buyboxWonProductCount", value.asInstanceOf[js.Any])
    
    inline def setBuyboxWonProductCountUndefined: Self = StObject.set(x, "buyboxWonProductCount", js.undefined)
  }
}
