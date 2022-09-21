package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1ListIssueModelsResponse extends StObject {
  
  /**
    * The issue models that match the request.
    */
  var issueModels: js.UndefOr[js.Array[SchemaGoogleCloudContactcenterinsightsV1IssueModel]] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1ListIssueModelsResponse {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1ListIssueModelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1ListIssueModelsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1ListIssueModelsResponse](x: Self) {
    
    inline def setIssueModels(value: js.Array[SchemaGoogleCloudContactcenterinsightsV1IssueModel]): Self = StObject.set(x, "issueModels", value.asInstanceOf[js.Any])
    
    inline def setIssueModelsUndefined: Self = StObject.set(x, "issueModels", js.undefined)
    
    inline def setIssueModelsVarargs(value: SchemaGoogleCloudContactcenterinsightsV1IssueModel*): Self = StObject.set(x, "issueModels", js.Array(value*))
  }
}
