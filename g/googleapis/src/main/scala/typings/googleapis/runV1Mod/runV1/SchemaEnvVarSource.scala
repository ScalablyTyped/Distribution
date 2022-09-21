package typings.googleapis.runV1Mod.runV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEnvVarSource extends StObject {
  
  /**
    * (Optional) Not supported by Cloud Run Selects a key of a ConfigMap.
    */
  var configMapKeyRef: js.UndefOr[SchemaConfigMapKeySelector] = js.undefined
  
  /**
    * (Optional) Selects a key (version) of a secret in Secret Manager.
    */
  var secretKeyRef: js.UndefOr[SchemaSecretKeySelector] = js.undefined
}
object SchemaEnvVarSource {
  
  inline def apply(): SchemaEnvVarSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnvVarSource]
  }
  
  extension [Self <: SchemaEnvVarSource](x: Self) {
    
    inline def setConfigMapKeyRef(value: SchemaConfigMapKeySelector): Self = StObject.set(x, "configMapKeyRef", value.asInstanceOf[js.Any])
    
    inline def setConfigMapKeyRefUndefined: Self = StObject.set(x, "configMapKeyRef", js.undefined)
    
    inline def setSecretKeyRef(value: SchemaSecretKeySelector): Self = StObject.set(x, "secretKeyRef", value.asInstanceOf[js.Any])
    
    inline def setSecretKeyRefUndefined: Self = StObject.set(x, "secretKeyRef", js.undefined)
  }
}
