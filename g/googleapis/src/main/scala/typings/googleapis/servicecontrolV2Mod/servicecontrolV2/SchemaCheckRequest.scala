package typings.googleapis.servicecontrolV2Mod.servicecontrolV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCheckRequest extends StObject {
  
  /**
    * Describes attributes about the operation being executed by the service.
    */
  var attributes: js.UndefOr[SchemaAttributeContext] = js.undefined
  
  /**
    * Optional. Contains a comma-separated list of flags.
    */
  var flags: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Describes the resources and the policies applied to each resource.
    */
  var resources: js.UndefOr[js.Array[SchemaResourceInfo]] = js.undefined
  
  /**
    * Specifies the version of the service configuration that should be used to process the request. Must not be empty. Set this field to 'latest' to specify using the latest configuration.
    */
  var serviceConfigId: js.UndefOr[String | Null] = js.undefined
}
object SchemaCheckRequest {
  
  inline def apply(): SchemaCheckRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCheckRequest]
  }
  
  extension [Self <: SchemaCheckRequest](x: Self) {
    
    inline def setAttributes(value: SchemaAttributeContext): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsNull: Self = StObject.set(x, "flags", null)
    
    inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    inline def setResources(value: js.Array[SchemaResourceInfo]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: SchemaResourceInfo*): Self = StObject.set(x, "resources", js.Array(value*))
    
    inline def setServiceConfigId(value: String): Self = StObject.set(x, "serviceConfigId", value.asInstanceOf[js.Any])
    
    inline def setServiceConfigIdNull: Self = StObject.set(x, "serviceConfigId", null)
    
    inline def setServiceConfigIdUndefined: Self = StObject.set(x, "serviceConfigId", js.undefined)
  }
}
