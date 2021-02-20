package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductPurchasesAcknowledgeRequest extends StObject {
  
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
  implicit class ProductPurchasesAcknowledgeRequestMutableBuilder[Self <: ProductPurchasesAcknowledgeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeveloperPayload(value: String): Self = StObject.set(x, "developerPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeveloperPayloadUndefined: Self = StObject.set(x, "developerPayload", js.undefined)
  }
}
