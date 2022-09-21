package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirestoreAdminV1FieldOperationMetadata extends StObject {
  
  /**
    * The time this operation completed. Will be unset if operation still in progress.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The field resource that this operation is acting on. For example: `projects/{project_id\}/databases/{database_id\}/collectionGroups/{collection_id\}/fields/{field_path\}`
    */
  var field: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of IndexConfigDelta, which describe the intent of this operation.
    */
  var indexConfigDeltas: js.UndefOr[js.Array[SchemaGoogleFirestoreAdminV1IndexConfigDelta]] = js.undefined
  
  /**
    * The progress, in bytes, of this operation.
    */
  var progressBytes: js.UndefOr[SchemaGoogleFirestoreAdminV1Progress] = js.undefined
  
  /**
    * The progress, in documents, of this operation.
    */
  var progressDocuments: js.UndefOr[SchemaGoogleFirestoreAdminV1Progress] = js.undefined
  
  /**
    * The time this operation started.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The state of the operation.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Describes the deltas of TTL configuration.
    */
  var ttlConfigDelta: js.UndefOr[SchemaGoogleFirestoreAdminV1TtlConfigDelta] = js.undefined
}
object SchemaGoogleFirestoreAdminV1FieldOperationMetadata {
  
  inline def apply(): SchemaGoogleFirestoreAdminV1FieldOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1FieldOperationMetadata]
  }
  
  extension [Self <: SchemaGoogleFirestoreAdminV1FieldOperationMetadata](x: Self) {
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldNull: Self = StObject.set(x, "field", null)
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setIndexConfigDeltas(value: js.Array[SchemaGoogleFirestoreAdminV1IndexConfigDelta]): Self = StObject.set(x, "indexConfigDeltas", value.asInstanceOf[js.Any])
    
    inline def setIndexConfigDeltasUndefined: Self = StObject.set(x, "indexConfigDeltas", js.undefined)
    
    inline def setIndexConfigDeltasVarargs(value: SchemaGoogleFirestoreAdminV1IndexConfigDelta*): Self = StObject.set(x, "indexConfigDeltas", js.Array(value*))
    
    inline def setProgressBytes(value: SchemaGoogleFirestoreAdminV1Progress): Self = StObject.set(x, "progressBytes", value.asInstanceOf[js.Any])
    
    inline def setProgressBytesUndefined: Self = StObject.set(x, "progressBytes", js.undefined)
    
    inline def setProgressDocuments(value: SchemaGoogleFirestoreAdminV1Progress): Self = StObject.set(x, "progressDocuments", value.asInstanceOf[js.Any])
    
    inline def setProgressDocumentsUndefined: Self = StObject.set(x, "progressDocuments", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTtlConfigDelta(value: SchemaGoogleFirestoreAdminV1TtlConfigDelta): Self = StObject.set(x, "ttlConfigDelta", value.asInstanceOf[js.Any])
    
    inline def setTtlConfigDeltaUndefined: Self = StObject.set(x, "ttlConfigDelta", js.undefined)
  }
}
