package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CreativeAssets contains properties of a creative asset file which will be
  * uploaded or has already been uploaded. Refer to the creative sample code
  * for how to upload assets and insert a creative.
  */
trait SchemaCreativeAssetMetadata extends StObject {
  
  /**
    * ID of the creative asset. This is a required field.
    */
  var assetIdentifier: js.UndefOr[SchemaCreativeAssetId] = js.undefined
  
  /**
    * List of detected click tags for assets. This is a read-only
    * auto-generated field.
    */
  var clickTags: js.UndefOr[js.Array[SchemaClickTag]] = js.undefined
  
  /**
    * List of feature dependencies for the creative asset that are detected by
    * Campaign Manager. Feature dependencies are features that a browser must
    * be able to support in order to render your HTML5 creative correctly. This
    * is a read-only, auto-generated field.
    */
  var detectedFeatures: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Numeric ID of the asset. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Dimension value for the numeric ID of the asset. This is a read-only,
    * auto-generated field.
    */
  var idDimensionValue: js.UndefOr[SchemaDimensionValue] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#creativeAssetMetadata&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Rules validated during code generation that generated a warning. This is
    * a read-only, auto-generated field.  Possible values are: -
    * &quot;ADMOB_REFERENCED&quot; - &quot;ASSET_FORMAT_UNSUPPORTED_DCM&quot; -
    * &quot;ASSET_INVALID&quot; - &quot;CLICK_TAG_HARD_CODED&quot; -
    * &quot;CLICK_TAG_INVALID&quot; - &quot;CLICK_TAG_IN_GWD&quot; -
    * &quot;CLICK_TAG_MISSING&quot; - &quot;CLICK_TAG_MORE_THAN_ONE&quot; -
    * &quot;CLICK_TAG_NON_TOP_LEVEL&quot; -
    * &quot;COMPONENT_UNSUPPORTED_DCM&quot; -
    * &quot;ENABLER_UNSUPPORTED_METHOD_DCM&quot; -
    * &quot;EXTERNAL_FILE_REFERENCED&quot; - &quot;FILE_DETAIL_EMPTY&quot; -
    * &quot;FILE_TYPE_INVALID&quot; - &quot;GWD_PROPERTIES_INVALID&quot; -
    * &quot;HTML5_FEATURE_UNSUPPORTED&quot; - &quot;LINKED_FILE_NOT_FOUND&quot;
    * - &quot;MAX_FLASH_VERSION_11&quot; - &quot;MRAID_REFERENCED&quot; -
    * &quot;NOT_SSL_COMPLIANT&quot; - &quot;ORPHANED_ASSET&quot; -
    * &quot;PRIMARY_HTML_MISSING&quot; - &quot;SVG_INVALID&quot; -
    * &quot;ZIP_INVALID&quot;
    */
  var warnedValidationRules: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaCreativeAssetMetadata {
  
  @scala.inline
  def apply(): SchemaCreativeAssetMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeAssetMetadata]
  }
  
  @scala.inline
  implicit class SchemaCreativeAssetMetadataMutableBuilder[Self <: SchemaCreativeAssetMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetIdentifier(value: SchemaCreativeAssetId): Self = StObject.set(x, "assetIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetIdentifierUndefined: Self = StObject.set(x, "assetIdentifier", js.undefined)
    
    @scala.inline
    def setClickTags(value: js.Array[SchemaClickTag]): Self = StObject.set(x, "clickTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickTagsUndefined: Self = StObject.set(x, "clickTags", js.undefined)
    
    @scala.inline
    def setClickTagsVarargs(value: SchemaClickTag*): Self = StObject.set(x, "clickTags", js.Array(value :_*))
    
    @scala.inline
    def setDetectedFeatures(value: js.Array[String]): Self = StObject.set(x, "detectedFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectedFeaturesUndefined: Self = StObject.set(x, "detectedFeatures", js.undefined)
    
    @scala.inline
    def setDetectedFeaturesVarargs(value: String*): Self = StObject.set(x, "detectedFeatures", js.Array(value :_*))
    
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
    def setWarnedValidationRules(value: js.Array[String]): Self = StObject.set(x, "warnedValidationRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarnedValidationRulesUndefined: Self = StObject.set(x, "warnedValidationRules", js.undefined)
    
    @scala.inline
    def setWarnedValidationRulesVarargs(value: String*): Self = StObject.set(x, "warnedValidationRules", js.Array(value :_*))
  }
}
