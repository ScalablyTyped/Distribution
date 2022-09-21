package typings.googleapis.playdeveloperreportingV1alpha1Mod.playdeveloperreportingV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePlayDeveloperReportingV1alpha1ListAnomaliesResponse extends StObject {
  
  /**
    * Anomalies that were found.
    */
  var anomalies: js.UndefOr[js.Array[SchemaGooglePlayDeveloperReportingV1alpha1Anomaly]] = js.undefined
  
  /**
    * Continuation token to fetch the next page of data.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePlayDeveloperReportingV1alpha1ListAnomaliesResponse {
  
  inline def apply(): SchemaGooglePlayDeveloperReportingV1alpha1ListAnomaliesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePlayDeveloperReportingV1alpha1ListAnomaliesResponse]
  }
  
  extension [Self <: SchemaGooglePlayDeveloperReportingV1alpha1ListAnomaliesResponse](x: Self) {
    
    inline def setAnomalies(value: js.Array[SchemaGooglePlayDeveloperReportingV1alpha1Anomaly]): Self = StObject.set(x, "anomalies", value.asInstanceOf[js.Any])
    
    inline def setAnomaliesUndefined: Self = StObject.set(x, "anomalies", js.undefined)
    
    inline def setAnomaliesVarargs(value: SchemaGooglePlayDeveloperReportingV1alpha1Anomaly*): Self = StObject.set(x, "anomalies", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
