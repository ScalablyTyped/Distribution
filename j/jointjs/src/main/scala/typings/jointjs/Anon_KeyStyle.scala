package typings.jointjs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyStyle
  extends /* key */ StringDictionary[js.Any] {
  var style: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object Anon_KeyStyle {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    style: StringDictionary[js.Any] = null,
    text: String = null
  ): Anon_KeyStyle = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (style != null) __obj.updateDynamic("style")(style)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Anon_KeyStyle]
  }
}

