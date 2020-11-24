package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsServiceAccountResponsePromotionsUnit extends js.Object {
  
  var summary_promotions: InsightsServiceAccountResponseSummaryPromotions = js.native
}
object InsightsServiceAccountResponsePromotionsUnit {
  
  @scala.inline
  def apply(summary_promotions: InsightsServiceAccountResponseSummaryPromotions): InsightsServiceAccountResponsePromotionsUnit = {
    val __obj = js.Dynamic.literal(summary_promotions = summary_promotions.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponsePromotionsUnit]
  }
  
  @scala.inline
  implicit class InsightsServiceAccountResponsePromotionsUnitOps[Self <: InsightsServiceAccountResponsePromotionsUnit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSummary_promotions(value: InsightsServiceAccountResponseSummaryPromotions): Self = this.set("summary_promotions", value.asInstanceOf[js.Any])
  }
}
