package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListPrintersResponse extends StObject {
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of printers. If `org_unit_id` was given in the request, then only printers visible for this OU will be returned. If `org_unit_id` was not given in the request, then all printers will be returned.
    */
  var printers: js.UndefOr[js.Array[SchemaPrinter]] = js.undefined
}
object SchemaListPrintersResponse {
  
  inline def apply(): SchemaListPrintersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListPrintersResponse]
  }
  
  extension [Self <: SchemaListPrintersResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPrinters(value: js.Array[SchemaPrinter]): Self = StObject.set(x, "printers", value.asInstanceOf[js.Any])
    
    inline def setPrintersUndefined: Self = StObject.set(x, "printers", js.undefined)
    
    inline def setPrintersVarargs(value: SchemaPrinter*): Self = StObject.set(x, "printers", js.Array(value*))
  }
}
