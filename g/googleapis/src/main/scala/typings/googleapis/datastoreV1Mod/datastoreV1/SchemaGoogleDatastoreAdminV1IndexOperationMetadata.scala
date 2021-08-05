package typings.googleapis.datastoreV1Mod.datastoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata for Index operations.
  */
trait SchemaGoogleDatastoreAdminV1IndexOperationMetadata extends StObject {
  
  /**
    * Metadata common to all Datastore Admin operations.
    */
  var common: js.UndefOr[SchemaGoogleDatastoreAdminV1CommonMetadata] = js.undefined
  
  /**
    * The index resource ID that this operation is acting on.
    */
  var indexId: js.UndefOr[String] = js.undefined
  
  /**
    * An estimate of the number of entities processed.
    */
  var progressEntities: js.UndefOr[SchemaGoogleDatastoreAdminV1Progress] = js.undefined
}
object SchemaGoogleDatastoreAdminV1IndexOperationMetadata {
  
  inline def apply(): SchemaGoogleDatastoreAdminV1IndexOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDatastoreAdminV1IndexOperationMetadata]
  }
  
  extension [Self <: SchemaGoogleDatastoreAdminV1IndexOperationMetadata](x: Self) {
    
    inline def setCommon(value: SchemaGoogleDatastoreAdminV1CommonMetadata): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    inline def setCommonUndefined: Self = StObject.set(x, "common", js.undefined)
    
    inline def setIndexId(value: String): Self = StObject.set(x, "indexId", value.asInstanceOf[js.Any])
    
    inline def setIndexIdUndefined: Self = StObject.set(x, "indexId", js.undefined)
    
    inline def setProgressEntities(value: SchemaGoogleDatastoreAdminV1Progress): Self = StObject.set(x, "progressEntities", value.asInstanceOf[js.Any])
    
    inline def setProgressEntitiesUndefined: Self = StObject.set(x, "progressEntities", js.undefined)
  }
}
