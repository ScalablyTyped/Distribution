package typings.gulpCoffeeify.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Debug extends js.Object {
  var debug: js.UndefOr[Boolean] = js.undefined
  var paths: js.UndefOr[js.Array[String]] = js.undefined
}

object Debug {
  @scala.inline
  def apply(debug: js.UndefOr[Boolean] = js.undefined, paths: js.Array[String] = null): Debug = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[Debug]
  }
}

