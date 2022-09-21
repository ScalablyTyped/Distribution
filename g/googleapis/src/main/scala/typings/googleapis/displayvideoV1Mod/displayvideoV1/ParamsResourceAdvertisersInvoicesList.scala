package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAdvertisersInvoicesList
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID of the advertiser to list invoices for.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /**
    * The month to list the invoices for. If not set, the request will retrieve invoices for the previous month. Must be in the format YYYYMM.
    */
  var issueMonth: js.UndefOr[String] = js.undefined
  
  /**
    * Select type of invoice to retrieve for Loi Sapin advertisers. Only applicable to Loi Sapin advertisers. Will be ignored otherwise.
    */
  var loiSapinInvoiceType: js.UndefOr[String] = js.undefined
  
  /**
    * Requested page size. Must be between `1` and `100`. If unspecified will default to `100`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A token identifying a page of results the server should return. Typically, this is the value of next_page_token returned from the previous call to `ListInvoices` method. If not specified, the first page of results will be returned.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceAdvertisersInvoicesList {
  
  inline def apply(): ParamsResourceAdvertisersInvoicesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAdvertisersInvoicesList]
  }
  
  extension [Self <: ParamsResourceAdvertisersInvoicesList](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setIssueMonth(value: String): Self = StObject.set(x, "issueMonth", value.asInstanceOf[js.Any])
    
    inline def setIssueMonthUndefined: Self = StObject.set(x, "issueMonth", js.undefined)
    
    inline def setLoiSapinInvoiceType(value: String): Self = StObject.set(x, "loiSapinInvoiceType", value.asInstanceOf[js.Any])
    
    inline def setLoiSapinInvoiceTypeUndefined: Self = StObject.set(x, "loiSapinInvoiceType", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
