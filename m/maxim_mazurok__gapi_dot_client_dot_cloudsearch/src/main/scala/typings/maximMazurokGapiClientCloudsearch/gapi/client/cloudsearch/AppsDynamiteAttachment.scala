package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteAttachment extends StObject {
  
  /** Revised version of Gmail AddOn attachment approved by API design review. */
  var addOnData: js.UndefOr[GoogleChatV1ContextualAddOnMarkup] = js.undefined
  
  /** The userId for the bot/app that created this data, to be used for attribution of attachments when the attachment was not created by the message sender. */
  var appId: js.UndefOr[AppsDynamiteUserId] = js.undefined
  
  /** To identify an attachment within repeated in a message */
  var attachmentId: js.UndefOr[String] = js.undefined
  
  /** Card AddOn attachment with the possibility for specifying editable widgets. */
  var cardAddOnData: js.UndefOr[AppsDynamiteSharedCard] = js.undefined
  
  /** Deprecated version of Gmail AddOn attachment. */
  var deprecatedAddOnData: js.UndefOr[ContextualAddOnMarkup] = js.undefined
  
  /** Slack attachment. */
  var slackData: js.UndefOr[AppsDynamiteV1ApiCompatV1Attachment] = js.undefined
  
  /** The height of image url as fetched by fife. This field is asynchronously filled. */
  var slackDataImageUrlHeight: js.UndefOr[Double] = js.undefined
}
object AppsDynamiteAttachment {
  
  inline def apply(): AppsDynamiteAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteAttachment]
  }
  
  extension [Self <: AppsDynamiteAttachment](x: Self) {
    
    inline def setAddOnData(value: GoogleChatV1ContextualAddOnMarkup): Self = StObject.set(x, "addOnData", value.asInstanceOf[js.Any])
    
    inline def setAddOnDataUndefined: Self = StObject.set(x, "addOnData", js.undefined)
    
    inline def setAppId(value: AppsDynamiteUserId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    inline def setAttachmentId(value: String): Self = StObject.set(x, "attachmentId", value.asInstanceOf[js.Any])
    
    inline def setAttachmentIdUndefined: Self = StObject.set(x, "attachmentId", js.undefined)
    
    inline def setCardAddOnData(value: AppsDynamiteSharedCard): Self = StObject.set(x, "cardAddOnData", value.asInstanceOf[js.Any])
    
    inline def setCardAddOnDataUndefined: Self = StObject.set(x, "cardAddOnData", js.undefined)
    
    inline def setDeprecatedAddOnData(value: ContextualAddOnMarkup): Self = StObject.set(x, "deprecatedAddOnData", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedAddOnDataUndefined: Self = StObject.set(x, "deprecatedAddOnData", js.undefined)
    
    inline def setSlackData(value: AppsDynamiteV1ApiCompatV1Attachment): Self = StObject.set(x, "slackData", value.asInstanceOf[js.Any])
    
    inline def setSlackDataImageUrlHeight(value: Double): Self = StObject.set(x, "slackDataImageUrlHeight", value.asInstanceOf[js.Any])
    
    inline def setSlackDataImageUrlHeightUndefined: Self = StObject.set(x, "slackDataImageUrlHeight", js.undefined)
    
    inline def setSlackDataUndefined: Self = StObject.set(x, "slackData", js.undefined)
  }
}
