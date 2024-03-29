package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHangoutsChatExportOptions extends StObject {
  
  /**
    * The file format for exported messages.
    */
  var exportFormat: js.UndefOr[String | Null] = js.undefined
}
object SchemaHangoutsChatExportOptions {
  
  inline def apply(): SchemaHangoutsChatExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHangoutsChatExportOptions]
  }
  
  extension [Self <: SchemaHangoutsChatExportOptions](x: Self) {
    
    inline def setExportFormat(value: String): Self = StObject.set(x, "exportFormat", value.asInstanceOf[js.Any])
    
    inline def setExportFormatNull: Self = StObject.set(x, "exportFormat", null)
    
    inline def setExportFormatUndefined: Self = StObject.set(x, "exportFormat", js.undefined)
  }
}
