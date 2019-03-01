package typings
package jestDashInDashCaseLib.jestDashInDashCaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var only: js.UndefOr[scala.Boolean] = js.undefined
  var skip: js.UndefOr[scala.Boolean] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    name: java.lang.String = null,
    only: js.UndefOr[scala.Boolean] = js.undefined,
    skip: js.UndefOr[scala.Boolean] = js.undefined
  ): Config = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(only)) __obj.updateDynamic("only")(only)
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip)
    __obj.asInstanceOf[Config]
  }
}

