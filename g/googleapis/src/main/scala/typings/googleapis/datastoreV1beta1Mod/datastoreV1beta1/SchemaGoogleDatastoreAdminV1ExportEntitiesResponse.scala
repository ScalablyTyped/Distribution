package typings.googleapis.datastoreV1beta1Mod.datastoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleDatastoreAdminV1ExportEntitiesResponse extends StObject {
  
  /**
    * Location of the output metadata file. This can be used to begin an import into Cloud Datastore (this project or another project). See google.datastore.admin.v1.ImportEntitiesRequest.input_url. Only present if the operation completed successfully.
    */
  var outputUrl: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleDatastoreAdminV1ExportEntitiesResponse {
  
  inline def apply(): SchemaGoogleDatastoreAdminV1ExportEntitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDatastoreAdminV1ExportEntitiesResponse]
  }
  
  extension [Self <: SchemaGoogleDatastoreAdminV1ExportEntitiesResponse](x: Self) {
    
    inline def setOutputUrl(value: String): Self = StObject.set(x, "outputUrl", value.asInstanceOf[js.Any])
    
    inline def setOutputUrlNull: Self = StObject.set(x, "outputUrl", null)
    
    inline def setOutputUrlUndefined: Self = StObject.set(x, "outputUrl", js.undefined)
  }
}
