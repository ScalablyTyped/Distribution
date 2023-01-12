package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PDFViewerToolbar extends StObject {
  
  var items: js.UndefOr[js.Array[PDFViewerToolbarItem]] = js.undefined
}
object PDFViewerToolbar {
  
  inline def apply(): PDFViewerToolbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFViewerToolbar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PDFViewerToolbar] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[PDFViewerToolbarItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: PDFViewerToolbarItem*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
