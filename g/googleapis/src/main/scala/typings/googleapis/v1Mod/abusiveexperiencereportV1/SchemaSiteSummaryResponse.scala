package typings.googleapis.v1Mod.abusiveexperiencereportV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for GetSiteSummary.
  */
@js.native
trait SchemaSiteSummaryResponse extends js.Object {
  
  /**
    * The status of the site reviewed for the abusive experiences.
    */
  var abusiveStatus: js.UndefOr[String] = js.native
  
  /**
    * The date on which enforcement begins.
    */
  var enforcementTime: js.UndefOr[String] = js.native
  
  /**
    * The abusive experience enforcement status of the site.
    */
  var filterStatus: js.UndefOr[String] = js.native
  
  /**
    * The last time that the site changed status.
    */
  var lastChangeTime: js.UndefOr[String] = js.native
  
  /**
    * A link that leads to a full abusive experience report.
    */
  var reportUrl: js.UndefOr[String] = js.native
  
  /**
    * The name of the site reviewed.
    */
  var reviewedSite: js.UndefOr[String] = js.native
  
  /**
    * Whether the site is currently under review.
    */
  var underReview: js.UndefOr[Boolean] = js.native
}
object SchemaSiteSummaryResponse {
  
  @scala.inline
  def apply(): SchemaSiteSummaryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSiteSummaryResponse]
  }
  
  @scala.inline
  implicit class SchemaSiteSummaryResponseOps[Self <: SchemaSiteSummaryResponse] (val x: Self) extends AnyVal {
    
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
