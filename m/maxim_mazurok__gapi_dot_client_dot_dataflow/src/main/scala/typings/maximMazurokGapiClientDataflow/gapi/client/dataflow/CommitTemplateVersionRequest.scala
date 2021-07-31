package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommitTemplateVersionRequest extends StObject {
  
  /** TemplateVersion obejct to create. */
  var templateVersion: js.UndefOr[TemplateVersion] = js.undefined
}
object CommitTemplateVersionRequest {
  
  @scala.inline
  def apply(): CommitTemplateVersionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommitTemplateVersionRequest]
  }
  
  @scala.inline
  implicit class CommitTemplateVersionRequestMutableBuilder[Self <: CommitTemplateVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTemplateVersion(value: TemplateVersion): Self = StObject.set(x, "templateVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateVersionUndefined: Self = StObject.set(x, "templateVersion", js.undefined)
  }
}
