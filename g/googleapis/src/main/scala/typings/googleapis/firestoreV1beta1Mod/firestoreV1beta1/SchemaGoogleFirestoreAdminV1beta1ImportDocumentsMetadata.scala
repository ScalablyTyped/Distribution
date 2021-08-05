package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata for ImportDocuments operations.
  */
trait SchemaGoogleFirestoreAdminV1beta1ImportDocumentsMetadata extends StObject {
  
  /**
    * Which collection ids are being imported.
    */
  var collectionIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The time the operation ended, either successfully or otherwise. Unset if
    * the operation is still active.
    */
  var endTime: js.UndefOr[String] = js.undefined
  
  /**
    * The location of the documents being imported.
    */
  var inputUriPrefix: js.UndefOr[String] = js.undefined
  
  /**
    * The state of the import operation.
    */
  var operationState: js.UndefOr[String] = js.undefined
  
  /**
    * An estimate of the number of bytes processed.
    */
  var progressBytes: js.UndefOr[SchemaGoogleFirestoreAdminV1beta1Progress] = js.undefined
  
  /**
    * An estimate of the number of documents processed.
    */
  var progressDocuments: js.UndefOr[SchemaGoogleFirestoreAdminV1beta1Progress] = js.undefined
  
  /**
    * The time that work began on the operation.
    */
  var startTime: js.UndefOr[String] = js.undefined
}
object SchemaGoogleFirestoreAdminV1beta1ImportDocumentsMetadata {
  
  inline def apply(): SchemaGoogleFirestoreAdminV1beta1ImportDocumentsMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1beta1ImportDocumentsMetadata]
  }
  
  extension [Self <: SchemaGoogleFirestoreAdminV1beta1ImportDocumentsMetadata](x: Self) {
    
    inline def setCollectionIds(value: js.Array[String]): Self = StObject.set(x, "collectionIds", value.asInstanceOf[js.Any])
    
    inline def setCollectionIdsUndefined: Self = StObject.set(x, "collectionIds", js.undefined)
    
    inline def setCollectionIdsVarargs(value: String*): Self = StObject.set(x, "collectionIds", js.Array(value :_*))
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setInputUriPrefix(value: String): Self = StObject.set(x, "inputUriPrefix", value.asInstanceOf[js.Any])
    
    inline def setInputUriPrefixUndefined: Self = StObject.set(x, "inputUriPrefix", js.undefined)
    
    inline def setOperationState(value: String): Self = StObject.set(x, "operationState", value.asInstanceOf[js.Any])
    
    inline def setOperationStateUndefined: Self = StObject.set(x, "operationState", js.undefined)
    
    inline def setProgressBytes(value: SchemaGoogleFirestoreAdminV1beta1Progress): Self = StObject.set(x, "progressBytes", value.asInstanceOf[js.Any])
    
    inline def setProgressBytesUndefined: Self = StObject.set(x, "progressBytes", js.undefined)
    
    inline def setProgressDocuments(value: SchemaGoogleFirestoreAdminV1beta1Progress): Self = StObject.set(x, "progressDocuments", value.asInstanceOf[js.Any])
    
    inline def setProgressDocumentsUndefined: Self = StObject.set(x, "progressDocuments", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
