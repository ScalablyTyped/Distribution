package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProduct extends StObject {
  
  /**
    * The proposed end time for the deal. The field will be truncated to the order of seconds during serving.
    */
  var availableEndTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Inventory availability dates. The start time will be truncated to seconds during serving. Thus, a field specified as 3:23:34.456 (HH:mm:ss.SSS) will be truncated to 3:23:34 when serving.
    */
  var availableStartTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Creation time.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional contact information for the creator of this product.
    */
  var creatorContacts: js.UndefOr[js.Array[SchemaContactInformation]] = js.undefined
  
  /**
    * The display name for this product as set by the seller.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If the creator has already signed off on the product, then the buyer can finalize the deal by accepting the product as is. When copying to a proposal, if any of the terms are changed, then auto_finalize is automatically set to false.
    */
  var hasCreatorSignedOff: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The unique ID for the product.
    */
  var productId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The revision number of the product (auto-assigned by Marketplace).
    */
  var productRevision: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An ID which can be used by the Publisher Profile API to get more information about the seller that created this product.
    */
  var publisherProfileId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Information about the seller that created this product.
    */
  var seller: js.UndefOr[SchemaSeller] = js.undefined
  
  /**
    * The syndication product associated with the deal.
    */
  var syndicationProduct: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Targeting that is shared between the buyer and the seller. Each targeting criterion has a specified key and for each key there is a list of inclusion value or exclusion values.
    */
  var targetingCriterion: js.UndefOr[js.Array[SchemaTargetingCriteria]] = js.undefined
  
  /**
    * The negotiable terms of the deal.
    */
  var terms: js.UndefOr[SchemaDealTerms] = js.undefined
  
  /**
    * Time of last update.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The web-property code for the seller. This needs to be copied as is when adding a new deal to a proposal.
    */
  var webPropertyCode: js.UndefOr[String | Null] = js.undefined
}
object SchemaProduct {
  
  inline def apply(): SchemaProduct = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProduct]
  }
  
  extension [Self <: SchemaProduct](x: Self) {
    
    inline def setAvailableEndTime(value: String): Self = StObject.set(x, "availableEndTime", value.asInstanceOf[js.Any])
    
    inline def setAvailableEndTimeNull: Self = StObject.set(x, "availableEndTime", null)
    
    inline def setAvailableEndTimeUndefined: Self = StObject.set(x, "availableEndTime", js.undefined)
    
    inline def setAvailableStartTime(value: String): Self = StObject.set(x, "availableStartTime", value.asInstanceOf[js.Any])
    
    inline def setAvailableStartTimeNull: Self = StObject.set(x, "availableStartTime", null)
    
    inline def setAvailableStartTimeUndefined: Self = StObject.set(x, "availableStartTime", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setCreatorContacts(value: js.Array[SchemaContactInformation]): Self = StObject.set(x, "creatorContacts", value.asInstanceOf[js.Any])
    
    inline def setCreatorContactsUndefined: Self = StObject.set(x, "creatorContacts", js.undefined)
    
    inline def setCreatorContactsVarargs(value: SchemaContactInformation*): Self = StObject.set(x, "creatorContacts", js.Array(value*))
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setHasCreatorSignedOff(value: Boolean): Self = StObject.set(x, "hasCreatorSignedOff", value.asInstanceOf[js.Any])
    
    inline def setHasCreatorSignedOffNull: Self = StObject.set(x, "hasCreatorSignedOff", null)
    
    inline def setHasCreatorSignedOffUndefined: Self = StObject.set(x, "hasCreatorSignedOff", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdNull: Self = StObject.set(x, "productId", null)
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setProductRevision(value: String): Self = StObject.set(x, "productRevision", value.asInstanceOf[js.Any])
    
    inline def setProductRevisionNull: Self = StObject.set(x, "productRevision", null)
    
    inline def setProductRevisionUndefined: Self = StObject.set(x, "productRevision", js.undefined)
    
    inline def setPublisherProfileId(value: String): Self = StObject.set(x, "publisherProfileId", value.asInstanceOf[js.Any])
    
    inline def setPublisherProfileIdNull: Self = StObject.set(x, "publisherProfileId", null)
    
    inline def setPublisherProfileIdUndefined: Self = StObject.set(x, "publisherProfileId", js.undefined)
    
    inline def setSeller(value: SchemaSeller): Self = StObject.set(x, "seller", value.asInstanceOf[js.Any])
    
    inline def setSellerUndefined: Self = StObject.set(x, "seller", js.undefined)
    
    inline def setSyndicationProduct(value: String): Self = StObject.set(x, "syndicationProduct", value.asInstanceOf[js.Any])
    
    inline def setSyndicationProductNull: Self = StObject.set(x, "syndicationProduct", null)
    
    inline def setSyndicationProductUndefined: Self = StObject.set(x, "syndicationProduct", js.undefined)
    
    inline def setTargetingCriterion(value: js.Array[SchemaTargetingCriteria]): Self = StObject.set(x, "targetingCriterion", value.asInstanceOf[js.Any])
    
    inline def setTargetingCriterionUndefined: Self = StObject.set(x, "targetingCriterion", js.undefined)
    
    inline def setTargetingCriterionVarargs(value: SchemaTargetingCriteria*): Self = StObject.set(x, "targetingCriterion", js.Array(value*))
    
    inline def setTerms(value: SchemaDealTerms): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
    
    inline def setTermsUndefined: Self = StObject.set(x, "terms", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setWebPropertyCode(value: String): Self = StObject.set(x, "webPropertyCode", value.asInstanceOf[js.Any])
    
    inline def setWebPropertyCodeNull: Self = StObject.set(x, "webPropertyCode", null)
    
    inline def setWebPropertyCodeUndefined: Self = StObject.set(x, "webPropertyCode", js.undefined)
  }
}
