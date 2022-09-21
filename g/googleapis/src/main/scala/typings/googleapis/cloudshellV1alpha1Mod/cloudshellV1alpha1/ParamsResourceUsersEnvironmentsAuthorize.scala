package typings.googleapis.cloudshellV1alpha1Mod.cloudshellV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUsersEnvironmentsAuthorize
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the resource that should receive the credentials, for example `users/me/environments/default` or `users/someone@example.com/environments/default`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAuthorizeEnvironmentRequest] = js.undefined
}
object ParamsResourceUsersEnvironmentsAuthorize {
  
  inline def apply(): ParamsResourceUsersEnvironmentsAuthorize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersEnvironmentsAuthorize]
  }
  
  extension [Self <: ParamsResourceUsersEnvironmentsAuthorize](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaAuthorizeEnvironmentRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
