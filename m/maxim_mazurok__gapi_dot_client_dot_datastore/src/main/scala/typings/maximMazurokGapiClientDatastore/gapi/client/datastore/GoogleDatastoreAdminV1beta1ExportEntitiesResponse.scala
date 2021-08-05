package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleDatastoreAdminV1beta1ExportEntitiesResponse extends StObject {
  
  /**
    * Location of the output metadata file. This can be used to begin an import into Cloud Datastore (this project or another project). See
    * google.datastore.admin.v1beta1.ImportEntitiesRequest.input_url. Only present if the operation completed successfully.
    */
  var outputUrl: js.UndefOr[String] = js.undefined
}
object GoogleDatastoreAdminV1beta1ExportEntitiesResponse {
  
  inline def apply(): GoogleDatastoreAdminV1beta1ExportEntitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDatastoreAdminV1beta1ExportEntitiesResponse]
  }
  
  extension [Self <: GoogleDatastoreAdminV1beta1ExportEntitiesResponse](x: Self) {
    
    inline def setOutputUrl(value: String): Self = StObject.set(x, "outputUrl", value.asInstanceOf[js.Any])
    
    inline def setOutputUrlUndefined: Self = StObject.set(x, "outputUrl", js.undefined)
  }
}
