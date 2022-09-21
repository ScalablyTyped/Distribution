package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Channel extends StObject {
  
  /** The ID of the advertiser that owns the channel. */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /** Output only. The unique ID of the channel. Assigned by the system. */
  var channelId: js.UndefOr[String] = js.undefined
  
  /** Required. The display name of the channel. Must be UTF-8 encoded with a maximum length of 240 bytes. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Output only. The resource name of the channel. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. Number of line items that are directly targeting this channel negatively. */
  var negativelyTargetedLineItemCount: js.UndefOr[String] = js.undefined
  
  /** The ID of the partner that owns the channel. */
  var partnerId: js.UndefOr[String] = js.undefined
  
  /** Output only. Number of line items that are directly targeting this channel positively. */
  var positivelyTargetedLineItemCount: js.UndefOr[String] = js.undefined
}
object Channel {
  
  inline def apply(): Channel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Channel]
  }
  
  extension [Self <: Channel](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNegativelyTargetedLineItemCount(value: String): Self = StObject.set(x, "negativelyTargetedLineItemCount", value.asInstanceOf[js.Any])
    
    inline def setNegativelyTargetedLineItemCountUndefined: Self = StObject.set(x, "negativelyTargetedLineItemCount", js.undefined)
    
    inline def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
    
    inline def setPartnerIdUndefined: Self = StObject.set(x, "partnerId", js.undefined)
    
    inline def setPositivelyTargetedLineItemCount(value: String): Self = StObject.set(x, "positivelyTargetedLineItemCount", value.asInstanceOf[js.Any])
    
    inline def setPositivelyTargetedLineItemCountUndefined: Self = StObject.set(x, "positivelyTargetedLineItemCount", js.undefined)
  }
}
