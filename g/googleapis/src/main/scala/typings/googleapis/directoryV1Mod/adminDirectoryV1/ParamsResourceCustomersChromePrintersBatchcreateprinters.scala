package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCustomersChromePrintersBatchcreateprinters
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the customer. Format: customers/{customer_id\}
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBatchCreatePrintersRequest] = js.undefined
}
object ParamsResourceCustomersChromePrintersBatchcreateprinters {
  
  inline def apply(): ParamsResourceCustomersChromePrintersBatchcreateprinters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCustomersChromePrintersBatchcreateprinters]
  }
  
  extension [Self <: ParamsResourceCustomersChromePrintersBatchcreateprinters](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaBatchCreatePrintersRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
