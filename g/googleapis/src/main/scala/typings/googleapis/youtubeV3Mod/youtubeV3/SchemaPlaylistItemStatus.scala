package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about the playlist item&#39;s privacy status.
  */
trait SchemaPlaylistItemStatus extends StObject {
  
  /**
    * This resource&#39;s privacy status.
    */
  var privacyStatus: js.UndefOr[String] = js.undefined
}
object SchemaPlaylistItemStatus {
  
  inline def apply(): SchemaPlaylistItemStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlaylistItemStatus]
  }
  
  extension [Self <: SchemaPlaylistItemStatus](x: Self) {
    
    inline def setPrivacyStatus(value: String): Self = StObject.set(x, "privacyStatus", value.asInstanceOf[js.Any])
    
    inline def setPrivacyStatusUndefined: Self = StObject.set(x, "privacyStatus", js.undefined)
  }
}
