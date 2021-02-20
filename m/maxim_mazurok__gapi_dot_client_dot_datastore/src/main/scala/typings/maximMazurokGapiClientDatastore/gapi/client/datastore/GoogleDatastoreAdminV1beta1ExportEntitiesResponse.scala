package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleDatastoreAdminV1beta1ExportEntitiesResponse extends StObject {
  
  /**
    * Location of the output metadata file. This can be used to begin an import into Cloud Datastore (this project or another project). See
    * google.datastore.admin.v1beta1.ImportEntitiesRequest.input_url. Only present if the operation completed successfully.
    */
  var outputUrl: js.UndefOr[String] = js.native
}
object GoogleDatastoreAdminV1beta1ExportEntitiesResponse {
  
  @scala.inline
  def apply(): GoogleDatastoreAdminV1beta1ExportEntitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDatastoreAdminV1beta1ExportEntitiesResponse]
  }
  
  @scala.inline
  implicit class GoogleDatastoreAdminV1beta1ExportEntitiesResponseMutableBuilder[Self <: GoogleDatastoreAdminV1beta1ExportEntitiesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutputUrl(value: String): Self = StObject.set(x, "outputUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputUrlUndefined: Self = StObject.set(x, "outputUrl", js.undefined)
  }
}
