package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parameters for web detection request.
  */
@js.native
trait SchemaGoogleCloudVisionV1p2beta1WebDetectionParams extends js.Object {
  /**
    * Whether to include results derived from the geo information in the image.
    */
  var includeGeoResults: js.UndefOr[Boolean] = js.native
}

object SchemaGoogleCloudVisionV1p2beta1WebDetectionParams {
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p2beta1WebDetectionParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p2beta1WebDetectionParams]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p2beta1WebDetectionParamsOps[Self <: SchemaGoogleCloudVisionV1p2beta1WebDetectionParams] (val x: Self) extends AnyVal {
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
    def setIncludeGeoResults(value: Boolean): Self = this.set("includeGeoResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeGeoResults: Self = this.set("includeGeoResults", js.undefined)
  }
  
}

