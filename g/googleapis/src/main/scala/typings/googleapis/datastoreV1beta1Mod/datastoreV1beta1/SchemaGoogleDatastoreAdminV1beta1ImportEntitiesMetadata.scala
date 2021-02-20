package typings.googleapis.datastoreV1beta1Mod.datastoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata for ImportEntities operations.
  */
@js.native
trait SchemaGoogleDatastoreAdminV1beta1ImportEntitiesMetadata extends StObject {
  
  /**
    * Metadata common to all Datastore Admin operations.
    */
  var common: js.UndefOr[SchemaGoogleDatastoreAdminV1beta1CommonMetadata] = js.native
  
  /**
    * Description of which entities are being imported.
    */
  var entityFilter: js.UndefOr[SchemaGoogleDatastoreAdminV1beta1EntityFilter] = js.native
  
  /**
    * The location of the import metadata file. This will be the same value as
    * the google.datastore.admin.v1beta1.ExportEntitiesResponse.output_url
    * field.
    */
  var inputUrl: js.UndefOr[String] = js.native
  
  /**
    * An estimate of the number of bytes processed.
    */
  var progressBytes: js.UndefOr[SchemaGoogleDatastoreAdminV1beta1Progress] = js.native
  
  /**
    * An estimate of the number of entities processed.
    */
  var progressEntities: js.UndefOr[SchemaGoogleDatastoreAdminV1beta1Progress] = js.native
}
object SchemaGoogleDatastoreAdminV1beta1ImportEntitiesMetadata {
  
  @scala.inline
  def apply(): SchemaGoogleDatastoreAdminV1beta1ImportEntitiesMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDatastoreAdminV1beta1ImportEntitiesMetadata]
  }
  
  @scala.inline
  implicit class SchemaGoogleDatastoreAdminV1beta1ImportEntitiesMetadataMutableBuilder[Self <: SchemaGoogleDatastoreAdminV1beta1ImportEntitiesMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommon(value: SchemaGoogleDatastoreAdminV1beta1CommonMetadata): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommonUndefined: Self = StObject.set(x, "common", js.undefined)
    
    @scala.inline
    def setEntityFilter(value: SchemaGoogleDatastoreAdminV1beta1EntityFilter): Self = StObject.set(x, "entityFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityFilterUndefined: Self = StObject.set(x, "entityFilter", js.undefined)
    
    @scala.inline
    def setInputUrl(value: String): Self = StObject.set(x, "inputUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUrlUndefined: Self = StObject.set(x, "inputUrl", js.undefined)
    
    @scala.inline
    def setProgressBytes(value: SchemaGoogleDatastoreAdminV1beta1Progress): Self = StObject.set(x, "progressBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressBytesUndefined: Self = StObject.set(x, "progressBytes", js.undefined)
    
    @scala.inline
    def setProgressEntities(value: SchemaGoogleDatastoreAdminV1beta1Progress): Self = StObject.set(x, "progressEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressEntitiesUndefined: Self = StObject.set(x, "progressEntities", js.undefined)
  }
}
