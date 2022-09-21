package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUsersBulkeditassigneduserroles
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBulkEditAssignedUserRolesRequest] = js.undefined
  
  /**
    * Required. The ID of the user to which the assigned user roles belong.
    */
  var userId: js.UndefOr[String] = js.undefined
}
object ParamsResourceUsersBulkeditassigneduserroles {
  
  inline def apply(): ParamsResourceUsersBulkeditassigneduserroles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersBulkeditassigneduserroles]
  }
  
  extension [Self <: ParamsResourceUsersBulkeditassigneduserroles](x: Self) {
    
    inline def setRequestBody(value: SchemaBulkEditAssignedUserRolesRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
