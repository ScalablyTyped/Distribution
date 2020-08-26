package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes properties of a Planning order.
  */
@js.native
trait SchemaOrder extends js.Object {
  /**
    * Account ID of this order.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Advertiser ID of this order.
    */
  var advertiserId: js.UndefOr[String] = js.native
  /**
    * IDs for users that have to approve documents created for this order.
    */
  var approverUserProfileIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Buyer invoice ID associated with this order.
    */
  var buyerInvoiceId: js.UndefOr[String] = js.native
  /**
    * Name of the buyer organization.
    */
  var buyerOrganizationName: js.UndefOr[String] = js.native
  /**
    * Comments in this order.
    */
  var comments: js.UndefOr[String] = js.native
  /**
    * Contacts for this order.
    */
  var contacts: js.UndefOr[js.Array[SchemaOrderContact]] = js.native
  /**
    * ID of this order. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#order&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Information about the most recent modification of this order.
    */
  var lastModifiedInfo: js.UndefOr[SchemaLastModifiedInfo] = js.native
  /**
    * Name of this order.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Notes of this order.
    */
  var notes: js.UndefOr[String] = js.native
  /**
    * ID of the terms and conditions template used in this order.
    */
  var planningTermId: js.UndefOr[String] = js.native
  /**
    * Project ID of this order.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Seller order ID associated with this order.
    */
  var sellerOrderId: js.UndefOr[String] = js.native
  /**
    * Name of the seller organization.
    */
  var sellerOrganizationName: js.UndefOr[String] = js.native
  /**
    * Site IDs this order is associated with.
    */
  var siteId: js.UndefOr[js.Array[String]] = js.native
  /**
    * Free-form site names this order is associated with.
    */
  var siteNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * Subaccount ID of this order.
    */
  var subaccountId: js.UndefOr[String] = js.native
  /**
    * Terms and conditions of this order.
    */
  var termsAndConditions: js.UndefOr[String] = js.native
}

object SchemaOrder {
  @scala.inline
  def apply(): SchemaOrder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrder]
  }
  @scala.inline
  implicit class SchemaOrderOps[Self <: SchemaOrder] (val x: Self) extends AnyVal {
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
    def setApproverUserProfileIdsVarargs(value: String*): Self = this.set("approverUserProfileIds", js.Array(value :_*))
    @scala.inline
    def setApproverUserProfileIds(value: js.Array[String]): Self = this.set("approverUserProfileIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApproverUserProfileIds: Self = this.set("approverUserProfileIds", js.undefined)
    @scala.inline
    def setBuyerInvoiceId(value: String): Self = this.set("buyerInvoiceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuyerInvoiceId: Self = this.set("buyerInvoiceId", js.undefined)
    @scala.inline
    def setBuyerOrganizationName(value: String): Self = this.set("buyerOrganizationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuyerOrganizationName: Self = this.set("buyerOrganizationName", js.undefined)
    @scala.inline
    def setComments(value: String): Self = this.set("comments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    @scala.inline
    def setContactsVarargs(value: SchemaOrderContact*): Self = this.set("contacts", js.Array(value :_*))
    @scala.inline
    def setContacts(value: js.Array[SchemaOrderContact]): Self = this.set("contacts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContacts: Self = this.set("contacts", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLastModifiedInfo(value: SchemaLastModifiedInfo): Self = this.set("lastModifiedInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedInfo: Self = this.set("lastModifiedInfo", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNotes(value: String): Self = this.set("notes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
    @scala.inline
    def setPlanningTermId(value: String): Self = this.set("planningTermId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlanningTermId: Self = this.set("planningTermId", js.undefined)
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    @scala.inline
    def setSellerOrderId(value: String): Self = this.set("sellerOrderId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSellerOrderId: Self = this.set("sellerOrderId", js.undefined)
    @scala.inline
    def setSellerOrganizationName(value: String): Self = this.set("sellerOrganizationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSellerOrganizationName: Self = this.set("sellerOrganizationName", js.undefined)
    @scala.inline
    def setSiteIdVarargs(value: String*): Self = this.set("siteId", js.Array(value :_*))
    @scala.inline
    def setSiteId(value: js.Array[String]): Self = this.set("siteId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSiteId: Self = this.set("siteId", js.undefined)
    @scala.inline
    def setSiteNamesVarargs(value: String*): Self = this.set("siteNames", js.Array(value :_*))
    @scala.inline
    def setSiteNames(value: js.Array[String]): Self = this.set("siteNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSiteNames: Self = this.set("siteNames", js.undefined)
    @scala.inline
    def setSubaccountId(value: String): Self = this.set("subaccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubaccountId: Self = this.set("subaccountId", js.undefined)
    @scala.inline
    def setTermsAndConditions(value: String): Self = this.set("termsAndConditions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTermsAndConditions: Self = this.set("termsAndConditions", js.undefined)
  }
  
}

