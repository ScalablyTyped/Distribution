package typings
package jqueryDotAjaxfileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bail extends js.Object {
  var bail: js.UndefOr[scala.Boolean] = js.undefined
  var grep: js.UndefOr[stdLib.RegExp] = js.undefined
  var reporter: js.UndefOr[java.lang.String] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var ui: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Bail {
  @scala.inline
  def apply(
    bail: js.UndefOr[scala.Boolean] = js.undefined,
    grep: stdLib.RegExp = null,
    reporter: java.lang.String = null,
    timeout: scala.Int | scala.Double = null,
    ui: java.lang.String = null
  ): Anon_Bail = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bail)) __obj.updateDynamic("bail")(bail)
    if (grep != null) __obj.updateDynamic("grep")(grep)
    if (reporter != null) __obj.updateDynamic("reporter")(reporter)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (ui != null) __obj.updateDynamic("ui")(ui)
    __obj.asInstanceOf[Anon_Bail]
  }
}

