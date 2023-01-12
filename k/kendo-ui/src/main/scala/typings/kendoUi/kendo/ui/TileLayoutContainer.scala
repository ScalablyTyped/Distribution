package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileLayoutContainer extends StObject {
  
  var bodyTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var colSpan: js.UndefOr[Double] = js.undefined
  
  var header: js.UndefOr[TileLayoutContainerHeader] = js.undefined
  
  var rowSpan: js.UndefOr[Double] = js.undefined
}
object TileLayoutContainer {
  
  inline def apply(): TileLayoutContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileLayoutContainer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TileLayoutContainer] (val x: Self) extends AnyVal {
    
    inline def setBodyTemplate(value: String | js.Function): Self = StObject.set(x, "bodyTemplate", value.asInstanceOf[js.Any])
    
    inline def setBodyTemplateUndefined: Self = StObject.set(x, "bodyTemplate", js.undefined)
    
    inline def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
    
    inline def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
    
    inline def setHeader(value: TileLayoutContainerHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
    
    inline def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
  }
}
