package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SecretEnvSource selects a Secret to populate the environment variables
  * with.  The contents of the target Secret&#39;s Data field will represent
  * the key-value pairs as environment variables.
  */
trait SchemaSecretEnvSource extends StObject {
  
  /**
    * The Secret to select from.
    */
  var localObjectReference: js.UndefOr[SchemaLocalObjectReference] = js.undefined
  
  /**
    * Specify whether the Secret must be defined +optional
    */
  var optional: js.UndefOr[Boolean] = js.undefined
}
object SchemaSecretEnvSource {
  
  inline def apply(): SchemaSecretEnvSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecretEnvSource]
  }
  
  extension [Self <: SchemaSecretEnvSource](x: Self) {
    
    inline def setLocalObjectReference(value: SchemaLocalObjectReference): Self = StObject.set(x, "localObjectReference", value.asInstanceOf[js.Any])
    
    inline def setLocalObjectReferenceUndefined: Self = StObject.set(x, "localObjectReference", js.undefined)
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
  }
}
