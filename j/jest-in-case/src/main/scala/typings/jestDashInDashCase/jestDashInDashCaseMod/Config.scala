package typings.jestDashInDashCase.jestDashInDashCaseMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config
  extends /* key */ StringDictionary[js.Any] {
  var name: js.UndefOr[String] = js.undefined
  var only: js.UndefOr[Boolean] = js.undefined
  var skip: js.UndefOr[Boolean] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    name: String = null,
    only: js.UndefOr[Boolean] = js.undefined,
    skip: js.UndefOr[Boolean] = js.undefined
  ): Config = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(only)) __obj.updateDynamic("only")(only)
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip)
    __obj.asInstanceOf[Config]
  }
}

