package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChannelAssignedTargetingOptionDetails extends StObject {
  
  /**
    * Required. ID of the channel. Should refer to the channel ID field on a [Partner-owned channel](partners.channels#Channel.FIELDS.channel_id) or [advertiser-owned channel](advertisers.channels#Channel.FIELDS.channel_id) resource.
    */
  var channelId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates if this option is being negatively targeted. For advertiser level assigned targeting option, this field must be true.
    */
  var negative: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaChannelAssignedTargetingOptionDetails {
  
  inline def apply(): SchemaChannelAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelAssignedTargetingOptionDetails]
  }
  
  extension [Self <: SchemaChannelAssignedTargetingOptionDetails](x: Self) {
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setChannelIdNull: Self = StObject.set(x, "channelId", null)
    
    inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    inline def setNegative(value: Boolean): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
    
    inline def setNegativeNull: Self = StObject.set(x, "negative", null)
    
    inline def setNegativeUndefined: Self = StObject.set(x, "negative", js.undefined)
  }
}
