package typings
package heremapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Label extends js.Object {
  var label: java.lang.String
  var linkId: java.lang.String
  var mappedPosition: Anon_Latitude
  var mappedRoadName: java.lang.String
  var originalPosition: Anon_Latitude
  var shapeIndex: scala.Double
  var sideOfStreet: java.lang.String
  var spot: scala.Double
  var `type`: java.lang.String
}

object Anon_Label {
  @scala.inline
  def apply(
    label: java.lang.String,
    linkId: java.lang.String,
    mappedPosition: Anon_Latitude,
    mappedRoadName: java.lang.String,
    originalPosition: Anon_Latitude,
    shapeIndex: scala.Double,
    sideOfStreet: java.lang.String,
    spot: scala.Double,
    `type`: java.lang.String
  ): Anon_Label = {
    val __obj = js.Dynamic.literal(label = label, linkId = linkId, mappedPosition = mappedPosition, mappedRoadName = mappedRoadName, originalPosition = originalPosition, shapeIndex = shapeIndex, sideOfStreet = sideOfStreet, spot = spot)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Label]
  }
}

