package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Order extends StObject {
  
  /** Account ID of this order. */
  var accountId: js.UndefOr[String] = js.native
  
  /** Advertiser ID of this order. */
  var advertiserId: js.UndefOr[String] = js.native
  
  /** IDs for users that have to approve documents created for this order. */
  var approverUserProfileIds: js.UndefOr[js.Array[String]] = js.native
  
  /** Buyer invoice ID associated with this order. */
  var buyerInvoiceId: js.UndefOr[String] = js.native
  
  /** Name of the buyer organization. */
  var buyerOrganizationName: js.UndefOr[String] = js.native
  
  /** Comments in this order. */
  var comments: js.UndefOr[String] = js.native
  
  /** Contacts for this order. */
  var contacts: js.UndefOr[js.Array[OrderContact]] = js.native
  
  /** ID of this order. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#order". */
  var kind: js.UndefOr[String] = js.native
  
  /** Information about the most recent modification of this order. */
  var lastModifiedInfo: js.UndefOr[LastModifiedInfo] = js.native
  
  /** Name of this order. */
  var name: js.UndefOr[String] = js.native
  
  /** Notes of this order. */
  var notes: js.UndefOr[String] = js.native
  
  /** ID of the terms and conditions template used in this order. */
  var planningTermId: js.UndefOr[String] = js.native
  
  /** Project ID of this order. */
  var projectId: js.UndefOr[String] = js.native
  
  /** Seller order ID associated with this order. */
  var sellerOrderId: js.UndefOr[String] = js.native
  
  /** Name of the seller organization. */
  var sellerOrganizationName: js.UndefOr[String] = js.native
  
  /** Site IDs this order is associated with. */
  var siteId: js.UndefOr[js.Array[String]] = js.native
  
  /** Free-form site names this order is associated with. */
  var siteNames: js.UndefOr[js.Array[String]] = js.native
  
  /** Subaccount ID of this order. */
  var subaccountId: js.UndefOr[String] = js.native
  
  /** Terms and conditions of this order. */
  var termsAndConditions: js.UndefOr[String] = js.native
}
object Order {
  
  @scala.inline
  def apply(): Order = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Order]
  }
  
  @scala.inline
  implicit class OrderMutableBuilder[Self <: Order] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    @scala.inline
    def setApproverUserProfileIds(value: js.Array[String]): Self = StObject.set(x, "approverUserProfileIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApproverUserProfileIdsUndefined: Self = StObject.set(x, "approverUserProfileIds", js.undefined)
    
    @scala.inline
    def setApproverUserProfileIdsVarargs(value: String*): Self = StObject.set(x, "approverUserProfileIds", js.Array(value :_*))
    
    @scala.inline
    def setBuyerInvoiceId(value: String): Self = StObject.set(x, "buyerInvoiceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuyerInvoiceIdUndefined: Self = StObject.set(x, "buyerInvoiceId", js.undefined)
    
    @scala.inline
    def setBuyerOrganizationName(value: String): Self = StObject.set(x, "buyerOrganizationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuyerOrganizationNameUndefined: Self = StObject.set(x, "buyerOrganizationName", js.undefined)
    
    @scala.inline
    def setComments(value: String): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setContacts(value: js.Array[OrderContact]): Self = StObject.set(x, "contacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactsUndefined: Self = StObject.set(x, "contacts", js.undefined)
    
    @scala.inline
    def setContactsVarargs(value: OrderContact*): Self = StObject.set(x, "contacts", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLastModifiedInfo(value: LastModifiedInfo): Self = StObject.set(x, "lastModifiedInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedInfoUndefined: Self = StObject.set(x, "lastModifiedInfo", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    @scala.inline
    def setPlanningTermId(value: String): Self = StObject.set(x, "planningTermId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanningTermIdUndefined: Self = StObject.set(x, "planningTermId", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setSellerOrderId(value: String): Self = StObject.set(x, "sellerOrderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSellerOrderIdUndefined: Self = StObject.set(x, "sellerOrderId", js.undefined)
    
    @scala.inline
    def setSellerOrganizationName(value: String): Self = StObject.set(x, "sellerOrganizationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSellerOrganizationNameUndefined: Self = StObject.set(x, "sellerOrganizationName", js.undefined)
    
    @scala.inline
    def setSiteId(value: js.Array[String]): Self = StObject.set(x, "siteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteIdUndefined: Self = StObject.set(x, "siteId", js.undefined)
    
    @scala.inline
    def setSiteIdVarargs(value: String*): Self = StObject.set(x, "siteId", js.Array(value :_*))
    
    @scala.inline
    def setSiteNames(value: js.Array[String]): Self = StObject.set(x, "siteNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteNamesUndefined: Self = StObject.set(x, "siteNames", js.undefined)
    
    @scala.inline
    def setSiteNamesVarargs(value: String*): Self = StObject.set(x, "siteNames", js.Array(value :_*))
    
    @scala.inline
    def setSubaccountId(value: String): Self = StObject.set(x, "subaccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubaccountIdUndefined: Self = StObject.set(x, "subaccountId", js.undefined)
    
    @scala.inline
    def setTermsAndConditions(value: String): Self = StObject.set(x, "termsAndConditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTermsAndConditionsUndefined: Self = StObject.set(x, "termsAndConditions", js.undefined)
  }
}
