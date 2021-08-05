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
  
  inline def apply(templateId: String, templateInfo: CcRoles): CreateTemplateEventPyload = {
    val __obj = js.Dynamic.literal(templateId = templateId.asInstanceOf[js.Any], templateInfo = templateInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTemplateEventPyload]
  }
  
  extension [Self <: CreateTemplateEventPyload](x: Self) {
    
    inline def setTemplateId(value: String): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
    
    inline def setTemplateInfo(value: CcRoles): Self = StObject.set(x, "templateInfo", value.asInstanceOf[js.Any])
  }
}
