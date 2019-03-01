package typings
package hexoDashLogLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Debug extends js.Object {
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var silent: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Debug {
  @scala.inline
  def apply(
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    silent: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Debug = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    __obj.asInstanceOf[Anon_Debug]
  }
}

