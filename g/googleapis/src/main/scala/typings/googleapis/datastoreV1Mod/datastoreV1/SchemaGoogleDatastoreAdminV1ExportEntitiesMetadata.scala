package typings.googleapis.datastoreV1Mod.datastoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata for ExportEntities operations.
  */
@js.native
trait SchemaGoogleDatastoreAdminV1ExportEntitiesMetadata extends StObject {
  
  /**
    * Metadata common to all Datastore Admin operations.
    */
  var common: js.UndefOr[SchemaGoogleDatastoreAdminV1CommonMetadata] = js.native
  
  /**
    * Description of which entities are being exported.
    */
  var entityFilter: js.UndefOr[SchemaGoogleDatastoreAdminV1EntityFilter] = js.native
  
  /**
    * Location for the export metadata and data files. This will be the same
    * value as the
    * google.datastore.admin.v1.ExportEntitiesRequest.output_url_prefix field.
    * The final output location is provided in
    * google.datastore.admin.v1.ExportEntitiesResponse.output_url.
    */
  var outputUrlPrefix: js.UndefOr[String] = js.native
  
  /**
    * An estimate of the number of bytes processed.
    */
  var progressBytes: js.UndefOr[SchemaGoogleDatastoreAdminV1Progress] = js.native
  
  /**
    * An estimate of the number of entities processed.
    */
  var progressEntities: js.UndefOr[SchemaGoogleDatastoreAdminV1Progress] = js.native
}
object SchemaGoogleDatastoreAdminV1ExportEntitiesMetadata {
  
  @scala.inline
  def apply(): SchemaGoogleDatastoreAdminV1ExportEntitiesMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDatastoreAdminV1ExportEntitiesMetadata]
  }
  
  @scala.inline
  implicit class SchemaGoogleDatastoreAdminV1ExportEntitiesMetadataMutableBuilder[Self <: SchemaGoogleDatastoreAdminV1ExportEntitiesMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommon(value: SchemaGoogleDatastoreAdminV1CommonMetadata): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommonUndefined: Self = StObject.set(x, "common", js.undefined)
    
    @scala.inline
    def setEntityFilter(value: SchemaGoogleDatastoreAdminV1EntityFilter): Self = StObject.set(x, "entityFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityFilterUndefined: Self = StObject.set(x, "entityFilter", js.undefined)
    
    @scala.inline
    def setOutputUrlPrefix(value: String): Self = StObject.set(x, "outputUrlPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputUrlPrefixUndefined: Self = StObject.set(x, "outputUrlPrefix", js.undefined)
    
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
