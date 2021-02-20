package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Note: this resource requires whitelisting for access. Please contact your
  * account manager for access to Marketplace resources.  A product is a
  * segment of inventory that a seller wishes to sell. It is associated with
  * certain terms and targeting information which helps the buyer know more
  * about the inventory.
  */
@js.native
trait SchemaProduct extends StObject {
  
  /**
    * The proposed end time for the deal. The field will be truncated to the
    * order of seconds during serving.
    */
  var availableEndTime: js.UndefOr[String] = js.native
  
  /**
    * Inventory availability dates. The start time will be truncated to seconds
    * during serving. Thus, a field specified as 3:23:34.456 (HH:mm:ss.SSS)
    * will be truncated to 3:23:34 when serving.
    */
  var availableStartTime: js.UndefOr[String] = js.native
  
  /**
    * Creation time.
    */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * Optional contact information for the creator of this product.
    */
  var creatorContacts: js.UndefOr[js.Array[SchemaContactInformation]] = js.native
  
  /**
    * The display name for this product as set by the seller.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * If the creator has already signed off on the product, then the buyer can
    * finalize the deal by accepting the product as is. When copying to a
    * proposal, if any of the terms are changed, then auto_finalize is
    * automatically set to false.
    */
  var hasCreatorSignedOff: js.UndefOr[Boolean] = js.native
  
  /**
    * The unique ID for the product.
    */
  var productId: js.UndefOr[String] = js.native
  
  /**
    * The revision number of the product (auto-assigned by Marketplace).
    */
  var productRevision: js.UndefOr[String] = js.native
  
  /**
    * An ID which can be used by the Publisher Profile API to get more
    * information about the seller that created this product.
    */
  var publisherProfileId: js.UndefOr[String] = js.native
  
  /**
    * Information about the seller that created this product.
    */
  var seller: js.UndefOr[SchemaSeller] = js.native
  
  /**
    * The syndication product associated with the deal.
    */
  var syndicationProduct: js.UndefOr[String] = js.native
  
  /**
    * Targeting that is shared between the buyer and the seller. Each targeting
    * criterion has a specified key and for each key there is a list of
    * inclusion value or exclusion values.
    */
  var targetingCriterion: js.UndefOr[js.Array[SchemaTargetingCriteria]] = js.native
  
  /**
    * The negotiable terms of the deal.
    */
  var terms: js.UndefOr[SchemaDealTerms] = js.native
  
  /**
    * Time of last update.
    */
  var updateTime: js.UndefOr[String] = js.native
  
  /**
    * The web-property code for the seller. This needs to be copied as is when
    * adding a new deal to a proposal.
    */
  var webPropertyCode: js.UndefOr[String] = js.native
}
object SchemaProduct {
  
  @scala.inline
  def apply(): SchemaProduct = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProduct]
  }
  
  @scala.inline
  implicit class SchemaProductMutableBuilder[Self <: SchemaProduct] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailableEndTime(value: String): Self = StObject.set(x, "availableEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableEndTimeUndefined: Self = StObject.set(x, "availableEndTime", js.undefined)
    
    @scala.inline
    def setAvailableStartTime(value: String): Self = StObject.set(x, "availableStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableStartTimeUndefined: Self = StObject.set(x, "availableStartTime", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setCreatorContacts(value: js.Array[SchemaContactInformation]): Self = StObject.set(x, "creatorContacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatorContactsUndefined: Self = StObject.set(x, "creatorContacts", js.undefined)
    
    @scala.inline
    def setCreatorContactsVarargs(value: SchemaContactInformation*): Self = StObject.set(x, "creatorContacts", js.Array(value :_*))
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setHasCreatorSignedOff(value: Boolean): Self = StObject.set(x, "hasCreatorSignedOff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasCreatorSignedOffUndefined: Self = StObject.set(x, "hasCreatorSignedOff", js.undefined)
    
    @scala.inline
    def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    @scala.inline
    def setProductRevision(value: String): Self = StObject.set(x, "productRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductRevisionUndefined: Self = StObject.set(x, "productRevision", js.undefined)
    
    @scala.inline
    def setPublisherProfileId(value: String): Self = StObject.set(x, "publisherProfileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherProfileIdUndefined: Self = StObject.set(x, "publisherProfileId", js.undefined)
    
    @scala.inline
    def setSeller(value: SchemaSeller): Self = StObject.set(x, "seller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSellerUndefined: Self = StObject.set(x, "seller", js.undefined)
    
    @scala.inline
    def setSyndicationProduct(value: String): Self = StObject.set(x, "syndicationProduct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyndicationProductUndefined: Self = StObject.set(x, "syndicationProduct", js.undefined)
    
    @scala.inline
    def setTargetingCriterion(value: js.Array[SchemaTargetingCriteria]): Self = StObject.set(x, "targetingCriterion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetingCriterionUndefined: Self = StObject.set(x, "targetingCriterion", js.undefined)
    
    @scala.inline
    def setTargetingCriterionVarargs(value: SchemaTargetingCriteria*): Self = StObject.set(x, "targetingCriterion", js.Array(value :_*))
    
    @scala.inline
    def setTerms(value: SchemaDealTerms): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTermsUndefined: Self = StObject.set(x, "terms", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    @scala.inline
    def setWebPropertyCode(value: String): Self = StObject.set(x, "webPropertyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebPropertyCodeUndefined: Self = StObject.set(x, "webPropertyCode", js.undefined)
  }
}
