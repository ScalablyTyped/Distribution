package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashText extends js.Object {
  var accName: String
  var antiAliasSharpness: Double
  var antiAliasThickness: Double
  var autoExpand: Boolean
  var border: Boolean
  var description: String
  var embeddedCharacters: String
  def getTextAttr(): js.Any
  def getTextString(): js.Any
  def setTextAttr(): js.Any
  def setTextString(): js.Any
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
}

