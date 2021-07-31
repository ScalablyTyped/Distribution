package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinearGaugeExportImageOptions extends StObject {
  
  var height: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[String] = js.undefined
}
object LinearGaugeExportImageOptions {
  
  @scala.inline
  def apply(): LinearGaugeExportImageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinearGaugeExportImageOptions]
  }
  
  @scala.inline
  implicit class LinearGaugeExportImageOptionsMutableBuilder[Self <: LinearGaugeExportImageOptions] (val x: Self) extends AnyVal {
    
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
