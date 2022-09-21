package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMessage extends StObject {
  
  /**
    * Annotations parsed and extracted from the text body.
    */
  var annotations: js.UndefOr[js.Array[SchemaAnnotation]] = js.undefined
  
  /**
    * Custom display profile info for apps. Leave the field empty for real users.
    */
  var appProfile: js.UndefOr[SchemaAppsDynamiteSharedAppProfile] = js.undefined
  
  /**
    * Attachments parsed from incoming webhooks
    */
  var attachments: js.UndefOr[js.Array[SchemaAttachment]] = js.undefined
  
  /**
    * Lightweight message attributes which values are calculated and set in the servers.
    */
  var attributes: js.UndefOr[SchemaMessageAttributes] = js.undefined
  
  /**
    * Responses from bots indicating if extra auth/config is needed.
    */
  var botResponses: js.UndefOr[js.Array[SchemaBotResponse]] = js.undefined
  
  /**
    * Communal labels associated with a message. These exist on the message itself regardless of which user fetches them. Order of entries is arbitrary and will not list duplicates of the same label_id. See go/chat-labels-design for details.
    */
  var communalLabels: js.UndefOr[js.Array[SchemaCommunalLabelTag]] = js.undefined
  
  var contentReportSummary: js.UndefOr[SchemaContentReportSummary] = js.undefined
  
  /**
    * Time when the Message was posted in microseconds.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ID of the User who posted the Message. This includes information to identify if this was posted by an App on behalf of a user.
    */
  var creatorId: js.UndefOr[SchemaUserId] = js.undefined
  
  /**
    * Indicates who can delete the message. This field is set on the read path (e.g. ListTopics) but doesn’t have any effect on the write path (e.g. CreateMessageRequest).
    */
  var deletableBy: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Time when the Message was deleted in microseconds. This field is set to nonzero value only for Messages deleted globally.
    */
  var deleteTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Time when the Message was per-user deleted by the message requester in microseconds. This field is set to nonzero value only for Message per-user deleted by the requester.
    */
  var deleteTimeForRequester: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Was this message deleted by Vault (Only used for Vault support) This is false if message is live or message was deleted by user.
    */
  var deletedByVault: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Data Loss Prevention scan information for this message. Messages are evaluated in the backend on create message/topic and edit message actions. DEPRECATED: use dlp_scan_summary instead.
    */
  var dlpScanOutcome: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Data Loss Prevention scan information for this message. Messages are evaluated in the backend on create message/topic and edit message actions.
    */
  var dlpScanSummary: js.UndefOr[SchemaDlpScanSummary] = js.undefined
  
  /**
    * Indicates who can edit the message. This field is set on the read path (e.g. ListTopics) but doesn’t have any effect on the write path (e.g. CreateMessageRequest).
    */
  var editableBy: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A plain-text description of the attachment, used when clients cannot display formatted attachment (e.g. mobile push notifications).
    */
  var fallbackText: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ID of the resource.
    */
  var id: js.UndefOr[SchemaMessageId] = js.undefined
  
  /**
    * Output only. Indicates if the message is an inline reply. Set to true only if the message's ParentPath is non-NULL. Currently, only inline replies have non-NULL ParentPath. See go/chat-be-inline-reply-indicator.
    */
  var isInlineReply: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If the message was edited by a user, timestamp of the last edit, in microseconds.
    */
  var lastEditTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Time when the Message text was last updated in microseconds.
    */
  var lastUpdateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A unique id specified on the client side.
    */
  var localId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An optional payload (restricted to 1P applications) that will be stored with this message. This can only be set by the 1P API and should be used to deliver additional data such a 1P sync version, 1P entity ID to the client for more advanced functionality [Eg. inform Group Tasks tab of new version while linking, fetch & render a live Task/Meet call tile].
    */
  var messageIntegrationPayload: js.UndefOr[SchemaAppsDynamiteSharedMessageIntegrationPayload] = js.undefined
  
  /**
    * Where the message was posted from
    */
  var messageOrigin: js.UndefOr[String | Null] = js.undefined
  
  /**
    * State of the message, indicating whether the message is visible to all members in the group or is only visible to the sender only, or the private_message_viewer if it is set.
    */
  var messageState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates if this message contains any suggestions that were provided by any Apps.
    */
  var originAppSuggestions: js.UndefOr[js.Array[SchemaAppsDynamiteSharedOriginAppSuggestion]] = js.undefined
  
  /**
    * Personal labels associated with a message for the viewing user. Order of entries is arbitrary and will not list duplicates of the same label_id. See go/chat-labels-design for details. NOTE: This will be unpopulated in the case of SpaceChangelog events.
    */
  var personalLabels: js.UndefOr[js.Array[SchemaPersonalLabelTag]] = js.undefined
  
  /**
    * A list of per-user private information. This is deprecated, because we no longer plan to support partially private messages or private messages for multiple users. The message_state and private_message_viewer fields should be sufficient for this infrastructure.
    */
  var privateMessageInfos: js.UndefOr[js.Array[SchemaPrivateMessageInfo]] = js.undefined
  
  /**
    * Should only be set if the Message State is PRIVATE. If set, the message content is only visible to this user (and any apps associated with the message), as well as the message creator. If unset, a private message is visible to the message creator only.
    */
  var privateMessageViewer: js.UndefOr[SchemaUserId] = js.undefined
  
  /**
    * Contains additional (currently Hangouts Classic only) properties applicable to this message.
    */
  var props: js.UndefOr[SchemaMessageProps] = js.undefined
  
  /**
    * Output only. Whether this message has been quoted by another message or not. Used by clients to handle message edit flows for messages that have been quoted.
    */
  var quotedByState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Metadata for a message that is quoted by this message.
    */
  var quotedMessageMetadata: js.UndefOr[SchemaQuotedMessageMetadata] = js.undefined
  
  /**
    * A list of user reactions to this message. Ordered by the timestamp of the first reaction, ascending (oldest to newest).
    */
  var reactions: js.UndefOr[js.Array[SchemaAppsDynamiteSharedReaction]] = js.undefined
  
  /**
    * Output only. Details of content reports. Set only when the request asks for it.
    */
  var reports: js.UndefOr[js.Array[SchemaContentReport]] = js.undefined
  
  /**
    * The retention settings of the message.
    */
  var retentionSettings: js.UndefOr[SchemaAppsDynamiteSharedRetentionSettings] = js.undefined
  
  /**
    * A client-specified string that can be used to uniquely identify a message in a space, in lieu of `id.message_id`.
    */
  var secondaryMessageKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Plaintext body of the Message.
    */
  var textBody: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Information for the stoning of a Message.
    */
  var tombstoneMetadata: js.UndefOr[SchemaTombstoneMetadata] = js.undefined
  
  /**
    * ID of the User who last updated (created/edited/deleted) the Message. This includes information to identify if this was updated by an App on behalf of a user.
    */
  var updaterId: js.UndefOr[SchemaUserId] = js.undefined
  
  /**
    * UploadMetadata b/36864213 is an ongoing effort to move UploadMetadata out of annotations field and save it to upload_metadata field only. After the migration, UploadMetadata will only be saved in this field.
    */
  var uploadMetadata: js.UndefOr[js.Array[SchemaUploadMetadata]] = js.undefined
}
object SchemaMessage {
  
