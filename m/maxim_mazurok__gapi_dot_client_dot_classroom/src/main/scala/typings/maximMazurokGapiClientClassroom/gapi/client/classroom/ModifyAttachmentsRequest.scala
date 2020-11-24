package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyAttachmentsRequest extends js.Object {
  
  /** Attachments to add. A student submission may not have more than 20 attachments. Form attachments are not supported. */
  var addAttachments: js.UndefOr[js.Array[Attachment]] = js.native
}
object ModifyAttachmentsRequest {
  
  @scala.inline
  def apply(): ModifyAttachmentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyAttachmentsRequest]
  }
  
  @scala.inline
  implicit class ModifyAttachmentsRequestOps[Self <: ModifyAttachmentsRequest] (val x: Self) extends AnyVal {
    
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
    def setAddAttachmentsVarargs(value: Attachment*): Self = this.set("addAttachments", js.Array(value :_*))
    
    @scala.inline
    def setAddAttachments(value: js.Array[Attachment]): Self = this.set("addAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddAttachments: Self = this.set("addAttachments", js.undefined)
  }
}
