package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DealServingMetadata extends StObject {
  
  /** True if alcohol ads are allowed for this deal (read-only). This field is only populated when querying for finalized orders using the method GetFinalizedOrderDeals */
  var alcoholAdsAllowed: js.UndefOr[Boolean] = js.undefined
  
  /** Tracks which parties (if any) have paused a deal. (readonly, except via PauseResumeOrderDeals action) */
  var dealPauseStatus: js.UndefOr[DealServingMetadataDealPauseStatus] = js.undefined
}
object DealServingMetadata {
  
  @scala.inline
  def apply(): DealServingMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DealServingMetadata]
  }
  
  @scala.inline
  implicit class DealServingMetadataMutableBuilder[Self <: DealServingMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlcoholAdsAllowed(value: Boolean): Self = StObject.set(x, "alcoholAdsAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlcoholAdsAllowedUndefined: Self = StObject.set(x, "alcoholAdsAllowed", js.undefined)
    
    @scala.inline
    def setDealPauseStatus(value: DealServingMetadataDealPauseStatus): Self = StObject.set(x, "dealPauseStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDealPauseStatusUndefined: Self = StObject.set(x, "dealPauseStatus", js.undefined)
  }
}
