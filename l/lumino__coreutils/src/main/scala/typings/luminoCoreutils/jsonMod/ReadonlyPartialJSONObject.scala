package typings.luminoCoreutils.jsonMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadonlyPartialJSONObject
  extends /* key */ StringDictionary[js.UndefOr[ReadonlyPartialJSONValue]]
     with _ReadonlyPartialJSONValue

object ReadonlyPartialJSONObject {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[js.UndefOr[ReadonlyPartialJSONValue]] = null): ReadonlyPartialJSONObject = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ReadonlyPartialJSONObject]
  }
}

