package typings.googleapis.v5Mod.pagespeedonlineV5

import typings.googleapis.anon.Major
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaPagespeedApiPagespeedResponseV5 extends js.Object {
  
  /**
    * The UTC timestamp of this analysis.
    */
  var analysisUTCTimestamp: js.UndefOr[String] = js.native
  
  /**
    * The captcha verify result
    */
  var captchaResult: js.UndefOr[String] = js.native
  
  /**
    * Canonicalized and final URL for the document, after following page
    * redirects (if any).
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Kind of result.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Lighthouse response for the audit url as an object.
    */
  var lighthouseResult: js.UndefOr[SchemaLighthouseResultV5] = js.native
  
  /**
    * Metrics of end users&#39; page loading experience.
    */
  var loadingExperience: js.UndefOr[SchemaPagespeedApiLoadingExperienceV5] = js.native
  
  /**
    * Metrics of the aggregated page loading experience of the origin
    */
  var originLoadingExperience: js.UndefOr[SchemaPagespeedApiLoadingExperienceV5] = js.native
  
  /**
    * The version of PageSpeed used to generate these results.
    */
  var version: js.UndefOr[Major] = js.native
}
object SchemaPagespeedApiPagespeedResponseV5 {
  
  @scala.inline
  def apply(): SchemaPagespeedApiPagespeedResponseV5 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPagespeedApiPagespeedResponseV5]
  }
  
  @scala.inline
  implicit class SchemaPagespeedApiPagespeedResponseV5Ops[Self <: SchemaPagespeedApiPagespeedResponseV5] (val x: Self) extends AnyVal {
    
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
    def setAnalysisUTCTimestamp(value: String): Self = this.set("analysisUTCTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalysisUTCTimestamp: Self = this.set("analysisUTCTimestamp", js.undefined)
    
    @scala.inline
    def setCaptchaResult(value: String): Self = this.set("captchaResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptchaResult: Self = this.set("captchaResult", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLighthouseResult(value: SchemaLighthouseResultV5): Self = this.set("lighthouseResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLighthouseResult: Self = this.set("lighthouseResult", js.undefined)
    
    @scala.inline
    def setLoadingExperience(value: SchemaPagespeedApiLoadingExperienceV5): Self = this.set("loadingExperience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadingExperience: Self = this.set("loadingExperience", js.undefined)
    
    @scala.inline
    def setOriginLoadingExperience(value: SchemaPagespeedApiLoadingExperienceV5): Self = this.set("originLoadingExperience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginLoadingExperience: Self = this.set("originLoadingExperience", js.undefined)
    
    @scala.inline
    def setVersion(value: Major): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
