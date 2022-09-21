package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import typings.googleapis.anon.Code
import typings.googleapis.anon.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResourceUpdate extends StObject {
  
  /**
    * The Access Control Policy to set on this resource after updating the resource itself.
    */
  var accessControl: js.UndefOr[SchemaResourceAccessControl] = js.undefined
  
  /**
    * Output only. The credential that will be used creating/updating this resource.
    */
  var credential: js.UndefOr[SchemaCredential] = js.undefined
  
  /**
    * Output only. If errors are generated during update of the resource, this field will be populated.
    */
  var error: js.UndefOr[`6` | Null] = js.undefined
  
  /**
    * Output only. The expanded properties of the resource with reference values expanded. Returned as serialized YAML.
    */
  var finalProperties: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The intent of the resource: `PREVIEW`, `UPDATE`, or `CANCEL`.
    */
  var intent: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. URL of the manifest representing the update configuration of this resource.
    */
  var manifest: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The set of updated properties for this resource, before references are expanded. Returned as serialized YAML.
    */
  var properties: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. In case this is an action, it will show the runtimePolicies that this action will have after updating the deployment.
    */
  var runtimePolicies: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Output only. The state of the resource.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. If warning messages are generated during processing of this resource, this field will be populated.
    */
  var warnings: js.UndefOr[js.Array[Code] | Null] = js.undefined
}
object SchemaResourceUpdate {
  
  inline def apply(): SchemaResourceUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceUpdate]
  }
  
  extension [Self <: SchemaResourceUpdate](x: Self) {
    
    inline def setAccessControl(value: SchemaResourceAccessControl): Self = StObject.set(x, "accessControl", value.asInstanceOf[js.Any])
    
    inline def setAccessControlUndefined: Self = StObject.set(x, "accessControl", js.undefined)
    
    inline def setCredential(value: SchemaCredential): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
    
    inline def setCredentialUndefined: Self = StObject.set(x, "credential", js.undefined)
    
    inline def setError(value: `6`): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorNull: Self = StObject.set(x, "error", null)
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setFinalProperties(value: String): Self = StObject.set(x, "finalProperties", value.asInstanceOf[js.Any])
    
    inline def setFinalPropertiesNull: Self = StObject.set(x, "finalProperties", null)
    
    inline def setFinalPropertiesUndefined: Self = StObject.set(x, "finalProperties", js.undefined)
    
    inline def setIntent(value: String): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setIntentNull: Self = StObject.set(x, "intent", null)
    
    inline def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
    
    inline def setManifest(value: String): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    inline def setManifestNull: Self = StObject.set(x, "manifest", null)
    
    inline def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
    
    inline def setProperties(value: String): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesNull: Self = StObject.set(x, "properties", null)
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setRuntimePolicies(value: js.Array[String]): Self = StObject.set(x, "runtimePolicies", value.asInstanceOf[js.Any])
    
    inline def setRuntimePoliciesNull: Self = StObject.set(x, "runtimePolicies", null)
    
    inline def setRuntimePoliciesUndefined: Self = StObject.set(x, "runtimePolicies", js.undefined)
    
    inline def setRuntimePoliciesVarargs(value: String*): Self = StObject.set(x, "runtimePolicies", js.Array(value*))
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setWarnings(value: js.Array[Code]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsNull: Self = StObject.set(x, "warnings", null)
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: Code*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
