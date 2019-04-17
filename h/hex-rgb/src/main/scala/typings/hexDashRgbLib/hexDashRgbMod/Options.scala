package typings
package hexDashRgbLib.hexDashRgbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  val format: js.UndefOr[hexDashRgbLib.hexDashRgbLibStrings.array] = js.undefined
}

object Options {
  @scala.inline
  def apply(format: hexDashRgbLib.hexDashRgbLibStrings.array = null): Options = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    __obj.asInstanceOf[Options]
  }
}

