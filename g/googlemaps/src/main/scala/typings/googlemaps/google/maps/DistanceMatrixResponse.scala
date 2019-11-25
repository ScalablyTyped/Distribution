package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistanceMatrixResponse extends js.Object {
  var destinationAddresses: js.Array[String]
  var originAddresses: js.Array[String]
  var rows: js.Array[DistanceMatrixResponseRow]
}

object DistanceMatrixResponse {
  @scala.inline
  def apply(
    destinationAddresses: js.Array[String],
    originAddresses: js.Array[String],
    rows: js.Array[DistanceMatrixResponseRow]
  ): DistanceMatrixResponse = {
    val __obj = js.Dynamic.literal(destinationAddresses = destinationAddresses.asInstanceOf[js.Any], originAddresses = originAddresses.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DistanceMatrixResponse]
  }
}

