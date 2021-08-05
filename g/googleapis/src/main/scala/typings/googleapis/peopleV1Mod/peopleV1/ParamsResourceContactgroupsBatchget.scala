package typings.googleapis.peopleV1Mod.peopleV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceContactgroupsBatchget
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Specifies the maximum number of members to return for each group.
    */
  var maxMembers: js.UndefOr[Double] = js.undefined
  
  /**
    * The resource names of the contact groups to get.
    */
  var resourceNames: js.UndefOr[js.Array[String]] = js.undefined
}
object ParamsResourceContactgroupsBatchget {
  
  inline def apply(): ParamsResourceContactgroupsBatchget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceContactgroupsBatchget]
  }
  
  extension [Self <: ParamsResourceContactgroupsBatchget](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setMaxMembers(value: Double): Self = StObject.set(x, "maxMembers", value.asInstanceOf[js.Any])
    
    inline def setMaxMembersUndefined: Self = StObject.set(x, "maxMembers", js.undefined)
    
    inline def setResourceNames(value: js.Array[String]): Self = StObject.set(x, "resourceNames", value.asInstanceOf[js.Any])
    
    inline def setResourceNamesUndefined: Self = StObject.set(x, "resourceNames", js.undefined)
    
    inline def setResourceNamesVarargs(value: String*): Self = StObject.set(x, "resourceNames", js.Array(value :_*))
  }
}
