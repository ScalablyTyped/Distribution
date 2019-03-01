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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accName")(accName)
    __obj.updateDynamic("aliasText")(aliasText)
    __obj.updateDynamic("alignment")(alignment)
    __obj.updateDynamic("antiAliasSharpness")(antiAliasSharpness)
    __obj.updateDynamic("antiAliasThickness")(antiAliasThickness)
    __obj.updateDynamic("autoExpand")(autoExpand)
    __obj.updateDynamic("autoKern")(autoKern)
    __obj.updateDynamic("bold")(bold)
    __obj.updateDynamic("border")(border)
    __obj.updateDynamic("characterPosition")(characterPosition)
    __obj.updateDynamic("characterSpacing")(characterSpacing)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("embeddedCharacters")(embeddedCharacters)
    __obj.updateDynamic("face")(face)
    __obj.updateDynamic("fillColor")(fillColor)
    __obj.updateDynamic("getTextAttr")(getTextAttr)
    __obj.updateDynamic("getTextString")(getTextString)
    __obj.updateDynamic("indent")(indent)
    __obj.updateDynamic("italic")(italic)
    __obj.updateDynamic("leftMargin")(leftMargin)
    __obj.updateDynamic("letterSpacing")(letterSpacing)
    __obj.updateDynamic("lineSpacing")(lineSpacing)
    __obj.updateDynamic("rightMargin")(rightMargin)
    __obj.updateDynamic("rotation")(rotation)
    __obj.updateDynamic("setTextAttr")(setTextAttr)
    __obj.updateDynamic("setTextString")(setTextString)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("target")(target)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[FlashTextAttrs]
  }
}

