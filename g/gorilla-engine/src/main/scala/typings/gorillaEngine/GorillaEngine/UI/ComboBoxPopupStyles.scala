package typings.gorillaEngine.GorillaEngine.UI

import typings.gorillaEngine.gorillaEngineStrings.left
import typings.gorillaEngine.gorillaEngineStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComboBoxPopupStyles extends StObject {
  
  var backgroundColor: String
  
  var checkmarkFloat: left | right
  
  var checkmarkPadding: ComboBoxPadding
  
  var cornerRadius: Double
  
  var itemHighlightedBackgroundColor: String
  
  var itemHighlightedTextColor: String
  
  var itemSelectedBackgroundColor: String
  
  var itemSelectedTextColor: String
  
  var itemTextColor: String
  
  var padding: ComboBoxPadding | Double
  
  var textAlign: String
}
object ComboBoxPopupStyles {
  
  inline def apply(
    backgroundColor: String,
    checkmarkFloat: left | right,
    checkmarkPadding: ComboBoxPadding,
    cornerRadius: Double,
    itemHighlightedBackgroundColor: String,
    itemHighlightedTextColor: String,
    itemSelectedBackgroundColor: String,
    itemSelectedTextColor: String,
    itemTextColor: String,
    padding: ComboBoxPadding | Double,
    textAlign: String
  ): ComboBoxPopupStyles = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], checkmarkFloat = checkmarkFloat.asInstanceOf[js.Any], checkmarkPadding = checkmarkPadding.asInstanceOf[js.Any], cornerRadius = cornerRadius.asInstanceOf[js.Any], itemHighlightedBackgroundColor = itemHighlightedBackgroundColor.asInstanceOf[js.Any], itemHighlightedTextColor = itemHighlightedTextColor.asInstanceOf[js.Any], itemSelectedBackgroundColor = itemSelectedBackgroundColor.asInstanceOf[js.Any], itemSelectedTextColor = itemSelectedTextColor.asInstanceOf[js.Any], itemTextColor = itemTextColor.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], textAlign = textAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComboBoxPopupStyles]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComboBoxPopupStyles] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setCheckmarkFloat(value: left | right): Self = StObject.set(x, "checkmarkFloat", value.asInstanceOf[js.Any])
    
    inline def setCheckmarkPadding(value: ComboBoxPadding): Self = StObject.set(x, "checkmarkPadding", value.asInstanceOf[js.Any])
    
    inline def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    inline def setItemHighlightedBackgroundColor(value: String): Self = StObject.set(x, "itemHighlightedBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setItemHighlightedTextColor(value: String): Self = StObject.set(x, "itemHighlightedTextColor", value.asInstanceOf[js.Any])
    
    inline def setItemSelectedBackgroundColor(value: String): Self = StObject.set(x, "itemSelectedBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setItemSelectedTextColor(value: String): Self = StObject.set(x, "itemSelectedTextColor", value.asInstanceOf[js.Any])
    
    inline def setItemTextColor(value: String): Self = StObject.set(x, "itemTextColor", value.asInstanceOf[js.Any])
    
    inline def setPadding(value: ComboBoxPadding | Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
  }
}
