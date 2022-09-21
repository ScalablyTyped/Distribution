package typings.googleapis.playdeveloperreportingV1alpha1Mod.playdeveloperreportingV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePlayDeveloperReportingV1alpha1SearchErrorIssuesResponse extends StObject {
  
  /**
    * ErrorIssues that were found.
    */
  var errorIssues: js.UndefOr[js.Array[SchemaGooglePlayDeveloperReportingV1alpha1ErrorIssue]] = js.undefined
  
  /**
    * Continuation token to fetch the next page of data.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePlayDeveloperReportingV1alpha1SearchErrorIssuesResponse {
  
  inline def apply(): SchemaGooglePlayDeveloperReportingV1alpha1SearchErrorIssuesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePlayDeveloperReportingV1alpha1SearchErrorIssuesResponse]
  }
  
  extension [Self <: SchemaGooglePlayDeveloperReportingV1alpha1SearchErrorIssuesResponse](x: Self) {
    
    inline def setErrorIssues(value: js.Array[SchemaGooglePlayDeveloperReportingV1alpha1ErrorIssue]): Self = StObject.set(x, "errorIssues", value.asInstanceOf[js.Any])
    
    inline def setErrorIssuesUndefined: Self = StObject.set(x, "errorIssues", js.undefined)
    
    inline def setErrorIssuesVarargs(value: SchemaGooglePlayDeveloperReportingV1alpha1ErrorIssue*): Self = StObject.set(x, "errorIssues", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
