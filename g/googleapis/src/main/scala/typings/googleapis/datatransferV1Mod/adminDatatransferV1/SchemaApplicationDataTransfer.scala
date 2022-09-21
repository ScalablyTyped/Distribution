package typings.googleapis.datatransferV1Mod.adminDatatransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApplicationDataTransfer extends StObject {
  
  /**
    * The application's ID.
    */
  var applicationId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The transfer parameters for the application. These parameters are used to select the data which will get transferred in context of this application.
    */
  var applicationTransferParams: js.UndefOr[js.Array[SchemaApplicationTransferParam]] = js.undefined
  
  /**
    * Current status of transfer for this application. (Read-only)
    */
  var applicationTransferStatus: js.UndefOr[String | Null] = js.undefined
}
object SchemaApplicationDataTransfer {
  
  inline def apply(): SchemaApplicationDataTransfer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApplicationDataTransfer]
  }
  
  extension [Self <: SchemaApplicationDataTransfer](x: Self) {
    
    inline def setApplicationId(value: String): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    inline def setApplicationIdNull: Self = StObject.set(x, "applicationId", null)
    
    inline def setApplicationIdUndefined: Self = StObject.set(x, "applicationId", js.undefined)
    
    inline def setApplicationTransferParams(value: js.Array[SchemaApplicationTransferParam]): Self = StObject.set(x, "applicationTransferParams", value.asInstanceOf[js.Any])
    
    inline def setApplicationTransferParamsUndefined: Self = StObject.set(x, "applicationTransferParams", js.undefined)
    
    inline def setApplicationTransferParamsVarargs(value: SchemaApplicationTransferParam*): Self = StObject.set(x, "applicationTransferParams", js.Array(value*))
    
    inline def setApplicationTransferStatus(value: String): Self = StObject.set(x, "applicationTransferStatus", value.asInstanceOf[js.Any])
    
    inline def setApplicationTransferStatusNull: Self = StObject.set(x, "applicationTransferStatus", null)
    
    inline def setApplicationTransferStatusUndefined: Self = StObject.set(x, "applicationTransferStatus", js.undefined)
  }
}
