package typings.maximMazurokGapiClientCloudbilling.gapi.client.cloudbilling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sku extends StObject {
  
  /** The category hierarchy of this SKU, purely for organizational purpose. */
  var category: js.UndefOr[Category] = js.undefined
  
  /** A human readable description of the SKU, has a maximum length of 256 characters. */
  var description: js.UndefOr[String] = js.undefined
  
  /** The geographic taxonomy for this sku. */
  var geoTaxonomy: js.UndefOr[GeoTaxonomy] = js.undefined
  
  /** The resource name for the SKU. Example: "services/DA34-426B-A397/skus/AA95-CD31-42FE" */
  var name: js.UndefOr[String] = js.undefined
  
  /** A timeline of pricing info for this SKU in chronological order. */
  var pricingInfo: js.UndefOr[js.Array[PricingInfo]] = js.undefined
  
  /** Identifies the service provider. This is 'Google' for first party services in Google Cloud Platform. */
  var serviceProviderName: js.UndefOr[String] = js.undefined
  
  /** List of service regions this SKU is offered at. Example: "asia-east1" Service regions can be found at https://cloud.google.com/about/locations/ */
  var serviceRegions: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The identifier for the SKU. Example: "AA95-CD31-42FE" */
  var skuId: js.UndefOr[String] = js.undefined
}
object Sku {
  
  @scala.inline
  def apply(): Sku = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sku]
  }
  
  @scala.inline
  implicit class SkuMutableBuilder[Self <: Sku] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: Category): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setGeoTaxonomy(value: GeoTaxonomy): Self = StObject.set(x, "geoTaxonomy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoTaxonomyUndefined: Self = StObject.set(x, "geoTaxonomy", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPricingInfo(value: js.Array[PricingInfo]): Self = StObject.set(x, "pricingInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPricingInfoUndefined: Self = StObject.set(x, "pricingInfo", js.undefined)
    
    @scala.inline
    def setPricingInfoVarargs(value: PricingInfo*): Self = StObject.set(x, "pricingInfo", js.Array(value :_*))
    
    @scala.inline
    def setServiceProviderName(value: String): Self = StObject.set(x, "serviceProviderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceProviderNameUndefined: Self = StObject.set(x, "serviceProviderName", js.undefined)
    
    @scala.inline
    def setServiceRegions(value: js.Array[String]): Self = StObject.set(x, "serviceRegions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceRegionsUndefined: Self = StObject.set(x, "serviceRegions", js.undefined)
    
    @scala.inline
    def setServiceRegionsVarargs(value: String*): Self = StObject.set(x, "serviceRegions", js.Array(value :_*))
    
    @scala.inline
    def setSkuId(value: String): Self = StObject.set(x, "skuId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkuIdUndefined: Self = StObject.set(x, "skuId", js.undefined)
  }
}
