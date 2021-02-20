package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Order disbursement. All methods require the payment analyst role.
  */
@js.native
trait SchemaOrderReportDisbursement extends StObject {
  
  /**
    * The disbursement amount.
    */
  var disbursementAmount: js.UndefOr[SchemaPrice] = js.native
  
  /**
    * The disbursement date, in ISO 8601 format.
    */
  var disbursementCreationDate: js.UndefOr[String] = js.native
  
  /**
    * The date the disbursement was initiated, in ISO 8601 format.
    */
  var disbursementDate: js.UndefOr[String] = js.native
  
  /**
    * The ID of the disbursement.
    */
  var disbursementId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the managing account.
    */
  var merchantId: js.UndefOr[String] = js.native
}
object SchemaOrderReportDisbursement {
  
  @scala.inline
  def apply(): SchemaOrderReportDisbursement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderReportDisbursement]
  }
  
  @scala.inline
  implicit class SchemaOrderReportDisbursementMutableBuilder[Self <: SchemaOrderReportDisbursement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisbursementAmount(value: SchemaPrice): Self = StObject.set(x, "disbursementAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisbursementAmountUndefined: Self = StObject.set(x, "disbursementAmount", js.undefined)
    
    @scala.inline
    def setDisbursementCreationDate(value: String): Self = StObject.set(x, "disbursementCreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisbursementCreationDateUndefined: Self = StObject.set(x, "disbursementCreationDate", js.undefined)
    
    @scala.inline
    def setDisbursementDate(value: String): Self = StObject.set(x, "disbursementDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisbursementDateUndefined: Self = StObject.set(x, "disbursementDate", js.undefined)
    
    @scala.inline
    def setDisbursementId(value: String): Self = StObject.set(x, "disbursementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisbursementIdUndefined: Self = StObject.set(x, "disbursementId", js.undefined)
    
    @scala.inline
    def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
  }
}
