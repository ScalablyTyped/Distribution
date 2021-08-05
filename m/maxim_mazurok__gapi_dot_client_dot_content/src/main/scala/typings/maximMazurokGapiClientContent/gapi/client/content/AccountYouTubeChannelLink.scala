package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountYouTubeChannelLink extends StObject {
  
  /** Channel ID. */
  var channelId: js.UndefOr[String] = js.undefined
  
  /**
    * Status of the link between this Merchant Center account and the YouTube channel. Upon retrieval, it represents the actual status of the link and can be either `active` if it was
    * approved in YT Creator Studio or `pending` if it's pending approval. Upon insertion, it represents the *intended* status of the link. Re-uploading a link with status `active` when
    * it's still pending or with status `pending` when it's already active will have no effect: the status will remain unchanged. Re-uploading a link with deprecated status `inactive` is
    * equivalent to not submitting the link at all and will delete the link if it was active or cancel the link request if it was pending.
    */
  var status: js.UndefOr[String] = js.undefined
}
object AccountYouTubeChannelLink {
  
  inline def apply(): AccountYouTubeChannelLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountYouTubeChannelLink]
  }
  
  extension [Self <: AccountYouTubeChannelLink](x: Self) {
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
