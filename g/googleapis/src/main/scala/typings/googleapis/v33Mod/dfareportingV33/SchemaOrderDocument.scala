package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderDocument extends StObject {
  
  /**
    * Account ID of this order document.
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Advertiser ID of this order document.
    */
  var advertiserId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The amended order document ID of this order document. An order document can be created by optionally amending another order document so that the change history can be preserved.
    */
  var amendedOrderDocumentId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * IDs of users who have approved this order document.
    */
  var approvedByUserProfileIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Whether this order document is cancelled.
    */
  var cancelled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Information about the creation of this order document.
    */
  var createdInfo: js.UndefOr[SchemaLastModifiedInfo] = js.undefined
  
  var effectiveDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ID of this order document.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#orderDocument".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of email addresses that received the last sent document.
    */
  var lastSentRecipients: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  var lastSentTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ID of the order from which this order document is created.
    */
  var orderId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Project ID of this order document.
    */
  var projectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether this order document has been signed.
    */
  var signed: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Subaccount ID of this order document.
    */
  var subaccountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Title of this order document.
    */
  var title: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of this order document
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaOrderDocument {
  
  inline def apply(): SchemaOrderDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderDocument]
  }
  
  extension [Self <: SchemaOrderDocument](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdNull: Self = StObject.set(x, "advertiserId", null)
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setAmendedOrderDocumentId(value: String): Self = StObject.set(x, "amendedOrderDocumentId", value.asInstanceOf[js.Any])
    
    inline def setAmendedOrderDocumentIdNull: Self = StObject.set(x, "amendedOrderDocumentId", null)
    
    inline def setAmendedOrderDocumentIdUndefined: Self = StObject.set(x, "amendedOrderDocumentId", js.undefined)
    
    inline def setApprovedByUserProfileIds(value: js.Array[String]): Self = StObject.set(x, "approvedByUserProfileIds", value.asInstanceOf[js.Any])
    
    inline def setApprovedByUserProfileIdsNull: Self = StObject.set(x, "approvedByUserProfileIds", null)
    
    inline def setApprovedByUserProfileIdsUndefined: Self = StObject.set(x, "approvedByUserProfileIds", js.undefined)
    
    inline def setApprovedByUserProfileIdsVarargs(value: String*): Self = StObject.set(x, "approvedByUserProfileIds", js.Array(value*))
    
    inline def setCancelled(value: Boolean): Self = StObject.set(x, "cancelled", value.asInstanceOf[js.Any])
    
    inline def setCancelledNull: Self = StObject.set(x, "cancelled", null)
    
    inline def setCancelledUndefined: Self = StObject.set(x, "cancelled", js.undefined)
    
    inline def setCreatedInfo(value: SchemaLastModifiedInfo): Self = StObject.set(x, "createdInfo", value.asInstanceOf[js.Any])
    
    inline def setCreatedInfoUndefined: Self = StObject.set(x, "createdInfo", js.undefined)
    
    inline def setEffectiveDate(value: String): Self = StObject.set(x, "effectiveDate", value.asInstanceOf[js.Any])
    
    inline def setEffectiveDateNull: Self = StObject.set(x, "effectiveDate", null)
    
    inline def setEffectiveDateUndefined: Self = StObject.set(x, "effectiveDate", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLastSentRecipients(value: js.Array[String]): Self = StObject.set(x, "lastSentRecipients", value.asInstanceOf[js.Any])
    
    inline def setLastSentRecipientsNull: Self = StObject.set(x, "lastSentRecipients", null)
    
    inline def setLastSentRecipientsUndefined: Self = StObject.set(x, "lastSentRecipients", js.undefined)
    
    inline def setLastSentRecipientsVarargs(value: String*): Self = StObject.set(x, "lastSentRecipients", js.Array(value*))
    
    inline def setLastSentTime(value: String): Self = StObject.set(x, "lastSentTime", value.asInstanceOf[js.Any])
    
    inline def setLastSentTimeNull: Self = StObject.set(x, "lastSentTime", null)
    
    inline def setLastSentTimeUndefined: Self = StObject.set(x, "lastSentTime", js.undefined)
    
    inline def setOrderId(value: String): Self = StObject.set(x, "orderId", value.asInstanceOf[js.Any])
    
    inline def setOrderIdNull: Self = StObject.set(x, "orderId", null)
    
    inline def setOrderIdUndefined: Self = StObject.set(x, "orderId", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setSigned(value: Boolean): Self = StObject.set(x, "signed", value.asInstanceOf[js.Any])
    
    inline def setSignedNull: Self = StObject.set(x, "signed", null)
    
    inline def setSignedUndefined: Self = StObject.set(x, "signed", js.undefined)
    
    inline def setSubaccountId(value: String): Self = StObject.set(x, "subaccountId", value.asInstanceOf[js.Any])
    
    inline def setSubaccountIdNull: Self = StObject.set(x, "subaccountId", null)
    
    inline def setSubaccountIdUndefined: Self = StObject.set(x, "subaccountId", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
