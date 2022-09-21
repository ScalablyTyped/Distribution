package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteAnnotation extends StObject {
  
  var babelPlaceholderMetadata: js.UndefOr[AppsDynamiteBabelPlaceholderMetadata] = js.undefined
  
  /** LINT.ThenChange(//depot/google3/java/com/google/apps/dynamite/v1/backend/action/common/SystemMessageHelper.java) */
  var cardCapabilityMetadata: js.UndefOr[AppsDynamiteCardCapabilityMetadata] = js.undefined
  
  /** Whether the annotation should be rendered as a chip. If this is missing or unspecified, fallback to should_not_render on the metadata. */
  var chipRenderType: js.UndefOr[String] = js.undefined
  
  var consentedAppUnfurlMetadata: js.UndefOr[AppsDynamiteConsentedAppUnfurlMetadata] = js.undefined
  
  var customEmojiMetadata: js.UndefOr[AppsDynamiteCustomEmojiMetadata] = js.undefined
  
  var dataLossPreventionMetadata: js.UndefOr[AppsDynamiteDataLossPreventionMetadata] = js.undefined
  
  /** Chip annotations */
  var driveMetadata: js.UndefOr[AppsDynamiteDriveMetadata] = js.undefined
  
  var formatMetadata: js.UndefOr[AppsDynamiteFormatMetadata] = js.undefined
  
  var groupRetentionSettingsUpdated: js.UndefOr[AppsDynamiteGroupRetentionSettingsUpdatedMetaData] = js.undefined
  
  /**
    * Metadata for 1P integrations like tasks, calendar. These are supported only through integration server as 1P integrations use the integration API (which in turn uses backend API
    * with special permissions) to post messages. Clients should never set this. LINT.IfChange
    */
  var gsuiteIntegrationMetadata: js.UndefOr[AppsDynamiteGsuiteIntegrationMetadata] = js.undefined
  
  var incomingWebhookChangedMetadata: js.UndefOr[AppsDynamiteIncomingWebhookChangedMetadata] = js.undefined
  
  /** LINT.ThenChange(//depot/google3/java/com/google/apps/dynamite/v1/backend/action/common/SystemMessageHelper.java) */
  var integrationConfigUpdated: js.UndefOr[AppsDynamiteIntegrationConfigUpdatedMetadata] = js.undefined
  
  /** Length of the text_body substring beginning from start_index the Annotation corresponds to. */
  var length: js.UndefOr[Double] = js.undefined
  
  /**
    * A unique client-assigned ID for this annotation. This is helpful in matching the back-filled annotations to the original annotations on client side, without having to re-parse the
    * message.
    */
  var localId: js.UndefOr[String] = js.undefined
  
  /** Metadata for system messages. Clients should never set this. LINT.IfChange */
  var membershipChanged: js.UndefOr[AppsDynamiteMembershipChangedMetadata] = js.undefined
  
  var readReceiptsSettingsMetadata: js.UndefOr[AppsDynamiteReadReceiptsSettingsUpdatedMetadata] = js.undefined
  
  /**
    * Metadata that defines all of the required features that must be rendered in the message. Clients can use this to see whether they support the entire message, or show a fallback chip
    * otherwise. See go/message-quoting-client-to-server for details. LINT.ThenChange( //depot/google3/java/com/google/apps/dynamite/v1/allshared/parser/AnnotationSanitizer.java,
    * //depot/google3/java/com/google/apps/dynamite/v1/backend/action/common/SystemMessageHelper.java, //depot/google3/java/com/google/caribou/eli/mediation/chat/AnnotationTranslator.java
    * )
    */
  var requiredMessageFeaturesMetadata: js.UndefOr[AppsDynamiteRequiredMessageFeaturesMetadata] = js.undefined
  
  var roomUpdated: js.UndefOr[AppsDynamiteRoomUpdatedMetadata] = js.undefined
  
  /**
    * Whether or not the annotation is invalidated by the server. Example of situations for invalidation include: when the URL is malformed, or when Drive item ID is rejected by Drive
    * Service.
    */
  var serverInvalidated: js.UndefOr[Boolean] = js.undefined
  
  var slashCommandMetadata: js.UndefOr[AppsDynamiteSlashCommandMetadata] = js.undefined
  
  /** Start index (0-indexed) of the Message text the Annotation corresponds to, inclusive. */
  var startIndex: js.UndefOr[Double] = js.undefined
  
  /** Type of the Annotation. */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** A unique server-assigned ID for this annotation. This is helpful in matching annotation objects when fetched from service. */
  var uniqueId: js.UndefOr[String] = js.undefined
  
  var uploadMetadata: js.UndefOr[AppsDynamiteUploadMetadata] = js.undefined
  
  var urlMetadata: js.UndefOr[AppsDynamiteUrlMetadata] = js.undefined
  
  /** Metadata that clients can set for annotations. LINT.IfChange In-text annotations */
  var userMentionMetadata: js.UndefOr[AppsDynamiteUserMentionMetadata] = js.undefined
  
  var videoCallMetadata: js.UndefOr[AppsDynamiteVideoCallMetadata] = js.undefined
  
  var youtubeMetadata: js.UndefOr[AppsDynamiteYoutubeMetadata] = js.undefined
}
object AppsDynamiteAnnotation {
  
