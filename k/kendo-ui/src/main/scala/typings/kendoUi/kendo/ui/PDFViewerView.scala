package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PDFViewerView extends StObject {
  
  var `type`: js.UndefOr[String] = js.undefined
}
object PDFViewerView {
  
  inline def apply(): PDFViewerView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFViewerView]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PDFViewerView] (val x: Self) extends AnyVal {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
