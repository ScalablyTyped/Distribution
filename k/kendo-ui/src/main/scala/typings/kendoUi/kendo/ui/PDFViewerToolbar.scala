package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDFViewerToolbar extends StObject {
  
  var items: js.UndefOr[js.Array[PDFViewerToolbarItem]] = js.native
}
object PDFViewerToolbar {
  
  @scala.inline
  def apply(): PDFViewerToolbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFViewerToolbar]
  }
  
  @scala.inline
  implicit class PDFViewerToolbarMutableBuilder[Self <: PDFViewerToolbar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[PDFViewerToolbarItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: PDFViewerToolbarItem*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
