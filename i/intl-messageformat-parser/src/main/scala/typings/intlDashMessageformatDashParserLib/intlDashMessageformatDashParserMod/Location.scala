package typings
package intlDashMessageformatDashParserLib.intlDashMessageformatDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  var end: LocationDetails
  var start: LocationDetails
}

object Location {
  @scala.inline
  def apply(end: LocationDetails, start: LocationDetails): Location = {
    val __obj = js.Dynamic.literal(end = end, start = start)
  
    __obj.asInstanceOf[Location]
  }
}

