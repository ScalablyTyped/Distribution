package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom information type provided by the user. Used to find domain-specific
  * sensitive information configurable to the data in question.
  */
@js.native
trait SchemaGooglePrivacyDlpV2CustomInfoType extends StObject {
  
  /**
    * Set of detection rules to apply to all findings of this CustomInfoType.
    * Rules are applied in order that they are specified. Not supported for the
    * `surrogate_type` CustomInfoType.
    */
  var detectionRules: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2DetectionRule]] = js.native
  
  /**
    * A list of phrases to detect as a CustomInfoType.
    */
  var dictionary: js.UndefOr[SchemaGooglePrivacyDlpV2Dictionary] = js.native
  
  /**
    * If set to EXCLUSION_TYPE_EXCLUDE this infoType will not cause a finding
    * to be returned. It still can be used for rules matching.
    */
  var exclusionType: js.UndefOr[String] = js.native
  
  /**
    * CustomInfoType can either be a new infoType, or an extension of built-in
    * infoType, when the name matches one of existing infoTypes and that
    * infoType is specified in `InspectContent.info_types` field. Specifying
    * the latter adds findings to the one detected by the system. If built-in
    * info type is not specified in `InspectContent.info_types` list then the
    * name is treated as a custom info type.
    */
  var infoType: js.UndefOr[SchemaGooglePrivacyDlpV2InfoType] = js.native
  
  /**
    * Likelihood to return for this CustomInfoType. This base value can be
    * altered by a detection rule if the finding meets the criteria specified
    * by the rule. Defaults to `VERY_LIKELY` if not specified.
    */
  var likelihood: js.UndefOr[String] = js.native
  
  /**
    * Regular expression based CustomInfoType.
    */
  var regex: js.UndefOr[SchemaGooglePrivacyDlpV2Regex] = js.native
  
  /**
    * Load an existing `StoredInfoType` resource for use in
    * `InspectDataSource`. Not currently supported in `InspectContent`.
    */
  var storedType: js.UndefOr[SchemaGooglePrivacyDlpV2StoredType] = js.native
  
  /**
    * Message for detecting output from deidentification transformations that
    * support reversing.
    */
  var surrogateType: js.UndefOr[SchemaGooglePrivacyDlpV2SurrogateType] = js.native
}
object SchemaGooglePrivacyDlpV2CustomInfoType {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2CustomInfoType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CustomInfoType]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2CustomInfoTypeMutableBuilder[Self <: SchemaGooglePrivacyDlpV2CustomInfoType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectionRules(value: js.Array[SchemaGooglePrivacyDlpV2DetectionRule]): Self = StObject.set(x, "detectionRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectionRulesUndefined: Self = StObject.set(x, "detectionRules", js.undefined)
    
    @scala.inline
    def setDetectionRulesVarargs(value: SchemaGooglePrivacyDlpV2DetectionRule*): Self = StObject.set(x, "detectionRules", js.Array(value :_*))
    
    @scala.inline
    def setDictionary(value: SchemaGooglePrivacyDlpV2Dictionary): Self = StObject.set(x, "dictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDictionaryUndefined: Self = StObject.set(x, "dictionary", js.undefined)
    
    @scala.inline
    def setExclusionType(value: String): Self = StObject.set(x, "exclusionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusionTypeUndefined: Self = StObject.set(x, "exclusionType", js.undefined)
    
    @scala.inline
    def setInfoType(value: SchemaGooglePrivacyDlpV2InfoType): Self = StObject.set(x, "infoType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoTypeUndefined: Self = StObject.set(x, "infoType", js.undefined)
    
    @scala.inline
    def setLikelihood(value: String): Self = StObject.set(x, "likelihood", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLikelihoodUndefined: Self = StObject.set(x, "likelihood", js.undefined)
    
    @scala.inline
    def setRegex(value: SchemaGooglePrivacyDlpV2Regex): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
    
    @scala.inline
    def setStoredType(value: SchemaGooglePrivacyDlpV2StoredType): Self = StObject.set(x, "storedType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoredTypeUndefined: Self = StObject.set(x, "storedType", js.undefined)
    
    @scala.inline
    def setSurrogateType(value: SchemaGooglePrivacyDlpV2SurrogateType): Self = StObject.set(x, "surrogateType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurrogateTypeUndefined: Self = StObject.set(x, "surrogateType", js.undefined)
  }
}
