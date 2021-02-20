package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelAssignedTargetingOptionDetails extends StObject {
  
  /**
    * Required. ID of the channel. Should refer to the channel ID field on a [Partner-owned channel](partners.channels#Channel.FIELDS.channel_id) or [advertiser-owned
    * channel](advertisers.channels#Channel.FIELDS.channel_id) resource.
    */
  var channelId: js.UndefOr[String] = js.native
  
  /** Indicates if this option is being negatively targeted. For advertiser level assigned targeting option, this field must be true. */
  var negative: js.UndefOr[Boolean] = js.native
}
object ChannelAssignedTargetingOptionDetails {
  
  @scala.inline
  def apply(): ChannelAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelAssignedTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class ChannelAssignedTargetingOptionDetailsMutableBuilder[Self <: ChannelAssignedTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    @scala.inline
    def setNegative(value: Boolean): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegativeUndefined: Self = StObject.set(x, "negative", js.undefined)
  }
}
