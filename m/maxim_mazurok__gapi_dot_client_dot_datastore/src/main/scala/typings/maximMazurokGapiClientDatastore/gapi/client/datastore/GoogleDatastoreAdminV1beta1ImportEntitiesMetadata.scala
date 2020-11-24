package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleDatastoreAdminV1beta1ImportEntitiesMetadata extends js.Object {
  
  /** Metadata common to all Datastore Admin operations. */
  var common: js.UndefOr[GoogleDatastoreAdminV1beta1CommonMetadata] = js.native
  
  /** Description of which entities are being imported. */
  var entityFilter: js.UndefOr[GoogleDatastoreAdminV1beta1EntityFilter] = js.native
  
  /** The location of the import metadata file. This will be the same value as the google.datastore.admin.v1beta1.ExportEntitiesResponse.output_url field. */
  var inputUrl: js.UndefOr[String] = js.native
  
  /** An estimate of the number of bytes processed. */
  var progressBytes: js.UndefOr[GoogleDatastoreAdminV1beta1Progress] = js.native
  
  /** An estimate of the number of entities processed. */
  var progressEntities: js.UndefOr[GoogleDatastoreAdminV1beta1Progress] = js.native
}
object GoogleDatastoreAdminV1beta1ImportEntitiesMetadata {
  
  @scala.inline
  def apply(): GoogleDatastoreAdminV1beta1ImportEntitiesMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDatastoreAdminV1beta1ImportEntitiesMetadata]
  }
  
  @scala.inline
  implicit class GoogleDatastoreAdminV1beta1ImportEntitiesMetadataOps[Self <: GoogleDatastoreAdminV1beta1ImportEntitiesMetadata] (val x: Self) extends AnyVal {
    
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
    def setCommon(value: GoogleDatastoreAdminV1beta1CommonMetadata): Self = this.set("common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommon: Self = this.set("common", js.undefined)
    
    @scala.inline
    def setEntityFilter(value: GoogleDatastoreAdminV1beta1EntityFilter): Self = this.set("entityFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityFilter: Self = this.set("entityFilter", js.undefined)
    
    @scala.inline
    def setInputUrl(value: String): Self = this.set("inputUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputUrl: Self = this.set("inputUrl", js.undefined)
    
    @scala.inline
    def setProgressBytes(value: GoogleDatastoreAdminV1beta1Progress): Self = this.set("progressBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressBytes: Self = this.set("progressBytes", js.undefined)
    
    @scala.inline
    def setProgressEntities(value: GoogleDatastoreAdminV1beta1Progress): Self = this.set("progressEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressEntities: Self = this.set("progressEntities", js.undefined)
  }
}
