package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Set of dominant colors and their corresponding scores.
  */
@js.native
trait SchemaGoogleCloudVisionV1p1beta1DominantColorsAnnotation extends js.Object {
  /**
    * RGB color values with their score and pixel fraction.
    */
  var colors: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p1beta1ColorInfo]] = js.native
}

object SchemaGoogleCloudVisionV1p1beta1DominantColorsAnnotation {
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p1beta1DominantColorsAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1DominantColorsAnnotation]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p1beta1DominantColorsAnnotationOps[Self <: SchemaGoogleCloudVisionV1p1beta1DominantColorsAnnotation] (val x: Self) extends AnyVal {
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
    def setColorsVarargs(value: SchemaGoogleCloudVisionV1p1beta1ColorInfo*): Self = this.set("colors", js.Array(value :_*))
    @scala.inline
    def setColors(value: js.Array[SchemaGoogleCloudVisionV1p1beta1ColorInfo]): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
  }
  
}

