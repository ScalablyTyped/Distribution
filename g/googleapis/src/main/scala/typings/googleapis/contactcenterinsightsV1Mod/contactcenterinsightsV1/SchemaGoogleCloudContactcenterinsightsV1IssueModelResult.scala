package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1IssueModelResult extends StObject {
  
  /**
    * Issue model that generates the result. Format: projects/{project\}/locations/{location\}/issueModels/{issue_model\}
    */
  var issueModel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * All the matched issues.
    */
  var issues: js.UndefOr[js.Array[SchemaGoogleCloudContactcenterinsightsV1IssueAssignment]] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1IssueModelResult {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1IssueModelResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1IssueModelResult]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1IssueModelResult](x: Self) {
    
    inline def setIssueModel(value: String): Self = StObject.set(x, "issueModel", value.asInstanceOf[js.Any])
    
    inline def setIssueModelNull: Self = StObject.set(x, "issueModel", null)
    
    inline def setIssueModelUndefined: Self = StObject.set(x, "issueModel", js.undefined)
    
    inline def setIssues(value: js.Array[SchemaGoogleCloudContactcenterinsightsV1IssueAssignment]): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
    
    inline def setIssuesUndefined: Self = StObject.set(x, "issues", js.undefined)
    
    inline def setIssuesVarargs(value: SchemaGoogleCloudContactcenterinsightsV1IssueAssignment*): Self = StObject.set(x, "issues", js.Array(value*))
  }
}
