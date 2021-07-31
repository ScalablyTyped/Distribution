package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArcGaugeExportSVGOptions extends StObject {
  
  var raw: js.UndefOr[Boolean] = js.undefined
}
object ArcGaugeExportSVGOptions {
  
  @scala.inline
  def apply(): ArcGaugeExportSVGOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArcGaugeExportSVGOptions]
  }
  
  @scala.inline
  implicit class ArcGaugeExportSVGOptionsMutableBuilder[Self <: ArcGaugeExportSVGOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
  }
}
