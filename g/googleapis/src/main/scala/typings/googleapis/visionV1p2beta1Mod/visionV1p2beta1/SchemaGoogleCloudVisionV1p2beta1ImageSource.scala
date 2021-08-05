package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * External image source (Google Cloud Storage or web URL image location).
  */
trait SchemaGoogleCloudVisionV1p2beta1ImageSource extends StObject {
  
  /**
    * **Use `image_uri` instead.**  The Google Cloud Storage  URI of the form
    * `gs://bucket_name/object_name`. Object versioning is not supported. See
    * [Google Cloud Storage Request
    * URIs](https://cloud.google.com/storage/docs/reference-uris) for more
    * info.
    */
  var gcsImageUri: js.UndefOr[String] = js.undefined
  
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
  var imageUri: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudVisionV1p2beta1ImageSource {
  
  inline def apply(): SchemaGoogleCloudVisionV1p2beta1ImageSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p2beta1ImageSource]
  }
  
  extension [Self <: SchemaGoogleCloudVisionV1p2beta1ImageSource](x: Self) {
    
    inline def setGcsImageUri(value: String): Self = StObject.set(x, "gcsImageUri", value.asInstanceOf[js.Any])
    
    inline def setGcsImageUriUndefined: Self = StObject.set(x, "gcsImageUri", js.undefined)
    
    inline def setImageUri(value: String): Self = StObject.set(x, "imageUri", value.asInstanceOf[js.Any])
    
    inline def setImageUriUndefined: Self = StObject.set(x, "imageUri", js.undefined)
  }
}
