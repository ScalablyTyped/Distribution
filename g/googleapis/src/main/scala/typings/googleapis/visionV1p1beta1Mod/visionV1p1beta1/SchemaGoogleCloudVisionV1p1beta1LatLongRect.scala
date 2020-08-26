package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Rectangle determined by min and max `LatLng` pairs.
  */
@js.native
trait SchemaGoogleCloudVisionV1p1beta1LatLongRect extends js.Object {
  /**
    * Max lat/long pair.
    */
  var maxLatLng: js.UndefOr[SchemaLatLng] = js.native
  /**
    * Min lat/long pair.
    */
  var minLatLng: js.UndefOr[SchemaLatLng] = js.native
}

object SchemaGoogleCloudVisionV1p1beta1LatLongRect {
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p1beta1LatLongRect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1LatLongRect]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p1beta1LatLongRectOps[Self <: SchemaGoogleCloudVisionV1p1beta1LatLongRect] (val x: Self) extends AnyVal {
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
    def setMaxLatLng(value: SchemaLatLng): Self = this.set("maxLatLng", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLatLng: Self = this.set("maxLatLng", js.undefined)
    @scala.inline
    def setMinLatLng(value: SchemaLatLng): Self = this.set("minLatLng", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinLatLng: Self = this.set("minLatLng", js.undefined)
  }
  
}

