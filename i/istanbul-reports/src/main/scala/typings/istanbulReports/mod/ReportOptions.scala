package typings.istanbulReports.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportOptions extends js.Object {
  
  var clover: CloverOptions = js.native
  
  var cobertura: CoberturaOptions = js.native
  
  var html: HtmlOptions = js.native
  
  var `html-spa`: HtmlSpaOptions = js.native
  
  var json: JsonOptions = js.native
  
  var `json-summary`: JsonSummaryOptions = js.native
  
  var lcov: LcovOptions = js.native
  
  var lcovonly: LcovOnlyOptions = js.native
  
  var teamcity: TeamcityOptions = js.native
  
  var text: TextOptions = js.native
  
  var `text-lcov`: TextLcovOptions = js.native
  
  var `text-summary`: TextSummaryOptions = js.native
}
object ReportOptions {
  
  @scala.inline
  def apply(
    clover: CloverOptions,
    cobertura: CoberturaOptions,
    html: HtmlOptions,
    `html-spa`: HtmlSpaOptions,
    json: JsonOptions,
    `json-summary`: JsonSummaryOptions,
    lcov: LcovOptions,
    lcovonly: LcovOnlyOptions,
    teamcity: TeamcityOptions,
    text: TextOptions,
    `text-lcov`: TextLcovOptions,
    `text-summary`: TextSummaryOptions
  ): ReportOptions = {
    val __obj = js.Dynamic.literal(clover = clover.asInstanceOf[js.Any], cobertura = cobertura.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], lcov = lcov.asInstanceOf[js.Any], lcovonly = lcovonly.asInstanceOf[js.Any], teamcity = teamcity.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("html-spa")(`html-spa`.asInstanceOf[js.Any])
    __obj.updateDynamic("json-summary")(`json-summary`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-lcov")(`text-lcov`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-summary")(`text-summary`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportOptions]
  }
  
  @scala.inline
  implicit class ReportOptionsOps[Self <: ReportOptions] (val x: Self) extends AnyVal {
    
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
    def setClover(value: CloverOptions): Self = this.set("clover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCobertura(value: CoberturaOptions): Self = this.set("cobertura", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml(value: HtmlOptions): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setHtml-spa`(value: HtmlSpaOptions): Self = this.set("html-spa", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJson(value: JsonOptions): Self = this.set("json", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJson-summary`(value: JsonSummaryOptions): Self = this.set("json-summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLcov(value: LcovOptions): Self = this.set("lcov", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLcovonly(value: LcovOnlyOptions): Self = this.set("lcovonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamcity(value: TeamcityOptions): Self = this.set("teamcity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: TextOptions): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-lcov`(value: TextLcovOptions): Self = this.set("text-lcov", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-summary`(value: TextSummaryOptions): Self = this.set("text-summary", value.asInstanceOf[js.Any])
  }
}
