package typings.gulpSize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var gzip: js.UndefOr[Boolean] = js.undefined
  var pretty: js.UndefOr[Boolean] = js.undefined
  var showFiles: js.UndefOr[Boolean] = js.undefined
  var showTotal: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    gzip: js.UndefOr[Boolean] = js.undefined,
    pretty: js.UndefOr[Boolean] = js.undefined,
    showFiles: js.UndefOr[Boolean] = js.undefined,
    showTotal: js.UndefOr[Boolean] = js.undefined,
    title: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(gzip)) __obj.updateDynamic("gzip")(gzip.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showFiles)) __obj.updateDynamic("showFiles")(showFiles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showTotal)) __obj.updateDynamic("showTotal")(showTotal.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

