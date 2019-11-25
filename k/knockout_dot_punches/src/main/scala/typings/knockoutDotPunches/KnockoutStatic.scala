package typings.knockoutDotPunches

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
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], punches = punches.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KnockoutStatic]
  }
}

