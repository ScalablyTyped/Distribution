package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CreativeAssets contains properties of a creative asset file which will be
  * uploaded or has already been uploaded. Refer to the creative sample code
  * for how to upload assets and insert a creative.
  */
@js.native
trait SchemaCreativeAssetMetadata extends js.Object {
  /**
    * ID of the creative asset. This is a required field.
    */
  var assetIdentifier: js.UndefOr[SchemaCreativeAssetId] = js.native
  /**
    * List of detected click tags for assets. This is a read-only
    * auto-generated field.
    */
  var clickTags: js.UndefOr[js.Array[SchemaClickTag]] = js.native
  /**
    * List of feature dependencies for the creative asset that are detected by
    * Campaign Manager. Feature dependencies are features that a browser must
    * be able to support in order to render your HTML5 creative correctly. This
    * is a read-only, auto-generated field.
    */
  var detectedFeatures: js.UndefOr[js.Array[String]] = js.native
  /**
    * Numeric ID of the asset. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Dimension value for the numeric ID of the asset. This is a read-only,
    * auto-generated field.
    */
  var idDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#creativeAssetMetadata&quot;.
    */
  var kind: js.UndefOr[String] = js.native
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
  var warnedValidationRules: js.UndefOr[js.Array[String]] = js.native
}

object SchemaCreativeAssetMetadata {
  @scala.inline
  def apply(): SchemaCreativeAssetMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeAssetMetadata]
  }
  @scala.inline
  implicit class SchemaCreativeAssetMetadataOps[Self <: SchemaCreativeAssetMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAssetIdentifier(value: SchemaCreativeAssetId): Self = this.set("assetIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssetIdentifier: Self = this.set("assetIdentifier", js.undefined)
    @scala.inline
    def setClickTagsVarargs(value: SchemaClickTag*): Self = this.set("clickTags", js.Array(value :_*))
    @scala.inline
    def setClickTags(value: js.Array[SchemaClickTag]): Self = this.set("clickTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickTags: Self = this.set("clickTags", js.undefined)
    @scala.inline
    def setDetectedFeaturesVarargs(value: String*): Self = this.set("detectedFeatures", js.Array(value :_*))
    @scala.inline
    def setDetectedFeatures(value: js.Array[String]): Self = this.set("detectedFeatures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetectedFeatures: Self = this.set("detectedFeatures", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIdDimensionValue(value: SchemaDimensionValue): Self = this.set("idDimensionValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdDimensionValue: Self = this.set("idDimensionValue", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setWarnedValidationRulesVarargs(value: String*): Self = this.set("warnedValidationRules", js.Array(value :_*))
    @scala.inline
    def setWarnedValidationRules(value: js.Array[String]): Self = this.set("warnedValidationRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarnedValidationRules: Self = this.set("warnedValidationRules", js.undefined)
  }
  
}

