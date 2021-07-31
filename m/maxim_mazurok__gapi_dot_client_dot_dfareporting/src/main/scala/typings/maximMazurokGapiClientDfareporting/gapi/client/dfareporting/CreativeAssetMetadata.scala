package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreativeAssetMetadata extends StObject {
  
  /** ID of the creative asset. This is a required field. */
  var assetIdentifier: js.UndefOr[CreativeAssetId] = js.undefined
  
  /** List of detected click tags for assets. This is a read-only, auto-generated field. This field is empty for a rich media asset. */
  var clickTags: js.UndefOr[js.Array[ClickTag]] = js.undefined
  
  /** List of counter events configured for the asset. This is a read-only, auto-generated field and only applicable to a rich media asset. */
  var counterCustomEvents: js.UndefOr[js.Array[CreativeCustomEvent]] = js.undefined
  
  /**
    * List of feature dependencies for the creative asset that are detected by Campaign Manager. Feature dependencies are features that a browser must be able to support in order to
    * render your HTML5 creative correctly. This is a read-only, auto-generated field.
    */
  var detectedFeatures: js.UndefOr[js.Array[String]] = js.undefined
  
  /** List of exit events configured for the asset. This is a read-only, auto-generated field and only applicable to a rich media asset. */
  var exitCustomEvents: js.UndefOr[js.Array[CreativeCustomEvent]] = js.undefined
  
  /** Numeric ID of the asset. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Dimension value for the numeric ID of the asset. This is a read-only, auto-generated field. */
  var idDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#creativeAssetMetadata". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** True if the uploaded asset is a rich media asset. This is a read-only, auto-generated field. */
  var richMedia: js.UndefOr[Boolean] = js.undefined
  
  /** List of timer events configured for the asset. This is a read-only, auto-generated field and only applicable to a rich media asset. */
  var timerCustomEvents: js.UndefOr[js.Array[CreativeCustomEvent]] = js.undefined
  
  /**
    * Rules validated during code generation that generated a warning. This is a read-only, auto-generated field. Possible values are: - "ADMOB_REFERENCED" -
    * "ASSET_FORMAT_UNSUPPORTED_DCM" - "ASSET_INVALID" - "CLICK_TAG_HARD_CODED" - "CLICK_TAG_INVALID" - "CLICK_TAG_IN_GWD" - "CLICK_TAG_MISSING" - "CLICK_TAG_MORE_THAN_ONE" -
    * "CLICK_TAG_NON_TOP_LEVEL" - "COMPONENT_UNSUPPORTED_DCM" - "ENABLER_UNSUPPORTED_METHOD_DCM" - "EXTERNAL_FILE_REFERENCED" - "FILE_DETAIL_EMPTY" - "FILE_TYPE_INVALID" -
    * "GWD_PROPERTIES_INVALID" - "HTML5_FEATURE_UNSUPPORTED" - "LINKED_FILE_NOT_FOUND" - "MAX_FLASH_VERSION_11" - "MRAID_REFERENCED" - "NOT_SSL_COMPLIANT" - "ORPHANED_ASSET" -
    * "PRIMARY_HTML_MISSING" - "SVG_INVALID" - "ZIP_INVALID"
    */
  var warnedValidationRules: js.UndefOr[js.Array[String]] = js.undefined
}
object CreativeAssetMetadata {
  
  @scala.inline
  def apply(): CreativeAssetMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeAssetMetadata]
  }
  
  @scala.inline
  implicit class CreativeAssetMetadataMutableBuilder[Self <: CreativeAssetMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetIdentifier(value: CreativeAssetId): Self = StObject.set(x, "assetIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetIdentifierUndefined: Self = StObject.set(x, "assetIdentifier", js.undefined)
    
    @scala.inline
    def setClickTags(value: js.Array[ClickTag]): Self = StObject.set(x, "clickTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickTagsUndefined: Self = StObject.set(x, "clickTags", js.undefined)
    
    @scala.inline
    def setClickTagsVarargs(value: ClickTag*): Self = StObject.set(x, "clickTags", js.Array(value :_*))
    
    @scala.inline
    def setCounterCustomEvents(value: js.Array[CreativeCustomEvent]): Self = StObject.set(x, "counterCustomEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCounterCustomEventsUndefined: Self = StObject.set(x, "counterCustomEvents", js.undefined)
    
    @scala.inline
    def setCounterCustomEventsVarargs(value: CreativeCustomEvent*): Self = StObject.set(x, "counterCustomEvents", js.Array(value :_*))
    
    @scala.inline
    def setDetectedFeatures(value: js.Array[String]): Self = StObject.set(x, "detectedFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectedFeaturesUndefined: Self = StObject.set(x, "detectedFeatures", js.undefined)
    
    @scala.inline
    def setDetectedFeaturesVarargs(value: String*): Self = StObject.set(x, "detectedFeatures", js.Array(value :_*))
    
    @scala.inline
    def setExitCustomEvents(value: js.Array[CreativeCustomEvent]): Self = StObject.set(x, "exitCustomEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitCustomEventsUndefined: Self = StObject.set(x, "exitCustomEvents", js.undefined)
    
    @scala.inline
    def setExitCustomEventsVarargs(value: CreativeCustomEvent*): Self = StObject.set(x, "exitCustomEvents", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdDimensionValue(value: DimensionValue): Self = StObject.set(x, "idDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdDimensionValueUndefined: Self = StObject.set(x, "idDimensionValue", js.undefined)
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setRichMedia(value: Boolean): Self = StObject.set(x, "richMedia", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRichMediaUndefined: Self = StObject.set(x, "richMedia", js.undefined)
    
    @scala.inline
    def setTimerCustomEvents(value: js.Array[CreativeCustomEvent]): Self = StObject.set(x, "timerCustomEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimerCustomEventsUndefined: Self = StObject.set(x, "timerCustomEvents", js.undefined)
    
    @scala.inline
    def setTimerCustomEventsVarargs(value: CreativeCustomEvent*): Self = StObject.set(x, "timerCustomEvents", js.Array(value :_*))
    
    @scala.inline
    def setWarnedValidationRules(value: js.Array[String]): Self = StObject.set(x, "warnedValidationRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarnedValidationRulesUndefined: Self = StObject.set(x, "warnedValidationRules", js.undefined)
    
    @scala.inline
    def setWarnedValidationRulesVarargs(value: String*): Self = StObject.set(x, "warnedValidationRules", js.Array(value :_*))
  }
}
