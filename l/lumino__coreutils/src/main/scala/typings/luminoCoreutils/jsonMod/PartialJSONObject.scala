package typings.luminoCoreutils.jsonMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartialJSONObject
  extends /* key */ StringDictionary[js.UndefOr[PartialJSONValue]]
     with _PartialJSONValue

object PartialJSONObject {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[js.UndefOr[PartialJSONValue]] = null): PartialJSONObject = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[PartialJSONObject]
  }
}

