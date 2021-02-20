package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinearGaugeExportSVGOptions extends StObject {
  
  var raw: js.UndefOr[Boolean] = js.native
}
object LinearGaugeExportSVGOptions {
  
  @scala.inline
  def apply(): LinearGaugeExportSVGOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinearGaugeExportSVGOptions]
  }
  
  @scala.inline
  implicit class LinearGaugeExportSVGOptionsMutableBuilder[Self <: LinearGaugeExportSVGOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
  }
}
