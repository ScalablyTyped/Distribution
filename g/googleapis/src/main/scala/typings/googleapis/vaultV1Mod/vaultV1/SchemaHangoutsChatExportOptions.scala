package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options for hangouts chat export.
  */
trait SchemaHangoutsChatExportOptions extends StObject {
  
  /**
    * The export format for hangouts chat export.
    */
  var exportFormat: js.UndefOr[String] = js.undefined
}
object SchemaHangoutsChatExportOptions {
  
  inline def apply(): SchemaHangoutsChatExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHangoutsChatExportOptions]
  }
  
  extension [Self <: SchemaHangoutsChatExportOptions](x: Self) {
    
    inline def setExportFormat(value: String): Self = StObject.set(x, "exportFormat", value.asInstanceOf[js.Any])
    
    inline def setExportFormatUndefined: Self = StObject.set(x, "exportFormat", js.undefined)
  }
}
