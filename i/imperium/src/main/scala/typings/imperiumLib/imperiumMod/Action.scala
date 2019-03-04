package typings
package imperiumLib.imperiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action
  extends /* key */ org.scalablytyped.runtime.StringDictionary[java.lang.String] {
  var action: java.lang.String
}

object Action {
  @scala.inline
  def apply(
    action: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): Action = {
    val __obj = js.Dynamic.literal(action = action)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Action]
  }
}

