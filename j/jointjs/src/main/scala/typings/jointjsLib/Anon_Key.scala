package typings
package jointjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var parentRelative: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Key {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    parentRelative: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Key = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(parentRelative)) __obj.updateDynamic("parentRelative")(parentRelative)
    __obj.asInstanceOf[Anon_Key]
  }
}

