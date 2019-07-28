package typings.jointjs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key
  extends /* key */ StringDictionary[js.Any] {
  var parentRelative: js.UndefOr[Boolean] = js.undefined
}

object Anon_Key {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    parentRelative: js.UndefOr[Boolean] = js.undefined
  ): Anon_Key = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(parentRelative)) __obj.updateDynamic("parentRelative")(parentRelative)
    __obj.asInstanceOf[Anon_Key]
  }
}

