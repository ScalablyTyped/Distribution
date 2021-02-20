package typings.googleapis.datastoreV1beta1Mod.datastoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata for Index operations.
  */
@js.native
trait SchemaGoogleDatastoreAdminV1IndexOperationMetadata extends StObject {
  
  /**
    * Metadata common to all Datastore Admin operations.
    */
  var common: js.UndefOr[SchemaGoogleDatastoreAdminV1CommonMetadata] = js.native
  
  /**
    * The index resource ID that this operation is acting on.
    */
  var indexId: js.UndefOr[String] = js.native
  
  /**
    * An estimate of the number of entities processed.
    */
  var progressEntities: js.UndefOr[SchemaGoogleDatastoreAdminV1Progress] = js.native
}
object SchemaGoogleDatastoreAdminV1IndexOperationMetadata {
  
  @scala.inline
  def apply(): SchemaGoogleDatastoreAdminV1IndexOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDatastoreAdminV1IndexOperationMetadata]
  }
  
  @scala.inline
  implicit class SchemaGoogleDatastoreAdminV1IndexOperationMetadataMutableBuilder[Self <: SchemaGoogleDatastoreAdminV1IndexOperationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommon(value: SchemaGoogleDatastoreAdminV1CommonMetadata): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommonUndefined: Self = StObject.set(x, "common", js.undefined)
    
    @scala.inline
    def setIndexId(value: String): Self = StObject.set(x, "indexId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexIdUndefined: Self = StObject.set(x, "indexId", js.undefined)
    
    @scala.inline
    def setProgressEntities(value: SchemaGoogleDatastoreAdminV1Progress): Self = StObject.set(x, "progressEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressEntitiesUndefined: Self = StObject.set(x, "progressEntities", js.undefined)
  }
}
