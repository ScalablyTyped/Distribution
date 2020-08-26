package typings.k6.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONObject
  extends /* key */ StringDictionary[JSONValue]
     with _JSONValue

object JSONObject {
  @scala.inline
  def apply(): JSONObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONObject]
  }
}

