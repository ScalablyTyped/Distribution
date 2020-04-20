package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistanceMatrixResponseRow extends js.Object {
  var elements: js.Array[DistanceMatrixResponseElement]
}

object DistanceMatrixResponseRow {
  @scala.inline
  def apply(elements: js.Array[DistanceMatrixResponseElement]): DistanceMatrixResponseRow = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistanceMatrixResponseRow]
  }
}

