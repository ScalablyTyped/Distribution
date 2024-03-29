package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderreportsListDisbursementsResponse extends StObject {
  
  /**
    * The list of disbursements.
    */
  var disbursements: js.UndefOr[js.Array[SchemaOrderReportDisbursement]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "`content#orderreportsListDisbursementsResponse`".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The token for the retrieval of the next page of disbursements.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaOrderreportsListDisbursementsResponse {
  
  inline def apply(): SchemaOrderreportsListDisbursementsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderreportsListDisbursementsResponse]
  }
  
  extension [Self <: SchemaOrderreportsListDisbursementsResponse](x: Self) {
    
    inline def setDisbursements(value: js.Array[SchemaOrderReportDisbursement]): Self = StObject.set(x, "disbursements", value.asInstanceOf[js.Any])
    
    inline def setDisbursementsUndefined: Self = StObject.set(x, "disbursements", js.undefined)
    
    inline def setDisbursementsVarargs(value: SchemaOrderReportDisbursement*): Self = StObject.set(x, "disbursements", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
