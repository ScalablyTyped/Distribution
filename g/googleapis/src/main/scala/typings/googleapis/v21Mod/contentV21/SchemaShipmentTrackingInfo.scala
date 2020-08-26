package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaShipmentTrackingInfo extends js.Object {
  var carrier: js.UndefOr[String] = js.native
  var trackingNumber: js.UndefOr[String] = js.native
}

object SchemaShipmentTrackingInfo {
  @scala.inline
  def apply(): SchemaShipmentTrackingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShipmentTrackingInfo]
  }
  @scala.inline
  implicit class SchemaShipmentTrackingInfoOps[Self <: SchemaShipmentTrackingInfo] (val x: Self) extends AnyVal {
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
    def setCarrier(value: String): Self = this.set("carrier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCarrier: Self = this.set("carrier", js.undefined)
    @scala.inline
    def setTrackingNumber(value: String): Self = this.set("trackingNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackingNumber: Self = this.set("trackingNumber", js.undefined)
  }
  
}

