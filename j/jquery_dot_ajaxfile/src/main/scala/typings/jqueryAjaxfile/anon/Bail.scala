package typings.jqueryAjaxfile.anon

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bail extends js.Object {
  var bail: js.UndefOr[Boolean] = js.undefined
  var grep: js.UndefOr[RegExp] = js.undefined
  var reporter: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var ui: js.UndefOr[String] = js.undefined
}

object Bail {
  @scala.inline
  def apply(
    bail: js.UndefOr[Boolean] = js.undefined,
    grep: RegExp = null,
    reporter: String = null,
    timeout: js.UndefOr[Double] = js.undefined,
    ui: String = null
  ): Bail = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bail)) __obj.updateDynamic("bail")(bail.get.asInstanceOf[js.Any])
    if (grep != null) __obj.updateDynamic("grep")(grep.asInstanceOf[js.Any])
    if (reporter != null) __obj.updateDynamic("reporter")(reporter.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (ui != null) __obj.updateDynamic("ui")(ui.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bail]
  }
}

