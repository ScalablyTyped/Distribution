package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEnvFromSource extends StObject {
  
  /**
    * (Optional) The ConfigMap to select from
    */
  var configMapRef: js.UndefOr[SchemaConfigMapEnvSource] = js.undefined
  
  /**
    * (Optional) An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.
    */
  var prefix: js.UndefOr[String | Null] = js.undefined
  
  /**
    * (Optional) The Secret to select from
    */
  var secretRef: js.UndefOr[SchemaSecretEnvSource] = js.undefined
}
object SchemaEnvFromSource {
  
  inline def apply(): SchemaEnvFromSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnvFromSource]
  }
  
  extension [Self <: SchemaEnvFromSource](x: Self) {
    
    inline def setConfigMapRef(value: SchemaConfigMapEnvSource): Self = StObject.set(x, "configMapRef", value.asInstanceOf[js.Any])
    
    inline def setConfigMapRefUndefined: Self = StObject.set(x, "configMapRef", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixNull: Self = StObject.set(x, "prefix", null)
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setSecretRef(value: SchemaSecretEnvSource): Self = StObject.set(x, "secretRef", value.asInstanceOf[js.Any])
    
    inline def setSecretRefUndefined: Self = StObject.set(x, "secretRef", js.undefined)
  }
}
