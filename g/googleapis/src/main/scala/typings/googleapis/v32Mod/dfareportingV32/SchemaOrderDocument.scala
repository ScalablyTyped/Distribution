package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains properties of a Planning order document.
  */
@js.native
trait SchemaOrderDocument extends js.Object {
  
  /**
    * Account ID of this order document.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * Advertiser ID of this order document.
    */
  var advertiserId: js.UndefOr[String] = js.native
  
  /**
    * The amended order document ID of this order document. An order document
    * can be created by optionally amending another order document so that the
    * change history can be preserved.
    */
  var amendedOrderDocumentId: js.UndefOr[String] = js.native
  
  /**
    * IDs of users who have approved this order document.
    */
  var approvedByUserProfileIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Whether this order document is cancelled.
    */
  var cancelled: js.UndefOr[Boolean] = js.native
  
  /**
    * Information about the creation of this order document.
    */
  var createdInfo: js.UndefOr[SchemaLastModifiedInfo] = js.native
  
  /**
    * Effective date of this order document.
    */
  var effectiveDate: js.UndefOr[String] = js.native
  
  /**
    * ID of this order document.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#orderDocument&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * List of email addresses that received the last sent document.
    */
  var lastSentRecipients: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Timestamp of the last email sent with this order document.
    */
  var lastSentTime: js.UndefOr[String] = js.native
  
  /**
    * ID of the order from which this order document is created.
    */
  var orderId: js.UndefOr[String] = js.native
  
  /**
    * Project ID of this order document.
    */
  var projectId: js.UndefOr[String] = js.native
  
  /**
    * Whether this order document has been signed.
    */
  var signed: js.UndefOr[Boolean] = js.native
  
  /**
    * Subaccount ID of this order document.
    */
  var subaccountId: js.UndefOr[String] = js.native
  
  /**
    * Title of this order document.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * Type of this order document
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaOrderDocument {
  
  @scala.inline
  def apply(): SchemaOrderDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderDocument]
  }
  
  @scala.inline
  implicit class SchemaOrderDocumentOps[Self <: SchemaOrderDocument] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setAdvertiserId(value: String): Self = this.set("advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertiserId: Self = this.set("advertiserId", js.undefined)
    
    @scala.inline
    def setAmendedOrderDocumentId(value: String): Self = this.set("amendedOrderDocumentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmendedOrderDocumentId: Self = this.set("amendedOrderDocumentId", js.undefined)
    
    @scala.inline
    def setApprovedByUserProfileIdsVarargs(value: String*): Self = this.set("approvedByUserProfileIds", js.Array(value :_*))
    
    @scala.inline
    def setApprovedByUserProfileIds(value: js.Array[String]): Self = this.set("approvedByUserProfileIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApprovedByUserProfileIds: Self = this.set("approvedByUserProfileIds", js.undefined)
    
    @scala.inline
    def setCancelled(value: Boolean): Self = this.set("cancelled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelled: Self = this.set("cancelled", js.undefined)
    
    @scala.inline
    def setCreatedInfo(value: SchemaLastModifiedInfo): Self = this.set("createdInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedInfo: Self = this.set("createdInfo", js.undefined)
    
    @scala.inline
    def setEffectiveDate(value: String): Self = this.set("effectiveDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffectiveDate: Self = this.set("effectiveDate", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLastSentRecipientsVarargs(value: String*): Self = this.set("lastSentRecipients", js.Array(value :_*))
    
    @scala.inline
    def setLastSentRecipients(value: js.Array[String]): Self = this.set("lastSentRecipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastSentRecipients: Self = this.set("lastSentRecipients", js.undefined)
    
    @scala.inline
    def setLastSentTime(value: String): Self = this.set("lastSentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastSentTime: Self = this.set("lastSentTime", js.undefined)
    
    @scala.inline
    def setOrderId(value: String): Self = this.set("orderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderId: Self = this.set("orderId", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    
    @scala.inline
    def setSigned(value: Boolean): Self = this.set("signed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigned: Self = this.set("signed", js.undefined)
    
    @scala.inline
    def setSubaccountId(value: String): Self = this.set("subaccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubaccountId: Self = this.set("subaccountId", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
