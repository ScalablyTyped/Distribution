package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleDatastoreAdminV1beta1ImportEntitiesMetadata extends StObject {
  
  /** Metadata common to all Datastore Admin operations. */
  var common: js.UndefOr[GoogleDatastoreAdminV1beta1CommonMetadata] = js.undefined
  
  /** Description of which entities are being imported. */
  var entityFilter: js.UndefOr[GoogleDatastoreAdminV1beta1EntityFilter] = js.undefined
  
  /** The location of the import metadata file. This will be the same value as the google.datastore.admin.v1beta1.ExportEntitiesResponse.output_url field. */
  var inputUrl: js.UndefOr[String] = js.undefined
  
  /** An estimate of the number of bytes processed. */
  var progressBytes: js.UndefOr[GoogleDatastoreAdminV1beta1Progress] = js.undefined
  
  /** An estimate of the number of entities processed. */
  var progressEntities: js.UndefOr[GoogleDatastoreAdminV1beta1Progress] = js.undefined
}
object GoogleDatastoreAdminV1beta1ImportEntitiesMetadata {
  
  inline def apply(): GoogleDatastoreAdminV1beta1ImportEntitiesMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDatastoreAdminV1beta1ImportEntitiesMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleDatastoreAdminV1beta1ImportEntitiesMetadata] (val x: Self) extends AnyVal {
    
    inline def setCommon(value: GoogleDatastoreAdminV1beta1CommonMetadata): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    inline def setCommonUndefined: Self = StObject.set(x, "common", js.undefined)
    
    inline def setEntityFilter(value: GoogleDatastoreAdminV1beta1EntityFilter): Self = StObject.set(x, "entityFilter", value.asInstanceOf[js.Any])
    
    inline def setEntityFilterUndefined: Self = StObject.set(x, "entityFilter", js.undefined)
    
    inline def setInputUrl(value: String): Self = StObject.set(x, "inputUrl", value.asInstanceOf[js.Any])
    
    inline def setInputUrlUndefined: Self = StObject.set(x, "inputUrl", js.undefined)
    
    inline def setProgressBytes(value: GoogleDatastoreAdminV1beta1Progress): Self = StObject.set(x, "progressBytes", value.asInstanceOf[js.Any])
    
    inline def setProgressBytesUndefined: Self = StObject.set(x, "progressBytes", js.undefined)
    
    inline def setProgressEntities(value: GoogleDatastoreAdminV1beta1Progress): Self = StObject.set(x, "progressEntities", value.asInstanceOf[js.Any])
    
    inline def setProgressEntitiesUndefined: Self = StObject.set(x, "progressEntities", js.undefined)
  }
}
