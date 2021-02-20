package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleDatastoreAdminV1IndexOperationMetadata extends StObject {
  
  /** Metadata common to all Datastore Admin operations. */
  var common: js.UndefOr[GoogleDatastoreAdminV1CommonMetadata] = js.native
  
  /** The index resource ID that this operation is acting on. */
  var indexId: js.UndefOr[String] = js.native
  
  /** An estimate of the number of entities processed. */
  var progressEntities: js.UndefOr[GoogleDatastoreAdminV1Progress] = js.native
}
object GoogleDatastoreAdminV1IndexOperationMetadata {
  
  @scala.inline
  def apply(): GoogleDatastoreAdminV1IndexOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDatastoreAdminV1IndexOperationMetadata]
  }
  
  @scala.inline
  implicit class GoogleDatastoreAdminV1IndexOperationMetadataMutableBuilder[Self <: GoogleDatastoreAdminV1IndexOperationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommon(value: GoogleDatastoreAdminV1CommonMetadata): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommonUndefined: Self = StObject.set(x, "common", js.undefined)
    
    @scala.inline
    def setIndexId(value: String): Self = StObject.set(x, "indexId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexIdUndefined: Self = StObject.set(x, "indexId", js.undefined)
    
    @scala.inline
    def setProgressEntities(value: GoogleDatastoreAdminV1Progress): Self = StObject.set(x, "progressEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressEntitiesUndefined: Self = StObject.set(x, "progressEntities", js.undefined)
  }
}
