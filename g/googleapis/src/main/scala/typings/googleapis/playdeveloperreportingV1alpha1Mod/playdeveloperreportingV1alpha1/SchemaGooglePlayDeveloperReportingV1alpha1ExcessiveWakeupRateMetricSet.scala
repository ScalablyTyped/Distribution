package typings.googleapis.playdeveloperreportingV1alpha1Mod.playdeveloperreportingV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePlayDeveloperReportingV1alpha1ExcessiveWakeupRateMetricSet extends StObject {
  
  /**
    * Summary about data freshness in this resource.
    */
  var freshnessInfo: js.UndefOr[SchemaGooglePlayDeveloperReportingV1alpha1FreshnessInfo] = js.undefined
  
  /**
    * The resource name. Format: apps/{app\}/excessiveWakeupRateMetricSet
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePlayDeveloperReportingV1alpha1ExcessiveWakeupRateMetricSet {
  
  inline def apply(): SchemaGooglePlayDeveloperReportingV1alpha1ExcessiveWakeupRateMetricSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePlayDeveloperReportingV1alpha1ExcessiveWakeupRateMetricSet]
  }
  
  extension [Self <: SchemaGooglePlayDeveloperReportingV1alpha1ExcessiveWakeupRateMetricSet](x: Self) {
    
    inline def setFreshnessInfo(value: SchemaGooglePlayDeveloperReportingV1alpha1FreshnessInfo): Self = StObject.set(x, "freshnessInfo", value.asInstanceOf[js.Any])
    
    inline def setFreshnessInfoUndefined: Self = StObject.set(x, "freshnessInfo", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
