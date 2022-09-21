package typings.googletag.googletag

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Public interface for ResponseInformation.
  *
  * **See also**
  * - {@link Slot.getResponseInformation}
  */
trait ResponseInformation extends StObject {
  
  /**
    * The ID of the advertiser.
    */
  var advertiserId: Double | Null
  
  /**
    * The ID of the campaign.
    */
  var campaignId: Double | Null
  
  /**
    * The ID of the creative.
    */
  var creativeId: Double | Null
  
  /**
    * The template id of the ad.
    */
  var creativeTemplateId: Double | Null
  
  /**
    * The ID of the line item.
    */
  var lineItemId: Double | Null
}
object ResponseInformation {
  
  inline def apply(): ResponseInformation = {
    val __obj = js.Dynamic.literal(advertiserId = null, campaignId = null, creativeId = null, creativeTemplateId = null, lineItemId = null)
    __obj.asInstanceOf[ResponseInformation]
  }
  
  extension [Self <: ResponseInformation](x: Self) {
    
    inline def setAdvertiserId(value: Double): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdNull: Self = StObject.set(x, "advertiserId", null)
    
    inline def setCampaignId(value: Double): Self = StObject.set(x, "campaignId", value.asInstanceOf[js.Any])
    
    inline def setCampaignIdNull: Self = StObject.set(x, "campaignId", null)
    
    inline def setCreativeId(value: Double): Self = StObject.set(x, "creativeId", value.asInstanceOf[js.Any])
    
    inline def setCreativeIdNull: Self = StObject.set(x, "creativeId", null)
    
    inline def setCreativeTemplateId(value: Double): Self = StObject.set(x, "creativeTemplateId", value.asInstanceOf[js.Any])
    
    inline def setCreativeTemplateIdNull: Self = StObject.set(x, "creativeTemplateId", null)
    
    inline def setLineItemId(value: Double): Self = StObject.set(x, "lineItemId", value.asInstanceOf[js.Any])
    
    inline def setLineItemIdNull: Self = StObject.set(x, "lineItemId", null)
  }
}
