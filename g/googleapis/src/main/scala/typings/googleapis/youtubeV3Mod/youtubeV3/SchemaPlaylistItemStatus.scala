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
  
  @scala.inline
  def apply(): SchemaPlaylistItemStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlaylistItemStatus]
  }
  
  @scala.inline
  implicit class SchemaPlaylistItemStatusMutableBuilder[Self <: SchemaPlaylistItemStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrivacyStatus(value: String): Self = StObject.set(x, "privacyStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivacyStatusUndefined: Self = StObject.set(x, "privacyStatus", js.undefined)
  }
}
