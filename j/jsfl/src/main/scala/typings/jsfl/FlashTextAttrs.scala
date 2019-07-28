package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashTextAttrs extends FlashText {
  var aliasText: Boolean
  var alignment: String
  var autoKern: Boolean
  var bold: Boolean
  var characterPosition: String
  var characterSpacing: Double
  var face: String
  var fillColor: js.Any
  var indent: Double
  var italic: Boolean
  var leftMargin: Double
  var letterSpacing: Double
  var lineSpacing: Double
  var rightMargin: Double
  var rotation: Boolean
  var size: Double
  var target: String
  var url: String
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
    val __obj = js.Dynamic.literal(accName = accName, aliasText = aliasText, alignment = alignment, antiAliasSharpness = antiAliasSharpness, antiAliasThickness = antiAliasThickness, autoExpand = autoExpand, autoKern = autoKern, bold = bold, border = border, characterPosition = characterPosition, characterSpacing = characterSpacing, description = description, embeddedCharacters = embeddedCharacters, face = face, fillColor = fillColor, getTextAttr = js.Any.fromFunction0(getTextAttr), getTextString = js.Any.fromFunction0(getTextString), indent = indent, italic = italic, leftMargin = leftMargin, letterSpacing = letterSpacing, lineSpacing = lineSpacing, rightMargin = rightMargin, rotation = rotation, setTextAttr = js.Any.fromFunction0(setTextAttr), setTextString = js.Any.fromFunction0(setTextString), size = size, target = target, url = url)
  
    __obj.asInstanceOf[FlashTextAttrs]
  }
}

