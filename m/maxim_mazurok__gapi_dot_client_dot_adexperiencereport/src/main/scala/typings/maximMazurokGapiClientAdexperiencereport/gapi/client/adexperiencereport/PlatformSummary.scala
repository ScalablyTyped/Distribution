package typings.maximMazurokGapiClientAdexperiencereport.gapi.client.adexperiencereport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlatformSummary extends js.Object {
  
  /** The site's Ad Experience Report status on this platform. */
  var betterAdsStatus: js.UndefOr[String] = js.native
  
  /** The time at which [enforcement](https://support.google.com/webtools/answer/7308033) against the site began or will begin on this platform. Not set when the filter_status is OFF. */
  var enforcementTime: js.UndefOr[String] = js.native
  
  /** The site's [enforcement status](https://support.google.com/webtools/answer/7308033) on this platform. */
  var filterStatus: js.UndefOr[String] = js.native
  
  /** The time at which the site's status last changed on this platform. */
  var lastChangeTime: js.UndefOr[String] = js.native
  
  /** The site's regions on this platform. No longer populated, because there is no longer any semantic difference between sites in different regions. */
  var region: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A link to the full Ad Experience Report for the site on this platform.. Not set in ViolatingSitesResponse. Note that you must complete the [Search Console verification
    * process](https://support.google.com/webmasters/answer/9008080) for the site before you can access the full report.
    */
  var reportUrl: js.UndefOr[String] = js.native
  
  /** Whether the site is currently under review on this platform. */
  var underReview: js.UndefOr[Boolean] = js.native
}
object PlatformSummary {
  
  @scala.inline
  def apply(): PlatformSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlatformSummary]
  }
  
  @scala.inline
  implicit class PlatformSummaryOps[Self <: PlatformSummary] (val x: Self) extends AnyVal {
    
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
    def setBetterAdsStatus(value: String): Self = this.set("betterAdsStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBetterAdsStatus: Self = this.set("betterAdsStatus", js.undefined)
    
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
    def setRegionVarargs(value: String*): Self = this.set("region", js.Array(value :_*))
    
    @scala.inline
    def setRegion(value: js.Array[String]): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setReportUrl(value: String): Self = this.set("reportUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportUrl: Self = this.set("reportUrl", js.undefined)
    
    @scala.inline
    def setUnderReview(value: Boolean): Self = this.set("underReview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderReview: Self = this.set("underReview", js.undefined)
  }
}
