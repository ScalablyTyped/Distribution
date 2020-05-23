package typings.intlMessageformat.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Full extends js.Object {
  var full: Month
  var long: Day
  var medium: Day
  var short: Day
}

object Full {
  @scala.inline
  def apply(full: Month, long: Day, medium: Day, short: Day): Full = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[Full]
  }
}

