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
  def apply(
    deleteObjectsFromSourceAfterTransfer: js.UndefOr[Boolean] = js.undefined,
    deleteObjectsUniqueInSink: js.UndefOr[Boolean] = js.undefined,
    overwriteObjectsAlreadyExistingInSink: js.UndefOr[Boolean] = js.undefined
  ): SchemaTransferOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deleteObjectsFromSourceAfterTransfer)) __obj.updateDynamic("deleteObjectsFromSourceAfterTransfer")(deleteObjectsFromSourceAfterTransfer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deleteObjectsUniqueInSink)) __obj.updateDynamic("deleteObjectsUniqueInSink")(deleteObjectsUniqueInSink.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overwriteObjectsAlreadyExistingInSink)) __obj.updateDynamic("overwriteObjectsAlreadyExistingInSink")(overwriteObjectsAlreadyExistingInSink.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTransferOptions]
  }
}

