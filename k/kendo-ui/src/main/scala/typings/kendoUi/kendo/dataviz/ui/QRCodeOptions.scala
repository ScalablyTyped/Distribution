package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QRCodeOptions extends StObject {
  
  var background: js.UndefOr[String] = js.native
  
  var border: js.UndefOr[QRCodeBorder] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var encoding: js.UndefOr[String] = js.native
  
  var errorCorrection: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var padding: js.UndefOr[Double] = js.native
  
  var renderAs: js.UndefOr[String] = js.native
  
  var size: js.UndefOr[Double | String] = js.native
  
  var value: js.UndefOr[Double | String] = js.native
}
object QRCodeOptions {
  
  @scala.inline
  def apply(): QRCodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QRCodeOptions]
  }
  
  @scala.inline
  implicit class QRCodeOptionsMutableBuilder[Self <: QRCodeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setBorder(value: QRCodeBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setErrorCorrection(value: String): Self = StObject.set(x, "errorCorrection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCorrectionUndefined: Self = StObject.set(x, "errorCorrection", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setRenderAs(value: String): Self = StObject.set(x, "renderAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderAsUndefined: Self = StObject.set(x, "renderAs", js.undefined)
    
    @scala.inline
    def setSize(value: Double | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
