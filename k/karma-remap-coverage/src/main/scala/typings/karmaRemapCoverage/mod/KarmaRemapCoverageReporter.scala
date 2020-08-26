package typings.karmaRemapCoverage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// remapped reporter types to key-value pairs
/* Inlined std.Partial<std.Record<karma-coverage.karma.ReporterType, string | null | undefined>> */
@js.native
trait KarmaRemapCoverageReporter extends js.Object {
  var cobertura: js.UndefOr[String | Null] = js.native
  var html: js.UndefOr[String | Null] = js.native
  var `in-memory`: js.UndefOr[String | Null] = js.native
  var json: js.UndefOr[String | Null] = js.native
  var `json-summary`: js.UndefOr[String | Null] = js.native
  var lcov: js.UndefOr[String | Null] = js.native
  var lcovonly: js.UndefOr[String | Null] = js.native
  var none: js.UndefOr[String | Null] = js.native
  var teamcity: js.UndefOr[String | Null] = js.native
  var text: js.UndefOr[String | Null] = js.native
  var `text-summary`: js.UndefOr[String | Null] = js.native
}

object KarmaRemapCoverageReporter {
  @scala.inline
  def apply(): KarmaRemapCoverageReporter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KarmaRemapCoverageReporter]
  }
  @scala.inline
  implicit class KarmaRemapCoverageReporterOps[Self <: KarmaRemapCoverageReporter] (val x: Self) extends AnyVal {
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
    def setCobertura(value: String): Self = this.set("cobertura", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCobertura: Self = this.set("cobertura", js.undefined)
    @scala.inline
    def setCoberturaNull: Self = this.set("cobertura", null)
    @scala.inline
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    @scala.inline
    def setHtmlNull: Self = this.set("html", null)
    @scala.inline
    def `setIn-memory`(value: String): Self = this.set("in-memory", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteIn-memory`: Self = this.set("in-memory", js.undefined)
    @scala.inline
    def `setIn-memoryNull`: Self = this.set("in-memory", null)
    @scala.inline
    def setJson(value: String): Self = this.set("json", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJson: Self = this.set("json", js.undefined)
    @scala.inline
    def setJsonNull: Self = this.set("json", null)
    @scala.inline
    def `setJson-summary`(value: String): Self = this.set("json-summary", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJson-summary`: Self = this.set("json-summary", js.undefined)
    @scala.inline
    def `setJson-summaryNull`: Self = this.set("json-summary", null)
    @scala.inline
    def setLcov(value: String): Self = this.set("lcov", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLcov: Self = this.set("lcov", js.undefined)
    @scala.inline
    def setLcovNull: Self = this.set("lcov", null)
    @scala.inline
    def setLcovonly(value: String): Self = this.set("lcovonly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLcovonly: Self = this.set("lcovonly", js.undefined)
    @scala.inline
    def setLcovonlyNull: Self = this.set("lcovonly", null)
    @scala.inline
    def setNone(value: String): Self = this.set("none", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNone: Self = this.set("none", js.undefined)
    @scala.inline
    def setNoneNull: Self = this.set("none", null)
    @scala.inline
    def setTeamcity(value: String): Self = this.set("teamcity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTeamcity: Self = this.set("teamcity", js.undefined)
    @scala.inline
    def setTeamcityNull: Self = this.set("teamcity", null)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTextNull: Self = this.set("text", null)
    @scala.inline
    def `setText-summary`(value: String): Self = this.set("text-summary", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteText-summary`: Self = this.set("text-summary", js.undefined)
    @scala.inline
    def `setText-summaryNull`: Self = this.set("text-summary", null)
  }
  
}

