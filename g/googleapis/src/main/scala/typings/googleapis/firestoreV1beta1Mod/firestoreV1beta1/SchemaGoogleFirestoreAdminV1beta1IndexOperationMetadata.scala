package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirestoreAdminV1beta1IndexOperationMetadata extends StObject {
  
  /**
    * True if the [google.longrunning.Operation] was cancelled. If the cancellation is in progress, cancelled will be true but google.longrunning.Operation.done will be false.
    */
  var cancelled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Progress of the existing operation, measured in number of documents.
    */
  var documentProgress: js.UndefOr[SchemaGoogleFirestoreAdminV1beta1Progress] = js.undefined
  
  /**
    * The time the operation ended, either successfully or otherwise. Unset if the operation is still active.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The index resource that this operation is acting on. For example: `projects/{project_id\}/databases/{database_id\}/indexes/{index_id\}`
    */
  var index: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of index operation.
    */
  var operationType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time that work began on the operation.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleFirestoreAdminV1beta1IndexOperationMetadata {
  
  inline def apply(): SchemaGoogleFirestoreAdminV1beta1IndexOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1beta1IndexOperationMetadata]
  }
  
  extension [Self <: SchemaGoogleFirestoreAdminV1beta1IndexOperationMetadata](x: Self) {
    
    inline def setCancelled(value: Boolean): Self = StObject.set(x, "cancelled", value.asInstanceOf[js.Any])
    
    inline def setCancelledNull: Self = StObject.set(x, "cancelled", null)
    
    inline def setCancelledUndefined: Self = StObject.set(x, "cancelled", js.undefined)
    
    inline def setDocumentProgress(value: SchemaGoogleFirestoreAdminV1beta1Progress): Self = StObject.set(x, "documentProgress", value.asInstanceOf[js.Any])
    
    inline def setDocumentProgressUndefined: Self = StObject.set(x, "documentProgress", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexNull: Self = StObject.set(x, "index", null)
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setOperationType(value: String): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    inline def setOperationTypeNull: Self = StObject.set(x, "operationType", null)
    
    inline def setOperationTypeUndefined: Self = StObject.set(x, "operationType", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
