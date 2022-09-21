package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2HotwordRule extends StObject {
  
  /**
    * Regular expression pattern defining what qualifies as a hotword.
    */
  var hotwordRegex: js.UndefOr[SchemaGooglePrivacyDlpV2Regex] = js.undefined
  
  /**
    * Likelihood adjustment to apply to all matching findings.
    */
  var likelihoodAdjustment: js.UndefOr[SchemaGooglePrivacyDlpV2LikelihoodAdjustment] = js.undefined
  
  /**
    * Range of characters within which the entire hotword must reside. The total length of the window cannot exceed 1000 characters. The finding itself will be included in the window, so that hotwords can be used to match substrings of the finding itself. Suppose you want Cloud DLP to promote the likelihood of the phone number regex "\(\d{3\}\) \d{3\}-\d{4\}" if the area code is known to be the area code of a company's office. In this case, use the hotword regex "\(xxx\)", where "xxx" is the area code in question. For tabular data, if you want to modify the likelihood of an entire column of findngs, see [Hotword example: Set the match likelihood of a table column] (https://cloud.google.com/dlp/docs/creating-custom-infotypes-likelihood#match-column-values).
    */
  var proximity: js.UndefOr[SchemaGooglePrivacyDlpV2Proximity] = js.undefined
}
object SchemaGooglePrivacyDlpV2HotwordRule {
  
  inline def apply(): SchemaGooglePrivacyDlpV2HotwordRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2HotwordRule]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2HotwordRule](x: Self) {
    
    inline def setHotwordRegex(value: SchemaGooglePrivacyDlpV2Regex): Self = StObject.set(x, "hotwordRegex", value.asInstanceOf[js.Any])
    
    inline def setHotwordRegexUndefined: Self = StObject.set(x, "hotwordRegex", js.undefined)
    
    inline def setLikelihoodAdjustment(value: SchemaGooglePrivacyDlpV2LikelihoodAdjustment): Self = StObject.set(x, "likelihoodAdjustment", value.asInstanceOf[js.Any])
    
    inline def setLikelihoodAdjustmentUndefined: Self = StObject.set(x, "likelihoodAdjustment", js.undefined)
    
    inline def setProximity(value: SchemaGooglePrivacyDlpV2Proximity): Self = StObject.set(x, "proximity", value.asInstanceOf[js.Any])
    
    inline def setProximityUndefined: Self = StObject.set(x, "proximity", js.undefined)
  }
}
