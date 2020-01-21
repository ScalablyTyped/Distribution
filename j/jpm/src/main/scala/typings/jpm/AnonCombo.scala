package typings.jpm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCombo extends js.Object {
  var combo: String
  def onPress(): Unit
}

object AnonCombo {
  @scala.inline
  def apply(combo: String, onPress: () => Unit): AnonCombo = {
    val __obj = js.Dynamic.literal(combo = combo.asInstanceOf[js.Any], onPress = js.Any.fromFunction0(onPress))
  
    __obj.asInstanceOf[AnonCombo]
  }
}

