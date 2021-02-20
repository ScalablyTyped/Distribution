package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTemplateResponse extends StObject {
  
  /** The template metadata describing the template name, available parameters, etc. */
  var metadata: js.UndefOr[TemplateMetadata] = js.native
  
  /** Describes the runtime metadata with SDKInfo and available parameters. */
  var runtimeMetadata: js.UndefOr[RuntimeMetadata] = js.native
  
  /** The status of the get template request. Any problems with the request will be indicated in the error_details. */
  var status: js.UndefOr[Status] = js.native
  
  /** Template Type. */
  var templateType: js.UndefOr[String] = js.native
}
object GetTemplateResponse {
  
  @scala.inline
  def apply(): GetTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTemplateResponse]
  }
  
  @scala.inline
  implicit class GetTemplateResponseMutableBuilder[Self <: GetTemplateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadata(value: TemplateMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setRuntimeMetadata(value: RuntimeMetadata): Self = StObject.set(x, "runtimeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeMetadataUndefined: Self = StObject.set(x, "runtimeMetadata", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTemplateType(value: String): Self = StObject.set(x, "templateType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateTypeUndefined: Self = StObject.set(x, "templateType", js.undefined)
  }
}
