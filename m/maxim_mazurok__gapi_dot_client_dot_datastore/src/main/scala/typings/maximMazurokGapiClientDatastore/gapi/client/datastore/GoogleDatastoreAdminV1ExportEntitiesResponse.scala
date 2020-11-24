package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleDatastoreAdminV1ExportEntitiesResponse extends js.Object {
  
  /**
    * Location of the output metadata file. This can be used to begin an import into Cloud Datastore (this project or another project). See
    * google.datastore.admin.v1.ImportEntitiesRequest.input_url. Only present if the operation completed successfully.
    */
  var outputUrl: js.UndefOr[String] = js.native
}
object GoogleDatastoreAdminV1ExportEntitiesResponse {
  
  @scala.inline
  def apply(): GoogleDatastoreAdminV1ExportEntitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDatastoreAdminV1ExportEntitiesResponse]
  }
  
  @scala.inline
  implicit class GoogleDatastoreAdminV1ExportEntitiesResponseOps[Self <: GoogleDatastoreAdminV1ExportEntitiesResponse] (val x: Self) extends AnyVal {
    
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
    def setOutputUrl(value: String): Self = this.set("outputUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputUrl: Self = this.set("outputUrl", js.undefined)
  }
}
