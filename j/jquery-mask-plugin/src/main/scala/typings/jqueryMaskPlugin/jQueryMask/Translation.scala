package typings.jqueryMaskPlugin.jQueryMask

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Translation
  extends /* key */ StringDictionary[js.UndefOr[Pattern | js.Object]] {
  var placeholder: js.UndefOr[String] = js.undefined
}

object Translation {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.UndefOr[Pattern | js.Object]] = null,
    placeholder: String = null
  ): Translation = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Translation]
  }
}

