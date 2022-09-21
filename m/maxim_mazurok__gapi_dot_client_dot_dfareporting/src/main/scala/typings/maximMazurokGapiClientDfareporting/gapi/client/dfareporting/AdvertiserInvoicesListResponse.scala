package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdvertiserInvoicesListResponse extends StObject {
  
  /** Invoice collection */
  var invoices: js.UndefOr[js.Array[Invoice]] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#advertiserInvoicesListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object AdvertiserInvoicesListResponse {
  
  inline def apply(): AdvertiserInvoicesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvertiserInvoicesListResponse]
  }
  
  extension [Self <: AdvertiserInvoicesListResponse](x: Self) {
    
    inline def setInvoices(value: js.Array[Invoice]): Self = StObject.set(x, "invoices", value.asInstanceOf[js.Any])
    
    inline def setInvoicesUndefined: Self = StObject.set(x, "invoices", js.undefined)
    
    inline def setInvoicesVarargs(value: Invoice*): Self = StObject.set(x, "invoices", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
