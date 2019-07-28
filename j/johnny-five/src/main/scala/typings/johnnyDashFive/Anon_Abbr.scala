package typings.johnnyDashFive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Abbr extends js.Object {
  var abbr: String
  var heading: Double
  var high: Double
  var low: Double
  var name: String
}

object Anon_Abbr {
  @scala.inline
  def apply(abbr: String, heading: Double, high: Double, low: Double, name: String): Anon_Abbr = {
    val __obj = js.Dynamic.literal(abbr = abbr, heading = heading, high = high, low = low, name = name)
  
    __obj.asInstanceOf[Anon_Abbr]
  }
}

