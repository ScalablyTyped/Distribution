package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DealServingMetadata extends js.Object {
  
  /** True if alcohol ads are allowed for this deal (read-only). This field is only populated when querying for finalized orders using the method GetFinalizedOrderDeals */
  var alcoholAdsAllowed: js.UndefOr[Boolean] = js.native
  
  /** Tracks which parties (if any) have paused a deal. (readonly, except via PauseResumeOrderDeals action) */
  var dealPauseStatus: js.UndefOr[DealServingMetadataDealPauseStatus] = js.native
}
object DealServingMetadata {
  
  @scala.inline
  def apply(): DealServingMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DealServingMetadata]
  }
  
  @scala.inline
  implicit class DealServingMetadataOps[Self <: DealServingMetadata] (val x: Self) extends AnyVal {
    
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
    def setAlcoholAdsAllowed(value: Boolean): Self = this.set("alcoholAdsAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlcoholAdsAllowed: Self = this.set("alcoholAdsAllowed", js.undefined)
    
    @scala.inline
    def setDealPauseStatus(value: DealServingMetadataDealPauseStatus): Self = this.set("dealPauseStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDealPauseStatus: Self = this.set("dealPauseStatus", js.undefined)
  }
}
