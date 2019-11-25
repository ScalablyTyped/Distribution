package typings.intlDashMessageformat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Full extends js.Object {
  var full: Anon_DayMonth
  var long: Anon_Day
  var medium: Anon_Day
  var short: Anon_Day
}

object Anon_Full {
  @scala.inline
  def apply(full: Anon_DayMonth, long: Anon_Day, medium: Anon_Day, short: Anon_Day): Anon_Full = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Full]
  }
}

