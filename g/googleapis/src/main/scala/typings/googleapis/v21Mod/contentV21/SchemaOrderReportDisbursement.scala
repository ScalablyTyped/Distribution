package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderReportDisbursement extends StObject {
  
  /**
    * The disbursement amount.
    */
  var disbursementAmount: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * The disbursement date, in ISO 8601 format.
    */
  var disbursementCreationDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The date the disbursement was initiated, in ISO 8601 format.
    */
  var disbursementDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the disbursement.
    */
  var disbursementId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the managing account.
    */
  var merchantId: js.UndefOr[String | Null] = js.undefined
}
object SchemaOrderReportDisbursement {
  
  inline def apply(): SchemaOrderReportDisbursement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderReportDisbursement]
  }
  
  extension [Self <: SchemaOrderReportDisbursement](x: Self) {
    
    inline def setDisbursementAmount(value: SchemaPrice): Self = StObject.set(x, "disbursementAmount", value.asInstanceOf[js.Any])
    
    inline def setDisbursementAmountUndefined: Self = StObject.set(x, "disbursementAmount", js.undefined)
    
    inline def setDisbursementCreationDate(value: String): Self = StObject.set(x, "disbursementCreationDate", value.asInstanceOf[js.Any])
    
    inline def setDisbursementCreationDateNull: Self = StObject.set(x, "disbursementCreationDate", null)
    
    inline def setDisbursementCreationDateUndefined: Self = StObject.set(x, "disbursementCreationDate", js.undefined)
    
    inline def setDisbursementDate(value: String): Self = StObject.set(x, "disbursementDate", value.asInstanceOf[js.Any])
    
    inline def setDisbursementDateNull: Self = StObject.set(x, "disbursementDate", null)
    
    inline def setDisbursementDateUndefined: Self = StObject.set(x, "disbursementDate", js.undefined)
    
    inline def setDisbursementId(value: String): Self = StObject.set(x, "disbursementId", value.asInstanceOf[js.Any])
    
    inline def setDisbursementIdNull: Self = StObject.set(x, "disbursementId", null)
    
    inline def setDisbursementIdUndefined: Self = StObject.set(x, "disbursementId", js.undefined)
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdNull: Self = StObject.set(x, "merchantId", null)
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
  }
}
