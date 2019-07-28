package typings.googlemaps.googleNs.mapsNs

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
    val __obj = js.Dynamic.literal(destinationAddresses = destinationAddresses, originAddresses = originAddresses, rows = rows)
  
    __obj.asInstanceOf[DistanceMatrixResponse]
  }
}

