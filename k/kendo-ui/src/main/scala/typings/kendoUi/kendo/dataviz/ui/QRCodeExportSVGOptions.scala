package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QRCodeExportSVGOptions extends StObject {
  
  var raw: js.UndefOr[Boolean] = js.undefined
}
object QRCodeExportSVGOptions {
  
  inline def apply(): QRCodeExportSVGOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QRCodeExportSVGOptions]
  }
  
  extension [Self <: QRCodeExportSVGOptions](x: Self) {
    
    inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
  }
}
