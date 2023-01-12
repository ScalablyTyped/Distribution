package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudAssetV1GcsDestination extends StObject {
  
  /**
    * Required. The uri of the Cloud Storage object. It's the same uri that is used by gsutil. Example: "gs://bucket_name/object_name". See [Viewing and Editing Object
    * Metadata](https://cloud.google.com/storage/docs/viewing-editing-metadata) for more information. If the specified Cloud Storage object already exists and there is no
    * [hold](https://cloud.google.com/storage/docs/object-holds), it will be overwritten with the analysis result.
    */
  var uri: js.UndefOr[String] = js.undefined
}
object GoogleCloudAssetV1GcsDestination {
  
  inline def apply(): GoogleCloudAssetV1GcsDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudAssetV1GcsDestination]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudAssetV1GcsDestination] (val x: Self) extends AnyVal {
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
