package typings.googleapis.datatransferV1Mod.adminDatatransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDataTransfer extends StObject {
  
  /**
    * List of per application data transfer resources. It contains data transfer details of the applications associated with this transfer resource. Note that this list is also used to specify the applications for which data transfer has to be done at the time of the transfer resource creation.
    */
  var applicationDataTransfers: js.UndefOr[js.Array[SchemaApplicationDataTransfer]] = js.undefined
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The transfer's ID (Read-only).
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies the resource as a DataTransfer request.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ID of the user to whom the data is being transferred.
    */
  var newOwnerUserId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ID of the user whose data is being transferred.
    */
  var oldOwnerUserId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Overall transfer status (Read-only).
    */
  var overallTransferStatusCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time at which the data transfer was requested (Read-only).
    */
  var requestTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaDataTransfer {
  
  inline def apply(): SchemaDataTransfer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataTransfer]
  }
  
  extension [Self <: SchemaDataTransfer](x: Self) {
    
    inline def setApplicationDataTransfers(value: js.Array[SchemaApplicationDataTransfer]): Self = StObject.set(x, "applicationDataTransfers", value.asInstanceOf[js.Any])
    
    inline def setApplicationDataTransfersUndefined: Self = StObject.set(x, "applicationDataTransfers", js.undefined)
    
    inline def setApplicationDataTransfersVarargs(value: SchemaApplicationDataTransfer*): Self = StObject.set(x, "applicationDataTransfers", js.Array(value*))
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNewOwnerUserId(value: String): Self = StObject.set(x, "newOwnerUserId", value.asInstanceOf[js.Any])
    
    inline def setNewOwnerUserIdNull: Self = StObject.set(x, "newOwnerUserId", null)
    
    inline def setNewOwnerUserIdUndefined: Self = StObject.set(x, "newOwnerUserId", js.undefined)
    
    inline def setOldOwnerUserId(value: String): Self = StObject.set(x, "oldOwnerUserId", value.asInstanceOf[js.Any])
    
    inline def setOldOwnerUserIdNull: Self = StObject.set(x, "oldOwnerUserId", null)
    
    inline def setOldOwnerUserIdUndefined: Self = StObject.set(x, "oldOwnerUserId", js.undefined)
    
    inline def setOverallTransferStatusCode(value: String): Self = StObject.set(x, "overallTransferStatusCode", value.asInstanceOf[js.Any])
    
    inline def setOverallTransferStatusCodeNull: Self = StObject.set(x, "overallTransferStatusCode", null)
    
    inline def setOverallTransferStatusCodeUndefined: Self = StObject.set(x, "overallTransferStatusCode", js.undefined)
    
    inline def setRequestTime(value: String): Self = StObject.set(x, "requestTime", value.asInstanceOf[js.Any])
    
    inline def setRequestTimeNull: Self = StObject.set(x, "requestTime", null)
    
    inline def setRequestTimeUndefined: Self = StObject.set(x, "requestTime", js.undefined)
  }
}
