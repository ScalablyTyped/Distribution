package typings.googleapis.secretmanagerV1beta1Mod.secretmanagerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsSecretsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the project to associate with the Secret, in the format `projects/x`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSecret] = js.undefined
  
  /**
    * Required. This must be unique within the project. A secret ID is a string with a maximum length of 255 characters and can contain uppercase and lowercase letters, numerals, and the hyphen (`-`) and underscore (`_`) characters.
    */
  var secretId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsSecretsCreate {
  
  inline def apply(): ParamsResourceProjectsSecretsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsSecretsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsSecretsCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaSecret): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setSecretId(value: String): Self = StObject.set(x, "secretId", value.asInstanceOf[js.Any])
    
    inline def setSecretIdUndefined: Self = StObject.set(x, "secretId", js.undefined)
  }
}
