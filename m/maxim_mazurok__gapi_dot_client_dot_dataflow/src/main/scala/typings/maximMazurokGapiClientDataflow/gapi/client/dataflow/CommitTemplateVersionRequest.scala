package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommitTemplateVersionRequest extends StObject {
  
  /** TemplateVersion obejct to create. */
  var templateVersion: js.UndefOr[TemplateVersion] = js.undefined
}
object CommitTemplateVersionRequest {
  
  inline def apply(): CommitTemplateVersionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommitTemplateVersionRequest]
  }
  
  extension [Self <: CommitTemplateVersionRequest](x: Self) {
    
    inline def setTemplateVersion(value: TemplateVersion): Self = StObject.set(x, "templateVersion", value.asInstanceOf[js.Any])
    
    inline def setTemplateVersionUndefined: Self = StObject.set(x, "templateVersion", js.undefined)
  }
}
