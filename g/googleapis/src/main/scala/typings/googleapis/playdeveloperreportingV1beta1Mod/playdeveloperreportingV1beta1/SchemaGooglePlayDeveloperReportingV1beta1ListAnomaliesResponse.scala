package typings.googleapis.playdeveloperreportingV1beta1Mod.playdeveloperreportingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePlayDeveloperReportingV1beta1ListAnomaliesResponse extends StObject {
  
  /**
    * Anomalies that were found.
    */
  var anomalies: js.UndefOr[js.Array[SchemaGooglePlayDeveloperReportingV1beta1Anomaly]] = js.undefined
  
  /**
    * Continuation token to fetch the next page of data.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePlayDeveloperReportingV1beta1ListAnomaliesResponse {
  
  inline def apply(): SchemaGooglePlayDeveloperReportingV1beta1ListAnomaliesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePlayDeveloperReportingV1beta1ListAnomaliesResponse]
  }
  
  extension [Self <: SchemaGooglePlayDeveloperReportingV1beta1ListAnomaliesResponse](x: Self) {
    
    inline def setAnomalies(value: js.Array[SchemaGooglePlayDeveloperReportingV1beta1Anomaly]): Self = StObject.set(x, "anomalies", value.asInstanceOf[js.Any])
    
    inline def setAnomaliesUndefined: Self = StObject.set(x, "anomalies", js.undefined)
    
    inline def setAnomaliesVarargs(value: SchemaGooglePlayDeveloperReportingV1beta1Anomaly*): Self = StObject.set(x, "anomalies", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
