package typings
package gulpDashProtractorLib.gulpDashProtractorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  var args: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var configFile: js.UndefOr[java.lang.String] = js.undefined
  var debug: js.UndefOr[scala.Boolean] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    args: js.Array[java.lang.String] = null,
    configFile: java.lang.String = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args)
    if (configFile != null) __obj.updateDynamic("configFile")(configFile)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    __obj.asInstanceOf[IOptions]
  }
}

