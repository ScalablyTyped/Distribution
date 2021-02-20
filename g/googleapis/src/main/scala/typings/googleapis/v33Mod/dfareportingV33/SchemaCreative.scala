package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains properties of a Creative.
  */
@js.native
trait SchemaCreative extends StObject {
  
  /**
    * Account ID of this creative. This field, if left unset, will be
    * auto-generated for both insert and update operations. Applicable to all
    * creative types.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * Whether the creative is active. Applicable to all creative types.
    */
  var active: js.UndefOr[Boolean] = js.native
  
  /**
    * Ad parameters user for VPAID creative. This is a read-only field.
    * Applicable to the following creative types: all VPAID.
    */
  var adParameters: js.UndefOr[String] = js.native
  
  /**
    * Keywords for a Rich Media creative. Keywords let you customize the
    * creative settings of a Rich Media ad running on your site without having
    * to contact the advertiser. You can use keywords to dynamically change the
    * look or functionality of a creative. Applicable to the following creative
    * types: all RICH_MEDIA, and all VPAID.
    */
  var adTagKeys: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Additional sizes associated with a responsive creative. When inserting or
    * updating a creative either the size ID field or size width and height
    * fields can be used. Applicable to DISPLAY creatives when the primary
    * asset type is HTML_IMAGE.
    */
  var additionalSizes: js.UndefOr[js.Array[SchemaSize]] = js.native
  
  /**
    * Advertiser ID of this creative. This is a required field. Applicable to
    * all creative types.
    */
  var advertiserId: js.UndefOr[String] = js.native
  
  /**
    * Whether script access is allowed for this creative. This is a read-only
    * and deprecated field which will automatically be set to true on update.
    * Applicable to the following creative types: FLASH_INPAGE.
    */
  var allowScriptAccess: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the creative is archived. Applicable to all creative types.
    */
  var archived: js.UndefOr[Boolean] = js.native
  
  /**
    * Type of artwork used for the creative. This is a read-only field.
    * Applicable to the following creative types: all RICH_MEDIA, and all
    * VPAID.
    */
  var artworkType: js.UndefOr[String] = js.native
  
  /**
    * Source application where creative was authored. Presently, only DBM
    * authored creatives will have this field set. Applicable to all creative
    * types.
    */
  var authoringSource: js.UndefOr[String] = js.native
  
  /**
    * Authoring tool for HTML5 banner creatives. This is a read-only field.
    * Applicable to the following creative types: HTML5_BANNER.
    */
  var authoringTool: js.UndefOr[String] = js.native
  
  /**
    * Whether images are automatically advanced for image gallery creatives.
    * Applicable to the following creative types: DISPLAY_IMAGE_GALLERY.
    */
  var autoAdvanceImages: js.UndefOr[Boolean] = js.native
  
  /**
    * The 6-character HTML color code, beginning with #, for the background of
    * the window area where the Flash file is displayed. Default is white.
    * Applicable to the following creative types: FLASH_INPAGE.
    */
  var backgroundColor: js.UndefOr[String] = js.native
  
  /**
    * Click-through URL for backup image. Applicable to ENHANCED_BANNER when
    * the primary asset type is not HTML_IMAGE.
    */
  var backupImageClickThroughUrl: js.UndefOr[SchemaCreativeClickThroughUrl] = js.native
  
  /**
    * List of feature dependencies that will cause a backup image to be served
    * if the browser that serves the ad does not support them. Feature
    * dependencies are features that a browser must be able to support in order
    * to render your HTML5 creative asset correctly. This field is initially
    * auto-generated to contain all features detected by Campaign Manager for
    * all the assets of this creative and can then be modified by the client.
    * To reset this field, copy over all the creativeAssets&#39; detected
    * features. Applicable to the following creative types: HTML5_BANNER.
    * Applicable to DISPLAY when the primary asset type is not HTML_IMAGE.
    */
  var backupImageFeatures: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Reporting label used for HTML5 banner backup image. Applicable to the
    * following creative types: DISPLAY when the primary asset type is not
    * HTML_IMAGE.
    */
  var backupImageReportingLabel: js.UndefOr[String] = js.native
  
