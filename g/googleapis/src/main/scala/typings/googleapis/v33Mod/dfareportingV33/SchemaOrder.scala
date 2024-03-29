package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrder extends StObject {
  
  /**
    * Account ID of this order.
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Advertiser ID of this order.
    */
  var advertiserId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * IDs for users that have to approve documents created for this order.
    */
  var approverUserProfileIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Buyer invoice ID associated with this order.
    */
  var buyerInvoiceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the buyer organization.
    */
  var buyerOrganizationName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Comments in this order.
    */
  var comments: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Contacts for this order.
    */
  var contacts: js.UndefOr[js.Array[SchemaOrderContact]] = js.undefined
  
  /**
    * ID of this order. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#order".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Information about the most recent modification of this order.
    */
  var lastModifiedInfo: js.UndefOr[SchemaLastModifiedInfo] = js.undefined
  
  /**
    * Name of this order.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Notes of this order.
    */
  var notes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ID of the terms and conditions template used in this order.
    */
  var planningTermId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Project ID of this order.
    */
  var projectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Seller order ID associated with this order.
    */
  var sellerOrderId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the seller organization.
    */
  var sellerOrganizationName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Site IDs this order is associated with.
    */
  var siteId: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Free-form site names this order is associated with.
    */
  var siteNames: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Subaccount ID of this order.
    */
  var subaccountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Terms and conditions of this order.
    */
  var termsAndConditions: js.UndefOr[String | Null] = js.undefined
}
object SchemaOrder {
  
  inline def apply(): SchemaOrder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrder]
  }
  
  extension [Self <: SchemaOrder](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdNull: Self = StObject.set(x, "advertiserId", null)
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setApproverUserProfileIds(value: js.Array[String]): Self = StObject.set(x, "approverUserProfileIds", value.asInstanceOf[js.Any])
    
    inline def setApproverUserProfileIdsNull: Self = StObject.set(x, "approverUserProfileIds", null)
    
    inline def setApproverUserProfileIdsUndefined: Self = StObject.set(x, "approverUserProfileIds", js.undefined)
    
    inline def setApproverUserProfileIdsVarargs(value: String*): Self = StObject.set(x, "approverUserProfileIds", js.Array(value*))
    
    inline def setBuyerInvoiceId(value: String): Self = StObject.set(x, "buyerInvoiceId", value.asInstanceOf[js.Any])
    
    inline def setBuyerInvoiceIdNull: Self = StObject.set(x, "buyerInvoiceId", null)
    
    inline def setBuyerInvoiceIdUndefined: Self = StObject.set(x, "buyerInvoiceId", js.undefined)
    
    inline def setBuyerOrganizationName(value: String): Self = StObject.set(x, "buyerOrganizationName", value.asInstanceOf[js.Any])
    
    inline def setBuyerOrganizationNameNull: Self = StObject.set(x, "buyerOrganizationName", null)
    
    inline def setBuyerOrganizationNameUndefined: Self = StObject.set(x, "buyerOrganizationName", js.undefined)
    
    inline def setComments(value: String): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setContacts(value: js.Array[SchemaOrderContact]): Self = StObject.set(x, "contacts", value.asInstanceOf[js.Any])
    
    inline def setContactsUndefined: Self = StObject.set(x, "contacts", js.undefined)
    
    inline def setContactsVarargs(value: SchemaOrderContact*): Self = StObject.set(x, "contacts", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLastModifiedInfo(value: SchemaLastModifiedInfo): Self = StObject.set(x, "lastModifiedInfo", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedInfoUndefined: Self = StObject.set(x, "lastModifiedInfo", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesNull: Self = StObject.set(x, "notes", null)
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setPlanningTermId(value: String): Self = StObject.set(x, "planningTermId", value.asInstanceOf[js.Any])
    
    inline def setPlanningTermIdNull: Self = StObject.set(x, "planningTermId", null)
    
    inline def setPlanningTermIdUndefined: Self = StObject.set(x, "planningTermId", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setSellerOrderId(value: String): Self = StObject.set(x, "sellerOrderId", value.asInstanceOf[js.Any])
    
    inline def setSellerOrderIdNull: Self = StObject.set(x, "sellerOrderId", null)
    
    inline def setSellerOrderIdUndefined: Self = StObject.set(x, "sellerOrderId", js.undefined)
    
    inline def setSellerOrganizationName(value: String): Self = StObject.set(x, "sellerOrganizationName", value.asInstanceOf[js.Any])
    
    inline def setSellerOrganizationNameNull: Self = StObject.set(x, "sellerOrganizationName", null)
    
    inline def setSellerOrganizationNameUndefined: Self = StObject.set(x, "sellerOrganizationName", js.undefined)
    
    inline def setSiteId(value: js.Array[String]): Self = StObject.set(x, "siteId", value.asInstanceOf[js.Any])
    
    inline def setSiteIdNull: Self = StObject.set(x, "siteId", null)
    
    inline def setSiteIdUndefined: Self = StObject.set(x, "siteId", js.undefined)
    
    inline def setSiteIdVarargs(value: String*): Self = StObject.set(x, "siteId", js.Array(value*))
    
    inline def setSiteNames(value: js.Array[String]): Self = StObject.set(x, "siteNames", value.asInstanceOf[js.Any])
    
    inline def setSiteNamesNull: Self = StObject.set(x, "siteNames", null)
    
    inline def setSiteNamesUndefined: Self = StObject.set(x, "siteNames", js.undefined)
    
    inline def setSiteNamesVarargs(value: String*): Self = StObject.set(x, "siteNames", js.Array(value*))
    
    inline def setSubaccountId(value: String): Self = StObject.set(x, "subaccountId", value.asInstanceOf[js.Any])
    
    inline def setSubaccountIdNull: Self = StObject.set(x, "subaccountId", null)
    
    inline def setSubaccountIdUndefined: Self = StObject.set(x, "subaccountId", js.undefined)
    
    inline def setTermsAndConditions(value: String): Self = StObject.set(x, "termsAndConditions", value.asInstanceOf[js.Any])
    
    inline def setTermsAndConditionsNull: Self = StObject.set(x, "termsAndConditions", null)
    
    inline def setTermsAndConditionsUndefined: Self = StObject.set(x, "termsAndConditions", js.undefined)
  }
}
