package typings.instagramPrivateApi.directThreadRepositoryAddUserResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectThreadRepositoryAddUserResponseActionLog extends js.Object {
  
  var bold: js.Array[DirectThreadRepositoryAddUserResponseBoldItem] = js.native
  
  var description: String = js.native
  
  var text_attributes: js.Array[DirectThreadRepositoryAddUserResponseTextAttributesItem] = js.native
}
object DirectThreadRepositoryAddUserResponseActionLog {
  
  @scala.inline
  def apply(
    bold: js.Array[DirectThreadRepositoryAddUserResponseBoldItem],
    description: String,
    text_attributes: js.Array[DirectThreadRepositoryAddUserResponseTextAttributesItem]
  ): DirectThreadRepositoryAddUserResponseActionLog = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], text_attributes = text_attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectThreadRepositoryAddUserResponseActionLog]
  }
  
  @scala.inline
  implicit class DirectThreadRepositoryAddUserResponseActionLogOps[Self <: DirectThreadRepositoryAddUserResponseActionLog] (val x: Self) extends AnyVal {
    
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
    def setBoldVarargs(value: DirectThreadRepositoryAddUserResponseBoldItem*): Self = this.set("bold", js.Array(value :_*))
    
    @scala.inline
    def setBold(value: js.Array[DirectThreadRepositoryAddUserResponseBoldItem]): Self = this.set("bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText_attributesVarargs(value: DirectThreadRepositoryAddUserResponseTextAttributesItem*): Self = this.set("text_attributes", js.Array(value :_*))
    
    @scala.inline
    def setText_attributes(value: js.Array[DirectThreadRepositoryAddUserResponseTextAttributesItem]): Self = this.set("text_attributes", value.asInstanceOf[js.Any])
  }
}
