package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BarcodeOptions extends StObject {
  
  var background: js.UndefOr[String] = js.undefined
  
  var border: js.UndefOr[BarcodeBorder] = js.undefined
  
  var checksum: js.UndefOr[Boolean] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var padding: js.UndefOr[BarcodePadding] = js.undefined
  
  var renderAs: js.UndefOr[String] = js.undefined
  
  var text: js.UndefOr[BarcodeText] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object BarcodeOptions {
  
  @scala.inline
  def apply(): BarcodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarcodeOptions]
  }
  
  @scala.inline
  implicit class BarcodeOptionsMutableBuilder[Self <: BarcodeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setBorder(value: BarcodeBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setChecksum(value: Boolean): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChecksumUndefined: Self = StObject.set(x, "checksum", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPadding(value: BarcodePadding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setRenderAs(value: String): Self = StObject.set(x, "renderAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderAsUndefined: Self = StObject.set(x, "renderAs", js.undefined)
    
    @scala.inline
    def setText(value: BarcodeText): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
