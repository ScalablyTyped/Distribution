package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreatePrinterRequest extends StObject {
  
  /**
    * Required. The name of the customer. Format: customers/{customer_id\}
    */
  var parent: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. A printer to create. If you want to place the printer under particular OU then populate printer.org_unit_id filed. Otherwise the printer will be placed under root OU.
    */
  var printer: js.UndefOr[SchemaPrinter] = js.undefined
}
object SchemaCreatePrinterRequest {
  
  inline def apply(): SchemaCreatePrinterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreatePrinterRequest]
  }
  
  extension [Self <: SchemaCreatePrinterRequest](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setPrinter(value: SchemaPrinter): Self = StObject.set(x, "printer", value.asInstanceOf[js.Any])
    
    inline def setPrinterUndefined: Self = StObject.set(x, "printer", js.undefined)
  }
}
