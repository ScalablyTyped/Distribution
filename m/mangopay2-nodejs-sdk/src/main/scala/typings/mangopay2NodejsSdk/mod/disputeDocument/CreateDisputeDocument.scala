package typings.mangopay2NodejsSdk.mod.disputeDocument

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDisputeDocument extends js.Object {
  
  var Tag: js.UndefOr[String] = js.native
  
  /**
    * Gives the type of the KYC document
    */
  var Type: DisputeDocumentType = js.native
}
object CreateDisputeDocument {
  
  @scala.inline
  def apply(Type: DisputeDocumentType): CreateDisputeDocument = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDisputeDocument]
  }
  
  @scala.inline
  implicit class CreateDisputeDocumentOps[Self <: CreateDisputeDocument] (val x: Self) extends AnyVal {
    
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
    def setType(value: DisputeDocumentType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String): Self = this.set("Tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("Tag", js.undefined)
  }
}
