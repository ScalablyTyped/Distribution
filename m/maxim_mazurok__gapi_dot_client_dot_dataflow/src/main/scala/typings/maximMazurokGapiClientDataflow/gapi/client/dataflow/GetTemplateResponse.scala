package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTemplateResponse extends StObject {
  
  /** The template metadata describing the template name, available parameters, etc. */
  var metadata: js.UndefOr[TemplateMetadata] = js.undefined
  
  /** Describes the runtime metadata with SDKInfo and available parameters. */
  var runtimeMetadata: js.UndefOr[RuntimeMetadata] = js.undefined
  
  /** The status of the get template request. Any problems with the request will be indicated in the error_details. */
  var status: js.UndefOr[Status] = js.undefined
  
  /** Template Type. */
  var templateType: js.UndefOr[String] = js.undefined
}
object GetTemplateResponse {
  
  inline def apply(): GetTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTemplateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTemplateResponse] (val x: Self) extends AnyVal {
    
    inline def setMetadata(value: TemplateMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setRuntimeMetadata(value: RuntimeMetadata): Self = StObject.set(x, "runtimeMetadata", value.asInstanceOf[js.Any])
    
    inline def setRuntimeMetadataUndefined: Self = StObject.set(x, "runtimeMetadata", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTemplateType(value: String): Self = StObject.set(x, "templateType", value.asInstanceOf[js.Any])
    
    inline def setTemplateTypeUndefined: Self = StObject.set(x, "templateType", js.undefined)
  }
}
