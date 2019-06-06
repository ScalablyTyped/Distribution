package typings
package intlDashMessageformatDashParserLib.intlDashMessageformatDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationDetails extends js.Object {
  var column: scala.Double
  var line: scala.Double
  var offset: scala.Double
}

object LocationDetails {
  @scala.inline
  def apply(column: scala.Double, line: scala.Double, offset: scala.Double): LocationDetails = {
    val __obj = js.Dynamic.literal(column = column, line = line, offset = offset)
  
    __obj.asInstanceOf[LocationDetails]
  }
}

