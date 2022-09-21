package typings.googleapis.cloudshellV1Mod.cloudshellV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUsersEnvironmentsAddpublickey
  extends StObject
     with StandardParameters {
  
  /**
    * Environment this key should be added to, e.g. `users/me/environments/default`.
    */
  var environment: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAddPublicKeyRequest] = js.undefined
}
object ParamsResourceUsersEnvironmentsAddpublickey {
  
  inline def apply(): ParamsResourceUsersEnvironmentsAddpublickey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersEnvironmentsAddpublickey]
  }
  
  extension [Self <: ParamsResourceUsersEnvironmentsAddpublickey](x: Self) {
    
    inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setRequestBody(value: SchemaAddPublicKeyRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
