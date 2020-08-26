package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Detected entity location information.
  */
@js.native
trait SchemaGoogleCloudVisionV1p1beta1LocationInfo extends js.Object {
  /**
    * lat/long location coordinates.
    */
  var latLng: js.UndefOr[SchemaLatLng] = js.native
}

object SchemaGoogleCloudVisionV1p1beta1LocationInfo {
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p1beta1LocationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1LocationInfo]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p1beta1LocationInfoOps[Self <: SchemaGoogleCloudVisionV1p1beta1LocationInfo] (val x: Self) extends AnyVal {
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
    def setLatLng(value: SchemaLatLng): Self = this.set("latLng", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatLng: Self = this.set("latLng", js.undefined)
  }
  
}

