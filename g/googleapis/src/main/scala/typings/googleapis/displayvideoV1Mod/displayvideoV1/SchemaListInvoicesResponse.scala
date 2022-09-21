package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListInvoicesResponse extends StObject {
  
  /**
    * The list of invoices. This list will be absent if empty.
    */
  var invoices: js.UndefOr[js.Array[SchemaInvoice]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListInvoices` method to retrieve the next page of results. This token will be absent if there are no more invoices to return.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListInvoicesResponse {
  
  inline def apply(): SchemaListInvoicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListInvoicesResponse]
  }
  
  extension [Self <: SchemaListInvoicesResponse](x: Self) {
    
    inline def setInvoices(value: js.Array[SchemaInvoice]): Self = StObject.set(x, "invoices", value.asInstanceOf[js.Any])
    
    inline def setInvoicesUndefined: Self = StObject.set(x, "invoices", js.undefined)
    
    inline def setInvoicesVarargs(value: SchemaInvoice*): Self = StObject.set(x, "invoices", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
