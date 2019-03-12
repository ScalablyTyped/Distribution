package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashText extends js.Object {
  var accName: java.lang.String
  var antiAliasSharpness: scala.Double
  var antiAliasThickness: scala.Double
  var autoExpand: scala.Boolean
  var border: scala.Boolean
  var description: java.lang.String
  var embeddedCharacters: java.lang.String
  def getTextAttr(): js.Any
  def getTextString(): js.Any
  def setTextAttr(): js.Any
  def setTextString(): js.Any
}

object FlashText {
  @scala.inline
  def apply(
    accName: java.lang.String,
    antiAliasSharpness: scala.Double,
    antiAliasThickness: scala.Double,
    autoExpand: scala.Boolean,
    border: scala.Boolean,
    description: java.lang.String,
    embeddedCharacters: java.lang.String,
    getTextAttr: () => js.Any,
    getTextString: () => js.Any,
    setTextAttr: () => js.Any,
    setTextString: () => js.Any
  ): FlashText = {
    val __obj = js.Dynamic.literal(accName = accName, antiAliasSharpness = antiAliasSharpness, antiAliasThickness = antiAliasThickness, autoExpand = autoExpand, border = border, description = description, embeddedCharacters = embeddedCharacters, getTextAttr = js.Any.fromFunction0(getTextAttr), getTextString = js.Any.fromFunction0(getTextString), setTextAttr = js.Any.fromFunction0(setTextAttr), setTextString = js.Any.fromFunction0(setTextString))
  
    __obj.asInstanceOf[FlashText]
  }
}