  /**
    * Target window for backup image. Applicable to the following creative
    * types: FLASH_INPAGE and HTML5_BANNER. Applicable to DISPLAY when the
    * primary asset type is not HTML_IMAGE.
    */
  var backupImageTargetWindow: js.UndefOr[SchemaTargetWindow] = js.native
  
  /**
    * Click tags of the creative. For DISPLAY, FLASH_INPAGE, and HTML5_BANNER
    * creatives, this is a subset of detected click tags for the assets
    * associated with this creative. After creating a flash asset, detected
    * click tags will be returned in the creativeAssetMetadata. When inserting
    * the creative, populate the creative clickTags field using the
    * creativeAssetMetadata.clickTags field. For DISPLAY_IMAGE_GALLERY
    * creatives, there should be exactly one entry in this list for each image
    * creative asset. A click tag is matched with a corresponding creative
    * asset by matching the clickTag.name field with the
    * creativeAsset.assetIdentifier.name field. Applicable to the following
    * creative types: DISPLAY_IMAGE_GALLERY, FLASH_INPAGE, HTML5_BANNER.
    * Applicable to DISPLAY when the primary asset type is not HTML_IMAGE.
    */
  var clickTags: js.UndefOr[js.Array[SchemaClickTag]] = js.native
  
  /**
    * Industry standard ID assigned to creative for reach and frequency.
    * Applicable to INSTREAM_VIDEO_REDIRECT creatives.
    */
  var commercialId: js.UndefOr[String] = js.native
  
  /**
    * List of companion creatives assigned to an in-Stream video creative.
    * Acceptable values include IDs of existing flash and image creatives.
    * Applicable to the following creative types: all VPAID, all INSTREAM_AUDIO
    * and all INSTREAM_VIDEO with dynamicAssetSelection set to false.
    */
  var companionCreatives: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Compatibilities associated with this creative. This is a read-only field.
    * DISPLAY and DISPLAY_INTERSTITIAL refer to rendering either on desktop or
    * on mobile devices or in mobile apps for regular or interstitial ads,
    * respectively. APP and APP_INTERSTITIAL are for rendering in mobile apps.
    * Only pre-existing creatives may have these compatibilities since new
    * creatives will either be assigned DISPLAY or DISPLAY_INTERSTITIAL
    * instead. IN_STREAM_VIDEO refers to rendering in in-stream video ads
    * developed with the VAST standard. IN_STREAM_AUDIO refers to rendering in
    * in-stream audio ads developed with the VAST standard. Applicable to all
    * creative types.  Acceptable values are: - &quot;APP&quot; -
    * &quot;APP_INTERSTITIAL&quot; - &quot;IN_STREAM_VIDEO&quot; -
    * &quot;IN_STREAM_AUDIO&quot; - &quot;DISPLAY&quot; -
    * &quot;DISPLAY_INTERSTITIAL&quot;
    */
  var compatibility: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Whether Flash assets associated with the creative need to be
    * automatically converted to HTML5. This flag is enabled by default and
    * users can choose to disable it if they don&#39;t want the system to
    * generate and use HTML5 asset for this creative. Applicable to the
    * following creative type: FLASH_INPAGE. Applicable to DISPLAY when the
    * primary asset type is not HTML_IMAGE.
    */
  var convertFlashToHtml5: js.UndefOr[Boolean] = js.native
  
  /**
    * List of counter events configured for the creative. For
    * DISPLAY_IMAGE_GALLERY creatives, these are read-only and auto-generated
    * from clickTags. Applicable to the following creative types:
    * DISPLAY_IMAGE_GALLERY, all RICH_MEDIA, and all VPAID.
    */
  var counterCustomEvents: js.UndefOr[js.Array[SchemaCreativeCustomEvent]] = js.native
  
  /**
    * Required if dynamicAssetSelection is true.
    */
  var creativeAssetSelection: js.UndefOr[SchemaCreativeAssetSelection] = js.native
  
  /**
    * Assets associated with a creative. Applicable to all but the following
    * creative types: INTERNAL_REDIRECT, INTERSTITIAL_INTERNAL_REDIRECT, and
    * REDIRECT
    */
  var creativeAssets: js.UndefOr[js.Array[SchemaCreativeAsset]] = js.native
  
