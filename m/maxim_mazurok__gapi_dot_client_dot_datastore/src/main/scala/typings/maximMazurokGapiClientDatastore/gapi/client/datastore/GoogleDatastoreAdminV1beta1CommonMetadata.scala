package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleDatastoreAdminV1beta1CommonMetadata extends js.Object {
  
  /** The time the operation ended, either successfully or otherwise. */
  var endTime: js.UndefOr[String] = js.native
  
  /** The client-assigned labels which were provided when the operation was created. May also include additional labels. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDatastore.maximMazurokGapiClientDatastoreStrings.GoogleDatastoreAdminV1beta1CommonMetadata with TopLevel[js.Any]
  ] = js.native
  
  /** The type of the operation. Can be used as a filter in ListOperationsRequest. */
  var operationType: js.UndefOr[String] = js.native
  
  /** The time that work began on the operation. */
  var startTime: js.UndefOr[String] = js.native
  
  /** The current state of the Operation. */
  var state: js.UndefOr[String] = js.native
}
object GoogleDatastoreAdminV1beta1CommonMetadata {
  
  @scala.inline
  def apply(): GoogleDatastoreAdminV1beta1CommonMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDatastoreAdminV1beta1CommonMetadata]
  }
  
  @scala.inline
  implicit class GoogleDatastoreAdminV1beta1CommonMetadataOps[Self <: GoogleDatastoreAdminV1beta1CommonMetadata] (val x: Self) extends AnyVal {
    
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
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDatastore.maximMazurokGapiClientDatastoreStrings.GoogleDatastoreAdminV1beta1CommonMetadata with TopLevel[js.Any]
    ): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setOperationType(value: String): Self = this.set("operationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationType: Self = this.set("operationType", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
