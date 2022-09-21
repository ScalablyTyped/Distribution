package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreative extends StObject {
  
  /**
    * Account ID of this creative. This field, if left unset, will be auto-generated for both insert and update operations. Applicable to all creative types.
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the creative is active. Applicable to all creative types.
    */
  var active: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Ad parameters user for VPAID creative. This is a read-only field. Applicable to the following creative types: all VPAID.
    */
  var adParameters: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Keywords for a Rich Media creative. Keywords let you customize the creative settings of a Rich Media ad running on your site without having to contact the advertiser. You can use keywords to dynamically change the look or functionality of a creative. Applicable to the following creative types: all RICH_MEDIA, and all VPAID.
    */
  var adTagKeys: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Additional sizes associated with a responsive creative. When inserting or updating a creative either the size ID field or size width and height fields can be used. Applicable to DISPLAY creatives when the primary asset type is HTML_IMAGE.
    */
  var additionalSizes: js.UndefOr[js.Array[SchemaSize]] = js.undefined
  
  /**
    * Advertiser ID of this creative. This is a required field. Applicable to all creative types.
    */
  var advertiserId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether script access is allowed for this creative. This is a read-only and deprecated field which will automatically be set to true on update. Applicable to the following creative types: FLASH_INPAGE.
    */
  var allowScriptAccess: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether the creative is archived. Applicable to all creative types.
    */
  var archived: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Type of artwork used for the creative. This is a read-only field. Applicable to the following creative types: all RICH_MEDIA, and all VPAID.
    */
  var artworkType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Source application where creative was authored. Presently, only DBM authored creatives will have this field set. Applicable to all creative types.
    */
  var authoringSource: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Authoring tool for HTML5 banner creatives. This is a read-only field. Applicable to the following creative types: HTML5_BANNER.
    */
  var authoringTool: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether images are automatically advanced for image gallery creatives. Applicable to the following creative types: DISPLAY_IMAGE_GALLERY.
    */
  var autoAdvanceImages: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The 6-character HTML color code, beginning with #, for the background of the window area where the Flash file is displayed. Default is white. Applicable to the following creative types: FLASH_INPAGE.
    */
  var backgroundColor: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Click-through URL for backup image. Applicable to ENHANCED_BANNER when the primary asset type is not HTML_IMAGE.
    */
  var backupImageClickThroughUrl: js.UndefOr[SchemaCreativeClickThroughUrl] = js.undefined
  
  /**
    * List of feature dependencies that will cause a backup image to be served if the browser that serves the ad does not support them. Feature dependencies are features that a browser must be able to support in order to render your HTML5 creative asset correctly. This field is initially auto-generated to contain all features detected by Campaign Manager for all the assets of this creative and can then be modified by the client. To reset this field, copy over all the creativeAssets' detected features. Applicable to the following creative types: HTML5_BANNER. Applicable to DISPLAY when the primary asset type is not HTML_IMAGE.
    */
  var backupImageFeatures: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Reporting label used for HTML5 banner backup image. Applicable to the following creative types: DISPLAY when the primary asset type is not HTML_IMAGE.
    */
  var backupImageReportingLabel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Target window for backup image. Applicable to the following creative types: FLASH_INPAGE and HTML5_BANNER. Applicable to DISPLAY when the primary asset type is not HTML_IMAGE.
    */
  var backupImageTargetWindow: js.UndefOr[SchemaTargetWindow] = js.undefined
  
  /**
    * Click tags of the creative. For DISPLAY, FLASH_INPAGE, and HTML5_BANNER creatives, this is a subset of detected click tags for the assets associated with this creative. After creating a flash asset, detected click tags will be returned in the creativeAssetMetadata. When inserting the creative, populate the creative clickTags field using the creativeAssetMetadata.clickTags field. For DISPLAY_IMAGE_GALLERY creatives, there should be exactly one entry in this list for each image creative asset. A click tag is matched with a corresponding creative asset by matching the clickTag.name field with the creativeAsset.assetIdentifier.name field. Applicable to the following creative types: DISPLAY_IMAGE_GALLERY, FLASH_INPAGE, HTML5_BANNER. Applicable to DISPLAY when the primary asset type is not HTML_IMAGE.
    */
  var clickTags: js.UndefOr[js.Array[SchemaClickTag]] = js.undefined
  
  /**
    * Industry standard ID assigned to creative for reach and frequency. Applicable to INSTREAM_VIDEO_REDIRECT creatives.
    */
  var commercialId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of companion creatives assigned to an in-Stream video creative. Acceptable values include IDs of existing flash and image creatives. Applicable to the following creative types: all VPAID, all INSTREAM_AUDIO and all INSTREAM_VIDEO with dynamicAssetSelection set to false.
    */
  var companionCreatives: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Compatibilities associated with this creative. This is a read-only field. DISPLAY and DISPLAY_INTERSTITIAL refer to rendering either on desktop or on mobile devices or in mobile apps for regular or interstitial ads, respectively. APP and APP_INTERSTITIAL are for rendering in mobile apps. Only pre-existing creatives may have these compatibilities since new creatives will either be assigned DISPLAY or DISPLAY_INTERSTITIAL instead. IN_STREAM_VIDEO refers to rendering in in-stream video ads developed with the VAST standard. IN_STREAM_AUDIO refers to rendering in in-stream audio ads developed with the VAST standard. Applicable to all creative types. Acceptable values are: - "APP" - "APP_INTERSTITIAL" - "IN_STREAM_VIDEO" - "IN_STREAM_AUDIO" - "DISPLAY" - "DISPLAY_INTERSTITIAL"
    */
  var compatibility: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Whether Flash assets associated with the creative need to be automatically converted to HTML5. This flag is enabled by default and users can choose to disable it if they don't want the system to generate and use HTML5 asset for this creative. Applicable to the following creative type: FLASH_INPAGE. Applicable to DISPLAY when the primary asset type is not HTML_IMAGE.
    */
  var convertFlashToHtml5: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * List of counter events configured for the creative. For DISPLAY_IMAGE_GALLERY creatives, these are read-only and auto-generated from clickTags. Applicable to the following creative types: DISPLAY_IMAGE_GALLERY, all RICH_MEDIA, and all VPAID.
    */
  var counterCustomEvents: js.UndefOr[js.Array[SchemaCreativeCustomEvent]] = js.undefined
  
  /**
    * Required if dynamicAssetSelection is true.
    */
  var creativeAssetSelection: js.UndefOr[SchemaCreativeAssetSelection] = js.undefined
  
  /**
    * Assets associated with a creative. Applicable to all but the following creative types: INTERNAL_REDIRECT, INTERSTITIAL_INTERNAL_REDIRECT, and REDIRECT
    */
  var creativeAssets: js.UndefOr[js.Array[SchemaCreativeAsset]] = js.undefined
  
  /**
    * Creative field assignments for this creative. Applicable to all creative types.
    */
  var creativeFieldAssignments: js.UndefOr[js.Array[SchemaCreativeFieldAssignment]] = js.undefined
  
  /**
    * Custom key-values for a Rich Media creative. Key-values let you customize the creative settings of a Rich Media ad running on your site without having to contact the advertiser. You can use key-values to dynamically change the look or functionality of a creative. Applicable to the following creative types: all RICH_MEDIA, and all VPAID.
    */
  var customKeyValues: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Set this to true to enable the use of rules to target individual assets in this creative. When set to true creativeAssetSelection must be set. This also controls asset-level companions. When this is true, companion creatives should be assigned to creative assets. Learn more. Applicable to INSTREAM_VIDEO creatives.
    */
  var dynamicAssetSelection: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * List of exit events configured for the creative. For DISPLAY and DISPLAY_IMAGE_GALLERY creatives, these are read-only and auto-generated from clickTags, For DISPLAY, an event is also created from the backupImageReportingLabel. Applicable to the following creative types: DISPLAY_IMAGE_GALLERY, all RICH_MEDIA, and all VPAID. Applicable to DISPLAY when the primary asset type is not HTML_IMAGE.
    */
  var exitCustomEvents: js.UndefOr[js.Array[SchemaCreativeCustomEvent]] = js.undefined
  
  /**
    * OpenWindow FSCommand of this creative. This lets the SWF file communicate with either Flash Player or the program hosting Flash Player, such as a web browser. This is only triggered if allowScriptAccess field is true. Applicable to the following creative types: FLASH_INPAGE.
    */
  var fsCommand: js.UndefOr[SchemaFsCommand] = js.undefined
  
  /**
    * HTML code for the creative. This is a required field when applicable. This field is ignored if htmlCodeLocked is true. Applicable to the following creative types: all CUSTOM, FLASH_INPAGE, and HTML5_BANNER, and all RICH_MEDIA.
    */
  var htmlCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether HTML code is generated by Campaign Manager or manually entered. Set to true to ignore changes to htmlCode. Applicable to the following creative types: FLASH_INPAGE and HTML5_BANNER.
    */
  var htmlCodeLocked: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * ID of this creative. This is a read-only, auto-generated field. Applicable to all creative types.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Dimension value for the ID of this creative. This is a read-only field. Applicable to all creative types.
    */
  var idDimensionValue: js.UndefOr[SchemaDimensionValue] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#creative".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Creative last modification information. This is a read-only field. Applicable to all creative types.
    */
  var lastModifiedInfo: js.UndefOr[SchemaLastModifiedInfo] = js.undefined
  
  /**
    * Latest Studio trafficked creative ID associated with rich media and VPAID creatives. This is a read-only field. Applicable to the following creative types: all RICH_MEDIA, and all VPAID.
    */
  var latestTraffickedCreativeId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Description of the audio or video ad. Applicable to the following creative types: all INSTREAM_VIDEO, INSTREAM_AUDIO, and all VPAID.
    */
  var mediaDescription: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Creative audio or video duration in seconds. This is a read-only field. Applicable to the following creative types: INSTREAM_VIDEO, INSTREAM_AUDIO, all RICH_MEDIA, and all VPAID.
    */
  var mediaDuration: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Name of the creative. This is a required field and must be less than 256 characters long. Applicable to all creative types.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Override CSS value for rich media creatives. Applicable to the following creative types: all RICH_MEDIA.
    */
  var overrideCss: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Amount of time to play the video before counting a view. Applicable to the following creative types: all INSTREAM_VIDEO.
    */
  var progressOffset: js.UndefOr[SchemaVideoOffset] = js.undefined
  
  /**
    * URL of hosted image or hosted video or another ad tag. For INSTREAM_VIDEO_REDIRECT creatives this is the in-stream video redirect URL. The standard for a VAST (Video Ad Serving Template) ad response allows for a redirect link to another VAST 2.0 or 3.0 call. This is a required field when applicable. Applicable to the following creative types: DISPLAY_REDIRECT, INTERNAL_REDIRECT, INTERSTITIAL_INTERNAL_REDIRECT, and INSTREAM_VIDEO_REDIRECT
    */
  var redirectUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ID of current rendering version. This is a read-only field. Applicable to all creative types.
    */
  var renderingId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Dimension value for the rendering ID of this creative. This is a read-only field. Applicable to all creative types.
    */
  var renderingIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.undefined
  
  /**
    * The minimum required Flash plugin version for this creative. For example, 11.2.202.235. This is a read-only field. Applicable to the following creative types: all RICH_MEDIA, and all VPAID.
    */
  var requiredFlashPluginVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The internal Flash version for this creative as calculated by Studio. This is a read-only field. Applicable to the following creative types: FLASH_INPAGE all RICH_MEDIA, and all VPAID. Applicable to DISPLAY when the primary asset type is not HTML_IMAGE.
    */
  var requiredFlashVersion: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Size associated with this creative. When inserting or updating a creative either the size ID field or size width and height fields can be used. This is a required field when applicable; however for IMAGE, FLASH_INPAGE creatives, and for DISPLAY creatives with a primary asset of type HTML_IMAGE, if left blank, this field will be automatically set using the actual size of the associated image assets. Applicable to the following creative types: DISPLAY, DISPLAY_IMAGE_GALLERY, FLASH_INPAGE, HTML5_BANNER, IMAGE, and all RICH_MEDIA.
    */
  var size: js.UndefOr[SchemaSize] = js.undefined
  
  /**
    * Amount of time to play the video before the skip button appears. Applicable to the following creative types: all INSTREAM_VIDEO.
    */
  var skipOffset: js.UndefOr[SchemaVideoOffset] = js.undefined
  
  /**
    * Whether the user can choose to skip the creative. Applicable to the following creative types: all INSTREAM_VIDEO and all VPAID.
    */
  var skippable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether the creative is SSL-compliant. This is a read-only field. Applicable to all creative types.
    */
  var sslCompliant: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether creative should be treated as SSL compliant even if the system scan shows it's not. Applicable to all creative types.
    */
  var sslOverride: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Studio advertiser ID associated with rich media and VPAID creatives. This is a read-only field. Applicable to the following creative types: all RICH_MEDIA, and all VPAID.
    */
  var studioAdvertiserId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Studio creative ID associated with rich media and VPAID creatives. This is a read-only field. Applicable to the following creative types: all RICH_MEDIA, and all VPAID.
    */
  var studioCreativeId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Studio trafficked creative ID associated with rich media and VPAID creatives. This is a read-only field. Applicable to the following creative types: all RICH_MEDIA, and all VPAID.
    */
  var studioTraffickedCreativeId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Subaccount ID of this creative. This field, if left unset, will be auto-generated for both insert and update operations. Applicable to all creative types.
    */
  var subaccountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Third-party URL used to record backup image impressions. Applicable to the following creative types: all RICH_MEDIA.
    */
  var thirdPartyBackupImageImpressionsUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Third-party URL used to record rich media impressions. Applicable to the following creative types: all RICH_MEDIA.
    */
  var thirdPartyRichMediaImpressionsUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Third-party URLs for tracking in-stream creative events. Applicable to the following creative types: all INSTREAM_VIDEO, all INSTREAM_AUDIO, and all VPAID.
    */
  var thirdPartyUrls: js.UndefOr[js.Array[SchemaThirdPartyTrackingUrl]] = js.undefined
  
  /**
    * List of timer events configured for the creative. For DISPLAY_IMAGE_GALLERY creatives, these are read-only and auto-generated from clickTags. Applicable to the following creative types: DISPLAY_IMAGE_GALLERY, all RICH_MEDIA, and all VPAID. Applicable to DISPLAY when the primary asset is not HTML_IMAGE.
    */
  var timerCustomEvents: js.UndefOr[js.Array[SchemaCreativeCustomEvent]] = js.undefined
  
  /**
    * Combined size of all creative assets. This is a read-only field. Applicable to the following creative types: all RICH_MEDIA, and all VPAID.
    */
  var totalFileSize: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of this creative. This is a required field. Applicable to all creative types. *Note:* FLASH_INPAGE, HTML5_BANNER, and IMAGE are only used for existing creatives. New creatives should use DISPLAY as a replacement for these types.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A Universal Ad ID as per the VAST 4.0 spec. Applicable to the following creative types: INSTREAM_AUDIO and INSTREAM_VIDEO and VPAID.
    */
  var universalAdId: js.UndefOr[SchemaUniversalAdId] = js.undefined
  
  /**
    * The version number helps you keep track of multiple versions of your creative in your reports. The version number will always be auto-generated during insert operations to start at 1. For tracking creatives the version cannot be incremented and will always remain at 1. For all other creative types the version can be incremented only by 1 during update operations. In addition, the version will be automatically incremented by 1 when undergoing Rich Media creative merging. Applicable to all creative types.
    */
  var version: js.UndefOr[Double | Null] = js.undefined
}
object SchemaCreative {
  