  /**
    * Creative field assignments for this creative. Applicable to all creative
    * types.
    */
  var creativeFieldAssignments: js.UndefOr[js.Array[SchemaCreativeFieldAssignment]] = js.native
  
  /**
    * Custom key-values for a Rich Media creative. Key-values let you customize
    * the creative settings of a Rich Media ad running on your site without
    * having to contact the advertiser. You can use key-values to dynamically
    * change the look or functionality of a creative. Applicable to the
    * following creative types: all RICH_MEDIA, and all VPAID.
    */
  var customKeyValues: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Set this to true to enable the use of rules to target individual assets
    * in this creative. When set to true creativeAssetSelection must be set.
    * This also controls asset-level companions. When this is true, companion
    * creatives should be assigned to creative assets. Learn more. Applicable
    * to INSTREAM_VIDEO creatives.
    */
  var dynamicAssetSelection: js.UndefOr[Boolean] = js.native
  
  /**
    * List of exit events configured for the creative. For DISPLAY and
    * DISPLAY_IMAGE_GALLERY creatives, these are read-only and auto-generated
    * from clickTags, For DISPLAY, an event is also created from the
    * backupImageReportingLabel. Applicable to the following creative types:
    * DISPLAY_IMAGE_GALLERY, all RICH_MEDIA, and all VPAID. Applicable to
    * DISPLAY when the primary asset type is not HTML_IMAGE.
    */
  var exitCustomEvents: js.UndefOr[js.Array[SchemaCreativeCustomEvent]] = js.native
  
  /**
    * OpenWindow FSCommand of this creative. This lets the SWF file communicate
    * with either Flash Player or the program hosting Flash Player, such as a
    * web browser. This is only triggered if allowScriptAccess field is true.
    * Applicable to the following creative types: FLASH_INPAGE.
    */
  var fsCommand: js.UndefOr[SchemaFsCommand] = js.native
  
  /**
    * HTML code for the creative. This is a required field when applicable.
    * This field is ignored if htmlCodeLocked is true. Applicable to the
    * following creative types: all CUSTOM, FLASH_INPAGE, and HTML5_BANNER, and
    * all RICH_MEDIA.
    */
  var htmlCode: js.UndefOr[String] = js.native
  
  /**
    * Whether HTML code is generated by Campaign Manager or manually entered.
    * Set to true to ignore changes to htmlCode. Applicable to the following
    * creative types: FLASH_INPAGE and HTML5_BANNER.
    */
  var htmlCodeLocked: js.UndefOr[Boolean] = js.native
  
  /**
    * ID of this creative. This is a read-only, auto-generated field.
    * Applicable to all creative types.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Dimension value for the ID of this creative. This is a read-only field.
    * Applicable to all creative types.
    */
  var idDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#creative&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Creative last modification information. This is a read-only field.
    * Applicable to all creative types.
    */
  var lastModifiedInfo: js.UndefOr[SchemaLastModifiedInfo] = js.native
  
  /**
    * Latest Studio trafficked creative ID associated with rich media and VPAID
    * creatives. This is a read-only field. Applicable to the following
    * creative types: all RICH_MEDIA, and all VPAID.
    */
  var latestTraffickedCreativeId: js.UndefOr[String] = js.native
  
  /**
    * Description of the audio or video ad. Applicable to the following
    * creative types: all INSTREAM_VIDEO, INSTREAM_AUDIO, and all VPAID.
    */
  var mediaDescription: js.UndefOr[String] = js.native
  
  /**
    * Creative audio or video duration in seconds. This is a read-only field.
    * Applicable to the following creative types: INSTREAM_VIDEO,
    * INSTREAM_AUDIO, all RICH_MEDIA, and all VPAID.
    */
  var mediaDuration: js.UndefOr[Double] = js.native
  
  /**
    * Name of the creative. This is a required field and must be less than 256
    * characters long. Applicable to all creative types.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Override CSS value for rich media creatives. Applicable to the following
    * creative types: all RICH_MEDIA.
    */
  var overrideCss: js.UndefOr[String] = js.native
  
  /**
    * Amount of time to play the video before counting a view. Applicable to
    * the following creative types: all INSTREAM_VIDEO.
    */
  var progressOffset: js.UndefOr[SchemaVideoOffset] = js.native
  
