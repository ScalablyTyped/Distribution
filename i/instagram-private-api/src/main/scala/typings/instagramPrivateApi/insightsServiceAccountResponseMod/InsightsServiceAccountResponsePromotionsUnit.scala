package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightsServiceAccountResponsePromotionsUnit extends StObject {
  
  var summary_promotions: InsightsServiceAccountResponseSummaryPromotions
}
object InsightsServiceAccountResponsePromotionsUnit {
  
  inline def apply(summary_promotions: InsightsServiceAccountResponseSummaryPromotions): InsightsServiceAccountResponsePromotionsUnit = {
    val __obj = js.Dynamic.literal(summary_promotions = summary_promotions.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponsePromotionsUnit]
  }
  
  extension [Self <: InsightsServiceAccountResponsePromotionsUnit](x: Self) {
    
    inline def setSummary_promotions(value: InsightsServiceAccountResponseSummaryPromotions): Self = StObject.set(x, "summary_promotions", value.asInstanceOf[js.Any])
  }
}
