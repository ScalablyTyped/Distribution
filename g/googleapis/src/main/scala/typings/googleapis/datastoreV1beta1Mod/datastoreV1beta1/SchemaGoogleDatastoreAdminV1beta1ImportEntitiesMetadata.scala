package typings.googleapis.datastoreV1beta1Mod.datastoreV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata for ImportEntities operations.
  */
@js.native
trait SchemaGoogleDatastoreAdminV1beta1ImportEntitiesMetadata extends js.Object {
  
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
  implicit class SchemaGoogleDatastoreAdminV1beta1ImportEntitiesMetadataOps[Self <: SchemaGoogleDatastoreAdminV1beta1ImportEntitiesMetadata] (val x: Self) extends AnyVal {
    
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
    def setInputUrl(value: String): Self = this.set("inputUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputUrl: Self = this.set("inputUrl", js.undefined)
    
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
