package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepricingProductReportBuyboxWinningProductStats extends StObject {
  
  /** Number of times this product won the buybox with these rules during this time period. */
  var buyboxWinsCount: js.UndefOr[Double] = js.undefined
}
object RepricingProductReportBuyboxWinningProductStats {
  
  inline def apply(): RepricingProductReportBuyboxWinningProductStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepricingProductReportBuyboxWinningProductStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RepricingProductReportBuyboxWinningProductStats] (val x: Self) extends AnyVal {
    
    inline def setBuyboxWinsCount(value: Double): Self = StObject.set(x, "buyboxWinsCount", value.asInstanceOf[js.Any])
    
    inline def setBuyboxWinsCountUndefined: Self = StObject.set(x, "buyboxWinsCount", js.undefined)
  }
}
