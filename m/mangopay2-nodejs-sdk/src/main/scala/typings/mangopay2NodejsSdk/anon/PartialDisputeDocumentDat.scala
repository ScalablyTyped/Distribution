package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.disputeDocument.DisputeDocumentType
import typings.mangopay2NodejsSdk.mod.disputeDocument.DocumentStatus
import typings.mangopay2NodejsSdk.mod.disputeDocument.RefusedReasonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.disputeDocument.DisputeDocumentData> */
@js.native
trait PartialDisputeDocumentDat extends js.Object {
  var CreationDate: js.UndefOr[Double] = js.native
  var DisputeId: js.UndefOr[String] = js.native
  var Id: js.UndefOr[String] = js.native
  var ProcessedDate: js.UndefOr[Timestamp] = js.native
  var RefusedReasonMessage: js.UndefOr[String] = js.native
  var RefusedReasonType: js.UndefOr[typings.mangopay2NodejsSdk.mod.disputeDocument.RefusedReasonType] = js.native
  var Status: js.UndefOr[DocumentStatus] = js.native
  var Tag: js.UndefOr[String] = js.native
  var Type: js.UndefOr[DisputeDocumentType] = js.native
  var UserId: js.UndefOr[String] = js.native
}

object PartialDisputeDocumentDat {
  @scala.inline
  def apply(): PartialDisputeDocumentDat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDisputeDocumentDat]
  }
  @scala.inline
  implicit class PartialDisputeDocumentDatOps[Self <: PartialDisputeDocumentDat] (val x: Self) extends AnyVal {
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
    def setCreationDate(value: Double): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    @scala.inline
    def setDisputeId(value: String): Self = this.set("DisputeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisputeId: Self = this.set("DisputeId", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setProcessedDate(value: Timestamp): Self = this.set("ProcessedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessedDate: Self = this.set("ProcessedDate", js.undefined)
    @scala.inline
    def setRefusedReasonMessage(value: String): Self = this.set("RefusedReasonMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefusedReasonMessage: Self = this.set("RefusedReasonMessage", js.undefined)
    @scala.inline
    def setRefusedReasonType(value: RefusedReasonType): Self = this.set("RefusedReasonType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefusedReasonType: Self = this.set("RefusedReasonType", js.undefined)
    @scala.inline
    def setStatus(value: DocumentStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setTag(value: String): Self = this.set("Tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("Tag", js.undefined)
    @scala.inline
    def setType(value: DisputeDocumentType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    @scala.inline
    def setUserId(value: String): Self = this.set("UserId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserId: Self = this.set("UserId", js.undefined)
  }
  
}

