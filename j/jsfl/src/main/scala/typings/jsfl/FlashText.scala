package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlashText extends StObject {
  
  var accName: String = js.native
  
  var antiAliasSharpness: Double = js.native
  
  var antiAliasThickness: Double = js.native
  
  var autoExpand: Boolean = js.native
  
  var border: Boolean = js.native
  
  var description: String = js.native
  
  var embeddedCharacters: String = js.native
  
  def getTextAttr(): js.Any = js.native
  
  def getTextString(): js.Any = js.native
  
  def setTextAttr(): js.Any = js.native
  
  def setTextString(): js.Any = js.native
}
object FlashText {
  
  @scala.inline
  def apply(
    accName: String,
    antiAliasSharpness: Double,
    antiAliasThickness: Double,
    autoExpand: Boolean,
    border: Boolean,
    description: String,
    embeddedCharacters: String,
    getTextAttr: () => js.Any,
    getTextString: () => js.Any,
    setTextAttr: () => js.Any,
    setTextString: () => js.Any
  ): FlashText = {
    val __obj = js.Dynamic.literal(accName = accName.asInstanceOf[js.Any], antiAliasSharpness = antiAliasSharpness.asInstanceOf[js.Any], antiAliasThickness = antiAliasThickness.asInstanceOf[js.Any], autoExpand = autoExpand.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], embeddedCharacters = embeddedCharacters.asInstanceOf[js.Any], getTextAttr = js.Any.fromFunction0(getTextAttr), getTextString = js.Any.fromFunction0(getTextString), setTextAttr = js.Any.fromFunction0(setTextAttr), setTextString = js.Any.fromFunction0(setTextString))
    __obj.asInstanceOf[FlashText]
  }
  
  @scala.inline
  implicit class FlashTextMutableBuilder[Self <: FlashText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccName(value: String): Self = StObject.set(x, "accName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAntiAliasSharpness(value: Double): Self = StObject.set(x, "antiAliasSharpness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAntiAliasThickness(value: Double): Self = StObject.set(x, "antiAliasThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoExpand(value: Boolean): Self = StObject.set(x, "autoExpand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorder(value: Boolean): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbeddedCharacters(value: String): Self = StObject.set(x, "embeddedCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetTextAttr(value: () => js.Any): Self = StObject.set(x, "getTextAttr", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTextString(value: () => js.Any): Self = StObject.set(x, "getTextString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetTextAttr(value: () => js.Any): Self = StObject.set(x, "setTextAttr", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetTextString(value: () => js.Any): Self = StObject.set(x, "setTextString", js.Any.fromFunction0(value))
  }
}