  /**
    * URL of hosted image or hosted video or another ad tag. For
    * INSTREAM_VIDEO_REDIRECT creatives this is the in-stream video redirect
    * URL. The standard for a VAST (Video Ad Serving Template) ad response
    * allows for a redirect link to another VAST 2.0 or 3.0 call. This is a
    * required field when applicable. Applicable to the following creative
    * types: DISPLAY_REDIRECT, INTERNAL_REDIRECT,
    * INTERSTITIAL_INTERNAL_REDIRECT, and INSTREAM_VIDEO_REDIRECT
    */
  var redirectUrl: js.UndefOr[String] = js.native
  
  /**
    * ID of current rendering version. This is a read-only field. Applicable to
    * all creative types.
    */
  var renderingId: js.UndefOr[String] = js.native
  
  /**
    * Dimension value for the rendering ID of this creative. This is a
    * read-only field. Applicable to all creative types.
    */
  var renderingIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  
  /**
    * The minimum required Flash plugin version for this creative. For
    * example, 11.2.202.235. This is a read-only field. Applicable to the
    * following creative types: all RICH_MEDIA, and all VPAID.
    */
  var requiredFlashPluginVersion: js.UndefOr[String] = js.native
  
  /**
    * The internal Flash version for this creative as calculated by Studio.
    * This is a read-only field. Applicable to the following creative types:
    * FLASH_INPAGE all RICH_MEDIA, and all VPAID. Applicable to DISPLAY when
    * the primary asset type is not HTML_IMAGE.
    */
  var requiredFlashVersion: js.UndefOr[Double] = js.native
  
  /**
    * Size associated with this creative. When inserting or updating a creative
    * either the size ID field or size width and height fields can be used.
    * This is a required field when applicable; however for IMAGE, FLASH_INPAGE
    * creatives, and for DISPLAY creatives with a primary asset of type
    * HTML_IMAGE, if left blank, this field will be automatically set using the
    * actual size of the associated image assets. Applicable to the following
    * creative types: DISPLAY, DISPLAY_IMAGE_GALLERY, FLASH_INPAGE,
    * HTML5_BANNER, IMAGE, and all RICH_MEDIA.
    */
  var size: js.UndefOr[SchemaSize] = js.native
  
  /**
    * Amount of time to play the video before the skip button appears.
    * Applicable to the following creative types: all INSTREAM_VIDEO.
    */
  var skipOffset: js.UndefOr[SchemaVideoOffset] = js.native
  
  /**
    * Whether the user can choose to skip the creative. Applicable to the
    * following creative types: all INSTREAM_VIDEO and all VPAID.
    */
  var skippable: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the creative is SSL-compliant. This is a read-only field.
    * Applicable to all creative types.
    */
  var sslCompliant: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether creative should be treated as SSL compliant even if the system
    * scan shows it&#39;s not. Applicable to all creative types.
    */
  var sslOverride: js.UndefOr[Boolean] = js.native
  
  /**
    * Studio advertiser ID associated with rich media and VPAID creatives. This
    * is a read-only field. Applicable to the following creative types: all
    * RICH_MEDIA, and all VPAID.
    */
  var studioAdvertiserId: js.UndefOr[String] = js.native
  
  /**
    * Studio creative ID associated with rich media and VPAID creatives. This
    * is a read-only field. Applicable to the following creative types: all
    * RICH_MEDIA, and all VPAID.
    */
  var studioCreativeId: js.UndefOr[String] = js.native
  
  /**
    * Studio trafficked creative ID associated with rich media and VPAID
    * creatives. This is a read-only field. Applicable to the following
    * creative types: all RICH_MEDIA, and all VPAID.
    */
  var studioTraffickedCreativeId: js.UndefOr[String] = js.native
  
  /**
    * Subaccount ID of this creative. This field, if left unset, will be
    * auto-generated for both insert and update operations. Applicable to all
    * creative types.
    */
  var subaccountId: js.UndefOr[String] = js.native
  
  /**
    * Third-party URL used to record backup image impressions. Applicable to
    * the following creative types: all RICH_MEDIA.
    */
  var thirdPartyBackupImageImpressionsUrl: js.UndefOr[String] = js.native
  
