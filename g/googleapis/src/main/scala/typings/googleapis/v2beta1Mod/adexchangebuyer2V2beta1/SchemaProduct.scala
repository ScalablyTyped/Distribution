package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

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
trait SchemaProduct extends js.Object {
  
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
  implicit class SchemaProductOps[Self <: SchemaProduct] (val x: Self) extends AnyVal {
    
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
    def setAvailableEndTime(value: String): Self = this.set("availableEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailableEndTime: Self = this.set("availableEndTime", js.undefined)
    
    @scala.inline
    def setAvailableStartTime(value: String): Self = this.set("availableStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailableStartTime: Self = this.set("availableStartTime", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setCreatorContactsVarargs(value: SchemaContactInformation*): Self = this.set("creatorContacts", js.Array(value :_*))
    
    @scala.inline
    def setCreatorContacts(value: js.Array[SchemaContactInformation]): Self = this.set("creatorContacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatorContacts: Self = this.set("creatorContacts", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setHasCreatorSignedOff(value: Boolean): Self = this.set("hasCreatorSignedOff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasCreatorSignedOff: Self = this.set("hasCreatorSignedOff", js.undefined)
    
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
    
    @scala.inline
    def setProductRevision(value: String): Self = this.set("productRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductRevision: Self = this.set("productRevision", js.undefined)
    
    @scala.inline
    def setPublisherProfileId(value: String): Self = this.set("publisherProfileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublisherProfileId: Self = this.set("publisherProfileId", js.undefined)
    
    @scala.inline
    def setSeller(value: SchemaSeller): Self = this.set("seller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeller: Self = this.set("seller", js.undefined)
    
    @scala.inline
    def setSyndicationProduct(value: String): Self = this.set("syndicationProduct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyndicationProduct: Self = this.set("syndicationProduct", js.undefined)
    
    @scala.inline
    def setTargetingCriterionVarargs(value: SchemaTargetingCriteria*): Self = this.set("targetingCriterion", js.Array(value :_*))
    
    @scala.inline
    def setTargetingCriterion(value: js.Array[SchemaTargetingCriteria]): Self = this.set("targetingCriterion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetingCriterion: Self = this.set("targetingCriterion", js.undefined)
    
    @scala.inline
    def setTerms(value: SchemaDealTerms): Self = this.set("terms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerms: Self = this.set("terms", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
    
    @scala.inline
    def setWebPropertyCode(value: String): Self = this.set("webPropertyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebPropertyCode: Self = this.set("webPropertyCode", js.undefined)
  }
}
