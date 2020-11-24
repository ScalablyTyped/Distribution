package typings.googleapis.storagetransferV1Mod.storagetransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A collection of counters that report the progress of a transfer operation.
  */
@js.native
trait SchemaTransferCounters extends js.Object {
  
  /**
    * Bytes that are copied to the data sink.
    */
  var bytesCopiedToSink: js.UndefOr[String] = js.native
  
  /**
    * Bytes that are deleted from the data sink.
    */
  var bytesDeletedFromSink: js.UndefOr[String] = js.native
  
  /**
    * Bytes that are deleted from the data source.
    */
  var bytesDeletedFromSource: js.UndefOr[String] = js.native
  
  /**
    * Bytes that failed to be deleted from the data sink.
    */
  var bytesFailedToDeleteFromSink: js.UndefOr[String] = js.native
  
  /**
    * Bytes found in the data source that are scheduled to be transferred,
    * excluding any that are filtered based on object conditions or skipped due
    * to sync.
    */
  var bytesFoundFromSource: js.UndefOr[String] = js.native
  
  /**
    * Bytes found only in the data sink that are scheduled to be deleted.
    */
  var bytesFoundOnlyFromSink: js.UndefOr[String] = js.native
  
  /**
    * Bytes in the data source that failed to be transferred or that failed to
    * be deleted after being transferred.
    */
  var bytesFromSourceFailed: js.UndefOr[String] = js.native
  
  /**
    * Bytes in the data source that are not transferred because they already
    * exist in the data sink.
    */
  var bytesFromSourceSkippedBySync: js.UndefOr[String] = js.native
  
  /**
    * Objects that are copied to the data sink.
    */
  var objectsCopiedToSink: js.UndefOr[String] = js.native
  
  /**
    * Objects that are deleted from the data sink.
    */
  var objectsDeletedFromSink: js.UndefOr[String] = js.native
  
  /**
    * Objects that are deleted from the data source.
    */
  var objectsDeletedFromSource: js.UndefOr[String] = js.native
  
  /**
    * Objects that failed to be deleted from the data sink.
    */
  var objectsFailedToDeleteFromSink: js.UndefOr[String] = js.native
  
  /**
    * Objects found in the data source that are scheduled to be transferred,
    * excluding any that are filtered based on object conditions or skipped due
    * to sync.
    */
  var objectsFoundFromSource: js.UndefOr[String] = js.native
  
  /**
    * Objects found only in the data sink that are scheduled to be deleted.
    */
  var objectsFoundOnlyFromSink: js.UndefOr[String] = js.native
  
  /**
    * Objects in the data source that failed to be transferred or that failed
    * to be deleted after being transferred.
    */
  var objectsFromSourceFailed: js.UndefOr[String] = js.native
  
  /**
    * Objects in the data source that are not transferred because they already
    * exist in the data sink.
    */
  var objectsFromSourceSkippedBySync: js.UndefOr[String] = js.native
}
object SchemaTransferCounters {
  
  @scala.inline
  def apply(): SchemaTransferCounters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTransferCounters]
  }
  
  @scala.inline
  implicit class SchemaTransferCountersOps[Self <: SchemaTransferCounters] (val x: Self) extends AnyVal {
    
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
    def setBytesCopiedToSink(value: String): Self = this.set("bytesCopiedToSink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBytesCopiedToSink: Self = this.set("bytesCopiedToSink", js.undefined)
    
    @scala.inline
    def setBytesDeletedFromSink(value: String): Self = this.set("bytesDeletedFromSink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBytesDeletedFromSink: Self = this.set("bytesDeletedFromSink", js.undefined)
    
    @scala.inline
    def setBytesDeletedFromSource(value: String): Self = this.set("bytesDeletedFromSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBytesDeletedFromSource: Self = this.set("bytesDeletedFromSource", js.undefined)
    
    @scala.inline
    def setBytesFailedToDeleteFromSink(value: String): Self = this.set("bytesFailedToDeleteFromSink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBytesFailedToDeleteFromSink: Self = this.set("bytesFailedToDeleteFromSink", js.undefined)
    
    @scala.inline
    def setBytesFoundFromSource(value: String): Self = this.set("bytesFoundFromSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBytesFoundFromSource: Self = this.set("bytesFoundFromSource", js.undefined)
    
    @scala.inline
    def setBytesFoundOnlyFromSink(value: String): Self = this.set("bytesFoundOnlyFromSink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBytesFoundOnlyFromSink: Self = this.set("bytesFoundOnlyFromSink", js.undefined)
    
    @scala.inline
    def setBytesFromSourceFailed(value: String): Self = this.set("bytesFromSourceFailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBytesFromSourceFailed: Self = this.set("bytesFromSourceFailed", js.undefined)
    
    @scala.inline
    def setBytesFromSourceSkippedBySync(value: String): Self = this.set("bytesFromSourceSkippedBySync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBytesFromSourceSkippedBySync: Self = this.set("bytesFromSourceSkippedBySync", js.undefined)
    
    @scala.inline
    def setObjectsCopiedToSink(value: String): Self = this.set("objectsCopiedToSink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectsCopiedToSink: Self = this.set("objectsCopiedToSink", js.undefined)
    
    @scala.inline
    def setObjectsDeletedFromSink(value: String): Self = this.set("objectsDeletedFromSink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectsDeletedFromSink: Self = this.set("objectsDeletedFromSink", js.undefined)
    
    @scala.inline
    def setObjectsDeletedFromSource(value: String): Self = this.set("objectsDeletedFromSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectsDeletedFromSource: Self = this.set("objectsDeletedFromSource", js.undefined)
    
    @scala.inline
    def setObjectsFailedToDeleteFromSink(value: String): Self = this.set("objectsFailedToDeleteFromSink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectsFailedToDeleteFromSink: Self = this.set("objectsFailedToDeleteFromSink", js.undefined)
    
    @scala.inline
    def setObjectsFoundFromSource(value: String): Self = this.set("objectsFoundFromSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectsFoundFromSource: Self = this.set("objectsFoundFromSource", js.undefined)
    
    @scala.inline
    def setObjectsFoundOnlyFromSink(value: String): Self = this.set("objectsFoundOnlyFromSink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectsFoundOnlyFromSink: Self = this.set("objectsFoundOnlyFromSink", js.undefined)
    
    @scala.inline
    def setObjectsFromSourceFailed(value: String): Self = this.set("objectsFromSourceFailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectsFromSourceFailed: Self = this.set("objectsFromSourceFailed", js.undefined)
    
    @scala.inline
    def setObjectsFromSourceSkippedBySync(value: String): Self = this.set("objectsFromSourceSkippedBySync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectsFromSourceSkippedBySync: Self = this.set("objectsFromSourceSkippedBySync", js.undefined)
  }
}
