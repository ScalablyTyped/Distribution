package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `ReferenceImage` represents a product image and its associated metadata,
  * such as bounding boxes.
  */
@js.native
trait SchemaGoogleCloudVisionV1p3beta1ReferenceImage extends js.Object {
  /**
    * Bounding polygons around the areas of interest in the reference image.
    * Optional. If this field is empty, the system will try to detect regions
    * of interest. At most 10 bounding polygons will be used.  The provided
    * shape is converted into a non-rotated rectangle. Once converted, the
    * small edge of the rectangle must be greater than or equal to 300 pixels.
    * The aspect ratio must be 1:4 or less (i.e. 1:3 is ok; 1:5 is not).
    */
  var boundingPolys: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p3beta1BoundingPoly]] = js.native
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

object SchemaGoogleCloudVisionV1p3beta1ReferenceImage {
  @scala.inline
  def apply(
    boundingPolys: js.Array[SchemaGoogleCloudVisionV1p3beta1BoundingPoly] = null,
    name: String = null,
    uri: String = null
  ): SchemaGoogleCloudVisionV1p3beta1ReferenceImage = {
    val __obj = js.Dynamic.literal()
    if (boundingPolys != null) __obj.updateDynamic("boundingPolys")(boundingPolys.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p3beta1ReferenceImage]
  }
}

