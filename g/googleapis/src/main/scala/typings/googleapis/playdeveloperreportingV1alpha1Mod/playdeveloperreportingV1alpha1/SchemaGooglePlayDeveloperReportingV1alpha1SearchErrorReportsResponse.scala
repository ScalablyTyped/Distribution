package typings.googleapis.playdeveloperreportingV1alpha1Mod.playdeveloperreportingV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePlayDeveloperReportingV1alpha1SearchErrorReportsResponse extends StObject {
  
  /**
    * Error reports that were found.
    */
  var errorReports: js.UndefOr[js.Array[SchemaGooglePlayDeveloperReportingV1alpha1ErrorReport]] = js.undefined
  
  /**
    * Page token to fetch the next page of reports.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePlayDeveloperReportingV1alpha1SearchErrorReportsResponse {
  
  inline def apply(): SchemaGooglePlayDeveloperReportingV1alpha1SearchErrorReportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePlayDeveloperReportingV1alpha1SearchErrorReportsResponse]
  }
  
  extension [Self <: SchemaGooglePlayDeveloperReportingV1alpha1SearchErrorReportsResponse](x: Self) {
    
    inline def setErrorReports(value: js.Array[SchemaGooglePlayDeveloperReportingV1alpha1ErrorReport]): Self = StObject.set(x, "errorReports", value.asInstanceOf[js.Any])
    
    inline def setErrorReportsUndefined: Self = StObject.set(x, "errorReports", js.undefined)
    
    inline def setErrorReportsVarargs(value: SchemaGooglePlayDeveloperReportingV1alpha1ErrorReport*): Self = StObject.set(x, "errorReports", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
