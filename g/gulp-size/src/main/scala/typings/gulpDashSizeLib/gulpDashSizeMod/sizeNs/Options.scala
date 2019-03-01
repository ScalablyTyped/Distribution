package typings
package gulpDashSizeLib.gulpDashSizeMod.sizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var gzip: js.UndefOr[scala.Boolean] = js.undefined
  var pretty: js.UndefOr[scala.Boolean] = js.undefined
  var showFiles: js.UndefOr[scala.Boolean] = js.undefined
  var showTotal: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    gzip: js.UndefOr[scala.Boolean] = js.undefined,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    showFiles: js.UndefOr[scala.Boolean] = js.undefined,
    showTotal: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(gzip)) __obj.updateDynamic("gzip")(gzip)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (!js.isUndefined(showFiles)) __obj.updateDynamic("showFiles")(showFiles)
    if (!js.isUndefined(showTotal)) __obj.updateDynamic("showTotal")(showTotal)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Options]
  }
}

