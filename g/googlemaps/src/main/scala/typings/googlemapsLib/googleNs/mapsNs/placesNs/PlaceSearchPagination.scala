package typings
package googlemapsLib.googleNs.mapsNs.placesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaceSearchPagination extends js.Object {
  var hasNextPage: scala.Boolean
  def nextPage(): scala.Unit
}

object PlaceSearchPagination {
  @scala.inline
  def apply(hasNextPage: scala.Boolean, nextPage: js.Function0[scala.Unit]): PlaceSearchPagination = {
    val __obj = js.Dynamic.literal(hasNextPage = hasNextPage, nextPage = nextPage)
  
    __obj.asInstanceOf[PlaceSearchPagination]
  }
}

