package typings.googleapis.datastoreV1Mod.datastoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata for ImportEntities operations.
  */
trait SchemaGoogleDatastoreAdminV1ImportEntitiesMetadata extends StObject {
  
  /**
    * Metadata common to all Datastore Admin operations.
    */
  var common: js.UndefOr[SchemaGoogleDatastoreAdminV1CommonMetadata] = js.undefined
  
  /**
    * Description of which entities are being imported.
    */
  var entityFilter: js.UndefOr[SchemaGoogleDatastoreAdminV1EntityFilter] = js.undefined
  
  /**
    * The location of the import metadata file. This will be the same value as
    * the google.datastore.admin.v1.ExportEntitiesResponse.output_url field.
    */
  var inputUrl: js.UndefOr[String] = js.undefined
  
  /**
    * An estimate of the number of bytes processed.
    */
  var progressBytes: js.UndefOr[SchemaGoogleDatastoreAdminV1Progress] = js.undefined
  
  /**
    * An estimate of the number of entities processed.
    */
  var progressEntities: js.UndefOr[SchemaGoogleDatastoreAdminV1Progress] = js.undefined
}
object SchemaGoogleDatastoreAdminV1ImportEntitiesMetadata {
  
  @scala.inline
  def apply(): SchemaGoogleDatastoreAdminV1ImportEntitiesMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDatastoreAdminV1ImportEntitiesMetadata]
  }
  
  @scala.inline
  implicit class SchemaGoogleDatastoreAdminV1ImportEntitiesMetadataMutableBuilder[Self <: SchemaGoogleDatastoreAdminV1ImportEntitiesMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommon(value: SchemaGoogleDatastoreAdminV1CommonMetadata): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommonUndefined: Self = StObject.set(x, "common", js.undefined)
    
    @scala.inline
    def setEntityFilter(value: SchemaGoogleDatastoreAdminV1EntityFilter): Self = StObject.set(x, "entityFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityFilterUndefined: Self = StObject.set(x, "entityFilter", js.undefined)
    
    @scala.inline
    def setInputUrl(value: String): Self = StObject.set(x, "inputUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUrlUndefined: Self = StObject.set(x, "inputUrl", js.undefined)
    
    @scala.inline
    def setProgressBytes(value: SchemaGoogleDatastoreAdminV1Progress): Self = StObject.set(x, "progressBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressBytesUndefined: Self = StObject.set(x, "progressBytes", js.undefined)
    
    @scala.inline
    def setProgressEntities(value: SchemaGoogleDatastoreAdminV1Progress): Self = StObject.set(x, "progressEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressEntitiesUndefined: Self = StObject.set(x, "progressEntities", js.undefined)
  }
}
