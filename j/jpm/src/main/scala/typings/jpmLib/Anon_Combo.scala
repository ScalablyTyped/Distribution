package typings
package jpmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Combo extends js.Object {
  var combo: java.lang.String
  def onPress(): scala.Unit
}

object Anon_Combo {
  @scala.inline
  def apply(combo: java.lang.String, onPress: js.Function0[scala.Unit]): Anon_Combo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("combo")(combo)
    __obj.updateDynamic("onPress")(onPress)
    __obj.asInstanceOf[Anon_Combo]
  }
}

