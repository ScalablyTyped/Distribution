package typings.heremaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Label extends js.Object {
  var label: String = js.native
  var linkId: String = js.native
  var mappedPosition: Latitude = js.native
  var mappedRoadName: String = js.native
  var originalPosition: Latitude = js.native
  var shapeIndex: Double = js.native
  var sideOfStreet: String = js.native
  var spot: Double = js.native
  var `type`: String = js.native
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
  @scala.inline
  implicit class LabelOps[Self <: Label] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinkId(value: String): Self = this.set("linkId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMappedPosition(value: Latitude): Self = this.set("mappedPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setMappedRoadName(value: String): Self = this.set("mappedRoadName", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalPosition(value: Latitude): Self = this.set("originalPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setShapeIndex(value: Double): Self = this.set("shapeIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setSideOfStreet(value: String): Self = this.set("sideOfStreet", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpot(value: Double): Self = this.set("spot", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

