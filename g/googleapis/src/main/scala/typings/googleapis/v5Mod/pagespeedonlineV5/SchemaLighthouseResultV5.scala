package typings.googleapis.v5Mod.pagespeedonlineV5

import org.scalablytyped.runtime.StringDictionary
import typings.googleapis.anon.Accessibility
import typings.googleapis.anon.BenchmarkIndex
import typings.googleapis.anon.CodeMessage
import typings.googleapis.anon.DescriptionTitle
import typings.googleapis.anon.EmulatedFormFactor
import typings.googleapis.anon.RendererFormattedStrings
import typings.googleapis.anon.Total
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaLighthouseResultV5 extends js.Object {
  
  /**
    * Map of audits in the LHR.
    */
  var audits: js.UndefOr[StringDictionary[SchemaLighthouseAuditResultV5]] = js.native
  
  /**
    * Map of categories in the LHR.
    */
  var categories: js.UndefOr[Accessibility] = js.native
  
  /**
    * Map of category groups in the LHR.
    */
  var categoryGroups: js.UndefOr[StringDictionary[DescriptionTitle]] = js.native
  
  /**
    * The configuration settings for this LHR.
    */
  var configSettings: js.UndefOr[EmulatedFormFactor] = js.native
  
  /**
    * Environment settings that were used when making this LHR.
    */
  var environment: js.UndefOr[BenchmarkIndex] = js.native
  
  /**
    * The time that this run was fetched.
    */
  var fetchTime: js.UndefOr[String] = js.native
  
  /**
    * The final resolved url that was audited.
    */
  var finalUrl: js.UndefOr[String] = js.native
  
  /**
    * The internationalization strings that are required to render the LHR.
    */
  var i18n: js.UndefOr[RendererFormattedStrings] = js.native
  
  /**
    * The lighthouse version that was used to generate this LHR.
    */
  var lighthouseVersion: js.UndefOr[String] = js.native
  
  /**
    * The original requested url.
    */
  var requestedUrl: js.UndefOr[String] = js.native
  
  /**
    * List of all run warnings in the LHR. Will always output to at least `[]`.
    */
  var runWarnings: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * A top-level error message that, if present, indicates a serious enough
    * problem that this Lighthouse result may need to be discarded.
    */
  var runtimeError: js.UndefOr[CodeMessage] = js.native
  
  /**
    * Timing information for this LHR.
    */
  var timing: js.UndefOr[Total] = js.native
  
  /**
    * The user agent that was used to run this LHR.
    */
  var userAgent: js.UndefOr[String] = js.native
}
object SchemaLighthouseResultV5 {
  
  @scala.inline
  def apply(): SchemaLighthouseResultV5 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLighthouseResultV5]
  }
  
  @scala.inline
  implicit class SchemaLighthouseResultV5Ops[Self <: SchemaLighthouseResultV5] (val x: Self) extends AnyVal {
    
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
    def setAudits(value: StringDictionary[SchemaLighthouseAuditResultV5]): Self = this.set("audits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudits: Self = this.set("audits", js.undefined)
    
    @scala.inline
    def setCategories(value: Accessibility): Self = this.set("categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    
    @scala.inline
    def setCategoryGroups(value: StringDictionary[DescriptionTitle]): Self = this.set("categoryGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategoryGroups: Self = this.set("categoryGroups", js.undefined)
    
    @scala.inline
    def setConfigSettings(value: EmulatedFormFactor): Self = this.set("configSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigSettings: Self = this.set("configSettings", js.undefined)
    
    @scala.inline
    def setEnvironment(value: BenchmarkIndex): Self = this.set("environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
    
    @scala.inline
    def setFetchTime(value: String): Self = this.set("fetchTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFetchTime: Self = this.set("fetchTime", js.undefined)
    
    @scala.inline
    def setFinalUrl(value: String): Self = this.set("finalUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinalUrl: Self = this.set("finalUrl", js.undefined)
    
    @scala.inline
    def setI18n(value: RendererFormattedStrings): Self = this.set("i18n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteI18n: Self = this.set("i18n", js.undefined)
    
    @scala.inline
    def setLighthouseVersion(value: String): Self = this.set("lighthouseVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLighthouseVersion: Self = this.set("lighthouseVersion", js.undefined)
    
    @scala.inline
    def setRequestedUrl(value: String): Self = this.set("requestedUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestedUrl: Self = this.set("requestedUrl", js.undefined)
    
    @scala.inline
    def setRunWarningsVarargs(value: js.Any*): Self = this.set("runWarnings", js.Array(value :_*))
    
    @scala.inline
    def setRunWarnings(value: js.Array[_]): Self = this.set("runWarnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunWarnings: Self = this.set("runWarnings", js.undefined)
    
    @scala.inline
    def setRuntimeError(value: CodeMessage): Self = this.set("runtimeError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuntimeError: Self = this.set("runtimeError", js.undefined)
    
    @scala.inline
    def setTiming(value: Total): Self = this.set("timing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTiming: Self = this.set("timing", js.undefined)
    
    @scala.inline
    def setUserAgent(value: String): Self = this.set("userAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserAgent: Self = this.set("userAgent", js.undefined)
  }
}
