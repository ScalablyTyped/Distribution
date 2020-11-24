package typings.mangopay2NodejsSdk.mod.disputeDocument

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATION_ASKED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubmitDisputeDocument extends js.Object {
  
  /**
    * The status of this KYC/Dispute document
    */
  var Status: VALIDATION_ASKED = js.native
  
  var Tag: js.UndefOr[String] = js.native
}
object SubmitDisputeDocument {
  
  @scala.inline
  def apply(Status: VALIDATION_ASKED): SubmitDisputeDocument = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubmitDisputeDocument]
  }
  
  @scala.inline
  implicit class SubmitDisputeDocumentOps[Self <: SubmitDisputeDocument] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: VALIDATION_ASKED): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String): Self = this.set("Tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("Tag", js.undefined)
  }
}
