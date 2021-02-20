package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QRCodeExportSVGOptions extends StObject {
  
  var raw: js.UndefOr[Boolean] = js.native
}
object QRCodeExportSVGOptions {
  
  @scala.inline
  def apply(): QRCodeExportSVGOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QRCodeExportSVGOptions]
  }
  
  @scala.inline
  implicit class QRCodeExportSVGOptionsMutableBuilder[Self <: QRCodeExportSVGOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
  }
}
