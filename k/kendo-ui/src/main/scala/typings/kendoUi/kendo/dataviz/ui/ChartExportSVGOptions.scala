package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartExportSVGOptions extends StObject {
  
  var raw: js.UndefOr[Boolean] = js.undefined
}
object ChartExportSVGOptions {
  
  inline def apply(): ChartExportSVGOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartExportSVGOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartExportSVGOptions] (val x: Self) extends AnyVal {
    
    inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
  }
}
