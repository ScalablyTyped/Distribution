package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchCreatePrintersResponse extends StObject {
  
  /**
    * A list of create failures. Printer IDs are not populated, as printer were not created.
    */
  var failures: js.UndefOr[js.Array[SchemaFailureInfo]] = js.undefined
  
  /**
    * A list of successfully created printers with their IDs populated.
    */
  var printers: js.UndefOr[js.Array[SchemaPrinter]] = js.undefined
}
object SchemaBatchCreatePrintersResponse {
  
  inline def apply(): SchemaBatchCreatePrintersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchCreatePrintersResponse]
  }
  
  extension [Self <: SchemaBatchCreatePrintersResponse](x: Self) {
    
    inline def setFailures(value: js.Array[SchemaFailureInfo]): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
    
    inline def setFailuresUndefined: Self = StObject.set(x, "failures", js.undefined)
    
    inline def setFailuresVarargs(value: SchemaFailureInfo*): Self = StObject.set(x, "failures", js.Array(value*))
    
    inline def setPrinters(value: js.Array[SchemaPrinter]): Self = StObject.set(x, "printers", value.asInstanceOf[js.Any])
    
    inline def setPrintersUndefined: Self = StObject.set(x, "printers", js.undefined)
    
    inline def setPrintersVarargs(value: SchemaPrinter*): Self = StObject.set(x, "printers", js.Array(value*))
  }
}
