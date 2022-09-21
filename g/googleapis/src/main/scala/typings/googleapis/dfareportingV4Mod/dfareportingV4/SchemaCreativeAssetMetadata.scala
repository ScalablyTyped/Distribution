package typings.googleapis.dfareportingV4Mod.dfareportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreativeAssetMetadata extends StObject {
  
  /**
    * ID of the creative asset. This is a required field.
    */
  var assetIdentifier: js.UndefOr[SchemaCreativeAssetId] = js.undefined
  
  /**
    * List of detected click tags for assets. This is a read-only, auto-generated field. This field is empty for a rich media asset.
    */
  var clickTags: js.UndefOr[js.Array[SchemaClickTag]] = js.undefined
  
  /**
    * List of counter events configured for the asset. This is a read-only, auto-generated field and only applicable to a rich media asset.
    */
  var counterCustomEvents: js.UndefOr[js.Array[SchemaCreativeCustomEvent]] = js.undefined
  
  /**
    * List of feature dependencies for the creative asset that are detected by Campaign Manager. Feature dependencies are features that a browser must be able to support in order to render your HTML5 creative correctly. This is a read-only, auto-generated field.
    */
  var detectedFeatures: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * List of exit events configured for the asset. This is a read-only, auto-generated field and only applicable to a rich media asset.
    */
  var exitCustomEvents: js.UndefOr[js.Array[SchemaCreativeCustomEvent]] = js.undefined
  
  /**
    * Numeric ID of the asset. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Dimension value for the numeric ID of the asset. This is a read-only, auto-generated field.
    */
  var idDimensionValue: js.UndefOr[SchemaDimensionValue] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#creativeAssetMetadata".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * True if the uploaded asset is a rich media asset. This is a read-only, auto-generated field.
    */
  var richMedia: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * List of timer events configured for the asset. This is a read-only, auto-generated field and only applicable to a rich media asset.
    */
  var timerCustomEvents: js.UndefOr[js.Array[SchemaCreativeCustomEvent]] = js.undefined
  
  /**
    * Rules validated during code generation that generated a warning. This is a read-only, auto-generated field. Possible values are: - "ADMOB_REFERENCED" - "ASSET_FORMAT_UNSUPPORTED_DCM" - "ASSET_INVALID" - "CLICK_TAG_HARD_CODED" - "CLICK_TAG_INVALID" - "CLICK_TAG_IN_GWD" - "CLICK_TAG_MISSING" - "CLICK_TAG_MORE_THAN_ONE" - "CLICK_TAG_NON_TOP_LEVEL" - "COMPONENT_UNSUPPORTED_DCM" - "ENABLER_UNSUPPORTED_METHOD_DCM" - "EXTERNAL_FILE_REFERENCED" - "FILE_DETAIL_EMPTY" - "FILE_TYPE_INVALID" - "GWD_PROPERTIES_INVALID" - "HTML5_FEATURE_UNSUPPORTED" - "LINKED_FILE_NOT_FOUND" - "MAX_FLASH_VERSION_11" - "MRAID_REFERENCED" - "NOT_SSL_COMPLIANT" - "ORPHANED_ASSET" - "PRIMARY_HTML_MISSING" - "SVG_INVALID" - "ZIP_INVALID"
    */
  var warnedValidationRules: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaCreativeAssetMetadata {
  
  inline def apply(): SchemaCreativeAssetMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeAssetMetadata]
  }
  
  extension [Self <: SchemaCreativeAssetMetadata](x: Self) {
    
    inline def setAssetIdentifier(value: SchemaCreativeAssetId): Self = StObject.set(x, "assetIdentifier", value.asInstanceOf[js.Any])
    
    inline def setAssetIdentifierUndefined: Self = StObject.set(x, "assetIdentifier", js.undefined)
    
    inline def setClickTags(value: js.Array[SchemaClickTag]): Self = StObject.set(x, "clickTags", value.asInstanceOf[js.Any])
    
    inline def setClickTagsUndefined: Self = StObject.set(x, "clickTags", js.undefined)
    
    inline def setClickTagsVarargs(value: SchemaClickTag*): Self = StObject.set(x, "clickTags", js.Array(value*))
    
    inline def setCounterCustomEvents(value: js.Array[SchemaCreativeCustomEvent]): Self = StObject.set(x, "counterCustomEvents", value.asInstanceOf[js.Any])
    
    inline def setCounterCustomEventsUndefined: Self = StObject.set(x, "counterCustomEvents", js.undefined)
    
    inline def setCounterCustomEventsVarargs(value: SchemaCreativeCustomEvent*): Self = StObject.set(x, "counterCustomEvents", js.Array(value*))
    
    inline def setDetectedFeatures(value: js.Array[String]): Self = StObject.set(x, "detectedFeatures", value.asInstanceOf[js.Any])
    
    inline def setDetectedFeaturesNull: Self = StObject.set(x, "detectedFeatures", null)
    
    inline def setDetectedFeaturesUndefined: Self = StObject.set(x, "detectedFeatures", js.undefined)
    
    inline def setDetectedFeaturesVarargs(value: String*): Self = StObject.set(x, "detectedFeatures", js.Array(value*))
    
    inline def setExitCustomEvents(value: js.Array[SchemaCreativeCustomEvent]): Self = StObject.set(x, "exitCustomEvents", value.asInstanceOf[js.Any])
    
    inline def setExitCustomEventsUndefined: Self = StObject.set(x, "exitCustomEvents", js.undefined)
    
    inline def setExitCustomEventsVarargs(value: SchemaCreativeCustomEvent*): Self = StObject.set(x, "exitCustomEvents", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdDimensionValue(value: SchemaDimensionValue): Self = StObject.set(x, "idDimensionValue", value.asInstanceOf[js.Any])
    
    inline def setIdDimensionValueUndefined: Self = StObject.set(x, "idDimensionValue", js.undefined)
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setRichMedia(value: Boolean): Self = StObject.set(x, "richMedia", value.asInstanceOf[js.Any])
    
    inline def setRichMediaNull: Self = StObject.set(x, "richMedia", null)
    
    inline def setRichMediaUndefined: Self = StObject.set(x, "richMedia", js.undefined)
    
    inline def setTimerCustomEvents(value: js.Array[SchemaCreativeCustomEvent]): Self = StObject.set(x, "timerCustomEvents", value.asInstanceOf[js.Any])
    
    inline def setTimerCustomEventsUndefined: Self = StObject.set(x, "timerCustomEvents", js.undefined)
    
    inline def setTimerCustomEventsVarargs(value: SchemaCreativeCustomEvent*): Self = StObject.set(x, "timerCustomEvents", js.Array(value*))
    
    inline def setWarnedValidationRules(value: js.Array[String]): Self = StObject.set(x, "warnedValidationRules", value.asInstanceOf[js.Any])
    
    inline def setWarnedValidationRulesNull: Self = StObject.set(x, "warnedValidationRules", null)
    
    inline def setWarnedValidationRulesUndefined: Self = StObject.set(x, "warnedValidationRules", js.undefined)
    
    inline def setWarnedValidationRulesVarargs(value: String*): Self = StObject.set(x, "warnedValidationRules", js.Array(value*))
  }
}
