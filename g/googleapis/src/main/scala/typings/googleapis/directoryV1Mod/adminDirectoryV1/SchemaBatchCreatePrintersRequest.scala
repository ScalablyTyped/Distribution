package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchCreatePrintersRequest extends StObject {
  
  /**
    * A list of Printers to be created. Max 50 at a time.
    */
  var requests: js.UndefOr[js.Array[SchemaCreatePrinterRequest]] = js.undefined
}
object SchemaBatchCreatePrintersRequest {
  
  inline def apply(): SchemaBatchCreatePrintersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchCreatePrintersRequest]
  }
  
  extension [Self <: SchemaBatchCreatePrintersRequest](x: Self) {
    
    inline def setRequests(value: js.Array[SchemaCreatePrinterRequest]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    inline def setRequestsVarargs(value: SchemaCreatePrinterRequest*): Self = StObject.set(x, "requests", js.Array(value*))
  }
}
