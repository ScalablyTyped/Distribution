package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlashText extends StObject {
  
  var accName: String
  
  var antiAliasSharpness: Double
  
  var antiAliasThickness: Double
  
  var autoExpand: Boolean
  
  var border: Boolean
  
  var description: String
  
  var embeddedCharacters: String
  
  def getTextAttr(): Any
  
  def getTextString(): Any
  
  def setTextAttr(): Any
  
  def setTextString(): Any
}
object FlashText {
  
  inline def apply(
    accName: String,
    antiAliasSharpness: Double,
    antiAliasThickness: Double,
    autoExpand: Boolean,
    border: Boolean,
    description: String,
    embeddedCharacters: String,
    getTextAttr: () => Any,
    getTextString: () => Any,
    setTextAttr: () => Any,
    setTextString: () => Any
  ): FlashText = {
    val __obj = js.Dynamic.literal(accName = accName.asInstanceOf[js.Any], antiAliasSharpness = antiAliasSharpness.asInstanceOf[js.Any], antiAliasThickness = antiAliasThickness.asInstanceOf[js.Any], autoExpand = autoExpand.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], embeddedCharacters = embeddedCharacters.asInstanceOf[js.Any], getTextAttr = js.Any.fromFunction0(getTextAttr), getTextString = js.Any.fromFunction0(getTextString), setTextAttr = js.Any.fromFunction0(setTextAttr), setTextString = js.Any.fromFunction0(setTextString))
    __obj.asInstanceOf[FlashText]
  }
  
  extension [Self <: FlashText](x: Self) {
    
    inline def setAccName(value: String): Self = StObject.set(x, "accName", value.asInstanceOf[js.Any])
    
    inline def setAntiAliasSharpness(value: Double): Self = StObject.set(x, "antiAliasSharpness", value.asInstanceOf[js.Any])
    
    inline def setAntiAliasThickness(value: Double): Self = StObject.set(x, "antiAliasThickness", value.asInstanceOf[js.Any])
    
    inline def setAutoExpand(value: Boolean): Self = StObject.set(x, "autoExpand", value.asInstanceOf[js.Any])
    
    inline def setBorder(value: Boolean): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setEmbeddedCharacters(value: String): Self = StObject.set(x, "embeddedCharacters", value.asInstanceOf[js.Any])
    
    inline def setGetTextAttr(value: () => Any): Self = StObject.set(x, "getTextAttr", js.Any.fromFunction0(value))
    
    inline def setGetTextString(value: () => Any): Self = StObject.set(x, "getTextString", js.Any.fromFunction0(value))
    
    inline def setSetTextAttr(value: () => Any): Self = StObject.set(x, "setTextAttr", js.Any.fromFunction0(value))
    
    inline def setSetTextString(value: () => Any): Self = StObject.set(x, "setTextString", js.Any.fromFunction0(value))
  }
}
