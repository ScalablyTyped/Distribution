package typings.gulpLess.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  var modifyVars: js.UndefOr[js.Object] = js.undefined
  var paths: js.UndefOr[js.Array[String]] = js.undefined
  var plugins: js.UndefOr[js.Array[_]] = js.undefined
  var relativeUrls: js.UndefOr[Boolean] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    modifyVars: js.Object = null,
    paths: js.Array[String] = null,
    plugins: js.Array[_] = null,
    relativeUrls: js.UndefOr[Boolean] = js.undefined
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (modifyVars != null) __obj.updateDynamic("modifyVars")(modifyVars.asInstanceOf[js.Any])
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (!js.isUndefined(relativeUrls)) __obj.updateDynamic("relativeUrls")(relativeUrls.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

