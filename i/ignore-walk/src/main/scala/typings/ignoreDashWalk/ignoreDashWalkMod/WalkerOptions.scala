package typings.ignoreDashWalk.ignoreDashWalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WalkerOptions extends js.Object {
  var follow: js.UndefOr[Boolean] = js.undefined
  var ignoreFiles: js.UndefOr[js.Array[String]] = js.undefined
  var includeEmpty: js.UndefOr[Boolean] = js.undefined
  var parent: js.UndefOr[Walker | WalkerSync | Null] = js.undefined
  var path: js.UndefOr[String] = js.undefined
}

object WalkerOptions {
  @scala.inline
  def apply(
    follow: js.UndefOr[Boolean] = js.undefined,
    ignoreFiles: js.Array[String] = null,
    includeEmpty: js.UndefOr[Boolean] = js.undefined,
    parent: Walker | WalkerSync = null,
    path: String = null
  ): WalkerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(follow)) __obj.updateDynamic("follow")(follow.asInstanceOf[js.Any])
    if (ignoreFiles != null) __obj.updateDynamic("ignoreFiles")(ignoreFiles.asInstanceOf[js.Any])
    if (!js.isUndefined(includeEmpty)) __obj.updateDynamic("includeEmpty")(includeEmpty.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalkerOptions]
  }
}

