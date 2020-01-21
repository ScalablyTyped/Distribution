package typings.gulpCoffeeify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDebug extends js.Object {
  var debug: js.UndefOr[Boolean] = js.undefined
  var paths: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonDebug {
  @scala.inline
  def apply(debug: js.UndefOr[Boolean] = js.undefined, paths: js.Array[String] = null): AnonDebug = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDebug]
  }
}

