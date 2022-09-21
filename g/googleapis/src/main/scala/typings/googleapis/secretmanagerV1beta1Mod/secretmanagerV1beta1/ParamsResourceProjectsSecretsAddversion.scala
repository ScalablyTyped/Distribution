package typings.googleapis.secretmanagerV1beta1Mod.secretmanagerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsSecretsAddversion
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the Secret to associate with the SecretVersion in the format `projects/x/secrets/x`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAddSecretVersionRequest] = js.undefined
}
object ParamsResourceProjectsSecretsAddversion {
  
  inline def apply(): ParamsResourceProjectsSecretsAddversion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsSecretsAddversion]
  }
  
  extension [Self <: ParamsResourceProjectsSecretsAddversion](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaAddSecretVersionRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
