package typings.k6.k6Mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONObject
  extends /* key */ StringDictionary[JSONValue]
     with _JSONValue

object JSONObject {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[JSONValue] = null): JSONObject = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[JSONObject]
  }
}

