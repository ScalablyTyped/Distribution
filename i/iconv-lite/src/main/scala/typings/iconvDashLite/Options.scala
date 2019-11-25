package typings.iconvDashLite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var addBOM: js.UndefOr[Boolean] = js.undefined
  var defaultEncoding: js.UndefOr[String] = js.undefined
  var stripBOM: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    addBOM: js.UndefOr[Boolean] = js.undefined,
    defaultEncoding: String = null,
    stripBOM: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addBOM)) __obj.updateDynamic("addBOM")(addBOM.asInstanceOf[js.Any])
    if (defaultEncoding != null) __obj.updateDynamic("defaultEncoding")(defaultEncoding.asInstanceOf[js.Any])
    if (!js.isUndefined(stripBOM)) __obj.updateDynamic("stripBOM")(stripBOM.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

