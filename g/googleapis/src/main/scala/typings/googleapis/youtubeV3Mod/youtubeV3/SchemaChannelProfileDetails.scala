package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaChannelProfileDetails extends StObject {
  
  /**
    * The YouTube channel ID.
    */
  var channelId: js.UndefOr[String] = js.native
  
  /**
    * The channel&#39;s URL.
    */
  var channelUrl: js.UndefOr[String] = js.native
  
  /**
    * The channel&#39;s display name.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * The channels&#39;s avatar URL.
    */
  var profileImageUrl: js.UndefOr[String] = js.native
}
object SchemaChannelProfileDetails {
  
  @scala.inline
  def apply(): SchemaChannelProfileDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelProfileDetails]
  }
  
  @scala.inline
  implicit class SchemaChannelProfileDetailsMutableBuilder[Self <: SchemaChannelProfileDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    @scala.inline
    def setChannelUrl(value: String): Self = StObject.set(x, "channelUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelUrlUndefined: Self = StObject.set(x, "channelUrl", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setProfileImageUrl(value: String): Self = StObject.set(x, "profileImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileImageUrlUndefined: Self = StObject.set(x, "profileImageUrl", js.undefined)
  }
}
