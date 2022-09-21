package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPlaylistItemStatus extends StObject {
  
  /**
    * This resource's privacy status.
    */
  var privacyStatus: js.UndefOr[String | Null] = js.undefined
}
object SchemaPlaylistItemStatus {
  
  inline def apply(): SchemaPlaylistItemStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlaylistItemStatus]
  }
  
  extension [Self <: SchemaPlaylistItemStatus](x: Self) {
    
    inline def setPrivacyStatus(value: String): Self = StObject.set(x, "privacyStatus", value.asInstanceOf[js.Any])
    
    inline def setPrivacyStatusNull: Self = StObject.set(x, "privacyStatus", null)
    
    inline def setPrivacyStatusUndefined: Self = StObject.set(x, "privacyStatus", js.undefined)
  }
}