  inline def apply(): SchemaMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMessage]
  }
  
  extension [Self <: SchemaMessage](x: Self) {
    
    inline def setAnnotations(value: js.Array[SchemaAnnotation]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setAnnotationsVarargs(value: SchemaAnnotation*): Self = StObject.set(x, "annotations", js.Array(value*))
    
    inline def setAppProfile(value: SchemaAppsDynamiteSharedAppProfile): Self = StObject.set(x, "appProfile", value.asInstanceOf[js.Any])
    
    inline def setAppProfileUndefined: Self = StObject.set(x, "appProfile", js.undefined)
    
    inline def setAttachments(value: js.Array[SchemaAttachment]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    inline def setAttachmentsVarargs(value: SchemaAttachment*): Self = StObject.set(x, "attachments", js.Array(value*))
    
    inline def setAttributes(value: SchemaMessageAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setBotResponses(value: js.Array[SchemaBotResponse]): Self = StObject.set(x, "botResponses", value.asInstanceOf[js.Any])
    
    inline def setBotResponsesUndefined: Self = StObject.set(x, "botResponses", js.undefined)
    
    inline def setBotResponsesVarargs(value: SchemaBotResponse*): Self = StObject.set(x, "botResponses", js.Array(value*))
    
    inline def setCommunalLabels(value: js.Array[SchemaCommunalLabelTag]): Self = StObject.set(x, "communalLabels", value.asInstanceOf[js.Any])
    
    inline def setCommunalLabelsUndefined: Self = StObject.set(x, "communalLabels", js.undefined)
    
    inline def setCommunalLabelsVarargs(value: SchemaCommunalLabelTag*): Self = StObject.set(x, "communalLabels", js.Array(value*))
    
    inline def setContentReportSummary(value: SchemaContentReportSummary): Self = StObject.set(x, "contentReportSummary", value.asInstanceOf[js.Any])
    
    inline def setContentReportSummaryUndefined: Self = StObject.set(x, "contentReportSummary", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setCreatorId(value: SchemaUserId): Self = StObject.set(x, "creatorId", value.asInstanceOf[js.Any])
    
    inline def setCreatorIdUndefined: Self = StObject.set(x, "creatorId", js.undefined)
    
    inline def setDeletableBy(value: String): Self = StObject.set(x, "deletableBy", value.asInstanceOf[js.Any])
    
    inline def setDeletableByNull: Self = StObject.set(x, "deletableBy", null)
    
    inline def setDeletableByUndefined: Self = StObject.set(x, "deletableBy", js.undefined)
    
    inline def setDeleteTime(value: String): Self = StObject.set(x, "deleteTime", value.asInstanceOf[js.Any])
    
    inline def setDeleteTimeForRequester(value: String): Self = StObject.set(x, "deleteTimeForRequester", value.asInstanceOf[js.Any])
    
    inline def setDeleteTimeForRequesterNull: Self = StObject.set(x, "deleteTimeForRequester", null)
    
    inline def setDeleteTimeForRequesterUndefined: Self = StObject.set(x, "deleteTimeForRequester", js.undefined)
    
    inline def setDeleteTimeNull: Self = StObject.set(x, "deleteTime", null)
    
    inline def setDeleteTimeUndefined: Self = StObject.set(x, "deleteTime", js.undefined)
    
    inline def setDeletedByVault(value: Boolean): Self = StObject.set(x, "deletedByVault", value.asInstanceOf[js.Any])
    
    inline def setDeletedByVaultNull: Self = StObject.set(x, "deletedByVault", null)
    
    inline def setDeletedByVaultUndefined: Self = StObject.set(x, "deletedByVault", js.undefined)
    
    inline def setDlpScanOutcome(value: String): Self = StObject.set(x, "dlpScanOutcome", value.asInstanceOf[js.Any])
    
    inline def setDlpScanOutcomeNull: Self = StObject.set(x, "dlpScanOutcome", null)
    
    inline def setDlpScanOutcomeUndefined: Self = StObject.set(x, "dlpScanOutcome", js.undefined)
    
    inline def setDlpScanSummary(value: SchemaDlpScanSummary): Self = StObject.set(x, "dlpScanSummary", value.asInstanceOf[js.Any])
    
    inline def setDlpScanSummaryUndefined: Self = StObject.set(x, "dlpScanSummary", js.undefined)
    
    inline def setEditableBy(value: String): Self = StObject.set(x, "editableBy", value.asInstanceOf[js.Any])
    
    inline def setEditableByNull: Self = StObject.set(x, "editableBy", null)
    
    inline def setEditableByUndefined: Self = StObject.set(x, "editableBy", js.undefined)
    
    inline def setFallbackText(value: String): Self = StObject.set(x, "fallbackText", value.asInstanceOf[js.Any])
    
    inline def setFallbackTextNull: Self = StObject.set(x, "fallbackText", null)
    
    inline def setFallbackTextUndefined: Self = StObject.set(x, "fallbackText", js.undefined)
    
    inline def setId(value: SchemaMessageId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsInlineReply(value: Boolean): Self = StObject.set(x, "isInlineReply", value.asInstanceOf[js.Any])
    
    inline def setIsInlineReplyNull: Self = StObject.set(x, "isInlineReply", null)
    
    inline def setIsInlineReplyUndefined: Self = StObject.set(x, "isInlineReply", js.undefined)
    
    inline def setLastEditTime(value: String): Self = StObject.set(x, "lastEditTime", value.asInstanceOf[js.Any])
    
    inline def setLastEditTimeNull: Self = StObject.set(x, "lastEditTime", null)
    
    inline def setLastEditTimeUndefined: Self = StObject.set(x, "lastEditTime", js.undefined)
    
    inline def setLastUpdateTime(value: String): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeNull: Self = StObject.set(x, "lastUpdateTime", null)
    
    inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
    
    inline def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
    
    inline def setLocalIdNull: Self = StObject.set(x, "localId", null)
    
    inline def setLocalIdUndefined: Self = StObject.set(x, "localId", js.undefined)
    
    inline def setMessageIntegrationPayload(value: SchemaAppsDynamiteSharedMessageIntegrationPayload): Self = StObject.set(x, "messageIntegrationPayload", value.asInstanceOf[js.Any])
    
    inline def setMessageIntegrationPayloadUndefined: Self = StObject.set(x, "messageIntegrationPayload", js.undefined)
    
    inline def setMessageOrigin(value: String): Self = StObject.set(x, "messageOrigin", value.asInstanceOf[js.Any])
    
    inline def setMessageOriginNull: Self = StObject.set(x, "messageOrigin", null)
    
    inline def setMessageOriginUndefined: Self = StObject.set(x, "messageOrigin", js.undefined)
    
    inline def setMessageState(value: String): Self = StObject.set(x, "messageState", value.asInstanceOf[js.Any])
    
    inline def setMessageStateNull: Self = StObject.set(x, "messageState", null)
    
    inline def setMessageStateUndefined: Self = StObject.set(x, "messageState", js.undefined)
    
    inline def setOriginAppSuggestions(value: js.Array[SchemaAppsDynamiteSharedOriginAppSuggestion]): Self = StObject.set(x, "originAppSuggestions", value.asInstanceOf[js.Any])
    
    inline def setOriginAppSuggestionsUndefined: Self = StObject.set(x, "originAppSuggestions", js.undefined)
    
    inline def setOriginAppSuggestionsVarargs(value: SchemaAppsDynamiteSharedOriginAppSuggestion*): Self = StObject.set(x, "originAppSuggestions", js.Array(value*))
    
    inline def setPersonalLabels(value: js.Array[SchemaPersonalLabelTag]): Self = StObject.set(x, "personalLabels", value.asInstanceOf[js.Any])
    
    inline def setPersonalLabelsUndefined: Self = StObject.set(x, "personalLabels", js.undefined)
    
    inline def setPersonalLabelsVarargs(value: SchemaPersonalLabelTag*): Self = StObject.set(x, "personalLabels", js.Array(value*))
    
    inline def setPrivateMessageInfos(value: js.Array[SchemaPrivateMessageInfo]): Self = StObject.set(x, "privateMessageInfos", value.asInstanceOf[js.Any])
    
    inline def setPrivateMessageInfosUndefined: Self = StObject.set(x, "privateMessageInfos", js.undefined)
    
    inline def setPrivateMessageInfosVarargs(value: SchemaPrivateMessageInfo*): Self = StObject.set(x, "privateMessageInfos", js.Array(value*))
    
    inline def setPrivateMessageViewer(value: SchemaUserId): Self = StObject.set(x, "privateMessageViewer", value.asInstanceOf[js.Any])
    
    inline def setPrivateMessageViewerUndefined: Self = StObject.set(x, "privateMessageViewer", js.undefined)
    
    inline def setProps(value: SchemaMessageProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
    
    inline def setQuotedByState(value: String): Self = StObject.set(x, "quotedByState", value.asInstanceOf[js.Any])
    
    inline def setQuotedByStateNull: Self = StObject.set(x, "quotedByState", null)
    
    inline def setQuotedByStateUndefined: Self = StObject.set(x, "quotedByState", js.undefined)
    
    inline def setQuotedMessageMetadata(value: SchemaQuotedMessageMetadata): Self = StObject.set(x, "quotedMessageMetadata", value.asInstanceOf[js.Any])
    
    inline def setQuotedMessageMetadataUndefined: Self = StObject.set(x, "quotedMessageMetadata", js.undefined)
    
    inline def setReactions(value: js.Array[SchemaAppsDynamiteSharedReaction]): Self = StObject.set(x, "reactions", value.asInstanceOf[js.Any])
    
    inline def setReactionsUndefined: Self = StObject.set(x, "reactions", js.undefined)
    
    inline def setReactionsVarargs(value: SchemaAppsDynamiteSharedReaction*): Self = StObject.set(x, "reactions", js.Array(value*))
    
    inline def setReports(value: js.Array[SchemaContentReport]): Self = StObject.set(x, "reports", value.asInstanceOf[js.Any])
    
    inline def setReportsUndefined: Self = StObject.set(x, "reports", js.undefined)
    
    inline def setReportsVarargs(value: SchemaContentReport*): Self = StObject.set(x, "reports", js.Array(value*))
    
    inline def setRetentionSettings(value: SchemaAppsDynamiteSharedRetentionSettings): Self = StObject.set(x, "retentionSettings", value.asInstanceOf[js.Any])
    
    inline def setRetentionSettingsUndefined: Self = StObject.set(x, "retentionSettings", js.undefined)
    
    inline def setSecondaryMessageKey(value: String): Self = StObject.set(x, "secondaryMessageKey", value.asInstanceOf[js.Any])
    
    inline def setSecondaryMessageKeyNull: Self = StObject.set(x, "secondaryMessageKey", null)
    
    inline def setSecondaryMessageKeyUndefined: Self = StObject.set(x, "secondaryMessageKey", js.undefined)
    
    inline def setTextBody(value: String): Self = StObject.set(x, "textBody", value.asInstanceOf[js.Any])
    
    inline def setTextBodyNull: Self = StObject.set(x, "textBody", null)
    
    inline def setTextBodyUndefined: Self = StObject.set(x, "textBody", js.undefined)
    
    inline def setTombstoneMetadata(value: SchemaTombstoneMetadata): Self = StObject.set(x, "tombstoneMetadata", value.asInstanceOf[js.Any])
    
    inline def setTombstoneMetadataUndefined: Self = StObject.set(x, "tombstoneMetadata", js.undefined)
    
    inline def setUpdaterId(value: SchemaUserId): Self = StObject.set(x, "updaterId", value.asInstanceOf[js.Any])
    
    inline def setUpdaterIdUndefined: Self = StObject.set(x, "updaterId", js.undefined)
    
    inline def setUploadMetadata(value: js.Array[SchemaUploadMetadata]): Self = StObject.set(x, "uploadMetadata", value.asInstanceOf[js.Any])
    
    inline def setUploadMetadataUndefined: Self = StObject.set(x, "uploadMetadata", js.undefined)
    
    inline def setUploadMetadataVarargs(value: SchemaUploadMetadata*): Self = StObject.set(x, "uploadMetadata", js.Array(value*))
  }
}
