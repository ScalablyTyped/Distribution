package typings
package knockoutDotPunchesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutStatic extends js.Object {
  var filters: KnockoutPunchesFilters
  var punches: KnockoutPunchesStatic
}

object KnockoutStatic {
  @scala.inline
  def apply(filters: KnockoutPunchesFilters, punches: KnockoutPunchesStatic): KnockoutStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("filters")(filters)
    __obj.updateDynamic("punches")(punches)
    __obj.asInstanceOf[KnockoutStatic]
  }
}

