package typings.googleapis.secretmanagerV1beta1Mod.secretmanagerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsSecretsVersionsDestroy
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the SecretVersion to destroy in the format `projects/x/secrets/x/versions/x`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaDestroySecretVersionRequest] = js.undefined
}
object ParamsResourceProjectsSecretsVersionsDestroy {
  
  inline def apply(): ParamsResourceProjectsSecretsVersionsDestroy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsSecretsVersionsDestroy]
  }
  
  extension [Self <: ParamsResourceProjectsSecretsVersionsDestroy](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaDestroySecretVersionRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
