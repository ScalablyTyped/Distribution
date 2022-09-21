package typings.googleapis.storagetransferV1Mod.storagetransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTransferCounters extends StObject {
  
  /**
    * Bytes that are copied to the data sink.
    */
  var bytesCopiedToSink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Bytes that are deleted from the data sink.
    */
  var bytesDeletedFromSink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Bytes that are deleted from the data source.
    */
  var bytesDeletedFromSource: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Bytes that failed to be deleted from the data sink.
    */
  var bytesFailedToDeleteFromSink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Bytes found in the data source that are scheduled to be transferred, excluding any that are filtered based on object conditions or skipped due to sync.
    */
  var bytesFoundFromSource: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Bytes found only in the data sink that are scheduled to be deleted.
    */
  var bytesFoundOnlyFromSink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Bytes in the data source that failed to be transferred or that failed to be deleted after being transferred.
    */
  var bytesFromSourceFailed: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Bytes in the data source that are not transferred because they already exist in the data sink.
    */
  var bytesFromSourceSkippedBySync: js.UndefOr[String | Null] = js.undefined
  
  /**
    * For transfers involving PosixFilesystem only. Number of listing failures for each directory found at the source. Potential failures when listing a directory include permission failure or block failure. If listing a directory fails, no files in the directory are transferred.
    */
  var directoriesFailedToListFromSource: js.UndefOr[String | Null] = js.undefined
  
  /**
    * For transfers involving PosixFilesystem only. Number of directories found while listing. For example, if the root directory of the transfer is `base/` and there are two other directories, `a/` and `b/` under this directory, the count after listing `base/`, `base/a/` and `base/b/` is 3.
    */
  var directoriesFoundFromSource: js.UndefOr[String | Null] = js.undefined
  
  /**
    * For transfers involving PosixFilesystem only. Number of successful listings for each directory found at the source.
    */
  var directoriesSuccessfullyListedFromSource: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of successfully cleaned up intermediate objects.
    */
  var intermediateObjectsCleanedUp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of intermediate objects failed cleaned up.
    */
  var intermediateObjectsFailedCleanedUp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Objects that are copied to the data sink.
    */
  var objectsCopiedToSink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Objects that are deleted from the data sink.
    */
  var objectsDeletedFromSink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Objects that are deleted from the data source.
    */
  var objectsDeletedFromSource: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Objects that failed to be deleted from the data sink.
    */
  var objectsFailedToDeleteFromSink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Objects found in the data source that are scheduled to be transferred, excluding any that are filtered based on object conditions or skipped due to sync.
    */
  var objectsFoundFromSource: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Objects found only in the data sink that are scheduled to be deleted.
    */
  var objectsFoundOnlyFromSink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Objects in the data source that failed to be transferred or that failed to be deleted after being transferred.
    */
  var objectsFromSourceFailed: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Objects in the data source that are not transferred because they already exist in the data sink.
    */
  var objectsFromSourceSkippedBySync: js.UndefOr[String | Null] = js.undefined
}
object SchemaTransferCounters {
  
