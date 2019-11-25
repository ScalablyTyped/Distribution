package typings.jpm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Combo extends js.Object {
  var combo: String
  def onPress(): Unit
}

object Anon_Combo {
  @scala.inline
  def apply(combo: String, onPress: () => Unit): Anon_Combo = {
    val __obj = js.Dynamic.literal(combo = combo.asInstanceOf[js.Any], onPress = js.Any.fromFunction0(onPress))
  
    __obj.asInstanceOf[Anon_Combo]
  }
}

