package typings
package k6Lib.k6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONObject
  extends /* key */ org.scalablytyped.runtime.StringDictionary[JSONValue]
     with _JSONValue

object JSONObject {
  @scala.inline
  def apply(StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[JSONValue] = null): JSONObject = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[JSONObject]
  }
}

