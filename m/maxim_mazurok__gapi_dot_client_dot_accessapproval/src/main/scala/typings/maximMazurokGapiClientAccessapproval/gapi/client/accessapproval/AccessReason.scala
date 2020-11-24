package typings.maximMazurokGapiClientAccessapproval.gapi.client.accessapproval

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessReason extends js.Object {
  
  /** More detail about certain reason types. See comments for each type above. */
  var detail: js.UndefOr[String] = js.native
  
  /** Type of access justification. */
  var `type`: js.UndefOr[String] = js.native
}
object AccessReason {
  
  @scala.inline
  def apply(): AccessReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessReason]
  }
  
  @scala.inline
  implicit class AccessReasonOps[Self <: AccessReason] (val x: Self) extends AnyVal {
    
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
    def setDetail(value: String): Self = this.set("detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetail: Self = this.set("detail", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
