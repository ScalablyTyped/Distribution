package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsOutage extends StObject {
  
  /** Link to the outage event in Google Workspace Status Dashboard */
  var dashboardUri: js.UndefOr[String] = js.undefined
  
  /** Incident tracking ID. */
  var incidentTrackingId: js.UndefOr[String] = js.undefined
  
  /** Indicates new alert details under which the outage is communicated. Only populated when Status is MERGED. */
  var mergeInfo: js.UndefOr[MergeInfo] = js.undefined
  
  /** Timestamp by which the next update is expected to arrive. */
  var nextUpdateTime: js.UndefOr[String] = js.undefined
  
  /** List of products impacted by the outage. */
  var products: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Timestamp when the outage is expected to be resolved, or has confirmed resolution. Provided only when known. */
  var resolutionTime: js.UndefOr[String] = js.undefined
  
  /** Current outage status. */
  var status: js.UndefOr[String] = js.undefined
}
object AppsOutage {
  
  inline def apply(): AppsOutage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsOutage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsOutage] (val x: Self) extends AnyVal {
    
    inline def setDashboardUri(value: String): Self = StObject.set(x, "dashboardUri", value.asInstanceOf[js.Any])
    
    inline def setDashboardUriUndefined: Self = StObject.set(x, "dashboardUri", js.undefined)
    
    inline def setIncidentTrackingId(value: String): Self = StObject.set(x, "incidentTrackingId", value.asInstanceOf[js.Any])
    
    inline def setIncidentTrackingIdUndefined: Self = StObject.set(x, "incidentTrackingId", js.undefined)
    
    inline def setMergeInfo(value: MergeInfo): Self = StObject.set(x, "mergeInfo", value.asInstanceOf[js.Any])
    
    inline def setMergeInfoUndefined: Self = StObject.set(x, "mergeInfo", js.undefined)
    
    inline def setNextUpdateTime(value: String): Self = StObject.set(x, "nextUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setNextUpdateTimeUndefined: Self = StObject.set(x, "nextUpdateTime", js.undefined)
    
    inline def setProducts(value: js.Array[String]): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    inline def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
    
    inline def setProductsVarargs(value: String*): Self = StObject.set(x, "products", js.Array(value*))
    
    inline def setResolutionTime(value: String): Self = StObject.set(x, "resolutionTime", value.asInstanceOf[js.Any])
    
    inline def setResolutionTimeUndefined: Self = StObject.set(x, "resolutionTime", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
