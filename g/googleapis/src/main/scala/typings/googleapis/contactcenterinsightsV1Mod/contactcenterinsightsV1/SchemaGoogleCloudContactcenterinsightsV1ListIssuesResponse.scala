package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1ListIssuesResponse extends StObject {
  
  /**
    * The issues that match the request.
    */
  var issues: js.UndefOr[js.Array[SchemaGoogleCloudContactcenterinsightsV1Issue]] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1ListIssuesResponse {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1ListIssuesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1ListIssuesResponse]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1ListIssuesResponse](x: Self) {
    
    inline def setIssues(value: js.Array[SchemaGoogleCloudContactcenterinsightsV1Issue]): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
    
    inline def setIssuesUndefined: Self = StObject.set(x, "issues", js.undefined)
    
    inline def setIssuesVarargs(value: SchemaGoogleCloudContactcenterinsightsV1Issue*): Self = StObject.set(x, "issues", js.Array(value*))
  }
}
