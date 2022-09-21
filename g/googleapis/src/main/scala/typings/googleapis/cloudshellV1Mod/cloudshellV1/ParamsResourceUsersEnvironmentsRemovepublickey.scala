package typings.googleapis.cloudshellV1Mod.cloudshellV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUsersEnvironmentsRemovepublickey
  extends StObject
     with StandardParameters {
  
  /**
    * Environment this key should be removed from, e.g. `users/me/environments/default`.
    */
  var environment: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaRemovePublicKeyRequest] = js.undefined
}
object ParamsResourceUsersEnvironmentsRemovepublickey {
  
  inline def apply(): ParamsResourceUsersEnvironmentsRemovepublickey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersEnvironmentsRemovepublickey]
  }
  
  extension [Self <: ParamsResourceUsersEnvironmentsRemovepublickey](x: Self) {
    
    inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setRequestBody(value: SchemaRemovePublicKeyRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
