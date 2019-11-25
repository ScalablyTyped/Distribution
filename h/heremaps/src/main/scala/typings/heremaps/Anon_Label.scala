package typings.heremaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Label extends js.Object {
  var label: String
  var linkId: String
  var mappedPosition: Anon_Latitude
  var mappedRoadName: String
  var originalPosition: Anon_Latitude
  var shapeIndex: Double
  var sideOfStreet: String
  var spot: Double
  var `type`: String
}

object Anon_Label {
  @scala.inline
  def apply(
    label: String,
    linkId: String,
    mappedPosition: Anon_Latitude,
    mappedRoadName: String,
    originalPosition: Anon_Latitude,
    shapeIndex: Double,
    sideOfStreet: String,
    spot: Double,
    `type`: String
  ): Anon_Label = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], linkId = linkId.asInstanceOf[js.Any], mappedPosition = mappedPosition.asInstanceOf[js.Any], mappedRoadName = mappedRoadName.asInstanceOf[js.Any], originalPosition = originalPosition.asInstanceOf[js.Any], shapeIndex = shapeIndex.asInstanceOf[js.Any], sideOfStreet = sideOfStreet.asInstanceOf[js.Any], spot = spot.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Label]
  }
}

