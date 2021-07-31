package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartExportImageOptions extends StObject {
  
  var cors: js.UndefOr[String] = js.undefined
  
  var height: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[String] = js.undefined
}
object ChartExportImageOptions {
  
  @scala.inline
  def apply(): ChartExportImageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartExportImageOptions]
  }
  
  @scala.inline
  implicit class ChartExportImageOptionsMutableBuilder[Self <: ChartExportImageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCors(value: String): Self = StObject.set(x, "cors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorsUndefined: Self = StObject.set(x, "cors", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
