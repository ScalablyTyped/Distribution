package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The rule that adjusts the likelihood of findings within a certain proximity
  * of hotwords.
  */
@js.native
trait SchemaGooglePrivacyDlpV2HotwordRule extends js.Object {
  
  /**
    * Regular expression pattern defining what qualifies as a hotword.
    */
  var hotwordRegex: js.UndefOr[SchemaGooglePrivacyDlpV2Regex] = js.native
  
  /**
    * Likelihood adjustment to apply to all matching findings.
    */
  var likelihoodAdjustment: js.UndefOr[SchemaGooglePrivacyDlpV2LikelihoodAdjustment] = js.native
  
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
  var proximity: js.UndefOr[SchemaGooglePrivacyDlpV2Proximity] = js.native
}
object SchemaGooglePrivacyDlpV2HotwordRule {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2HotwordRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2HotwordRule]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2HotwordRuleOps[Self <: SchemaGooglePrivacyDlpV2HotwordRule] (val x: Self) extends AnyVal {
    
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
    def setHotwordRegex(value: SchemaGooglePrivacyDlpV2Regex): Self = this.set("hotwordRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHotwordRegex: Self = this.set("hotwordRegex", js.undefined)
    
    @scala.inline
    def setLikelihoodAdjustment(value: SchemaGooglePrivacyDlpV2LikelihoodAdjustment): Self = this.set("likelihoodAdjustment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLikelihoodAdjustment: Self = this.set("likelihoodAdjustment", js.undefined)
    
    @scala.inline
    def setProximity(value: SchemaGooglePrivacyDlpV2Proximity): Self = this.set("proximity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProximity: Self = this.set("proximity", js.undefined)
  }
}
