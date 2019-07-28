package typings.log4js.log4jsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomLayout
  extends /* key */ StringDictionary[js.Any]
     with Layout {
  var `type`: String
}

object CustomLayout {
  @scala.inline
  def apply(`type`: String, StringDictionary: /* key */ StringDictionary[js.Any] = null): CustomLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[CustomLayout]
  }
}

