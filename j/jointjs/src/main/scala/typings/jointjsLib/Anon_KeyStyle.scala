package typings
package jointjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyStyle
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var style: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_KeyStyle {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    style: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    text: java.lang.String = null
  ): Anon_KeyStyle = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (style != null) __obj.updateDynamic("style")(style)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Anon_KeyStyle]
  }
}

