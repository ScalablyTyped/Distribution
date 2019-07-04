package typings
package intlDashMessageformatLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var formatters: js.UndefOr[intlDashMessageformatLib.libCompilerMod.Formatters] = js.undefined
}

object Options {
  @scala.inline
  def apply(formatters: intlDashMessageformatLib.libCompilerMod.Formatters = null): Options = {
    val __obj = js.Dynamic.literal()
    if (formatters != null) __obj.updateDynamic("formatters")(formatters)
    __obj.asInstanceOf[Options]
  }
}

