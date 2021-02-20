package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MerchantRejectionReason extends StObject {
  
  /** Description of the reason. */
  var description: js.UndefOr[String] = js.native
  
  /** Code of the rejection reason. */
  var reasonCode: js.UndefOr[String] = js.native
}
object MerchantRejectionReason {
  
  @scala.inline
  def apply(): MerchantRejectionReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MerchantRejectionReason]
  }
  
  @scala.inline
  implicit class MerchantRejectionReasonMutableBuilder[Self <: MerchantRejectionReason] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setReasonCode(value: String): Self = StObject.set(x, "reasonCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonCodeUndefined: Self = StObject.set(x, "reasonCode", js.undefined)
  }
}
