package typings
package jqueryDashMaskDashPluginLib.jQueryMaskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Translation
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[Pattern | js.Object]] {
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
}

object Translation {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[Pattern | js.Object]] = null,
    placeholder: java.lang.String = null
  ): Translation = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    __obj.asInstanceOf[Translation]
  }
}

