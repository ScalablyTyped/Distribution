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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("linkId")(linkId)
    __obj.updateDynamic("mappedPosition")(mappedPosition)
    __obj.updateDynamic("mappedRoadName")(mappedRoadName)
    __obj.updateDynamic("originalPosition")(originalPosition)
    __obj.updateDynamic("shapeIndex")(shapeIndex)
    __obj.updateDynamic("sideOfStreet")(sideOfStreet)
    __obj.updateDynamic("spot")(spot)
    __obj.asInstanceOf[Anon_Label]
  }
}

