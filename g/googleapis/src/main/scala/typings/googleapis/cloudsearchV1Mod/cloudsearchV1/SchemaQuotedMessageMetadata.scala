package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQuotedMessageMetadata extends StObject {
  
  /**
    * Output only. Snapshot of the annotations of the quoted message.
    */
  var annotations: js.UndefOr[js.Array[SchemaAnnotation]] = js.undefined
  
  /**
    * Output only. Custom display profile info for apps. Will be empty for real users.
    */
  var appProfile: js.UndefOr[SchemaAppsDynamiteSharedAppProfile] = js.undefined
  
  /**
    * Output only. The bot attachment state of the quoted message. Used by clients to display a bot attachment indicator in the UI.
    */
  var botAttachmentState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. ID of the User who posted the quoted message. This includes information to identify if the quoted message was posted by an App on behalf of a user.
    */
  var creatorId: js.UndefOr[SchemaUserId] = js.undefined
  
  /**
    * The `last_update_time` of the original message when the client initiated the quote creation. This is derived from the request payload passed from clients. Used to fetch the quoted message contents at a specific time on the read path. This field is populated from storage directly.
    */
  var lastUpdateTimeWhenQuotedMicros: js.UndefOr[String | Null] = js.undefined
  
  /**
    * MessageId of the original message that is being quoted. This is derived from the request payload passed from clients. This field is populated from storage directly.
    */
  var messageId: js.UndefOr[SchemaMessageId] = js.undefined
  
  /**
    * Output only. The state of the quoted message. Used by clients to display tombstones for quotes that reference a deleted message.
    */
  var messageState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The retention (OTR) settings of the quoted message.
    */
  var retentionSettings: js.UndefOr[SchemaAppsDynamiteSharedRetentionSettings] = js.undefined
  
  /**
    * Output only. Snapshot of the text body of the quoted message.
    */
  var textBody: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Upload metadata of the quoted message. NEXT TAG: 11
    */
  var uploadMetadata: js.UndefOr[js.Array[SchemaUploadMetadata]] = js.undefined
}
object SchemaQuotedMessageMetadata {
  
  inline def apply(): SchemaQuotedMessageMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuotedMessageMetadata]
  }
  
  extension [Self <: SchemaQuotedMessageMetadata](x: Self) {
    
    inline def setAnnotations(value: js.Array[SchemaAnnotation]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setAnnotationsVarargs(value: SchemaAnnotation*): Self = StObject.set(x, "annotations", js.Array(value*))
    
    inline def setAppProfile(value: SchemaAppsDynamiteSharedAppProfile): Self = StObject.set(x, "appProfile", value.asInstanceOf[js.Any])
    
    inline def setAppProfileUndefined: Self = StObject.set(x, "appProfile", js.undefined)
    
    inline def setBotAttachmentState(value: String): Self = StObject.set(x, "botAttachmentState", value.asInstanceOf[js.Any])
    
    inline def setBotAttachmentStateNull: Self = StObject.set(x, "botAttachmentState", null)
    
    inline def setBotAttachmentStateUndefined: Self = StObject.set(x, "botAttachmentState", js.undefined)
    
    inline def setCreatorId(value: SchemaUserId): Self = StObject.set(x, "creatorId", value.asInstanceOf[js.Any])
    
    inline def setCreatorIdUndefined: Self = StObject.set(x, "creatorId", js.undefined)
    
    inline def setLastUpdateTimeWhenQuotedMicros(value: String): Self = StObject.set(x, "lastUpdateTimeWhenQuotedMicros", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeWhenQuotedMicrosNull: Self = StObject.set(x, "lastUpdateTimeWhenQuotedMicros", null)
    
    inline def setLastUpdateTimeWhenQuotedMicrosUndefined: Self = StObject.set(x, "lastUpdateTimeWhenQuotedMicros", js.undefined)
    
    inline def setMessageId(value: SchemaMessageId): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    
    inline def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
    
    inline def setMessageState(value: String): Self = StObject.set(x, "messageState", value.asInstanceOf[js.Any])
    
    inline def setMessageStateNull: Self = StObject.set(x, "messageState", null)
    
    inline def setMessageStateUndefined: Self = StObject.set(x, "messageState", js.undefined)
    
    inline def setRetentionSettings(value: SchemaAppsDynamiteSharedRetentionSettings): Self = StObject.set(x, "retentionSettings", value.asInstanceOf[js.Any])
    
    inline def setRetentionSettingsUndefined: Self = StObject.set(x, "retentionSettings", js.undefined)
    
    inline def setTextBody(value: String): Self = StObject.set(x, "textBody", value.asInstanceOf[js.Any])
    
    inline def setTextBodyNull: Self = StObject.set(x, "textBody", null)
    
    inline def setTextBodyUndefined: Self = StObject.set(x, "textBody", js.undefined)
    
    inline def setUploadMetadata(value: js.Array[SchemaUploadMetadata]): Self = StObject.set(x, "uploadMetadata", value.asInstanceOf[js.Any])
    
    inline def setUploadMetadataUndefined: Self = StObject.set(x, "uploadMetadata", js.undefined)
    
    inline def setUploadMetadataVarargs(value: SchemaUploadMetadata*): Self = StObject.set(x, "uploadMetadata", js.Array(value*))
  }
}
