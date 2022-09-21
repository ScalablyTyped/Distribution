package typings.googleapis.runV2Mod.runV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRunV2SecretKeySelector extends StObject {
  
  /**
    * Required. The name of the secret in Cloud Secret Manager. Format: {secret_name\} if the secret is in the same project. projects/{project\}/secrets/{secret_name\} if the secret is in a different project.
    */
  var secret: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Cloud Secret Manager secret version. Can be 'latest' for the latest value or an integer for a specific version.
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRunV2SecretKeySelector {
  
  inline def apply(): SchemaGoogleCloudRunV2SecretKeySelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRunV2SecretKeySelector]
  }
  
  extension [Self <: SchemaGoogleCloudRunV2SecretKeySelector](x: Self) {
    
    inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSecretNull: Self = StObject.set(x, "secret", null)
    
    inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
