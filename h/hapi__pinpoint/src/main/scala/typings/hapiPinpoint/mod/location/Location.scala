package typings.hapiPinpoint.mod.location

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  /**
    The fully qualified filename.
    */
  val filename: String
  /**
    The file line number.
    */
  val line: Double
}

object Location {
  @scala.inline
  def apply(filename: String, line: Double): Location = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
}

