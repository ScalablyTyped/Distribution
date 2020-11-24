package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreativeAssetMetadata extends js.Object {
  
  /** ID of the creative asset. This is a required field. */
  var assetIdentifier: js.UndefOr[CreativeAssetId] = js.native
  
  /** List of detected click tags for assets. This is a read-only, auto-generated field. This field is empty for a rich media asset. */
  var clickTags: js.UndefOr[js.Array[ClickTag]] = js.native
  
  /** List of counter events configured for the asset. This is a read-only, auto-generated field and only applicable to a rich media asset. */
  var counterCustomEvents: js.UndefOr[js.Array[CreativeCustomEvent]] = js.native
  
  /**
    * List of feature dependencies for the creative asset that are detected by Campaign Manager. Feature dependencies are features that a browser must be able to support in order to
    * render your HTML5 creative correctly. This is a read-only, auto-generated field.
    */
  var detectedFeatures: js.UndefOr[js.Array[String]] = js.native
  
  /** List of exit events configured for the asset. This is a read-only, auto-generated field and only applicable to a rich media asset. */
  var exitCustomEvents: js.UndefOr[js.Array[CreativeCustomEvent]] = js.native
  
  /** Numeric ID of the asset. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.native
  
  /** Dimension value for the numeric ID of the asset. This is a read-only, auto-generated field. */
  var idDimensionValue: js.UndefOr[DimensionValue] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#creativeAssetMetadata". */
  var kind: js.UndefOr[String] = js.native
  
  /** True if the uploaded asset is a rich media asset. This is a read-only, auto-generated field. */
  var richMedia: js.UndefOr[Boolean] = js.native
  
  /** List of timer events configured for the asset. This is a read-only, auto-generated field and only applicable to a rich media asset. */
  var timerCustomEvents: js.UndefOr[js.Array[CreativeCustomEvent]] = js.native
  
  /**
    * Rules validated during code generation that generated a warning. This is a read-only, auto-generated field. Possible values are: - "ADMOB_REFERENCED" -
    * "ASSET_FORMAT_UNSUPPORTED_DCM" - "ASSET_INVALID" - "CLICK_TAG_HARD_CODED" - "CLICK_TAG_INVALID" - "CLICK_TAG_IN_GWD" - "CLICK_TAG_MISSING" - "CLICK_TAG_MORE_THAN_ONE" -
    * "CLICK_TAG_NON_TOP_LEVEL" - "COMPONENT_UNSUPPORTED_DCM" - "ENABLER_UNSUPPORTED_METHOD_DCM" - "EXTERNAL_FILE_REFERENCED" - "FILE_DETAIL_EMPTY" - "FILE_TYPE_INVALID" -
    * "GWD_PROPERTIES_INVALID" - "HTML5_FEATURE_UNSUPPORTED" - "LINKED_FILE_NOT_FOUND" - "MAX_FLASH_VERSION_11" - "MRAID_REFERENCED" - "NOT_SSL_COMPLIANT" - "ORPHANED_ASSET" -
    * "PRIMARY_HTML_MISSING" - "SVG_INVALID" - "ZIP_INVALID"
    */
  var warnedValidationRules: js.UndefOr[js.Array[String]] = js.native
}
object CreativeAssetMetadata {
  
  @scala.inline
  def apply(): CreativeAssetMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeAssetMetadata]
  }
  
  @scala.inline
  implicit class CreativeAssetMetadataOps[Self <: CreativeAssetMetadata] (val x: Self) extends AnyVal {
    
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
    def setAssetIdentifier(value: CreativeAssetId): Self = this.set("assetIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssetIdentifier: Self = this.set("assetIdentifier", js.undefined)
    
    @scala.inline
    def setClickTagsVarargs(value: ClickTag*): Self = this.set("clickTags", js.Array(value :_*))
    
    @scala.inline
    def setClickTags(value: js.Array[ClickTag]): Self = this.set("clickTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickTags: Self = this.set("clickTags", js.undefined)
    
    @scala.inline
    def setCounterCustomEventsVarargs(value: CreativeCustomEvent*): Self = this.set("counterCustomEvents", js.Array(value :_*))
    
    @scala.inline
    def setCounterCustomEvents(value: js.Array[CreativeCustomEvent]): Self = this.set("counterCustomEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCounterCustomEvents: Self = this.set("counterCustomEvents", js.undefined)
    
    @scala.inline
    def setDetectedFeaturesVarargs(value: String*): Self = this.set("detectedFeatures", js.Array(value :_*))
    
    @scala.inline
    def setDetectedFeatures(value: js.Array[String]): Self = this.set("detectedFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectedFeatures: Self = this.set("detectedFeatures", js.undefined)
    
    @scala.inline
    def setExitCustomEventsVarargs(value: CreativeCustomEvent*): Self = this.set("exitCustomEvents", js.Array(value :_*))
    
    @scala.inline
    def setExitCustomEvents(value: js.Array[CreativeCustomEvent]): Self = this.set("exitCustomEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExitCustomEvents: Self = this.set("exitCustomEvents", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIdDimensionValue(value: DimensionValue): Self = this.set("idDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdDimensionValue: Self = this.set("idDimensionValue", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setRichMedia(value: Boolean): Self = this.set("richMedia", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRichMedia: Self = this.set("richMedia", js.undefined)
    
    @scala.inline
    def setTimerCustomEventsVarargs(value: CreativeCustomEvent*): Self = this.set("timerCustomEvents", js.Array(value :_*))
    
    @scala.inline
    def setTimerCustomEvents(value: js.Array[CreativeCustomEvent]): Self = this.set("timerCustomEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimerCustomEvents: Self = this.set("timerCustomEvents", js.undefined)
    
    @scala.inline
    def setWarnedValidationRulesVarargs(value: String*): Self = this.set("warnedValidationRules", js.Array(value :_*))
    
    @scala.inline
    def setWarnedValidationRules(value: js.Array[String]): Self = this.set("warnedValidationRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarnedValidationRules: Self = this.set("warnedValidationRules", js.undefined)
  }
}
