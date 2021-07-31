package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTemplateVersionRequest extends StObject {
  
  /** The TemplateVersion object to create. */
  var templateVersion: js.UndefOr[TemplateVersion] = js.undefined
}
object CreateTemplateVersionRequest {
  
  @scala.inline
  def apply(): CreateTemplateVersionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTemplateVersionRequest]
  }
  
  @scala.inline
  implicit class CreateTemplateVersionRequestMutableBuilder[Self <: CreateTemplateVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTemplateVersion(value: TemplateVersion): Self = StObject.set(x, "templateVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateVersionUndefined: Self = StObject.set(x, "templateVersion", js.undefined)
  }
}
