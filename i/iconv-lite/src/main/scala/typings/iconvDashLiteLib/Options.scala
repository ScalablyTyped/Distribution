package typings
package iconvDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var addBOM: js.UndefOr[scala.Boolean] = js.undefined
  var defaultEncoding: js.UndefOr[java.lang.String] = js.undefined
  var stripBOM: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    addBOM: js.UndefOr[scala.Boolean] = js.undefined,
    defaultEncoding: java.lang.String = null,
    stripBOM: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addBOM)) __obj.updateDynamic("addBOM")(addBOM)
    if (defaultEncoding != null) __obj.updateDynamic("defaultEncoding")(defaultEncoding)
    if (!js.isUndefined(stripBOM)) __obj.updateDynamic("stripBOM")(stripBOM)
    __obj.asInstanceOf[Options]
  }
}

