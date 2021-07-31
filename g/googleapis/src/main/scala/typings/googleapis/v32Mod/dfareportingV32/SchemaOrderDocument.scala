package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains properties of a Planning order document.
  */
trait SchemaOrderDocument extends StObject {
  
  /**
    * Account ID of this order document.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Advertiser ID of this order document.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /**
    * The amended order document ID of this order document. An order document
    * can be created by optionally amending another order document so that the
    * change history can be preserved.
    */
  var amendedOrderDocumentId: js.UndefOr[String] = js.undefined
  
  /**
    * IDs of users who have approved this order document.
    */
  var approvedByUserProfileIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Whether this order document is cancelled.
    */
  var cancelled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Information about the creation of this order document.
    */
  var createdInfo: js.UndefOr[SchemaLastModifiedInfo] = js.undefined
  
  /**
    * Effective date of this order document.
    */
  var effectiveDate: js.UndefOr[String] = js.undefined
  
  /**
    * ID of this order document.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#orderDocument&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * List of email addresses that received the last sent document.
    */
  var lastSentRecipients: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Timestamp of the last email sent with this order document.
    */
  var lastSentTime: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the order from which this order document is created.
    */
  var orderId: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID of this order document.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Whether this order document has been signed.
    */
  var signed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Subaccount ID of this order document.
    */
  var subaccountId: js.UndefOr[String] = js.undefined
  
  /**
    * Title of this order document.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Type of this order document
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaOrderDocument {
  
  @scala.inline
  def apply(): SchemaOrderDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderDocument]
  }
  
  @scala.inline
  implicit class SchemaOrderDocumentMutableBuilder[Self <: SchemaOrderDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    @scala.inline
    def setAmendedOrderDocumentId(value: String): Self = StObject.set(x, "amendedOrderDocumentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmendedOrderDocumentIdUndefined: Self = StObject.set(x, "amendedOrderDocumentId", js.undefined)
    
    @scala.inline
    def setApprovedByUserProfileIds(value: js.Array[String]): Self = StObject.set(x, "approvedByUserProfileIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApprovedByUserProfileIdsUndefined: Self = StObject.set(x, "approvedByUserProfileIds", js.undefined)
    
    @scala.inline
    def setApprovedByUserProfileIdsVarargs(value: String*): Self = StObject.set(x, "approvedByUserProfileIds", js.Array(value :_*))
    
    @scala.inline
    def setCancelled(value: Boolean): Self = StObject.set(x, "cancelled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelledUndefined: Self = StObject.set(x, "cancelled", js.undefined)
    
    @scala.inline
    def setCreatedInfo(value: SchemaLastModifiedInfo): Self = StObject.set(x, "createdInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedInfoUndefined: Self = StObject.set(x, "createdInfo", js.undefined)
    
    @scala.inline
    def setEffectiveDate(value: String): Self = StObject.set(x, "effectiveDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveDateUndefined: Self = StObject.set(x, "effectiveDate", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLastSentRecipients(value: js.Array[String]): Self = StObject.set(x, "lastSentRecipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastSentRecipientsUndefined: Self = StObject.set(x, "lastSentRecipients", js.undefined)
    
    @scala.inline
    def setLastSentRecipientsVarargs(value: String*): Self = StObject.set(x, "lastSentRecipients", js.Array(value :_*))
    
    @scala.inline
    def setLastSentTime(value: String): Self = StObject.set(x, "lastSentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastSentTimeUndefined: Self = StObject.set(x, "lastSentTime", js.undefined)
    
    @scala.inline
    def setOrderId(value: String): Self = StObject.set(x, "orderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderIdUndefined: Self = StObject.set(x, "orderId", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setSigned(value: Boolean): Self = StObject.set(x, "signed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignedUndefined: Self = StObject.set(x, "signed", js.undefined)
    
    @scala.inline
    def setSubaccountId(value: String): Self = StObject.set(x, "subaccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubaccountIdUndefined: Self = StObject.set(x, "subaccountId", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
