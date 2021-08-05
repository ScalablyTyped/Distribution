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
  
  inline def apply(date: Date): AnalyticsDataPoint = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsDataPoint]
  }
  
  extension [Self <: AnalyticsDataPoint](x: Self) {
    
    inline def setActiveDevices(value: Double): Self = StObject.set(x, "activeDevices", value.asInstanceOf[js.Any])
    
    inline def setActiveDevicesUndefined: Self = StObject.set(x, "activeDevices", js.undefined)
    
    inline def setCrashes(value: Double): Self = StObject.set(x, "crashes", value.asInstanceOf[js.Any])
    
    inline def setCrashesUndefined: Self = StObject.set(x, "crashes", js.undefined)
    
    inline def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setIap(value: Double): Self = StObject.set(x, "iap", value.asInstanceOf[js.Any])
    
    inline def setIapUndefined: Self = StObject.set(x, "iap", js.undefined)
    
    inline def setImpressionsTotal(value: Double): Self = StObject.set(x, "impressionsTotal", value.asInstanceOf[js.Any])
    
    inline def setImpressionsTotalUndefined: Self = StObject.set(x, "impressionsTotal", js.undefined)
    
    inline def setImpressionsTotalUnique(value: Double): Self = StObject.set(x, "impressionsTotalUnique", value.asInstanceOf[js.Any])
    
    inline def setImpressionsTotalUniqueUndefined: Self = StObject.set(x, "impressionsTotalUnique", js.undefined)
    
    inline def setInstalls(value: Double): Self = StObject.set(x, "installs", value.asInstanceOf[js.Any])
    
    inline def setInstallsUndefined: Self = StObject.set(x, "installs", js.undefined)
    
    inline def setPageViewCount(value: Double): Self = StObject.set(x, "pageViewCount", value.asInstanceOf[js.Any])
    
    inline def setPageViewCountUndefined: Self = StObject.set(x, "pageViewCount", js.undefined)
    
    inline def setPageViewUnique(value: Double): Self = StObject.set(x, "pageViewUnique", value.asInstanceOf[js.Any])
    
    inline def setPageViewUniqueUndefined: Self = StObject.set(x, "pageViewUnique", js.undefined)
    
    inline def setPayingUsers(value: Double): Self = StObject.set(x, "payingUsers", value.asInstanceOf[js.Any])
    
    inline def setPayingUsersUndefined: Self = StObject.set(x, "payingUsers", js.undefined)
    
    inline def setRollingActiveDevices(value: Double): Self = StObject.set(x, "rollingActiveDevices", value.asInstanceOf[js.Any])
    
    inline def setRollingActiveDevicesUndefined: Self = StObject.set(x, "rollingActiveDevices", js.undefined)
    
    inline def setSales(value: Double): Self = StObject.set(x, "sales", value.asInstanceOf[js.Any])
    
    inline def setSalesUndefined: Self = StObject.set(x, "sales", js.undefined)
    
    inline def setSessions(value: Double): Self = StObject.set(x, "sessions", value.asInstanceOf[js.Any])
    
    inline def setSessionsUndefined: Self = StObject.set(x, "sessions", js.undefined)
    
    inline def setUninstalls(value: Double): Self = StObject.set(x, "uninstalls", value.asInstanceOf[js.Any])
    
    inline def setUninstallsUndefined: Self = StObject.set(x, "uninstalls", js.undefined)
    
    inline def setUnits(value: Double): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
  }
}
