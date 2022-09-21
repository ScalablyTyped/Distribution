package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderreportsListDisbursementsResponse extends StObject {
  
  /** The list of disbursements. */
  var disbursements: js.UndefOr[js.Array[OrderReportDisbursement]] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#orderreportsListDisbursementsResponse`". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The token for the retrieval of the next page of disbursements. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object OrderreportsListDisbursementsResponse {
  
  inline def apply(): OrderreportsListDisbursementsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderreportsListDisbursementsResponse]
  }
  
  extension [Self <: OrderreportsListDisbursementsResponse](x: Self) {
    
    inline def setDisbursements(value: js.Array[OrderReportDisbursement]): Self = StObject.set(x, "disbursements", value.asInstanceOf[js.Any])
    
    inline def setDisbursementsUndefined: Self = StObject.set(x, "disbursements", js.undefined)
    
    inline def setDisbursementsVarargs(value: OrderReportDisbursement*): Self = StObject.set(x, "disbursements", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
