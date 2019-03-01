package typings
package gulpDashLessLib.gulpDashLessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  var modifyVars: js.UndefOr[js.Object] = js.undefined
  var paths: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var plugins: js.UndefOr[js.Array[_]] = js.undefined
  var relativeUrls: js.UndefOr[scala.Boolean] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    modifyVars: js.Object = null,
    paths: js.Array[java.lang.String] = null,
    plugins: js.Array[_] = null,
    relativeUrls: js.UndefOr[scala.Boolean] = js.undefined
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (modifyVars != null) __obj.updateDynamic("modifyVars")(modifyVars)
    if (paths != null) __obj.updateDynamic("paths")(paths)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (!js.isUndefined(relativeUrls)) __obj.updateDynamic("relativeUrls")(relativeUrls)
    __obj.asInstanceOf[IOptions]
  }
}

