package typings.googleapis.datatransferV1Mod.adminDatatransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Template to map fields of ApplicationDataTransfer resource.
  */
@js.native
trait SchemaApplicationDataTransfer extends StObject {
  
  /**
    * The application&#39;s ID.
    */
  var applicationId: js.UndefOr[String] = js.native
  
  /**
    * The transfer parameters for the application. These parameters are used to
    * select the data which will get transfered in context of this application.
    */
  var applicationTransferParams: js.UndefOr[js.Array[SchemaApplicationTransferParam]] = js.native
  
  /**
    * Current status of transfer for this application. (Read-only)
    */
  var applicationTransferStatus: js.UndefOr[String] = js.native
}
object SchemaApplicationDataTransfer {
  
  @scala.inline
  def apply(): SchemaApplicationDataTransfer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApplicationDataTransfer]
  }
  
  @scala.inline
  implicit class SchemaApplicationDataTransferMutableBuilder[Self <: SchemaApplicationDataTransfer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: String): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationIdUndefined: Self = StObject.set(x, "applicationId", js.undefined)
    
    @scala.inline
    def setApplicationTransferParams(value: js.Array[SchemaApplicationTransferParam]): Self = StObject.set(x, "applicationTransferParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationTransferParamsUndefined: Self = StObject.set(x, "applicationTransferParams", js.undefined)
    
    @scala.inline
    def setApplicationTransferParamsVarargs(value: SchemaApplicationTransferParam*): Self = StObject.set(x, "applicationTransferParams", js.Array(value :_*))
    
    @scala.inline
    def setApplicationTransferStatus(value: String): Self = StObject.set(x, "applicationTransferStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationTransferStatusUndefined: Self = StObject.set(x, "applicationTransferStatus", js.undefined)
  }
}
