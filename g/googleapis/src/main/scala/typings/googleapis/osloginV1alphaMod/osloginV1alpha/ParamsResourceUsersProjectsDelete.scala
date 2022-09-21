package typings.googleapis.osloginV1alphaMod.osloginV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUsersProjectsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. A reference to the POSIX account to update. POSIX accounts are identified by the project ID they are associated with. A reference to the POSIX account is in format `users/{user\}/projects/{project\}`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The type of operating system associated with the account.
    */
  var operatingSystemType: js.UndefOr[String] = js.undefined
}
object ParamsResourceUsersProjectsDelete {
  
  inline def apply(): ParamsResourceUsersProjectsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersProjectsDelete]
  }
  
  extension [Self <: ParamsResourceUsersProjectsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOperatingSystemType(value: String): Self = StObject.set(x, "operatingSystemType", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemTypeUndefined: Self = StObject.set(x, "operatingSystemType", js.undefined)
  }
}
