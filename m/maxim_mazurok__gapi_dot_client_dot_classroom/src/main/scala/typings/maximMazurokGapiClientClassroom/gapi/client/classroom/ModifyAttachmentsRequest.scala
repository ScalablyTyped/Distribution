package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyAttachmentsRequest extends StObject {
  
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
  implicit class ModifyAttachmentsRequestMutableBuilder[Self <: ModifyAttachmentsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddAttachments(value: js.Array[Attachment]): Self = StObject.set(x, "addAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddAttachmentsUndefined: Self = StObject.set(x, "addAttachments", js.undefined)
    
    @scala.inline
    def setAddAttachmentsVarargs(value: Attachment*): Self = StObject.set(x, "addAttachments", js.Array(value :_*))
  }
}
