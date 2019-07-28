package typings.imperium.imperiumMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends /* key */ StringDictionary[String] {
  var action: String
}

object Action {
  @scala.inline
  def apply(action: String, StringDictionary: /* key */ StringDictionary[String] = null): Action = {
    val __obj = js.Dynamic.literal(action = action)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Action]
  }
}

