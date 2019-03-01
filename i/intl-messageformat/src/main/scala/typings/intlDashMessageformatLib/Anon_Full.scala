package typings
package intlDashMessageformatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Full extends js.Object {
  var full: intlDashMessageformatLib.intlDashMessageformatMod.DateFormat
  var long: intlDashMessageformatLib.intlDashMessageformatMod.DateFormat
  var medium: intlDashMessageformatLib.intlDashMessageformatMod.DateFormat
  var short: intlDashMessageformatLib.intlDashMessageformatMod.DateFormat
}

object Anon_Full {
  @scala.inline
  def apply(
    full: intlDashMessageformatLib.intlDashMessageformatMod.DateFormat,
    long: intlDashMessageformatLib.intlDashMessageformatMod.DateFormat,
    medium: intlDashMessageformatLib.intlDashMessageformatMod.DateFormat,
    short: intlDashMessageformatLib.intlDashMessageformatMod.DateFormat
  ): Anon_Full = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("full")(full)
    __obj.updateDynamic("long")(long)
    __obj.updateDynamic("medium")(medium)
    __obj.updateDynamic("short")(short)
    __obj.asInstanceOf[Anon_Full]
  }
}

