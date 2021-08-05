package typings.maximMazurokGapiClientDeploymentmanager.gapi.client.deploymentmanager

import typings.maximMazurokGapiClientDeploymentmanager.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resource extends StObject {
  
  /** The Access Control Policy set on this resource. */
  var accessControl: js.UndefOr[ResourceAccessControl] = js.undefined
  
  /** Output only. The evaluated properties of the resource with references expanded. Returned as serialized YAML. */
  var finalProperties: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  /** Output only. Creation timestamp in RFC3339 text format. */
  var insertTime: js.UndefOr[String] = js.undefined
  
  /** Output only. URL of the manifest representing the current configuration of this resource. */
  var manifest: js.UndefOr[String] = js.undefined
  
  /** Output only. The name of the resource as it appears in the YAML config. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. The current properties of the resource before any references have been filled in. Returned as serialized YAML. */
  var properties: js.UndefOr[String] = js.undefined
  
  /** Output only. The type of the resource, for example `compute.v1.instance`, or `cloudfunctions.v1beta1.function`. */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** Output only. If Deployment Manager is currently updating or previewing an update to this resource, the updated configuration appears here. */
  var update: js.UndefOr[ResourceUpdate] = js.undefined
  
  /** Output only. Update timestamp in RFC3339 text format. */
  var updateTime: js.UndefOr[String] = js.undefined
  
  /** Output only. The URL of the actual resource. */
  var url: js.UndefOr[String] = js.undefined
  
  /** Output only. If warning messages are generated during processing of this resource, this field will be populated. */
  var warnings: js.UndefOr[js.Array[Data]] = js.undefined
}
object Resource {
  
  inline def apply(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  
  extension [Self <: Resource](x: Self) {
    
    inline def setAccessControl(value: ResourceAccessControl): Self = StObject.set(x, "accessControl", value.asInstanceOf[js.Any])
    
    inline def setAccessControlUndefined: Self = StObject.set(x, "accessControl", js.undefined)
    
    inline def setFinalProperties(value: String): Self = StObject.set(x, "finalProperties", value.asInstanceOf[js.Any])
    
    inline def setFinalPropertiesUndefined: Self = StObject.set(x, "finalProperties", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInsertTime(value: String): Self = StObject.set(x, "insertTime", value.asInstanceOf[js.Any])
    
    inline def setInsertTimeUndefined: Self = StObject.set(x, "insertTime", js.undefined)
    
    inline def setManifest(value: String): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    inline def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProperties(value: String): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUpdate(value: ResourceUpdate): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setWarnings(value: js.Array[Data]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: Data*): Self = StObject.set(x, "warnings", js.Array(value :_*))
  }
}
