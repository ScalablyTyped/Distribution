package typings
package jointjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Deep
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var deep: js.UndefOr[scala.Boolean] = js.undefined
  var parentRelative: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Deep {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    deep: js.UndefOr[scala.Boolean] = js.undefined,
    parentRelative: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Deep = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(deep)) __obj.updateDynamic("deep")(deep)
    if (!js.isUndefined(parentRelative)) __obj.updateDynamic("parentRelative")(parentRelative)
    __obj.asInstanceOf[Anon_Deep]
  }
}

