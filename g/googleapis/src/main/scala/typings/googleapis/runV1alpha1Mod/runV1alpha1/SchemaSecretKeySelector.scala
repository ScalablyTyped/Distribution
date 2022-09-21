package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSecretKeySelector extends StObject {
  
  /**
    * A Cloud Secret Manager secret version. Must be 'latest' for the latest version or an integer for a specific version. The key of the secret to select from. Must be a valid secret key.
    */
  var key: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This field should not be used directly as it is meant to be inlined directly into the message. Use the "name" field instead.
    */
  var localObjectReference: js.UndefOr[SchemaLocalObjectReference] = js.undefined
  
  /**
    * The name of the secret in Cloud Secret Manager. By default, the secret is assumed to be in the same project. If the secret is in another project, you must define an alias. An alias definition has the form: :projects//secrets/. If multiple alias definitions are needed, they must be separated by commas. The alias definitions must be set on the run.googleapis.com/secrets annotation. The name of the secret in the pod's namespace to select from.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * (Optional) Specify whether the Secret or its key must be defined
    */
  var optional: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaSecretKeySelector {
  
  inline def apply(): SchemaSecretKeySelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecretKeySelector]
  }
  
  extension [Self <: SchemaSecretKeySelector](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLocalObjectReference(value: SchemaLocalObjectReference): Self = StObject.set(x, "localObjectReference", value.asInstanceOf[js.Any])
    
    inline def setLocalObjectReferenceUndefined: Self = StObject.set(x, "localObjectReference", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalNull: Self = StObject.set(x, "optional", null)
    
    inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
  }
}
