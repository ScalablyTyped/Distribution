package typings.gorillaEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<gorilla-engine.GorillaEngine.UI.AmpItem> */
trait PartialAmpItem extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var cornerRadius: js.UndefOr[Double] = js.undefined
  
  var imagePath: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var textColor: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
  
  @JSName("value&")
  var valueAmpersand: js.UndefOr[Any] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object PartialAmpItem {
  
  inline def apply(): PartialAmpItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAmpItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialAmpItem] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    inline def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
    
    inline def setImagePath(value: String): Self = StObject.set(x, "imagePath", value.asInstanceOf[js.Any])
    
    inline def setImagePathUndefined: Self = StObject.set(x, "imagePath", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueAmpersand(value: Any): Self = StObject.set(x, "value&", value.asInstanceOf[js.Any])
    
    inline def setValueAmpersandUndefined: Self = StObject.set(x, "value&", js.undefined)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
