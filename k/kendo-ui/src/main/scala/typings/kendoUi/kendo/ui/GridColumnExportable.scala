package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridColumnExportable extends StObject {
  
  var excel: js.UndefOr[Boolean] = js.undefined
  
  var pdf: js.UndefOr[Boolean] = js.undefined
}
object GridColumnExportable {
  
  inline def apply(): GridColumnExportable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridColumnExportable]
  }
  
  extension [Self <: GridColumnExportable](x: Self) {
    
    inline def setExcel(value: Boolean): Self = StObject.set(x, "excel", value.asInstanceOf[js.Any])
    
    inline def setExcelUndefined: Self = StObject.set(x, "excel", js.undefined)
    
    inline def setPdf(value: Boolean): Self = StObject.set(x, "pdf", value.asInstanceOf[js.Any])
    
    inline def setPdfUndefined: Self = StObject.set(x, "pdf", js.undefined)
  }
}
