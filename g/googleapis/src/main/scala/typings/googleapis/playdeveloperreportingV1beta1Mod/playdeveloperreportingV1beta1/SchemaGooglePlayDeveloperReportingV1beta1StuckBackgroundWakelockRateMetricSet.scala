package typings.googleapis.playdeveloperreportingV1beta1Mod.playdeveloperreportingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePlayDeveloperReportingV1beta1StuckBackgroundWakelockRateMetricSet extends StObject {
  
  /**
    * Summary about data freshness in this resource.
    */
  var freshnessInfo: js.UndefOr[SchemaGooglePlayDeveloperReportingV1beta1FreshnessInfo] = js.undefined
  
  /**
    * The resource name. Format: apps/{app\}/stuckBackgroundWakelockRateMetricSet
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePlayDeveloperReportingV1beta1StuckBackgroundWakelockRateMetricSet {
  
  inline def apply(): SchemaGooglePlayDeveloperReportingV1beta1StuckBackgroundWakelockRateMetricSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePlayDeveloperReportingV1beta1StuckBackgroundWakelockRateMetricSet]
  }
  
  extension [Self <: SchemaGooglePlayDeveloperReportingV1beta1StuckBackgroundWakelockRateMetricSet](x: Self) {
    
    inline def setFreshnessInfo(value: SchemaGooglePlayDeveloperReportingV1beta1FreshnessInfo): Self = StObject.set(x, "freshnessInfo", value.asInstanceOf[js.Any])
    
    inline def setFreshnessInfoUndefined: Self = StObject.set(x, "freshnessInfo", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
