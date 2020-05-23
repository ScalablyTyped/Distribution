package typings.imperium.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends /* key */ StringDictionary[String] {
  var action: String
}

object Action {
  @scala.inline
  def apply(action: String, StringDictionary: /* name */ StringDictionary[String] = null): Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Action]
  }
}

