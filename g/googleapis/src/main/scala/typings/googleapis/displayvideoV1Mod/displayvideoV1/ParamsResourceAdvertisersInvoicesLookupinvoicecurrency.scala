package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAdvertisersInvoicesLookupinvoicecurrency
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID of the advertiser to lookup currency for.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /**
    * Month for which the currency is needed. If not set, the request will return existing currency settings for the advertiser. Must be in the format YYYYMM.
    */
  var invoiceMonth: js.UndefOr[String] = js.undefined
}
object ParamsResourceAdvertisersInvoicesLookupinvoicecurrency {
  
  inline def apply(): ParamsResourceAdvertisersInvoicesLookupinvoicecurrency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAdvertisersInvoicesLookupinvoicecurrency]
  }
  
  extension [Self <: ParamsResourceAdvertisersInvoicesLookupinvoicecurrency](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setInvoiceMonth(value: String): Self = StObject.set(x, "invoiceMonth", value.asInstanceOf[js.Any])
    
    inline def setInvoiceMonthUndefined: Self = StObject.set(x, "invoiceMonth", js.undefined)
  }
}
