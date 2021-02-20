package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartExportSVGOptions extends StObject {
  
  var raw: js.UndefOr[Boolean] = js.native
}
object ChartExportSVGOptions {
  
  @scala.inline
  def apply(): ChartExportSVGOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartExportSVGOptions]
  }
  
  @scala.inline
  implicit class ChartExportSVGOptionsMutableBuilder[Self <: ChartExportSVGOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
  }
}