  /**
    * Third-party URL used to record rich media impressions. Applicable to the
    * following creative types: all RICH_MEDIA.
    */
  var thirdPartyRichMediaImpressionsUrl: js.UndefOr[String] = js.native
  
  /**
    * Third-party URLs for tracking in-stream creative events. Applicable to
    * the following creative types: all INSTREAM_VIDEO, all INSTREAM_AUDIO, and
    * all VPAID.
    */
  var thirdPartyUrls: js.UndefOr[js.Array[SchemaThirdPartyTrackingUrl]] = js.native
  
  /**
    * List of timer events configured for the creative. For
    * DISPLAY_IMAGE_GALLERY creatives, these are read-only and auto-generated
    * from clickTags. Applicable to the following creative types:
    * DISPLAY_IMAGE_GALLERY, all RICH_MEDIA, and all VPAID. Applicable to
    * DISPLAY when the primary asset is not HTML_IMAGE.
    */
  var timerCustomEvents: js.UndefOr[js.Array[SchemaCreativeCustomEvent]] = js.native
  
  /**
    * Combined size of all creative assets. This is a read-only field.
    * Applicable to the following creative types: all RICH_MEDIA, and all
    * VPAID.
    */
  var totalFileSize: js.UndefOr[String] = js.native
  
  /**
    * Type of this creative. This is a required field. Applicable to all
    * creative types.  Note: FLASH_INPAGE, HTML5_BANNER, and IMAGE are only
    * used for existing creatives. New creatives should use DISPLAY as a
    * replacement for these types.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * A Universal Ad ID as per the VAST 4.0 spec. Applicable to the following
    * creative types: INSTREAM_AUDIO and INSTREAM_VIDEO and VPAID.
    */
  var universalAdId: js.UndefOr[SchemaUniversalAdId] = js.native
  
  /**
    * The version number helps you keep track of multiple versions of your
    * creative in your reports. The version number will always be
    * auto-generated during insert operations to start at 1. For tracking
    * creatives the version cannot be incremented and will always remain at 1.
    * For all other creative types the version can be incremented only by 1
    * during update operations. In addition, the version will be automatically
    * incremented by 1 when undergoing Rich Media creative merging. Applicable
    * to all creative types.
    */
  var version: js.UndefOr[Double] = js.native
}
object SchemaCreative {
  
