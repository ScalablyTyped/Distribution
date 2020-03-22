package typings.luminoCoreutils.jsonMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadonlyJSONObject
  extends /* key */ StringDictionary[ReadonlyJSONValue]
     with _ReadonlyJSONValue

object ReadonlyJSONObject {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[ReadonlyJSONValue] = null): ReadonlyJSONObject = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ReadonlyJSONObject]
  }
}

