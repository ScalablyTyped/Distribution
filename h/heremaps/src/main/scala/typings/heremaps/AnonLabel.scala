package typings.heremaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabel extends js.Object {
  var label: String
  var linkId: String
  var mappedPosition: AnonLatitude
  var mappedRoadName: String
  var originalPosition: AnonLatitude
  var shapeIndex: Double
  var sideOfStreet: String
  var spot: Double
  var `type`: String
}

object AnonLabel {
  @scala.inline
  def apply(
    label: String,
    linkId: String,
    mappedPosition: AnonLatitude,
    mappedRoadName: String,
    originalPosition: AnonLatitude,
    shapeIndex: Double,
    sideOfStreet: String,
    spot: Double,
    `type`: String
  ): AnonLabel = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], linkId = linkId.asInstanceOf[js.Any], mappedPosition = mappedPosition.asInstanceOf[js.Any], mappedRoadName = mappedRoadName.asInstanceOf[js.Any], originalPosition = originalPosition.asInstanceOf[js.Any], shapeIndex = shapeIndex.asInstanceOf[js.Any], sideOfStreet = sideOfStreet.asInstanceOf[js.Any], spot = spot.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLabel]
  }
}

