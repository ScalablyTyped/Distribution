package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * External image source (Google Cloud Storage or web URL image location).
  */
@js.native
trait SchemaGoogleCloudVisionV1p1beta1ImageSource extends js.Object {
  /**
    * **Use `image_uri` instead.**  The Google Cloud Storage  URI of the form
    * `gs://bucket_name/object_name`. Object versioning is not supported. See
    * [Google Cloud Storage Request
    * URIs](https://cloud.google.com/storage/docs/reference-uris) for more
    * info.
    */
  var gcsImageUri: js.UndefOr[String] = js.native
  /**
    * The URI of the source image. Can be either:  1. A Google Cloud Storage
    * URI of the form    `gs://bucket_name/object_name`. Object versioning is
    * not supported. See    [Google Cloud Storage Request
    * URIs](https://cloud.google.com/storage/docs/reference-uris) for more
    * info.  2. A publicly-accessible image HTTP/HTTPS URL. When fetching
    * images from    HTTP/HTTPS URLs, Google cannot guarantee that the request
    * will be    completed. Your request may fail if the specified host denies
    * the    request (e.g. due to request throttling or DOS prevention), or if
    * Google    throttles requests to the site for abuse prevention. You should
    * not    depend on externally-hosted images for production applications.
    * When both `gcs_image_uri` and `image_uri` are specified, `image_uri`
    * takes precedence.
    */
  var imageUri: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudVisionV1p1beta1ImageSource {
  @scala.inline
  def apply(gcsImageUri: String = null, imageUri: String = null): SchemaGoogleCloudVisionV1p1beta1ImageSource = {
    val __obj = js.Dynamic.literal()
    if (gcsImageUri != null) __obj.updateDynamic("gcsImageUri")(gcsImageUri.asInstanceOf[js.Any])
    if (imageUri != null) __obj.updateDynamic("imageUri")(imageUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1ImageSource]
  }
}