  inline def apply(): SchemaTransferCounters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTransferCounters]
  }
  
  extension [Self <: SchemaTransferCounters](x: Self) {
    
    inline def setBytesCopiedToSink(value: String): Self = StObject.set(x, "bytesCopiedToSink", value.asInstanceOf[js.Any])
    
    inline def setBytesCopiedToSinkNull: Self = StObject.set(x, "bytesCopiedToSink", null)
    
    inline def setBytesCopiedToSinkUndefined: Self = StObject.set(x, "bytesCopiedToSink", js.undefined)
    
    inline def setBytesDeletedFromSink(value: String): Self = StObject.set(x, "bytesDeletedFromSink", value.asInstanceOf[js.Any])
    
    inline def setBytesDeletedFromSinkNull: Self = StObject.set(x, "bytesDeletedFromSink", null)
    
    inline def setBytesDeletedFromSinkUndefined: Self = StObject.set(x, "bytesDeletedFromSink", js.undefined)
    
    inline def setBytesDeletedFromSource(value: String): Self = StObject.set(x, "bytesDeletedFromSource", value.asInstanceOf[js.Any])
    
    inline def setBytesDeletedFromSourceNull: Self = StObject.set(x, "bytesDeletedFromSource", null)
    
    inline def setBytesDeletedFromSourceUndefined: Self = StObject.set(x, "bytesDeletedFromSource", js.undefined)
    
    inline def setBytesFailedToDeleteFromSink(value: String): Self = StObject.set(x, "bytesFailedToDeleteFromSink", value.asInstanceOf[js.Any])
    
    inline def setBytesFailedToDeleteFromSinkNull: Self = StObject.set(x, "bytesFailedToDeleteFromSink", null)
    
    inline def setBytesFailedToDeleteFromSinkUndefined: Self = StObject.set(x, "bytesFailedToDeleteFromSink", js.undefined)
    
    inline def setBytesFoundFromSource(value: String): Self = StObject.set(x, "bytesFoundFromSource", value.asInstanceOf[js.Any])
    
    inline def setBytesFoundFromSourceNull: Self = StObject.set(x, "bytesFoundFromSource", null)
    
    inline def setBytesFoundFromSourceUndefined: Self = StObject.set(x, "bytesFoundFromSource", js.undefined)
    
    inline def setBytesFoundOnlyFromSink(value: String): Self = StObject.set(x, "bytesFoundOnlyFromSink", value.asInstanceOf[js.Any])
    
    inline def setBytesFoundOnlyFromSinkNull: Self = StObject.set(x, "bytesFoundOnlyFromSink", null)
    
    inline def setBytesFoundOnlyFromSinkUndefined: Self = StObject.set(x, "bytesFoundOnlyFromSink", js.undefined)
    
    inline def setBytesFromSourceFailed(value: String): Self = StObject.set(x, "bytesFromSourceFailed", value.asInstanceOf[js.Any])
    
    inline def setBytesFromSourceFailedNull: Self = StObject.set(x, "bytesFromSourceFailed", null)
    
    inline def setBytesFromSourceFailedUndefined: Self = StObject.set(x, "bytesFromSourceFailed", js.undefined)
    
    inline def setBytesFromSourceSkippedBySync(value: String): Self = StObject.set(x, "bytesFromSourceSkippedBySync", value.asInstanceOf[js.Any])
    
    inline def setBytesFromSourceSkippedBySyncNull: Self = StObject.set(x, "bytesFromSourceSkippedBySync", null)
    
    inline def setBytesFromSourceSkippedBySyncUndefined: Self = StObject.set(x, "bytesFromSourceSkippedBySync", js.undefined)
    
    inline def setDirectoriesFailedToListFromSource(value: String): Self = StObject.set(x, "directoriesFailedToListFromSource", value.asInstanceOf[js.Any])
    
    inline def setDirectoriesFailedToListFromSourceNull: Self = StObject.set(x, "directoriesFailedToListFromSource", null)
    
    inline def setDirectoriesFailedToListFromSourceUndefined: Self = StObject.set(x, "directoriesFailedToListFromSource", js.undefined)
    
    inline def setDirectoriesFoundFromSource(value: String): Self = StObject.set(x, "directoriesFoundFromSource", value.asInstanceOf[js.Any])
    
    inline def setDirectoriesFoundFromSourceNull: Self = StObject.set(x, "directoriesFoundFromSource", null)
    
    inline def setDirectoriesFoundFromSourceUndefined: Self = StObject.set(x, "directoriesFoundFromSource", js.undefined)
    
    inline def setDirectoriesSuccessfullyListedFromSource(value: String): Self = StObject.set(x, "directoriesSuccessfullyListedFromSource", value.asInstanceOf[js.Any])
    
    inline def setDirectoriesSuccessfullyListedFromSourceNull: Self = StObject.set(x, "directoriesSuccessfullyListedFromSource", null)
    
    inline def setDirectoriesSuccessfullyListedFromSourceUndefined: Self = StObject.set(x, "directoriesSuccessfullyListedFromSource", js.undefined)
    
    inline def setIntermediateObjectsCleanedUp(value: String): Self = StObject.set(x, "intermediateObjectsCleanedUp", value.asInstanceOf[js.Any])
    
    inline def setIntermediateObjectsCleanedUpNull: Self = StObject.set(x, "intermediateObjectsCleanedUp", null)
    
    inline def setIntermediateObjectsCleanedUpUndefined: Self = StObject.set(x, "intermediateObjectsCleanedUp", js.undefined)
    
    inline def setIntermediateObjectsFailedCleanedUp(value: String): Self = StObject.set(x, "intermediateObjectsFailedCleanedUp", value.asInstanceOf[js.Any])
    
    inline def setIntermediateObjectsFailedCleanedUpNull: Self = StObject.set(x, "intermediateObjectsFailedCleanedUp", null)
    
    inline def setIntermediateObjectsFailedCleanedUpUndefined: Self = StObject.set(x, "intermediateObjectsFailedCleanedUp", js.undefined)
    
    inline def setObjectsCopiedToSink(value: String): Self = StObject.set(x, "objectsCopiedToSink", value.asInstanceOf[js.Any])
    
    inline def setObjectsCopiedToSinkNull: Self = StObject.set(x, "objectsCopiedToSink", null)
    
    inline def setObjectsCopiedToSinkUndefined: Self = StObject.set(x, "objectsCopiedToSink", js.undefined)
    
    inline def setObjectsDeletedFromSink(value: String): Self = StObject.set(x, "objectsDeletedFromSink", value.asInstanceOf[js.Any])
    
    inline def setObjectsDeletedFromSinkNull: Self = StObject.set(x, "objectsDeletedFromSink", null)
    
    inline def setObjectsDeletedFromSinkUndefined: Self = StObject.set(x, "objectsDeletedFromSink", js.undefined)
    
    inline def setObjectsDeletedFromSource(value: String): Self = StObject.set(x, "objectsDeletedFromSource", value.asInstanceOf[js.Any])
    
    inline def setObjectsDeletedFromSourceNull: Self = StObject.set(x, "objectsDeletedFromSource", null)
    
    inline def setObjectsDeletedFromSourceUndefined: Self = StObject.set(x, "objectsDeletedFromSource", js.undefined)
    
    inline def setObjectsFailedToDeleteFromSink(value: String): Self = StObject.set(x, "objectsFailedToDeleteFromSink", value.asInstanceOf[js.Any])
    
    inline def setObjectsFailedToDeleteFromSinkNull: Self = StObject.set(x, "objectsFailedToDeleteFromSink", null)
    
    inline def setObjectsFailedToDeleteFromSinkUndefined: Self = StObject.set(x, "objectsFailedToDeleteFromSink", js.undefined)
    
    inline def setObjectsFoundFromSource(value: String): Self = StObject.set(x, "objectsFoundFromSource", value.asInstanceOf[js.Any])
    
    inline def setObjectsFoundFromSourceNull: Self = StObject.set(x, "objectsFoundFromSource", null)
    
    inline def setObjectsFoundFromSourceUndefined: Self = StObject.set(x, "objectsFoundFromSource", js.undefined)
    
    inline def setObjectsFoundOnlyFromSink(value: String): Self = StObject.set(x, "objectsFoundOnlyFromSink", value.asInstanceOf[js.Any])
    
    inline def setObjectsFoundOnlyFromSinkNull: Self = StObject.set(x, "objectsFoundOnlyFromSink", null)
    
    inline def setObjectsFoundOnlyFromSinkUndefined: Self = StObject.set(x, "objectsFoundOnlyFromSink", js.undefined)
    
    inline def setObjectsFromSourceFailed(value: String): Self = StObject.set(x, "objectsFromSourceFailed", value.asInstanceOf[js.Any])
    
    inline def setObjectsFromSourceFailedNull: Self = StObject.set(x, "objectsFromSourceFailed", null)
    
    inline def setObjectsFromSourceFailedUndefined: Self = StObject.set(x, "objectsFromSourceFailed", js.undefined)
    
    inline def setObjectsFromSourceSkippedBySync(value: String): Self = StObject.set(x, "objectsFromSourceSkippedBySync", value.asInstanceOf[js.Any])
    
    inline def setObjectsFromSourceSkippedBySyncNull: Self = StObject.set(x, "objectsFromSourceSkippedBySync", null)
    
    inline def setObjectsFromSourceSkippedBySyncUndefined: Self = StObject.set(x, "objectsFromSourceSkippedBySync", js.undefined)
  }
}
