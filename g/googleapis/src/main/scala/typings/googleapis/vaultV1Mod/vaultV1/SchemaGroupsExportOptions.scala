package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options for groups export.
  */
trait SchemaGroupsExportOptions extends StObject {
  
  /**
    * The export format for groups export.
    */
  var exportFormat: js.UndefOr[String] = js.undefined
}
object SchemaGroupsExportOptions {
  
  inline def apply(): SchemaGroupsExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroupsExportOptions]
  }
  
  extension [Self <: SchemaGroupsExportOptions](x: Self) {
    
    inline def setExportFormat(value: String): Self = StObject.set(x, "exportFormat", value.asInstanceOf[js.Any])
    
    inline def setExportFormatUndefined: Self = StObject.set(x, "exportFormat", js.undefined)
  }
}
