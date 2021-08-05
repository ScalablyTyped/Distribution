package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options for mail export.
  */
trait SchemaMailExportOptions extends StObject {
  
  /**
    * The export file format.
    */
  var exportFormat: js.UndefOr[String] = js.undefined
  
  /**
    * Set to true to export confidential mode content.
    */
  var showConfidentialModeContent: js.UndefOr[Boolean] = js.undefined
}
object SchemaMailExportOptions {
  
  inline def apply(): SchemaMailExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMailExportOptions]
  }
  
  extension [Self <: SchemaMailExportOptions](x: Self) {
    
    inline def setExportFormat(value: String): Self = StObject.set(x, "exportFormat", value.asInstanceOf[js.Any])
    
    inline def setExportFormatUndefined: Self = StObject.set(x, "exportFormat", js.undefined)
    
    inline def setShowConfidentialModeContent(value: Boolean): Self = StObject.set(x, "showConfidentialModeContent", value.asInstanceOf[js.Any])
    
    inline def setShowConfidentialModeContentUndefined: Self = StObject.set(x, "showConfidentialModeContent", js.undefined)
  }
}
