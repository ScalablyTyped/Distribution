package typings.gulpDashCoffeeify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Debug extends js.Object {
  var debug: js.UndefOr[Boolean] = js.undefined
  var paths: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_Debug {
  @scala.inline
  def apply(debug: js.UndefOr[Boolean] = js.undefined, paths: js.Array[String] = null): Anon_Debug = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Debug]
  }
}

