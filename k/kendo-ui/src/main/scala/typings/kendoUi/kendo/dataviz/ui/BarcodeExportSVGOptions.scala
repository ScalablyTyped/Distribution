package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BarcodeExportSVGOptions extends StObject {
  
  var raw: js.UndefOr[Boolean] = js.undefined
}
object BarcodeExportSVGOptions {
  
  @scala.inline
  def apply(): BarcodeExportSVGOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarcodeExportSVGOptions]
  }
  
  @scala.inline
  implicit class BarcodeExportSVGOptionsMutableBuilder[Self <: BarcodeExportSVGOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
  }
}
