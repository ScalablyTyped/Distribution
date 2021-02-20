package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for the status part of a channel.
  */
@js.native
trait SchemaChannelStatus extends StObject {
  
  /**
    * If true, then the user is linked to either a YouTube username or G+
    * account. Otherwise, the user doesn&#39;t have a public YouTube identity.
    */
  var isLinked: js.UndefOr[Boolean] = js.native
  
  /**
    * The long uploads status of this channel. See
    */
  var longUploadsStatus: js.UndefOr[String] = js.native
  
  /**
    * Privacy status of the channel.
    */
  var privacyStatus: js.UndefOr[String] = js.native
}
object SchemaChannelStatus {
  
  @scala.inline
  def apply(): SchemaChannelStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelStatus]
  }
  
  @scala.inline
  implicit class SchemaChannelStatusMutableBuilder[Self <: SchemaChannelStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsLinked(value: Boolean): Self = StObject.set(x, "isLinked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLinkedUndefined: Self = StObject.set(x, "isLinked", js.undefined)
    
    @scala.inline
    def setLongUploadsStatus(value: String): Self = StObject.set(x, "longUploadsStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongUploadsStatusUndefined: Self = StObject.set(x, "longUploadsStatus", js.undefined)
    
    @scala.inline
    def setPrivacyStatus(value: String): Self = StObject.set(x, "privacyStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivacyStatusUndefined: Self = StObject.set(x, "privacyStatus", js.undefined)
  }
}
