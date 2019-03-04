package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashTextAttrs extends FlashText {
  var aliasText: scala.Boolean
  var alignment: java.lang.String
  var autoKern: scala.Boolean
  var bold: scala.Boolean
  var characterPosition: java.lang.String
  var characterSpacing: scala.Double
  var face: java.lang.String
  var fillColor: js.Any
  var indent: scala.Double
  var italic: scala.Boolean
  var leftMargin: scala.Double
  var letterSpacing: scala.Double
  var lineSpacing: scala.Double
  var rightMargin: scala.Double
  var rotation: scala.Boolean
  var size: scala.Double
  var target: java.lang.String
  var url: java.lang.String
}

object FlashTextAttrs {
  @scala.inline
  def apply(
    accName: java.lang.String,
    aliasText: scala.Boolean,
    alignment: java.lang.String,
    antiAliasSharpness: scala.Double,
    antiAliasThickness: scala.Double,
    autoExpand: scala.Boolean,
    autoKern: scala.Boolean,
    bold: scala.Boolean,
    border: scala.Boolean,
    characterPosition: java.lang.String,
    characterSpacing: scala.Double,
    description: java.lang.String,
    embeddedCharacters: java.lang.String,
    face: java.lang.String,
    fillColor: js.Any,
    getTextAttr: js.Function0[js.Any],
    getTextString: js.Function0[js.Any],
    indent: scala.Double,
    italic: scala.Boolean,
    leftMargin: scala.Double,
    letterSpacing: scala.Double,
    lineSpacing: scala.Double,
    rightMargin: scala.Double,
    rotation: scala.Boolean,
    setTextAttr: js.Function0[js.Any],
    setTextString: js.Function0[js.Any],
    size: scala.Double,
    target: java.lang.String,
    url: java.lang.String
  ): FlashTextAttrs = {
    val __obj = js.Dynamic.literal(accName = accName, aliasText = aliasText, alignment = alignment, antiAliasSharpness = antiAliasSharpness, antiAliasThickness = antiAliasThickness, autoExpand = autoExpand, autoKern = autoKern, bold = bold, border = border, characterPosition = characterPosition, characterSpacing = characterSpacing, description = description, embeddedCharacters = embeddedCharacters, face = face, fillColor = fillColor, getTextAttr = getTextAttr, getTextString = getTextString, indent = indent, italic = italic, leftMargin = leftMargin, letterSpacing = letterSpacing, lineSpacing = lineSpacing, rightMargin = rightMargin, rotation = rotation, setTextAttr = setTextAttr, setTextString = setTextString, size = size, target = target, url = url)
  
    __obj.asInstanceOf[FlashTextAttrs]
  }
}

