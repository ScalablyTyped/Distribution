package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArcGaugeExportSVGOptions extends StObject {
  
  var raw: js.UndefOr[Boolean] = js.undefined
}
object ArcGaugeExportSVGOptions {
  
  inline def apply(): ArcGaugeExportSVGOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArcGaugeExportSVGOptions]
  }
  
  extension [Self <: ArcGaugeExportSVGOptions](x: Self) {
    
    inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
  }
}
