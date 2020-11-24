package typings.hellosignEmbedded.mod.HelloSign

import typings.hellosignEmbedded.anon.CcRoles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTemplateEventPyload extends js.Object {
  
  var templateId: String = js.native
  
  var templateInfo: CcRoles = js.native
}
object CreateTemplateEventPyload {
  
  @scala.inline
  def apply(templateId: String, templateInfo: CcRoles): CreateTemplateEventPyload = {
    val __obj = js.Dynamic.literal(templateId = templateId.asInstanceOf[js.Any], templateInfo = templateInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTemplateEventPyload]
  }
  
  @scala.inline
  implicit class CreateTemplateEventPyloadOps[Self <: CreateTemplateEventPyload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTemplateId(value: String): Self = this.set("templateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateInfo(value: CcRoles): Self = this.set("templateInfo", value.asInstanceOf[js.Any])
  }
}
