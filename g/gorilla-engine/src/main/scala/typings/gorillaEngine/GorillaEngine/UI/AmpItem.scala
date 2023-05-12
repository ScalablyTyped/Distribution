package typings.gorillaEngine.GorillaEngine.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmpItem extends StObject {
  
  var color: String
  
  var cornerRadius: Double
  
  var imagePath: String
  
  var size: Double
  
  var text: String
  
  var textColor: String
  
  var value: Double
  
  @JSName("value&")
  var valueAmpersand: Any
  
  var visible: Boolean
}
object AmpItem {
  
  inline def apply(
    color: String,
    cornerRadius: Double,
    imagePath: String,
    size: Double,
    text: String,
    textColor: String,
    value: Double,
    valueAmpersand: Any,
    visible: Boolean
  ): AmpItem = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], cornerRadius = cornerRadius.asInstanceOf[js.Any], imagePath = imagePath.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("value&")(valueAmpersand.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmpItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AmpItem] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    inline def setImagePath(value: String): Self = StObject.set(x, "imagePath", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueAmpersand(value: Any): Self = StObject.set(x, "value&", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
