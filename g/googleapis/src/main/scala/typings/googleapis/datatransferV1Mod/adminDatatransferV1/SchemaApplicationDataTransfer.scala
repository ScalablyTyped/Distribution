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
  def apply(): SchemaApplicationDataTransfer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApplicationDataTransfer]
  }
  @scala.inline
  implicit class SchemaApplicationDataTransferOps[Self <: SchemaApplicationDataTransfer] (val x: Self) extends AnyVal {
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
    def setApplicationId(value: String): Self = this.set("applicationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationId: Self = this.set("applicationId", js.undefined)
    @scala.inline
    def setApplicationTransferParamsVarargs(value: SchemaApplicationTransferParam*): Self = this.set("applicationTransferParams", js.Array(value :_*))
    @scala.inline
    def setApplicationTransferParams(value: js.Array[SchemaApplicationTransferParam]): Self = this.set("applicationTransferParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationTransferParams: Self = this.set("applicationTransferParams", js.undefined)
    @scala.inline
    def setApplicationTransferStatus(value: String): Self = this.set("applicationTransferStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationTransferStatus: Self = this.set("applicationTransferStatus", js.undefined)
  }
  
}

