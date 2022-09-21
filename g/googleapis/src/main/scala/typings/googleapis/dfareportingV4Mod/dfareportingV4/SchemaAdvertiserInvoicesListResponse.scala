package typings.googleapis.dfareportingV4Mod.dfareportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAdvertiserInvoicesListResponse extends StObject {
  
  /**
    * Invoice collection
    */
  var invoices: js.UndefOr[js.Array[SchemaInvoice]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#advertiserInvoicesListResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaAdvertiserInvoicesListResponse {
  
  inline def apply(): SchemaAdvertiserInvoicesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdvertiserInvoicesListResponse]
  }
  
  extension [Self <: SchemaAdvertiserInvoicesListResponse](x: Self) {
    
    inline def setInvoices(value: js.Array[SchemaInvoice]): Self = StObject.set(x, "invoices", value.asInstanceOf[js.Any])
    
    inline def setInvoicesUndefined: Self = StObject.set(x, "invoices", js.undefined)
    
    inline def setInvoicesVarargs(value: SchemaInvoice*): Self = StObject.set(x, "invoices", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
