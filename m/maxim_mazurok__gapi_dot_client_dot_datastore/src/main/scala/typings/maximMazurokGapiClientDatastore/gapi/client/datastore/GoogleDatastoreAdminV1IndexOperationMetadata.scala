package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleDatastoreAdminV1IndexOperationMetadata extends js.Object {
  
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
  implicit class GoogleDatastoreAdminV1IndexOperationMetadataOps[Self <: GoogleDatastoreAdminV1IndexOperationMetadata] (val x: Self) extends AnyVal {
    
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
    def setCommon(value: GoogleDatastoreAdminV1CommonMetadata): Self = this.set("common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommon: Self = this.set("common", js.undefined)
    
    @scala.inline
    def setIndexId(value: String): Self = this.set("indexId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexId: Self = this.set("indexId", js.undefined)
    
    @scala.inline
    def setProgressEntities(value: GoogleDatastoreAdminV1Progress): Self = this.set("progressEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressEntities: Self = this.set("progressEntities", js.undefined)
  }
}
