package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFailureInfo extends StObject {
  
  /**
    * Canonical code for why the update failed to apply.
    */
  var errorCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Failure reason message.
    */
  var errorMessage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Failed printer.
    */
  var printer: js.UndefOr[SchemaPrinter] = js.undefined
  
  /**
    * Id of a failed printer.
    */
  var printerId: js.UndefOr[String | Null] = js.undefined
}
object SchemaFailureInfo {
  
  inline def apply(): SchemaFailureInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFailureInfo]
  }
  
  extension [Self <: SchemaFailureInfo](x: Self) {
    
    inline def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeNull: Self = StObject.set(x, "errorCode", null)
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageNull: Self = StObject.set(x, "errorMessage", null)
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setPrinter(value: SchemaPrinter): Self = StObject.set(x, "printer", value.asInstanceOf[js.Any])
    
    inline def setPrinterId(value: String): Self = StObject.set(x, "printerId", value.asInstanceOf[js.Any])
    
    inline def setPrinterIdNull: Self = StObject.set(x, "printerId", null)
    
    inline def setPrinterIdUndefined: Self = StObject.set(x, "printerId", js.undefined)
    
    inline def setPrinterUndefined: Self = StObject.set(x, "printer", js.undefined)
  }
}
