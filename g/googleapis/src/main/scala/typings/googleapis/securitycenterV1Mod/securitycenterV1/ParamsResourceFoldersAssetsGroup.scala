package typings.googleapis.securitycenterV1Mod.securitycenterV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFoldersAssetsGroup
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the organization to groupBy. Its format is "organizations/[organization_id], folders/[folder_id], or projects/[project_id]".
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGroupAssetsRequest] = js.undefined
}
object ParamsResourceFoldersAssetsGroup {
  
  inline def apply(): ParamsResourceFoldersAssetsGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFoldersAssetsGroup]
  }
  
  extension [Self <: ParamsResourceFoldersAssetsGroup](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGroupAssetsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
