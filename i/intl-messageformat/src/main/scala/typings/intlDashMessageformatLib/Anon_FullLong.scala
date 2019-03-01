package typings
package intlDashMessageformatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FullLong extends js.Object {
  var full: intlDashMessageformatLib.intlDashMessageformatMod.TimeFormat
  var long: intlDashMessageformatLib.intlDashMessageformatMod.TimeFormat
  var medium: intlDashMessageformatLib.intlDashMessageformatMod.TimeFormat
  var short: intlDashMessageformatLib.intlDashMessageformatMod.TimeFormat
}

object Anon_FullLong {
  @scala.inline
  def apply(
    full: intlDashMessageformatLib.intlDashMessageformatMod.TimeFormat,
    long: intlDashMessageformatLib.intlDashMessageformatMod.TimeFormat,
    medium: intlDashMessageformatLib.intlDashMessageformatMod.TimeFormat,
    short: intlDashMessageformatLib.intlDashMessageformatMod.TimeFormat
  ): Anon_FullLong = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("full")(full)
    __obj.updateDynamic("long")(long)
    __obj.updateDynamic("medium")(medium)
    __obj.updateDynamic("short")(short)
    __obj.asInstanceOf[Anon_FullLong]
  }
}

