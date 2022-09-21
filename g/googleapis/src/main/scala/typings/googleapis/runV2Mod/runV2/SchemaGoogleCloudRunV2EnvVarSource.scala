package typings.googleapis.runV2Mod.runV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRunV2EnvVarSource extends StObject {
  
  /**
    * Selects a secret and a specific version from Cloud Secret Manager.
    */
  var secretKeyRef: js.UndefOr[SchemaGoogleCloudRunV2SecretKeySelector] = js.undefined
}
object SchemaGoogleCloudRunV2EnvVarSource {
  
  inline def apply(): SchemaGoogleCloudRunV2EnvVarSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRunV2EnvVarSource]
  }
  
  extension [Self <: SchemaGoogleCloudRunV2EnvVarSource](x: Self) {
    
    inline def setSecretKeyRef(value: SchemaGoogleCloudRunV2SecretKeySelector): Self = StObject.set(x, "secretKeyRef", value.asInstanceOf[js.Any])
    
    inline def setSecretKeyRefUndefined: Self = StObject.set(x, "secretKeyRef", js.undefined)
  }
}
