package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMailExportOptions extends StObject {
  
  /**
    * The file format for exported messages.
    */
  var exportFormat: js.UndefOr[String | Null] = js.undefined
  
  /**
    * To export confidential mode content, set to **true**.
    */
  var showConfidentialModeContent: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * To use the new export system, set to **true**.
    */
  var useNewExport: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaMailExportOptions {
  
  inline def apply(): SchemaMailExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMailExportOptions]
  }
  
  extension [Self <: SchemaMailExportOptions](x: Self) {
    
    inline def setExportFormat(value: String): Self = StObject.set(x, "exportFormat", value.asInstanceOf[js.Any])
    
    inline def setExportFormatNull: Self = StObject.set(x, "exportFormat", null)
    
    inline def setExportFormatUndefined: Self = StObject.set(x, "exportFormat", js.undefined)
    
    inline def setShowConfidentialModeContent(value: Boolean): Self = StObject.set(x, "showConfidentialModeContent", value.asInstanceOf[js.Any])
    
    inline def setShowConfidentialModeContentNull: Self = StObject.set(x, "showConfidentialModeContent", null)
    
    inline def setShowConfidentialModeContentUndefined: Self = StObject.set(x, "showConfidentialModeContent", js.undefined)
    
    inline def setUseNewExport(value: Boolean): Self = StObject.set(x, "useNewExport", value.asInstanceOf[js.Any])
    
    inline def setUseNewExportNull: Self = StObject.set(x, "useNewExport", null)
    
    inline def setUseNewExportUndefined: Self = StObject.set(x, "useNewExport", js.undefined)
  }
}
