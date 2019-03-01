package typings
package gulpDashHtmlDashReplaceLib.gulpDashHtmlDashReplaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var keepBlockTags: js.UndefOr[scala.Boolean] = js.undefined
  var keepUnassigned: js.UndefOr[scala.Boolean] = js.undefined
  var resolvePaths: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    keepBlockTags: js.UndefOr[scala.Boolean] = js.undefined,
    keepUnassigned: js.UndefOr[scala.Boolean] = js.undefined,
    resolvePaths: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(keepBlockTags)) __obj.updateDynamic("keepBlockTags")(keepBlockTags)
    if (!js.isUndefined(keepUnassigned)) __obj.updateDynamic("keepUnassigned")(keepUnassigned)
    if (!js.isUndefined(resolvePaths)) __obj.updateDynamic("resolvePaths")(resolvePaths)
    __obj.asInstanceOf[Options]
  }
}

