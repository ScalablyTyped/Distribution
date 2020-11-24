package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductPurchasesAcknowledgeRequest extends js.Object {
  
  /** Payload to attach to the purchase. */
  var developerPayload: js.UndefOr[String] = js.native
}
object ProductPurchasesAcknowledgeRequest {
  
  @scala.inline
  def apply(): ProductPurchasesAcknowledgeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductPurchasesAcknowledgeRequest]
  }
  
  @scala.inline
  implicit class ProductPurchasesAcknowledgeRequestOps[Self <: ProductPurchasesAcknowledgeRequest] (val x: Self) extends AnyVal {
    
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
    def setDeveloperPayload(value: String): Self = this.set("developerPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeveloperPayload: Self = this.set("developerPayload", js.undefined)
  }
}
