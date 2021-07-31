package typings.googleapis.datastoreV1beta1Mod.datastoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata for ExportEntities operations.
  */
trait SchemaGoogleDatastoreAdminV1beta1ExportEntitiesMetadata extends StObject {
  
  /**
    * Metadata common to all Datastore Admin operations.
    */
  var common: js.UndefOr[SchemaGoogleDatastoreAdminV1beta1CommonMetadata] = js.undefined
  
  /**
    * Description of which entities are being exported.
    */
  var entityFilter: js.UndefOr[SchemaGoogleDatastoreAdminV1beta1EntityFilter] = js.undefined
  
  /**
    * Location for the export metadata and data files. This will be the same
    * value as the
    * google.datastore.admin.v1beta1.ExportEntitiesRequest.output_url_prefix
    * field. The final output location is provided in
    * google.datastore.admin.v1beta1.ExportEntitiesResponse.output_url.
    */
  var outputUrlPrefix: js.UndefOr[String] = js.undefined
  
  /**
    * An estimate of the number of bytes processed.
    */
  var progressBytes: js.UndefOr[SchemaGoogleDatastoreAdminV1beta1Progress] = js.undefined
  
  /**
    * An estimate of the number of entities processed.
    */
  var progressEntities: js.UndefOr[SchemaGoogleDatastoreAdminV1beta1Progress] = js.undefined
}
object SchemaGoogleDatastoreAdminV1beta1ExportEntitiesMetadata {
  
  @scala.inline
  def apply(): SchemaGoogleDatastoreAdminV1beta1ExportEntitiesMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDatastoreAdminV1beta1ExportEntitiesMetadata]
  }
  
  @scala.inline
  implicit class SchemaGoogleDatastoreAdminV1beta1ExportEntitiesMetadataMutableBuilder[Self <: SchemaGoogleDatastoreAdminV1beta1ExportEntitiesMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommon(value: SchemaGoogleDatastoreAdminV1beta1CommonMetadata): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommonUndefined: Self = StObject.set(x, "common", js.undefined)
    
    @scala.inline
    def setEntityFilter(value: SchemaGoogleDatastoreAdminV1beta1EntityFilter): Self = StObject.set(x, "entityFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityFilterUndefined: Self = StObject.set(x, "entityFilter", js.undefined)
    
    @scala.inline
    def setOutputUrlPrefix(value: String): Self = StObject.set(x, "outputUrlPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputUrlPrefixUndefined: Self = StObject.set(x, "outputUrlPrefix", js.undefined)
    
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
