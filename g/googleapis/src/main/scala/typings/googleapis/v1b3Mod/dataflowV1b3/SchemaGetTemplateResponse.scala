package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGetTemplateResponse extends StObject {
  
  /**
    * The template metadata describing the template name, available parameters, etc.
    */
  var metadata: js.UndefOr[SchemaTemplateMetadata] = js.undefined
  
  /**
    * Describes the runtime metadata with SDKInfo and available parameters.
    */
  var runtimeMetadata: js.UndefOr[SchemaRuntimeMetadata] = js.undefined
  
  /**
    * The status of the get template request. Any problems with the request will be indicated in the error_details.
    */
  var status: js.UndefOr[SchemaStatus] = js.undefined
  
  /**
    * Template Type.
    */
  var templateType: js.UndefOr[String | Null] = js.undefined
}
object SchemaGetTemplateResponse {
  
  inline def apply(): SchemaGetTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetTemplateResponse]
  }
  
  extension [Self <: SchemaGetTemplateResponse](x: Self) {
    
    inline def setMetadata(value: SchemaTemplateMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setRuntimeMetadata(value: SchemaRuntimeMetadata): Self = StObject.set(x, "runtimeMetadata", value.asInstanceOf[js.Any])
    
    inline def setRuntimeMetadataUndefined: Self = StObject.set(x, "runtimeMetadata", js.undefined)
    
    inline def setStatus(value: SchemaStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTemplateType(value: String): Self = StObject.set(x, "templateType", value.asInstanceOf[js.Any])
    
    inline def setTemplateTypeNull: Self = StObject.set(x, "templateType", null)
    
    inline def setTemplateTypeUndefined: Self = StObject.set(x, "templateType", js.undefined)
  }
}
