package typings.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * External image source (Google Cloud Storage or web URL image location).
  */
@js.native
trait SchemaImageSource extends js.Object {
  
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
object SchemaImageSource {
  
  @scala.inline
  def apply(): SchemaImageSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImageSource]
  }
  
  @scala.inline
  implicit class SchemaImageSourceOps[Self <: SchemaImageSource] (val x: Self) extends AnyVal {
    
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
    def setGcsImageUri(value: String): Self = this.set("gcsImageUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGcsImageUri: Self = this.set("gcsImageUri", js.undefined)
    
    @scala.inline
    def setImageUri(value: String): Self = this.set("imageUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageUri: Self = this.set("imageUri", js.undefined)
  }
}
