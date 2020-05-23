package typings.heremaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Label extends js.Object {
  var label: String
  var linkId: String
  var mappedPosition: Latitude
  var mappedRoadName: String
  var originalPosition: Latitude
  var shapeIndex: Double
  var sideOfStreet: String
  var spot: Double
  var `type`: String
}

object Label {
  @scala.inline
  def apply(
    label: String,
    linkId: String,
    mappedPosition: Latitude,
    mappedRoadName: String,
    originalPosition: Latitude,
    shapeIndex: Double,
    sideOfStreet: String,
    spot: Double,
    `type`: String
  ): Label = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], linkId = linkId.asInstanceOf[js.Any], mappedPosition = mappedPosition.asInstanceOf[js.Any], mappedRoadName = mappedRoadName.asInstanceOf[js.Any], originalPosition = originalPosition.asInstanceOf[js.Any], shapeIndex = shapeIndex.asInstanceOf[js.Any], sideOfStreet = sideOfStreet.asInstanceOf[js.Any], spot = spot.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
}

