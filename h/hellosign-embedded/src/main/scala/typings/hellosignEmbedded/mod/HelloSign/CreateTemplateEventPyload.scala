package typings.hellosignEmbedded.mod.HelloSign

import typings.hellosignEmbedded.anon.CcRoles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTemplateEventPyload extends StObject {
  
  var templateId: String
  
  var templateInfo: CcRoles
}
object CreateTemplateEventPyload {
  
  @scala.inline
  def apply(templateId: String, templateInfo: CcRoles): CreateTemplateEventPyload = {
    val __obj = js.Dynamic.literal(templateId = templateId.asInstanceOf[js.Any], templateInfo = templateInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTemplateEventPyload]
  }
  
  @scala.inline
  implicit class CreateTemplateEventPyloadMutableBuilder[Self <: CreateTemplateEventPyload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTemplateId(value: String): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateInfo(value: CcRoles): Self = StObject.set(x, "templateInfo", value.asInstanceOf[js.Any])
  }
}
