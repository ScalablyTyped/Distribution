package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyTemplateVersionTagRequest extends js.Object {
  
  /** The flag that indicates if the request is only for remove tag from TemplateVersion. */
  var removeOnly: js.UndefOr[Boolean] = js.native
  
  /** The tag for update. */
  var tag: js.UndefOr[String] = js.native
}
object ModifyTemplateVersionTagRequest {
  
  @scala.inline
  def apply(): ModifyTemplateVersionTagRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyTemplateVersionTagRequest]
  }
  
  @scala.inline
  implicit class ModifyTemplateVersionTagRequestOps[Self <: ModifyTemplateVersionTagRequest] (val x: Self) extends AnyVal {
    
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
    def setRemoveOnly(value: Boolean): Self = this.set("removeOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveOnly: Self = this.set("removeOnly", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
}
