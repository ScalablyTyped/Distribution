package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CampaignManagerIds extends StObject {
  
  /** Ad ID for Campaign Manager. */
  var adId: js.UndefOr[String] = js.undefined
  
  /** Campaign ID for Campaign Manager. */
  var campaignId: js.UndefOr[String] = js.undefined
  
  /** Creative ID for Campaign Manager. */
  var creativeId: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#campaignManagerIds". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Placement ID for Campaign Manager. */
  var placementId: js.UndefOr[String] = js.undefined
  
  /** Site ID for Campaign Manager. */
  var siteId: js.UndefOr[String] = js.undefined
}
object CampaignManagerIds {
  
  @scala.inline
  def apply(): CampaignManagerIds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CampaignManagerIds]
  }
  
  @scala.inline
  implicit class CampaignManagerIdsMutableBuilder[Self <: CampaignManagerIds] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdId(value: String): Self = StObject.set(x, "adId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdIdUndefined: Self = StObject.set(x, "adId", js.undefined)
    
    @scala.inline
    def setCampaignId(value: String): Self = StObject.set(x, "campaignId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCampaignIdUndefined: Self = StObject.set(x, "campaignId", js.undefined)
    
    @scala.inline
    def setCreativeId(value: String): Self = StObject.set(x, "creativeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeIdUndefined: Self = StObject.set(x, "creativeId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPlacementId(value: String): Self = StObject.set(x, "placementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementIdUndefined: Self = StObject.set(x, "placementId", js.undefined)
    
    @scala.inline
    def setSiteId(value: String): Self = StObject.set(x, "siteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteIdUndefined: Self = StObject.set(x, "siteId", js.undefined)
  }
}
