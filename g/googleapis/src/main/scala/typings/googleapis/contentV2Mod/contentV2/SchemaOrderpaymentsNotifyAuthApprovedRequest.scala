package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderpaymentsNotifyAuthApprovedRequest extends StObject {
  
  /**
    * Authorized amount for pre-tax charge on user&#39;s credit card.
    */
  var authAmountPretax: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * Authorized amount for tax charge on user&#39;s credit card.
    */
  var authAmountTax: js.UndefOr[SchemaPrice] = js.undefined
}
object SchemaOrderpaymentsNotifyAuthApprovedRequest {
  
  @scala.inline
  def apply(): SchemaOrderpaymentsNotifyAuthApprovedRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderpaymentsNotifyAuthApprovedRequest]
  }
  
  @scala.inline
  implicit class SchemaOrderpaymentsNotifyAuthApprovedRequestMutableBuilder[Self <: SchemaOrderpaymentsNotifyAuthApprovedRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthAmountPretax(value: SchemaPrice): Self = StObject.set(x, "authAmountPretax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthAmountPretaxUndefined: Self = StObject.set(x, "authAmountPretax", js.undefined)
    
    @scala.inline
    def setAuthAmountTax(value: SchemaPrice): Self = StObject.set(x, "authAmountTax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthAmountTaxUndefined: Self = StObject.set(x, "authAmountTax", js.undefined)
  }
}
