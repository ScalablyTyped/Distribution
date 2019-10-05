package typings.googlemaps.google.maps.places

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaceSearchPagination extends js.Object {
  var hasNextPage: Boolean
  def nextPage(): Unit
}

object PlaceSearchPagination {
  @scala.inline
  def apply(hasNextPage: Boolean, nextPage: () => Unit): PlaceSearchPagination = {
    val __obj = js.Dynamic.literal(hasNextPage = hasNextPage, nextPage = js.Any.fromFunction0(nextPage))
  
    __obj.asInstanceOf[PlaceSearchPagination]
  }
}

