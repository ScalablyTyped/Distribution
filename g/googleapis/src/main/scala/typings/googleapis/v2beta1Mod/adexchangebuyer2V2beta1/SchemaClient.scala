package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client resource represents a client buyer&amp;mdash;an agency, a brand,
  * or an advertiser customer of the sponsor buyer. Users associated with the
  * client buyer have restricted access to the Marketplace and certain other
  * sections of the Authorized Buyers UI based on the role granted to the
  * client buyer. All fields are required unless otherwise specified.
  */
trait SchemaClient extends StObject {
  
  /**
    * The globally-unique numerical ID of the client. The value of this field
    * is ignored in create and update operations.
    */
  var clientAccountId: js.UndefOr[String] = js.undefined
  
  /**
    * Name used to represent this client to publishers. You may have multiple
    * clients that map to the same entity, but for each client the combination
    * of `clientName` and entity must be unique. You can specify this field as
    * empty.
    */
  var clientName: js.UndefOr[String] = js.undefined
  
  /**
    * Numerical identifier of the client entity. The entity can be an
    * advertiser, a brand, or an agency. This identifier is unique among all
    * the entities with the same type.  A list of all known advertisers with
    * their identifiers is available in the
    * [advertisers.txt](https://storage.googleapis.com/adx-rtb-dictionaries/advertisers.txt)
    * file.  A list of all known brands with their identifiers is available in
    * the
    * [brands.txt](https://storage.googleapis.com/adx-rtb-dictionaries/brands.txt)
    * file.  A list of all known agencies with their identifiers is available
    * in the
    * [agencies.txt](https://storage.googleapis.com/adx-rtb-dictionaries/agencies.txt)
    * file.
    */
  var entityId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the entity. This field is automatically fetched based on the
    * type and ID. The value of this field is ignored in create and update
    * operations.
    */
  var entityName: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the client entity: `ADVERTISER`, `BRAND`, or `AGENCY`.
    */
  var entityType: js.UndefOr[String] = js.undefined
  
  /**
    * Optional arbitrary unique identifier of this client buyer from the
    * standpoint of its Ad Exchange sponsor buyer.  This field can be used to
    * associate a client buyer with the identifier in the namespace of its
    * sponsor buyer, lookup client buyers by that identifier and verify whether
    * an Ad Exchange counterpart of a given client buyer already exists.  If
    * present, must be unique among all the client buyers for its Ad Exchange
    * sponsor buyer.
    */
  var partnerClientId: js.UndefOr[String] = js.undefined
  
  /**
    * The role which is assigned to the client buyer. Each role implies a set
    * of permissions granted to the client. Must be one of
    * `CLIENT_DEAL_VIEWER`, `CLIENT_DEAL_NEGOTIATOR` or `CLIENT_DEAL_APPROVER`.
    */
  var role: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the client buyer.
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the client buyer will be visible to sellers.
    */
  var visibleToSeller: js.UndefOr[Boolean] = js.undefined
}
object SchemaClient {
  
  @scala.inline
  def apply(): SchemaClient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClient]
  }
  
  @scala.inline
  implicit class SchemaClientMutableBuilder[Self <: SchemaClient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientAccountId(value: String): Self = StObject.set(x, "clientAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientAccountIdUndefined: Self = StObject.set(x, "clientAccountId", js.undefined)
    
    @scala.inline
    def setClientName(value: String): Self = StObject.set(x, "clientName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientNameUndefined: Self = StObject.set(x, "clientName", js.undefined)
    
    @scala.inline
    def setEntityId(value: String): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityIdUndefined: Self = StObject.set(x, "entityId", js.undefined)
    
    @scala.inline
    def setEntityName(value: String): Self = StObject.set(x, "entityName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityNameUndefined: Self = StObject.set(x, "entityName", js.undefined)
    
    @scala.inline
    def setEntityType(value: String): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityTypeUndefined: Self = StObject.set(x, "entityType", js.undefined)
    
    @scala.inline
    def setPartnerClientId(value: String): Self = StObject.set(x, "partnerClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartnerClientIdUndefined: Self = StObject.set(x, "partnerClientId", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setVisibleToSeller(value: Boolean): Self = StObject.set(x, "visibleToSeller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleToSellerUndefined: Self = StObject.set(x, "visibleToSeller", js.undefined)
  }
}
