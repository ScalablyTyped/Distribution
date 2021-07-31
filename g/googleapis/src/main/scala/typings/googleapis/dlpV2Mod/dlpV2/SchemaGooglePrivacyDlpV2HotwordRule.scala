package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The rule that adjusts the likelihood of findings within a certain proximity
  * of hotwords.
  */
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
    * Proximity of the finding within which the entire hotword must reside. The
    * total length of the window cannot exceed 1000 characters. Note that the
    * finding itself will be included in the window, so that hotwords may be
    * used to match substrings of the finding itself. For example, the
    * certainty of a phone number regex &quot;\(\d{3}\) \d{3}-\d{4}&quot; could
    * be adjusted upwards if the area code is known to be the local area code
    * of a company office using the hotword regex &quot;\(xxx\)&quot;, where
    * &quot;xxx&quot; is the area code in question.
    */
  var proximity: js.UndefOr[SchemaGooglePrivacyDlpV2Proximity] = js.undefined
}
object SchemaGooglePrivacyDlpV2HotwordRule {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2HotwordRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2HotwordRule]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2HotwordRuleMutableBuilder[Self <: SchemaGooglePrivacyDlpV2HotwordRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHotwordRegex(value: SchemaGooglePrivacyDlpV2Regex): Self = StObject.set(x, "hotwordRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHotwordRegexUndefined: Self = StObject.set(x, "hotwordRegex", js.undefined)
    
    @scala.inline
    def setLikelihoodAdjustment(value: SchemaGooglePrivacyDlpV2LikelihoodAdjustment): Self = StObject.set(x, "likelihoodAdjustment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLikelihoodAdjustmentUndefined: Self = StObject.set(x, "likelihoodAdjustment", js.undefined)
    
    @scala.inline
    def setProximity(value: SchemaGooglePrivacyDlpV2Proximity): Self = StObject.set(x, "proximity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProximityUndefined: Self = StObject.set(x, "proximity", js.undefined)
  }
}
