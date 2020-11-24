package typings.instagramPrivateApi.directThreadRepositoryUpdateTitleResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectThreadRepositoryUpdateTitleResponseActionLog extends js.Object {
  
  var bold: js.Array[DirectThreadRepositoryUpdateTitleResponseBoldItem] = js.native
  
  var description: String = js.native
  
  var text_attributes: js.Array[DirectThreadRepositoryUpdateTitleResponseTextAttributesItem] = js.native
}
object DirectThreadRepositoryUpdateTitleResponseActionLog {
  
  @scala.inline
  def apply(
    bold: js.Array[DirectThreadRepositoryUpdateTitleResponseBoldItem],
    description: String,
    text_attributes: js.Array[DirectThreadRepositoryUpdateTitleResponseTextAttributesItem]
  ): DirectThreadRepositoryUpdateTitleResponseActionLog = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], text_attributes = text_attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectThreadRepositoryUpdateTitleResponseActionLog]
  }
  
  @scala.inline
  implicit class DirectThreadRepositoryUpdateTitleResponseActionLogOps[Self <: DirectThreadRepositoryUpdateTitleResponseActionLog] (val x: Self) extends AnyVal {
    
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
    def setBoldVarargs(value: DirectThreadRepositoryUpdateTitleResponseBoldItem*): Self = this.set("bold", js.Array(value :_*))
    
    @scala.inline
    def setBold(value: js.Array[DirectThreadRepositoryUpdateTitleResponseBoldItem]): Self = this.set("bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText_attributesVarargs(value: DirectThreadRepositoryUpdateTitleResponseTextAttributesItem*): Self = this.set("text_attributes", js.Array(value :_*))
    
    @scala.inline
    def setText_attributes(value: js.Array[DirectThreadRepositoryUpdateTitleResponseTextAttributesItem]): Self = this.set("text_attributes", value.asInstanceOf[js.Any])
  }
}
