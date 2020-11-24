package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaOrderpaymentsNotifyAuthApprovedRequest extends js.Object {
  
  /**
    * Authorized amount for pre-tax charge on user&#39;s credit card.
    */
  var authAmountPretax: js.UndefOr[SchemaPrice] = js.native
  
  /**
    * Authorized amount for tax charge on user&#39;s credit card.
    */
  var authAmountTax: js.UndefOr[SchemaPrice] = js.native
}
object SchemaOrderpaymentsNotifyAuthApprovedRequest {
  
  @scala.inline
  def apply(): SchemaOrderpaymentsNotifyAuthApprovedRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderpaymentsNotifyAuthApprovedRequest]
  }
  
  @scala.inline
  implicit class SchemaOrderpaymentsNotifyAuthApprovedRequestOps[Self <: SchemaOrderpaymentsNotifyAuthApprovedRequest] (val x: Self) extends AnyVal {
    
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
    def setAuthAmountPretax(value: SchemaPrice): Self = this.set("authAmountPretax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthAmountPretax: Self = this.set("authAmountPretax", js.undefined)
    
    @scala.inline
    def setAuthAmountTax(value: SchemaPrice): Self = this.set("authAmountTax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthAmountTax: Self = this.set("authAmountTax", js.undefined)
  }
}
