package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramExportSVGOptions extends StObject {
  
  var raw: js.UndefOr[Boolean] = js.native
}
object DiagramExportSVGOptions {
  
  @scala.inline
  def apply(): DiagramExportSVGOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramExportSVGOptions]
  }
  
  @scala.inline
  implicit class DiagramExportSVGOptionsMutableBuilder[Self <: DiagramExportSVGOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
  }
}
