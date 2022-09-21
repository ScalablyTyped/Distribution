package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchDeletePrintersRequest extends StObject {
  
  /**
    * A list of Printer.id that should be deleted. Max 100 at a time.
    */
  var printerIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaBatchDeletePrintersRequest {
  
  inline def apply(): SchemaBatchDeletePrintersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchDeletePrintersRequest]
  }
  
  extension [Self <: SchemaBatchDeletePrintersRequest](x: Self) {
    
    inline def setPrinterIds(value: js.Array[String]): Self = StObject.set(x, "printerIds", value.asInstanceOf[js.Any])
    
    inline def setPrinterIdsNull: Self = StObject.set(x, "printerIds", null)
    
    inline def setPrinterIdsUndefined: Self = StObject.set(x, "printerIds", js.undefined)
    
    inline def setPrinterIdsVarargs(value: String*): Self = StObject.set(x, "printerIds", js.Array(value*))
  }
}
