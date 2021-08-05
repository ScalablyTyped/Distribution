package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Product extends StObject {
  
  /** The proposed end time for the deal. The field will be truncated to the order of seconds during serving. */
  var availableEndTime: js.UndefOr[String] = js.undefined
  
  /**
    * Inventory availability dates. The start time will be truncated to seconds during serving. Thus, a field specified as 3:23:34.456 (HH:mm:ss.SSS) will be truncated to 3:23:34 when
    * serving.
    */
  var availableStartTime: js.UndefOr[String] = js.undefined
  
  /** Creation time. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Optional contact information for the creator of this product. */
  var creatorContacts: js.UndefOr[js.Array[ContactInformation]] = js.undefined
  
  /** The display name for this product as set by the seller. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * If the creator has already signed off on the product, then the buyer can finalize the deal by accepting the product as is. When copying to a proposal, if any of the terms are
    * changed, then auto_finalize is automatically set to false.
    */
  var hasCreatorSignedOff: js.UndefOr[Boolean] = js.undefined
  
  /** The unique ID for the product. */
  var productId: js.UndefOr[String] = js.undefined
  
  /** The revision number of the product (auto-assigned by Marketplace). */
  var productRevision: js.UndefOr[String] = js.undefined
  
  /** An ID which can be used by the Publisher Profile API to get more information about the seller that created this product. */
  var publisherProfileId: js.UndefOr[String] = js.undefined
  
  /** Information about the seller that created this product. */
  var seller: js.UndefOr[Seller] = js.undefined
  
  /** The syndication product associated with the deal. */
  var syndicationProduct: js.UndefOr[String] = js.undefined
  
  /** Targeting that is shared between the buyer and the seller. Each targeting criterion has a specified key and for each key there is a list of inclusion value or exclusion values. */
  var targetingCriterion: js.UndefOr[js.Array[TargetingCriteria]] = js.undefined
  
  /** The negotiable terms of the deal. */
  var terms: js.UndefOr[DealTerms] = js.undefined
  
  /** Time of last update. */
  var updateTime: js.UndefOr[String] = js.undefined
  
  /** The web-property code for the seller. This needs to be copied as is when adding a new deal to a proposal. */
  var webPropertyCode: js.UndefOr[String] = js.undefined
}
object Product {
  
  inline def apply(): Product = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Product]
  }
  
  extension [Self <: Product](x: Self) {
    
    inline def setAvailableEndTime(value: String): Self = StObject.set(x, "availableEndTime", value.asInstanceOf[js.Any])
    
    inline def setAvailableEndTimeUndefined: Self = StObject.set(x, "availableEndTime", js.undefined)
    
    inline def setAvailableStartTime(value: String): Self = StObject.set(x, "availableStartTime", value.asInstanceOf[js.Any])
    
    inline def setAvailableStartTimeUndefined: Self = StObject.set(x, "availableStartTime", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setCreatorContacts(value: js.Array[ContactInformation]): Self = StObject.set(x, "creatorContacts", value.asInstanceOf[js.Any])
    
    inline def setCreatorContactsUndefined: Self = StObject.set(x, "creatorContacts", js.undefined)
    
    inline def setCreatorContactsVarargs(value: ContactInformation*): Self = StObject.set(x, "creatorContacts", js.Array(value :_*))
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setHasCreatorSignedOff(value: Boolean): Self = StObject.set(x, "hasCreatorSignedOff", value.asInstanceOf[js.Any])
    
    inline def setHasCreatorSignedOffUndefined: Self = StObject.set(x, "hasCreatorSignedOff", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setProductRevision(value: String): Self = StObject.set(x, "productRevision", value.asInstanceOf[js.Any])
    
    inline def setProductRevisionUndefined: Self = StObject.set(x, "productRevision", js.undefined)
    
    inline def setPublisherProfileId(value: String): Self = StObject.set(x, "publisherProfileId", value.asInstanceOf[js.Any])
    
    inline def setPublisherProfileIdUndefined: Self = StObject.set(x, "publisherProfileId", js.undefined)
    
    inline def setSeller(value: Seller): Self = StObject.set(x, "seller", value.asInstanceOf[js.Any])
    
    inline def setSellerUndefined: Self = StObject.set(x, "seller", js.undefined)
    
    inline def setSyndicationProduct(value: String): Self = StObject.set(x, "syndicationProduct", value.asInstanceOf[js.Any])
    
    inline def setSyndicationProductUndefined: Self = StObject.set(x, "syndicationProduct", js.undefined)
    
    inline def setTargetingCriterion(value: js.Array[TargetingCriteria]): Self = StObject.set(x, "targetingCriterion", value.asInstanceOf[js.Any])
    
    inline def setTargetingCriterionUndefined: Self = StObject.set(x, "targetingCriterion", js.undefined)
    
    inline def setTargetingCriterionVarargs(value: TargetingCriteria*): Self = StObject.set(x, "targetingCriterion", js.Array(value :_*))
    
    inline def setTerms(value: DealTerms): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
    
    inline def setTermsUndefined: Self = StObject.set(x, "terms", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setWebPropertyCode(value: String): Self = StObject.set(x, "webPropertyCode", value.asInstanceOf[js.Any])
    
    inline def setWebPropertyCodeUndefined: Self = StObject.set(x, "webPropertyCode", js.undefined)
  }
}
