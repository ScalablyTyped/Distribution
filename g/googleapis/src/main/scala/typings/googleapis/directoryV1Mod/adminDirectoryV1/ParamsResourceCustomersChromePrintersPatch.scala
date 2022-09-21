package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCustomersChromePrintersPatch
  extends StObject
     with StandardParameters {
  
  /**
    * The list of fields to be cleared. Note, some of the fields are read only and cannot be updated. Values for not specified fields will be patched.
    */
  var clearMask: js.UndefOr[String] = js.undefined
  
  /**
    * The resource name of the Printer object, in the format customers/{customer-id\}/printers/{printer-id\} (During printer creation leave empty)
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaPrinter] = js.undefined
  
  /**
    * The list of fields to be updated. Note, some of the fields are read only and cannot be updated. Values for not specified fields will be patched.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceCustomersChromePrintersPatch {
  
  inline def apply(): ParamsResourceCustomersChromePrintersPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCustomersChromePrintersPatch]
  }
  
  extension [Self <: ParamsResourceCustomersChromePrintersPatch](x: Self) {
    
    inline def setClearMask(value: String): Self = StObject.set(x, "clearMask", value.asInstanceOf[js.Any])
    
    inline def setClearMaskUndefined: Self = StObject.set(x, "clearMask", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaPrinter): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
