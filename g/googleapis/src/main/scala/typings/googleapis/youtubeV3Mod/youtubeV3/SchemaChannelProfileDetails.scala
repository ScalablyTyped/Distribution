package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChannelProfileDetails extends StObject {
  
  /**
    * The YouTube channel ID.
    */
  var channelId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The channel's URL.
    */
  var channelUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The channel's display name.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The channels's avatar URL.
    */
  var profileImageUrl: js.UndefOr[String | Null] = js.undefined
}
object SchemaChannelProfileDetails {
  
  inline def apply(): SchemaChannelProfileDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelProfileDetails]
  }
  
  extension [Self <: SchemaChannelProfileDetails](x: Self) {
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setChannelIdNull: Self = StObject.set(x, "channelId", null)
    
    inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    inline def setChannelUrl(value: String): Self = StObject.set(x, "channelUrl", value.asInstanceOf[js.Any])
    
    inline def setChannelUrlNull: Self = StObject.set(x, "channelUrl", null)
    
    inline def setChannelUrlUndefined: Self = StObject.set(x, "channelUrl", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setProfileImageUrl(value: String): Self = StObject.set(x, "profileImageUrl", value.asInstanceOf[js.Any])
    
    inline def setProfileImageUrlNull: Self = StObject.set(x, "profileImageUrl", null)
    
    inline def setProfileImageUrlUndefined: Self = StObject.set(x, "profileImageUrl", js.undefined)
  }
}
