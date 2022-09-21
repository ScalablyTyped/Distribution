package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2InspectConfig extends StObject {
  
  /**
    * Deprecated and unused.
    */
  var contentOptions: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * CustomInfoTypes provided by the user. See https://cloud.google.com/dlp/docs/creating-custom-infotypes to learn more.
    */
  var customInfoTypes: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2CustomInfoType]] = js.undefined
  
  /**
    * When true, excludes type information of the findings. This is not used for data profiling.
    */
  var excludeInfoTypes: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * When true, a contextual quote from the data that triggered a finding is included in the response; see Finding.quote. This is not used for data profiling.
    */
  var includeQuote: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Restricts what info_types to look for. The values must correspond to InfoType values returned by ListInfoTypes or listed at https://cloud.google.com/dlp/docs/infotypes-reference. When no InfoTypes or CustomInfoTypes are specified in a request, the system may automatically choose what detectors to run. By default this may be all types, but may change over time as detectors are updated. If you need precise control and predictability as to what detectors are run you should specify specific InfoTypes listed in the reference, otherwise a default list will be used, which may change over time.
    */
  var infoTypes: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2InfoType]] = js.undefined
  
  /**
    * Configuration to control the number of findings returned. This is not used for data profiling. When redacting sensitive data from images, finding limits don't apply. They can cause unexpected or inconsistent results, where only some data is redacted. Don't include finding limits in RedactImage requests. Otherwise, Cloud DLP returns an error.
    */
  var limits: js.UndefOr[SchemaGooglePrivacyDlpV2FindingLimits] = js.undefined
  
  /**
    * Only returns findings equal or above this threshold. The default is POSSIBLE. See https://cloud.google.com/dlp/docs/likelihood to learn more.
    */
  var minLikelihood: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Set of rules to apply to the findings for this InspectConfig. Exclusion rules, contained in the set are executed in the end, other rules are executed in the order they are specified for each info type.
    */
  var ruleSet: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2InspectionRuleSet]] = js.undefined
}
object SchemaGooglePrivacyDlpV2InspectConfig {
  
  inline def apply(): SchemaGooglePrivacyDlpV2InspectConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2InspectConfig]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2InspectConfig](x: Self) {
    
    inline def setContentOptions(value: js.Array[String]): Self = StObject.set(x, "contentOptions", value.asInstanceOf[js.Any])
    
    inline def setContentOptionsNull: Self = StObject.set(x, "contentOptions", null)
    
    inline def setContentOptionsUndefined: Self = StObject.set(x, "contentOptions", js.undefined)
    
    inline def setContentOptionsVarargs(value: String*): Self = StObject.set(x, "contentOptions", js.Array(value*))
    
    inline def setCustomInfoTypes(value: js.Array[SchemaGooglePrivacyDlpV2CustomInfoType]): Self = StObject.set(x, "customInfoTypes", value.asInstanceOf[js.Any])
    
    inline def setCustomInfoTypesUndefined: Self = StObject.set(x, "customInfoTypes", js.undefined)
    
    inline def setCustomInfoTypesVarargs(value: SchemaGooglePrivacyDlpV2CustomInfoType*): Self = StObject.set(x, "customInfoTypes", js.Array(value*))
    
    inline def setExcludeInfoTypes(value: Boolean): Self = StObject.set(x, "excludeInfoTypes", value.asInstanceOf[js.Any])
    
    inline def setExcludeInfoTypesNull: Self = StObject.set(x, "excludeInfoTypes", null)
    
    inline def setExcludeInfoTypesUndefined: Self = StObject.set(x, "excludeInfoTypes", js.undefined)
    
    inline def setIncludeQuote(value: Boolean): Self = StObject.set(x, "includeQuote", value.asInstanceOf[js.Any])
    
    inline def setIncludeQuoteNull: Self = StObject.set(x, "includeQuote", null)
    
    inline def setIncludeQuoteUndefined: Self = StObject.set(x, "includeQuote", js.undefined)
    
    inline def setInfoTypes(value: js.Array[SchemaGooglePrivacyDlpV2InfoType]): Self = StObject.set(x, "infoTypes", value.asInstanceOf[js.Any])
    
    inline def setInfoTypesUndefined: Self = StObject.set(x, "infoTypes", js.undefined)
    
    inline def setInfoTypesVarargs(value: SchemaGooglePrivacyDlpV2InfoType*): Self = StObject.set(x, "infoTypes", js.Array(value*))
    
    inline def setLimits(value: SchemaGooglePrivacyDlpV2FindingLimits): Self = StObject.set(x, "limits", value.asInstanceOf[js.Any])
    
    inline def setLimitsUndefined: Self = StObject.set(x, "limits", js.undefined)
    
    inline def setMinLikelihood(value: String): Self = StObject.set(x, "minLikelihood", value.asInstanceOf[js.Any])
    
    inline def setMinLikelihoodNull: Self = StObject.set(x, "minLikelihood", null)
    
    inline def setMinLikelihoodUndefined: Self = StObject.set(x, "minLikelihood", js.undefined)
    
    inline def setRuleSet(value: js.Array[SchemaGooglePrivacyDlpV2InspectionRuleSet]): Self = StObject.set(x, "ruleSet", value.asInstanceOf[js.Any])
    
    inline def setRuleSetUndefined: Self = StObject.set(x, "ruleSet", js.undefined)
    
    inline def setRuleSetVarargs(value: SchemaGooglePrivacyDlpV2InspectionRuleSet*): Self = StObject.set(x, "ruleSet", js.Array(value*))
  }
}
