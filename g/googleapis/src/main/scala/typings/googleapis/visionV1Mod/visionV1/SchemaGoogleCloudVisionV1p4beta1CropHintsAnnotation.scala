package typings.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Set of crop hints that are used to generate new crops when serving images.
  */
@js.native
trait SchemaGoogleCloudVisionV1p4beta1CropHintsAnnotation extends js.Object {
  /**
    * Crop hint results.
    */
  var cropHints: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p4beta1CropHint]] = js.native
}

object SchemaGoogleCloudVisionV1p4beta1CropHintsAnnotation {
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p4beta1CropHintsAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p4beta1CropHintsAnnotation]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p4beta1CropHintsAnnotationOps[Self <: SchemaGoogleCloudVisionV1p4beta1CropHintsAnnotation] (val x: Self) extends AnyVal {
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
    def setCropHintsVarargs(value: SchemaGoogleCloudVisionV1p4beta1CropHint*): Self = this.set("cropHints", js.Array(value :_*))
    @scala.inline
    def setCropHints(value: js.Array[SchemaGoogleCloudVisionV1p4beta1CropHint]): Self = this.set("cropHints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCropHints: Self = this.set("cropHints", js.undefined)
  }
  
}

