package typings.googleapis.datatransferV1Mod.adminDatatransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The JSON template for a DataTransfer resource.
  */
@js.native
trait SchemaDataTransfer extends js.Object {
  /**
    * List of per application data transfer resources. It contains data
    * transfer details of the applications associated with this transfer
    * resource. Note that this list is also used to specify the applications
    * for which data transfer has to be done at the time of the transfer
    * resource creation.
    */
  var applicationDataTransfers: js.UndefOr[js.Array[SchemaApplicationDataTransfer]] = js.native
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The transfer&#39;s ID (Read-only).
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies the resource as a DataTransfer request.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * ID of the user to whom the data is being transfered.
    */
  var newOwnerUserId: js.UndefOr[String] = js.native
  /**
    * ID of the user whose data is being transfered.
    */
  var oldOwnerUserId: js.UndefOr[String] = js.native
  /**
    * Overall transfer status (Read-only).
    */
  var overallTransferStatusCode: js.UndefOr[String] = js.native
  /**
    * The time at which the data transfer was requested (Read-only).
    */
  var requestTime: js.UndefOr[String] = js.native
}

object SchemaDataTransfer {
  @scala.inline
  def apply(): SchemaDataTransfer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataTransfer]
  }
  @scala.inline
  implicit class SchemaDataTransferOps[Self <: SchemaDataTransfer] (val x: Self) extends AnyVal {
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
    def setApplicationDataTransfersVarargs(value: SchemaApplicationDataTransfer*): Self = this.set("applicationDataTransfers", js.Array(value :_*))
    @scala.inline
    def setApplicationDataTransfers(value: js.Array[SchemaApplicationDataTransfer]): Self = this.set("applicationDataTransfers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationDataTransfers: Self = this.set("applicationDataTransfers", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNewOwnerUserId(value: String): Self = this.set("newOwnerUserId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewOwnerUserId: Self = this.set("newOwnerUserId", js.undefined)
    @scala.inline
    def setOldOwnerUserId(value: String): Self = this.set("oldOwnerUserId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldOwnerUserId: Self = this.set("oldOwnerUserId", js.undefined)
    @scala.inline
    def setOverallTransferStatusCode(value: String): Self = this.set("overallTransferStatusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverallTransferStatusCode: Self = this.set("overallTransferStatusCode", js.undefined)
    @scala.inline
    def setRequestTime(value: String): Self = this.set("requestTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestTime: Self = this.set("requestTime", js.undefined)
  }
  
}

