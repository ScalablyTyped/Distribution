package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTemplateVersionRequest extends StObject {
  
  /** The TemplateVersion object to create. */
  var templateVersion: js.UndefOr[TemplateVersion] = js.undefined
}
object CreateTemplateVersionRequest {
  
  inline def apply(): CreateTemplateVersionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTemplateVersionRequest]
  }
  
  extension [Self <: CreateTemplateVersionRequest](x: Self) {
    
    inline def setTemplateVersion(value: TemplateVersion): Self = StObject.set(x, "templateVersion", value.asInstanceOf[js.Any])
    
    inline def setTemplateVersionUndefined: Self = StObject.set(x, "templateVersion", js.undefined)
  }
}
