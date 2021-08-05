package typings.maximMazurokGapiClientDeploymentmanager.gapi.client.deploymentmanager

import typings.maximMazurokGapiClientDeploymentmanager.anon.Data
import typings.maximMazurokGapiClientDeploymentmanager.anon.Errors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceUpdate extends StObject {
  
  /** The Access Control Policy to set on this resource after updating the resource itself. */
  var accessControl: js.UndefOr[ResourceAccessControl] = js.undefined
  
  /** Output only. If errors are generated during update of the resource, this field will be populated. */
  var error: js.UndefOr[Errors] = js.undefined
  
  /** Output only. The expanded properties of the resource with reference values expanded. Returned as serialized YAML. */
  var finalProperties: js.UndefOr[String] = js.undefined
  
  /** Output only. The intent of the resource: `PREVIEW`, `UPDATE`, or `CANCEL`. */
  var intent: js.UndefOr[String] = js.undefined
  
  /** Output only. URL of the manifest representing the update configuration of this resource. */
  var manifest: js.UndefOr[String] = js.undefined
  
  /** Output only. The set of updated properties for this resource, before references are expanded. Returned as serialized YAML. */
  var properties: js.UndefOr[String] = js.undefined
  
  /** Output only. The state of the resource. */
  var state: js.UndefOr[String] = js.undefined
  
  /** Output only. If warning messages are generated during processing of this resource, this field will be populated. */
  var warnings: js.UndefOr[js.Array[Data]] = js.undefined
}
object ResourceUpdate {
  
  inline def apply(): ResourceUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceUpdate]
  }
  
  extension [Self <: ResourceUpdate](x: Self) {
    
    inline def setAccessControl(value: ResourceAccessControl): Self = StObject.set(x, "accessControl", value.asInstanceOf[js.Any])
    
    inline def setAccessControlUndefined: Self = StObject.set(x, "accessControl", js.undefined)
    
    inline def setError(value: Errors): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setFinalProperties(value: String): Self = StObject.set(x, "finalProperties", value.asInstanceOf[js.Any])
    
    inline def setFinalPropertiesUndefined: Self = StObject.set(x, "finalProperties", js.undefined)
    
    inline def setIntent(value: String): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
    
    inline def setManifest(value: String): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    inline def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
    
    inline def setProperties(value: String): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setWarnings(value: js.Array[Data]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: Data*): Self = StObject.set(x, "warnings", js.Array(value :_*))
  }
}
