package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1CreateIssueModelRequest extends StObject {
  
  /**
    * Required. The issue model to create.
    */
  var issueModel: js.UndefOr[SchemaGoogleCloudContactcenterinsightsV1IssueModel] = js.undefined
  
  /**
    * Required. The parent resource of the issue model.
    */
  var parent: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1CreateIssueModelRequest {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1CreateIssueModelRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1CreateIssueModelRequest]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1CreateIssueModelRequest](x: Self) {
    
    inline def setIssueModel(value: SchemaGoogleCloudContactcenterinsightsV1IssueModel): Self = StObject.set(x, "issueModel", value.asInstanceOf[js.Any])
    
    inline def setIssueModelUndefined: Self = StObject.set(x, "issueModel", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
