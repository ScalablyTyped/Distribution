package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCustomersChromePrintersBatchdeleteprinters
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the customer. Format: customers/{customer_id\}
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBatchDeletePrintersRequest] = js.undefined
}
object ParamsResourceCustomersChromePrintersBatchdeleteprinters {
  
  inline def apply(): ParamsResourceCustomersChromePrintersBatchdeleteprinters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCustomersChromePrintersBatchdeleteprinters]
  }
  
  extension [Self <: ParamsResourceCustomersChromePrintersBatchdeleteprinters](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaBatchDeletePrintersRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
