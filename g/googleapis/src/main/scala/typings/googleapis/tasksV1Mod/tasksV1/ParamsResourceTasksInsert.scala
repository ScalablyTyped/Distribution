package typings.googleapis.tasksV1Mod.tasksV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTasksInsert
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Parent task identifier. If the task is created at the top level, this
    * parameter is omitted. Optional.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Previous sibling task identifier. If the task is created at the first
    * position among its siblings, this parameter is omitted. Optional.
    */
  var previous: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaTask] = js.undefined
  
  /**
    * Task list identifier.
    */
  var tasklist: js.UndefOr[String] = js.undefined
}
object ParamsResourceTasksInsert {
  
  inline def apply(): ParamsResourceTasksInsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTasksInsert]
  }
  
  extension [Self <: ParamsResourceTasksInsert](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setPrevious(value: String): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    
    inline def setRequestBody(value: SchemaTask): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setTasklist(value: String): Self = StObject.set(x, "tasklist", value.asInstanceOf[js.Any])
    
    inline def setTasklistUndefined: Self = StObject.set(x, "tasklist", js.undefined)
  }
}