  inline def apply(): AppsDynamiteAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteAnnotation]
  }
  
  extension [Self <: AppsDynamiteAnnotation](x: Self) {
    
    inline def setBabelPlaceholderMetadata(value: AppsDynamiteBabelPlaceholderMetadata): Self = StObject.set(x, "babelPlaceholderMetadata", value.asInstanceOf[js.Any])
    
    inline def setBabelPlaceholderMetadataUndefined: Self = StObject.set(x, "babelPlaceholderMetadata", js.undefined)
    
    inline def setCardCapabilityMetadata(value: AppsDynamiteCardCapabilityMetadata): Self = StObject.set(x, "cardCapabilityMetadata", value.asInstanceOf[js.Any])
    
    inline def setCardCapabilityMetadataUndefined: Self = StObject.set(x, "cardCapabilityMetadata", js.undefined)
    
    inline def setChipRenderType(value: String): Self = StObject.set(x, "chipRenderType", value.asInstanceOf[js.Any])
    
    inline def setChipRenderTypeUndefined: Self = StObject.set(x, "chipRenderType", js.undefined)
    
    inline def setConsentedAppUnfurlMetadata(value: AppsDynamiteConsentedAppUnfurlMetadata): Self = StObject.set(x, "consentedAppUnfurlMetadata", value.asInstanceOf[js.Any])
    
    inline def setConsentedAppUnfurlMetadataUndefined: Self = StObject.set(x, "consentedAppUnfurlMetadata", js.undefined)
    
    inline def setCustomEmojiMetadata(value: AppsDynamiteCustomEmojiMetadata): Self = StObject.set(x, "customEmojiMetadata", value.asInstanceOf[js.Any])
    
    inline def setCustomEmojiMetadataUndefined: Self = StObject.set(x, "customEmojiMetadata", js.undefined)
    
    inline def setDataLossPreventionMetadata(value: AppsDynamiteDataLossPreventionMetadata): Self = StObject.set(x, "dataLossPreventionMetadata", value.asInstanceOf[js.Any])
    
    inline def setDataLossPreventionMetadataUndefined: Self = StObject.set(x, "dataLossPreventionMetadata", js.undefined)
    
    inline def setDriveMetadata(value: AppsDynamiteDriveMetadata): Self = StObject.set(x, "driveMetadata", value.asInstanceOf[js.Any])
    
    inline def setDriveMetadataUndefined: Self = StObject.set(x, "driveMetadata", js.undefined)
    
    inline def setFormatMetadata(value: AppsDynamiteFormatMetadata): Self = StObject.set(x, "formatMetadata", value.asInstanceOf[js.Any])
    
    inline def setFormatMetadataUndefined: Self = StObject.set(x, "formatMetadata", js.undefined)
    
    inline def setGroupRetentionSettingsUpdated(value: AppsDynamiteGroupRetentionSettingsUpdatedMetaData): Self = StObject.set(x, "groupRetentionSettingsUpdated", value.asInstanceOf[js.Any])
    
    inline def setGroupRetentionSettingsUpdatedUndefined: Self = StObject.set(x, "groupRetentionSettingsUpdated", js.undefined)
    
    inline def setGsuiteIntegrationMetadata(value: AppsDynamiteGsuiteIntegrationMetadata): Self = StObject.set(x, "gsuiteIntegrationMetadata", value.asInstanceOf[js.Any])
    
    inline def setGsuiteIntegrationMetadataUndefined: Self = StObject.set(x, "gsuiteIntegrationMetadata", js.undefined)
    
    inline def setIncomingWebhookChangedMetadata(value: AppsDynamiteIncomingWebhookChangedMetadata): Self = StObject.set(x, "incomingWebhookChangedMetadata", value.asInstanceOf[js.Any])
    
    inline def setIncomingWebhookChangedMetadataUndefined: Self = StObject.set(x, "incomingWebhookChangedMetadata", js.undefined)
    
    inline def setIntegrationConfigUpdated(value: AppsDynamiteIntegrationConfigUpdatedMetadata): Self = StObject.set(x, "integrationConfigUpdated", value.asInstanceOf[js.Any])
    
    inline def setIntegrationConfigUpdatedUndefined: Self = StObject.set(x, "integrationConfigUpdated", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
    
    inline def setLocalIdUndefined: Self = StObject.set(x, "localId", js.undefined)
    
    inline def setMembershipChanged(value: AppsDynamiteMembershipChangedMetadata): Self = StObject.set(x, "membershipChanged", value.asInstanceOf[js.Any])
    
    inline def setMembershipChangedUndefined: Self = StObject.set(x, "membershipChanged", js.undefined)
    
    inline def setReadReceiptsSettingsMetadata(value: AppsDynamiteReadReceiptsSettingsUpdatedMetadata): Self = StObject.set(x, "readReceiptsSettingsMetadata", value.asInstanceOf[js.Any])
    
    inline def setReadReceiptsSettingsMetadataUndefined: Self = StObject.set(x, "readReceiptsSettingsMetadata", js.undefined)
    
    inline def setRequiredMessageFeaturesMetadata(value: AppsDynamiteRequiredMessageFeaturesMetadata): Self = StObject.set(x, "requiredMessageFeaturesMetadata", value.asInstanceOf[js.Any])
    
    inline def setRequiredMessageFeaturesMetadataUndefined: Self = StObject.set(x, "requiredMessageFeaturesMetadata", js.undefined)
    
    inline def setRoomUpdated(value: AppsDynamiteRoomUpdatedMetadata): Self = StObject.set(x, "roomUpdated", value.asInstanceOf[js.Any])
    
    inline def setRoomUpdatedUndefined: Self = StObject.set(x, "roomUpdated", js.undefined)
    
    inline def setServerInvalidated(value: Boolean): Self = StObject.set(x, "serverInvalidated", value.asInstanceOf[js.Any])
    
    inline def setServerInvalidatedUndefined: Self = StObject.set(x, "serverInvalidated", js.undefined)
    
    inline def setSlashCommandMetadata(value: AppsDynamiteSlashCommandMetadata): Self = StObject.set(x, "slashCommandMetadata", value.asInstanceOf[js.Any])
    
    inline def setSlashCommandMetadataUndefined: Self = StObject.set(x, "slashCommandMetadata", js.undefined)
    
    inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUniqueId(value: String): Self = StObject.set(x, "uniqueId", value.asInstanceOf[js.Any])
    
    inline def setUniqueIdUndefined: Self = StObject.set(x, "uniqueId", js.undefined)
    
    inline def setUploadMetadata(value: AppsDynamiteUploadMetadata): Self = StObject.set(x, "uploadMetadata", value.asInstanceOf[js.Any])
    
    inline def setUploadMetadataUndefined: Self = StObject.set(x, "uploadMetadata", js.undefined)
    
    inline def setUrlMetadata(value: AppsDynamiteUrlMetadata): Self = StObject.set(x, "urlMetadata", value.asInstanceOf[js.Any])
    
    inline def setUrlMetadataUndefined: Self = StObject.set(x, "urlMetadata", js.undefined)
    
    inline def setUserMentionMetadata(value: AppsDynamiteUserMentionMetadata): Self = StObject.set(x, "userMentionMetadata", value.asInstanceOf[js.Any])
    
    inline def setUserMentionMetadataUndefined: Self = StObject.set(x, "userMentionMetadata", js.undefined)
    
    inline def setVideoCallMetadata(value: AppsDynamiteVideoCallMetadata): Self = StObject.set(x, "videoCallMetadata", value.asInstanceOf[js.Any])
    
    inline def setVideoCallMetadataUndefined: Self = StObject.set(x, "videoCallMetadata", js.undefined)
    
    inline def setYoutubeMetadata(value: AppsDynamiteYoutubeMetadata): Self = StObject.set(x, "youtubeMetadata", value.asInstanceOf[js.Any])
    
    inline def setYoutubeMetadataUndefined: Self = StObject.set(x, "youtubeMetadata", js.undefined)
  }
}
