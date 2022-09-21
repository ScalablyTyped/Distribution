package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchDeletePrintersResponse extends StObject {
  
  /**
    * A list of update failures.
    */
  var failedPrinters: js.UndefOr[js.Array[SchemaFailureInfo]] = js.undefined
  
  /**
    * A list of Printer.id that were successfully deleted.
    */
  var printerIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaBatchDeletePrintersResponse {
  
  inline def apply(): SchemaBatchDeletePrintersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchDeletePrintersResponse]
  }
  
  extension [Self <: SchemaBatchDeletePrintersResponse](x: Self) {
    
    inline def setFailedPrinters(value: js.Array[SchemaFailureInfo]): Self = StObject.set(x, "failedPrinters", value.asInstanceOf[js.Any])
    
    inline def setFailedPrintersUndefined: Self = StObject.set(x, "failedPrinters", js.undefined)
    
    inline def setFailedPrintersVarargs(value: SchemaFailureInfo*): Self = StObject.set(x, "failedPrinters", js.Array(value*))
    
    inline def setPrinterIds(value: js.Array[String]): Self = StObject.set(x, "printerIds", value.asInstanceOf[js.Any])
    
    inline def setPrinterIdsNull: Self = StObject.set(x, "printerIds", null)
    
    inline def setPrinterIdsUndefined: Self = StObject.set(x, "printerIds", js.undefined)
    
    inline def setPrinterIdsVarargs(value: String*): Self = StObject.set(x, "printerIds", js.Array(value*))
  }
}
