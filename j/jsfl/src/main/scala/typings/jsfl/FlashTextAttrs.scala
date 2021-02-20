package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlashTextAttrs extends FlashText {
  
  var aliasText: Boolean = js.native
  
  var alignment: String = js.native
  
  var autoKern: Boolean = js.native
  
  var bold: Boolean = js.native
  
  var characterPosition: String = js.native
  
  var characterSpacing: Double = js.native
  
  var face: String = js.native
  
  var fillColor: js.Any = js.native
  
  var indent: Double = js.native
  
  var italic: Boolean = js.native
  
  var leftMargin: Double = js.native
  
  var letterSpacing: Double = js.native
  
  var lineSpacing: Double = js.native
  
  var rightMargin: Double = js.native
  
  var rotation: Boolean = js.native
  
  var size: Double = js.native
  
  var target: String = js.native
  
  var url: String = js.native
}
object FlashTextAttrs {
  
  @scala.inline
  def apply(
    accName: String,
    aliasText: Boolean,
    alignment: String,
    antiAliasSharpness: Double,
    antiAliasThickness: Double,
    autoExpand: Boolean,
    autoKern: Boolean,
    bold: Boolean,
    border: Boolean,
    characterPosition: String,
    characterSpacing: Double,
    description: String,
    embeddedCharacters: String,
    face: String,
    fillColor: js.Any,
    getTextAttr: () => js.Any,
    getTextString: () => js.Any,
    indent: Double,
    italic: Boolean,
    leftMargin: Double,
    letterSpacing: Double,
    lineSpacing: Double,
    rightMargin: Double,
    rotation: Boolean,
    setTextAttr: () => js.Any,
    setTextString: () => js.Any,
    size: Double,
    target: String,
    url: String
  ): FlashTextAttrs = {
    val __obj = js.Dynamic.literal(accName = accName.asInstanceOf[js.Any], aliasText = aliasText.asInstanceOf[js.Any], alignment = alignment.asInstanceOf[js.Any], antiAliasSharpness = antiAliasSharpness.asInstanceOf[js.Any], antiAliasThickness = antiAliasThickness.asInstanceOf[js.Any], autoExpand = autoExpand.asInstanceOf[js.Any], autoKern = autoKern.asInstanceOf[js.Any], bold = bold.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], characterPosition = characterPosition.asInstanceOf[js.Any], characterSpacing = characterSpacing.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], embeddedCharacters = embeddedCharacters.asInstanceOf[js.Any], face = face.asInstanceOf[js.Any], fillColor = fillColor.asInstanceOf[js.Any], getTextAttr = js.Any.fromFunction0(getTextAttr), getTextString = js.Any.fromFunction0(getTextString), indent = indent.asInstanceOf[js.Any], italic = italic.asInstanceOf[js.Any], leftMargin = leftMargin.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], lineSpacing = lineSpacing.asInstanceOf[js.Any], rightMargin = rightMargin.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], setTextAttr = js.Any.fromFunction0(setTextAttr), setTextString = js.Any.fromFunction0(setTextString), size = size.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashTextAttrs]
  }
  
  @scala.inline
  implicit class FlashTextAttrsMutableBuilder[Self <: FlashTextAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliasText(value: Boolean): Self = StObject.set(x, "aliasText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignment(value: String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoKern(value: Boolean): Self = StObject.set(x, "autoKern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharacterPosition(value: String): Self = StObject.set(x, "characterPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharacterSpacing(value: Double): Self = StObject.set(x, "characterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFace(value: String): Self = StObject.set(x, "face", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillColor(value: js.Any): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftMargin(value: Double): Self = StObject.set(x, "leftMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLetterSpacing(value: Double): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineSpacing(value: Double): Self = StObject.set(x, "lineSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightMargin(value: Double): Self = StObject.set(x, "rightMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotation(value: Boolean): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
