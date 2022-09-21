package typings.googleapis.osloginV1Mod.osloginV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUsersGetloginprofile
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The unique ID for the user in format `users/{user\}`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The project ID of the Google Cloud Platform project.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * A system ID for filtering the results of the request.
    */
  var systemId: js.UndefOr[String] = js.undefined
}
object ParamsResourceUsersGetloginprofile {
  
  inline def apply(): ParamsResourceUsersGetloginprofile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersGetloginprofile]
  }
  
  extension [Self <: ParamsResourceUsersGetloginprofile](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setSystemId(value: String): Self = StObject.set(x, "systemId", value.asInstanceOf[js.Any])
    
    inline def setSystemIdUndefined: Self = StObject.set(x, "systemId", js.undefined)
  }
}
