package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudAssetV1GcsDestination extends js.Object {
  
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
  implicit class GoogleCloudAssetV1GcsDestinationOps[Self <: GoogleCloudAssetV1GcsDestination] (val x: Self) extends AnyVal {
    
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
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
}
