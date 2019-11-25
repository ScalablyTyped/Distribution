package typings.gulpDashHtmlDashReplace.gulpDashHtmlDashReplaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var keepBlockTags: js.UndefOr[Boolean] = js.undefined
  var keepUnassigned: js.UndefOr[Boolean] = js.undefined
  var resolvePaths: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    keepBlockTags: js.UndefOr[Boolean] = js.undefined,
    keepUnassigned: js.UndefOr[Boolean] = js.undefined,
    resolvePaths: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(keepBlockTags)) __obj.updateDynamic("keepBlockTags")(keepBlockTags.asInstanceOf[js.Any])
    if (!js.isUndefined(keepUnassigned)) __obj.updateDynamic("keepUnassigned")(keepUnassigned.asInstanceOf[js.Any])
    if (!js.isUndefined(resolvePaths)) __obj.updateDynamic("resolvePaths")(resolvePaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

