package typings.googleapis.storagetransferV1Mod.storagetransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TransferOptions uses three boolean parameters to define the actions to be
  * performed on objects in a transfer.
  */
@js.native
trait SchemaTransferOptions extends js.Object {
  /**
    * Whether objects should be deleted from the source after they are
    * transferred to the sink.  Note that this option and
    * `deleteObjectsUniqueInSink` are mutually exclusive.
    */
  var deleteObjectsFromSourceAfterTransfer: js.UndefOr[Boolean] = js.native
  /**
    * Whether objects that exist only in the sink should be deleted.  Note that
    * this option and `deleteObjectsFromSourceAfterTransfer` are mutually
    * exclusive.
    */
  var deleteObjectsUniqueInSink: js.UndefOr[Boolean] = js.native
  /**
    * Whether overwriting objects that already exist in the sink is allowed.
    */
  var overwriteObjectsAlreadyExistingInSink: js.UndefOr[Boolean] = js.native
}

object SchemaTransferOptions {
  @scala.inline
  def apply(): SchemaTransferOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTransferOptions]
  }
  @scala.inline
  implicit class SchemaTransferOptionsOps[Self <: SchemaTransferOptions] (val x: Self) extends AnyVal {
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
    def setDeleteObjectsFromSourceAfterTransfer(value: Boolean): Self = this.set("deleteObjectsFromSourceAfterTransfer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteObjectsFromSourceAfterTransfer: Self = this.set("deleteObjectsFromSourceAfterTransfer", js.undefined)
    @scala.inline
    def setDeleteObjectsUniqueInSink(value: Boolean): Self = this.set("deleteObjectsUniqueInSink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteObjectsUniqueInSink: Self = this.set("deleteObjectsUniqueInSink", js.undefined)
    @scala.inline
    def setOverwriteObjectsAlreadyExistingInSink(value: Boolean): Self = this.set("overwriteObjectsAlreadyExistingInSink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverwriteObjectsAlreadyExistingInSink: Self = this.set("overwriteObjectsAlreadyExistingInSink", js.undefined)
  }
  
}

