package typings.googleapis.datastoreV1Mod.datastoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata for ExportEntities operations.
  */
@js.native
trait SchemaGoogleDatastoreAdminV1beta1ExportEntitiesMetadata extends js.Object {
  
  /**
    * Metadata common to all Datastore Admin operations.
    */
  var common: js.UndefOr[SchemaGoogleDatastoreAdminV1beta1CommonMetadata] = js.native
  
  /**
    * Description of which entities are being exported.
    */
  var entityFilter: js.UndefOr[SchemaGoogleDatastoreAdminV1beta1EntityFilter] = js.native
  
  /**
    * Location for the export metadata and data files. This will be the same
    * value as the
    * google.datastore.admin.v1beta1.ExportEntitiesRequest.output_url_prefix
    * field. The final output location is provided in
    * google.datastore.admin.v1beta1.ExportEntitiesResponse.output_url.
    */
  var outputUrlPrefix: js.UndefOr[String] = js.native
  
  /**
    * An estimate of the number of bytes processed.
    */
  var progressBytes: js.UndefOr[SchemaGoogleDatastoreAdminV1beta1Progress] = js.native
  
  /**
    * An estimate of the number of entities processed.
    */
  var progressEntities: js.UndefOr[SchemaGoogleDatastoreAdminV1beta1Progress] = js.native
}
object SchemaGoogleDatastoreAdminV1beta1ExportEntitiesMetadata {
  
  @scala.inline
  def apply(): SchemaGoogleDatastoreAdminV1beta1ExportEntitiesMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDatastoreAdminV1beta1ExportEntitiesMetadata]
  }
  
  @scala.inline
  implicit class SchemaGoogleDatastoreAdminV1beta1ExportEntitiesMetadataOps[Self <: SchemaGoogleDatastoreAdminV1beta1ExportEntitiesMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCommon(value: SchemaGoogleDatastoreAdminV1beta1CommonMetadata): Self = this.set("common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommon: Self = this.set("common", js.undefined)
    
    @scala.inline
    def setEntityFilter(value: SchemaGoogleDatastoreAdminV1beta1EntityFilter): Self = this.set("entityFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityFilter: Self = this.set("entityFilter", js.undefined)
    
    @scala.inline
    def setOutputUrlPrefix(value: String): Self = this.set("outputUrlPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputUrlPrefix: Self = this.set("outputUrlPrefix", js.undefined)
    
    @scala.inline
    def setProgressBytes(value: SchemaGoogleDatastoreAdminV1beta1Progress): Self = this.set("progressBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressBytes: Self = this.set("progressBytes", js.undefined)
    
    @scala.inline
    def setProgressEntities(value: SchemaGoogleDatastoreAdminV1beta1Progress): Self = this.set("progressEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressEntities: Self = this.set("progressEntities", js.undefined)
  }
}
