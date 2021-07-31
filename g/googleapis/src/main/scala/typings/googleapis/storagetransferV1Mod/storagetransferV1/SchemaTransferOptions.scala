package typings.googleapis.storagetransferV1Mod.storagetransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TransferOptions uses three boolean parameters to define the actions to be
  * performed on objects in a transfer.
  */
trait SchemaTransferOptions extends StObject {
  
  /**
    * Whether objects should be deleted from the source after they are
    * transferred to the sink.  Note that this option and
    * `deleteObjectsUniqueInSink` are mutually exclusive.
    */
  var deleteObjectsFromSourceAfterTransfer: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether objects that exist only in the sink should be deleted.  Note that
    * this option and `deleteObjectsFromSourceAfterTransfer` are mutually
    * exclusive.
    */
  var deleteObjectsUniqueInSink: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether overwriting objects that already exist in the sink is allowed.
    */
  var overwriteObjectsAlreadyExistingInSink: js.UndefOr[Boolean] = js.undefined
}
object SchemaTransferOptions {
  
  @scala.inline
  def apply(): SchemaTransferOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTransferOptions]
  }
  
  @scala.inline
  implicit class SchemaTransferOptionsMutableBuilder[Self <: SchemaTransferOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleteObjectsFromSourceAfterTransfer(value: Boolean): Self = StObject.set(x, "deleteObjectsFromSourceAfterTransfer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteObjectsFromSourceAfterTransferUndefined: Self = StObject.set(x, "deleteObjectsFromSourceAfterTransfer", js.undefined)
    
    @scala.inline
    def setDeleteObjectsUniqueInSink(value: Boolean): Self = StObject.set(x, "deleteObjectsUniqueInSink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteObjectsUniqueInSinkUndefined: Self = StObject.set(x, "deleteObjectsUniqueInSink", js.undefined)
    
    @scala.inline
    def setOverwriteObjectsAlreadyExistingInSink(value: Boolean): Self = StObject.set(x, "overwriteObjectsAlreadyExistingInSink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverwriteObjectsAlreadyExistingInSinkUndefined: Self = StObject.set(x, "overwriteObjectsAlreadyExistingInSink", js.undefined)
  }
}
