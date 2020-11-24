package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlashText extends js.Object {
  
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
  implicit class FlashTextOps[Self <: FlashText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccName(value: String): Self = this.set("accName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAntiAliasSharpness(value: Double): Self = this.set("antiAliasSharpness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAntiAliasThickness(value: Double): Self = this.set("antiAliasThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoExpand(value: Boolean): Self = this.set("autoExpand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorder(value: Boolean): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbeddedCharacters(value: String): Self = this.set("embeddedCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetTextAttr(value: () => js.Any): Self = this.set("getTextAttr", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTextString(value: () => js.Any): Self = this.set("getTextString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetTextAttr(value: () => js.Any): Self = this.set("setTextAttr", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetTextString(value: () => js.Any): Self = this.set("setTextString", js.Any.fromFunction0(value))
  }
}
