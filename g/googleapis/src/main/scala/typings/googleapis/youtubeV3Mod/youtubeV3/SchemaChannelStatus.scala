package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChannelStatus extends StObject {
  
  /**
    * If true, then the user is linked to either a YouTube username or G+ account. Otherwise, the user doesn't have a public YouTube identity.
    */
  var isLinked: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The long uploads status of this channel. See https://support.google.com/youtube/answer/71673 for more information.
    */
  var longUploadsStatus: js.UndefOr[String | Null] = js.undefined
  
  var madeForKids: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Privacy status of the channel.
    */
  var privacyStatus: js.UndefOr[String | Null] = js.undefined
  
  var selfDeclaredMadeForKids: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaChannelStatus {
  
  inline def apply(): SchemaChannelStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelStatus]
  }
  
  extension [Self <: SchemaChannelStatus](x: Self) {
    
    inline def setIsLinked(value: Boolean): Self = StObject.set(x, "isLinked", value.asInstanceOf[js.Any])
    
    inline def setIsLinkedNull: Self = StObject.set(x, "isLinked", null)
    
    inline def setIsLinkedUndefined: Self = StObject.set(x, "isLinked", js.undefined)
    
    inline def setLongUploadsStatus(value: String): Self = StObject.set(x, "longUploadsStatus", value.asInstanceOf[js.Any])
    
    inline def setLongUploadsStatusNull: Self = StObject.set(x, "longUploadsStatus", null)
    
    inline def setLongUploadsStatusUndefined: Self = StObject.set(x, "longUploadsStatus", js.undefined)
    
    inline def setMadeForKids(value: Boolean): Self = StObject.set(x, "madeForKids", value.asInstanceOf[js.Any])
    
    inline def setMadeForKidsNull: Self = StObject.set(x, "madeForKids", null)
    
    inline def setMadeForKidsUndefined: Self = StObject.set(x, "madeForKids", js.undefined)
    
    inline def setPrivacyStatus(value: String): Self = StObject.set(x, "privacyStatus", value.asInstanceOf[js.Any])
    
    inline def setPrivacyStatusNull: Self = StObject.set(x, "privacyStatus", null)
    
    inline def setPrivacyStatusUndefined: Self = StObject.set(x, "privacyStatus", js.undefined)
    
    inline def setSelfDeclaredMadeForKids(value: Boolean): Self = StObject.set(x, "selfDeclaredMadeForKids", value.asInstanceOf[js.Any])
    
    inline def setSelfDeclaredMadeForKidsNull: Self = StObject.set(x, "selfDeclaredMadeForKids", null)
    
    inline def setSelfDeclaredMadeForKidsUndefined: Self = StObject.set(x, "selfDeclaredMadeForKids", js.undefined)
  }
}
