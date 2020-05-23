package typings.jpm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Combo extends js.Object {
  var combo: String
  def onPress(): Unit
}

object Combo {
  @scala.inline
  def apply(combo: String, onPress: () => Unit): Combo = {
    val __obj = js.Dynamic.literal(combo = combo.asInstanceOf[js.Any], onPress = js.Any.fromFunction0(onPress))
    __obj.asInstanceOf[Combo]
  }
}