  inline def apply(): SchemaCreative = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreative]
  }
  
  extension [Self <: SchemaCreative](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveNull: Self = StObject.set(x, "active", null)
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setAdParameters(value: String): Self = StObject.set(x, "adParameters", value.asInstanceOf[js.Any])
    
    inline def setAdParametersNull: Self = StObject.set(x, "adParameters", null)
    
    inline def setAdParametersUndefined: Self = StObject.set(x, "adParameters", js.undefined)
    
    inline def setAdTagKeys(value: js.Array[String]): Self = StObject.set(x, "adTagKeys", value.asInstanceOf[js.Any])
    
    inline def setAdTagKeysNull: Self = StObject.set(x, "adTagKeys", null)
    
    inline def setAdTagKeysUndefined: Self = StObject.set(x, "adTagKeys", js.undefined)
    
    inline def setAdTagKeysVarargs(value: String*): Self = StObject.set(x, "adTagKeys", js.Array(value*))
    
    inline def setAdditionalSizes(value: js.Array[SchemaSize]): Self = StObject.set(x, "additionalSizes", value.asInstanceOf[js.Any])
    
    inline def setAdditionalSizesUndefined: Self = StObject.set(x, "additionalSizes", js.undefined)
    
    inline def setAdditionalSizesVarargs(value: SchemaSize*): Self = StObject.set(x, "additionalSizes", js.Array(value*))
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdNull: Self = StObject.set(x, "advertiserId", null)
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setAllowScriptAccess(value: Boolean): Self = StObject.set(x, "allowScriptAccess", value.asInstanceOf[js.Any])
    
    inline def setAllowScriptAccessNull: Self = StObject.set(x, "allowScriptAccess", null)
    
    inline def setAllowScriptAccessUndefined: Self = StObject.set(x, "allowScriptAccess", js.undefined)
    
    inline def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
    
    inline def setArchivedNull: Self = StObject.set(x, "archived", null)
    
    inline def setArchivedUndefined: Self = StObject.set(x, "archived", js.undefined)
    
    inline def setArtworkType(value: String): Self = StObject.set(x, "artworkType", value.asInstanceOf[js.Any])
    
    inline def setArtworkTypeNull: Self = StObject.set(x, "artworkType", null)
    
    inline def setArtworkTypeUndefined: Self = StObject.set(x, "artworkType", js.undefined)
    
    inline def setAuthoringSource(value: String): Self = StObject.set(x, "authoringSource", value.asInstanceOf[js.Any])
    
    inline def setAuthoringSourceNull: Self = StObject.set(x, "authoringSource", null)
    
    inline def setAuthoringSourceUndefined: Self = StObject.set(x, "authoringSource", js.undefined)
    
    inline def setAuthoringTool(value: String): Self = StObject.set(x, "authoringTool", value.asInstanceOf[js.Any])
    
    inline def setAuthoringToolNull: Self = StObject.set(x, "authoringTool", null)
    
    inline def setAuthoringToolUndefined: Self = StObject.set(x, "authoringTool", js.undefined)
    
    inline def setAutoAdvanceImages(value: Boolean): Self = StObject.set(x, "autoAdvanceImages", value.asInstanceOf[js.Any])
    
    inline def setAutoAdvanceImagesNull: Self = StObject.set(x, "autoAdvanceImages", null)
    
    inline def setAutoAdvanceImagesUndefined: Self = StObject.set(x, "autoAdvanceImages", js.undefined)
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorNull: Self = StObject.set(x, "backgroundColor", null)
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBackupImageClickThroughUrl(value: SchemaCreativeClickThroughUrl): Self = StObject.set(x, "backupImageClickThroughUrl", value.asInstanceOf[js.Any])
    
    inline def setBackupImageClickThroughUrlUndefined: Self = StObject.set(x, "backupImageClickThroughUrl", js.undefined)
    
    inline def setBackupImageFeatures(value: js.Array[String]): Self = StObject.set(x, "backupImageFeatures", value.asInstanceOf[js.Any])
    
    inline def setBackupImageFeaturesNull: Self = StObject.set(x, "backupImageFeatures", null)
    
    inline def setBackupImageFeaturesUndefined: Self = StObject.set(x, "backupImageFeatures", js.undefined)
    
    inline def setBackupImageFeaturesVarargs(value: String*): Self = StObject.set(x, "backupImageFeatures", js.Array(value*))
    
    inline def setBackupImageReportingLabel(value: String): Self = StObject.set(x, "backupImageReportingLabel", value.asInstanceOf[js.Any])
    
    inline def setBackupImageReportingLabelNull: Self = StObject.set(x, "backupImageReportingLabel", null)
    
    inline def setBackupImageReportingLabelUndefined: Self = StObject.set(x, "backupImageReportingLabel", js.undefined)
    
    inline def setBackupImageTargetWindow(value: SchemaTargetWindow): Self = StObject.set(x, "backupImageTargetWindow", value.asInstanceOf[js.Any])
    
    inline def setBackupImageTargetWindowUndefined: Self = StObject.set(x, "backupImageTargetWindow", js.undefined)
    
    inline def setClickTags(value: js.Array[SchemaClickTag]): Self = StObject.set(x, "clickTags", value.asInstanceOf[js.Any])
    
    inline def setClickTagsUndefined: Self = StObject.set(x, "clickTags", js.undefined)
    
    inline def setClickTagsVarargs(value: SchemaClickTag*): Self = StObject.set(x, "clickTags", js.Array(value*))
    
    inline def setCommercialId(value: String): Self = StObject.set(x, "commercialId", value.asInstanceOf[js.Any])
    
    inline def setCommercialIdNull: Self = StObject.set(x, "commercialId", null)
    
    inline def setCommercialIdUndefined: Self = StObject.set(x, "commercialId", js.undefined)
    
    inline def setCompanionCreatives(value: js.Array[String]): Self = StObject.set(x, "companionCreatives", value.asInstanceOf[js.Any])
    
    inline def setCompanionCreativesNull: Self = StObject.set(x, "companionCreatives", null)
    
    inline def setCompanionCreativesUndefined: Self = StObject.set(x, "companionCreatives", js.undefined)
    
    inline def setCompanionCreativesVarargs(value: String*): Self = StObject.set(x, "companionCreatives", js.Array(value*))
    
    inline def setCompatibility(value: js.Array[String]): Self = StObject.set(x, "compatibility", value.asInstanceOf[js.Any])
    
    inline def setCompatibilityNull: Self = StObject.set(x, "compatibility", null)
    
    inline def setCompatibilityUndefined: Self = StObject.set(x, "compatibility", js.undefined)
    
    inline def setCompatibilityVarargs(value: String*): Self = StObject.set(x, "compatibility", js.Array(value*))
    
    inline def setConvertFlashToHtml5(value: Boolean): Self = StObject.set(x, "convertFlashToHtml5", value.asInstanceOf[js.Any])
    
    inline def setConvertFlashToHtml5Null: Self = StObject.set(x, "convertFlashToHtml5", null)
    
    inline def setConvertFlashToHtml5Undefined: Self = StObject.set(x, "convertFlashToHtml5", js.undefined)
    
    inline def setCounterCustomEvents(value: js.Array[SchemaCreativeCustomEvent]): Self = StObject.set(x, "counterCustomEvents", value.asInstanceOf[js.Any])
    
    inline def setCounterCustomEventsUndefined: Self = StObject.set(x, "counterCustomEvents", js.undefined)
    
    inline def setCounterCustomEventsVarargs(value: SchemaCreativeCustomEvent*): Self = StObject.set(x, "counterCustomEvents", js.Array(value*))
    
    inline def setCreativeAssetSelection(value: SchemaCreativeAssetSelection): Self = StObject.set(x, "creativeAssetSelection", value.asInstanceOf[js.Any])
    
    inline def setCreativeAssetSelectionUndefined: Self = StObject.set(x, "creativeAssetSelection", js.undefined)
    
    inline def setCreativeAssets(value: js.Array[SchemaCreativeAsset]): Self = StObject.set(x, "creativeAssets", value.asInstanceOf[js.Any])
    
    inline def setCreativeAssetsUndefined: Self = StObject.set(x, "creativeAssets", js.undefined)
    
    inline def setCreativeAssetsVarargs(value: SchemaCreativeAsset*): Self = StObject.set(x, "creativeAssets", js.Array(value*))
    
    inline def setCreativeFieldAssignments(value: js.Array[SchemaCreativeFieldAssignment]): Self = StObject.set(x, "creativeFieldAssignments", value.asInstanceOf[js.Any])
    
    inline def setCreativeFieldAssignmentsUndefined: Self = StObject.set(x, "creativeFieldAssignments", js.undefined)
    
    inline def setCreativeFieldAssignmentsVarargs(value: SchemaCreativeFieldAssignment*): Self = StObject.set(x, "creativeFieldAssignments", js.Array(value*))
    
    inline def setCustomKeyValues(value: js.Array[String]): Self = StObject.set(x, "customKeyValues", value.asInstanceOf[js.Any])
    
    inline def setCustomKeyValuesNull: Self = StObject.set(x, "customKeyValues", null)
    
    inline def setCustomKeyValuesUndefined: Self = StObject.set(x, "customKeyValues", js.undefined)
    
    inline def setCustomKeyValuesVarargs(value: String*): Self = StObject.set(x, "customKeyValues", js.Array(value*))
    
    inline def setDynamicAssetSelection(value: Boolean): Self = StObject.set(x, "dynamicAssetSelection", value.asInstanceOf[js.Any])
    
    inline def setDynamicAssetSelectionNull: Self = StObject.set(x, "dynamicAssetSelection", null)
    
    inline def setDynamicAssetSelectionUndefined: Self = StObject.set(x, "dynamicAssetSelection", js.undefined)
    
    inline def setExitCustomEvents(value: js.Array[SchemaCreativeCustomEvent]): Self = StObject.set(x, "exitCustomEvents", value.asInstanceOf[js.Any])
    
    inline def setExitCustomEventsUndefined: Self = StObject.set(x, "exitCustomEvents", js.undefined)
    
    inline def setExitCustomEventsVarargs(value: SchemaCreativeCustomEvent*): Self = StObject.set(x, "exitCustomEvents", js.Array(value*))
    
    inline def setFsCommand(value: SchemaFsCommand): Self = StObject.set(x, "fsCommand", value.asInstanceOf[js.Any])
    
    inline def setFsCommandUndefined: Self = StObject.set(x, "fsCommand", js.undefined)
    
    inline def setHtmlCode(value: String): Self = StObject.set(x, "htmlCode", value.asInstanceOf[js.Any])
    
    inline def setHtmlCodeLocked(value: Boolean): Self = StObject.set(x, "htmlCodeLocked", value.asInstanceOf[js.Any])
    
    inline def setHtmlCodeLockedNull: Self = StObject.set(x, "htmlCodeLocked", null)
    
    inline def setHtmlCodeLockedUndefined: Self = StObject.set(x, "htmlCodeLocked", js.undefined)
    
    inline def setHtmlCodeNull: Self = StObject.set(x, "htmlCode", null)
    
    inline def setHtmlCodeUndefined: Self = StObject.set(x, "htmlCode", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdDimensionValue(value: SchemaDimensionValue): Self = StObject.set(x, "idDimensionValue", value.asInstanceOf[js.Any])
    
    inline def setIdDimensionValueUndefined: Self = StObject.set(x, "idDimensionValue", js.undefined)
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLastModifiedInfo(value: SchemaLastModifiedInfo): Self = StObject.set(x, "lastModifiedInfo", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedInfoUndefined: Self = StObject.set(x, "lastModifiedInfo", js.undefined)
    
    inline def setLatestTraffickedCreativeId(value: String): Self = StObject.set(x, "latestTraffickedCreativeId", value.asInstanceOf[js.Any])
    
    inline def setLatestTraffickedCreativeIdNull: Self = StObject.set(x, "latestTraffickedCreativeId", null)
    
    inline def setLatestTraffickedCreativeIdUndefined: Self = StObject.set(x, "latestTraffickedCreativeId", js.undefined)
    
    inline def setMediaDescription(value: String): Self = StObject.set(x, "mediaDescription", value.asInstanceOf[js.Any])
    
    inline def setMediaDescriptionNull: Self = StObject.set(x, "mediaDescription", null)
    
    inline def setMediaDescriptionUndefined: Self = StObject.set(x, "mediaDescription", js.undefined)
    
    inline def setMediaDuration(value: Double): Self = StObject.set(x, "mediaDuration", value.asInstanceOf[js.Any])
    
    inline def setMediaDurationNull: Self = StObject.set(x, "mediaDuration", null)
    
    inline def setMediaDurationUndefined: Self = StObject.set(x, "mediaDuration", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOverrideCss(value: String): Self = StObject.set(x, "overrideCss", value.asInstanceOf[js.Any])
    
    inline def setOverrideCssNull: Self = StObject.set(x, "overrideCss", null)
    
    inline def setOverrideCssUndefined: Self = StObject.set(x, "overrideCss", js.undefined)
    
    inline def setProgressOffset(value: SchemaVideoOffset): Self = StObject.set(x, "progressOffset", value.asInstanceOf[js.Any])
    
    inline def setProgressOffsetUndefined: Self = StObject.set(x, "progressOffset", js.undefined)
    
    inline def setRedirectUrl(value: String): Self = StObject.set(x, "redirectUrl", value.asInstanceOf[js.Any])
    
    inline def setRedirectUrlNull: Self = StObject.set(x, "redirectUrl", null)
    
    inline def setRedirectUrlUndefined: Self = StObject.set(x, "redirectUrl", js.undefined)
    
    inline def setRenderingId(value: String): Self = StObject.set(x, "renderingId", value.asInstanceOf[js.Any])
    
    inline def setRenderingIdDimensionValue(value: SchemaDimensionValue): Self = StObject.set(x, "renderingIdDimensionValue", value.asInstanceOf[js.Any])
    
    inline def setRenderingIdDimensionValueUndefined: Self = StObject.set(x, "renderingIdDimensionValue", js.undefined)
    
    inline def setRenderingIdNull: Self = StObject.set(x, "renderingId", null)
    
    inline def setRenderingIdUndefined: Self = StObject.set(x, "renderingId", js.undefined)
    
    inline def setRequiredFlashPluginVersion(value: String): Self = StObject.set(x, "requiredFlashPluginVersion", value.asInstanceOf[js.Any])
    
    inline def setRequiredFlashPluginVersionNull: Self = StObject.set(x, "requiredFlashPluginVersion", null)
    
    inline def setRequiredFlashPluginVersionUndefined: Self = StObject.set(x, "requiredFlashPluginVersion", js.undefined)
    
    inline def setRequiredFlashVersion(value: Double): Self = StObject.set(x, "requiredFlashVersion", value.asInstanceOf[js.Any])
    
    inline def setRequiredFlashVersionNull: Self = StObject.set(x, "requiredFlashVersion", null)
    
    inline def setRequiredFlashVersionUndefined: Self = StObject.set(x, "requiredFlashVersion", js.undefined)
    
    inline def setSize(value: SchemaSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSkipOffset(value: SchemaVideoOffset): Self = StObject.set(x, "skipOffset", value.asInstanceOf[js.Any])
    
    inline def setSkipOffsetUndefined: Self = StObject.set(x, "skipOffset", js.undefined)
    
    inline def setSkippable(value: Boolean): Self = StObject.set(x, "skippable", value.asInstanceOf[js.Any])
    
    inline def setSkippableNull: Self = StObject.set(x, "skippable", null)
    
    inline def setSkippableUndefined: Self = StObject.set(x, "skippable", js.undefined)
    
    inline def setSslCompliant(value: Boolean): Self = StObject.set(x, "sslCompliant", value.asInstanceOf[js.Any])
    
    inline def setSslCompliantNull: Self = StObject.set(x, "sslCompliant", null)
    
    inline def setSslCompliantUndefined: Self = StObject.set(x, "sslCompliant", js.undefined)
    
    inline def setSslOverride(value: Boolean): Self = StObject.set(x, "sslOverride", value.asInstanceOf[js.Any])
    
    inline def setSslOverrideNull: Self = StObject.set(x, "sslOverride", null)
    
    inline def setSslOverrideUndefined: Self = StObject.set(x, "sslOverride", js.undefined)
    
    inline def setStudioAdvertiserId(value: String): Self = StObject.set(x, "studioAdvertiserId", value.asInstanceOf[js.Any])
    
    inline def setStudioAdvertiserIdNull: Self = StObject.set(x, "studioAdvertiserId", null)
    
    inline def setStudioAdvertiserIdUndefined: Self = StObject.set(x, "studioAdvertiserId", js.undefined)
    
    inline def setStudioCreativeId(value: String): Self = StObject.set(x, "studioCreativeId", value.asInstanceOf[js.Any])
    
    inline def setStudioCreativeIdNull: Self = StObject.set(x, "studioCreativeId", null)
    
    inline def setStudioCreativeIdUndefined: Self = StObject.set(x, "studioCreativeId", js.undefined)
    
    inline def setStudioTraffickedCreativeId(value: String): Self = StObject.set(x, "studioTraffickedCreativeId", value.asInstanceOf[js.Any])
    
    inline def setStudioTraffickedCreativeIdNull: Self = StObject.set(x, "studioTraffickedCreativeId", null)
    
    inline def setStudioTraffickedCreativeIdUndefined: Self = StObject.set(x, "studioTraffickedCreativeId", js.undefined)
    
    inline def setSubaccountId(value: String): Self = StObject.set(x, "subaccountId", value.asInstanceOf[js.Any])
    
    inline def setSubaccountIdNull: Self = StObject.set(x, "subaccountId", null)
    
    inline def setSubaccountIdUndefined: Self = StObject.set(x, "subaccountId", js.undefined)
    
    inline def setThirdPartyBackupImageImpressionsUrl(value: String): Self = StObject.set(x, "thirdPartyBackupImageImpressionsUrl", value.asInstanceOf[js.Any])
    
    inline def setThirdPartyBackupImageImpressionsUrlNull: Self = StObject.set(x, "thirdPartyBackupImageImpressionsUrl", null)
    
    inline def setThirdPartyBackupImageImpressionsUrlUndefined: Self = StObject.set(x, "thirdPartyBackupImageImpressionsUrl", js.undefined)
    
    inline def setThirdPartyRichMediaImpressionsUrl(value: String): Self = StObject.set(x, "thirdPartyRichMediaImpressionsUrl", value.asInstanceOf[js.Any])
    
    inline def setThirdPartyRichMediaImpressionsUrlNull: Self = StObject.set(x, "thirdPartyRichMediaImpressionsUrl", null)
    
    inline def setThirdPartyRichMediaImpressionsUrlUndefined: Self = StObject.set(x, "thirdPartyRichMediaImpressionsUrl", js.undefined)
    
    inline def setThirdPartyUrls(value: js.Array[SchemaThirdPartyTrackingUrl]): Self = StObject.set(x, "thirdPartyUrls", value.asInstanceOf[js.Any])
    
    inline def setThirdPartyUrlsUndefined: Self = StObject.set(x, "thirdPartyUrls", js.undefined)
    
    inline def setThirdPartyUrlsVarargs(value: SchemaThirdPartyTrackingUrl*): Self = StObject.set(x, "thirdPartyUrls", js.Array(value*))
    
    inline def setTimerCustomEvents(value: js.Array[SchemaCreativeCustomEvent]): Self = StObject.set(x, "timerCustomEvents", value.asInstanceOf[js.Any])
    
    inline def setTimerCustomEventsUndefined: Self = StObject.set(x, "timerCustomEvents", js.undefined)
    
    inline def setTimerCustomEventsVarargs(value: SchemaCreativeCustomEvent*): Self = StObject.set(x, "timerCustomEvents", js.Array(value*))
    
    inline def setTotalFileSize(value: String): Self = StObject.set(x, "totalFileSize", value.asInstanceOf[js.Any])
    
    inline def setTotalFileSizeNull: Self = StObject.set(x, "totalFileSize", null)
    
    inline def setTotalFileSizeUndefined: Self = StObject.set(x, "totalFileSize", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUniversalAdId(value: SchemaUniversalAdId): Self = StObject.set(x, "universalAdId", value.asInstanceOf[js.Any])
    
    inline def setUniversalAdIdUndefined: Self = StObject.set(x, "universalAdId", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
