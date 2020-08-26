package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `ReferenceImage` represents a product image and its associated metadata,
  * such as bounding boxes.
  */
@js.native
trait SchemaGoogleCloudVisionV1p4beta1ReferenceImage extends js.Object {
  /**
    * Bounding polygons around the areas of interest in the reference image.
    * Optional. If this field is empty, the system will try to detect regions
    * of interest. At most 10 bounding polygons will be used.  The provided
    * shape is converted into a non-rotated rectangle. Once converted, the
    * small edge of the rectangle must be greater than or equal to 300 pixels.
    * The aspect ratio must be 1:4 or less (i.e. 1:3 is ok; 1:5 is not).
    */
  var boundingPolys: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p4beta1BoundingPoly]] = js.native
  /**
    * The resource name of the reference image.  Format is:
    * `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID/referenceImages/IMAGE_ID`.
    * This field is ignored when creating a reference image.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The Google Cloud Storage URI of the reference image.  The URI must start
    * with `gs://`.  Required.
    */
  var uri: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudVisionV1p4beta1ReferenceImage {
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p4beta1ReferenceImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p4beta1ReferenceImage]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p4beta1ReferenceImageOps[Self <: SchemaGoogleCloudVisionV1p4beta1ReferenceImage] (val x: Self) extends AnyVal {
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
    def setBoundingPolysVarargs(value: SchemaGoogleCloudVisionV1p4beta1BoundingPoly*): Self = this.set("boundingPolys", js.Array(value :_*))
    @scala.inline
    def setBoundingPolys(value: js.Array[SchemaGoogleCloudVisionV1p4beta1BoundingPoly]): Self = this.set("boundingPolys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoundingPolys: Self = this.set("boundingPolys", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
  
}

