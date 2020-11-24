package typings.maximMazurokGapiClientAbusiveexperiencereport.gapi.client.abusiveexperiencereport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SiteSummaryResponse extends js.Object {
  
  /** The site's Abusive Experience Report status. */
  var abusiveStatus: js.UndefOr[String] = js.native
  
  /** The time at which [enforcement](https://support.google.com/webtools/answer/7538608) against the site began or will begin. Not set when the filter_status is OFF. */
  var enforcementTime: js.UndefOr[String] = js.native
  
  /** The site's [enforcement status](https://support.google.com/webtools/answer/7538608). */
  var filterStatus: js.UndefOr[String] = js.native
  
  /** The time at which the site's status last changed. */
  var lastChangeTime: js.UndefOr[String] = js.native
  
  /**
    * A link to the full Abusive Experience Report for the site. Not set in ViolatingSitesResponse. Note that you must complete the [Search Console verification
    * process](https://support.google.com/webmasters/answer/9008080) for the site before you can access the full report.
    */
  var reportUrl: js.UndefOr[String] = js.native
  
  /** The name of the reviewed site, e.g. `google.com`. */
  var reviewedSite: js.UndefOr[String] = js.native
  
  /** Whether the site is currently under review. */
  var underReview: js.UndefOr[Boolean] = js.native
}
object SiteSummaryResponse {
  
  @scala.inline
  def apply(): SiteSummaryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SiteSummaryResponse]
  }
  
  @scala.inline
  implicit class SiteSummaryResponseOps[Self <: SiteSummaryResponse] (val x: Self) extends AnyVal {
    
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
    def setAbusiveStatus(value: String): Self = this.set("abusiveStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbusiveStatus: Self = this.set("abusiveStatus", js.undefined)
    
    @scala.inline
    def setEnforcementTime(value: String): Self = this.set("enforcementTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnforcementTime: Self = this.set("enforcementTime", js.undefined)
    
    @scala.inline
    def setFilterStatus(value: String): Self = this.set("filterStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterStatus: Self = this.set("filterStatus", js.undefined)
    
    @scala.inline
    def setLastChangeTime(value: String): Self = this.set("lastChangeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastChangeTime: Self = this.set("lastChangeTime", js.undefined)
    
    @scala.inline
    def setReportUrl(value: String): Self = this.set("reportUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportUrl: Self = this.set("reportUrl", js.undefined)
    
    @scala.inline
    def setReviewedSite(value: String): Self = this.set("reviewedSite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReviewedSite: Self = this.set("reviewedSite", js.undefined)
    
    @scala.inline
    def setUnderReview(value: Boolean): Self = this.set("underReview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderReview: Self = this.set("underReview", js.undefined)
  }
}
