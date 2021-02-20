package typings.googleapis.datatransferV1Mod.adminDatatransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The JSON template for a DataTransfer resource.
  */
@js.native
trait SchemaDataTransfer extends StObject {
  
  /**
    * List of per application data transfer resources. It contains data
    * transfer details of the applications associated with this transfer
    * resource. Note that this list is also used to specify the applications
    * for which data transfer has to be done at the time of the transfer
    * resource creation.
    */
  var applicationDataTransfers: js.UndefOr[js.Array[SchemaApplicationDataTransfer]] = js.native
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * The transfer&#39;s ID (Read-only).
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Identifies the resource as a DataTransfer request.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * ID of the user to whom the data is being transfered.
    */
  var newOwnerUserId: js.UndefOr[String] = js.native
  
  /**
    * ID of the user whose data is being transfered.
    */
  var oldOwnerUserId: js.UndefOr[String] = js.native
  
  /**
    * Overall transfer status (Read-only).
    */
  var overallTransferStatusCode: js.UndefOr[String] = js.native
  
  /**
    * The time at which the data transfer was requested (Read-only).
    */
  var requestTime: js.UndefOr[String] = js.native
}
object SchemaDataTransfer {
  
  @scala.inline
  def apply(): SchemaDataTransfer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataTransfer]
  }
  
  @scala.inline
  implicit class SchemaDataTransferMutableBuilder[Self <: SchemaDataTransfer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationDataTransfers(value: js.Array[SchemaApplicationDataTransfer]): Self = StObject.set(x, "applicationDataTransfers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationDataTransfersUndefined: Self = StObject.set(x, "applicationDataTransfers", js.undefined)
    
    @scala.inline
    def setApplicationDataTransfersVarargs(value: SchemaApplicationDataTransfer*): Self = StObject.set(x, "applicationDataTransfers", js.Array(value :_*))
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNewOwnerUserId(value: String): Self = StObject.set(x, "newOwnerUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewOwnerUserIdUndefined: Self = StObject.set(x, "newOwnerUserId", js.undefined)
    
    @scala.inline
    def setOldOwnerUserId(value: String): Self = StObject.set(x, "oldOwnerUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldOwnerUserIdUndefined: Self = StObject.set(x, "oldOwnerUserId", js.undefined)
    
    @scala.inline
    def setOverallTransferStatusCode(value: String): Self = StObject.set(x, "overallTransferStatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverallTransferStatusCodeUndefined: Self = StObject.set(x, "overallTransferStatusCode", js.undefined)
    
    @scala.inline
    def setRequestTime(value: String): Self = StObject.set(x, "requestTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestTimeUndefined: Self = StObject.set(x, "requestTime", js.undefined)
  }
}
