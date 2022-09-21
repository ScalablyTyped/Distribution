package typings.googleapis.playdeveloperreportingV1beta1Mod.playdeveloperreportingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePlayDeveloperReportingV1beta1QueryCrashRateMetricSetResponse extends StObject {
  
  /**
    * Continuation token to fetch the next page of data.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Returned rows of data.
    */
  var rows: js.UndefOr[js.Array[SchemaGooglePlayDeveloperReportingV1beta1MetricsRow]] = js.undefined
}
object SchemaGooglePlayDeveloperReportingV1beta1QueryCrashRateMetricSetResponse {
  
  inline def apply(): SchemaGooglePlayDeveloperReportingV1beta1QueryCrashRateMetricSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePlayDeveloperReportingV1beta1QueryCrashRateMetricSetResponse]
  }
  
  extension [Self <: SchemaGooglePlayDeveloperReportingV1beta1QueryCrashRateMetricSetResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setRows(value: js.Array[SchemaGooglePlayDeveloperReportingV1beta1MetricsRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: SchemaGooglePlayDeveloperReportingV1beta1MetricsRow*): Self = StObject.set(x, "rows", js.Array(value*))
  }
}
