package typings.gulpDashSourcemaps.gulpDashSourcemapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitOptions extends js.Object {
  var debug: js.UndefOr[Boolean] = js.undefined
  var loadMaps: js.UndefOr[Boolean] = js.undefined
}

object InitOptions {
  @scala.inline
  def apply(debug: js.UndefOr[Boolean] = js.undefined, loadMaps: js.UndefOr[Boolean] = js.undefined): InitOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (!js.isUndefined(loadMaps)) __obj.updateDynamic("loadMaps")(loadMaps)
    __obj.asInstanceOf[InitOptions]
  }
}

