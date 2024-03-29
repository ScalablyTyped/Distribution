package typings.googleapis.v1beta3Mod.datastoreV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleDatastoreAdminV1beta1ExportEntitiesResponse extends StObject {
  
  /**
    * Location of the output metadata file. This can be used to begin an import into Cloud Datastore (this project or another project). See google.datastore.admin.v1beta1.ImportEntitiesRequest.input_url. Only present if the operation completed successfully.
    */
  var outputUrl: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleDatastoreAdminV1beta1ExportEntitiesResponse {
  
  inline def apply(): SchemaGoogleDatastoreAdminV1beta1ExportEntitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDatastoreAdminV1beta1ExportEntitiesResponse]
  }
  
  extension [Self <: SchemaGoogleDatastoreAdminV1beta1ExportEntitiesResponse](x: Self) {
    
    inline def setOutputUrl(value: String): Self = StObject.set(x, "outputUrl", value.asInstanceOf[js.Any])
    
    inline def setOutputUrlNull: Self = StObject.set(x, "outputUrl", null)
    
    inline def setOutputUrlUndefined: Self = StObject.set(x, "outputUrl", js.undefined)
  }
}
