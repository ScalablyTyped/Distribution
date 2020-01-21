package typings.intlMessageformatParser.typesMod

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
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Location]
  }
}