  @scala.inline
  def apply(): SchemaCreative = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreative]
  }
  
  @scala.inline
  implicit class SchemaCreativeMutableBuilder[Self <: SchemaCreative] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setAdParameters(value: String): Self = StObject.set(x, "adParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdParametersUndefined: Self = StObject.set(x, "adParameters", js.undefined)
    
    @scala.inline
    def setAdTagKeys(value: js.Array[String]): Self = StObject.set(x, "adTagKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdTagKeysUndefined: Self = StObject.set(x, "adTagKeys", js.undefined)
    
    @scala.inline
    def setAdTagKeysVarargs(value: String*): Self = StObject.set(x, "adTagKeys", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalSizes(value: js.Array[SchemaSize]): Self = StObject.set(x, "additionalSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalSizesUndefined: Self = StObject.set(x, "additionalSizes", js.undefined)
    
    @scala.inline
    def setAdditionalSizesVarargs(value: SchemaSize*): Self = StObject.set(x, "additionalSizes", js.Array(value :_*))
    
    @scala.inline
    def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    @scala.inline
    def setAllowScriptAccess(value: Boolean): Self = StObject.set(x, "allowScriptAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowScriptAccessUndefined: Self = StObject.set(x, "allowScriptAccess", js.undefined)
    
    @scala.inline
    def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchivedUndefined: Self = StObject.set(x, "archived", js.undefined)
    
    @scala.inline
    def setArtworkType(value: String): Self = StObject.set(x, "artworkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtworkTypeUndefined: Self = StObject.set(x, "artworkType", js.undefined)
    
    @scala.inline
    def setAuthoringSource(value: String): Self = StObject.set(x, "authoringSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthoringSourceUndefined: Self = StObject.set(x, "authoringSource", js.undefined)
    
    @scala.inline
    def setAuthoringTool(value: String): Self = StObject.set(x, "authoringTool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthoringToolUndefined: Self = StObject.set(x, "authoringTool", js.undefined)
    
    @scala.inline
    def setAutoAdvanceImages(value: Boolean): Self = StObject.set(x, "autoAdvanceImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoAdvanceImagesUndefined: Self = StObject.set(x, "autoAdvanceImages", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBackupImageClickThroughUrl(value: SchemaCreativeClickThroughUrl): Self = StObject.set(x, "backupImageClickThroughUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupImageClickThroughUrlUndefined: Self = StObject.set(x, "backupImageClickThroughUrl", js.undefined)
    
    @scala.inline
    def setBackupImageFeatures(value: js.Array[String]): Self = StObject.set(x, "backupImageFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupImageFeaturesUndefined: Self = StObject.set(x, "backupImageFeatures", js.undefined)
    
    @scala.inline
    def setBackupImageFeaturesVarargs(value: String*): Self = StObject.set(x, "backupImageFeatures", js.Array(value :_*))
    
    @scala.inline
    def setBackupImageReportingLabel(value: String): Self = StObject.set(x, "backupImageReportingLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupImageReportingLabelUndefined: Self = StObject.set(x, "backupImageReportingLabel", js.undefined)
    
    @scala.inline
    def setBackupImageTargetWindow(value: SchemaTargetWindow): Self = StObject.set(x, "backupImageTargetWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupImageTargetWindowUndefined: Self = StObject.set(x, "backupImageTargetWindow", js.undefined)
    
    @scala.inline
    def setClickTags(value: js.Array[SchemaClickTag]): Self = StObject.set(x, "clickTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickTagsUndefined: Self = StObject.set(x, "clickTags", js.undefined)
    
    @scala.inline
    def setClickTagsVarargs(value: SchemaClickTag*): Self = StObject.set(x, "clickTags", js.Array(value :_*))
    
    @scala.inline
    def setCommercialId(value: String): Self = StObject.set(x, "commercialId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommercialIdUndefined: Self = StObject.set(x, "commercialId", js.undefined)
    
    @scala.inline
    def setCompanionCreatives(value: js.Array[String]): Self = StObject.set(x, "companionCreatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanionCreativesUndefined: Self = StObject.set(x, "companionCreatives", js.undefined)
    
    @scala.inline
    def setCompanionCreativesVarargs(value: String*): Self = StObject.set(x, "companionCreatives", js.Array(value :_*))
    
    @scala.inline
    def setCompatibility(value: js.Array[String]): Self = StObject.set(x, "compatibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompatibilityUndefined: Self = StObject.set(x, "compatibility", js.undefined)
    
    @scala.inline
    def setCompatibilityVarargs(value: String*): Self = StObject.set(x, "compatibility", js.Array(value :_*))
    
    @scala.inline
    def setConvertFlashToHtml5(value: Boolean): Self = StObject.set(x, "convertFlashToHtml5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvertFlashToHtml5Undefined: Self = StObject.set(x, "convertFlashToHtml5", js.undefined)
    
    @scala.inline
    def setCounterCustomEvents(value: js.Array[SchemaCreativeCustomEvent]): Self = StObject.set(x, "counterCustomEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCounterCustomEventsUndefined: Self = StObject.set(x, "counterCustomEvents", js.undefined)
    
    @scala.inline
    def setCounterCustomEventsVarargs(value: SchemaCreativeCustomEvent*): Self = StObject.set(x, "counterCustomEvents", js.Array(value :_*))
    
    @scala.inline
    def setCreativeAssetSelection(value: SchemaCreativeAssetSelection): Self = StObject.set(x, "creativeAssetSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeAssetSelectionUndefined: Self = StObject.set(x, "creativeAssetSelection", js.undefined)
    
    @scala.inline
    def setCreativeAssets(value: js.Array[SchemaCreativeAsset]): Self = StObject.set(x, "creativeAssets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeAssetsUndefined: Self = StObject.set(x, "creativeAssets", js.undefined)
    
    @scala.inline
    def setCreativeAssetsVarargs(value: SchemaCreativeAsset*): Self = StObject.set(x, "creativeAssets", js.Array(value :_*))
    
    @scala.inline
    def setCreativeFieldAssignments(value: js.Array[SchemaCreativeFieldAssignment]): Self = StObject.set(x, "creativeFieldAssignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeFieldAssignmentsUndefined: Self = StObject.set(x, "creativeFieldAssignments", js.undefined)
    
    @scala.inline
    def setCreativeFieldAssignmentsVarargs(value: SchemaCreativeFieldAssignment*): Self = StObject.set(x, "creativeFieldAssignments", js.Array(value :_*))
    
    @scala.inline
    def setCustomKeyValues(value: js.Array[String]): Self = StObject.set(x, "customKeyValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomKeyValuesUndefined: Self = StObject.set(x, "customKeyValues", js.undefined)
    
    @scala.inline
    def setCustomKeyValuesVarargs(value: String*): Self = StObject.set(x, "customKeyValues", js.Array(value :_*))
    
    @scala.inline
    def setDynamicAssetSelection(value: Boolean): Self = StObject.set(x, "dynamicAssetSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicAssetSelectionUndefined: Self = StObject.set(x, "dynamicAssetSelection", js.undefined)
    
    @scala.inline
    def setExitCustomEvents(value: js.Array[SchemaCreativeCustomEvent]): Self = StObject.set(x, "exitCustomEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitCustomEventsUndefined: Self = StObject.set(x, "exitCustomEvents", js.undefined)
    
    @scala.inline
    def setExitCustomEventsVarargs(value: SchemaCreativeCustomEvent*): Self = StObject.set(x, "exitCustomEvents", js.Array(value :_*))
    
    @scala.inline
    def setFsCommand(value: SchemaFsCommand): Self = StObject.set(x, "fsCommand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFsCommandUndefined: Self = StObject.set(x, "fsCommand", js.undefined)
    
    @scala.inline
    def setHtmlCode(value: String): Self = StObject.set(x, "htmlCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlCodeLocked(value: Boolean): Self = StObject.set(x, "htmlCodeLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlCodeLockedUndefined: Self = StObject.set(x, "htmlCodeLocked", js.undefined)
    
    @scala.inline
    def setHtmlCodeUndefined: Self = StObject.set(x, "htmlCode", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdDimensionValue(value: SchemaDimensionValue): Self = StObject.set(x, "idDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdDimensionValueUndefined: Self = StObject.set(x, "idDimensionValue", js.undefined)
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLastModifiedInfo(value: SchemaLastModifiedInfo): Self = StObject.set(x, "lastModifiedInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedInfoUndefined: Self = StObject.set(x, "lastModifiedInfo", js.undefined)
    
    @scala.inline
    def setLatestTraffickedCreativeId(value: String): Self = StObject.set(x, "latestTraffickedCreativeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestTraffickedCreativeIdUndefined: Self = StObject.set(x, "latestTraffickedCreativeId", js.undefined)
    
    @scala.inline
    def setMediaDescription(value: String): Self = StObject.set(x, "mediaDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaDescriptionUndefined: Self = StObject.set(x, "mediaDescription", js.undefined)
    
    @scala.inline
    def setMediaDuration(value: Double): Self = StObject.set(x, "mediaDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaDurationUndefined: Self = StObject.set(x, "mediaDuration", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOverrideCss(value: String): Self = StObject.set(x, "overrideCss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideCssUndefined: Self = StObject.set(x, "overrideCss", js.undefined)
    
    @scala.inline
    def setProgressOffset(value: SchemaVideoOffset): Self = StObject.set(x, "progressOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressOffsetUndefined: Self = StObject.set(x, "progressOffset", js.undefined)
    
    @scala.inline
    def setRedirectUrl(value: String): Self = StObject.set(x, "redirectUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectUrlUndefined: Self = StObject.set(x, "redirectUrl", js.undefined)
    
    @scala.inline
    def setRenderingId(value: String): Self = StObject.set(x, "renderingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderingIdDimensionValue(value: SchemaDimensionValue): Self = StObject.set(x, "renderingIdDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderingIdDimensionValueUndefined: Self = StObject.set(x, "renderingIdDimensionValue", js.undefined)
    
    @scala.inline
    def setRenderingIdUndefined: Self = StObject.set(x, "renderingId", js.undefined)
    
    @scala.inline
    def setRequiredFlashPluginVersion(value: String): Self = StObject.set(x, "requiredFlashPluginVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredFlashPluginVersionUndefined: Self = StObject.set(x, "requiredFlashPluginVersion", js.undefined)
    
    @scala.inline
    def setRequiredFlashVersion(value: Double): Self = StObject.set(x, "requiredFlashVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredFlashVersionUndefined: Self = StObject.set(x, "requiredFlashVersion", js.undefined)
    
    @scala.inline
    def setSize(value: SchemaSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSkipOffset(value: SchemaVideoOffset): Self = StObject.set(x, "skipOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipOffsetUndefined: Self = StObject.set(x, "skipOffset", js.undefined)
    
    @scala.inline
    def setSkippable(value: Boolean): Self = StObject.set(x, "skippable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkippableUndefined: Self = StObject.set(x, "skippable", js.undefined)
    
    @scala.inline
    def setSslCompliant(value: Boolean): Self = StObject.set(x, "sslCompliant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslCompliantUndefined: Self = StObject.set(x, "sslCompliant", js.undefined)
    
    @scala.inline
    def setSslOverride(value: Boolean): Self = StObject.set(x, "sslOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslOverrideUndefined: Self = StObject.set(x, "sslOverride", js.undefined)
    
    @scala.inline
    def setStudioAdvertiserId(value: String): Self = StObject.set(x, "studioAdvertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStudioAdvertiserIdUndefined: Self = StObject.set(x, "studioAdvertiserId", js.undefined)
    
    @scala.inline
    def setStudioCreativeId(value: String): Self = StObject.set(x, "studioCreativeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStudioCreativeIdUndefined: Self = StObject.set(x, "studioCreativeId", js.undefined)
    
    @scala.inline
    def setStudioTraffickedCreativeId(value: String): Self = StObject.set(x, "studioTraffickedCreativeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStudioTraffickedCreativeIdUndefined: Self = StObject.set(x, "studioTraffickedCreativeId", js.undefined)
    
    @scala.inline
    def setSubaccountId(value: String): Self = StObject.set(x, "subaccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubaccountIdUndefined: Self = StObject.set(x, "subaccountId", js.undefined)
    
    @scala.inline
    def setThirdPartyBackupImageImpressionsUrl(value: String): Self = StObject.set(x, "thirdPartyBackupImageImpressionsUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThirdPartyBackupImageImpressionsUrlUndefined: Self = StObject.set(x, "thirdPartyBackupImageImpressionsUrl", js.undefined)
    
    @scala.inline
    def setThirdPartyRichMediaImpressionsUrl(value: String): Self = StObject.set(x, "thirdPartyRichMediaImpressionsUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThirdPartyRichMediaImpressionsUrlUndefined: Self = StObject.set(x, "thirdPartyRichMediaImpressionsUrl", js.undefined)
    
    @scala.inline
    def setThirdPartyUrls(value: js.Array[SchemaThirdPartyTrackingUrl]): Self = StObject.set(x, "thirdPartyUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThirdPartyUrlsUndefined: Self = StObject.set(x, "thirdPartyUrls", js.undefined)
    
    @scala.inline
    def setThirdPartyUrlsVarargs(value: SchemaThirdPartyTrackingUrl*): Self = StObject.set(x, "thirdPartyUrls", js.Array(value :_*))
    
    @scala.inline
    def setTimerCustomEvents(value: js.Array[SchemaCreativeCustomEvent]): Self = StObject.set(x, "timerCustomEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimerCustomEventsUndefined: Self = StObject.set(x, "timerCustomEvents", js.undefined)
    
    @scala.inline
    def setTimerCustomEventsVarargs(value: SchemaCreativeCustomEvent*): Self = StObject.set(x, "timerCustomEvents", js.Array(value :_*))
    
    @scala.inline
    def setTotalFileSize(value: String): Self = StObject.set(x, "totalFileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalFileSizeUndefined: Self = StObject.set(x, "totalFileSize", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUniversalAdId(value: SchemaUniversalAdId): Self = StObject.set(x, "universalAdId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniversalAdIdUndefined: Self = StObject.set(x, "universalAdId", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
