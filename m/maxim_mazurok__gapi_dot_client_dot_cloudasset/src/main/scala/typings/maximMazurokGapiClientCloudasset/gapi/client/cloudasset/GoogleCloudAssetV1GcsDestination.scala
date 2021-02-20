package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudAssetV1GcsDestination extends StObject {
  
  /**
    * Required. The uri of the Cloud Storage object. It's the same uri that is used by gsutil. For example: "gs://bucket_name/object_name". See [Quickstart: Using the gsutil tool]
    * (https://cloud.google.com/storage/docs/quickstart-gsutil) for examples.
    */
  var uri: js.UndefOr[String] = js.native
}
object GoogleCloudAssetV1GcsDestination {
  
  @scala.inline
  def apply(): GoogleCloudAssetV1GcsDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudAssetV1GcsDestination]
  }
  
  @scala.inline
  implicit class GoogleCloudAssetV1GcsDestinationMutableBuilder[Self <: GoogleCloudAssetV1GcsDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
