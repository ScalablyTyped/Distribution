package typings.johnnyFive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAbbr extends js.Object {
  var abbr: String
  var heading: Double
  var high: Double
  var low: Double
  var name: String
}

object AnonAbbr {
  @scala.inline
  def apply(abbr: String, heading: Double, high: Double, low: Double, name: String): AnonAbbr = {
    val __obj = js.Dynamic.literal(abbr = abbr.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAbbr]
  }
}

