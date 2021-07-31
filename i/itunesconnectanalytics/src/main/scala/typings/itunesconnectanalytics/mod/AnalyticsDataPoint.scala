package typings.itunesconnectanalytics.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsDataPoint extends StObject {
  
  var activeDevices: js.UndefOr[Double] = js.undefined
  
  var crashes: js.UndefOr[Double] = js.undefined
  
  var date: Date
  
  var iap: js.UndefOr[Double] = js.undefined
  
  var impressionsTotal: js.UndefOr[Double] = js.undefined
  
  var impressionsTotalUnique: js.UndefOr[Double] = js.undefined
  
  var installs: js.UndefOr[Double] = js.undefined
  
  var pageViewCount: js.UndefOr[Double] = js.undefined
  
  var pageViewUnique: js.UndefOr[Double] = js.undefined
  
  var payingUsers: js.UndefOr[Double] = js.undefined
  
  var rollingActiveDevices: js.UndefOr[Double] = js.undefined
  
  var sales: js.UndefOr[Double] = js.undefined
  
  var sessions: js.UndefOr[Double] = js.undefined
  
  var uninstalls: js.UndefOr[Double] = js.undefined
  
  var units: js.UndefOr[Double] = js.undefined
}
object AnalyticsDataPoint {
  
  @scala.inline
  def apply(date: Date): AnalyticsDataPoint = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsDataPoint]
  }
  
  @scala.inline
  implicit class AnalyticsDataPointMutableBuilder[Self <: AnalyticsDataPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveDevices(value: Double): Self = StObject.set(x, "activeDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveDevicesUndefined: Self = StObject.set(x, "activeDevices", js.undefined)
    
    @scala.inline
    def setCrashes(value: Double): Self = StObject.set(x, "crashes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrashesUndefined: Self = StObject.set(x, "crashes", js.undefined)
    
    @scala.inline
    def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIap(value: Double): Self = StObject.set(x, "iap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIapUndefined: Self = StObject.set(x, "iap", js.undefined)
    
    @scala.inline
    def setImpressionsTotal(value: Double): Self = StObject.set(x, "impressionsTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpressionsTotalUndefined: Self = StObject.set(x, "impressionsTotal", js.undefined)
    
    @scala.inline
    def setImpressionsTotalUnique(value: Double): Self = StObject.set(x, "impressionsTotalUnique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpressionsTotalUniqueUndefined: Self = StObject.set(x, "impressionsTotalUnique", js.undefined)
    
    @scala.inline
    def setInstalls(value: Double): Self = StObject.set(x, "installs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallsUndefined: Self = StObject.set(x, "installs", js.undefined)
    
    @scala.inline
    def setPageViewCount(value: Double): Self = StObject.set(x, "pageViewCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageViewCountUndefined: Self = StObject.set(x, "pageViewCount", js.undefined)
    
    @scala.inline
    def setPageViewUnique(value: Double): Self = StObject.set(x, "pageViewUnique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageViewUniqueUndefined: Self = StObject.set(x, "pageViewUnique", js.undefined)
    
    @scala.inline
    def setPayingUsers(value: Double): Self = StObject.set(x, "payingUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayingUsersUndefined: Self = StObject.set(x, "payingUsers", js.undefined)
    
    @scala.inline
    def setRollingActiveDevices(value: Double): Self = StObject.set(x, "rollingActiveDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRollingActiveDevicesUndefined: Self = StObject.set(x, "rollingActiveDevices", js.undefined)
    
    @scala.inline
    def setSales(value: Double): Self = StObject.set(x, "sales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSalesUndefined: Self = StObject.set(x, "sales", js.undefined)
    
    @scala.inline
    def setSessions(value: Double): Self = StObject.set(x, "sessions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionsUndefined: Self = StObject.set(x, "sessions", js.undefined)
    
    @scala.inline
    def setUninstalls(value: Double): Self = StObject.set(x, "uninstalls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUninstallsUndefined: Self = StObject.set(x, "uninstalls", js.undefined)
    
    @scala.inline
    def setUnits(value: Double): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
  }
}
