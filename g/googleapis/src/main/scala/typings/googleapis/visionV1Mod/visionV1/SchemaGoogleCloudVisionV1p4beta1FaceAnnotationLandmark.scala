package typings.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A face-specific landmark (for example, a face feature).
  */
@js.native
trait SchemaGoogleCloudVisionV1p4beta1FaceAnnotationLandmark extends js.Object {
  /**
    * Face landmark position.
    */
  var position: js.UndefOr[SchemaGoogleCloudVisionV1p4beta1Position] = js.native
  /**
    * Face landmark type.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudVisionV1p4beta1FaceAnnotationLandmark {
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p4beta1FaceAnnotationLandmark = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p4beta1FaceAnnotationLandmark]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p4beta1FaceAnnotationLandmarkOps[Self <: SchemaGoogleCloudVisionV1p4beta1FaceAnnotationLandmark] (val x: Self) extends AnyVal {
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
    def setPosition(value: SchemaGoogleCloudVisionV1p4beta1Position): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

