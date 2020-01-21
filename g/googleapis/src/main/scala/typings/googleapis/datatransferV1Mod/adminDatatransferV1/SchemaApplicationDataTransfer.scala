package typings.googleapis.datatransferV1Mod.adminDatatransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Template to map fields of ApplicationDataTransfer resource.
  */
@js.native
trait SchemaApplicationDataTransfer extends js.Object {
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
  def apply(
    applicationId: String = null,
    applicationTransferParams: js.Array[SchemaApplicationTransferParam] = null,
    applicationTransferStatus: String = null
  ): SchemaApplicationDataTransfer = {
    val __obj = js.Dynamic.literal()
    if (applicationId != null) __obj.updateDynamic("applicationId")(applicationId.asInstanceOf[js.Any])
    if (applicationTransferParams != null) __obj.updateDynamic("applicationTransferParams")(applicationTransferParams.asInstanceOf[js.Any])
    if (applicationTransferStatus != null) __obj.updateDynamic("applicationTransferStatus")(applicationTransferStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaApplicationDataTransfer]
  }
}

