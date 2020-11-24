package typings.itunesconnectanalytics.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticsDataPoint extends js.Object {
  
  var activeDevices: js.UndefOr[Double] = js.native
  
  var crashes: js.UndefOr[Double] = js.native
  
  var date: Date = js.native
  
  var iap: js.UndefOr[Double] = js.native
  
  var impressionsTotal: js.UndefOr[Double] = js.native
  
  var impressionsTotalUnique: js.UndefOr[Double] = js.native
  
  var installs: js.UndefOr[Double] = js.native
  
  var pageViewCount: js.UndefOr[Double] = js.native
  
  var pageViewUnique: js.UndefOr[Double] = js.native
  
  var payingUsers: js.UndefOr[Double] = js.native
  
  var rollingActiveDevices: js.UndefOr[Double] = js.native
  
  var sales: js.UndefOr[Double] = js.native
  
  var sessions: js.UndefOr[Double] = js.native
  
  var uninstalls: js.UndefOr[Double] = js.native
  
  var units: js.UndefOr[Double] = js.native
}
object AnalyticsDataPoint {
  
  @scala.inline
  def apply(date: Date): AnalyticsDataPoint = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsDataPoint]
  }
  
  @scala.inline
  implicit class AnalyticsDataPointOps[Self <: AnalyticsDataPoint] (val x: Self) extends AnyVal {
    
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
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveDevices(value: Double): Self = this.set("activeDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveDevices: Self = this.set("activeDevices", js.undefined)
    
    @scala.inline
    def setCrashes(value: Double): Self = this.set("crashes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrashes: Self = this.set("crashes", js.undefined)
    
    @scala.inline
    def setIap(value: Double): Self = this.set("iap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIap: Self = this.set("iap", js.undefined)
    
    @scala.inline
    def setImpressionsTotal(value: Double): Self = this.set("impressionsTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImpressionsTotal: Self = this.set("impressionsTotal", js.undefined)
    
    @scala.inline
    def setImpressionsTotalUnique(value: Double): Self = this.set("impressionsTotalUnique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImpressionsTotalUnique: Self = this.set("impressionsTotalUnique", js.undefined)
    
    @scala.inline
    def setInstalls(value: Double): Self = this.set("installs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstalls: Self = this.set("installs", js.undefined)
    
    @scala.inline
    def setPageViewCount(value: Double): Self = this.set("pageViewCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageViewCount: Self = this.set("pageViewCount", js.undefined)
    
    @scala.inline
    def setPageViewUnique(value: Double): Self = this.set("pageViewUnique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageViewUnique: Self = this.set("pageViewUnique", js.undefined)
    
    @scala.inline
    def setPayingUsers(value: Double): Self = this.set("payingUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayingUsers: Self = this.set("payingUsers", js.undefined)
    
    @scala.inline
    def setRollingActiveDevices(value: Double): Self = this.set("rollingActiveDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRollingActiveDevices: Self = this.set("rollingActiveDevices", js.undefined)
    
    @scala.inline
    def setSales(value: Double): Self = this.set("sales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSales: Self = this.set("sales", js.undefined)
    
    @scala.inline
    def setSessions(value: Double): Self = this.set("sessions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessions: Self = this.set("sessions", js.undefined)
    
    @scala.inline
    def setUninstalls(value: Double): Self = this.set("uninstalls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUninstalls: Self = this.set("uninstalls", js.undefined)
    
    @scala.inline
    def setUnits(value: Double): Self = this.set("units", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnits: Self = this.set("units", js.undefined)
  }
}
