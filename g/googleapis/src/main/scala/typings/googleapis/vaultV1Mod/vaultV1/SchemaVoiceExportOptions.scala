package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVoiceExportOptions extends StObject {
  
  /**
    * The file format for exported text messages.
    */
  var exportFormat: js.UndefOr[String | Null] = js.undefined
}
object SchemaVoiceExportOptions {
  
  inline def apply(): SchemaVoiceExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVoiceExportOptions]
  }
  
  extension [Self <: SchemaVoiceExportOptions](x: Self) {
    
    inline def setExportFormat(value: String): Self = StObject.set(x, "exportFormat", value.asInstanceOf[js.Any])
    
    inline def setExportFormatNull: Self = StObject.set(x, "exportFormat", null)
    
    inline def setExportFormatUndefined: Self = StObject.set(x, "exportFormat", js.undefined)
  }
}
