package typings.googleapis.secretmanagerV1Mod.secretmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsSecretsVersionsEnable
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the SecretVersion to enable in the format `projects/x/secrets/x/versions/x`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaEnableSecretVersionRequest] = js.undefined
}
object ParamsResourceProjectsSecretsVersionsEnable {
  
  inline def apply(): ParamsResourceProjectsSecretsVersionsEnable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsSecretsVersionsEnable]
  }
  
  extension [Self <: ParamsResourceProjectsSecretsVersionsEnable](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaEnableSecretVersionRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
